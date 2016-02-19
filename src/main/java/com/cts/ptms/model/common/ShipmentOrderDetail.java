package com.cts.ptms.model.common;

import java.util.ArrayList;
import java.util.List;

public class ShipmentOrderDetail {
	
	private ShipmentOrder shipmentOrder;
	private List<ShipmentDocument> shipmentDocuments = new ArrayList<ShipmentDocument>();
	
	
	@Override
	public String toString() {
		return "ShipmentOrderDetail [shipmentOrder=" + shipmentOrder + ", shipmentDocuments=" + shipmentDocuments + "]";
	}
	
	public ShipmentOrder getShipmentOrder() {
		return shipmentOrder;
	}
	public void setShipmentOrder(ShipmentOrder shipmentOrder) {
		this.shipmentOrder = shipmentOrder;
	}
	public List<ShipmentDocument> getShipmentDocuments() {
		return shipmentDocuments;
	}
	public void setShipmentDocuments(List<ShipmentDocument> shipmentDocuments) {
		this.shipmentDocuments = shipmentDocuments;
	}
	
}
