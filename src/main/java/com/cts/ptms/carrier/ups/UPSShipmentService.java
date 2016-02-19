package com.cts.ptms.carrier.ups;

import com.cts.ptms.core.ClientGateway;
import com.cts.ptms.core.ClientShipmentService;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.TrackingDetails;

public class UPSShipmentService implements ClientShipmentService{
	
	
	private ClientGateway clientService;
	
	public UPSShipmentService() {		
		getClientService();
	}

	public ShipmentOrder createShipment(ShipmentRequest request) {
		ShipmentOrder shipmentResponse = clientService.createShipmentRequest(request);
		return shipmentResponse;
	}
	
	
	public TrackingDetails getTrackingDetails(String trackingId, String carrier) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ClientGateway getClientService() {
		clientService = new UPSHTTPClient();
		return clientService;
	}

	

	public void processOutputFiles() {
		// TODO Auto-generated method stubs
		
	}

	public TrackingDetails getTrackingDetails(String trackingId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
