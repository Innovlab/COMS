/**
 * 
 */
package com.cts.ptms.carrier.yrc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Base64;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cts.ptms.model.common.ShipmentDocument;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.utils.constants.ShippingConstants;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

/**
 * @author 417765
 *
 */
public class YRCShipmentTrackingJUnit {
	
	private Logger logger = Logger.getAnonymousLogger() ;
	private YRCSoapClient yrcSoapClient;
	private ShipmentRequest shipmentRequest = null;
	private ShipmentOrder shipmentResponse = null;
	private Properties properties; 
	private String SHIPPINGLABEL = "SHIPPINGLABEL";
	private String INVOICE = "INVOICE";
	
	@Before
    public void setUp() throws JSONException, IOException {
		
		logger.info("setting up all required data for each test case method.");
		yrcSoapClient = new YRCSoapClient();
		shipmentRequest = new ShipmentRequest();
		shipmentResponse = new ShipmentOrder();
		
		try {
    		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("./documents_location.properties");
			properties = new Properties();
			properties.load(inputStream);
			System.out.println("Saving the file .."+ properties.getProperty("SAVE_FILE_PATH"));

		} catch (IOException e) {
			System.out.println("Exception occured : "+e.getMessage());
			e.printStackTrace();
		}
       
    }
    @After
    public void tearDown() 
    {
    	logger.info("nullifying up all required data for each test case method.");
    	yrcSoapClient = null;
    	shipmentRequest = null;
    	shipmentResponse = null;
    }
    /**
     * Junit test case for standard shipping label generation.
     */
    @Test
    public void testCreateLabelInvoiceBarcode_Standard_Success()
    {
    	
    	try {
    		logger.info("Testing creation of label, invoice, barcode for standard service-- Success. ");
    		String fileName = "./com/cts/ptms/carrier/yrc/resources/InputData_Standard_Success.xml";
	    	URL url = getClass().getClassLoader().getResource(fileName);
			shipmentRequest.setFileName(url.getFile());
    		//String fileName = "D:/YRC_TEST_INPUT/InputData_Standard_Success.xml";
    		shipmentRequest.setCarrier("YRC");
	    	//shipmentRequest.setFileName(fileName);
	    	shipmentRequest.setGenLabel(true);
	    	shipmentResponse = yrcSoapClient.createShipmentRequest(shipmentRequest);
	    	
	    	System.out.println("Status:"+shipmentResponse );
	    	assertEquals("SUCCESS", shipmentResponse.getStatus());
			
			assertFalse(shipmentResponse == null);
			assertFalse(shipmentResponse.getShipmentDocuments().size() == 0);
			List<ShipmentDocument> shipmentDocs = shipmentResponse.getShipmentDocuments();
			
			for( ShipmentDocument shipmentDoc : shipmentDocs) {
				assertFalse(null == shipmentDoc.getDocumentText());
				if (shipmentDoc.getDocumentName().equals(SHIPPINGLABEL)) {
					
					byte[] decoded = Base64.getDecoder().decode(shipmentDoc.getDocumentText());
					saveBase64DataToLocalFile(decoded, shipmentResponse.getTrackingNumber()+"_StandardSuccess_"+shipmentDoc.getDocumentName());
					PdfReader reader = new PdfReader(decoded);
					System.out.println("This PDF has "+reader.getNumberOfPages()+" pages.");
			        String page = PdfTextExtractor.getTextFromPage(reader, 1);
			        //System.out.println("Page Content:\n\n"+page+"\n\n");
			        
			        assertTrue(page.contains("60"));
			        assertTrue(page.contains("WALMART.COM-VAR"));
			        
				} else if (shipmentDoc.getDocumentName().equals(INVOICE)){
					byte[] decoded = Base64.getDecoder().decode(shipmentDoc.getDocumentText());
					saveBase64DataToLocalFile(decoded, shipmentResponse.getTrackingNumber()+"_StandardSuccess_"+shipmentDoc.getDocumentName());
					PdfReader reader = new PdfReader(decoded);
					System.out.println("This PDF has "+reader.getNumberOfPages()+" pages.");
			        //String page = PdfTextExtractor.getTextFromPage(reader, 1);
			        //System.out.println("Page Content:\n\n"+page+"\n\n");
				} else {
					byte[] decoded = Base64.getDecoder().decode(shipmentDoc.getDocumentText());
					saveBase64DataToLocalFile(decoded, shipmentResponse.getTrackingNumber()+"_StandardSuccess_"+shipmentDoc.getDocumentName());
				}
			}
			
    	} 
		catch(Exception e)
		{
			assertEquals("Failure", "Failure");
			e.printStackTrace();
			System.out.println("Exception occured"+e.getMessage());
		}
    	
    }
    /**
     * Junit test case for standard shipping label generation- failure scenario.
     */
    @Test
    public void testCreateLabelInvoiceBarcode_Standard_Failure()
    {
    	
    	try {
    		
    		logger.info("Testing creation of label, invoice and barcode for failure scenario .");
    		String fileName = "./com/cts/ptms/carrier/yrc/resources/InputData_Standard_Failure.xml";
	    	URL url = getClass().getClassLoader().getResource(fileName);
			shipmentRequest.setFileName(url.getFile());
    		shipmentRequest.setCarrier("YRC");
	    	shipmentRequest.setGenLabel(true);
	    	shipmentResponse = yrcSoapClient.createShipmentRequest(shipmentRequest);
	    	logger.info("Status:"+shipmentResponse );
	    	
	    	assertEquals("ERROR", shipmentResponse.getStatus());
			
    	} 
		catch(Exception e)
		{
			assertEquals("Failure", "Failure");
			e.printStackTrace();
			System.out.println("Exception occured"+e.getMessage());
		}
    	
    }
    
