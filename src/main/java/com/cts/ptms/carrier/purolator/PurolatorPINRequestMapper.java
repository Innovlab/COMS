package com.cts.ptms.carrier.purolator;

import java.util.List;
import java.util.Properties;

import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.confirm.request.ShipFromAddressType;
import com.cts.ptms.model.confirm.request.ShipFromType;
import com.cts.ptms.model.confirm.request.ShipToAddressType;
import com.cts.ptms.model.confirm.request.ShipToType;
import com.cts.ptms.model.confirm.request.ShipmentType;
import com.cts.ptms.model.gls.ADDRESS;
import com.cts.ptms.model.gls.SHIPUNIT;
import com.cts.ptms.model.purolator.ShippingServiceStub.Address;
import com.cts.ptms.model.purolator.ShippingServiceStub.ArrayOfOptionIDValuePair;
import com.cts.ptms.model.purolator.ShippingServiceStub.ArrayOfPiece;
import com.cts.ptms.model.purolator.ShippingServiceStub.CreateShipmentRequest;
import com.cts.ptms.model.purolator.ShippingServiceStub.CreateShipmentRequestContainer;
import com.cts.ptms.model.purolator.ShippingServiceStub.CreateShipmentResponseContainer;
import com.cts.ptms.model.purolator.ShippingServiceStub.Dimension;
import com.cts.ptms.model.purolator.ShippingServiceStub.DimensionUnit;
import com.cts.ptms.model.purolator.ShippingServiceStub.Language;
import com.cts.ptms.model.purolator.ShippingServiceStub.NotificationInformation;
import com.cts.ptms.model.purolator.ShippingServiceStub.OptionIDValuePair;
import com.cts.ptms.model.purolator.ShippingServiceStub.OptionsInformation;
import com.cts.ptms.model.purolator.ShippingServiceStub.PackageInformation;
import com.cts.ptms.model.purolator.ShippingServiceStub.PaymentInformation;
import com.cts.ptms.model.purolator.ShippingServiceStub.PaymentType;
import com.cts.ptms.model.purolator.ShippingServiceStub.PhoneNumber;
import com.cts.ptms.model.purolator.ShippingServiceStub.PickupInformation;
import com.cts.ptms.model.purolator.ShippingServiceStub.PickupType;
import com.cts.ptms.model.purolator.ShippingServiceStub.Piece;
import com.cts.ptms.model.purolator.ShippingServiceStub.PrinterType;
import com.cts.ptms.model.purolator.ShippingServiceStub.ReceiverInformation;
import com.cts.ptms.model.purolator.ShippingServiceStub.RequestContext;
import com.cts.ptms.model.purolator.ShippingServiceStub.RequestContextE;
import com.cts.ptms.model.purolator.ShippingServiceStub.ResponseInformation;
import com.cts.ptms.model.purolator.ShippingServiceStub.SenderInformation;
import com.cts.ptms.model.purolator.ShippingServiceStub.Shipment;
import com.cts.ptms.model.purolator.ShippingServiceStub.TotalWeight;
import com.cts.ptms.model.purolator.ShippingServiceStub.TrackingReferenceInformation;
import com.cts.ptms.model.purolator.ShippingServiceStub.Weight;
import com.cts.ptms.model.purolator.ShippingServiceStub.WeightUnit;
import com.cts.ptms.utils.constants.PurolatorConstants;
import com.cts.ptms.utils.constants.ShippingConstants;

public class PurolatorPINRequestMapper {

	private Properties props;
	private SHIPUNIT requestShipUnit;

	public RequestContextE getPINRequestContext() {

		RequestContextE requestContext = new RequestContextE();
		RequestContext requestContainer = new RequestContext();

		requestContainer.setLanguage(Language.en);
		requestContainer.setVersion(PurolatorConstants.PIN_VERSION);
		requestContainer.setGroupID(PurolatorConstants.PIN_GROUPID);
		requestContainer.setRequestReference(PurolatorConstants.PIN_REQ_REF);
		requestContainer.setUserToken(PurolatorConstants.PIN_USER_TOKEN);

		requestContext.setRequestContext(requestContainer);
		return requestContext;

	}

