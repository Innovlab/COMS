package com.cts.ptms.core;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.time.FastDateFormat;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.ptms.carrier.fedex.FedExShipmentService;
import com.cts.ptms.carrier.purolator.PurolatorShipmentService;
import com.cts.ptms.carrier.ups.UPSHTTPClient;
import com.cts.ptms.carrier.ups.UPSShipmentService;
import com.cts.ptms.carrier.yrc.YRCShipmentService;
import com.cts.ptms.dao.ShipmentServiceDAO;
import com.cts.ptms.dao.ShipmentServiceJDBC;
import com.cts.ptms.exception.shipping.ShippingException;
import com.cts.ptms.model.common.BatchOrderSummary;
import com.cts.ptms.model.common.BatchOrderSummaryFilter;
import com.cts.ptms.model.common.ShipmentBatchRequest;
import com.cts.ptms.model.common.ShipmentDocument;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.ShipmentOrderDetail;
import com.cts.ptms.model.common.ShipmentOrderDetailRequest;
import com.cts.ptms.model.common.TrackingDetails;
import com.cts.ptms.model.gls.SHIPUNIT;
import com.cts.ptms.utils.ShipmentUtils;
import com.cts.ptms.utils.constants.ShippingConstants;
import com.cts.ptms.utils.constants.UPSConstants;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

public class ShipmentServiceImpl implements ShipmentService {
	
	private Logger logger = Logger.getAnonymousLogger() ; 
	
	private ShipmentServiceDAO shipmentServiceDAO;
	private ShipmentServiceJDBC shipmentServiceJDBC;
	ClientShipmentService clientShipmentService;
	static String date = FastDateFormat.getInstance("MM-dd-yyyy").format(System.currentTimeMillis());
	public static String itemNumber = "";
	public static String itemDescription = "";
	public static String plannedShipDate = "";
	public static String shipmentWeight = "";
	public static String pkgCnt = "";
	
	ClassPathXmlApplicationContext context =null;

	private void initializeService(String carrier) {
		// Based on carrier and the corresponding configuration load the
		// properties and inject the respective service objects

		if (carrier.equalsIgnoreCase(ShippingConstants.UPS)) {
			clientShipmentService = new UPSShipmentService();
		} else if (carrier.equalsIgnoreCase(ShippingConstants.YRC)) {
			clientShipmentService = new YRCShipmentService();
		} else if (carrier.equalsIgnoreCase(ShippingConstants.FEDEX)) {
			clientShipmentService = new FedExShipmentService();
		} else if (carrier.equalsIgnoreCase(ShippingConstants.PUROLATOR)) {
			clientShipmentService = new PurolatorShipmentService();
		}
		
		if (null == context){
			context = new ClassPathXmlApplicationContext("applicationContext.xml");
		}

	}

