package com.cts.ptms.carrier.purolator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.List;

import com.cts.ptms.model.common.ShipmentDocument;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.ArrayOfDocument;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.ArrayOfDocumentCriteria;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.ArrayOfDocumentDetail;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.Document;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.DocumentCriteria;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.DocumentDetail;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.DocumentTypes;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.GetDocumentsRequest;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.GetDocumentsRequestContainer;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.GetDocumentsResponseContainer;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.Language;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.PIN;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.RequestContext;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.RequestContextE;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.ResponseInformation;
import com.cts.ptms.utils.constants.PurolatorConstants;
import com.cts.ptms.utils.constants.ShippingConstants;

public class PurolatorDocRequestMapper {

	ShipmentOrder response;

	/**
	 * Create and return RequestContext Object
	 * 
	 * @return
	 */
	public RequestContextE getRequestContext() {
		RequestContextE requestContext = new RequestContextE();
		RequestContext requestContainer = new RequestContext();
		requestContainer.setLanguage(Language.en);
		requestContainer.setVersion(PurolatorConstants.DOC_REQUEST_VERSION);
		requestContainer.setGroupID(PurolatorConstants.DOC_REQUEST_GROUPID);
		requestContainer.setRequestReference(PurolatorConstants.DOC_REQUEST_REQ_REF);
		requestContainer.setUserToken(PurolatorConstants.DOC_REQUEST_USER_TOKEN);
		requestContext.setRequestContext(requestContainer);
		return requestContext;

	}

	/**
	 * Create and return GetDocumentsRequest Object
	 * 
	 * @param trackingNumber
	 * @param docTypes
	 * @return
	 */
	public GetDocumentsRequest populateGetDocumentsRequest(String trackingNumber, List<String> docTypes) {
		GetDocumentsRequest docRequest = new GetDocumentsRequest();
		GetDocumentsRequestContainer reqContainer = new GetDocumentsRequestContainer();

		PIN pin = new PIN();
		DocumentTypes documentTypes = new DocumentTypes();
		String[] strArrDocTypes = new String[docTypes.size()];
		System.out.println("strDocTypes : " + strArrDocTypes);

		pin.setValue(trackingNumber);
		docTypes.toArray(strArrDocTypes);
		documentTypes.setDocumentType(strArrDocTypes);

		DocumentCriteria documentCriteria = new DocumentCriteria();
		documentCriteria.setPIN(pin);
		documentCriteria.setDocumentTypes(documentTypes);
		DocumentCriteria[] documentCriterium = new DocumentCriteria[1];
		documentCriterium[0] = documentCriteria;

		ArrayOfDocumentCriteria arr = new ArrayOfDocumentCriteria();
		arr.setDocumentCriteria(documentCriterium);
		reqContainer.setDocumentCriterium(arr);
		docRequest.setGetDocumentsRequest(reqContainer);

		return docRequest;

	}

	/**
	 * Set the Error Code and Status in Response Object
	 * 
	 * @param errString
	 * @param response
	 */
	public void setError(String errString, ShipmentOrder response) {
		response.setStatus(ShippingConstants.STATUS_FAILURE);
		response.setErrorDescription(errString);

	}

	public void populateDocumentResponse(GetDocumentsResponseContainer docResponseContainer, ShipmentOrder response) {

		this.response = response;
		ResponseInformation responInfo = docResponseContainer.getResponseInformation();

		if (responInfo == null) {
			System.out.println("Empty Response");
			setError(PurolatorConstants.ERR_EMPTY_RESPONSE, response);
			return;

		}

		int i = 0;
		if (responInfo.getErrors() != null && responInfo.getErrors().getError() != null
				&& responInfo.getErrors().getError().length > 0) {
			for (com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.Error error : responInfo
					.getErrors().getError()) {
				i++;
				System.out.format("Error %d", i);
				System.out.format("Error code %s", error.getCode());
				System.out.format("Error description %s", error.getDescription());
				System.out.format("Additional Information %s", error.getAdditionalInformation());

				setError(error.getDescription(), response);
			}
		} else {
			ArrayOfDocument documentArr = docResponseContainer.getDocuments();
			if (null != documentArr && null != documentArr.getDocument()) {

				for (Document document : documentArr.getDocument()) {
					ArrayOfDocumentDetail arrDocDetails = document.getDocumentDetails();
					if (null != arrDocDetails && null != arrDocDetails.getDocumentDetail()) {

						for (DocumentDetail docDetail : arrDocDetails.getDocumentDetail()) {
							if (docDetail.getDocumentType()
									.equalsIgnoreCase(PurolatorConstants.PUROLATOR_DOCTYPE_BOL)) {
								String encodedStr = getBOL(docDetail.getURL());
								if (null != encodedStr) {
									ShipmentDocument shipResponseDoc = new ShipmentDocument();
									shipResponseDoc.setDocumentTitle("SHIPPINGLABEL");
									shipResponseDoc.setDocumentType("PDF");
									shipResponseDoc.setDocumentContent(encodedStr);
									response.getShipmentDocuments().add(shipResponseDoc);
								}
							}
						}

					} else {
						setError(PurolatorConstants.ERR_DOC_REQ_NO_DOC_DETAILS, response);
					}

				}

			} else {
				setError(PurolatorConstants.ERR_DOC_REQ_NO_DOCUMENTS, response);
			}

		}

	}

	private String getBOL(String url) {
		URL pdfUrl = null;
		String encodedString = null;
		try {
			pdfUrl = new URL(url);
			System.out.println("URL : " + pdfUrl);
			HttpURLConnection conn = (HttpURLConnection) pdfUrl.openConnection();
			InputStream is = conn.getInputStream();
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			int length = 1;
			byte[] buffer = new byte[4096];
			while ((length = is.read(buffer)) > -1) {
				bos.write(buffer, 0, length);
			}
			
			encodedString = Base64.getEncoder().encodeToString(bos.toByteArray());
			is.close();
			bos.close();
			
		} catch (IOException e) {

			setError(PurolatorConstants.ERR_DOC_REQ_PDF_RETRIEVAL, response);
			e.printStackTrace();
			
		}
		return encodedString;

	}

}
