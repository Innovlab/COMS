package com.cts.ptms.carrier.purolator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;

import com.cts.ptms.core.ClientGateway;
import com.cts.ptms.model.accept.response.ShipmentAcceptResponse;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.confirm.response.ShipmentConfirmResponse;
import com.cts.ptms.model.gls.SHIPUNIT;
import com.cts.ptms.model.purolator.ShippingServiceContract_CreateShipment_ValidationFaultFault_FaultMessage;
import com.cts.ptms.model.purolator.ShippingServiceStub;
import com.cts.ptms.model.purolator.ShippingServiceStub.CreateShipmentRequest;
import com.cts.ptms.model.purolator.ShippingServiceStub.CreateShipmentResponse;
import com.cts.ptms.model.purolator.ShippingServiceStub.CreateShipmentResponseContainer;
import com.cts.ptms.model.purolator.ShippingServiceStub.RequestContextE;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceContract_GetDocuments_ValidationFaultFault_FaultMessage;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.GetDocumentsRequest;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.GetDocumentsResponse;
import com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.GetDocumentsResponseContainer;
import com.cts.ptms.utils.constants.PurolatorConstants;
import com.cts.ptms.utils.constants.ShippingConstants;

public class PurolatorSOAPClient implements ClientGateway {
	
	PurolatorPINRequestMapper pinRequestMapper;
	PurolatorDocRequestMapper docRequestMapper;
	Properties purolatorProps;

	@Override
	public void initialize() {
		pinRequestMapper = new PurolatorPINRequestMapper();
		docRequestMapper = new PurolatorDocRequestMapper();
		purolatorProps = loadProperties();
			
	}

	private Properties loadProperties() {
		Properties props =null;
		try {
			 props = new Properties();
			props.load(new FileInputStream(new File(ShippingConstants.PUROLATOR_PROPERTIES_PATH)));
		} catch (IOException e) {
			System.out.println("Unable to load Property file : " + ShippingConstants.PUROLATOR_PROPERTIES_PATH);
			e.printStackTrace();
		}
		return props;
	}

	@Override
	public ShipmentOrder createShipmentRequest(ShipmentRequest request) {
		initialize();
		ShipmentOrder response = new ShipmentOrder();
		SHIPUNIT shipUnitRequest = request.getCreateShipUnits().getCreateShipUnitsParams().getCREATESHIPUNITSPARAMS1().getSHIPUNIT();
		
		
		//Create RequestContext for PINRequest -- call method on PINRequestMapper
		//Create ShipmentRequest for PINRequest-- call method on PINRequestMapper
		// invoke and getResponse 
		//parse
		
		ShippingServiceStub pinRequestStub = getPINRequestStub();
		if (null != pinRequestStub){
			RequestContextE requestContext = pinRequestMapper.getPINRequestContext();
			CreateShipmentRequest shipmentRequesst = pinRequestMapper.mapToCreateShipmentRequest(purolatorProps,shipUnitRequest);
			
			// Call the service
			CreateShipmentResponse pinResponse;
			try {
				pinResponse = pinRequestStub.createShipment(shipmentRequesst, requestContext);
				CreateShipmentResponseContainer respContainer = pinResponse.getCreateShipmentResponse();
				pinRequestMapper.populateShipmentOrderResponse(respContainer,response);
			} catch (RemoteException | ShippingServiceContract_CreateShipment_ValidationFaultFault_FaultMessage e) {
				pinRequestMapper.setError(PurolatorConstants.ERR_PIN_REQ_SERVICE_INVOKE,response);
				e.printStackTrace();
			}

			
			//Create RequestContext for docRequest -- call method on docRequestMapper
			//Create ShipmentRequest for docRequest-- call method on docRequestMapper
			// invoke and getResponse 
			//parse	
			
			ShippingDocumentsServiceStub docRequestStub = getDocRequestStub();
			List<String> docTypes= getDocTypes();
			
			if (null != docRequestStub && (null != response.getTrackingNumber())){
				com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.RequestContextE docRequestContext = docRequestMapper.getRequestContext();
				GetDocumentsRequest documentsRequest = docRequestMapper.populateGetDocumentsRequest(response.getTrackingNumber(),docTypes);
						
				
				try {
					GetDocumentsResponse docResponse =  docRequestStub.getDocuments(documentsRequest,docRequestContext);
					GetDocumentsResponseContainer docResponseContainer = docResponse.getGetDocumentsResponse();
					docRequestMapper.populateDocumentResponse(docResponseContainer, response);
				} catch (RemoteException
						| ShippingDocumentsServiceContract_GetDocuments_ValidationFaultFault_FaultMessage e) {
					docRequestMapper.setError(PurolatorConstants.ERR_DOC_REQ_SERVICE_INVOKE,response);
					e.printStackTrace();
				}
			}else{
				docRequestMapper.setError(PurolatorConstants.ERR_DOC_REQ_SERVICE_ACCESS,response);
			}
			
			
		}else{
			pinRequestMapper.setError(PurolatorConstants.ERR_PIN_REQ_SERVICE_ACCESS,response);
		}

		cleanUp();
		
		return response;
	}





