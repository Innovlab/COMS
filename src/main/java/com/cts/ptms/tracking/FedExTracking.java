/**
 * 
 */
package com.cts.ptms.tracking;

import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;

import com.cts.ptms.exception.tracking.TrackingException;
import com.cts.ptms.model.fedex.ws.track.v10.Address;
import com.cts.ptms.model.fedex.ws.track.v10.ArrivalLocationType;
import com.cts.ptms.model.fedex.ws.track.v10.CarrierCodeType;
import com.cts.ptms.model.fedex.ws.track.v10.CompletedTrackDetail;
import com.cts.ptms.model.fedex.ws.track.v10.Notification;
import com.cts.ptms.model.fedex.ws.track.v10.NotificationSeverityType;
import com.cts.ptms.model.fedex.ws.track.v10.TrackDetail;
import com.cts.ptms.model.fedex.ws.track.v10.TrackEvent;
import com.cts.ptms.model.fedex.ws.track.v10.TrackIdentifierType;
import com.cts.ptms.model.fedex.ws.track.v10.TrackOtherIdentifierDetail;
import com.cts.ptms.model.fedex.ws.track.v10.TrackPackageIdentifier;
import com.cts.ptms.model.fedex.ws.track.v10.TrackPortType;
import com.cts.ptms.model.fedex.ws.track.v10.TrackReply;
import com.cts.ptms.model.fedex.ws.track.v10.TrackRequest;
import com.cts.ptms.model.fedex.ws.track.v10.TrackRequestProcessingOptionType;
import com.cts.ptms.model.fedex.ws.track.v10.TrackSelectionDetail;
import com.cts.ptms.model.fedex.ws.track.v10.TrackServiceDescriptionDetail;
import com.cts.ptms.model.fedex.ws.track.v10.TrackServiceLocator;
import com.cts.ptms.model.fedex.ws.track.v10.TransactionDetail;
import com.cts.ptms.model.fedex.ws.track.v10.VersionId;
import com.cts.ptms.model.fedex.ws.track.v10.Weight;
import com.cts.ptms.model.tracking.Activity;
import com.cts.ptms.model.tracking.ActivityLocation;
import com.cts.ptms.model.tracking.CodeType;
import com.cts.ptms.model.tracking.CustomTrackingRequest;
import com.cts.ptms.model.tracking.CustomTrackingResponse;
import com.cts.ptms.model.tracking.ShipTo;
import com.cts.ptms.model.tracking.Shipment;
import com.cts.ptms.model.tracking.ShipmentReferenceNumber;
import com.cts.ptms.model.tracking.Shipper;
import com.cts.ptms.model.tracking.Status;
import com.cts.ptms.model.tracking.TrackingError;
import com.cts.ptms.model.tracking.UnitOfMeasurement;
import com.cts.ptms.utils.constants.ShippingConstants;

/**
 * @author 417765
 *
 */
public class FedExTracking implements ITrackingDetails{
	
	private Logger logger = Logger.getAnonymousLogger();
	private Properties properties = new Properties();
	
	/**
	 * Constructor for instantiating required objects.
	 */
	public FedExTracking() {
		try{
			File initialFile = new File(ShippingConstants.FEDEX_PROPERTIES_PATH);
		    InputStream inputStream = FileUtils.openInputStream(initialFile);
			
			properties.load(inputStream);
			
		}catch (Exception e){
			System.out.println("Exception occured while loading the FedEx properties file.");
		}
	
	}

