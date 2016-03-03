/**
 * 
 */
package com.cts.ptms.carrier.fedex;

import com.cts.ptms.core.ClientGateway;
import com.cts.ptms.core.ClientShipmentService;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.common.TrackingDetails;

/**
 * @author 417765
 *
 */
public class FedExShipmentService implements ClientShipmentService{

	private ClientGateway clientService;
	/**
	 * Default constructor
	 */
	public FedExShipmentService() {
		super();
		getClientService();
	}

	@Override
	public ClientGateway getClientService() {
		
		clientService = new FedExSoapClient();
		return clientService;
		
	}

	@Override
	public void processOutputFiles() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ShipmentOrder createShipment(ShipmentRequest shipmentRequest) {
		return clientService.createShipmentRequest(shipmentRequest);
		
	}

	@Override
	public TrackingDetails getTrackingDetails(String trackingId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