	public CreateShipmentRequest mapToCreateShipmentRequest(Properties purolatorProps, SHIPUNIT requestShipUnit) {

		this.props = purolatorProps;
		this.requestShipUnit = requestShipUnit;
		CreateShipmentRequest request = new CreateShipmentRequest();
		CreateShipmentRequestContainer requestContainer = new CreateShipmentRequestContainer();
		Shipment shipment = populateRequestData();

		requestContainer.setShipment(shipment);
		requestContainer.setPrinterType(PrinterType.Regular);

		request.setCreateShipmentRequest(requestContainer);
		return request;
	}

	private Shipment populateRequestData() {

		Shipment shipment = new Shipment();

		SenderInformation sender = new SenderInformation();
		sender.setTaxNumber(PurolatorConstants.PIN_REQ_SENDER_TAX_NUM);

		ReceiverInformation receiver = new ReceiverInformation();
		receiver.setTaxNumber(PurolatorConstants.PIN_REQ_RCVER_TAX_NUM);

		// set AddressInformation

		for (ADDRESS address : requestShipUnit.getADDRESS()) {
			if (address.getClazz().equals(PurolatorConstants.ADDRESS_ORDERED_BY)) {
				sender.setAddress(populateAddress(address));
			}
			if (address.getClazz().equals(PurolatorConstants.ADDRESS_DELIVER_TO)) {
				receiver.setAddress(populateAddress(address));
			}
		}

		shipment.setSenderInformation(sender);
		shipment.setReceiverInformation(receiver);

		// Set Package Information
		PackageInformation pack = new PackageInformation();
		pack.setServiceID(PurolatorConstants.SERVICE_TYPE_01);
		pack.setDescription("Description");
		TotalWeight weight = new TotalWeight();
		weight.setValue(requestShipUnit.getWeight().intValue());
		weight.setWeightUnit(WeightUnit.lb);
		pack.setTotalWeight(weight);
		pack.setTotalPieces(1);

		Piece[] pieces = new Piece[1];
		pieces[0] = setDimensions();
		ArrayOfPiece arr = new ArrayOfPiece();
		arr.setPiece(pieces);
		pack.setPiecesInformation(arr);

		pack.setDangerousGoodsDeclarationDocumentIndicator(PurolatorConstants.DANGER_GOODS_FLAG);

		pack.setOptionsInformation(SetOriginSignatureNotRequiredOption());

		shipment.setPackageInformation(pack);

		PaymentInformation pay = new PaymentInformation();
		pay.setPaymentType(PaymentType.Sender);
		pay.setRegisteredAccountNumber(props.getProperty(PurolatorConstants.ACCOUNT_NUM));
		// pay.setBillingAccountNumber("your Purolator Billing Account Number");
		shipment.setPaymentInformation(pay);

		PickupInformation pickUp = new PickupInformation();
		pickUp.setPickupType(PickupType.DropOff);
		shipment.setPickupInformation(pickUp);

		NotificationInformation note = new NotificationInformation();
		note.setConfirmationEmailAddress(PurolatorConstants.CONFIRM_EMAIL_ADDR);
		shipment.setNotificationInformation(note);

		TrackingReferenceInformation track = new TrackingReferenceInformation();
		track.setReference1("Reference1");
		track.setReference2("Reference2");
		track.setReference3("Reference3");
		track.setReference4("Reference4");
		shipment.setTrackingReferenceInformation(track);

		shipment.setOtherInformation(null);

		return shipment;
	}

	private Piece setDimensions() {
		Piece piece = new Piece();

		Weight weight = new Weight();
		//java.math.BigDecimal w = new java.math.BigDecimal(requestShipUnit.getWeight().doubleValue());
		java.math.BigDecimal w = new java.math.BigDecimal(1.0);
		weight.setValue(w);
		weight.setWeightUnit(WeightUnit.lb);
		piece.setWeight(weight);

		//piece.setLength(setDimension(requestShipUnit.getLength().doubleValue()));
		//piece.setWidth(setDimension(requestShipUnit.getWidth().doubleValue()));
		//piece.setHeight(setDimension(requestShipUnit.getHeight().doubleValue()));
		piece.setLength(setDimension(0.0));
		piece.setWidth(setDimension(0.0));
		piece.setHeight(setDimension(0.0));

		return piece;
	}