	public ShipmentOrder createSingleShipmentOrder(ShipmentRequest shipmentRequest) {
		
		ShipmentOrder shipmentOrder = null;
		String activeOrder = "Y";
		initializeService(shipmentRequest.getCarrier());
		shipmentServiceDAO = (ShipmentServiceDAO) context.getBean("shipmentServiceDao");
		shipmentServiceJDBC =  (ShipmentServiceJDBC) context.getBean("shipmentReportServiceDao");
		//get the Shipment Order from DB
		//Check for duplicate
		shipmentOrder = shipmentServiceDAO.getByCartonNumber(getCartonNumber(shipmentRequest), activeOrder);
		
		if ( null != shipmentOrder && (null != shipmentOrder.getTrackingNumber()) ){
			shipmentOrder.setStatus(ShippingConstants.STATUS_FAILURE);
			shipmentOrder.setErrorDescription(ShippingConstants.ERR_CD_CARTON_EXISTS);
			return shipmentOrder;
		}
		String serviceId = shipmentRequest.getCreateShipUnits().getCreateShipUnitsParams().getCREATESHIPUNITSPARAMS1().getSHIPUNIT().getShipVia().toString();
		int weight = shipmentServiceJDBC.getMaxWeightForCarrier(serviceId);
		BigInteger maxWeight = BigInteger.valueOf(weight);
		BigInteger itemWeight = shipmentRequest.getCreateShipUnits().getCreateShipUnitsParams().getCREATESHIPUNITSPARAMS1().getSHIPUNIT().getWeight();
		if((itemWeight.compareTo(maxWeight))==1) {
			shipmentOrder = new ShipmentOrder();
			shipmentOrder.setStatus(ShippingConstants.STATUS_FAILURE);
			shipmentOrder.setErrorDescription(ShippingConstants.ERR_CD_MAX_WEIGHT + " " + maxWeight  );
			return shipmentOrder;
		}
		shipmentOrder = clientShipmentService.createShipment(shipmentRequest);
		shipmentOrder = saveShipmentDocuments(shipmentOrder);
			populateRequestAttributes(shipmentRequest, shipmentOrder);
		shipmentOrder.setCarrier(shipmentRequest.getCarrier());
		System.out.println("'Shipment Order:" + shipmentOrder);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		shipmentServiceDAO = (ShipmentServiceDAO) context.getBean("shipmentServiceDao");
		shipmentServiceDAO.saveShipmentOrder(shipmentOrder);
		System.out.println(shipmentOrder);
		context.close();
		return shipmentOrder;
	
	}
	private String getCartonNumber(ShipmentRequest shipmentRequest) {
		String cartonNum = shipmentRequest.getCreateShipUnits().getCreateShipUnitsParams().getCREATESHIPUNITSPARAMS1().getSHIPUNIT().getCartonNumber();
		return cartonNum;
	}

	protected void populateRequestAttributes(ShipmentRequest shipmentRequest, ShipmentOrder shipmentOrder)
			throws NumberFormatException {
		SHIPUNIT shipUnit =  shipmentRequest.getCreateShipUnits().getCreateShipUnitsParams().getCREATESHIPUNITSPARAMS1().getSHIPUNIT();
		shipmentOrder.setCarrier(shipmentRequest.getCarrier());
		String cartonNum = getCartonNumber(shipmentRequest);
		String orderNum = shipUnit.getOrderNumber().toString();
		shipmentOrder.setCartonNumber(cartonNum);
		shipmentOrder.setOrderNumber(orderNum);
		shipmentOrder.setReturnFlag(shipmentRequest.isGenLabel()?"Y":"N");
		shipmentOrder.setCarrierService(shipUnit.getShipVia().toString());
		shipmentOrder.setBillingAccountNumber(shipUnit.getBillingAccountID().toString());
		if(shipmentOrder.getStatus()!=null || shipmentOrder.getStatus().equalsIgnoreCase("") ) {
			if(shipmentOrder.getStatus().equalsIgnoreCase("SUCCESS")) {
				shipmentOrder.setShipperStatus("LABELS GENERATED");
				shipmentOrder.setProcessedDate(new Date());
			}
		}
		
		
	}

	public TrackingDetails getShipmentTrackingDetails(String trackingId) {

		ShipmentOrder shipmentOrder = shipmentServiceDAO.getByTrackingNumber(trackingId);
		initializeService(shipmentOrder.getCarrier());
		TrackingDetails trackingDetails = clientShipmentService.getTrackingDetails(trackingId);
		trackingDetails.setShipmentOrder(shipmentOrder);
		return trackingDetails;

	}

