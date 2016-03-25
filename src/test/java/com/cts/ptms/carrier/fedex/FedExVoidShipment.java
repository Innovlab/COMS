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

import com.cts.ptms.core.ShipmentServiceImpl;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.ShipmentRequest;

/**
 * @author 417765
 *
 */
public class FedExVoidShipment {

	private Logger logger = Logger.getAnonymousLogger() ;
	private ShipmentRequest shipmentRequest;
	private ShipmentOrder shipmentResponse;
	private ShipmentServiceImpl serviceImpl;	
	
	@Before
    public void setUp() throws JSONException, IOException {
		
		logger.info("Setting up all required data for each test case method.");
		shipmentRequest = new ShipmentRequest();
		shipmentRequest.setCarrier("FEDEX");
    	shipmentResponse = new ShipmentOrder();
    	serviceImpl = new ShipmentServiceImpl();
       
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
	public void testVoidShipmentRequest()
	{
		logger.info("Testing CreateShipmentRequest for fedex 2nd day with return label success scenario...");
		try 
		{
			shipmentRequest.setTrackingNumToCancel("794683545266");
			shipmentResponse = serviceImpl.cancelShipmentOrder(shipmentRequest);
			
			assertEquals("SUCCESS", shipmentResponse.getStatus());
			System.out.println("Status:"+shipmentResponse.getStatus() );
			
		} 
		catch(Exception e)
		{
			logger.severe("Exception occured at testCreateShipmentRequest_InvalidServiceCode::"+e);
			assertFalse(false);
		}
		
	}

}
