package com.cts.ptms.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.cts.ptms.model.common.BatchOrderSummary;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.ShipmentOrderDetail;
import com.cts.ptms.model.common.ShipmentOrderDetailRequest;

@Transactional
public class ShipmentServiceDAO {
	
	 @PersistenceContext
	 private EntityManager em;
	
	
	 
	public void saveShipmentOrder(ShipmentOrder shipmentOrder) {
		System.out.println("Shipment Order Data" + shipmentOrder);
		em.persist(shipmentOrder);
	}
	
	public ShipmentOrder getById(int orderNumber) {
		ShipmentOrder shipmentOrder = em.find(ShipmentOrder.class, new Long(1));
		return shipmentOrder;
	}
	
	public ShipmentOrder getByTrackingNumber(String trackingNumber) {
		
		Query query =  em.createQuery("select shipmentOrder  from ShipmentOrder shipmentOrder where shipmentOrder.trackingNumber = :trackingNumber",ShipmentOrder.class);
		query.setParameter("trackingNumber", trackingNumber);
		return (ShipmentOrder) query.getSingleResult();
	}
	
	public List<ShipmentOrder> getSummaryByDateRange (String fromDate,String toDate) {
		Date fromDateObj = null;
	    Date toDateObj = null;
	    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	    try {
			fromDateObj = df.parse(fromDate);
			
			toDateObj = df.parse(toDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   

		Query query =  em.createQuery("SELECT shipmentOrder  from ShipmentOrder shipmentOrder where shipmentOrder.orderDate BETWEEN :fromDate AND :toDate",ShipmentOrder.class);
		query.setParameter("fromDate",fromDateObj);		
		query.setParameter("toDate", toDateObj);
		List<ShipmentOrder>shipmentOrderList = query.getResultList();
		return shipmentOrderList;
	}
	public BatchOrderSummary getBatchOrderSummary() {
		return null;  
	}
	
	public ShipmentOrderDetail getShipmentOrder (ShipmentOrderDetailRequest ShipmentOrderDetailRequest) {
		return null;
		
	}
	
	
} 