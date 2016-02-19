package com.cts.ptms.model.common;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name="SHIPMENT_DOCUMENT")
public class ShipmentDocument implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long id;	
	
	@Column(name="DOCUMENT_TITLE",length = 35, nullable = false, unique = true)
	private String documentName;
	@Column(name="DOCUMENT_TYPE",length = 15, nullable = false, unique = true)
	private String documentType;
	@Column(name="DOCUMENT_PATH",length = 100, nullable = false, unique = true)
	private String documentPath;
	@Transient
	private String documentText;
	
	
	@ManyToOne
	@JoinColumn(name = "SHIPMENT_ORDER_ID") 
	private ShipmentOrder shipmentOrder;
	
	@Override
	public String toString() {
		return "ShipmentDocument [id=" + id + ", documentName=" + documentName + ", documentType=" + documentType
				+ ", documentPath=" + documentPath + ", shipmentOrder=" + shipmentOrder + "]";
	}
	public ShipmentOrder getShipmentOrder() {
		return shipmentOrder;
	}
	public void setShipmentOrder(ShipmentOrder shipmentOrder) {
		this.shipmentOrder = shipmentOrder;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getDocumentPath() {
		return documentPath;
	}
	public void setDocumentPath(String documentPath) {
		this.documentPath = documentPath;
	}
	public String getDocumentText() {
		return documentText;
	}
	public void setDocumentText(String documentText) {
		this.documentText = documentText;
	}
	
	
	
	
	
	
	
}
