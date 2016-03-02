/**
 * 
 */
package com.cts.ptms.carrier.fedex;

import java.io.File;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.cts.ptms.core.ClientGateway;
import com.cts.ptms.exception.shipping.ShippingException;
import com.cts.ptms.model.accept.response.ShipmentAcceptResponse;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.confirm.response.ShipmentConfirmResponse;
import com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentReply;
import com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentRequest;
import com.cts.ptms.model.fedex.ws.ship.v17.ShipPortType;
import com.cts.ptms.model.fedex.ws.ship.v17.ShipServiceLocator;
import com.cts.ptms.model.gls.CreateShipUnits;

/**
 * @author 417765
 *
 */
public class FedExSoapClient implements ClientGateway {
	
	private Logger logger = Logger.getAnonymousLogger() ; 
	@Override
	public void initialize() 
	{
		//
	}
	/**
	 * 
	 */
	@Override
	public ShipmentOrder createShipmentRequest(ShipmentRequest request) 
	{
		logger.info("Trying to create the shipment.");
		ProcessShipmentRequest processShipmentRequest = null;
		ShipmentOrder shipmentOrder = null;
		try 
		{
			FedExMapper fedExMapper = new FedExMapper();
			shipmentOrder = new ShipmentOrder();
			if(request.getCarrierAccessRequest() == null) {
				JAXBContext jaxbContext = JAXBContext.newInstance(CreateShipUnits.class);
				File file = new File(request.getFileName());
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				CreateShipUnits createShipUnits = (CreateShipUnits) jaxbUnmarshaller.unmarshal(file);
				request.setCreateShipUnits(createShipUnits);
				processShipmentRequest = fedExMapper.mapRequestToCarrierInput(request);
			} else {
				shipmentOrder.setCarrier("FEDEX");
				processShipmentRequest = fedExMapper.mapRequestToCarrierInput(request);
			}
			// Initialize the service
			ShipServiceLocator service;
			ShipPortType port;
			//
			service = new ShipServiceLocator();
			fedExMapper.updateEndPoint(service);
			port = service.getShipServicePort();
			// This is the call to the ship web service passing in a request object and returning a reply object
			ProcessShipmentReply reply = port.processShipment(processShipmentRequest); 
			//
			if (fedExMapper.isResponseOk(reply.getHighestSeverity())) // check if the call was successful
			{
				fedExMapper.writeServiceOutput(reply, shipmentOrder);
			}	
			fedExMapper.printNotifications(reply.getNotifications(), shipmentOrder);

		} catch (ShippingException e) {
		    e.printStackTrace();
		    logger.severe("Exception occured at createShipmentRequest()::"+e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occured::"+e);
		}
		return shipmentOrder;
	}

	@Override
	public void handleError() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ShipmentOrder createShipmentResposeObj(ShipmentConfirmResponse confirmResponse,
			ShipmentAcceptResponse acceptResponse) {
		return null;
	}
}
