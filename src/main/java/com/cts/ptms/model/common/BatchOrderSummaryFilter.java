package com.cts.ptms.model.common;

public class BatchOrderSummaryFilter {
	private String startDate;
	private String endDate;
	private boolean dateRange = false;
	private boolean lastOneDay = true;
	private boolean lastFileDays = false;
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public boolean isDateRange() {
		return dateRange;
	}
	public void setDateRange(boolean dateRange) {
		this.dateRange = dateRange;
	}
	public boolean isLastOneDay() {
		return lastOneDay;
	}
	public void setLastOneDay(boolean lastOneDay) {
		this.lastOneDay = lastOneDay;
	}
	public boolean isLastFileDays() {
		return lastFileDays;
	}
	public void setLastFileDays(boolean lastFileDays) {
		this.lastFileDays = lastFileDays;
	}
	
}
