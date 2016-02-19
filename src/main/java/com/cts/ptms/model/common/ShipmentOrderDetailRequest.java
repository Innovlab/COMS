package com.cts.ptms.model.common;

public class ShipmentOrderDetailRequest {
	private String requestIdType;
	private String requestId;
	private boolean fetchShipmentDoc = true;
	
	public String getRequestIdType() {
		return requestIdType;
	}
	public void setRequestIdType(String requestIdType) {
		this.requestIdType = requestIdType;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public boolean isFetchShipmentDoc() {
		return fetchShipmentDoc;
	}
	public void setFetchShipmentDoc(boolean fetchShipmentDoc) {
		this.fetchShipmentDoc = fetchShipmentDoc;
	}
	
	
}