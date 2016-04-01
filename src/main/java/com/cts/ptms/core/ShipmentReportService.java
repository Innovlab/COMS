package com.cts.ptms.core;

public interface ShipmentReportService {
	public ReportResponse getSummary(ReportRequest reportRequest);
	public ReportResponse getStatusSummaryForAll(ReportRequest reportRequest);
	public ReportResponse getStatusSummaryById(ReportRequest reportRequest);
	public ReportResponse getServiceSummaryForAll(ReportRequest reportRequest);
	
}
