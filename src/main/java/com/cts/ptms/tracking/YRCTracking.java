/**
 * 
 */
package com.cts.ptms.tracking;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.transform.stream.StreamSource;

import org.milyn.Smooks;
import org.milyn.SmooksException;
import org.milyn.container.ExecutionContext;
import org.milyn.event.report.HtmlReportGenerator;
import org.milyn.payload.JavaResult;
import org.xml.sax.SAXException;


import com.cts.ptms.exception.tracking.TrackingException;
import com.cts.ptms.model.tracking.Activity;
import com.cts.ptms.model.tracking.ActivityLocation;
import com.cts.ptms.model.tracking.Address;
import com.cts.ptms.model.tracking.CodeType;
import com.cts.ptms.model.tracking.CurrentStatus;
import com.cts.ptms.model.tracking.CustomTrackingRequest;
import com.cts.ptms.model.tracking.CustomTrackingResponse;
import com.cts.ptms.model.tracking.Shipment;
import com.cts.ptms.model.tracking.Status;
import com.cts.ptms.model.yrc.Shipments;

import antlr.collections.List;

/**
 * @author 417765
 *
 */
public class YRCTracking implements ITrackingDetails{

	/**
	 * Default constructor
	 */
	public YRCTracking() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.cts.ptms.tracking.ITrackingDetails#getTrackingDetails()
	 */
	@Override
	public CustomTrackingResponse getTrackingDetails(CustomTrackingRequest customTrackingRequest) throws TrackingException {

		
		String trackingXmlReponse = getTrackingDetails(customTrackingRequest.getTrackRequestDetails().getTrackingNumber());
		Shipments shipments = null;
		try {
			shipments = runSmooks(trackingXmlReponse.getBytes());
		} catch (SmooksException | IOException | SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println(shipments);
		CustomTrackingResponse customTrackingResponse  = new CustomTrackingResponse();
		customTrackingResponse.setResponseStatusCode("1");
		customTrackingResponse.setResponseStatusDescription(shipments.getShipment().getCurrentStatusMessage());
		
		Status status = new Status();
		CodeType codeStatusType = new CodeType();
		codeStatusType.setDescription(shipments.getShipment().getCurrentStatusCode());
		status.setStatusType(codeStatusType);
		
		com.cts.ptms.model.tracking.Shipment trackingShipment = new com.cts.ptms.model.tracking.Shipment();
		CurrentStatus currentStatus = new CurrentStatus();
		currentStatus.setDescription(shipments.getShipment().getCurrentStatusMessage());
		currentStatus.setCode(shipments.getShipment().getCurrentStatusCode());
		trackingShipment.setCurrentStatus(currentStatus);
		
		
		
		ActivityLocation activityLocation = new ActivityLocation();
		Address address = new Address();
		address.setStateProvinceCode(shipments.getShipment().getOriginState());
		address.setCity(shipments.getShipment().getDestinationCity());
		ArrayList<com.cts.ptms.model.tracking.Shipment> shipmentList =  new ArrayList<com.cts.ptms.model.tracking.Shipment>();
		
		activityLocation.setAddress(address);
		ArrayList<com.cts.ptms.model.tracking.Package> packageList = new ArrayList<com.cts.ptms.model.tracking.Package>();
		com.cts.ptms.model.tracking.Package package1 = new com.cts.ptms.model.tracking.Package();
		Activity activity = new Activity();
		activity.setActivityLocation(activityLocation);
		activity.setDate(shipments.getShipment().getEstimatedDeliveryDate());
		activity.setStatus(status);
		ArrayList<Activity> activityList= new ArrayList<Activity>();
		activityList.add(activity);
		package1.setActivity(activityList);
		packageList.add(package1);
		trackingShipment.set_package(packageList);
		shipmentList.add(trackingShipment);
		customTrackingResponse.setShipment(shipmentList);
		
		
		
		return customTrackingResponse;
		
	}
	
	// HTTP GET request
		private String getTrackingDetails(String trackingNumber)  {
			
			final String USER_AGENT = "Mozilla/5.0";
			
			StringBuffer response =  new StringBuffer();
			try {
			//Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.213.63.208", 6050));
			
			
			String url="http://my.yrc.com/dynamic/national/servlet?CONTROLLER=com.rdwy.ec.rextracking.http.controller.PublicTrailerHistoryAPIController&PRONumber="+trackingNumber +"&xml=Y";
			URL obj;
			
				obj = new URL(url);
			
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			

			// optional default is GET
			con.setRequestMethod("GET");

			//add request header
			con.setRequestProperty("User-Agent", USER_AGENT);

			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return response.toString();
			

		}
		

	protected  Shipments runSmooks(byte[] xmlByteContent) throws IOException, SAXException, SmooksException {

        // Instantiate Smooks with the config...
        Smooks smooks = new Smooks("smooks-config.xml");

        try {
             // Create an exec context - no profiles....
            ExecutionContext executionContext = smooks.createExecutionContext();
            // The result of this transform is a set of Java objects...
            JavaResult result = new JavaResult();

            // Configure the execution context to generate a report...
            executionContext.setEventListener(new HtmlReportGenerator("target/report/report.html"));

            // Filter the input message to extract, using the execution context...
            smooks.filterSource(executionContext, new StreamSource(new ByteArrayInputStream(xmlByteContent)), result);

            return (Shipments) result.getBean("Shipments");
        } finally {
            smooks.close();
        }
    }
	
	

}
