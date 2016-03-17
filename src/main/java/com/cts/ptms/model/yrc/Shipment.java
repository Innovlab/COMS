package com.cts.ptms.model.yrc;

public class Shipment {
	
	
	@Override
	public String toString() {
		return "Shipment [returnCode=" + returnCode + ", returnMessage=" + returnMessage + ", referenceNumber="
				+ referenceNumber + ", orginCity=" + orginCity + ", originState=" + originState + ", orginZip="
				+ orginZip + ", destinationCity=" + destinationCity + ", destinationZip=" + destinationZip
				+ ", pickupDate=" + pickupDate + ", deliverDate=" + deliverDate + ", tenderCode=" + tenderCode
				+ ", currentStatusCode=" + currentStatusCode + ", currentStatusDate=" + currentStatusDate
				+ ", currentStatusMessage=" + currentStatusMessage + ", estimatedDeliveryDate=" + estimatedDeliveryDate
				+ "]";
	}
	private String returnCode;
	private String returnMessage;
	private String referenceNumber;
	private String orginCity;
	private String originState;
	private String orginZip;
	private String destinationCity;
	private String destinationZip;
	private String pickupDate;
	private String deliverDate;
	private String tenderCode;
	private String currentStatusCode;
	private String currentStatusDate;
	private String currentStatusMessage;
	private String estimatedDeliveryDate;
	

	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnMessage() {
		return returnMessage;
	}
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public String getOrginCity() {
		return orginCity;
	}
	public void setOrginCity(String orginCity) {
		this.orginCity = orginCity;
	}
	public String getOriginState() {
		return originState;
	}
	public void setOriginState(String originState) {
		this.originState = originState;
	}
	public String getOrginZip() {
		return orginZip;
	}
	public void setOrginZip(String orginZip) {
		this.orginZip = orginZip;
	}
	public String getDestinationCity() {
		return destinationCity;
	}
	public void setDestinationCity(String destinaionCity) {
		this.destinationCity = destinaionCity;
	}
	public String getDestinationZip() {
		return destinationZip;
	}
	public void setDesinationZip(String desinationZip) {
		this.destinationZip = desinationZip;
	}
	public String getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}
	public String getDeliverDate() {
		return deliverDate;
	}
	public void setDeliverDate(String deliverDate) {
		this.deliverDate = deliverDate;
	}
	public String getTenderCode() {
		return tenderCode;
	}
	public void setTenderCode(String tenderCode) {
		this.tenderCode = tenderCode;
	}
	public String getCurrentStatusCode() {
		return currentStatusCode;
	}
	public void setCurrentStatusCode(String currentStatusCode) {
		this.currentStatusCode = currentStatusCode;
	}
	public String getCurrentStatusDate() {
		return currentStatusDate;
	}
	public void setCurrentStatusDate(String currentStatusDate) {
		this.currentStatusDate = currentStatusDate;
	}
	public String getCurrentStatusMessage() {
		return currentStatusMessage;
	}
	public void setCurrentStatusMessage(String currentStatusMessage) {
		this.currentStatusMessage = currentStatusMessage;
	}
	public String getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}
	public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}
	
}
