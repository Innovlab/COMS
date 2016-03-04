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
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.time.FastDateFormat;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.util.PDFImageWriter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.ptms.carrier.fedex.FedExShipmentService;
import com.cts.ptms.carrier.ups.UPSHTTPClient;
import com.cts.ptms.carrier.ups.UPSShipmentService;
import com.cts.ptms.carrier.yrc.YRCShipmentService;
import com.cts.ptms.dao.ShipmentServiceDAO;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.common.BatchOrderSummary;
import com.cts.ptms.model.common.BatchOrderSummaryFilter;
import com.cts.ptms.model.common.ShipmentBatchRequest;
import com.cts.ptms.model.common.ShipmentDocument;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.ShipmentOrderDetail;
import com.cts.ptms.model.common.ShipmentOrderDetailRequest;
import com.cts.ptms.model.common.TrackingDetails;
import com.cts.ptms.utils.CommonUtil;
import com.cts.ptms.utils.ShipmentUtils;
import com.cts.ptms.utils.constants.ShippingConstants;
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

	private ShipmentServiceDAO shipmentServiceDAO;
	ClientShipmentService clientShipmentService;
	static String date = FastDateFormat.getInstance("MM-dd-yyyy").format(System.currentTimeMillis());
	public static String itemNumber = "";
	public static String itemDescription = "";
	public static String plannedShipDate = "";
	public static String shipmentWeight = "";
	public static String pkgCnt = "";

	private void initializeService(String carrier) {
		// Based on carrier and the corresponding configuration load the
		// properties and inject the respective service objects

		if (carrier.equalsIgnoreCase(ShippingConstants.UPS)) {
			clientShipmentService = new UPSShipmentService();
		} else if (carrier.equalsIgnoreCase(ShippingConstants.YRC)) {
			clientShipmentService = new YRCShipmentService();
		} else if (carrier.equalsIgnoreCase(ShippingConstants.FEDEX)) {
			clientShipmentService = new FedExShipmentService();
		}

	}

	public ShipmentOrder createSingleShipmentOrder(ShipmentRequest shipmentRequest) {
		
		initializeService(shipmentRequest.getCarrier());
		ShipmentOrder shipmentOrder = clientShipmentService.createShipment(shipmentRequest);
		shipmentOrder = saveShipmentDocuments(shipmentOrder);
		shipmentOrder.setCarrier("YRC");
		System.out.println("'Shipment Order:" + shipmentOrder);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		shipmentServiceDAO = (ShipmentServiceDAO) context.getBean("shipmentServiceDao");
		shipmentServiceDAO.saveShipmentOrder(shipmentOrder);
		System.out.println(shipmentOrder);
		context.close();
		return shipmentOrder;

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
			
		String targetDir = ShippingConstants.OUTPUT_DIR;
		String imgFileName = null;
		String  documentContent="";
		
		for (ShipmentDocument shipmentDocument : shipmentDocumentList) {
			String  outputFileName=CommonUtil.getDcoumentName(shipmentDocument.getDocumentTitle(), shipmentOrder.getCarrier(), shipmentDocument.getDocumentType(), shipmentOrder.getTrackingNumber());
			byte[] decodedBytes = Base64.getDecoder().decode((String)shipmentDocument.getDocumentContent());
			System.out.println("Target Dir1:" + targetDir);
			switch (shipmentDocument.getDocumentTitle()) {
			
				case "SHIPPINGLABEL" :  {
					try {
						// For shipping label if the output is pdf it needs to saved as png;
						if(shipmentDocument.getDocumentType().equalsIgnoreCase("PDF")) {						
							imgFileName = convertPdfToImg( decodedBytes,outputFileName,targetDir);	
							imgFileName = outputFileName;							
						} else {
							imgFileName = shipmentDocument.getDocumentName();
						}
						String pdfFileName = createInvoicePDF(imgFileName,targetDir, shipmentOrder);
						documentContent = encodeFileToBase64Binary(pdfFileName);
						documentContent = "data:application/pdf;base64," + documentContent;
						shipmentDocument.setDocumentType("PDF");
						shipmentDocument.setDocumentContent(documentContent);
						
					} catch (IOException | DocumentException | InterruptedException | URISyntaxException e) {						
						e.printStackTrace();
					}						
				}
				
				case "CO" : {
					try {
						shipmentDocument.setDocumentName(createCOPDF(outputFileName, shipmentOrder));
						documentContent = encodeFileToBase64Binary(shipmentDocument.getDocumentName());
						documentContent = "data:application/pdf;base64," + documentContent;
						shipmentDocument.setDocumentContent(documentContent);
						
					} catch (IOException | DocumentException | InterruptedException | URISyntaxException e) {						
						e.printStackTrace();
					}
				}
				
			}
		}				
		
		return shipmentOrder;
	}

	public String createInvoicePDF(String imagePath, String targetDir,ShipmentOrder shipmentOrder)
			throws FileNotFoundException, IOException, DocumentException, InterruptedException, URISyntaxException {

		float currPosition = 0;
		imagePath = imagePath.replace(".pdf", ".png");
		String sFilepath = targetDir + imagePath;
		Image image = Image.getInstance(sFilepath);
		// create a paragraph
		Paragraph paragraph = new Paragraph();
		Document d = new Document(PageSize.A4_LANDSCAPE.rotate());
		PdfWriter w = PdfWriter.getInstance(d, new FileOutputStream(sFilepath));
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
		} else {
			image.scaleAbsoluteHeight(600);
			image.scaleAbsoluteWidth(700);
			// image.setRotationDegrees(0);
			image.setAbsolutePosition(450, -35);
		}
		d.add(image);
		d.close();
		w.close();

		return sFilepath;
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

	
	
	public static void main(String[] args) {

	}

}
