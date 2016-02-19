package com.cts.ptms.model.common;

public class ShipmentBatchRequest {
	
	private String filePath;	
	private boolean singleShipmentMode = false;
	private String singleReqeustXml ="";
	private boolean batchShipmentMode = false;
	
	
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public boolean isSingleShipmentMode() {
		return singleShipmentMode;
	}
	public void setSingleShipmentMode(boolean singleShipmentMode) {
		this.singleShipmentMode = singleShipmentMode;
	}
	public String getSingleReqeustXml() {
		return singleReqeustXml;
	}
	public void setSingleReqeustXml(String singleReqeustXml) {
		this.singleReqeustXml = singleReqeustXml;
	}
	public boolean isBatchShipmentMode() {
		return batchShipmentMode;
	}
	public void setBatchShipmentMode(boolean batchShipmentMode) {
		this.batchShipmentMode = batchShipmentMode;
	}
	@Override
	public String toString() {
		return "ShipmentBatchRequest [filePath=" + filePath + ", singleShipmentMode=" + singleShipmentMode
				+ ", singleReqeustXml=" + singleReqeustXml + ", batchShipmentMode=" + batchShipmentMode + "]";
	}
	
	

	

}
