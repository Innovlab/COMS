package com.cts.ptms.carrier.yrc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cts.ptms.core.ClientGateway;
import com.cts.ptms.core.ClientShipmentService;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.common.BatchOrderSummary;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.TrackingDetails;
import com.cts.ptms.model.confirm.request.ShipFromAddressType;
import com.cts.ptms.model.confirm.request.ShipFromType;
import com.cts.ptms.model.confirm.request.ShipToAddressType;
import com.cts.ptms.model.confirm.request.ShipToType;
import com.cts.ptms.model.confirm.request.ShipmentType;
import com.cts.ptms.model.gls.ADDRESS;
import com.cts.ptms.model.gls.ShipmentConfirmRequest.Shipment.ShipFrom.Address;

public class YRCShipmentService implements ClientShipmentService {
	

	private ClientGateway clientService;
	
	public YRCShipmentService() {		
		getClientService();
	}

	public ShipmentOrder createShipment(ShipmentRequest request) {
		ShipmentOrder shipmentResponse = clientService.createShipmentRequest(request);
		ShipmentType shipmentTypeDO = new ShipmentType();
		List<ADDRESS> addressList = request.getCreateShipUnits().getCreateShipUnitsParams().getCREATESHIPUNITSPARAMS1().getSHIPUNIT().getADDRESS();
		for (ADDRESS address : addressList) {
			switch(address.getClazz()) {
				case "DELIVER_TO" : {
					ShipToType shipToType = new ShipToType();
					ShipToAddressType shipToAddressType = new ShipToAddressType();
					shipToAddressType.setAddressLine1(address.getAddress1());
					shipToAddressType.setCity(address.getCity());
					shipToType.setAddress(shipToAddressType);
					shipToType.setPhoneNumber(address.getPhoneNumber().toString());
					shipToType.setAttentionName(address.getState());
					shipToType.setCompanyName(address.getIndividualName());
					shipToType.setAddress(shipToAddressType);					
					shipmentTypeDO.setShipTo(shipToType);
				}
				case "ORDER_BY" : {
					ShipFromType shipFromType = new ShipFromType();
					ShipFromAddressType shipFromAddressType = new ShipFromAddressType();
					shipFromAddressType.setAddressLine1(address.getAddress1());
					shipFromAddressType.setCity(address.getCity());
					shipFromType.setAddress(shipFromAddressType);
					shipFromType.setPhoneNumber(address.getPhoneNumber().toString());
					shipFromType.setAttentionName(address.getState());
					shipFromType.setCompanyName(address.getIndividualName());
					shipFromType.setAddress(shipFromAddressType);					
					shipmentTypeDO.setShipFrom(shipFromType);
					
				}
				
			}
		}
		shipmentResponse.setShipmentTypeDO(shipmentTypeDO);
		return shipmentResponse;
	}
	
	
	public TrackingDetails getTrackingDetails(String trackingId) {
		return new TrackingDetails();
		
	}
	

	
	public ClientGateway getClientService() {
		clientService = new YRCSoapClient();
		return clientService;
	}

	

	public void processOutputFiles() {
		// TODO Auto-generated method stubs
		
	}
	
	public void populateSummary(List<ShipmentOrder> shipmentOrderList) {
		BatchOrderSummary batchOrderSummary =  new BatchOrderSummary();
		batchOrderSummary.setTotalOrdersFound(shipmentOrderList.size());
		int carrierCount=0;
		int shipmentTypeCount=0;
		Map<String,Integer> carrierMap = new HashMap<String,Integer>();
		Map<String,Integer> shipmentTypeMap = new HashMap<String,Integer>();
		 
		for( ShipmentOrder shipmentOrder: shipmentOrderList) {
			
		
		}
	}

	
	public static void main (String[] args) {
		ShipmentRequest shipmentRequest = new ShipmentRequest();
		shipmentRequest.setFileName("D:/samplePdf/source.xml");
		YRCShipmentService service = new YRCShipmentService();
		ShipmentOrder shipmentResponse = service.createShipment(shipmentRequest);
		System.out.println("=============================================");
		System.out.println(shipmentResponse);
		
	}

	

}
