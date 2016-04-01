package com.cts.ptms.core;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.cts.ptms.model.common.ResultSummary;

@XmlRootElement
public class ReportResponse {
	
	private List<ResultSummary> orderSummaryList;
	private List<ResultSummary> serviceSummaryList;
	private List<ResultSummary> serviceSummaryByIdList;
	
	@Override
	public String toString() {
		return "ReportResponse [orderSummaryList=" + orderSummaryList + ", serviceSummaryList=" + serviceSummaryList
				+ ", serviceSummaryByIdList=" + serviceSummaryByIdList + "]";
	}
	public List<ResultSummary> getOrderSummaryList() {
		return orderSummaryList;
	}
	public void setOrderSummaryList(List<ResultSummary> orderSummaryList) {
		this.orderSummaryList = orderSummaryList;
	}
	public List<ResultSummary> getServiceSummaryList() {
		return serviceSummaryList;
	}
	public void setServiceSummaryList(List<ResultSummary> serviceSummaryList) {
		this.serviceSummaryList = serviceSummaryList;
	}
	public List<ResultSummary> getServiceSummaryByIdList() {
		return serviceSummaryByIdList;
	}
	public void setServiceSummaryByIdList(List<ResultSummary> serviceSummaryByIdList) {
		this.serviceSummaryByIdList = serviceSummaryByIdList;
	}

	
	

}
