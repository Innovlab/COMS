package com.cts.ptms.model.common;

import java.util.List;
import java.util.Map;

public class BatchOrderSummary {

	private int totalOrdersFound;
	private int totalOrdersProcessed;
	private int invalidOrders;
	private Map<String, String> byShipment;
	private Map<String, String> byCarrier;
	private List<ShipmentOrder> shipmentOrderList;
	
	public int getTotalOrdersFound() {
		return totalOrdersFound;
	}
	public void setTotalOrdersFound(int totalOrdersFound) {
		this.totalOrdersFound = totalOrdersFound;
	}
	public int getTotalOrdersProcessed() {
		return totalOrdersProcessed;
	}
	public void setTotalOrdersProcessed(int totalOrdersProcessed) {
		this.totalOrdersProcessed = totalOrdersProcessed;
	}
	public int getInvalidOrders() {
		return invalidOrders;
	}
	public void setInvalidOrders(int invalidOrders) {
		this.invalidOrders = invalidOrders;
	}
	public Map<String, String> getByShipment() {
		return byShipment;
	}
	public void setByShipment(Map<String, String> byShipment) {
		this.byShipment = byShipment;
	}
	public Map<String, String> getByCarrier() {
		return byCarrier;
	}
	public void setByCarrier(Map<String, String> byCarrier) {
		this.byCarrier = byCarrier;
	}
	public List<ShipmentOrder> getShipmentOrderList() {
		return shipmentOrderList;
	}
	public void setShipmentOrderList(List<ShipmentOrder> shipmentOrderList) {
		this.shipmentOrderList = shipmentOrderList;
	}
	
	

}
