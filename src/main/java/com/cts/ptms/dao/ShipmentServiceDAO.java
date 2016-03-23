package com.cts.ptms.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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

	public ShipmentOrder getByCartonNumber(long cartonNum, String status) {
		ShipmentOrder shipOrder = null;
		Query query =  em.createQuery("select shipmentOrder  from ShipmentOrder shipmentOrder where shipmentOrder.cartonNumber = :cartonNum and shipmentOrder.active=:status",ShipmentOrder.class);
		query.setParameter("cartonNum", cartonNum);
		query.setParameter("status", status);
		try{
			Object result = query.getSingleResult();
			shipOrder = (ShipmentOrder)result;
		}catch(NoResultException ex){
			System.out.println("No Active  Entity found for Carton Number : " + cartonNum);
			shipOrder = null;
		}
		return shipOrder;
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
	
	public String getCarrierName(String trackingNumber)  {
		String carrierName="UPS";
		System.out.println("Tracking Numer" + trackingNumber);
		TypedQuery<String> query = em.createQuery("SELECT so.carrier FROM ShipmentOrder so where so.trackingNumber=:arg1", String.class);
		query.setParameter("arg1", trackingNumber);
		List<String> carrierNames = query.getResultList();
		if (carrierNames==null||carrierNames.size()==0) {
		  carrierName = "UPS";
		} else {
		  carrierName = carrierNames.get(0);
		}
			 
			  if (carrierName==null ||  carrierName.trim().equals("")) {				  
					
				  carrierName = "UPS";
			  }
		
		 return carrierName;
	}
	
	public static void main (String [] args) {
		
	}
	
	
} 