	@Override
	public BatchOrderSummary createBatchShipmentOrder(ShipmentBatchRequest shipmentBatchsRequest) {

		BatchOrderSummary batchOrderSummary = new BatchOrderSummary();
		List<ShipmentOrder> shipmentOrderList = new ArrayList<ShipmentOrder>();
		String filePath = shipmentBatchsRequest.getFilePath();
		if (filePath != null) {
			File folder = new File(filePath);
			if (folder.exists()) {
				String[] extensions = new String[] { "xml" };
				@SuppressWarnings("unchecked")
				List<File> files = (List<File>) FileUtils.listFiles(folder, extensions, false);
				for (File file : files) {
					String requestXml = ShipmentUtils.getRequestXml(file);
					String carrier = ShipmentUtils.getCarrierFromRequest(requestXml);
					ShipmentRequest shipmentRequest = new ShipmentRequest();
					shipmentRequest.setShipmentRequestXml(requestXml);
					shipmentRequest.setCarrier(carrier);
					shipmentRequest.setGenLabel(false);
					ShipmentOrder shipmentOrder = createSingleShipmentOrder(shipmentRequest);
					shipmentOrderList.add(shipmentOrder);

				}

				batchOrderSummary.setShipmentOrderList(shipmentOrderList);
			}
		}
		return batchOrderSummary;
	}

	@Override
	public BatchOrderSummary getBatchOrderSummary(BatchOrderSummaryFilter batchOrderSummaryFilter) {
		// TODO Auto-generated method stub
		return null;
	}

	private ShipmentOrder saveShipmentDocuments(ShipmentOrder shipmentOrder) {

		List<ShipmentDocument> shipmentDocumentList = shipmentOrder.getShipmentDocuments();
			
		//String targetDir = ShippingConstants.OUTPUT_DIR;
		String imgFileName = null;
		String  documentContent="";
		String targetDir = new UPSHTTPClient().getClass().getClassLoader().getResource("").getPath();
		targetDir = targetDir.replace(ShippingConstants.FILE_PATH, ShippingConstants.File_Path_Replace);
		for (ShipmentDocument shipmentDocument : shipmentDocumentList) {
			String  outputFileName=getDcoumentName(shipmentDocument.getDocumentTitle(), shipmentOrder.getCarrier(), shipmentDocument.getDocumentType(), shipmentOrder.getTrackingNumber());
			System.out.println("Target Dir1:" + targetDir);
			switch (shipmentDocument.getDocumentTitle()) {
			
				case "SHIPPINGLABEL" :  {
					try {
						// For shipping label if the output is pdf it needs to saved as png;
						if(shipmentDocument.getDocumentType().equalsIgnoreCase("PDF")) {	
							byte[] decodedBytes = Base64.getDecoder().decode((String)shipmentDocument.getDocumentContent());
							imgFileName = convertPdfToImg( decodedBytes,outputFileName,targetDir);	
							imgFileName = outputFileName;							
						} else {
							String path = targetDir+outputFileName;
							File outputFile = new File(path);
							byte[] decoded = null;
							String documentContentType = shipmentDocument.getDocumentContentType();
							if (null != shipmentDocument.getDocumentContent()) {
								decoded = Base64.getDecoder().decode(shipmentDocument.getDocumentContent());
							} else if (documentContentType != null && documentContentType.equals(ShippingConstants.DECODED_BYTE_ARRAY)) {
								decoded = shipmentDocument.getByteArray();
							}
							FileUtils.writeByteArrayToFile(outputFile, decoded); 
							imgFileName = outputFileName;
							imgFileName = imgFileName.replace(".png", ".pdf");
						}
						String pdfFileName = createInvoicePDF(imgFileName,targetDir, shipmentOrder);
						documentContent = encodeFileToBase64Binary(targetDir+pdfFileName);
						documentContent = "data:application/pdf;base64," + documentContent;
						shipmentDocument.setDocumentType("PDF");
						shipmentDocument.setDocumentName(imgFileName);
						shipmentDocument.setDocumentContent(documentContent);
						
					} catch (IOException | DocumentException | InterruptedException | URISyntaxException e) {						
						e.printStackTrace();
					}
					break;
				}
				
				case "CO" : {
					try {
						createCOPDF(targetDir+outputFileName, shipmentOrder);
						shipmentDocument.setDocumentName(outputFileName);
						documentContent = encodeFileToBase64Binary(targetDir+outputFileName);
						documentContent = "data:application/pdf;base64," + documentContent;
						shipmentDocument.setDocumentContent(documentContent);
						
					} catch (IOException | DocumentException | InterruptedException | URISyntaxException e) {						
						e.printStackTrace();
					}
					break;
				}
				
			}
		}				
		
		return shipmentOrder;
	}

