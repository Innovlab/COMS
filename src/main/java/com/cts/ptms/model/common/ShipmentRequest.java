package com.cts.ptms.model.common;

public class ShipmentRequest {

	private String fileName;
	
	private String carrier;

	private boolean getLabel;
	
	private String shipmentRequestXml;
	
	
	public String getShipmentRequestXml() {
		return shipmentRequestXml;
	}
	public void setShipmentRequestXml(String shipmentRequestXml) {
		this.shipmentRequestXml = shipmentRequestXml;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void setGenLabel(boolean genLbl) {
		this.getLabel = genLbl;
		
	}
	public boolean isGenLabel() {
		return getLabel;
	}
	
}