	private static Dimension setDimension(double value) {
		Dimension dim = new Dimension();
		java.math.BigDecimal v = new java.math.BigDecimal(value);
		dim.setValue(v);
		dim.setDimensionUnit(DimensionUnit.in);
		return dim;
	}

	private Address populateAddress(ADDRESS address) {

		Address addr = new Address();

		addr.setName(address.getIndividualName());
		addr.setCompany(address.getIndividualName());
		addr.setDepartment("Department");
		addr.setStreetNumber(address.getAddress1());
		addr.setStreetSuffix("");
		addr.setStreetName(address.getAddress2());
		addr.setStreetType(PurolatorConstants.ADDRESS_ST_TYPE);
		addr.setStreetDirection("");
		addr.setSuite("123");
		addr.setFloor("4");
		addr.setStreetAddress2("");
		addr.setStreetAddress3("");
		addr.setCity(address.getCity());
		addr.setProvince(address.getState());
		addr.setCountry(address.getCountry());
		addr.setPostalCode(address.getZIPCode());
		PhoneNumber phone = new PhoneNumber();
		phone = SetPhoneNumber();
		addr.setPhoneNumber(phone);
		addr.setFaxNumber(phone);

		return addr;

	}

	private PhoneNumber SetPhoneNumber() {
		PhoneNumber ph = new PhoneNumber();
		ph.setCountryCode("1");
		ph.setAreaCode("905");
		ph.setPhone("7128101");
		ph.setExtension("9999");
		return ph;
	}

	private static OptionsInformation SetOriginSignatureNotRequiredOption() {
		OptionsInformation optInf = new OptionsInformation();
		OptionIDValuePair[] options = new OptionIDValuePair[1];
		OptionIDValuePair option = new OptionIDValuePair();
		option.setID("OriginSignatureNotRequired");
		option.setValue("true");
		options[0] = option;
		ArrayOfOptionIDValuePair arr = new ArrayOfOptionIDValuePair();
		arr.setOptionIDValuePair(options);
		optInf.setOptions(arr);
		return optInf;
	}

	public void populateShipmentOrderResponse(CreateShipmentResponseContainer respContainer, ShipmentOrder response) {
		ResponseInformation responInfo = respContainer.getResponseInformation();

		if (responInfo == null) {
			System.out.println("Empty Response");
			setError(PurolatorConstants.ERR_EMPTY_RESPONSE, response);
			return;

		}

		int i = 0;
		if (responInfo.getErrors() != null && responInfo.getErrors().getError() != null
				&& responInfo.getErrors().getError().length > 0) {
			for (com.cts.ptms.model.purolator.ShippingServiceStub.Error error : responInfo.getErrors().getError()) {
				i++;
				System.out.format("Error %d", i);
				System.out.format("Error code %s", error.getCode());
				System.out.format("Error description %s", error.getDescription());
				System.out.format("Additional Information %s", error.getAdditionalInformation());

				setError(error.getDescription(), response);
			}
		}else{
			response.setTrackingNumber(respContainer.getShipmentPIN().getValue());
			response.setCarrier(ShippingConstants.PUROLATOR);
			response.setActive("Y");
			response.setStatus(ShippingConstants.SUCCESS);
			response.setShipmentTypeDO(populateShipmentTypeDO());
		}
		
		
	}

	private ShipmentType populateShipmentTypeDO() {
		ShipmentType shipmentTypeDO = new ShipmentType();
		List<ADDRESS> addressList = requestShipUnit.getADDRESS();
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
		return shipmentTypeDO;
	}

	public void setError(String errString, ShipmentOrder response) {
		response.setStatus(ShippingConstants.STATUS_FAILURE);
		response.setErrorDescription(errString);

	}

}