	private String getDcoumentName(String documentTitle, String carrier, String documentType, String trackingNumber) {
		StringBuilder documentName  = new StringBuilder();
		documentName.append(carrier);
		documentName.append("_");
		documentName.append(documentTitle);
		documentName.append("_");
		documentName.append(trackingNumber);
		documentName.append(".");
		documentName.append(documentType.toLowerCase());
		
		return documentName.toString();
	}

	public String createInvoicePDF(String imagePath, String targetDir,ShipmentOrder shipmentOrder)
			throws FileNotFoundException, IOException, DocumentException, InterruptedException, URISyntaxException {

		float currPosition = 0;
		imagePath = imagePath.replace(".pdf", ".png");
		String sFilepath = targetDir + imagePath;
		Image image = Image.getInstance(sFilepath);
		imagePath = imagePath.replace(".png", ".pdf");
		
		// create a paragraph
		Paragraph paragraph = new Paragraph();
		Document d = new Document(PageSize.A4_LANDSCAPE.rotate());
		PdfWriter w = PdfWriter.getInstance(d, new FileOutputStream(targetDir+imagePath));
		d.open();
		PdfContentByte cb = w.getDirectContent();
		ByteArrayOutputStream stampedBuffer;
		//URL resource = this.getClass().getClassLoader().getResource(ShippingConstants.INVOICE_TEMPLATE);
		File file = new File(ShippingConstants.INVOICE_TEMPLATE);
		PdfReader templateReader = new PdfReader(new FileInputStream(file));
		stampedBuffer = new ByteArrayOutputStream();
		PdfStamper stamper = new PdfStamper(templateReader, stampedBuffer);
		stamper.setFormFlattening(true);
		AcroFields form = stamper.getAcroFields();
		float[] columnWidths = { 1f, 1f, 1f, 3f };
		// create PDF table with the given widths
		PdfPTable table = new PdfPTable(columnWidths);
		// form.setField("field1", String.format("Form Text %d", i+1));
		form.setField("OBName", shipmentOrder.getShipmentTypeDO().getShipFrom().getCompanyName());
		form.setField("OBCompany", shipmentOrder.getShipmentTypeDO().getShipFrom().getCompanyName());
		form.setField("OBAddress", shipmentOrder.getShipmentTypeDO().getShipFrom().getAddress().getAddressLine1());
		form.setField("OBCity", shipmentOrder.getShipmentTypeDO().getShipFrom().getAddress().getCity());
		form.setField("OBPhone", shipmentOrder.getShipmentTypeDO().getShipFrom().getPhoneNumber());
		form.setField("STName", shipmentOrder.getShipmentTypeDO().getShipTo().getAttentionName());
		form.setField("STCompany", shipmentOrder.getShipmentTypeDO().getShipTo().getCompanyName());
		form.setField("STAddress", shipmentOrder.getShipmentTypeDO().getShipTo().getAddress().getAddressLine1());
		form.setField("STCity", shipmentOrder.getShipmentTypeDO().getShipTo().getAddress().getCity());
		form.setField("STPhone", shipmentOrder.getShipmentTypeDO().getShipFrom().getPhoneNumber());
		form.setField("itemNo", ShipmentServiceImpl.itemNumber);
		form.setField("itemDesc", ShipmentServiceImpl.itemDescription);
		form.setField("qty", ShipmentServiceImpl.pkgCnt);
		stamper.close();
		templateReader.close();
		form = null;
		stamper.close();
		templateReader.close();
		PdfReader stampedReader = new PdfReader(stampedBuffer.toByteArray());
		PdfImportedPage page = w.getImportedPage(stampedReader, 1);
		cb.addTemplate(page, 0, currPosition);
		if (shipmentOrder.getCarrier().equalsIgnoreCase("UPS")) {
			image.scaleAbsoluteHeight(325);
			image.scaleAbsoluteWidth(550);
			image.setRotationDegrees(270);
			image.setAbsolutePosition(450, 20);
		} else if (shipmentOrder.getCarrier().equalsIgnoreCase("FEDEX")) {
			image.scaleAbsoluteHeight(325);
			image.scaleAbsoluteWidth(550);
			image.setRotationDegrees(90);
			image.setAbsolutePosition(450, 20);
		} else if (shipmentOrder.getCarrier().equalsIgnoreCase("PUROLATOR")) {
			image.scaleAbsoluteHeight(550);
			image.scaleAbsoluteWidth(325);
			//image.setRotationDegrees(90);
			image.setAbsolutePosition(450, 20);
		}else {
			image.scaleAbsoluteHeight(600);
			image.scaleAbsoluteWidth(700);
			// image.setRotationDegrees(0);
			image.setAbsolutePosition(450, -35);
		}
		d.add(image);
		d.close();
		w.close();

		return imagePath;
	}

