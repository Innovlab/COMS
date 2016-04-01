package com.cts.ptms.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.ptms.dao.ShipmentServiceJDBC;
import com.cts.ptms.model.common.ResultSummary;

public class ShipmentReportServiceImpl implements ShipmentReportService {
	
	ShipmentServiceJDBC shipmentServiceJdbc;
	
	public ReportResponse getSummary(ReportRequest reportRequest) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");		
		shipmentServiceJdbc =  (ShipmentServiceJDBC) context.getBean("shipmentReportServiceDao");
		ReportResponse reportResponse = null;
		switch (reportRequest.getRequestType()) {
			case "getStatusSummaryForAll" : {
				reportResponse = getStatusSummaryForAll(reportRequest);
				reportResponse.setServiceSummaryList(getServiceSummaryForAll(reportRequest).getServiceSummaryList());
				if(reportResponse.getServiceSummaryList().size()>0) {
					if((reportResponse.getServiceSummaryList().get(0)!=null)) {
						reportRequest.setCarrierServiceType(reportResponse.getServiceSummaryList().get(0).getColumnId());
						reportResponse.setServiceSummaryByIdList(getStatusSummaryById(reportRequest).getServiceSummaryByIdList());
					}
				}
				
				break;
			}
			case "getStatusSummaryById" : {
				reportResponse = getStatusSummaryById(reportRequest);
				break;
			}
			case"getServiceSummaryForAll" : {
				reportResponse = getServiceSummaryForAll(reportRequest);
				break;
			}
		}
		context.close();
		return reportResponse;
	}

	public ReportResponse getStatusSummaryForAll(ReportRequest reportRequest) {
		int totalCount=0;
		ReportResponse reportResponse =  shipmentServiceJdbc.getStatusSummaryForAll(reportRequest);	
		for (ResultSummary orrderSummary : reportResponse.getOrderSummaryList()) {
			totalCount = totalCount + orrderSummary.getValue();
		}
		ResultSummary orderSummary =  new ResultSummary();
		orderSummary.setColumnName(" TOTAL ORDERS");
		orderSummary.setValue(totalCount);
		reportResponse.getOrderSummaryList().add(orderSummary);
		if (totalCount==0) {
			List<ResultSummary> defaultOrderList;
			defaultOrderList = populateDefaultOrderList();
			reportResponse.getOrderSummaryList().addAll(defaultOrderList);
		}
		return reportResponse;		
	}


	private List<ResultSummary> populateDefaultOrderList() {
		
		List<ResultSummary> defaultOrderList = new ArrayList<ResultSummary>();
		String [] columnNames = {"ORDERS DELIVERED","ORDERS IN TRANSIT","LABELS GENERATED","ORDERS PICKED UP","ORDERS DELAYED"};
		for (String columnName : columnNames) {		
			ResultSummary orderSummary =  new ResultSummary();
			orderSummary.setColumnName(columnName);
			orderSummary.setValue(0);
			defaultOrderList.add(orderSummary);
		}
		return defaultOrderList;
	}

	public ReportResponse getStatusSummaryById(ReportRequest reportRequest) {
		ReportResponse reportResponse =  shipmentServiceJdbc.getStatusSummaryById(reportRequest);		
		return reportResponse;	
	}


	public ReportResponse getServiceSummaryForAll(ReportRequest reportRequest) {
		ReportResponse reportResponse =  shipmentServiceJdbc.getServiceSummaryForAll(reportRequest);		
		return reportResponse;	
		
	}
	
}