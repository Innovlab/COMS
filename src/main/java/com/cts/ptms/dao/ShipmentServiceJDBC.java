package com.cts.ptms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.cts.ptms.core.ReportRequest;
import com.cts.ptms.core.ReportResponse;
import com.cts.ptms.core.ShipmentReportService;
import com.cts.ptms.model.common.ResultSummary;
import com.cts.ptms.model.common.ShipmentServiceQueries;


public class ShipmentServiceJDBC implements ShipmentServiceQueries,ShipmentReportService  {
	
	private NamedParameterJdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }
    
    public int getMaxWeightForCarrier(String serviceId) {
    	Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("serviceId", serviceId);
    	
		String maxWeight = jdbcTemplate.queryForObject(SELECT_MAX_WEIGHT_BY_CARRIER_SERVICE,paramMap,String.class);
            

		System.out.println("Max Weight: " + maxWeight);
		return Integer.parseInt(maxWeight);

    	
    }
	

	public ReportResponse getStatusSummaryForAll(ReportRequest reportRequest) {
		
		
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("fromDate", reportRequest.getFromDate());
		paramMap.put("toDate", reportRequest.getToDate());		
		
		List<ResultSummary> orderSummaryList = jdbcTemplate.query(SELECT_STATUS_SUMMARY_QUERY_FOR_ALL,paramMap,
		        new RowMapper<ResultSummary>() {
		            public ResultSummary mapRow(ResultSet rs, int rowNum) throws SQLException {
		            	ResultSummary orderSummary = new ResultSummary();
		            	orderSummary.setColumnName(rs.getString("shipper_status_cd"));
		            	orderSummary.setValue(rs.getInt("total"));
		            	System.out.println(orderSummary);
		                return orderSummary;
		            }
		        });

		ReportResponse reportResponse = new ReportResponse();
		reportResponse.setOrderSummaryList(orderSummaryList);
		return reportResponse;
		
	}
	
	
	public ReportResponse getStatusSummaryById(ReportRequest reportRequest) {
	
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("fromDate", reportRequest.getFromDate());
		paramMap.put("toDate", reportRequest.getToDate());	
		paramMap.put("carrierServiceType",reportRequest.getCarrierServiceType());
		List<ResultSummary> orderSummaryList = jdbcTemplate.query(SELECT_STATUS_SUMMARY_QUERY_BY_ID,paramMap,
		        new RowMapper<ResultSummary>() {
		            public ResultSummary mapRow(ResultSet rs, int rowNum) throws SQLException {
		            	ResultSummary orderSummary = new ResultSummary();
		            	orderSummary.setColumnName(rs.getString("shipper_status_cd"));
		            	orderSummary.setValue(rs.getInt("total"));		            	
		                return orderSummary;
		            }
		        });

		ReportResponse reportResponse = new ReportResponse();
		reportResponse.setServiceSummaryByIdList(orderSummaryList);
		return reportResponse;
	}
	
	public ReportResponse getServiceSummaryForAll(ReportRequest reportRequest) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("fromDate", reportRequest.getFromDate());
		paramMap.put("toDate", reportRequest.getToDate());	
		
		
		 
		
		List<ResultSummary> orderSummaryList = jdbcTemplate.query(SELECT_SERVICE_SUMMARY_QUERY_FOR_ALL,paramMap,
		        new RowMapper<ResultSummary>() {
		            public ResultSummary mapRow(ResultSet rs, int rowNum) throws SQLException {
		            	ResultSummary orderSummary = new ResultSummary();
		            	orderSummary.setColumnName(rs.getString("service_name"));
		            	orderSummary.setValue(rs.getInt("total"));
		            	orderSummary.setColumnId(rs.getString("service_id"));
		            	System.out.println(orderSummary);
		                return orderSummary;
		            }
		        });
		ReportResponse reportResponse = new ReportResponse();
		reportResponse.setServiceSummaryList(orderSummaryList);
		return reportResponse;
		
	
	}
	
	public static void main (String [] args) {
		
	}


	@Override
	public ReportResponse getSummary(ReportRequest reportRequest) {
		// TODO Auto-generated method stub
		return null;
	}
}