	public String createCOPDF(String OUTPUT_FILEPATH, ShipmentOrder shipmentOrder)
			throws FileNotFoundException, IOException, DocumentException, InterruptedException, URISyntaxException {

		float currPosition = 0;
		String sFilepath = OUTPUT_FILEPATH;
		Document d = new Document();
		PdfWriter w = PdfWriter.getInstance(d, new FileOutputStream(sFilepath));
		d.open();
		PdfContentByte cb = w.getDirectContent();
		ByteArrayOutputStream stampedBuffer;
		File file = new File(ShippingConstants.CO_TEMPLATE);
		PdfReader templateReader = new PdfReader(new FileInputStream(file));
		stampedBuffer = new ByteArrayOutputStream();
		PdfStamper stamper = new PdfStamper(templateReader, stampedBuffer);
		stamper.setFormFlattening(true);
		AcroFields form = stamper.getAcroFields();
		form.setField("OwnerName", shipmentOrder.getShipmentTypeDO().getShipFrom().getCompanyName());
		form.setField("ShipperAddr", shipmentOrder.getShipmentTypeDO().getShipFrom().getAddress().getAddressLine1());
		form.setField("CarrierName", shipmentOrder.getCarrier());
		form.setField("ShipDate", ShipmentServiceImpl.plannedShipDate);
		form.setField("RecepientName", shipmentOrder.getShipmentTypeDO().getShipTo().getAttentionName());
		form.setField("PkgCount", ShipmentServiceImpl.pkgCnt);
		form.setField("PkgWeight", ShipmentServiceImpl.shipmentWeight);
		form.setField("BillofLadingNum", "");
		form.setField("day", "");
		form.setField("month", "");
		form.setField("year", "");
		form.setField("PkgDesc", ShipmentServiceImpl.itemDescription);
		form.setField("Signature", "");
		form.setField("DepartmentName", "");
		form.setField("State", "");
		stamper.close();
		templateReader.close();
		form = null;
		stamper.close();
		templateReader.close();
		PdfReader stampedReader = new PdfReader(stampedBuffer.toByteArray());
		PdfImportedPage page = w.getImportedPage(stampedReader, 1);
		cb.addTemplate(page, 0, currPosition);
		d.close();
		w.close();

		return sFilepath;
	}

	private static PDDocument loadPdfDocumentFromFile(String fileName) throws IOException {
		return PDDocument.load(fileName);
	}
	
