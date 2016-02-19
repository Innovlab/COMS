package com.cts.ptms.carrier.ups;


import com.cts.ptms.core.ClientGateway;
import com.cts.ptms.core.ClientShipmentService;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.TrackingDetails;

public class UPSShipmentServiceTest implements ClientShipmentService{
	
	private ShipmentRequest shipmentRequest;
	private Object clientService;
	
	public UPSShipmentServiceTest(ShipmentRequest shipmentRequest) {
		this.shipmentRequest = shipmentRequest;
	}

	public ShipmentOrder createShipment(ShipmentRequest shipmentRequest) {		
		return null;
	}

	
	public ClientGateway getClientService() {
		// TODO Auto-generated method stub
		// Bassed on the carrier gateway configuration create the handle for the respective client
		//clientService = new SeikoRestfulClient();
		//clientService = new SeikoSoapClient();
		return null;
	}

	

	public void processOutputFiles() {
		// TODO Auto-generated method stubs
		
	}

	

	public TrackingDetails getTrackingDetails(String trackingId) {
		// TODO Auto-generated method stub
		return null;
	}

}
