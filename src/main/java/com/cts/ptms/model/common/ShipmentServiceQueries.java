package com.cts.ptms.model.common;

public interface ShipmentServiceQueries {
	
	public static String SELECT_MAX_WEIGHT_BY_CARRIER_SERVICE = "select "
			+ "MAX_WEIGHT from CARRIER_SERVICE where SERVICE_ID=:serviceId";
	
	public static String SELECT_STATUS_SUMMARY_QUERY_FOR_ALL="	SELECT " + 
		    "so.SHIPPER_STATUS_CD,count(so.ORDER_NO) as 'TOTAL' " +
		    "FROM " +
		    "SHIPMENT_ORDER so " +
			"INNER JOIN " +
		    "carrier_service cs ON so.carrier_service = cs.service_id " + 
		    "and so.shipment_process_dt >= :fromDate " +
		    "and so.shipment_process_dt <= :toDate " +
		    "group by so.shipper_status_cd " +
		    "order by cs.service_name"; 
	
	public static String SELECT_STATUS_SUMMARY_QUERY_BY_ID="	SELECT " + 
		    "so.SHIPPER_STATUS_CD,count(so.ORDER_NO) as 'TOTAL' " +
		    "FROM " +
		    "SHIPMENT_ORDER so " +
			"INNER JOIN " +
		    "carrier_service cs ON so.carrier_service = cs.service_id " +   
		    "and so.carrier_service = :carrierServiceType " +
		    "and so.shipment_process_dt >= :fromDate " +
		    "and so.shipment_process_dt <= :toDate " +
		    "group by so.shipper_status_cd " +
		    "order by cs.service_name"; 
	
	
	public static String SELECT_SERVICE_SUMMARY_QUERY_FOR_ALL="	SELECT " + 
		    "cs.SERVICE_NAME,cs.SERVICE_ID,count(so.ORDER_NO) as 'TOTAL' " +
		    "FROM " +
		    "SHIPMENT_ORDER so " +
			"INNER JOIN " +
		    "carrier_service cs ON so.carrier_service = cs.service_id " +  
		    "and so.shipment_process_dt >= :fromDate " +
		    "and so.shipment_process_dt <= :toDate " +
		    "group by cs.service_name " +
		    "order by cs.service_name"; 
	
	
	
	
}