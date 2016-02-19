package com.cts.ptms.core;

import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.gls.InboundMessageType;
import com.cts.ptms.model.gls.ShipmentResult;

public class MainController {
	
	private void intialize() {
		
	}
	//This is main entry method which will process two type of messages (xml/json) 
	public ShipmentResult processMessage(String message,InboundMessageType inboundMessageType) {
		
		ShipmentRequest shipmentRequest  = createShipmentRequestObj(message, inboundMessageType);
		
		ShipmentServiceImpl shipmentServiceImpl = new ShipmentServiceImpl();
		// Get the carrier object based on the spring inject by bean lookup;
		shipmentServiceImpl.createSingleShipmentOrder(shipmentRequest);
		return null;
	}	
	
	
	
	private ShipmentRequest createShipmentRequestObj(String message,InboundMessageType inboundMessageType) {
		ShipmentRequest shipmentRequest = null;
		switch(inboundMessageType) {
		case JSON:
			shipmentRequest = createRequestFromJson(message);
		case XML:
			shipmentRequest = createRequestFromXml(message);	
		}
		return shipmentRequest;
		
	}
	private ShipmentRequest createRequestFromXml(String message) {		
		return null;
	}
	private ShipmentRequest createRequestFromJson(String message) {		
		return null;
	}

}
