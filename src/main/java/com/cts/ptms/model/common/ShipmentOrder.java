package com.cts.ptms.model.common;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "SHIPMENT_ORDER")
public class ShipmentOrder  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SHIPMENT_ORDER_ID",nullable = false)	
	private long shipmentOrderId;
	
	@Column(name="ORDER_NUMBER",length = 30, nullable = false)
	private String orderNumber;	
	@Column(name="TRACKING_ID",length = 35, nullable = true)
	private String trackingNumber;	
	@Column(name="STATUS",length = 15, nullable = false)
	private String status;	
	@Column(name="CARRIER",length = 20, nullable = false)
	private String carrier;	
	//@Column(name="SHIPMENT_TYPE",length = 30,nullable=false)
	@Transient
	private String shipmentType;
	
	
	@OneToMany(fetch=FetchType.EAGER,cascade = CascadeType.ALL)	
	private List<ShipmentDocument> shipmentDocuments = new ArrayList<ShipmentDocument>();
	
	@Override
	public String toString() {
		return "ShipmentOrder [shipmentOrderId=" + shipmentOrderId + ", orderNumber=" + orderNumber
				+ ", trackingNumber=" + trackingNumber + ", status=" + status + ", carrier=" + carrier
				+ ", shipmentDocuments=" + shipmentDocuments + ", ErrorSeverity=" + ErrorSeverity + ", ErrorCode="
				+ ErrorCode + ", ErrorDescription=" + ErrorDescription + ", orderDate=" + orderDate + "]";
	}
	@Column(name="ERROR_SEVERITY",length = 10, nullable = true)
	private String ErrorSeverity;
	@Column(name="ERROR_CODE",length = 4, nullable = true)
	private String ErrorCode;
	@Column(name="ERROR_DESCRIPTION",length = 100)
	private String ErrorDescription;	
	@Column(name = "ORDER_DATE", columnDefinition = "DATE DEFAULT CURRENT_DATE")
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	/*public long getShipmentOrderId() {
		return shipmentOrderId;
	}
	public void setShipmentOrderId(long shipmentOrderId) {
		this.shipmentOrderId = shipmentOrderId;
	}*/
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getTrackingNumber() {
		return trackingNumber;
	}
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	public List<ShipmentDocument> getShipmentDocuments() {
		return shipmentDocuments;
	}
	public void setShipmentDocuments(List<ShipmentDocument> shipmentDocuments) {
		this.shipmentDocuments = shipmentDocuments;
	}
	public String getErrorSeverity() {
		return ErrorSeverity;
	}
	public void setErrorSeverity(String errorSeverity) {
		ErrorSeverity = errorSeverity;
	}
	public String getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(String errorCode) {
		ErrorCode = errorCode;
	}
	public String getErrorDescription() {
		return ErrorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		ErrorDescription = errorDescription;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	
	
}
