/**
 * 
 */
package com.cts.ptms.carrier.fedex;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Logger;

import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cts.ptms.commonutils.ShipmentCommonUtilities;
import com.cts.ptms.model.common.ShipmentDocument;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.utils.constants.ShippingConstants;

/**
 * @author 417765
 *
 */
public class ShippingPackageFedExJUnit {

	private Logger logger = Logger.getAnonymousLogger(); 
	private ShipmentRequest shipmentRequest;
	private ShipmentOrder shipmentResponse;
	private FedExSoapClient fedExSoapClient ;
	private String filePath;
	private String pathToSave;
	private Properties properties; 
	/**
	 * 
	 */
	public ShippingPackageFedExJUnit() {
		// TODO Auto-generated constructor stub
	}
	
	@Before
    public void setUp() throws JSONException, IOException {
		
		logger.info("Setting up all required data for each test case method.");
		shipmentRequest = new ShipmentRequest();
    	shipmentResponse = new ShipmentOrder();
    	fedExSoapClient = new FedExSoapClient();
    	shipmentRequest.setCarrier("FEDEX"); 
    	
    	try {
    		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("./documents_location.properties");
			properties = new Properties();
			properties.load(inputStream);
			System.out.println("File will be saved on  .."+ properties.getProperty("SAVE_FILE_PATH"));
			pathToSave = properties.getProperty("SAVE_FILE_PATH");
		} catch (IOException e) {
			e.printStackTrace();
		}
       
    }
    @After
    public void tearDown() 
    {
    	logger.info("nullifying up all required data for each test case method.");
    	shipmentRequest = null;
    	shipmentResponse = null;
    	fedExSoapClient = null;
    	filePath = null;
    	pathToSave = null;
    }
    /**
     * 
     */
	@Test
	public void testCreateShipmentRequest_FedEx_2day_Success()
	{
		logger.info("Testing CreateShipmentRequest for Invalid ServiceCode...");
		try 
		{
			filePath = "./com/cts/ptms/carrier/fedex/resources/InputData_FedEx_2day_Success.xml";
			
			URL url = getClass().getClassLoader().getResource(filePath);
			shipmentRequest.setFileName(url.getFile());
			shipmentResponse = fedExSoapClient.createShipmentRequest(shipmentRequest);
			
			//System.out.println(shipmentResponse.getErrorDescription());
			assertEquals("SUCCESS", shipmentResponse.getStatus());
			System.out.println("Status:"+shipmentResponse.getStatus() );
			
			assertFalse(shipmentResponse == null);
			assertFalse(shipmentResponse.getShipmentDocuments().size() == 0);
			ShipmentDocument shipmentDoc = shipmentResponse.getShipmentDocuments().get(0);
			assertFalse(shipmentDoc.getDocumentName() != ShippingConstants.SHIPPING_LABEL_DOC);
			assertFalse(null == shipmentDoc.getDocumentText());
			
			byte[] decoded = shipmentDoc.getDocumentText().getBytes("UTF8");
			ShipmentCommonUtilities.saveBase64DataToLocalFile(decoded, shipmentResponse.getTrackingNumber()+"_2ndDay", pathToSave, 
					shipmentDoc.getDocumentType());
			
		} 
		catch(Exception e)
		{
			logger.severe("Exception occured at testCreateShipmentRequest_InvalidServiceCode::"+e);
			assertFalse(false);
		}
		
	}
	/**
	 * Junit method for testing the shipment tracking for ground success scenario.
	 */
	/*@Test
	public void testShipmentTracking_FedExGround_Success()
	{
		logger.info("testShipmentTracking_FedExGround_Success.");
		try 
		{
			filePath = "./com/cts/ptms/carrier/fedex/resources/InputData_FedExGround_Success.xml";
			
			URL url = getClass().getClassLoader().getResource(filePath);
			shipmentRequest.setFileName(url.getFile());
			shipmentResponse = fedExSoapClient.createShipmentRequest(shipmentRequest);
			
			//System.out.println(shipmentResponse.getErrorDescription());
			assertEquals("SUCCESS", shipmentResponse.getStatus());
			System.out.println("Status:"+shipmentResponse.getStatus() );
			
			assertFalse(shipmentResponse == null);
			assertFalse(shipmentResponse.getShipmentDocuments().size() == 0);
			ShipmentDocument shipmentDoc = shipmentResponse.getShipmentDocuments().get(0);
			assertFalse(shipmentDoc.getDocumentName() != ShippingConstants.SHIPPING_LABEL_DOC);
			assertFalse(null == shipmentDoc.getDocumentText());
			
			byte[] decoded = shipmentDoc.getDocumentText().getBytes("UTF8");
			ShipmentCommonUtilities.saveBase64DataToLocalFile(decoded, shipmentResponse.getTrackingNumber()+"_Ground", pathToSave, 
					shipmentDoc.getDocumentType());
		} 
		catch(Exception e)
		{
			System.out.println("Exception occured"+e.getMessage());
			assertFalse(false);
		}
		logger.info("testShipmentTracking_Ground_Success.");
		
	}*/

}
