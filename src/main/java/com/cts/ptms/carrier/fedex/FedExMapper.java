/**
 * 
 */
package com.cts.ptms.carrier.fedex;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

import org.apache.axis.types.NonNegativeInteger;
import org.apache.axis.types.PositiveInteger;

import com.cts.ptms.exception.shipping.ShippingException;
import com.cts.ptms.model.common.ShipmentDocument;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.fedex.ws.ship.v17.Address;
import com.cts.ptms.model.fedex.ws.ship.v17.AssociatedShipmentDetail;
import com.cts.ptms.model.fedex.ws.ship.v17.ClientDetail;
import com.cts.ptms.model.fedex.ws.ship.v17.CompletedPackageDetail;
import com.cts.ptms.model.fedex.ws.ship.v17.CompletedShipmentDetail;
import com.cts.ptms.model.fedex.ws.ship.v17.Contact;
import com.cts.ptms.model.fedex.ws.ship.v17.CustomerReference;
import com.cts.ptms.model.fedex.ws.ship.v17.CustomerReferenceType;
import com.cts.ptms.model.fedex.ws.ship.v17.Dimensions;
import com.cts.ptms.model.fedex.ws.ship.v17.DropoffType;
import com.cts.ptms.model.fedex.ws.ship.v17.FreightBaseCharge;
import com.cts.ptms.model.fedex.ws.ship.v17.FreightRateDetail;
import com.cts.ptms.model.fedex.ws.ship.v17.FreightRateNotation;
import com.cts.ptms.model.fedex.ws.ship.v17.LabelFormatType;
import com.cts.ptms.model.fedex.ws.ship.v17.LabelSpecification;
import com.cts.ptms.model.fedex.ws.ship.v17.LinearUnits;
import com.cts.ptms.model.fedex.ws.ship.v17.Money;
import com.cts.ptms.model.fedex.ws.ship.v17.Notification;
import com.cts.ptms.model.fedex.ws.ship.v17.NotificationSeverityType;
import com.cts.ptms.model.fedex.ws.ship.v17.PackageOperationalDetail;
import com.cts.ptms.model.fedex.ws.ship.v17.PackagingType;
import com.cts.ptms.model.fedex.ws.ship.v17.Party;
import com.cts.ptms.model.fedex.ws.ship.v17.Payment;
import com.cts.ptms.model.fedex.ws.ship.v17.PaymentType;
import com.cts.ptms.model.fedex.ws.ship.v17.Payor;
import com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentReply;
import com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentRequest;
import com.cts.ptms.model.fedex.ws.ship.v17.RequestedPackageLineItem;
import com.cts.ptms.model.fedex.ws.ship.v17.RequestedShipment;
import com.cts.ptms.model.fedex.ws.ship.v17.ServiceType;
import com.cts.ptms.model.fedex.ws.ship.v17.ShipServiceLocator;
import com.cts.ptms.model.fedex.ws.ship.v17.ShipmentOperationalDetail;
import com.cts.ptms.model.fedex.ws.ship.v17.ShipmentRateDetail;
import com.cts.ptms.model.fedex.ws.ship.v17.ShipmentRating;
import com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocument;
import com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentImageType;
import com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentPart;
import com.cts.ptms.model.fedex.ws.ship.v17.Surcharge;
import com.cts.ptms.model.fedex.ws.ship.v17.TrackingId;
import com.cts.ptms.model.fedex.ws.ship.v17.TransactionDetail;
import com.cts.ptms.model.fedex.ws.ship.v17.VersionId;
import com.cts.ptms.model.fedex.ws.ship.v17.WebAuthenticationCredential;
import com.cts.ptms.model.fedex.ws.ship.v17.WebAuthenticationDetail;
import com.cts.ptms.model.fedex.ws.ship.v17.Weight;
import com.cts.ptms.model.fedex.ws.ship.v17.WeightUnits;
import com.cts.ptms.model.gls.ADDRESS;
import com.cts.ptms.model.gls.CreateShipUnits;
import com.cts.ptms.model.gls.SHIPUNIT;
import com.cts.ptms.utils.constants.ShippingConstants;
import com.cts.ptms.utils.constants.UPSConstants;

