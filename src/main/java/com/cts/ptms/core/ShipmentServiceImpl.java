package com.cts.ptms.core;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.time.FastDateFormat;

import com.cts.ptms.carrier.fedex.FedExShipmentService;
import com.cts.ptms.carrier.ups.UPSShipmentService;
import com.cts.ptms.carrier.yrc.YRCShipmentService;
import com.cts.ptms.dao.ShipmentServiceDAO;
import com.cts.ptms.model.common.BatchOrderSummary;
import com.cts.ptms.model.common.BatchOrderSummaryFilter;
import com.cts.ptms.model.common.ShipmentBatchRequest;
import com.cts.ptms.model.common.ShipmentDocument;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.common.TrackingDetails;
import com.cts.ptms.utils.ShipmentUtils;
import com.cts.ptms.utils.constants.ShippingConstants;

public class ShipmentServiceImpl implements ShipmentService {

	private ShipmentServiceDAO shipmentServiceDAO;
	ClientShipmentService clientShipmentService;
	static String date = FastDateFormat.getInstance("MM-dd-yyyy").format(System.currentTimeMillis( ));

	private void initializeService(String carrier) {
		// Based on carrier and the corresponding configuration load the
		// properties and inject the respective service objects

		if (carrier.equalsIgnoreCase(ShippingConstants.UPS)) {
			clientShipmentService = new UPSShipmentService();
		}
		else if (carrier.equalsIgnoreCase(ShippingConstants.YRC)) {
			clientShipmentService = new YRCShipmentService();
		} 
		else if (carrier.equalsIgnoreCase(ShippingConstants.FEDEX)){
			clientShipmentService = new FedExShipmentService();
		}

	}

	public ShipmentOrder createSingleShipmentOrder(ShipmentRequest shipmentRequest) {
		ShipmentServiceDAO shipmentServiceDAO  =  new ShipmentServiceDAO();
		initializeService(shipmentRequest.getCarrier());		
		ShipmentOrder shipmentOrder = clientShipmentService.createShipment(shipmentRequest);
		shipmentOrder = saveShipmentDocuments(shipmentOrder);
		//shipmentServiceDAO.saveShipmentOrder(shipmentOrder);
		System.out.println(shipmentOrder);
		return shipmentOrder;

	}

	public TrackingDetails getShipmentTrackingDetails(String trackingId) {
		
		ShipmentOrder shipmentOrder = shipmentServiceDAO.getByTrackingNumber(trackingId);
		initializeService(shipmentOrder.getCarrier());
		TrackingDetails trackingDetails = clientShipmentService.getTrackingDetails(trackingId);
		trackingDetails.setShipmentOrder(shipmentOrder);
		return trackingDetails;

	}

	@Override
	public BatchOrderSummary createBatchShipmentOrder(ShipmentBatchRequest shipmentBatchsRequest) {	
		
		BatchOrderSummary batchOrderSummary = new BatchOrderSummary();
		List <ShipmentOrder> shipmentOrderList = new ArrayList<ShipmentOrder>();
		String filePath =  shipmentBatchsRequest.getFilePath();
		if (filePath!=null) {
			File folder = new File(filePath);
			if(folder.exists()) {
				String[] extensions = new String[] { "xml"};
				@SuppressWarnings("unchecked")
				List<File> files =  (List<File>) FileUtils.listFiles(folder,extensions,false);
				for (File file : files) {
						String requestXml=ShipmentUtils.getRequestXml(file);
						String carrier =ShipmentUtils.getCarrierFromRequest(requestXml);
						ShipmentRequest shipmentRequest = new ShipmentRequest();
						shipmentRequest.setShipmentRequestXml(requestXml);
						shipmentRequest.setCarrier(carrier);
						shipmentRequest.setGenLabel(false);
						ShipmentOrder shipmentOrder = createSingleShipmentOrder(shipmentRequest);
						shipmentOrderList.add(shipmentOrder);
						
						
				}
				
				batchOrderSummary.setShipmentOrderList(shipmentOrderList);
			}
		}
		return batchOrderSummary;
	}

	@Override
	public BatchOrderSummary getBatchOrderSummary(BatchOrderSummaryFilter batchOrderSummaryFilter) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	private ShipmentOrder saveShipmentDocuments (ShipmentOrder  shipmentOrder) {	
		
		List<ShipmentDocument> shipmentDocumentList = shipmentOrder.getShipmentDocuments();
		StringBuilder fileNameBuilder = new StringBuilder();
		String path = getClass().getClassLoader().getResource("").getPath();
		path = path.replace(ShippingConstants.FILE_PATH, ShippingConstants.File_Path_Replace);
		//String path = "E:/TestShippingLabelsAndDocuments";
		for (ShipmentDocument shipmentDocument:shipmentDocumentList ) {
			fileNameBuilder.append(path);
			fileNameBuilder.append("/");
			fileNameBuilder.append(shipmentOrder.getCarrier());
			fileNameBuilder.append("_");
			fileNameBuilder.append(shipmentDocument.getDocumentName());
			fileNameBuilder.append("_");
			fileNameBuilder.append(shipmentOrder.getTrackingNumber());
			fileNameBuilder.append(".pdf");
			
			try {
				File outputFile =  new File(fileNameBuilder.toString());
				byte[] decoded = null;
				//String documentContentType = shipmentDocument.getDocumentContentType();
				String documentContentType = shipmentDocument.getDocumentContentType();
				if (documentContentType != null && documentContentType.equals(ShippingConstants.DECODED_BYTE_ARRAY)){
					decoded = shipmentDocument.getDocumentText().getBytes("UTF8");
				} else {
					decoded = Base64.getDecoder().decode(shipmentDocument.getDocumentText());
				}
				FileUtils.writeByteArrayToFile(outputFile,decoded);
				shipmentDocument.setDocumentText("");
				fileNameBuilder.setLength(0);
				fileNameBuilder.append(shipmentOrder.getCarrier());
				fileNameBuilder.append("_");
				fileNameBuilder.append(shipmentDocument.getDocumentName());
				fileNameBuilder.append("_");
				fileNameBuilder.append(shipmentOrder.getTrackingNumber());
				fileNameBuilder.append(".pdf");
				
				shipmentDocument.setDocumentPath(fileNameBuilder.toString());
			} catch (IOException e) {				
				e.printStackTrace();
			}
			fileNameBuilder.setLength(0);
		}
		return shipmentOrder;
	}

	public static void main(String[] args) {

	}
	
}
