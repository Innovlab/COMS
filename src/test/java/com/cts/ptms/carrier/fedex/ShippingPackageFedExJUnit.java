/**
 * 
 */
package com.cts.ptms.carrier.fedex;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.util.logging.Logger;

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
public class ShippingPackageFedExJUnit {

	private Logger logger = Logger.getAnonymousLogger(); 
	private ShipmentRequest shipmentRequest;
	private ShipmentOrder shipmentResponse;
	private String pathToGet;
	private String pathToSave;
	private ShipmentServiceImpl serviceImpl;
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
    	serviceImpl = new ShipmentServiceImpl();
    	shipmentRequest.setCarrier("FEDEX"); 
    	pathToGet = ShippingConstants.FEDEX_INPUT_DIR;
    	pathToSave = ShippingConstants.FEDEX_OUTPUT_DIR;
    }
    @After
    public void tearDown() 
    {
    	logger.info("nullifying up all required data for each test case method.");
    	shipmentRequest = null;
    	shipmentResponse = null;
    	pathToGet = null;
    	pathToSave = null;
    	serviceImpl = null;
    }
    /**
     * FedEx 2 day success test case
     */
	@Test
	public void testCreateShipmentRequest_FedEx_2day_Success()
	{
		logger.info("Testing CreateShipmentRequest for fedex 2nd day success scenario...");
		try 
		{
			
			shipmentRequest.setFileName(pathToGet+"InputData_FedEx_2day_Success.xml");
			shipmentResponse = serviceImpl.createSingleShipmentOrder(shipmentRequest);
			
			assertEquals("SUCCESS", shipmentResponse.getStatus());
			System.out.println("Status:"+shipmentResponse.getStatus() );
			
			assertFalse(shipmentResponse == null);
			assertFalse(shipmentResponse.getShipmentDocuments().size() == 0);
			ShipmentDocument shipmentDoc = shipmentResponse.getShipmentDocuments().get(0);
			assertFalse(shipmentDoc.getDocumentTitle() != ShippingConstants.SHIPPING_LABEL_DOC);
			assertFalse(null == shipmentDoc.getByteArray());
			
			ShipmentCommonUtilities.saveBase64DataToLocalFile(shipmentDoc.getByteArray(), shipmentResponse.getTrackingNumber()+"_2ndDay", 
					pathToSave, shipmentDoc.getDocumentType());
			
		} 
		catch(Exception e)
		{
			logger.severe("Exception occured at testCreateShipmentRequest_InvalidServiceCode::"+e);
			assertFalse(false);
		}
		
	}
	
	/**
	 * FedEx 2 day failure test case scenario
	 */
	@Test
	public void testCreateShipmentRequest_FedEx_2day_Failure()
	{
		logger.info("Testing CreateShipmentRequest for Invalid ServiceCode...");
		try 
		{
			shipmentRequest.setFileName(pathToGet+"InputData_FedEx_2day_Failure.xml");
			shipmentResponse = serviceImpl.createSingleShipmentOrder(shipmentRequest);
			
			assertEquals("ERROR", shipmentResponse.getStatus());
			
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
	@Test
	public void testShipmentTracking_FedExGround_Success()
	{
		logger.info("testShipmentTracking_FedExGround_Success== >");
		try 
		{
			shipmentRequest.setFileName(pathToGet+"InputData_FedExGround_Success.xml");
			shipmentResponse = serviceImpl.createSingleShipmentOrder(shipmentRequest);
			
			assertEquals("SUCCESS", shipmentResponse.getStatus());
			System.out.println("Status:"+shipmentResponse.getStatus() );
			
			assertFalse(shipmentResponse == null);
			assertFalse(shipmentResponse.getShipmentDocuments().size() == 0);
			ShipmentDocument shipmentDoc = shipmentResponse.getShipmentDocuments().get(0);
			assertFalse(shipmentDoc.getDocumentTitle() != ShippingConstants.SHIPPING_LABEL_DOC);
			assertFalse(null == shipmentDoc.getByteArray());
			
			ShipmentCommonUtilities.saveBase64DataToLocalFile(shipmentDoc.getByteArray(), shipmentResponse.getTrackingNumber()+"_Ground", pathToSave, 
					shipmentDoc.getDocumentType());
		} 
		catch(Exception e)
		{
			System.out.println("Exception occured at testShipmentTracking_FedExGround_Success ::"+e.getMessage());
			assertFalse(false);
		}
		logger.info("testShipmentTracking_Ground_Success:: <==");
		
	}
	
	/**
	 * Junit method for testing the shipment tracking for fedex ground failure scenario.
	 */
	@Test
	public void testShipmentTracking_FedExGround_Failure()
	{
		logger.info("testShipmentTracking_FedExGround_Failure== >");
		try 
		{
			shipmentRequest.setFileName(pathToGet+"InputData_FedExGround_Failure.xml");
			shipmentResponse = serviceImpl.createSingleShipmentOrder(shipmentRequest);
			assertEquals("ERROR", shipmentResponse.getStatus());
			
		} 
		catch(Exception e)
		{
			System.out.println("Exception occured at testShipmentTracking_FedExGround_Failure ::"+e.getMessage());
			assertFalse(false);
		}
		logger.info("testShipmentTracking_FedExGround_Failure:: <==");
		
	}
	/**
     * FedEx invalid service code 
     */
	@Test
	public void testCreateShipmentRequest_FedEx_Invalid_ServiceCode()
	{
		logger.info("Start:: Testing CreateShipmentRequest for fedex Invalid ServiceCode scenario...==>");
		try 
		{
			shipmentRequest.setFileName(pathToGet+"InputData_FedEx_InvalidServiceCode.xml");
			shipmentResponse = serviceImpl.createSingleShipmentOrder(shipmentRequest);
			assertEquals("ERROR", shipmentResponse.getStatus());
			
		} 
		catch(Exception e)
		{
			logger.severe("Exception occured at testCreateShipmentRequest_InvalidServiceCode::"+e);
			assertFalse(false);
		}
		logger.info("End:: Testing CreateShipmentRequest for fedex Invalid ServiceCode scenario...<==");
		
	}
	/**
     * FedEx invalid weight 
     */
	@Test
	public void testCreateShipmentRequest_FedEx_Invalid_Weight()
	{
		logger.info("Start:: Testing testCreateShipmentRequest_FedEx_Invalid_Weight()...==>");
		try 
		{
			shipmentRequest.setFileName(pathToGet+"InputData_FedEx_InvalidWeight.xml");
			shipmentResponse = serviceImpl.createSingleShipmentOrder(shipmentRequest);
			assertEquals("ERROR", shipmentResponse.getStatus());
			
		} 
		catch(Exception e)
		{
			logger.severe("Exception occured at testCreateShipmentRequest_FedEx_Invalid_Weight()::"+e);
			assertFalse(false);
		}
		logger.info("End:: Testing testCreateShipmentRequest_FedEx_Invalid_Weight()...<==");
		
	}

}