/**
 * @author 417765
 *
 */
public class FedExMapper {
	
	private Logger logger = Logger.getAnonymousLogger() ;
	
	/**
	 * This method maps the input request to carrier specific request
	 * @param request
	 * @return
	 * @throws ShippingException
	 */
	public ProcessShipmentRequest mapRequestToCarrierInput(CreateShipUnits createShipUnits) throws ShippingException{
		
		ProcessShipmentRequest processShipmentRequest  = null;
		try {
			
			processShipmentRequest = new ProcessShipmentRequest();
			
			processShipmentRequest.setClientDetail(createClientDetail());
			processShipmentRequest.setWebAuthenticationDetail(createWebAuthenticationDetail());
			
			
			if (createShipUnits == null) {
				logger.severe("Ship units are empty");
				throw new ShippingException("Ship units are empty");
			}
			
			SHIPUNIT  shipUnit = createShipUnits.getCreateShipUnitsParams().getCREATESHIPUNITSPARAMS1().getSHIPUNIT();
			RequestedShipment requestedShipment = new RequestedShipment();
			
		    TransactionDetail transactionDetail = new TransactionDetail();
		    transactionDetail.setCustomerTransactionId("Domestic Express Ship Request"); // The client will get the same value back in the response
		    processShipmentRequest.setTransactionDetail(transactionDetail);
	
	        VersionId versionId = new VersionId("ship", 17, 0, 0);
	        processShipmentRequest.setVersion(versionId);
		    
		    requestedShipment.setShipTimestamp(Calendar.getInstance()); // Ship date and time
		    requestedShipment.setDropoffType(DropoffType.REGULAR_PICKUP); // Dropoff Types are BUSINESS_SERVICE_CENTER, DROP_BOX, REGULAR_PICKUP, REQUEST_COURIER, STATION
		    String shipVia = shipUnit.getShipVia().toString();
		    if (shipVia.equals("3")) {
		    	requestedShipment.setServiceType(ServiceType.FEDEX_GROUND);
		    } else if (shipVia.equals("2")){
		    	requestedShipment.setServiceType(ServiceType.FEDEX_2_DAY); // Service types are STANDARD_OVERNIGHT, PRIORITY_OVERNIGHT, FEDEX_GROUND ...
		    }
		    requestedShipment.setPackagingType(PackagingType.YOUR_PACKAGING); // Packaging type FEDEX_BOX, FEDEX_PAK, FEDEX_TUBE, YOUR_PACKAGING, ...
		    
		    List<ADDRESS> addressList = shipUnit.getADDRESS();
			for (ADDRESS address : addressList ) {
				String addressType = address.getClazz();
				if(addressType.equals(UPSConstants.DELIVER_TO)) {
					requestedShipment.setRecipient(addRecipient(address));
				} else if(addressType.equals(UPSConstants.ORDERED_BY)) {
					//shipFromAddress = address;
				} else if(addressType.equals(UPSConstants.RETURN)) {
					 requestedShipment.setShipper(addShipper(address));
				}
			}
			requestedShipment.setShippingChargesPayment(addShippingChargesPayment("510087224"));
		    requestedShipment.setLabelSpecification(addLabelSpecification());
	        //At present considering only one item.
		    requestedShipment.setPackageCount(new NonNegativeInteger("1"));
		    requestedShipment.setRequestedPackageLineItems(new RequestedPackageLineItem[] {addRequestedPackageLineItem(shipUnit)}); 
	        //
		    processShipmentRequest.setRequestedShipment(requestedShipment);
		} catch (Exception e) {
			logger.severe("Exception occured at : "+e.getClass().getName());
			throw new ShippingException(e.getMessage());
		}
		return processShipmentRequest;
	}
	/**
	 * 
	 * @param reply
	 * @param shipmentOrder
	 * @throws Exception
	 */
	public void writeServiceOutput(ProcessShipmentReply reply, ShipmentOrder shipmentOrder) throws Exception
	{
		try
		{
			CompletedShipmentDetail csd = reply.getCompletedShipmentDetail(); 
			CompletedPackageDetail cpd[] = csd.getCompletedPackageDetails();
			savePackageDetails(cpd, shipmentOrder);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param notificationSeverityType
	 * @return
	 */
	public boolean isResponseOk(NotificationSeverityType notificationSeverityType) {
		if (notificationSeverityType == null) {
			return false;
		}
		if (notificationSeverityType.equals(NotificationSeverityType.WARNING) ||
			notificationSeverityType.equals(NotificationSeverityType.NOTE)    ||
			notificationSeverityType.equals(NotificationSeverityType.SUCCESS)) {
			return true;
		}
 		return false;
	}
	/**
	 * 
	 * @param notifications
	 * @param shipmentOrder
	 * @return
	 */
	public ShipmentOrder printNotifications(Notification[] notifications, ShipmentOrder shipmentOrder) {
		System.out.println("Notifications:");
		if (notifications == null || notifications.length == 0) {
			System.out.println("  No notifications returned");
		}
		for (int i=0; i < notifications.length; i++) {
			Notification n = notifications[i];
			System.out.print("  Notification no. " + i + ": ");
			if (n == null) {
				System.out.println("null");
				continue;
			} else {
				System.out.println("");
			}
			NotificationSeverityType nst = n.getSeverity();
			
			System.out.println("    Severity: " + (nst == null ? "null" : nst.getValue()));
			System.out.println("    Code: " + n.getCode());
			System.out.println("    Message: " + n.getMessage());
			System.out.println("    Source: " + n.getSource());
			String status = nst.getValue();
			if (status.equals("ERROR") || status.equals("FAILURE") ) {
				shipmentOrder.setErrorSeverity(nst.getValue());
				shipmentOrder.setErrorCode(n.getCode());
				shipmentOrder.setErrorDescription(n.getMessage());
				
			} else {
				shipmentOrder.setStatus("SUCCESS");
			}
		}
		return shipmentOrder;
	}
	
	/**
	 * 
	 * @param money
	 * @param description
	 * @param space
	 */
	public  void printMoney(Money money, String description, String space){
		if(money!=null){
			System.out.println(space + description + ": " + money.getAmount() + " " + money.getCurrency());
		}
	}
	/**
	 * 
	 * @param weight
	 * @param description
	 * @param space
	 */
	public  void printWeight(Weight weight, String description, String space){
		if(weight!=null){
			System.out.println(space + description + ": " + weight.getValue() + " " + weight.getUnits());
		}
	}
	/**
	 * 
	 * @param value
	 * @param description
	 * @param space
	 */
	public  void printString(String value, String description, String space){
		if(value!=null){
			System.out.println(space + description + ": " + value);
		}
	}
	/**
	 * 
	 * @param packageWeight
	 * @param weightUnits
	 * @return
	 */
	public  Weight addPackageWeight(Double packageWeight, WeightUnits weightUnits){
		Weight weight = new Weight();
		weight.setUnits(weightUnits);
		weight.setValue(new BigDecimal(packageWeight));
		return weight;
	}
	/**
	 * 
	 * @param length
	 * @param height
	 * @param width
	 * @param linearUnits
	 * @return
	 */
	public  Dimensions addPackageDimensions(Integer length, Integer height, Integer width, LinearUnits linearUnits){ 
		Dimensions dimensions = new Dimensions();
		dimensions.setLength(new NonNegativeInteger(length.toString()));
		dimensions.setHeight(new NonNegativeInteger(height.toString()));
		dimensions.setWidth(new NonNegativeInteger(width.toString()));
		dimensions.setUnits(linearUnits);
		return dimensions;
	}
	/**
	 * 
	 * @param shipmentOperationalDetail
	 */
	//Shipment level reply information
	public  void printShipmentOperationalDetails(ShipmentOperationalDetail shipmentOperationalDetail){
		if(shipmentOperationalDetail!=null){
			System.out.println("Routing Details");
			printString(shipmentOperationalDetail.getUrsaPrefixCode(), "URSA Prefix", "  ");
			if(shipmentOperationalDetail.getCommitDay()!=null)
				printString(shipmentOperationalDetail.getCommitDay().getValue(), "Service Commitment", "  ");
			printString(shipmentOperationalDetail.getAirportId(), "Airport Id", "  ");
			if(shipmentOperationalDetail.getDeliveryDay()!=null)
				printString(shipmentOperationalDetail.getDeliveryDay().getValue(), "Delivery Day", "  ");
			System.out.println();
		}
	}
	/**
	 * 
	 * @param shipmentRating
	 */
	public  void printShipmentRating(ShipmentRating shipmentRating) {
		if(shipmentRating!=null){
			System.out.println("Shipment Rate Details");
			ShipmentRateDetail[] srd = shipmentRating.getShipmentRateDetails();
			for(int j=0; j < srd.length; j++)
			{
				System.out.println("  Rate Type: " + srd[j].getRateType().getValue());
				printWeight(srd[j].getTotalBillingWeight(), "Shipment Billing Weight", "    ");
				printMoney(srd[j].getTotalBaseCharge(), "Shipment Base Charge", "    ");
				printMoney(srd[j].getTotalNetCharge(), "Shipment Net Charge", "    ");
				printMoney(srd[j].getTotalSurcharges(), "Shipment Total Surcharge", "    ");
				if (null != srd[j].getSurcharges())
				{
					System.out.println("    Surcharge Details");
					Surcharge[] s = srd[j].getSurcharges();
					for(int k=0; k < s.length; k++)
					{
						printMoney(s[k].getAmount(),s[k].getSurchargeType().getValue(), "      ");
					}
				}
				printFreightDetail(srd[j].getFreightRateDetail());
				System.out.println();
			}
		}
	}
	/**
	 * 
	 * @param packageOperationalDetail
	 */
	//Package level reply information
	public  void printPackageOperationalDetails(PackageOperationalDetail packageOperationalDetail){
		if(packageOperationalDetail!=null){
			System.out.println("  Routing Details");
			printString(packageOperationalDetail.getAstraHandlingText(), "Astra", "    ");
			printString(packageOperationalDetail.getGroundServiceCode(), "Ground Service Code", "    ");
			System.out.println();
		}
	}
	
	public  void savePackageDetails(CompletedPackageDetail[] cpd, ShipmentOrder shipmentOrder) throws Exception{
		if(cpd!=null){
			System.out.println("Package Details");
			for (int i=0; i < cpd.length; i++) { // Package details / Rating information for each package
				String trackingNumber = cpd[i].getTrackingIds()[0].getTrackingNumber();
				printTrackingNumbers(cpd[i]);
				System.out.println();
				//
				//printPackageRating(cpd[i].getPackageRating());
				//	Write label buffer to file
				ShippingDocument sd = cpd[i].getLabel();
				saveLabelToFile(sd, trackingNumber, shipmentOrder);
				//printPackageOperationalDetails(cpd[i].getOperationalDetail());
				//System.out.println();
			}
		}
	}
	
	/*public  void printPackageRating(PackageRating packageRating){
		if(packageRating!=null){
			System.out.println("Package Rate Details");
			PackageRateDetail[] prd = packageRating.getPackageRateDetails();
			for(int j=0; j < prd.length; j++)
			{
				System.out.println("  Rate Type: " + prd[j].getRateType().getValue());
				printWeight(prd[j].getBillingWeight(), "Billing Weight", "    ");
				printMoney(prd[j].getBaseCharge(), "Base Charge", "    ");
				printMoney(prd[j].getNetCharge(), "Net Charge", "    ");
				printMoney(prd[j].getTotalSurcharges(), "Total Surcharge", "    ");
				if (null != prd[j].getSurcharges())
				{
					System.out.println("    Surcharge Details");
					Surcharge[] s = prd[j].getSurcharges();
					for(int k=0; k < s.length; k++)
					{
						printMoney(s[k].getAmount(),s[k].getSurchargeType().getValue(), "      ");
					}
				}
				System.out.println();
			}
		}
	}*/
	
	public  void printTrackingNumbers(CompletedPackageDetail completedPackageDetail){
		if(completedPackageDetail.getTrackingIds()!=null){
			TrackingId[] trackingId = completedPackageDetail.getTrackingIds();
			for(int i=0; i< trackingId.length; i++){
				String trackNumber = trackingId[i].getTrackingNumber();
				String trackType = trackingId[i].getTrackingIdType().getValue();
				String formId = trackingId[i].getFormId();
				printString(trackNumber, trackType + " tracking number", "  ");
				printString(formId, "Form Id", "  ");
			}
		}
	}
	
    
	public  String getPayorAccountNumber() {
		// See if payor account number is set as system property,
		// if not default it to "XXX"
		String payorAccountNumber = System.getProperty("Payor.AccountNumber");
		if (payorAccountNumber == null) {
			payorAccountNumber = "510087224"; // Replace "XXX" with the payor account number
		}
		return payorAccountNumber;
	}
	/**
	 * 
	 * @param shprAddress
	 * @return
	 */
	public  Party addShipper(ADDRESS shprAddress) {
		
	    Party shipperParty = new Party(); // Sender information
	    Contact shipperContact = new Contact();
	    try {
		    shipperContact.setPersonName(shprAddress.getIndividualName());
		    //shipperContact.setCompanyName("Sender Company Name");
		    shipperContact.setPhoneNumber(shprAddress.getPhoneNumber().toString());
		    Address shipperAddress = new Address();
		    shipperAddress.setStreetLines(new String[] {shprAddress.getAddress1(), shprAddress.getAddress2()});
		    shipperAddress.setCity(shprAddress.getCity());
		    shipperAddress.setStateOrProvinceCode(shprAddress.getState());
		    shipperAddress.setPostalCode(shprAddress.getZIPCode().toString());
		    shipperAddress.setCountryCode(shprAddress.getCountry());	    
		    shipperParty.setContact(shipperContact);
		    shipperParty.setAddress(shipperAddress);
	    } catch (Exception e) {
	    	logger.severe("Exception occured in addShipper()::"+e.getMessage());
	    	throw new ShippingException("Exception occured in addShipper()::"+e.getMessage());
	    }
	    return shipperParty;
	}
	/**
	 * 
	 * @param shipToAddress
	 * @return
	 */
	public  Party addRecipient(ADDRESS shipToAddress){
	    Party recipientParty = new Party(); // Recipient information
	    Contact recipientContact = new Contact();
	    recipientContact.setPersonName(shipToAddress.getIndividualName());
	    //recipientContact.setCompanyName("Recipient Company Name");
	    recipientContact.setPhoneNumber(shipToAddress.getPhoneNumber().toString());
	    Address recipientAddress = new Address();
	    recipientAddress.setStreetLines(new String[] {shipToAddress.getAddress1()});
	    recipientAddress.setCity(shipToAddress.getCity());
	    recipientAddress.setStateOrProvinceCode(shipToAddress.getState());
	    recipientAddress.setPostalCode(shipToAddress.getZIPCode().toString());
	    recipientAddress.setCountryCode(shipToAddress.getCountry());
	    recipientAddress.setResidential(Boolean.valueOf(true));	    
	    recipientParty.setContact(recipientContact);
	    recipientParty.setAddress(recipientAddress);
	    return recipientParty;
	}
	/**
	 * 
	 * @param payerAccountNumber
	 * @return
	 */
	public  Payment addShippingChargesPayment(String payerAccountNumber){
	    Payment payment = new Payment(); // Payment information
	    payment.setPaymentType(PaymentType.SENDER);
	    Payor payor = new Payor();
	    Party responsibleParty = new Party();
	    responsibleParty.setAccountNumber(payerAccountNumber);
	    Address responsiblePartyAddress = new Address();
	    responsiblePartyAddress.setCountryCode("US");
	    responsibleParty.setAddress(responsiblePartyAddress);
	    responsibleParty.setContact(new Contact());
		payor.setResponsibleParty(responsibleParty);
	    payment.setPayor(payor);
	    return payment;
	}
	
	/*public  ShipmentSpecialServicesRequested addShipmentSpecialServicesRequested(){
	    ShipmentSpecialServicesRequested shipmentSpecialServicesRequested = new ShipmentSpecialServicesRequested();
	    ShipmentSpecialServiceType shipmentSpecialServiceType[]=new ShipmentSpecialServiceType[1];
	    shipmentSpecialServiceType[0]=ShipmentSpecialServiceType.COD;
	    shipmentSpecialServicesRequested.setSpecialServiceTypes(shipmentSpecialServiceType);
	    CodDetail codDetail = new CodDetail();
	    codDetail.setCollectionType(CodCollectionType.ANY);
	    Money codMoney = new Money();
	    codMoney.setCurrency("USD");
	    codMoney.setAmount(new BigDecimal(150.0));
	    codDetail.setCodCollectionAmount(codMoney);
	    shipmentSpecialServicesRequested.setCodDetail(codDetail);
	    return shipmentSpecialServicesRequested;
	}*/
	/**
	 * 
	 * @param shipUnit
	 * @return
	 */
	public  RequestedPackageLineItem addRequestedPackageLineItem(SHIPUNIT shipUnit){
		RequestedPackageLineItem requestedPackageLineItem = null;
		try 
		{
			requestedPackageLineItem = new RequestedPackageLineItem();
			requestedPackageLineItem.setSequenceNumber(new PositiveInteger("1"));
			//requestedPackageLineItem.setGroupPackageCount(new PositiveInteger("1"));
			requestedPackageLineItem.setWeight(addPackageWeight(shipUnit.getWeight().doubleValue(), WeightUnits.LB));
			requestedPackageLineItem.setDimensions(addPackageDimensions(shipUnit.getLength().intValue(), shipUnit.getHeight().intValue(),
					shipUnit.getWidth().intValue(), LinearUnits.IN));
			requestedPackageLineItem.setCustomerReferences(new CustomerReference[]{
					addCustomerReference(CustomerReferenceType.CUSTOMER_REFERENCE.getValue(), shipUnit.getCarrierReferenceNote().toString()),
					addCustomerReference(CustomerReferenceType.INVOICE_NUMBER.getValue(), shipUnit.getOrderNumber().toString()), //NOTE: WILL BE DETERMINED LATER-VENKATA
					addCustomerReference(CustomerReferenceType.P_O_NUMBER.getValue(), shipUnit.getOrderNumber().toString()),
			});
		
		}catch(Exception e) {
			logger.severe("Exception Occured at addRequestedPackageLineItem::"+e.getMessage());
		}
		return requestedPackageLineItem;
	}
	
	public  CustomerReference addCustomerReference(String customerReferenceType, String customerReferenceValue){
		CustomerReference customerReference = new CustomerReference();
		customerReference.setCustomerReferenceType(CustomerReferenceType.fromString(customerReferenceType));
		customerReference.setValue(customerReferenceValue);
		return customerReference;
	}
	
	public  LabelSpecification addLabelSpecification(){
	    LabelSpecification labelSpecification = new LabelSpecification(); // Label specification	    
		labelSpecification.setImageType(ShippingDocumentImageType.PNG);// Image types PDF, PNG, DPL, ...	
	    labelSpecification.setLabelFormatType(LabelFormatType.COMMON2D); //LABEL_DATA_ONLY, COMMON2D
	    //labelSpecification.setLabelStockType(LabelStockType.value2); // STOCK_4X6.75_LEADING_DOC_TAB	    
	    //labelSpecification.setLabelPrintingOrientation(LabelPrintingOrientationType.TOP_EDGE_OF_TEXT_FIRST);
	    return labelSpecification;
	}
	
	public  void printFreightDetail(FreightRateDetail freightRateDetail){
		if(freightRateDetail!=null){
			System.out.println("  Freight Details");
			printFreightNotations(freightRateDetail);
			printFreightBaseCharges(freightRateDetail);
			
		}
	}
	
	public  void printFreightNotations(FreightRateDetail frd){
		if(null != frd.getNotations()){
			System.out.println("    Notations");
			FreightRateNotation notations[] = frd.getNotations();
			for(int n=0; n< notations.length; n++){
				printString(notations[n].getCode(), "Code", "      ");
				printString(notations[n].getDescription(), "Notification", "      ");
			}
		}
	}
	
	public  void printFreightBaseCharges(FreightRateDetail frd){
		if(null != frd.getBaseCharges()){
			FreightBaseCharge baseCharges[] = frd.getBaseCharges();
			for(int i=0; i < baseCharges.length; i++){
				System.out.println("    Freight Rate Details");
				printString(baseCharges[i].getDescription(), "Description", "      ");
				printString(baseCharges[i].getFreightClass().getValue(), "Freight Class", "      ");
				printString(baseCharges[i].getRatedAsClass().getValue(), "Rated Class", "      ");
				printWeight(baseCharges[i].getWeight(), "Weight", "      ");
				printString(baseCharges[i].getChargeBasis().getValue(), "Charge Basis", "      ");
				printMoney(baseCharges[i].getChargeRate(), "Charge Rate", "      ");
				printMoney(baseCharges[i].getExtendedAmount(), "Extended Amount", "      ");
				printString(baseCharges[i].getNmfcCode(), "NMFC Code", "      ");
			}
		}
	}
	
	public  String printMasterTrackingNumber(CompletedShipmentDetail csd){
		String trackingNumber="";
		if(null != csd.getMasterTrackingId()){
			trackingNumber = csd.getMasterTrackingId().getTrackingNumber();
			System.out.println("Master Tracking Number");
			System.out.println("  Type: "
					+ csd.getMasterTrackingId().getTrackingIdType());
			System.out.println("  Tracking Number: " 
					+ trackingNumber);
		}
		return trackingNumber;
	}
	
	//Saving and displaying shipping documents (labels)
	public  void saveLabelToFile(ShippingDocument shippingDocument, String trackingNumber, 
			ShipmentOrder shipmentOrder) throws Exception {
		ShippingDocumentPart[] sdparts = shippingDocument.getParts();
		List<ShipmentDocument> shipmentDocuments = new ArrayList<ShipmentDocument>(0);
		for (int a=0; a < sdparts.length; a++) {
			ShipmentDocument shipmentDocument = new ShipmentDocument();
			String imageType = shippingDocument.getImageType().getValue();
			ShippingDocumentPart sdpart = sdparts[a];
			shipmentDocument.setDocumentName(ShippingConstants.SHIPPING_LABEL_DOC);
			shipmentDocument.setDocumentType(imageType);
			shipmentDocument.setDocumentContentType(ShippingConstants.DECODED_BYTE_ARRAY);
			//shipmentDocument.setDocumentText();
			shipmentDocument.setByteArray(sdpart.getImage());
			shipmentDocuments.add(shipmentDocument);
		}
		shipmentOrder.setShipmentDocuments(shipmentDocuments);
		shipmentOrder.setTrackingNumber(trackingNumber);
	}
	/**
	 * 
	 * @param shippingDocument
	 * @param trackingNumber
	 * @param shipmentOrder
	 * @throws Exception
	 */
	/*public  void saveShipmentDocumentsToFile(CompletedPackageDetail[] packageDetails, String trackingNumber,
			ShipmentOrder shipmentOrder) throws Exception {
		if(packageDetails!= null){
			
			List<ShipmentDocument> shipmentDocuments = new ArrayList<ShipmentDocument>(0);
			for(int i=0; i < packageDetails.length; i++){
				TrackingId[] trackingIds = packageDetails[i].getTrackingIds();
				for(TrackingId trackingId : trackingIds) {
					
				}
				ShippingDocument shipDocLabel = packageDetails[i].getLabel();
				ShippingDocumentPart[] sdparts = shipDocLabel.getParts();
				for (int a=0; a < sdparts.length; a++) {
					try{
						ShipmentDocument shipmentDocument = new ShipmentDocument();
						ShippingDocumentPart sdpart = sdparts[a];
						String imageType = shipDocLabel.getImageType().toString();
						
						StringBuilder stringBuilder = new StringBuilder();
						stringBuilder.append(new ShipmentCommonUtilities().getClass().getClassLoader()
								.getResource("").getPath()).append("/").append(trackingNumber).append(".").append(imageType);
						String labelLocation = stringBuilder.toString();
						File shippingDocumentLabelFile = new File(labelLocation);
						FileOutputStream fos = new FileOutputStream( shippingDocumentLabelFile );
						byte[] imageArray = sdpart.getImage();
						fos.write(imageArray);
						fos.close();
						String decodedString = new String(imageArray, "UTF-8");
						shipmentDocument.setDocumentName("SHIPPINGLABEL");
						shipmentDocument.setDocumentType(imageType);
						shipmentDocument.setDocumentText(decodedString);	
						shipmentDocuments.add(shipmentDocument);
						System.out.println("\nAssociated shipment label file name " + shippingDocumentLabelFile.getAbsolutePath());
						//Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + shippingDocumentLabelFile.getAbsolutePath());
					}catch(Exception ex){
						logger.severe("Exception occured while saving file ::saveShipmentDocumentsToFile::"+ ex.getMessage());
					}
				}
			}
			shipmentOrder.setShipmentDocuments(shipmentDocuments);
		}
	}*/
	
	public  void getAssociatedShipmentLabels(AssociatedShipmentDetail[] associatedShipmentDetail) throws Exception{
		if(associatedShipmentDetail!=null){
			for (int j=0; j < associatedShipmentDetail.length; j++){
				if(associatedShipmentDetail[j].getLabel()!=null && associatedShipmentDetail[j].getType()!=null){
					String trackingNumber = associatedShipmentDetail[j].getTrackingId().getTrackingNumber();
					String associatedShipmentType = associatedShipmentDetail[j].getType().getValue();
					ShippingDocument associatedShipmentLabel = associatedShipmentDetail[j].getLabel();
					saveAssociatedShipmentLabelToFile(associatedShipmentLabel, trackingNumber, associatedShipmentType);
				}
			}
		}
	}
	/**
	 * 
	 * @param shippingDocument
	 * @param trackingNumber
	 * @param labelName
	 * @throws Exception
	 */
	public  void saveAssociatedShipmentLabelToFile(ShippingDocument shippingDocument, String trackingNumber, String labelName) throws Exception {
		ShippingDocumentPart[] sdparts = shippingDocument.getParts();
		for (int a=0; a < sdparts.length; a++) {
			ShippingDocumentPart sdpart = sdparts[a];
			String labelLocation = System.getProperty("file.label.location");
			if (labelLocation == null) {
				labelLocation = "E:/TestShippingLabelsAndDocuments";
			}
			String associatedShipmentLabelFileName =  new String(labelLocation + labelName + "." + trackingNumber + "_" + a + ".pdf");					
			File associatedShipmentLabelFile = new File(associatedShipmentLabelFileName);
			FileOutputStream fos = new FileOutputStream( associatedShipmentLabelFile );
			fos.write(sdpart.getImage());
			fos.close();
			System.out.println("\nAssociated shipment label file name " + associatedShipmentLabelFile.getAbsolutePath());
			Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + associatedShipmentLabelFile.getAbsolutePath());
		}
	}
	/**
	 * 
	 * @param carrierAccessRequest
	 * @return
	 */
	public  ClientDetail createClientDetail() {
        ClientDetail clientDetail = new ClientDetail();
    	clientDetail.setAccountNumber("510087224");
    	clientDetail.setMeterNumber("118706842");
        return clientDetail;
	}
	/**
	 * 
	 * @return
	 */
	public WebAuthenticationDetail createWebAuthenticationDetail() {
        
		WebAuthenticationCredential userCredential = new WebAuthenticationCredential();
		WebAuthenticationCredential parentCredential = null;
		userCredential.setKey("1GVNZ5PFguLgFkmP");
		userCredential.setPassword("Q02iNoC2AUFsGpJzyTIsm9obV");
		Boolean useParentCredential = false; //Set this value to true is using a parent credential
        if (useParentCredential) {
        
        	parentCredential = new WebAuthenticationCredential();
        	parentCredential.setKey(null);
        	parentCredential.setPassword(null);
        }
		return new WebAuthenticationDetail(parentCredential, userCredential);
	}
	
	public  void updateEndPoint(ShipServiceLocator serviceLocator) {
		String endPoint = System.getProperty("endPoint");
		if (endPoint != null) {
			serviceLocator.setShipServicePortEndpointAddress(endPoint);
		}
	}

}
