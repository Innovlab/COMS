package com.cts.ptms.core;
import com.cts.ptms.model.accept.response.ShipmentAcceptResponse;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.confirm.response.ShipmentConfirmResponse;


public interface ClientGateway {
	
	public void initialize();
	
	public ShipmentOrder createShipmentRequest(ShipmentRequest request);	
	
	void handleError();
	
	public ShipmentOrder createShipmentResposeObj (ShipmentConfirmResponse confirmResponse,ShipmentAcceptResponse acceptResponse);
	
	
}
