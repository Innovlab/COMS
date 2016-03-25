package com.cts.ptms.core;

import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.common.BatchOrderSummary;
import com.cts.ptms.model.common.BatchOrderSummaryFilter;
import com.cts.ptms.model.common.ShipmentBatchRequest;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.common.TrackingDetails;

public interface ShipmentService {
	
	public ShipmentOrder createSingleShipmentOrder(ShipmentRequest shipmentRequest);
	public BatchOrderSummary createBatchShipmentOrder(ShipmentBatchRequest shipmentRequest);
	public TrackingDetails getShipmentTrackingDetails(String trackingId);
	public BatchOrderSummary getBatchOrderSummary(BatchOrderSummaryFilter batchOrderSummaryFilter);
	//For Cancel Shipment
	ShipmentOrder cancelShipmentOrder(ShipmentRequest shipmentRequest);
}