	@Override
	public CustomTrackingResponse getTrackingDetails(CustomTrackingRequest customTrackingRequest)
			throws TrackingException {
		logger.entering("FedExTracking", "getTrackingDetails");
		
		CustomTrackingResponse customTrackingResponse = new CustomTrackingResponse();
		List<TrackingError> trackingErrors = new ArrayList<TrackingError>(0);
		try 
		{
			TrackRequest request = populateAndGetTrackRequest(customTrackingRequest);
			
	        if(request == null)
	        	throw new TrackingException("Exception occured at while populating the tracking request object..");
	        
	        // Initializing the service
			TrackServiceLocator service = new TrackServiceLocator();
			//updateEndPoint(service);
			TrackPortType port = service.getTrackServicePort();

			TrackReply reply = port.track(request); // This is the call to the web service passing in a request object and returning a reply object
			//
			Notification[] notifications = reply.getNotifications();
			
			if (isResponseOk(reply.getHighestSeverity())) // check if the call was successful
			{
				System.out.println("--Track Reply--");
				if (notifications != null && notifications.length != 0 ) {
					System.out.println("Response Status: " + notifications[0].getCode());
					System.out.println("Response Status Description: " + notifications[0].getMessage());
					customTrackingResponse.setResponseStatusCode("1");
					customTrackingResponse.setResponseStatusDescription(notifications[0].getMessage());
					customTrackingResponse = populateResponse(customTrackingResponse, reply.getCompletedTrackDetails());
				}		    	
				else  
			    {	
					for (com.cts.ptms.model.fedex.ws.track.v10.Notification notification : notifications) 
					{
						TrackingError trackingError = new TrackingError();
						trackingError.setErrorSeverity(notification.getSeverity().toString());
						trackingError.setErrorCode(notification.getCode());
						trackingError.setErrorDescription(notification.getMessage());
						trackingErrors.add(trackingError);
					}
					customTrackingResponse.setError(trackingErrors);
					customTrackingResponse.setResponseStatusCode("0");
					customTrackingResponse.setResponseStatusDescription(notifications[0].getMessage());
			    }
			} else {
				customTrackingResponse.setResponseStatusCode("0");
				customTrackingResponse.setResponseStatusDescription(notifications[0].getMessage());
				TrackingError trackingError = new TrackingError();
				trackingError.setErrorSeverity(notifications[0].getSeverity().toString());
				trackingError.setErrorCode("0");
				trackingError.setErrorDescription(notifications[0].getMessage());
				trackingErrors.add(trackingError);
				customTrackingResponse.setError(trackingErrors);
			}
		} 
		catch(Exception ex) 
		{
			logger.severe("Exception occured in getTrackingDetails() method::"+ex.getMessage());
			customTrackingResponse.setResponseStatusCode("0");
			customTrackingResponse.setResponseStatusDescription("Problem in gettting tracking details..");
			TrackingError trackingError = new TrackingError();
			trackingError.setErrorSeverity("FAILURE");
			trackingError.setErrorCode("0");
			trackingError.setErrorDescription("Problem in gettting tracking details..");
			trackingErrors.add(trackingError);
		}
		logger.exiting("FedExTracking", "getTrackingDetails");
		logger.info("Finished tracking details ");
		return customTrackingResponse;
	}
	/**
	 * 
	 * @param customTrackingRequest
	 * @return
	 */
	private TrackRequest populateAndGetTrackRequest(CustomTrackingRequest customTrackingRequest) {
		TrackRequest request = null;
		try 
		{
			request = new TrackRequest();
		    com.cts.ptms.model.fedex.ws.track.v10.ClientDetail clientDetail = 
		    		new com.cts.ptms.model.fedex.ws.track.v10.ClientDetail();
		    
		    clientDetail.setAccountNumber(properties.getProperty("ACCOUNT_NUMBER"));
		    logger.info("ACCOUNT_NUMBER :: "+properties.getProperty("ACCOUNT_NUMBER"));
		    clientDetail.setMeterNumber(properties.getProperty("METER_NUMBER"));
		    logger.info("METER_NUMBER :: "+properties.getProperty("METER_NUMBER"));
		    
		    
	    	//clientDetail.setAccountNumber("510087224");
	    	//clientDetail.setMeterNumber("118706842");
	    	
	    	request.setClientDetail(clientDetail);
	    	com.cts.ptms.model.fedex.ws.track.v10.WebAuthenticationCredential userCredential = 
	    			new com.cts.ptms.model.fedex.ws.track.v10.WebAuthenticationCredential();
	
	    	userCredential.setKey(properties.getProperty("USER_KEY"));
	    	logger.info("USER_KEY :: "+properties.getProperty("USER_KEY"));
			userCredential.setPassword(properties.getProperty("USER_PASSWORD"));
			logger.info("USER_PASSWORD :: "+properties.getProperty("USER_PASSWORD"));
			
			//userCredential.setKey("1GVNZ5PFguLgFkmP");
			//userCredential.setPassword("Q02iNoC2AUFsGpJzyTIsm9obV");
	        request.setWebAuthenticationDetail(new com.cts.ptms.model.fedex.ws.track.v10.WebAuthenticationDetail(null, userCredential));
	        
	        
	        TransactionDetail transactionDetail = new TransactionDetail();
	        transactionDetail.setCustomerTransactionId("java sample - Tracking Request"); //This is a reference field for the customer.  Any value can be used and will be provided in the response.
	        request.setTransactionDetail(transactionDetail);
	        //
	        VersionId versionId = new VersionId("trck", 10, 0, 0);
	        request.setVersion(versionId);
	        //
	        TrackSelectionDetail selectionDetail=new TrackSelectionDetail();
	        TrackPackageIdentifier packageIdentifier=new TrackPackageIdentifier();
	        packageIdentifier.setType(TrackIdentifierType.TRACKING_NUMBER_OR_DOORTAG);
	        packageIdentifier.setValue(customTrackingRequest.getTrackRequestDetails().getTrackingNumber()); // tracking number
	        selectionDetail.setPackageIdentifier(packageIdentifier);
	        request.setSelectionDetails(new TrackSelectionDetail[] {selectionDetail});
	        TrackRequestProcessingOptionType processingOption=TrackRequestProcessingOptionType.INCLUDE_DETAILED_SCANS;
	        request.setProcessingOptions(new TrackRequestProcessingOptionType[]{processingOption});
	        
		} catch (Exception e) {
			logger.severe("Exception occured at while populating the tracking request object.."+e);
			e.printStackTrace();
		}
		return request;
	}
	private static boolean isResponseOk(NotificationSeverityType notificationSeverityType) {
		if (notificationSeverityType == null) {
			return false;
		}
		if (notificationSeverityType.equals(NotificationSeverityType.WARNING) ||
			notificationSeverityType.equals(NotificationSeverityType.NOTE)    ||
			notificationSeverityType.equals(NotificationSeverityType.SUCCESS)) {
			return true;
		}
 		return false;
	}
	/**
	 * Populate the custom tracking response
	 * @param customTrackingResponse
	 * @return CustomTrackingResponse
	 */
	private CustomTrackingResponse populateResponse(CustomTrackingResponse customTrckRes , CompletedTrackDetail[] ctd) 
	{
		String errorMsg = null;
		try 
		{
			for (int i=0; i< ctd.length; i++) { // package detail information
				//customTrckRes.setShipment(shipment);
				TrackDetail[] trackDetails = ctd[i].getTrackDetails();
				List<Shipment> shipments = new ArrayList<Shipment>(0);
				
				for (TrackDetail trackDetail: trackDetails ) 
				{
					List<TrackingError> trackingErrors = new ArrayList<TrackingError>(0);
					Notification notification = trackDetail.getNotification();
					if(notification.getSeverity().getValue().equals("FAILURE")) 
					{
						TrackingError trackingError = new TrackingError();
						trackingError.setErrorSeverity(notification.getSeverity().toString());
						trackingError.setErrorCode(notification.getCode());
						trackingError.setErrorDescription(notification.getMessage());
						trackingErrors.add(trackingError);
						customTrckRes.setError(trackingErrors);
						errorMsg = notification.getMessage();
						throw new TrackingException(errorMsg);
					}
					
					Shipment shipment = populateShipmentDetails(customTrckRes, trackDetail);
					shipments.add(shipment);
				}
				customTrckRes.setShipment(shipments);
				System.out.println("--Completed Tracking Detail--");
			}
			
		}
		catch (TrackingException e)
		{
			customTrckRes.setResponseStatusCode("0");
			customTrckRes.setResponseStatusDescription(errorMsg);
			
			System.out.println("Exception occured in populateResponse(customTrckRes, ctd):"+e.getMessage());
			logger.severe("Exception occured in populateResponse(customTrckRes, ctd):"+e.getMessage());
		}
		catch (Exception e)
		{
			customTrckRes.setResponseStatusCode("0");
			customTrckRes.setResponseStatusDescription(errorMsg);
			
			System.out.println("Exception occured while populating the response:"+e.getMessage());
			logger.severe("Exception occured in populateResponse(customTrckRes, ctd):"+e.getMessage());
		}
		return customTrckRes ;
	}
	
