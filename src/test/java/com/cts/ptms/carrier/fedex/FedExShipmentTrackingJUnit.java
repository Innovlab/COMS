/**
 * 
 */
package com.cts.ptms.carrier.fedex;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.logging.Logger;

import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cts.ptms.core.ManageTrackingResource;
import com.cts.ptms.model.gls.AccessRequest;
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

	private AccessRequest accessRequest;
	private CustomTrackingResponse customTrackingResponse = null;
	private CustomTrackingRequest customTrackingRequest = null;
	private ManageTrackingResource manageTrackingResource = null;
	private TrackRequestDetails trackRequestDetails = null;
	private String SUCCESS = "Success";
	private String FAILURE = "Failure";
	
	//Services 
	private String GROUND = "GROUND";
	private String SECONDDAYAIR = "2ND DAY AIR";
	
	//Response Delivery Status
	private String DELIVERED = "DELIVERED";
	private String ORIGIN_SCAN = "ORIGIN SCAN";
	private String INVALID_TRACKING_NUMBER = "Invalid Tracking Number";
	private String NO_INFORMATION_AVIALABLE = "No Tracking Information Available";
	
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
    	accessRequest = null;
    	customTrackingRequest = null;
    	manageTrackingResource = null;
    	trackRequestDetails = null;
    }
    
    /**
	 * Junit method for testing the shipment tracking for ground success scenario.
	 */
	@Test
	public void testShipmentTracking_FedExGround_Success()
	{
		logger.info("Testing Shipment Tracking for Ground Delivered...");
		String trackingNum = "1Z12345E0390515214";
		
		try
		{
			//0- Last Activity 1-All Activity
			trackRequestDetails.getRequestOptions().add("0");
			trackRequestDetails.setTrackingNumber(trackingNum);
			customTrackingRequest.setTrackRequestDetails(trackRequestDetails);
			
			System.out.println("Input tracking request is ::" + customTrackingRequest);
			customTrackingResponse = manageTrackingResource.getTrackingDetails(customTrackingRequest);
			
			assertEquals(SUCCESS, customTrackingResponse.getResponseStatusDescription());
			assertEquals(GROUND, customTrackingResponse.getShipment().get(0).getService().getDescription());
			assertEquals(DELIVERED, customTrackingResponse.getShipment().get(0).get_package().
					get(0).getActivity().get(0).getStatus().getStatusType().getDescription());
			
		} 
		catch (Exception e)
		{
			System.out.println("Exception occured while tracking.."+e.getMessage());
			logger.severe("Exception occured while tracking..");
			assertEquals(FAILURE, FAILURE);
		}
	}
}