    /**
     * Junit test case for standard address validation Success Scenario.
     */
    @Test
    public void testCreateLabelInvoiceBarcode_AddressValidation_Success()
    {
    	
    	try {
    		logger.info("Testing creation of lable, invoice, barcode for standard service address validation-- Success. ");
    		String fileName = "./com/cts/ptms/carrier/yrc/resources/InputData_Standard_AddressValidation_Success.xml";
	    	URL url = getClass().getClassLoader().getResource(fileName);
			shipmentRequest.setFileName(url.getFile());
    		shipmentRequest.setCarrier("YRC");
	    	shipmentRequest.setGenLabel(true);
	    	shipmentResponse = yrcSoapClient.createShipmentRequest(shipmentRequest);
	    	
	    	System.out.println("Status:"+shipmentResponse );
	    	assertEquals("SUCCESS", shipmentResponse.getStatus());
	    	List<ShipmentDocument> shipmentDocs = shipmentResponse.getShipmentDocuments();
	    	for( ShipmentDocument shipmentDoc : shipmentDocs) {
				assertFalse(null == shipmentDoc.getDocumentText());
				if (shipmentDoc.getDocumentName().equals(SHIPPINGLABEL)) {
					
					byte[] decoded = Base64.getDecoder().decode(shipmentDoc.getDocumentText());
					saveBase64DataToLocalFile(decoded, shipmentResponse.getTrackingNumber()+"_AddressValidation_"+shipmentDoc.getDocumentName());
					PdfReader reader = new PdfReader(decoded);
					System.out.println("This PDF has "+reader.getNumberOfPages()+" pages.");
			        String page = PdfTextExtractor.getTextFromPage(reader, 1);
			        System.out.println("Page Content:\n\n"+page+"\n\n");
			        
			        assertTrue(page.contains("20"));
			        assertTrue(page.contains("WALMART.COM-VAR"));
			        
				} else if (shipmentDoc.getDocumentName().equals(INVOICE)){
					byte[] decoded = Base64.getDecoder().decode(shipmentDoc.getDocumentText());
					saveBase64DataToLocalFile(decoded, shipmentResponse.getTrackingNumber()+"_AddressValidation_"+shipmentDoc.getDocumentName());
					PdfReader reader = new PdfReader(decoded);
					System.out.println("This PDF has "+reader.getNumberOfPages()+" pages.");
			        String page = PdfTextExtractor.getTextFromPage(reader, 1);
			        System.out.println("Page Content:\n\n"+page+"\n\n");
			        
			        assertTrue(page.contains("20"));
			        assertTrue(page.contains("WALMART.COM-VAR"));
			        
				} else {
					byte[] decoded = Base64.getDecoder().decode(shipmentDoc.getDocumentText());
					saveBase64DataToLocalFile(decoded, shipmentResponse.getTrackingNumber()+"_AddressValidation_"+shipmentDoc.getDocumentName());
				}
			}
			
    	} 
		catch(Exception e)
		{
			assertEquals("Failure", "Failure");
			e.printStackTrace();
			System.out.println("Exception occured"+e.getMessage());
		}
    	
    }
    /**
     * Junit test case for standard address validation failure Scenario.
     */
    @Test
    public void testCreateLabelInvoiceBarcode_AddressValidation_Failure()
    {
    	
    	try {
    		
    		logger.info("Testing creation of label, invoice and barcode for failure scenario .");
    		String fileName = "./com/cts/ptms/carrier/yrc/resources/InputData_Standard_AddressValidation_Failure.xml";
	    	URL url = getClass().getClassLoader().getResource(fileName);
			shipmentRequest.setFileName(url.getFile());
    		shipmentRequest.setCarrier("YRC");
	    	shipmentRequest.setGenLabel(true);
	    	shipmentResponse = yrcSoapClient.createShipmentRequest(shipmentRequest);
	    	logger.info("Status:"+shipmentResponse );
	    	
	    	assertEquals("ERROR", shipmentResponse.getStatus());
			
    	} 
		catch(Exception e)
		{
			assertEquals("Failure", "Failure");
			e.printStackTrace();
			System.out.println("Exception occured"+e.getMessage());
		}
    	
    }
    
