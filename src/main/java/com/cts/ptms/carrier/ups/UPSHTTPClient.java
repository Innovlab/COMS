package com.cts.ptms.carrier.ups;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.FileUtils;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

import com.cts.ptms.core.ClientGateway;
//import com.cts.ptms.model.AccessRequest;
import com.cts.ptms.model.accept.request.ShipmentAcceptRequest;
import com.cts.ptms.model.accept.response.ShipmentAcceptResponse;
import com.cts.ptms.model.accessRequest.AccessRequest;
import com.cts.ptms.model.common.ShipmentDocument;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.confirm.request.ShipmentConfirmRequest;
import com.cts.ptms.model.confirm.response.Error;
import com.cts.ptms.model.confirm.response.ShipmentConfirmResponse;
import com.cts.ptms.model.gls.CreateShipUnits;
import com.cts.ptms.model.gls.ShippingInfoDO;
import com.cts.ptms.utils.constants.ShippingConstants;

public class UPSHTTPClient implements ClientGateway {

	public void initialize() {
		// TODO Auto-generated method stub
		
	}
	public String trackingNum="";
	public boolean genReturnLabel=false;
	public ShippingInfoDO infoDO = new ShippingInfoDO();
	public ShipmentOrder createShipmentRequest(ShipmentRequest request) {
		ShipmentConfirmRequest shipConfRequest = new ShipmentConfirmRequest();
		ShipmentConfirmRequest returnConfRequest = new ShipmentConfirmRequest();
		ShippingInfoDO returninfoDO = new ShippingInfoDO();
		
		try 
		{
			loadProperties();
			JAXBContext jaxbContext = JAXBContext.newInstance(CreateShipUnits.class);
			File file = new File(request.getFileName());
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			CreateShipUnits createShipUnits = (CreateShipUnits) jaxbUnmarshaller.unmarshal(file);
			UPSMapper upsMapper =  new UPSMapper();
			shipConfRequest = upsMapper.populateShipConfirmRequest(createShipUnits,false);
			if(request.isGenLabel()){
				returnConfRequest = upsMapper.populateShipConfirmRequest(createShipUnits,true);
			}
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try {
			genReturnLabel = false;
			if(!request.isGenLabel()){
				infoDO.setUpsSecurity(populateAccessRequest());
				infoDO.setConfirmRequest(shipConfRequest);
				return generateShippingLabel(infoDO,request);
			}
			else{
				infoDO.setUpsSecurity(populateAccessRequest());
				infoDO.setConfirmRequest(shipConfRequest);
				generateShippingLabel(infoDO,request);
				genReturnLabel = true;
				returninfoDO.setUpsSecurity(populateAccessRequest());
				returninfoDO.setConfirmRequest(returnConfRequest);
				return generateShippingLabel(returninfoDO,request);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void handleError() {
		// TODO Auto-generated method stub
		
	}

	public ShipmentOrder createShipmentResposeObj(ShipmentConfirmResponse confirmResponse,ShipmentAcceptResponse acceptResponse) {
		ShipmentOrder response = new ShipmentOrder();
		
		if(null!= confirmResponse){
			response.setStatus(confirmResponse.getResponse().getResponseStatusDescription());
			response.setErrorDescription(confirmResponse.getResponse().getError().get(0).getErrorDescription());
		}
		if(null!= acceptResponse){
			response.setStatus(acceptResponse.getResponse().getResponseStatusDescription());
			response.setCarrier(ShippingConstants.UPS);
			response.setShipmentTypeDO(infoDO.getConfirmRequest().getShipment());
			if(trackingNum!=""){
				response.setTrackingNumber(trackingNum);
			}else{
			response.setTrackingNumber(acceptResponse.getShipmentResults().getShipmentIdentificationNumber());
			}
			response.setActive("Y");
			//for Label
			if(null!=acceptResponse.getShipmentResults() && null!=acceptResponse.getShipmentResults().getPackageResults() &&
					null!=acceptResponse.getShipmentResults().getPackageResults().get(0).getLabelImage()){
				ShipmentDocument document = new ShipmentDocument();
					document.setDocumentTitle("SHIPPINGLABEL");
				document.setDocumentType("png");
				document.setDocumentContent(acceptResponse.getShipmentResults().getPackageResults().get(0).getLabelImage().getGraphicImage());		
				response.getShipmentDocuments().add(document);
			}
			if(null != acceptResponse.getShipmentResults().getForm() && (null != acceptResponse.getShipmentResults().getForm().getImage().getGraphicImage())){
				ShipmentDocument document = new ShipmentDocument();
				document.setDocumentTitle("INVOICE");
				document.setDocumentType(acceptResponse.getShipmentResults().getForm().getImage().getImageFormat().getCode());
				document.setDocumentContent(acceptResponse.getShipmentResults().getForm().getImage().getGraphicImage());		
				response.getShipmentDocuments().add(document);

			}
			ShipmentDocument document = new ShipmentDocument();
			document.setDocumentTitle("CO");
			document.setDocumentType("PDF");
			response.getShipmentDocuments().add(document);
		}
		
		return response;
	}
	
//	private String buildPropertiesPath = ".\\misc\\UPS.properties";
	private Properties properties = new Properties();

	/**
	 * This method triggers the shipping label generation process
	 */
	public ShipmentOrder generateShippingLabel(ShippingInfoDO shippingInfoDO,ShipmentRequest request) throws Exception{
		
		//Load the properties file 
		loadProperties();
		
		// JAXB Context of AccessRequest.java
		JAXBContext accessRequestJAXBC = JAXBContext.newInstance(AccessRequest.class.getPackage().getName() );
		Marshaller accessRequestMarshaller = accessRequestJAXBC.createMarshaller();
		
		//JAXB Context of ShipmentConfirmRequest.java
		JAXBContext shipConfirmRequestJAXBC = JAXBContext.newInstance(ShipmentConfirmRequest.class);
		Marshaller shipConfirmRequestMarshaller = shipConfirmRequestJAXBC.createMarshaller();
		
		//JAXB Context of ShipmentConfirmResponse.java
		JAXBContext shipConfirmJAXBC = JAXBContext.newInstance(ShipmentConfirmResponse.class);
		Unmarshaller shipConfirmUnmarshaller = shipConfirmJAXBC.createUnmarshaller();
		
		//JAXB Context of ShipmentAcceptRequest.java
		JAXBContext shipAcceptJaxb = JAXBContext.newInstance(ShipmentAcceptRequest.class);
		Marshaller shipAcceptRequestMarshaller = shipAcceptJaxb.createMarshaller();
		
		//JAXB Context of ShipmentAcceptResponse.Java
		JAXBContext shipAcceptAXBC = JAXBContext.newInstance(ShipmentAcceptResponse.class);
		Unmarshaller shipAcceptUnmarshaller = shipAcceptAXBC.createUnmarshaller();
		
		StringWriter strWriter = new StringWriter();
		accessRequestMarshaller.marshal(shippingInfoDO.getUpsSecurity(), strWriter);
		shipConfirmRequestMarshaller.marshal(shippingInfoDO.getConfirmRequest(), strWriter);
		strWriter.flush();
		strWriter.close();
		String confirmInput = strWriter.getBuffer().toString();
		//--confirmInput = confirmInput.replace(ShippingConstants.XML_NAMESPACE, "");
		String strResults =contactService(confirmInput,properties.getProperty(ShippingConstants.SHIPPING_CONFIRM_URL));
		//--strResults = strResults.replace(ShippingConstants.SHIP_Response_TAG,ShippingConstants.ship_Response_Replace);
		String result = "";
		if(strResults.indexOf(ShippingConstants.error_Open_tag)!=-1){
			result = strResults.substring(strResults.indexOf(ShippingConstants.error_Open_tag), strResults.indexOf(ShippingConstants.error_Close_tag));
			result = result.replace(ShippingConstants.error_Open_tag, "");
		}
		ByteArrayInputStream input = new ByteArrayInputStream(strResults.getBytes());
		ShipmentConfirmResponse shipconfirmResponse = new ShipmentConfirmResponse();
		if(null != shipconfirmResponse.getResponse()){
			shipconfirmResponse.getResponse().getError().add(new Error());
		}
		shipconfirmResponse = (ShipmentConfirmResponse)shipConfirmUnmarshaller.unmarshal(input);
		if(shipconfirmResponse.getResponse().getResponseStatusCode().equals("1")){
			com.cts.ptms.model.accept.request.ObjectFactory acceptObjectFactory = new com.cts.ptms.model.accept.request.ObjectFactory();
			//ShipmentAcceptRequestObjectFactory acceptObjectFactory = new ShipmentAcceptRequestObjectFactory();
			ShipmentAcceptRequest shipAcceptRequest = acceptObjectFactory.createShipmentAcceptRequest();
			ShipmentAcceptRequest shipmentAcceptRequest = populateShipAcceptRequest(shipAcceptRequest,shipconfirmResponse);
			
			StringWriter strWriterResponse = new StringWriter();
			accessRequestMarshaller.marshal(shippingInfoDO.getUpsSecurity(), strWriterResponse);
			shipAcceptRequestMarshaller.marshal(shipmentAcceptRequest, strWriterResponse);
			strWriterResponse.flush();
			strWriterResponse.close();
			String acceptInput = strWriterResponse.getBuffer().toString();
			//--acceptInput = acceptInput.replace(ShippingConstants.XML_NAMESPACE, "");
			String strAcceptResults =contactService(acceptInput,properties.getProperty(ShippingConstants.SHIPPING_ACCEPT_URL));
			//--strAcceptResults = strAcceptResults.replace(ShippingConstants.SHIP_Accept_TAG,ShippingConstants.ship_Accept_Replace);
			ByteArrayInputStream inputAccept = new ByteArrayInputStream(strAcceptResults.getBytes());
			Object objectAccept = shipAcceptUnmarshaller.unmarshal(inputAccept);
			ShipmentAcceptResponse shipAcceptResponse = (ShipmentAcceptResponse)objectAccept;
			if(!shipAcceptResponse.getResponse().getResponseStatusDescription().equalsIgnoreCase("FAILURE")){
				String imageSrc = shipAcceptResponse.getShipmentResults().getPackageResults().get(0).getLabelImage().getGraphicImage();
				byte[] decoded = Base64.getDecoder().decode(imageSrc);
				generateShippingLabelPDF(decoded,shipAcceptResponse.getShipmentResults().getShipmentIdentificationNumber(),shippingInfoDO,request);
				if(null!=shipAcceptResponse.getShipmentResults().getForm()){
					String formInfo = shipAcceptResponse.getShipmentResults().getForm().getImage().getGraphicImage();
					String formExtn = shipAcceptResponse.getShipmentResults().getForm().getImage().getImageFormat().getCode();
					String formDocType =  shipAcceptResponse.getShipmentResults().getForm().getClass().getSimpleName();
					byte[] intlForms =  Base64.getDecoder().decode(formInfo);
					generateShippingForms(intlForms,shipAcceptResponse.getShipmentResults().getShipmentIdentificationNumber(),formDocType,formExtn);
				}
				return createShipmentResposeObj(null,shipAcceptResponse);
			}
			else{
				return createShipmentResposeObj(null,shipAcceptResponse);
				}
			}
		else{
			shipconfirmResponse.getResponse().getError().get(0).setErrorDescription(result);
			return createShipmentResposeObj(shipconfirmResponse,null);
		}
	}

	/**
	 * This method establish the connection to the REST service
	 */
	private String contactService(String xmlInputString, String serviceUrl) throws Exception {
		String outputStr = null;
		OutputStream outputStream = null;
		try {

			URL url = new URL(serviceUrl);
			//System.getProperties().put("https.proxyHost", "proxy.cognizant.com");
	       // System.getProperties().put("https.proxyPort", "6050"); 
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		//	connection.setRequestProperty("User-Agent", "Mozilla/4.5");
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setUseCaches(false);
			xmlInputString = xmlInputString.replace(ShippingConstants.XML_STANDALONE_STRING, "");
			outputStream = connection.getOutputStream();
			outputStream.write(xmlInputString.getBytes());
			outputStream.flush();
			outputStream.close();
			outputStr = readURLConnection(connection);
		} catch (Exception e) {
			throw e;
		} finally {
			if (outputStream != null) {
				outputStream.close();
				outputStream = null;
			}
		}
		return outputStr;
	}

	/**
	 * This method read all of the data from a URL connection to a String
	 */

	private String readURLConnection(URLConnection uc) throws Exception {
		StringBuffer buffer = new StringBuffer();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			int letter = 0;
			reader.readLine();
			while ((letter = reader.read()) != -1) {
				buffer.append((char) letter);
			}
			reader.close();
		} catch (Exception e) {
			throw e;
		} finally {
			if (reader != null) {
				reader.close();
				reader = null;
			}
		}
		return buffer.toString();
	}

	/**
	 * This method build data for Shipment Accept Request
	 */
	private ShipmentAcceptRequest populateShipAcceptRequest(ShipmentAcceptRequest shipAccept,
			ShipmentConfirmResponse shipconfirmResponse) {
	//	ShipmentAcceptRequestObjectFactory acceptRequestObjectFactory = new ShipmentAcceptRequestObjectFactory();
		com.cts.ptms.model.accept.request.ObjectFactory acceptRequestObjectFactory = new com.cts.ptms.model.accept.request.ObjectFactory();
		if (null == shipAccept.getRequest()) {
			shipAccept.setRequest(acceptRequestObjectFactory.createRequestType());
			//shipAccept.setRequest(acceptRequestObjectFactory.createShipmentAcceptRequestRequest());
			shipAccept.getRequest().setTransactionReference(
					acceptRequestObjectFactory.createTransactionReferenceType());

		}
		shipAccept.getRequest().setRequestAction(ShippingConstants.SHIP_REQUEST_ACTION);
		//shipAccept.getRequest().sesetRequestOption(ShippingConstants.SHIP_REQUEST_OPTION);
		shipAccept.getRequest().setSubVersion(ShippingConstants.SHIP_REQUEST_OPTION);
		shipAccept.getRequest().getTransactionReference()
				.setCustomerContext(shipconfirmResponse.getResponse().getTransactionReference().getCustomerContext());
		shipAccept.setShipmentDigest(shipconfirmResponse.getShipmentDigest());
		return shipAccept;
	}

	/**
	 * This method Generate the shipping label as a PDF file
	 * @param extn 
	 * @param docType 
	 */
	private String generateShippingForms(byte[] decoded,String trackingNumber, String docType, String extn)
			throws MalformedURLException, IOException, DocumentException {

		StringBuilder builder  = new StringBuilder();
		String URL = "";
		try {
			
			String filename = builder.append(new UPSHTTPClient().getClass().getClassLoader().getResource("").getPath())
									 .append(trackingNumber)
									 .append("-")
									 .append(docType)
									 .append(".")
									 .append(extn).toString();
			filename = filename.replace(ShippingConstants.FILE_PATH, ShippingConstants.File_Path_Replace);
			OutputStream os = null;

			try {
				os = new BufferedOutputStream(new FileOutputStream(filename));
				os.write(decoded);
			} finally {
				if (os != null) {
					os.close();
				}
			}


			URL = filename;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return URL;
	}

	/**
	 * This method Generate the shipping label as a PDF file
	 * @throws InterruptedException 
	 * @throws URISyntaxException 
	 */
	private String generateShippingLabelPDF(byte[] decoded,String trackingNumber,ShippingInfoDO shippingInfoDO,ShipmentRequest request)
			throws MalformedURLException, IOException, DocumentException, InterruptedException, URISyntaxException {
		Document document = new Document();
		PdfWriter writer;
		String URL = "";
		try {
			String filename = new UPSHTTPClient().getClass().getClassLoader().getResource("").getPath()
					+ trackingNumber+ShippingConstants.PDF_fILE;
			String path = new UPSHTTPClient().getClass().getClassLoader().getResource("").getPath()
					+ trackingNumber+ShippingConstants.PNG_FILE;
			if(genReturnLabel){
				filename = new UPSHTTPClient().getClass().getClassLoader().getResource("").getPath()
						+"Return_"+ trackingNum+ShippingConstants.PDF_fILE;
				path = new UPSHTTPClient().getClass().getClassLoader().getResource("").getPath()
						+"Return_"+ trackingNum+ShippingConstants.PNG_FILE;
			}
			else{
				trackingNum = trackingNumber;
			}
			filename = filename.replace(ShippingConstants.FILE_PATH, ShippingConstants.File_Path_Replace);
			path = path.replace(ShippingConstants.FILE_PATH, ShippingConstants.File_Path_Replace);
			OutputStream out1 = null;

			try {
				out1 = new BufferedOutputStream(new FileOutputStream(path));
				out1.write(decoded);
			} finally {
				if (out1 != null) {
					out1.close();
				}
			}
			//URL = createInvoicePDF(path, filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return URL;
	}

	/**
	 * This method to load the property file(s)
	 */
	private void loadProperties(){
		try {
			File initialFile = new File(ShippingConstants.buildPropertiesPath);
		    InputStream inputStream = FileUtils.openInputStream(initialFile);			
			properties.load(inputStream);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	 private AccessRequest populateAccessRequest(){
		 AccessRequest accessRequest = new AccessRequest();
	    	accessRequest.setAccessLicenseNumber(properties.getProperty(ShippingConstants.ACCESS_KEY));
	    	accessRequest.setUserId(properties.getProperty(ShippingConstants.USER_ID));
	    	accessRequest.setPassword(properties.getProperty(ShippingConstants.PASSWORD));
	    	return accessRequest;
	    	
	    }
	 
	 public String createInvoicePDF(String imagePath ,String OUTPUT_FILEPATH)
				throws FileNotFoundException, IOException, DocumentException, InterruptedException, URISyntaxException {

			float currPosition = 0;
			String sFilepath = OUTPUT_FILEPATH;
			 Image image = Image.getInstance(imagePath);
			   //create a paragraph
			   Paragraph paragraph = new Paragraph();
			Document d = new Document(PageSize.A4_LANDSCAPE.rotate());
			PdfWriter w = PdfWriter.getInstance(d, new FileOutputStream(sFilepath));
			d.open();
			PdfContentByte cb = w.getDirectContent();
			ByteArrayOutputStream stampedBuffer;
			URL resource = this.getClass().getClassLoader().getResource(ShippingConstants.INVOICE_TEMPLATE);
			File file = new File(resource.toURI());
			PdfReader templateReader = new PdfReader(new FileInputStream(file));
			stampedBuffer = new ByteArrayOutputStream();
			PdfStamper stamper = new PdfStamper(templateReader, stampedBuffer);
			 stamper.setFormFlattening(true);
			 AcroFields form = stamper.getAcroFields();
			 float[] columnWidths = {1f, 1f, 1f, 3f};
			   //create PDF table with the given widths
			   PdfPTable table = new PdfPTable(columnWidths);
	        // form.setField("field1", String.format("Form Text %d", i+1));
	         form.setField("OBName", "Ragav");
	         form.setField("OBCompany", "Ragav");
	         form.setField("OBAddress", "2002 SW Sarazen Cr");
	         form.setField("OBCity", "Bentonville");
	         form.setField("OBPhone", "1234567890");
	         form.setField("STName", "Ragav");
	         form.setField("STCompany", "Ragav");
	         form.setField("STAddress", "2002 SW Sarazen Cr");
	         form.setField("STCity", "Bentonville");
	         form.setField("STPhone", "1234567890");
	         form.setField("itemNo", "12334535");
	         form.setField("itemDesc", "Laundry Bag");
	         stamper.close();
	         templateReader.close();
	         form = null;
			stamper.close();
			templateReader.close();
			PdfReader stampedReader = new PdfReader(stampedBuffer.toByteArray());
			PdfImportedPage page = w.getImportedPage(stampedReader, 1);
			cb.addTemplate(page, 0, currPosition);
			image.scaleAbsoluteHeight(325);
			image.scaleAbsoluteWidth(550);
			image.setRotationDegrees(270);
			image.setAbsolutePosition(450, 20);
			d.add(image);
			d.close();
			w.close();

			return sFilepath;
		}

	/* (non-Javadoc)
	 * @see com.cts.ptms.core.ClientGateway#cancelShipment(com.cts.ptms.model.common.ShipmentRequest)
	 */
	@Override
	public ShipmentOrder cancelShipment(ShipmentRequest shipmentRequest) {
		// TODO Auto-generated method stub
		return null;
	}
	 
}
