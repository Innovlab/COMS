package com.cts.ptms.carrier.yrc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cts.ptms.core.ClientGateway;
import com.cts.ptms.core.ClientShipmentService;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.common.BatchOrderSummary;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.TrackingDetails;

public class YRCShipmentService implements ClientShipmentService {
	

	private ClientGateway clientService;
	
	public YRCShipmentService() {		
		getClientService();
	}

	public ShipmentOrder createShipment(ShipmentRequest request) {
		ShipmentOrder shipmentResponse = clientService.createShipmentRequest(request);
		return shipmentResponse;
	}
	
	
	public TrackingDetails getTrackingDetails(String trackingId) {
		return new TrackingDetails();
		
	}
	

	
	public ClientGateway getClientService() {
		clientService = new YRCSoapClient();
		return clientService;
	}

	

	public void processOutputFiles() {
		// TODO Auto-generated method stubs
		
	}
	
	public void populateSummary(List<ShipmentOrder> shipmentOrderList) {
		BatchOrderSummary batchOrderSummary =  new BatchOrderSummary();
		batchOrderSummary.setTotalOrdersFound(shipmentOrderList.size());
		int carrierCount=0;
		int shipmentTypeCount=0;
		Map<String,Integer> carrierMap = new HashMap<String,Integer>();
		Map<String,Integer> shipmentTypeMap = new HashMap<String,Integer>();
		 
		for( ShipmentOrder shipmentOrder: shipmentOrderList) {
			
		
		}
	}

	
	public static void main (String[] args) {
		ShipmentRequest shipmentRequest = new ShipmentRequest();
		shipmentRequest.setFileName("D:/samplePdf/source.xml");
		YRCShipmentService service = new YRCShipmentService();
		ShipmentOrder shipmentResponse = service.createShipment(shipmentRequest);
		System.out.println("=============================================");
		System.out.println(shipmentResponse);
		
	}

	

}
