/**
 * 
 */
package com.cts.ptms.service.tracking;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.ptms.dao.ShipmentServiceDAO;
import com.cts.ptms.exception.tracking.TrackingException;
import com.cts.ptms.model.tracking.CustomTrackingRequest;
import com.cts.ptms.model.tracking.CustomTrackingResponse;
import com.cts.ptms.model.tracking.TrackRequestDetails;
import com.cts.ptms.tracking.TrackingCarrierProducer;

/**
 * Tracking service implementation class
 * @author 417765
 *
 */
public class TrackingServiceImpl implements ITrackingService {

	/**
	 * Default Constructor
	 */
	public TrackingServiceImpl() 
	{
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.cts.ptms.service.tracking.ITrackingService#getShipmentTrackingDetails(java.lang.String)
	 */
	@Override
	public CustomTrackingResponse getShipmentTrackingDetails(CustomTrackingRequest customTrackingRequest) throws TrackingException
	{

		
		// Get the carrier name by tracking Number from DAO
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ShipmentServiceDAO shipmentServiceDAO = (ShipmentServiceDAO) context.getBean("shipmentServiceDao");
		String carrierName = shipmentServiceDAO.getCarrierName(customTrackingRequest.getTrackRequestDetails().getTrackingNumber());
		System.out.println(carrierName);
		context.close();
		if (carrierName!=null && !carrierName.trim().equals("")) {
			customTrackingRequest.setCarrierName(carrierName);
		}
		return new TrackingCarrierProducer().getTrackingCarrier(customTrackingRequest.getCarrierName()).
				getTrackingDetails(customTrackingRequest);
	}

	
	public static void main (String[] args) {
		TrackingServiceImpl  trackingServiceImpl =  new TrackingServiceImpl(); 
		CustomTrackingRequest customTrackingRequest = new  CustomTrackingRequest();
		TrackRequestDetails trackRequestDetails  =  new TrackRequestDetails();
		trackRequestDetails.setTrackingNumber("499-392775-2");
		customTrackingRequest.setTrackRequestDetails(trackRequestDetails);
		trackingServiceImpl.getShipmentTrackingDetails(customTrackingRequest);
	}
	
	
	

}
