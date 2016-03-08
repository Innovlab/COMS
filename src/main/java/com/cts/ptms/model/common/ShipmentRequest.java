package com.cts.ptms.model.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cts.ptms.model.gls.CreateShipUnits;


@XmlRootElement(name = "ShipmentRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class ShipmentRequest {
	
	@XmlElement(name = "FileName")
	private String fileName;
	@XmlElement(name = "CarrierName")
	private String carrier;
	@XmlElement(name = "IsLabelToBeGenerate")
	private boolean getLabel;
	@XmlElement(name = "ShipmentRequestXml")
	private String shipmentRequestXml;
	/**
	 * Contains the Authentication details for a specific request.
	 */
	@XmlElement(name = "CarrierAccessRequest")
	private CarrierAccessRequest carrierAccessRequest;
	/**
	 * Input Shipping Information 
	 */
	@XmlElement(name = "CreateShipUnits")
	private CreateShipUnits createShipUnits;
	
	
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
	/**
	 * @return the carrierAccessRequest
	 */
	public CarrierAccessRequest getCarrierAccessRequest() {
		return carrierAccessRequest;
	}
	/**
	 * @param carrierAccessRequest the carrierAccessRequest to set
	 */
	public void setCarrierAccessRequest(CarrierAccessRequest carrierAccessRequest) {
		this.carrierAccessRequest = carrierAccessRequest;
	}
	/**
	 * @return the createShipUnits
	 */
	public CreateShipUnits getCreateShipUnits() {
		return createShipUnits;
	}
	/**
	 * @param createShipUnits the createShipUnits to set
	 */
	public void setCreateShipUnits(CreateShipUnits createShipUnits) {
		this.createShipUnits = createShipUnits;
	}
	
}
