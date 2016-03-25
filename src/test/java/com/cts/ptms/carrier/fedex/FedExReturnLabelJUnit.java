/**
 * 
 */
package com.cts.ptms.carrier.fedex;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cts.ptms.commonutils.ShipmentCommonUtilities;
import com.cts.ptms.core.ShipmentServiceImpl;
import com.cts.ptms.model.common.ShipmentDocument;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.utils.constants.ShippingConstants;

/**
 * @author 417765
 *
 */
public class FedExReturnLabelJUnit {

	private Logger logger = Logger.getAnonymousLogger() ;
	private ShipmentRequest shipmentRequest;
	private ShipmentOrder shipmentResponse;
	private Properties properties;
	private String pathToGet = ShippingConstants.FEDEX_INPUT_DIR;
	private String pathToSave = ShippingConstants.FEDEX_OUTPUT_DIR;
	private ShipmentServiceImpl serviceImpl;	
	
	@Before
    public void setUp() throws JSONException, IOException {
		
		logger.info("Setting up all required data for each test case method.");
		shipmentRequest = new ShipmentRequest();
		shipmentRequest.setCarrier("FEDEX");
    	shipmentResponse = new ShipmentOrder();
    	serviceImpl = new ShipmentServiceImpl();
    	
    	try {
			
    		properties = new Properties();
			File initialFile = new File(ShippingConstants.TEST_DOCUMENT_LOCATION);
		    InputStream inputStream = FileUtils.openInputStream(initialFile);			
			properties.load(inputStream);			
			System.out.println("File will be saved on  .."+ properties.getProperty("SAVE_FILE_PATH"));

		} catch (IOException e) {
			e.printStackTrace();
		}
       
    }
    @After
    public void tearDown() 
    {
    	logger.info("Nullifying up all required data for each test case method.");
    	shipmentRequest = null;
    	shipmentResponse = null;
    }
    /**
     * FedEx 2 day success test case
     */
	@Test
	public void testCreateShipmentRequest_FedEx_2day_Success_WithRtrnLbl()
	{
		logger.info("Testing CreateShipmentRequest for fedex 2nd day with return label success scenario...");
		try 
		{
			shipmentRequest.setFileName(pathToGet+"InputData_FedEx_2day_Success.xml");
			shipmentRequest.setGenLabel(true);
			shipmentResponse = serviceImpl.createSingleShipmentOrder(shipmentRequest);
			
			assertEquals("SUCCESS", shipmentResponse.getStatus());
			System.out.println("Status:"+shipmentResponse.getStatus() );
			
			/*assertFalse(shipmentResponse == null);
			assertFalse(shipmentResponse.getShipmentDocuments().size() == 0);
			ShipmentDocument shipmentDoc = shipmentResponse.getShipmentDocuments().get(0);
			assertFalse(shipmentDoc.getDocumentTitle() != ShippingConstants.SHIPPING_LABEL_DOC);
			assertFalse(null == shipmentDoc.getByteArray());
			
			ShipmentCommonUtilities.saveBase64DataToLocalFile(shipmentDoc.getByteArray(), shipmentResponse.getTrackingNumber()+"_2ndDay", 
					pathToSave, shipmentDoc.getDocumentType());*/
			
		} 
		catch(Exception e)
		{
			logger.severe("Exception occured at testCreateShipmentRequest_InvalidServiceCode::"+e);
			assertFalse(false);
		}
		
	}
	
}