	public String convertPdfToImg (byte[] decodedBytes,String outputFileName,String targetDir) {
		
		InputStream inputStream = new ByteArrayInputStream(decodedBytes);
		PDDocument document;
		File outputfile=null;
		try {
			document = PDDocument.load(inputStream);		
			List<PDPage> list = document.getDocumentCatalog().getAllPages();						
			PDPage firstPage = list.get(0);
			String fileName = outputFileName.replace(".pdf", "");
			BufferedImage image = firstPage.convertToImage();
			outputfile = new File(targetDir + fileName + ".png");
			System.out.println("Image Created -> " + outputfile.getName());
			ImageIO.write(image, "png", outputfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return outputfile.getName();	
	}
	

	private String encodeFileToBase64Binary(String fileName)
			throws IOException {

		File file = new File(fileName);
		byte[] bytes = FileUtils.readFileToByteArray(file);
		byte[] encoded = Base64.getEncoder().encode(bytes);
		String encodedString = new String(encoded);
		return encodedString;
	}

	
	private ShipmentOrder populateShipmentOrder () {
		ShipmentOrder shipmentOrder = new ShipmentOrder();
		shipmentOrder.setCarrier("YRC");
		shipmentOrder.setOrderDate( new Date());
		shipmentOrder.setOrderNumber("124");
		shipmentOrder.setStatus("DELIVERED");
		shipmentOrder.setTrackingNumber("124t");	
		shipmentOrder.setBillingAccountNumber("123b");
		shipmentOrder.setCartonNumber("123c");
		shipmentOrder.setCustomerOrderNumber("123o");
		ArrayList<ShipmentDocument>  shipmentDocuments = new ArrayList<ShipmentDocument>();
		ShipmentDocument shipmentDocument = new  ShipmentDocument();
		shipmentDocument.setDocumentType("A");
		shipmentDocument.setDocumentTitle("A");
		shipmentDocument.setDocumentName("A");
		shipmentDocuments.add(shipmentDocument);
		
		shipmentOrder.setShipmentDocuments(shipmentDocuments);
		return shipmentOrder;
	}

	/* (non-Javadoc)
	 * @see com.cts.ptms.core.ShipmentService#cancelShipmentOrder(com.cts.ptms.model.common.ShipmentRequest)
	 */
	@Override
	public ShipmentOrder cancelShipmentOrder(ShipmentRequest shipmentRequest) {
		initializeService(shipmentRequest.getCarrier());
		ShipmentOrder shipmentOrder = null;
		shipmentServiceDAO = (ShipmentServiceDAO) context.getBean("shipmentServiceDao");
		try 
		{
			shipmentOrder = shipmentServiceDAO.getByTrackingNumber(shipmentRequest.getTrackingNumToCancel());
			if (shipmentOrder != null && shipmentOrder.getShipmentOrderId() != 0) {
				logger.info("Retrieved Shipment order ID:"+shipmentOrder.getShipmentOrderId());
				long shipmentOrderID = shipmentOrder.getShipmentOrderId();
				System.out.println("Retrieved Shipment order ID:"+shipmentOrderID);
				shipmentOrder = clientShipmentService.cancelShipment(shipmentRequest);
				shipmentServiceDAO.updateShipmentOrder(shipmentOrderID, "N");
			} else {
				throw new ShippingException("No details found for the given tracking number..");
			}
		}catch(ShippingException ex){
			shipmentOrder = new ShipmentOrder();
			shipmentOrder.setStatus("0");
			shipmentOrder.setErrorDescription(ex.getMessage());
			logger.severe("Exception occurred :"+ex);
		}catch(Exception ex){
			shipmentOrder = new ShipmentOrder();
			shipmentOrder.setStatus("0");
			shipmentOrder.setErrorDescription("Exception while cancelling the shipment..");
			logger.severe("Exception occurred :"+ex);
		}
		return shipmentOrder;
	}
	
	public void testSave() {
		
		
		ShipmentOrder shipmentOrder  = populateShipmentOrder();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		shipmentServiceDAO = (ShipmentServiceDAO) context.getBean("shipmentServiceDao");
		//shipmentServiceDAO.saveShipmentOrder(shipmentOrder);
		ShipmentServiceJDBC  shipmentServiceJdbc =  (ShipmentServiceJDBC) context.getBean("shipmentReportServiceDao");
		//shipmentServiceJdbc.getServiceSummaryForAll();
		//shipmentServiceJT .getOrderSummaryForAll();
		//shipmentServiceDAO.getOrderSummary();
		System.out.println(shipmentOrder);
		context.close();
	}
	
	
	
	
	public static void main(String[] args) {
		ShipmentServiceImpl  serviceImpl  = new ShipmentServiceImpl();
		serviceImpl.testSave();

	}

}