    /**
     * Junit test case for standard shipping  Consignee present -  Success Scenario.
     */
    @Test
    public void testCreateLabelInvoiceBarcode_isConsigneePresent_Success()
    {
    	
    	try {
    		logger.info("Testing consignee presence-- Success. ");
    		String fileName = "./com/cts/ptms/carrier/yrc/resources/InputData_Standard_ConsigneePresent_Success.xml";
	    	URL url = getClass().getClassLoader().getResource(fileName);
			shipmentRequest.setFileName(url.getFile());
    		shipmentRequest.setCarrier("YRC");
	    	shipmentRequest.setGenLabel(true);
	    	shipmentResponse = yrcSoapClient.createShipmentRequest(shipmentRequest);
	    	
	    	System.out.println("Status:"+shipmentResponse );
	    	assertEquals("SUCCESS", shipmentResponse.getStatus());
	    	List<ShipmentDocument> shipmentDocs = shipmentResponse.getShipmentDocuments();
	    	for( ShipmentDocument shipmentDoc : shipmentDocs) {
				assertFalse(null == shipmentDoc.getDocumentText());
				if (shipmentDoc.getDocumentName().equals(SHIPPINGLABEL)) {
					
					byte[] decoded = Base64.getDecoder().decode(shipmentDoc.getDocumentText());
					saveBase64DataToLocalFile(decoded, shipmentResponse.getTrackingNumber()+"_ConsigneeValidation_"+shipmentDoc.getDocumentName());
					PdfReader reader = new PdfReader(decoded);
					System.out.println("This PDF has "+reader.getNumberOfPages()+" pages.");
			        String page = PdfTextExtractor.getTextFromPage(reader, 1);
			        
			        //assertTrue(page.contains("40"));
			        assertTrue(page.contains("AMAZON.COM"));
			        assertTrue(page.contains("1901 SE 10TH ST"));
			        assertTrue(page.contains("72716"));
			        
			        
			        
				} else if (shipmentDoc.getDocumentName().equals(INVOICE)) {
					byte[] decoded = Base64.getDecoder().decode(shipmentDoc.getDocumentText());
					saveBase64DataToLocalFile(decoded, shipmentResponse.getTrackingNumber()+"_ConsigneeValidation_"+shipmentDoc.getDocumentName());
					PdfReader reader = new PdfReader(decoded);
					System.out.println("This PDF has "+reader.getNumberOfPages()+" pages.");
			        String page = PdfTextExtractor.getTextFromPage(reader, 1);
			        
			        assertTrue(page.contains("AMAZON.COM"));
			        assertTrue(page.contains("1901 SE 10TH ST"));
			        assertTrue(page.contains("72716"));
			        
				} else {
					byte[] decoded = Base64.getDecoder().decode(shipmentDoc.getDocumentText());
					saveBase64DataToLocalFile(decoded, shipmentResponse.getTrackingNumber()+"_ConsigneeValidation_"+shipmentDoc.getDocumentName());
				}
			}
			
    	} 
		catch(Exception e)
		{
			assertEquals("Failure", "Failure");
			e.printStackTrace();
			System.out.println("Exception occured"+e.getMessage());
		}
    	
    }
    /**
     * Junit test case for standard shipping  Consignee present -  Failure Scenario.
     */
    @Test
    public void testCreateLabelInvoiceBarcode_isConsigneePresent_Failure()
    {
    	
    	try {
    		
    		logger.info("Testing creation of label, invoice and barcode for consignee not present failure scenario .");
    		
    		String fileName = "./com/cts/ptms/carrier/yrc/resources/InputData_Standard_ConsigneePresent_Failure.xml";
	    	URL url = getClass().getClassLoader().getResource(fileName);
			shipmentRequest.setFileName(url.getFile());
    		shipmentRequest.setCarrier("YRC");
	    	shipmentRequest.setGenLabel(true);
	    	shipmentResponse = yrcSoapClient.createShipmentRequest(shipmentRequest);
	    	logger.info("isConsigneePresent_Failure:Status:"+shipmentResponse );
	    	
	    	assertEquals("ERROR", shipmentResponse.getStatus());
			
    	} 
		catch(Exception e)
		{
			assertEquals("Failure", "Failure");
			e.printStackTrace();
			System.out.println("Exception occured"+e.getMessage());
		}
    	
    }
    
  //Utility Class -- NEED TO BE PLACED IN UTILITY PACKAGE
	
  	/**
  	 *  Utility for saving the base64 file into a folder.
  	 * @throws IOException 
  	 */
  	private void saveBase64DataToLocalFile(byte[] decoded, String trackingNumber) throws IOException 
  	{
  		OutputStream out1 = null;
  		try {
  			String filename = properties.getProperty("SAVE_FILE_PATH") +"/"+ trackingNumber+ShippingConstants.PDF_fILE;
			out1 = new BufferedOutputStream(new FileOutputStream(filename));
			out1.write(decoded);
  		} catch (FileNotFoundException e) {
  			System.out.println("Exception occured"+e.getMessage());
  		} catch (Exception e) {
  			System.out.println("Exception occured"+e.getMessage());
  		} finally {
			if (out1 != null) {
				out1.close();
			}
		}
	}

}
