package com.cts.ptms.model.gls;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.cts.ptms.model.accessRequest.AccessRequest;
//import com.cts.ptms.model.ShipmentConfirmRequest;
import com.cts.ptms.model.confirm.request.ShipmentConfirmRequest;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "upsSecurity",
    "confirmRequest"
})
@XmlRootElement(name = "ShippingInfo")
public class ShippingInfoDO {
	@XmlElement(name = "AccessRequest")
	protected AccessRequest upsSecurity;
	@XmlElement(name = "ShipmentConfirmRequest", namespace="http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0")
	protected com.cts.ptms.model.confirm.request.ShipmentConfirmRequest confirmRequest;

	public AccessRequest getUpsSecurity() {
		return upsSecurity;
	}

	public void setUpsSecurity(AccessRequest upsSecurity) {
		this.upsSecurity = upsSecurity;
	}

	public ShipmentConfirmRequest getConfirmRequest() {
		return confirmRequest;
	}

	public void setConfirmRequest(ShipmentConfirmRequest confirmRequest) {
		this.confirmRequest = confirmRequest;
	}


	
	
	
	

}
