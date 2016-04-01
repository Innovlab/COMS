package com.cts.ptms.core;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/Report")
public class ShipmentReportResource {
	
	
	@POST	
	@Path("/getStatusSummaryForAll")
	@Consumes( MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON) 
	public ReportResponse getSummaryreport(ReportRequest reportRequest)
	{
		System.out.println(reportRequest);
		ShipmentReportService shipmentReportService = new ShipmentReportServiceImpl();
		ReportResponse reportResponse = shipmentReportService.getSummary(reportRequest);
		System.out.println(reportResponse);
		return reportResponse;
	}

	
}
