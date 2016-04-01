package com.cts.ptms.core;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ReportRequest {
	@Override
	public String toString() {
		return "ReportRequest [requestType=" + requestType + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", carrierServiceId=" + carrierServiceId + ", carrierServiceType=" + carrierServiceType + "]";
	}

	private String requestType;
	private String fromDate;
	private String toDate;
	private String carrierServiceId;
	private String carrierServiceType;

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getCarrierServiceId() {
		return carrierServiceId;
	}

	public void setCarrierServiceId(String carrierServiceId) {
		this.carrierServiceId = carrierServiceId;
	}

	public String getCarrierServiceType() {
		return carrierServiceType;
	}

	public void setCarrierServiceType(String carrierServiceType) {
		this.carrierServiceType = carrierServiceType;
	}

}