	private List<String> getDocTypes() {
		List<String> docTypes = new ArrayList<String>();
		String str = purolatorProps.getProperty(PurolatorConstants.PUROLATOR_DOCTYPES);
		StringTokenizer tokenizer = new StringTokenizer(str, PurolatorConstants.DOCTYPES_SEPARATOR);
		while(tokenizer.hasMoreTokens()){
			docTypes.add(tokenizer.nextToken());
		}
		
		System.out.println("Tokens " + docTypes);
		
		return docTypes;
			
		
	}

	private ShippingDocumentsServiceStub getDocRequestStub() {
		ShippingDocumentsServiceStub docRequestStub = null;
		

			System.out.println("URL : " + purolatorProps.getProperty(PurolatorConstants.DOC_REQ_URL));
			try {
				docRequestStub = new ShippingDocumentsServiceStub(purolatorProps.getProperty(PurolatorConstants.DOC_REQ_URL));
				docRequestStub._getServiceClient().getOptions().setProperty(HTTPConstants.AUTHENTICATE, getAuthInfo());
			} catch (AxisFault e) {
				e.printStackTrace();
			}
			
			return docRequestStub;
	}

	private ShippingServiceStub getPINRequestStub() {

		ShippingServiceStub stub = null;
		try {
			System.out.println("URL : " + purolatorProps.getProperty(PurolatorConstants.PIN_REQ_URL));
			stub = new ShippingServiceStub(purolatorProps.getProperty(PurolatorConstants.PIN_REQ_URL));
			stub._getServiceClient().getOptions().setProperty(HTTPConstants.AUTHENTICATE, getAuthInfo());
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		return stub;
		
	
	}
	
	private HttpTransportProperties.Authenticator getAuthInfo(){
		
		HttpTransportProperties.Authenticator auth = new HttpTransportProperties.Authenticator();
		System.out.println("UserName : " + purolatorProps.getProperty(PurolatorConstants.PUROLATOR_USERNAME));
		System.out.println("Password : " + purolatorProps.getProperty(PurolatorConstants.PUROLATOR_PASSWORD));
		auth.setUsername(purolatorProps.getProperty(PurolatorConstants.PUROLATOR_USERNAME));
		auth.setPassword(purolatorProps.getProperty(PurolatorConstants.PUROLATOR_PASSWORD));
		
		return auth;
	}

	@Override
	public void handleError() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ShipmentOrder createShipmentResposeObj(ShipmentConfirmResponse confirmResponse,
			ShipmentAcceptResponse acceptResponse) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void cleanUp(){
		if (null != pinRequestMapper)
			pinRequestMapper = null;
	
		if (null != docRequestMapper)
			docRequestMapper = null;
	}

}
