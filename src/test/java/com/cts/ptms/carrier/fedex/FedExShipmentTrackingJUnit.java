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

import com.cts.ptms.core.ManageTrackingResource;
import com.cts.ptms.model.tracking.CustomTrackingRequest;
import com.cts.ptms.model.tracking.CustomTrackingResponse;
import com.cts.ptms.model.tracking.TrackRequestDetails;

/**
 * @author 417765
 *
 */
public class FedExShipmentTrackingJUnit {

	private Logger logger = Logger.getAnonymousLogger();
	/**
	 * 
	 */
	public FedExShipmentTrackingJUnit() {
		// TODO Auto-generated constructor stub
	}

	private CustomTrackingResponse customTrackingResponse = null;
	private CustomTrackingRequest customTrackingRequest = null;
	private ManageTrackingResource manageTrackingResource = null;
	private TrackRequestDetails trackRequestDetails = null;
	
	
	@Before
    public void setUp() throws JSONException, IOException {
		
		logger.info("Setting up all required data for each test case method.");
		
		customTrackingRequest = new CustomTrackingRequest();
		customTrackingRequest.setAccessRequest(null);
		
		trackRequestDetails = new TrackRequestDetails();
		trackRequestDetails.setRequestAction("Track");
		
		customTrackingRequest.setCarrierName("FEDEX");
		manageTrackingResource = new ManageTrackingResource();
		
    }
    @After
    public void tearDown() 
    {
    	logger.info("nullifying up all required data for each test case method.");
    	customTrackingRequest = null;
    	manageTrackingResource = null;
    	trackRequestDetails = null;
    }
    
    /**
	 * Junit method for testing LocalFedExFacility status tracking.
	 */
	@Test
	public void testShipmentTracking_LocalFedExFacility_Success()
	{
		logger.info("Testing Shipment Tracking for Ground Delivered...");
		String trackingNum = "920241085725456";
		
		try
		{
			trackRequestDetails.setTrackingNumber(trackingNum);
			customTrackingRequest.setTrackRequestDetails(trackRequestDetails);
			
			System.out.println("Input tracking request is ::" + customTrackingRequest);
			customTrackingResponse = manageTrackingResource.getTrackingDetails(customTrackingRequest);
			
			assertEquals("Request was successfully processed.", customTrackingResponse.getResponseStatusDescription());
			assertEquals("FedEx Home Delivery", customTrackingResponse.getShipment().get(0).getService().getDescription());
			assertEquals("At local FedEx facility", customTrackingResponse.getShipment().get(0).get_package().
					get(0).getActivity().get(0).getStatus().getStatusType().getDescription());
			
		} 
		catch (Exception e)
		{
			System.out.println("Exception occured while tracking.."+e.getMessage());
			logger.severe("Exception occured while tracking..");
			assertFalse(false);
		}
	}
	
	 /**
	 * Junit method for Shipment Canceled.
	 */
	@Test
	public void testShipmentTracking_Shipment_Canceled_Success()
	{
		logger.info("Testing Shipment Tracking for Shipment_Canceled...");
		String trackingNum = "070358180009382";
		
		try
		{
			//0- Last Activity 1-All Activity
			trackRequestDetails.setTrackingNumber(trackingNum);
			customTrackingRequest.setTrackRequestDetails(trackRequestDetails);
			
			System.out.println("Input tracking request is ::" + customTrackingRequest);
			customTrackingResponse = manageTrackingResource.getTrackingDetails(customTrackingRequest);
			
			assertEquals("Request was successfully processed.", customTrackingResponse.getResponseStatusDescription());
			assertEquals("FedEx Home Delivery", customTrackingResponse.getShipment().get(0).getService().getDescription());
			assertEquals("Shipment cancelled by sender", customTrackingResponse.getShipment().get(0).get_package().
					get(0).getActivity().get(0).getStatus().getStatusType().getDescription());
			
		} 
		catch (Exception e)
		{
			System.out.println("Exception occured while tracking.."+e.getMessage());
			logger.severe("Exception occured while tracking..");
			assertFalse(false);
		}
	}
	
	/**
	 * Junit method for Shipment Delivered.
	 */
	@Test
	public void testShipmentTracking_Shipment_Delivered_Success()
	{
		logger.info("Testing Shipment Tracking for Shipment_Delivered...");
		String trackingNum = "122816215025810";
		
		try
		{
			//0- Last Activity 1-All Activity
			trackRequestDetails.setTrackingNumber(trackingNum);
			customTrackingRequest.setTrackRequestDetails(trackRequestDetails);
			
			System.out.println("Input tracking request is ::" + customTrackingRequest);
			customTrackingResponse = manageTrackingResource.getTrackingDetails(customTrackingRequest);
			
			assertEquals("Request was successfully processed.", customTrackingResponse.getResponseStatusDescription());
			assertEquals("FedEx Ground", customTrackingResponse.getShipment().get(0).getService().getDescription());
			assertEquals("Delivered", customTrackingResponse.getShipment().get(0).get_package().
					get(0).getActivity().get(0).getStatus().getStatusType().getDescription());
			
		} 
		catch (Exception e)
		{
			System.out.println("Exception occured while tracking.."+e.getMessage());
			logger.severe("Exception occured while tracking..");
			assertFalse(false);
		}
	}
    /**
     *  Unable to Deliver
     */
    @Test
	public void testShipmentTracking_Shipment_UnableTo_Deliver_Success()
	{
		logger.info("Testing Shipment Tracking for Shipment_Delivered...");
		String trackingNum = "957794015041323";
		
		try
		{
			//0- Last Activity 1-All Activity
			trackRequestDetails.setTrackingNumber(trackingNum);
			customTrackingRequest.setTrackRequestDetails(trackRequestDetails);
			
			System.out.println("Input tracking request is ::" + customTrackingRequest);
			customTrackingResponse = manageTrackingResource.getTrackingDetails(customTrackingRequest);
			
			assertEquals("Request was successfully processed.", customTrackingResponse.getResponseStatusDescription());
			assertEquals("FedEx Home Delivery", customTrackingResponse.getShipment().get(0).getService().getDescription());
			assertEquals("Shipment exception", customTrackingResponse.getShipment().get(0).get_package().
					get(0).getActivity().get(0).getStatus().getStatusType().getDescription());
			
		} 
		catch (Exception e)
		{
			System.out.println("Exception occured while tracking.."+e.getMessage());
			logger.severe("Exception occured while tracking..");
			assertFalse(false);
		}
	}
}
