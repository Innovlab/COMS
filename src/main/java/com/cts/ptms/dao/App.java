package com.cts.ptms.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.ptms.model.common.ShipmentDocument;
import com.cts.ptms.model.common.ShipmentOrder;

public class App {

	public App () {
		
	}
	
	public static void main (String [] args) {
		
		/*ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader)cl).getURLs();

        for(URL url: urls){
        	System.out.println(url.getFile());
        }*/
		                                                                             
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/applicationContext.xml");
		ShipmentServiceDAO dao = (ShipmentServiceDAO) context.getBean("shipmentServiceDao");	 	
		
		for (int i=0;i<2;i++) {
			ShipmentOrder shipmentOrder = populateShipmentOrder();
			dao.saveShipmentOrder(shipmentOrder);
		}
		ShipmentOrder shipmentOrder = dao.getByTrackingNumber("Y12345");
		System.out.println(shipmentOrder);
		/*List<ShipmentOrder> shipmentOrderList = dao.getSummaryByDateRange("2016-02-17","2016-02-17");
		for(ShipmentOrder shipmentOrder: shipmentOrderList) {
			System.out.println(shipmentOrder);
		}*/
		context.close();
	
	}

	private static ShipmentOrder populateShipmentOrder() {
		ShipmentOrder shipmentOrder = new ShipmentOrder();
		shipmentOrder.setCarrier("YRC");
		shipmentOrder.setOrderDate(new Date());
		//shipmentOrder.setOrderNumber(12345);
		shipmentOrder.setStatus("SUCCESS");
		shipmentOrder.setTrackingNumber("Y12345");
		
		List<ShipmentDocument> shipmentDocList = new ArrayList<ShipmentDocument>();
		
		ShipmentDocument shipmentDoc1 = new ShipmentDocument();
		//shipmentDoc1.setDocumentText("DOC CONTENT");
		shipmentDoc1.setDocumentName("D:/ptms");
		shipmentDoc1.setDocumentTitle("LABEL");
		shipmentDoc1.setDocumentType("PDF");
		shipmentDocList.add(shipmentDoc1);
		
		ShipmentDocument shipmentDoc2 = new ShipmentDocument();
		//shipmentDoc2.setDocumentText("DOC CONTENT");
		shipmentDoc2.setDocumentName("D:/ptms/1");
		shipmentDoc2.setDocumentTitle("Invoice");
		shipmentDoc2.setDocumentType("PDF");
		shipmentDocList.add(shipmentDoc2);
		
		shipmentOrder.setShipmentDocuments(shipmentDocList);
		
		
		return shipmentOrder;
	}
}
