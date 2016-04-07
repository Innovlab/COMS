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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import com.cts.ptms.model.confirm.request.ShipmentType;

@Entity
@Table(name = "SHIPMENT_ORDER")
@XmlRootElement
public class ShipmentOrder  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SHIPMENT_ORDER_ID",nullable = false)	
	private long shipmentOrderId;
	@Column(name="CARTON_NO",length = 45, nullable = false)
	private String cartonNumber;	
	@Column(name="ORDER_NO",length = 45, nullable = false)
	private String orderNumber;	
	@Column(name="CUST_ORDR_NO",length = 45, nullable = false)
	private String customerOrderNumber;	
	@Column(name="BILLING_ACCNT_NO",length = 45, nullable = true)
	private String billingAccountNumber;
	@Column(name="TRACKING_NO",length = 35, nullable = true)
	private String trackingNumber;	
	@Column(name="CARRIER_STATUS_CD",length = 45, nullable = true)
	private String status;	
	@Column(name="SHIPPER_STATUS_CD",length = 45, nullable = true)
	private String shipperStatus;	
	@Column(name="CARRIER_SERVICE",length = 5, nullable = true)	
	private String carrierService;
	@Column(name="ERROR_SEVERITY",length = 10, nullable = true)
	private String ErrorSeverity;
	@Column(name="ERROR_CODE",length = 4, nullable = true)
	private String ErrorCode;
	//@Column(name="ERROR_DESCRIPTION",length = 100)
	@Transient
	private String ErrorDescription;	
	@Column(name = "SHIPMENT_PLAN_DT", columnDefinition = "DATE DEFAULT CURRENT_DATE")
	@Temporal(TemporalType.DATE)
	private Date orderDate;	
	@Column(name = "SHIPMENT_PROCESS_DT", columnDefinition = "DATE DEFAULT CURRENT_DATE")
	@Temporal(TemporalType.DATE)
	private Date processedDate;
	@Column(name="RETURN_FLAG",length=1, nullable = true)
	private String returnFlag;	
	@Column(name="ACTIVE_ORDER",length=1, nullable = true)
	private String active;
	
	
	@OneToMany(cascade = CascadeType.ALL, 
            orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "SHIPMENT_ORDER_ID", 
            nullable = false, insertable = true, updatable = true)

	
	private List<ShipmentDocument> shipmentDocuments = new ArrayList<ShipmentDocument>();
	
	@Transient
	private String carrier;	
	//@Column(name="SHIPMENT_TYPE",length = 30,nullable=false)
	@Transient
	private String shipmentType;
	@Transient
	private ShipmentType shipmentTypeDO;
	@Transient
	private String returnLblTrackingNum;
	
	
	
	public long getShipmentOrderId() {
		return shipmentOrderId;
	}
	public void setShipmentOrderId(long shipmentOrderId) {
		this.shipmentOrderId = shipmentOrderId;
	}
	public String getCartonNumber() {
		return cartonNumber;
	}
	public void setCartonNumber(String cartonNumber) {
		this.cartonNumber = cartonNumber;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getCustomerOrderNumber() {
		return customerOrderNumber;
	}
	public void setCustomerOrderNumber(String customerOrderNumber) {
		this.customerOrderNumber = customerOrderNumber;
	}
	public String getBillingAccountNumber() {
		return billingAccountNumber;
	}
	public void setBillingAccountNumber(String billingAccountNumber) {
		this.billingAccountNumber = billingAccountNumber;
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
	public String getShipperStatus() {
		return shipperStatus;
	}
	public void setShipperStatus(String shipperStatus) {
		this.shipperStatus = shipperStatus;
	}
	public String getCarrierService() {
		return carrierService;
	}
	public void setCarrierService(String carrierService) {
		this.carrierService = carrierService;
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
	public Date getProcessedDate() {
		return processedDate;
	}
	public void setProcessedDate(Date processedDate) {
		this.processedDate = processedDate;
	}
	public List<ShipmentDocument> getShipmentDocuments() {
		return shipmentDocuments;
	}
	public void setShipmentDocuments(List<ShipmentDocument> shipmentDocuments) {
		this.shipmentDocuments = shipmentDocuments;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getShipmentType() {
		return shipmentType;
	}
	public void setShipmentType(String shipmentType) {
		this.shipmentType = shipmentType;
	}
	public ShipmentType getShipmentTypeDO() {
		return shipmentTypeDO;
	}
	public void setShipmentTypeDO(ShipmentType shipmentTypeDO) {
		this.shipmentTypeDO = shipmentTypeDO;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	public String getReturnFlag() {
		return returnFlag;
	}
	public void setReturnFlag(String returnFlag) {
		this.returnFlag = returnFlag;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	/**
	 * @return the returnLblTrackingNum
	 */
	public String getReturnLblTrackingNum() {
		return returnLblTrackingNum;
	}
	/**
	 * @param returnLblTrackingNum the returnLblTrackingNum to set
	 */
	public void setReturnLblTrackingNum(String returnLblTrackingNum) {
		this.returnLblTrackingNum = returnLblTrackingNum;
	}
	
	
}
