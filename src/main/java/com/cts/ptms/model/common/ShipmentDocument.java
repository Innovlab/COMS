package com.cts.ptms.model.common;

import java.io.Serializable;
import java.util.Arrays;

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
	@Column(name="SHIPMENT_DOCUMENT_ID",nullable = false)	
	private long id;	
	
	@Column(name="DOCUMENT_NAME",length = 100, nullable = false)
	private String documentTitle;
	@Column(name="DOCUMENT_TYPE",length = 45, nullable = false)
	private String documentType;
	@Column(name="DOCUMENT_PATH",length = 300, nullable = false)
	private String documentName;
	
	@Transient
	private String documentPath;
	@Transient
	private String documentContentType;
	@Transient
	private String documentContent;
	@Transient
	private byte[] byteArray;	
	
	 
	
	
	
	public String getDocumentPath() {
		return documentPath;
	}
	public void setDocumentPath(String documentPath) {
		this.documentPath = documentPath;
	}
	
	
	
	@Override
	public String toString() {
		return "ShipmentDocument [id=" + id + ", documentTitle=" + documentTitle + ", documentType=" + documentType
				+ ", documentName=" + documentName + ", documentPath=" + documentPath + ", documentContentType="
				+ documentContentType + ", documentContent=" + documentContent + ", byteArray="
				+ Arrays.toString(byteArray) + ", shipmentOrder=" +  "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDocumentTitle() {
		return documentTitle;
	}
	public void setDocumentTitle(String documentTitle) {
		this.documentTitle = documentTitle;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public String getDocumentContent() {
		return documentContent;
	}
	public void setDocumentContent(String documentText) {
		this.documentContent = documentText;
	}
	/**
	 * @return the documentContentType
	 */
	public String getDocumentContentType() {
		return documentContentType;
	}
	/**
	 * @param documentContentType the documentContentType to set
	 */
	public void setDocumentContentType(String documentContentType) {
		this.documentContentType = documentContentType;
	}
	public byte[] getByteArray() {
		return byteArray;
	}
	public void setByteArray(byte[] byteArray) {
		this.byteArray = byteArray;
	}
	
	
	
	
	
	
}
