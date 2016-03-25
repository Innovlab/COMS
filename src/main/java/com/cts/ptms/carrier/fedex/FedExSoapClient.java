/**
 * 
 */
package com.cts.ptms.carrier.fedex;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.cts.ptms.core.ClientGateway;
import com.cts.ptms.exception.shipping.ShippingException;
import com.cts.ptms.model.accept.response.ShipmentAcceptResponse;
import com.cts.ptms.model.common.ShipmentDocument;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.confirm.response.ShipmentConfirmResponse;
import com.cts.ptms.model.fedex.ws.ship.v17.DeleteShipmentRequest;
import com.cts.ptms.model.fedex.ws.ship.v17.NotificationSeverityType;
import com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentReply;
import com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentRequest;
import com.cts.ptms.model.fedex.ws.ship.v17.ShipPortType;
import com.cts.ptms.model.fedex.ws.ship.v17.ShipServiceLocator;
import com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply;
import com.cts.ptms.model.gls.CreateShipUnits;
import com.cts.ptms.utils.constants.ShippingConstants;
import com.itextpdf.text.DocumentException;

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
		ProcessShipmentRequest procShipmentRtrnRequest = null;
		ShipmentOrder shipmentOrder = new ShipmentOrder();
		try 
		{
			FedExMapper fedExMapper = new FedExMapper();
			
			shipmentOrder.setCarrier(request.getCarrier());
			JAXBContext jaxbContext = JAXBContext.newInstance(CreateShipUnits.class);
			File file = new File(request.getFileName());
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			CreateShipUnits createShipUnits = (CreateShipUnits) jaxbUnmarshaller.unmarshal(file);
			String returnLblTckngNum = "";
			//If Return label is requested
			if (request.isGenLabel()) {
				procShipmentRtrnRequest = fedExMapper.mapRequestToCarrierInput(createShipUnits, shipmentOrder, true);	
				makeServiceCall(shipmentOrder, fedExMapper, procShipmentRtrnRequest, true);
				returnLblTckngNum = shipmentOrder.getTrackingNumber();
			}
			
			processShipmentRequest = fedExMapper.mapRequestToCarrierInput(createShipUnits, shipmentOrder, false);	
			makeServiceCall(shipmentOrder, fedExMapper, processShipmentRequest, false);
			
			if (request.isGenLabel()) {
				shipmentOrder.setTrackingNumber(returnLblTckngNum);	
			}
			
			shipmentOrder.setStatus(ShippingConstants.SUCCESS);

		} catch (ShippingException e) {
		    shipmentOrder.setStatus(ShippingConstants.STATUS_FAILURE);
		    logger.severe("Exception occured at createShipmentRequest()::"+e);
		    
		} catch (Exception e) {
			shipmentOrder.setStatus(ShippingConstants.STATUS_FAILURE);
			logger.severe("Exception occured at createShipmentRequest()::"+e);
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
	@Override
	public ShipmentOrder cancelShipment(ShipmentRequest request) {
		
		logger.info("FedExSoapClient:: cancelShipment()==>");
		FedExMapper fedExMapper = new FedExMapper();
		ShipmentOrder shipmentOrder = new ShipmentOrder();
		DeleteShipmentRequest cancelRequest = null;
		
		shipmentOrder.setCarrier(request.getCarrier());
		shipmentOrder.setTrackingNumber(request.getTrackingNumToCancel());
		try {
			// Build a CancelPackageRequest object
			cancelRequest = fedExMapper.mapCancelRequest(shipmentOrder);
			if (cancelRequest == null)
				throw new ShippingException("CancelRequest is null");
			
			ShipServiceLocator service = new ShipServiceLocator();
			ShipPortType port = service.getShipServicePort();
			// This is the call to the web service passing in a CancelPackageRequest and returning a CancelPackageReply
			ShipmentReply reply = port.deleteShipment(cancelRequest);
			//
			NotificationSeverityType nst = reply.getHighestSeverity();
			System.out.println("CancelPackageReply HightestSeverity: " + nst.toString());
			if (fedExMapper.isResponseOk(reply.getHighestSeverity()))
			{
				shipmentOrder.setStatus(ShippingConstants.SUCCESS);
				logger.info("Successfully deleted the shipment...");
			}
			
		} catch (ShippingException e) {
			shipmentOrder.setStatus(ShippingConstants.STATUS_FAILURE);
			shipmentOrder.setErrorDescription(e.getMessage());
			logger.severe("Exception occured at cancelShipment()::"+e);
		} catch (Exception e) {
			shipmentOrder.setStatus(ShippingConstants.STATUS_FAILURE);
			shipmentOrder.setErrorDescription(e.getMessage());
			logger.severe("Exception occured at cancelShipment()::"+e);
		}
		logger.info("FedExSoapClient:: cancelShipment()<==");
		return shipmentOrder;
	}
	
	/**
	 * A method for service call to carrier
	 * @param shipmentOrder
	 * @param fedExMapper
	 * @param processShipmentRequest
	 * @param isReturnSrvcRequested
	 * @return
	 * @throws ShippingException
	 */
	private ShipmentOrder makeServiceCall( ShipmentOrder shipmentOrder, FedExMapper fedExMapper, ProcessShipmentRequest processShipmentRequest,
			boolean isReturnSrvcRequested) throws ShippingException {
		try {
			
			// Initialize the service
			ShipServiceLocator service = new ShipServiceLocator();
			ShipPortType port = service.getShipServicePort();
			// This is the call to the ship web service passing in a request object and returning a reply object
			ProcessShipmentReply reply = port.processShipment(processShipmentRequest); 
			//
			if (fedExMapper.isResponseOk(reply.getHighestSeverity())) // check if the call was successful
			{
				fedExMapper.writeServiceOutput(reply, shipmentOrder);
				//Saving the documents
				List<ShipmentDocument> shipmentDocs = shipmentOrder.getShipmentDocuments();
				if(shipmentDocs != null && !shipmentDocs.isEmpty()) {
					ShipmentDocument shipMntDoc = shipmentDocs.get(0);
					generateShippingLabelPDF(shipMntDoc.getByteArray(), shipmentOrder.getTrackingNumber(), 
							new ShippingConstants(), isReturnSrvcRequested,  ShippingConstants.PNG_FILE);
				}
			}	
		}catch (Exception ex) {
			logger.severe("Exception occurred  at makeServiceCall ==>:"+ex );
			shipmentOrder.setErrorDescription(ex.getMessage());
			throw new ShippingException("Exception occured while invocking carrier service.."+ex.getMessage());
		}
		return shipmentOrder;
	}
	
	//NEED TO PUT COMMON
	/**
	 * This method Generate the shipping label as a PDF file
	 * @throws InterruptedException 
	 * @throws URISyntaxException 
	 */
	public void generateShippingLabelPDF(byte[] decoded,String trackingNumber,ShippingConstants shippingConstants, 
			boolean isRtnLblRequested, String fileType)
			throws MalformedURLException, IOException, DocumentException, InterruptedException, URISyntaxException {
		
		String filename;
		OutputStream out1 = null;
		try {
			if(isRtnLblRequested) {
				filename = new FedExSoapClient().getClass().getClassLoader().getResource("").getPath()
						+"Return_"+ trackingNumber + fileType;
			} else {
				filename = new FedExSoapClient().getClass().getClassLoader().getResource("").getPath()
						+ trackingNumber + fileType;
			}
			filename = filename.replace(ShippingConstants.FILE_PATH, ShippingConstants.File_Path_Replace);
			try {
				out1 = new BufferedOutputStream(new FileOutputStream(filename));
				out1.write(decoded);
			} finally {
				if (out1 != null) {
					out1.close();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
