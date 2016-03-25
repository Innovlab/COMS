package com.cts.ptms.core;

import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.TrackingDetails;

public interface ClientShipmentService {	
	
	ClientGateway getClientService();	
	void processOutputFiles () ;
	ShipmentOrder createShipment(ShipmentRequest shipmentRequest);
	TrackingDetails getTrackingDetails(String trackingId);
	//Cancel Shipment Order
	ShipmentOrder cancelShipment(ShipmentRequest shipmentRequest);
}
