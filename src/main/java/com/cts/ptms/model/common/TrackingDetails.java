package com.cts.ptms.model.common;

import java.util.List;

public class TrackingDetails {
	private ShipmentOrder shipmentOrder;
	private String trackingId;
	private String overallStatus;
	private List<TrackLog> trackLogList;
	
	@Override
	public String toString() {
		return "TrackingDetails [shipmentOrder=" + shipmentOrder + ", trackingId=" + trackingId + ", overallStatus="
				+ overallStatus + ", trackLogList=" + trackLogList + "]";
	}
	public ShipmentOrder getShipmentOrder() {
		return shipmentOrder;
	}
	public void setShipmentOrder(ShipmentOrder shipmentOrder) {
		this.shipmentOrder = shipmentOrder;
	}
	public String getTrackingId() {
		return trackingId;
	}
	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}
	public String getOverallStatus() {
		return overallStatus;
	}
	public void setOverallStatus(String overallStatus) {
		this.overallStatus = overallStatus;
	}
	public List<TrackLog> getTrackLogList() {
		return trackLogList;
	}
	public void setTrackLogList(List<TrackLog> trackLogList) {
		this.trackLogList = trackLogList;
	}
}