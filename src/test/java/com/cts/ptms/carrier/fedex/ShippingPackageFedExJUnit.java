/**
 * 
 */
package com.cts.ptms.carrier.fedex;

import java.io.IOException;
import java.util.logging.Logger;

import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 417765
 *
 */
public class ShippingPackageFedExJUnit {

	private Logger logger = Logger.getAnonymousLogger(); 
	/**
	 * 
	 */
	public ShippingPackageFedExJUnit() {
		// TODO Auto-generated constructor stub
	}
	
	@Before
    public void setUp() throws JSONException, IOException {
		
		logger.info("Setting up all required data for each test case method.");
		
    }
	
    @After
    public void tearDown() 
    {
    	logger.info("nullifying up all required data for each test case method.");
    	
    }
    
	/**
	 * Junit method for testing the shipment tracking for ground success scenario.
	 */
	@Test
	public void testShipmentTracking_Ground_Success()
	{
		logger.info("testShipmentTracking_Ground_Success.");
		try 
		{
			
		} catch (Exception e) {
			
		}
		
		logger.info("testShipmentTracking_Ground_Success.");
		
	}

}