	private Shipment populateShipmentDetails (CustomTrackingResponse customTrckRes , TrackDetail trackDetail){
		Shipment shipment = new Shipment();
		try {
			//Setting shipper details
			Address  resShipperAddress = trackDetail.getShipperAddress();
			logger.info("Tyring to set shipper address details");
			if (resShipperAddress != null) {
				Shipper shipper = new Shipper();
				com.cts.ptms.model.tracking.Address shipperAddress = new com.cts.ptms.model.tracking.Address();
				String[] shprStreetLines = resShipperAddress.getStreetLines();
				if(shprStreetLines != null) {
					shipperAddress.setAddressLine1(shprStreetLines[0]);
					shipperAddress.setAddressLine2(shprStreetLines[1]);
				}
				shipperAddress.setCity(resShipperAddress.getCity());
				shipperAddress.setCountryCode(resShipperAddress.getCountryCode());
				shipperAddress.setPostalCode(resShipperAddress.getPostalCode());
				shipperAddress.setStateProvinceCode(resShipperAddress.getStateOrProvinceCode());
				shipper.setAddress(shipperAddress);
				shipment.setShipper(shipper);
			}
			
			//Setting Recipient  details
			Address  resDestAddress = trackDetail.getDestinationAddress();
			logger.info("Tyring to set destination address details");
			if (resDestAddress != null) {
				ShipTo shipTo = new ShipTo();
				com.cts.ptms.model.tracking.Address shipToAddress = new com.cts.ptms.model.tracking.Address();
				String[] destStreetLines = resDestAddress.getStreetLines();
				if (destStreetLines != null && destStreetLines.length != 0 ) {
					shipToAddress.setAddressLine1(destStreetLines[0]);
					shipToAddress.setAddressLine1(destStreetLines[1]);
				}
				shipToAddress.setCity(resDestAddress.getCity());
				shipToAddress.setCountryCode(resDestAddress.getCountryCode());
				shipToAddress.setPostalCode(resDestAddress.getPostalCode());
				shipToAddress.setStateProvinceCode(resDestAddress.getStateOrProvinceCode());
				shipTo.setAddress(shipToAddress);
				shipment.setShipTo(shipTo);
			}
			//Weight Detais
			Weight resWeight = trackDetail.getPackageWeight();
			logger.info("Tyring to set retrieved weight details");
			if (resWeight != null ) { 
				com.cts.ptms.model.tracking.Weight weightDetails  = null;
				
				UnitOfMeasurement uom = new UnitOfMeasurement();
				uom.setCode(resWeight.getUnits().toString());
				uom.setDescription(resWeight.getUnits().toString());
				
				weightDetails = new com.cts.ptms.model.tracking.Weight();
				weightDetails.setUnitOfMeasurement(uom);
				if (resWeight.getValue() != null )
					weightDetails.setWeight(resWeight.getValue().toString());
			}
			//Service type
			CarrierCodeType carrierCodeType = trackDetail.getCarrierCode();
			logger.info("Tyring to set Service Type details");
			TrackServiceDescriptionDetail serviceDetails = trackDetail.getService();
			if (carrierCodeType != null) {
				CodeType codeType = new CodeType();
				codeType.setCode(serviceDetails.getType().getValue());
				codeType.setDescription(serviceDetails.getDescription());
				shipment.setService(codeType);
			}
			
			//Shipment ReferenceNumber
			List<ShipmentReferenceNumber> shipmentReferenceNumbers = new ArrayList<ShipmentReferenceNumber>(0);
			logger.info("Tyring to set Shipement reference number details");
			TrackOtherIdentifierDetail[] otherIdentifiers = trackDetail.getOtherIdentifiers();
			if ( otherIdentifiers != null && otherIdentifiers.length != 0) {
				for (TrackOtherIdentifierDetail trackOtherIdentifierDetail 
						: otherIdentifiers) {
				ShipmentReferenceNumber shipmentReferenceNumber = new ShipmentReferenceNumber();
				shipmentReferenceNumber.setCode(trackOtherIdentifierDetail.getPackageIdentifier().getType().toString());
				shipmentReferenceNumber.setValue(trackOtherIdentifierDetail.getPackageIdentifier().getValue());
				shipmentReferenceNumbers.add(shipmentReferenceNumber);
				}
			}
			shipment.setReferenceNumber(shipmentReferenceNumbers);
			
			//Pickup date
			logger.info("Tyring to set estimated pick up details");
			if(trackDetail.getShipTimestamp() != null) {
				shipment.setPickupDate(trackDetail.getShipTimestamp().toString());
			}
			if (trackDetail.getEstimatedDeliveryTimestamp() != null) {
				shipment.setScheduledDeliveryDate((new SimpleDateFormat("'MM/dd/yyyy hh:mm.ss").
						format(trackDetail.getEstimatedDeliveryTimestamp())));
			}
			
			//Package Details
			List<com.cts.ptms.model.tracking.Package> packages = new ArrayList<com.cts.ptms.model.tracking.Package>(0);
			com.cts.ptms.model.tracking.Package tempPackage = null; 
			logger.info("Tyring to set Activity details");
			//Activity
			List<Activity> activities = new ArrayList<Activity>(0);
			
			Activity activity = null;
			if (trackDetail.getEvents() == null) {
				throw new TrackingException("No Events occured");
			}
			for (TrackEvent trackEvent : trackDetail.getEvents()) {
				tempPackage = new com.cts.ptms.model.tracking.Package();
				ArrivalLocationType rcvdActvityLoc  = trackEvent.getArrivalLocation();
				if(rcvdActvityLoc == null) {
					new TrackingException("No Activity Location Details available.");
				}
				activity = new Activity();
				ActivityLocation activityLoc = null;
				if(rcvdActvityLoc != null) {
					logger.info("Tyring to set Activity Location details");
					Address rcvdLocAddress = trackEvent.getAddress();
					com.cts.ptms.model.tracking.Address  tempAddress = new com.cts.ptms.model.tracking.Address();
					
					String[] locationAddLines = rcvdLocAddress.getStreetLines();
					if(locationAddLines != null && locationAddLines.length != 0) {
						tempAddress.setAddressLine1(locationAddLines[0]);
						tempAddress.setAddressLine2(locationAddLines[1]);
					}
					tempAddress.setCity(rcvdLocAddress.getCity());
					tempAddress.setCountryCode(rcvdLocAddress.getCountryCode());
					tempAddress.setPostalCode(rcvdLocAddress.getPostalCode());
					tempAddress.setStateProvinceCode(rcvdLocAddress.getStateOrProvinceCode());
					
					activityLoc = new ActivityLocation();
					activityLoc.setAddress(tempAddress);
					activityLoc.setCode(trackEvent.getEventType());
					activityLoc.setDescription(trackEvent.getEventDescription());
					//activityLoc.setSignedForByName(rcvdActvityLoc.getSignedForByName());
				}
				activity.setActivityLocation(activityLoc);
				
				logger.info("Tyring to set event status details");
				Status status = new Status();
				CodeType tempCodeType = new CodeType();
				tempCodeType.setCode(trackEvent.getEventType());
				tempCodeType.setDescription(trackEvent.getEventDescription());
				status.setStatusType(tempCodeType);
				
				activity.setStatus(status);
				//logger.info("Event Time Stamp"+trackEvent.getTimestamp());
				Date eventDate = trackEvent.getTimestamp().getTime();
				activity.setDate(new SimpleDateFormat("MM/dd/yyyy").format(eventDate));
				activity.setTime(new SimpleDateFormat("HH:mm:ss").format(eventDate));
				
				activities.add(activity);
				tempPackage.setActivity(activities);
				packages.add(tempPackage);
			}
			
			shipment.set_package(packages);
			
		}catch (TrackingException ex) {
			logger.severe("Exception occured while populating the response:"+ex.getMessage());
			
		}catch (Exception ex) {
			logger.severe("Exception occured while populating the response:"+ex.getMessage());
			
		}
		return shipment;
	}

}
