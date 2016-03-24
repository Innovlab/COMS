package com.cts.ptms.carrier.purolator;

import com.cts.ptms.core.ClientGateway;
import com.cts.ptms.core.ClientShipmentService;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.common.TrackingDetails;

public class PurolatorShipmentService implements ClientShipmentService {
	
	private ClientGateway purolatorClient;
	
	public PurolatorShipmentService(){
		initializeClientService();
	}

	/**
	 * Initialize the SOAPClient for Purolator
	 */
	private void initializeClientService() {
		
		if (null ==	purolatorClient )
			 purolatorClient = new PurolatorSOAPClient();
		
		
	}

	@Override
	public ClientGateway getClientService() {
		return purolatorClient;
	}

	@Override
	public void processOutputFiles() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ShipmentOrder createShipment(ShipmentRequest shipmentRequest) {
		return purolatorClient.createShipmentRequest(shipmentRequest);
	}

	@Override
	public TrackingDetails getTrackingDetails(String trackingId) {
		// TODO Auto-generated method stub
		return null;
	}

}
