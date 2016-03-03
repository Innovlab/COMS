/**
 * RequestedShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cts.ptms.model.fedex.ws.ship.v17;


/**
 * The descriptive data for the shipment being tendered to FedEx.
 */
public class RequestedShipment  implements java.io.Serializable {
    /* Identifies the date and time the package is tendered to FedEx.
     * Both the date and time portions of the string are expected to be used.
     * The date should not be a past date or a date more than 10 days in
     * the future. The time is the local time of the shipment based on the
     * shipper's time zone. The date component must be in the format: YYYY-MM-DD
     * (e.g. 2006-06-26). The time component must be in the format: HH:MM:SS
     * using a 24 hour clock (e.g. 11:00 a.m. is 11:00:00, whereas 5:00 p.m.
     * is 17:00:00). The date and time parts are separated by the letter
     * T (e.g. 2006-06-26T17:00:00). There is also a UTC offset component
     * indicating the number of hours/mainutes from UTC (e.g 2006-06-26T17:00:00-0400
     * is defined form June 26, 2006 5:00 pm Eastern Time). */
    private java.util.Calendar shipTimestamp;

    /* Identifies the method by which the package is to be tendered
     * to FedEx. This element does not dispatch a courier for package pickup.
     * See DropoffType for list of valid enumerated values. */
    private com.cts.ptms.model.fedex.ws.ship.v17.DropoffType dropoffType;

    /* Identifies the FedEx service to use in shipping the package.
     * See ServiceType for list of valid enumerated values. */
    private com.cts.ptms.model.fedex.ws.ship.v17.ServiceType serviceType;

    /* Identifies the packaging used by the requestor for the package.
     * See PackagingType for list of valid enumerated values. */
    private com.cts.ptms.model.fedex.ws.ship.v17.PackagingType packagingType;

    /* This specifies information related to the manifest associated
     * with the shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.ShipmentManifestDetail manifestDetail;

    /* Identifies the total weight of the shipment being conveyed
     * to FedEx.This is only applicable to International shipments and should
     * only be used on the first package of a mutiple piece shipment.This
     * value contains 1 explicit decimal position */
    private com.cts.ptms.model.fedex.ws.ship.v17.Weight totalWeight;

    /* Specifies the total declared value for carriage of the shipment.
     * The declared value for carriage represents the maximum liability of
     * FedEx in connection with a shipment, including, but not limited to,
     * any loss, damage, delay, mis-delivery, nondelivery, misinformation,
     * any failure to provide information, or mis-delivery of information
     * relating to the shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.Money totalInsuredValue;

    /* This attribute indicates the currency the caller requests to
     * have used in all returned monetary values (when a choice is possible). */
    private java.lang.String preferredCurrency;

    /* Descriptive data identifying the party responsible for shipping
     * the package. Shipper and Origin should have the same address. */
    private com.cts.ptms.model.fedex.ws.ship.v17.Party shipper;

    /* Descriptive data identifying the party receiving the package. */
    private com.cts.ptms.model.fedex.ws.ship.v17.Party recipient;

    /* A unique identifier for a recipient location */
    private java.lang.String recipientLocationNumber;

    /* Physical starting address for the shipment, if different from
     * shipper's address. */
    private com.cts.ptms.model.fedex.ws.ship.v17.ContactAndAddress origin;

    private com.cts.ptms.model.fedex.ws.ship.v17.Party soldTo;

    /* Descriptive data indicating the method and means of payment
     * to FedEx for providing shipping services. */
    private com.cts.ptms.model.fedex.ws.ship.v17.Payment shippingChargesPayment;

    /* Descriptive data regarding special services requested by the
     * shipper for this shipment. If the shipper is requesting a special
     * service which requires additional data (e.g. COD), the special service
     * type must be present in the specialServiceTypes collection, and the
     * supporting detail must be provided in the appropriate sub-object.
     * For example, to request COD, "COD" must be included in the SpecialServiceTypes
     * collection and the CodDetail object must contain the required data. */
    private com.cts.ptms.model.fedex.ws.ship.v17.ShipmentSpecialServicesRequested specialServicesRequested;

    /* Details specific to an Express freight shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.ExpressFreightDetail expressFreightDetail;

    /* Data applicable to shipments using FEDEX_FREIGHT_ECONOMY and
     * FEDEX_FREIGHT_PRIORITY services. */
    private com.cts.ptms.model.fedex.ws.ship.v17.FreightShipmentDetail freightShipmentDetail;

    /* Used with Ground Home Delivery and Freight. */
    private java.lang.String deliveryInstructions;

    /* Details about how to calculate variable handling charges at
     * the shipment level. */
    private com.cts.ptms.model.fedex.ws.ship.v17.VariableHandlingChargeDetail variableHandlingChargeDetail;

    /* Customs clearance data, used for both international and intra-country
     * shipping. */
    private com.cts.ptms.model.fedex.ws.ship.v17.CustomsClearanceDetail customsClearanceDetail;

    /* For use in "process tag" transaction. */
    private com.cts.ptms.model.fedex.ws.ship.v17.PickupDetail pickupDetail;

    /* Specifies the characteristics of a shipment pertaining to SmartPost
     * services. */
    private com.cts.ptms.model.fedex.ws.ship.v17.SmartPostShipmentDetail smartPostDetail;

    /* If true, only the shipper/payor will have visibility of this
     * shipment. */
    private java.lang.Boolean blockInsightVisibility;

    /* Details about the image format and printer type the label is
     * to returned in. */
    private com.cts.ptms.model.fedex.ws.ship.v17.LabelSpecification labelSpecification;

    /* Contains data used to create additional (non-label) shipping
     * documents. */
    private com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentSpecification shippingDocumentSpecification;

    /* Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer. */
    private com.cts.ptms.model.fedex.ws.ship.v17.RateRequestType[] rateRequestTypes;

    /* Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services. */
    private com.cts.ptms.model.fedex.ws.ship.v17.EdtRequestType edtRequestType;

    /* Only used with multiple-transaction shipments, to identify
     * the master package in a multi-piece shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.TrackingId masterTrackingId;

    /* The total number of packages in the entire shipment (even when
     * the shipment spans multiple transactions.) */
    private org.apache.axis.types.NonNegativeInteger packageCount;

    /* Specifies data structures that may be re-used multiple times
     * with s single shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.DangerousGoodsDetail[] configurationData;

    /* One or more package-attribute descriptions, each of which describes
     * an individual package, a group of identical packages, or (for the
     * total-piece-total-weight case) common characteristics all packages
     * in the shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.RequestedPackageLineItem[] requestedPackageLineItems;

    public RequestedShipment() {
    }

    public RequestedShipment(
           java.util.Calendar shipTimestamp,
           com.cts.ptms.model.fedex.ws.ship.v17.DropoffType dropoffType,
           com.cts.ptms.model.fedex.ws.ship.v17.ServiceType serviceType,
           com.cts.ptms.model.fedex.ws.ship.v17.PackagingType packagingType,
           com.cts.ptms.model.fedex.ws.ship.v17.ShipmentManifestDetail manifestDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.Weight totalWeight,
           com.cts.ptms.model.fedex.ws.ship.v17.Money totalInsuredValue,
           java.lang.String preferredCurrency,
           com.cts.ptms.model.fedex.ws.ship.v17.Party shipper,
           com.cts.ptms.model.fedex.ws.ship.v17.Party recipient,
           java.lang.String recipientLocationNumber,
           com.cts.ptms.model.fedex.ws.ship.v17.ContactAndAddress origin,
           com.cts.ptms.model.fedex.ws.ship.v17.Party soldTo,
           com.cts.ptms.model.fedex.ws.ship.v17.Payment shippingChargesPayment,
           com.cts.ptms.model.fedex.ws.ship.v17.ShipmentSpecialServicesRequested specialServicesRequested,
           com.cts.ptms.model.fedex.ws.ship.v17.ExpressFreightDetail expressFreightDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.FreightShipmentDetail freightShipmentDetail,
           java.lang.String deliveryInstructions,
           com.cts.ptms.model.fedex.ws.ship.v17.VariableHandlingChargeDetail variableHandlingChargeDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.CustomsClearanceDetail customsClearanceDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.PickupDetail pickupDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.SmartPostShipmentDetail smartPostDetail,
           java.lang.Boolean blockInsightVisibility,
           com.cts.ptms.model.fedex.ws.ship.v17.LabelSpecification labelSpecification,
           com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentSpecification shippingDocumentSpecification,
           com.cts.ptms.model.fedex.ws.ship.v17.RateRequestType[] rateRequestTypes,
           com.cts.ptms.model.fedex.ws.ship.v17.EdtRequestType edtRequestType,
           com.cts.ptms.model.fedex.ws.ship.v17.TrackingId masterTrackingId,
           org.apache.axis.types.NonNegativeInteger packageCount,
           com.cts.ptms.model.fedex.ws.ship.v17.DangerousGoodsDetail[] configurationData,
           com.cts.ptms.model.fedex.ws.ship.v17.RequestedPackageLineItem[] requestedPackageLineItems) {
           this.shipTimestamp = shipTimestamp;
           this.dropoffType = dropoffType;
           this.serviceType = serviceType;
           this.packagingType = packagingType;
           this.manifestDetail = manifestDetail;
           this.totalWeight = totalWeight;
           this.totalInsuredValue = totalInsuredValue;
           this.preferredCurrency = preferredCurrency;
           this.shipper = shipper;
           this.recipient = recipient;
           this.recipientLocationNumber = recipientLocationNumber;
           this.origin = origin;
           this.soldTo = soldTo;
           this.shippingChargesPayment = shippingChargesPayment;
           this.specialServicesRequested = specialServicesRequested;
           this.expressFreightDetail = expressFreightDetail;
           this.freightShipmentDetail = freightShipmentDetail;
           this.deliveryInstructions = deliveryInstructions;
           this.variableHandlingChargeDetail = variableHandlingChargeDetail;
           this.customsClearanceDetail = customsClearanceDetail;
           this.pickupDetail = pickupDetail;
           this.smartPostDetail = smartPostDetail;
           this.blockInsightVisibility = blockInsightVisibility;
           this.labelSpecification = labelSpecification;
           this.shippingDocumentSpecification = shippingDocumentSpecification;
           this.rateRequestTypes = rateRequestTypes;
           this.edtRequestType = edtRequestType;
           this.masterTrackingId = masterTrackingId;
           this.packageCount = packageCount;
           this.configurationData = configurationData;
           this.requestedPackageLineItems = requestedPackageLineItems;
    }


    /**
     * Gets the shipTimestamp value for this RequestedShipment.
     * 
     * @return shipTimestamp   * Identifies the date and time the package is tendered to FedEx.
     * Both the date and time portions of the string are expected to be used.
     * The date should not be a past date or a date more than 10 days in
     * the future. The time is the local time of the shipment based on the
     * shipper's time zone. The date component must be in the format: YYYY-MM-DD
     * (e.g. 2006-06-26). The time component must be in the format: HH:MM:SS
     * using a 24 hour clock (e.g. 11:00 a.m. is 11:00:00, whereas 5:00 p.m.
     * is 17:00:00). The date and time parts are separated by the letter
     * T (e.g. 2006-06-26T17:00:00). There is also a UTC offset component
     * indicating the number of hours/mainutes from UTC (e.g 2006-06-26T17:00:00-0400
     * is defined form June 26, 2006 5:00 pm Eastern Time).
     */
    public java.util.Calendar getShipTimestamp() {
        return shipTimestamp;
    }


    /**
     * Sets the shipTimestamp value for this RequestedShipment.
     * 
     * @param shipTimestamp   * Identifies the date and time the package is tendered to FedEx.
     * Both the date and time portions of the string are expected to be used.
     * The date should not be a past date or a date more than 10 days in
     * the future. The time is the local time of the shipment based on the
     * shipper's time zone. The date component must be in the format: YYYY-MM-DD
     * (e.g. 2006-06-26). The time component must be in the format: HH:MM:SS
     * using a 24 hour clock (e.g. 11:00 a.m. is 11:00:00, whereas 5:00 p.m.
     * is 17:00:00). The date and time parts are separated by the letter
     * T (e.g. 2006-06-26T17:00:00). There is also a UTC offset component
     * indicating the number of hours/mainutes from UTC (e.g 2006-06-26T17:00:00-0400
     * is defined form June 26, 2006 5:00 pm Eastern Time).
     */
    public void setShipTimestamp(java.util.Calendar shipTimestamp) {
        this.shipTimestamp = shipTimestamp;
    }


    /**
     * Gets the dropoffType value for this RequestedShipment.
     * 
     * @return dropoffType   * Identifies the method by which the package is to be tendered
     * to FedEx. This element does not dispatch a courier for package pickup.
     * See DropoffType for list of valid enumerated values.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.DropoffType getDropoffType() {
        return dropoffType;
    }


    /**
     * Sets the dropoffType value for this RequestedShipment.
     * 
     * @param dropoffType   * Identifies the method by which the package is to be tendered
     * to FedEx. This element does not dispatch a courier for package pickup.
     * See DropoffType for list of valid enumerated values.
     */
    public void setDropoffType(com.cts.ptms.model.fedex.ws.ship.v17.DropoffType dropoffType) {
        this.dropoffType = dropoffType;
    }


    /**
     * Gets the serviceType value for this RequestedShipment.
     * 
     * @return serviceType   * Identifies the FedEx service to use in shipping the package.
     * See ServiceType for list of valid enumerated values.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ServiceType getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this RequestedShipment.
     * 
     * @param serviceType   * Identifies the FedEx service to use in shipping the package.
     * See ServiceType for list of valid enumerated values.
     */
    public void setServiceType(com.cts.ptms.model.fedex.ws.ship.v17.ServiceType serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the packagingType value for this RequestedShipment.
     * 
     * @return packagingType   * Identifies the packaging used by the requestor for the package.
     * See PackagingType for list of valid enumerated values.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.PackagingType getPackagingType() {
        return packagingType;
    }


    /**
     * Sets the packagingType value for this RequestedShipment.
     * 
     * @param packagingType   * Identifies the packaging used by the requestor for the package.
     * See PackagingType for list of valid enumerated values.
     */
    public void setPackagingType(com.cts.ptms.model.fedex.ws.ship.v17.PackagingType packagingType) {
        this.packagingType = packagingType;
    }


    /**
     * Gets the manifestDetail value for this RequestedShipment.
     * 
     * @return manifestDetail   * This specifies information related to the manifest associated
     * with the shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ShipmentManifestDetail getManifestDetail() {
        return manifestDetail;
    }


    /**
     * Sets the manifestDetail value for this RequestedShipment.
     * 
     * @param manifestDetail   * This specifies information related to the manifest associated
     * with the shipment.
     */
    public void setManifestDetail(com.cts.ptms.model.fedex.ws.ship.v17.ShipmentManifestDetail manifestDetail) {
        this.manifestDetail = manifestDetail;
    }


    /**
     * Gets the totalWeight value for this RequestedShipment.
     * 
     * @return totalWeight   * Identifies the total weight of the shipment being conveyed
     * to FedEx.This is only applicable to International shipments and should
     * only be used on the first package of a mutiple piece shipment.This
     * value contains 1 explicit decimal position
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Weight getTotalWeight() {
        return totalWeight;
    }


    /**
     * Sets the totalWeight value for this RequestedShipment.
     * 
     * @param totalWeight   * Identifies the total weight of the shipment being conveyed
     * to FedEx.This is only applicable to International shipments and should
     * only be used on the first package of a mutiple piece shipment.This
     * value contains 1 explicit decimal position
     */
    public void setTotalWeight(com.cts.ptms.model.fedex.ws.ship.v17.Weight totalWeight) {
        this.totalWeight = totalWeight;
    }


    /**
     * Gets the totalInsuredValue value for this RequestedShipment.
     * 
     * @return totalInsuredValue   * Specifies the total declared value for carriage of the shipment.
     * The declared value for carriage represents the maximum liability of
     * FedEx in connection with a shipment, including, but not limited to,
     * any loss, damage, delay, mis-delivery, nondelivery, misinformation,
     * any failure to provide information, or mis-delivery of information
     * relating to the shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Money getTotalInsuredValue() {
        return totalInsuredValue;
    }


    /**
     * Sets the totalInsuredValue value for this RequestedShipment.
     * 
     * @param totalInsuredValue   * Specifies the total declared value for carriage of the shipment.
     * The declared value for carriage represents the maximum liability of
     * FedEx in connection with a shipment, including, but not limited to,
     * any loss, damage, delay, mis-delivery, nondelivery, misinformation,
     * any failure to provide information, or mis-delivery of information
     * relating to the shipment.
     */
    public void setTotalInsuredValue(com.cts.ptms.model.fedex.ws.ship.v17.Money totalInsuredValue) {
        this.totalInsuredValue = totalInsuredValue;
    }


    /**
     * Gets the preferredCurrency value for this RequestedShipment.
     * 
     * @return preferredCurrency   * This attribute indicates the currency the caller requests to
     * have used in all returned monetary values (when a choice is possible).
     */
    public java.lang.String getPreferredCurrency() {
        return preferredCurrency;
    }


    /**
     * Sets the preferredCurrency value for this RequestedShipment.
     * 
     * @param preferredCurrency   * This attribute indicates the currency the caller requests to
     * have used in all returned monetary values (when a choice is possible).
     */
    public void setPreferredCurrency(java.lang.String preferredCurrency) {
        this.preferredCurrency = preferredCurrency;
    }


    /**
     * Gets the shipper value for this RequestedShipment.
     * 
     * @return shipper   * Descriptive data identifying the party responsible for shipping
     * the package. Shipper and Origin should have the same address.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Party getShipper() {
        return shipper;
    }


    /**
     * Sets the shipper value for this RequestedShipment.
     * 
     * @param shipper   * Descriptive data identifying the party responsible for shipping
     * the package. Shipper and Origin should have the same address.
     */
    public void setShipper(com.cts.ptms.model.fedex.ws.ship.v17.Party shipper) {
        this.shipper = shipper;
    }


    /**
     * Gets the recipient value for this RequestedShipment.
     * 
     * @return recipient   * Descriptive data identifying the party receiving the package.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Party getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this RequestedShipment.
     * 
     * @param recipient   * Descriptive data identifying the party receiving the package.
     */
    public void setRecipient(com.cts.ptms.model.fedex.ws.ship.v17.Party recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the recipientLocationNumber value for this RequestedShipment.
     * 
     * @return recipientLocationNumber   * A unique identifier for a recipient location
     */
    public java.lang.String getRecipientLocationNumber() {
        return recipientLocationNumber;
    }


    /**
     * Sets the recipientLocationNumber value for this RequestedShipment.
     * 
     * @param recipientLocationNumber   * A unique identifier for a recipient location
     */
    public void setRecipientLocationNumber(java.lang.String recipientLocationNumber) {
        this.recipientLocationNumber = recipientLocationNumber;
    }


    /**
     * Gets the origin value for this RequestedShipment.
     * 
     * @return origin   * Physical starting address for the shipment, if different from
     * shipper's address.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ContactAndAddress getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this RequestedShipment.
     * 
     * @param origin   * Physical starting address for the shipment, if different from
     * shipper's address.
     */
    public void setOrigin(com.cts.ptms.model.fedex.ws.ship.v17.ContactAndAddress origin) {
        this.origin = origin;
    }


    /**
     * Gets the soldTo value for this RequestedShipment.
     * 
     * @return soldTo
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Party getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this RequestedShipment.
     * 
     * @param soldTo
     */
    public void setSoldTo(com.cts.ptms.model.fedex.ws.ship.v17.Party soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the shippingChargesPayment value for this RequestedShipment.
     * 
     * @return shippingChargesPayment   * Descriptive data indicating the method and means of payment
     * to FedEx for providing shipping services.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Payment getShippingChargesPayment() {
        return shippingChargesPayment;
    }


    /**
     * Sets the shippingChargesPayment value for this RequestedShipment.
     * 
     * @param shippingChargesPayment   * Descriptive data indicating the method and means of payment
     * to FedEx for providing shipping services.
     */
    public void setShippingChargesPayment(com.cts.ptms.model.fedex.ws.ship.v17.Payment shippingChargesPayment) {
        this.shippingChargesPayment = shippingChargesPayment;
    }


    /**
     * Gets the specialServicesRequested value for this RequestedShipment.
     * 
     * @return specialServicesRequested   * Descriptive data regarding special services requested by the
     * shipper for this shipment. If the shipper is requesting a special
     * service which requires additional data (e.g. COD), the special service
     * type must be present in the specialServiceTypes collection, and the
     * supporting detail must be provided in the appropriate sub-object.
     * For example, to request COD, "COD" must be included in the SpecialServiceTypes
     * collection and the CodDetail object must contain the required data.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ShipmentSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }


    /**
     * Sets the specialServicesRequested value for this RequestedShipment.
     * 
     * @param specialServicesRequested   * Descriptive data regarding special services requested by the
     * shipper for this shipment. If the shipper is requesting a special
     * service which requires additional data (e.g. COD), the special service
     * type must be present in the specialServiceTypes collection, and the
     * supporting detail must be provided in the appropriate sub-object.
     * For example, to request COD, "COD" must be included in the SpecialServiceTypes
     * collection and the CodDetail object must contain the required data.
     */
    public void setSpecialServicesRequested(com.cts.ptms.model.fedex.ws.ship.v17.ShipmentSpecialServicesRequested specialServicesRequested) {
        this.specialServicesRequested = specialServicesRequested;
    }


    /**
     * Gets the expressFreightDetail value for this RequestedShipment.
     * 
     * @return expressFreightDetail   * Details specific to an Express freight shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ExpressFreightDetail getExpressFreightDetail() {
        return expressFreightDetail;
    }


    /**
     * Sets the expressFreightDetail value for this RequestedShipment.
     * 
     * @param expressFreightDetail   * Details specific to an Express freight shipment.
     */
    public void setExpressFreightDetail(com.cts.ptms.model.fedex.ws.ship.v17.ExpressFreightDetail expressFreightDetail) {
        this.expressFreightDetail = expressFreightDetail;
    }


    /**
     * Gets the freightShipmentDetail value for this RequestedShipment.
     * 
     * @return freightShipmentDetail   * Data applicable to shipments using FEDEX_FREIGHT_ECONOMY and
     * FEDEX_FREIGHT_PRIORITY services.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.FreightShipmentDetail getFreightShipmentDetail() {
        return freightShipmentDetail;
    }


    /**
     * Sets the freightShipmentDetail value for this RequestedShipment.
     * 
     * @param freightShipmentDetail   * Data applicable to shipments using FEDEX_FREIGHT_ECONOMY and
     * FEDEX_FREIGHT_PRIORITY services.
     */
    public void setFreightShipmentDetail(com.cts.ptms.model.fedex.ws.ship.v17.FreightShipmentDetail freightShipmentDetail) {
        this.freightShipmentDetail = freightShipmentDetail;
    }


    /**
     * Gets the deliveryInstructions value for this RequestedShipment.
     * 
     * @return deliveryInstructions   * Used with Ground Home Delivery and Freight.
     */
    public java.lang.String getDeliveryInstructions() {
        return deliveryInstructions;
    }


    /**
     * Sets the deliveryInstructions value for this RequestedShipment.
     * 
     * @param deliveryInstructions   * Used with Ground Home Delivery and Freight.
     */
    public void setDeliveryInstructions(java.lang.String deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }


    /**
     * Gets the variableHandlingChargeDetail value for this RequestedShipment.
     * 
     * @return variableHandlingChargeDetail   * Details about how to calculate variable handling charges at
     * the shipment level.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.VariableHandlingChargeDetail getVariableHandlingChargeDetail() {
        return variableHandlingChargeDetail;
    }


    /**
     * Sets the variableHandlingChargeDetail value for this RequestedShipment.
     * 
     * @param variableHandlingChargeDetail   * Details about how to calculate variable handling charges at
     * the shipment level.
     */
    public void setVariableHandlingChargeDetail(com.cts.ptms.model.fedex.ws.ship.v17.VariableHandlingChargeDetail variableHandlingChargeDetail) {
        this.variableHandlingChargeDetail = variableHandlingChargeDetail;
    }


    /**
     * Gets the customsClearanceDetail value for this RequestedShipment.
     * 
     * @return customsClearanceDetail   * Customs clearance data, used for both international and intra-country
     * shipping.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.CustomsClearanceDetail getCustomsClearanceDetail() {
        return customsClearanceDetail;
    }


    /**
     * Sets the customsClearanceDetail value for this RequestedShipment.
     * 
     * @param customsClearanceDetail   * Customs clearance data, used for both international and intra-country
     * shipping.
     */
    public void setCustomsClearanceDetail(com.cts.ptms.model.fedex.ws.ship.v17.CustomsClearanceDetail customsClearanceDetail) {
        this.customsClearanceDetail = customsClearanceDetail;
    }


    /**
     * Gets the pickupDetail value for this RequestedShipment.
     * 
     * @return pickupDetail   * For use in "process tag" transaction.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.PickupDetail getPickupDetail() {
        return pickupDetail;
    }


    /**
     * Sets the pickupDetail value for this RequestedShipment.
     * 
     * @param pickupDetail   * For use in "process tag" transaction.
     */
    public void setPickupDetail(com.cts.ptms.model.fedex.ws.ship.v17.PickupDetail pickupDetail) {
        this.pickupDetail = pickupDetail;
    }


    /**
     * Gets the smartPostDetail value for this RequestedShipment.
     * 
     * @return smartPostDetail   * Specifies the characteristics of a shipment pertaining to SmartPost
     * services.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.SmartPostShipmentDetail getSmartPostDetail() {
        return smartPostDetail;
    }


    /**
     * Sets the smartPostDetail value for this RequestedShipment.
     * 
     * @param smartPostDetail   * Specifies the characteristics of a shipment pertaining to SmartPost
     * services.
     */
    public void setSmartPostDetail(com.cts.ptms.model.fedex.ws.ship.v17.SmartPostShipmentDetail smartPostDetail) {
        this.smartPostDetail = smartPostDetail;
    }


    /**
     * Gets the blockInsightVisibility value for this RequestedShipment.
     * 
     * @return blockInsightVisibility   * If true, only the shipper/payor will have visibility of this
     * shipment.
     */
    public java.lang.Boolean getBlockInsightVisibility() {
        return blockInsightVisibility;
    }


    /**
     * Sets the blockInsightVisibility value for this RequestedShipment.
     * 
     * @param blockInsightVisibility   * If true, only the shipper/payor will have visibility of this
     * shipment.
     */
    public void setBlockInsightVisibility(java.lang.Boolean blockInsightVisibility) {
        this.blockInsightVisibility = blockInsightVisibility;
    }


    /**
     * Gets the labelSpecification value for this RequestedShipment.
     * 
     * @return labelSpecification   * Details about the image format and printer type the label is
     * to returned in.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.LabelSpecification getLabelSpecification() {
        return labelSpecification;
    }


    /**
     * Sets the labelSpecification value for this RequestedShipment.
     * 
     * @param labelSpecification   * Details about the image format and printer type the label is
     * to returned in.
     */
    public void setLabelSpecification(com.cts.ptms.model.fedex.ws.ship.v17.LabelSpecification labelSpecification) {
        this.labelSpecification = labelSpecification;
    }


    /**
     * Gets the shippingDocumentSpecification value for this RequestedShipment.
     * 
     * @return shippingDocumentSpecification   * Contains data used to create additional (non-label) shipping
     * documents.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentSpecification getShippingDocumentSpecification() {
        return shippingDocumentSpecification;
    }


    /**
     * Sets the shippingDocumentSpecification value for this RequestedShipment.
     * 
     * @param shippingDocumentSpecification   * Contains data used to create additional (non-label) shipping
     * documents.
     */
    public void setShippingDocumentSpecification(com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentSpecification shippingDocumentSpecification) {
        this.shippingDocumentSpecification = shippingDocumentSpecification;
    }


    /**
     * Gets the rateRequestTypes value for this RequestedShipment.
     * 
     * @return rateRequestTypes   * Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.RateRequestType[] getRateRequestTypes() {
        return rateRequestTypes;
    }


    /**
     * Sets the rateRequestTypes value for this RequestedShipment.
     * 
     * @param rateRequestTypes   * Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer.
     */
    public void setRateRequestTypes(com.cts.ptms.model.fedex.ws.ship.v17.RateRequestType[] rateRequestTypes) {
        this.rateRequestTypes = rateRequestTypes;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.RateRequestType getRateRequestTypes(int i) {
        return this.rateRequestTypes[i];
    }

    public void setRateRequestTypes(int i, com.cts.ptms.model.fedex.ws.ship.v17.RateRequestType _value) {
        this.rateRequestTypes[i] = _value;
    }


    /**
     * Gets the edtRequestType value for this RequestedShipment.
     * 
     * @return edtRequestType   * Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.EdtRequestType getEdtRequestType() {
        return edtRequestType;
    }


    /**
     * Sets the edtRequestType value for this RequestedShipment.
     * 
     * @param edtRequestType   * Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services.
     */
    public void setEdtRequestType(com.cts.ptms.model.fedex.ws.ship.v17.EdtRequestType edtRequestType) {
        this.edtRequestType = edtRequestType;
    }


    /**
     * Gets the masterTrackingId value for this RequestedShipment.
     * 
     * @return masterTrackingId   * Only used with multiple-transaction shipments, to identify
     * the master package in a multi-piece shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.TrackingId getMasterTrackingId() {
        return masterTrackingId;
    }


    /**
     * Sets the masterTrackingId value for this RequestedShipment.
     * 
     * @param masterTrackingId   * Only used with multiple-transaction shipments, to identify
     * the master package in a multi-piece shipment.
     */
    public void setMasterTrackingId(com.cts.ptms.model.fedex.ws.ship.v17.TrackingId masterTrackingId) {
        this.masterTrackingId = masterTrackingId;
    }


    /**
     * Gets the packageCount value for this RequestedShipment.
     * 
     * @return packageCount   * The total number of packages in the entire shipment (even when
     * the shipment spans multiple transactions.)
     */
    public org.apache.axis.types.NonNegativeInteger getPackageCount() {
        return packageCount;
    }


    /**
     * Sets the packageCount value for this RequestedShipment.
     * 
     * @param packageCount   * The total number of packages in the entire shipment (even when
     * the shipment spans multiple transactions.)
     */
    public void setPackageCount(org.apache.axis.types.NonNegativeInteger packageCount) {
        this.packageCount = packageCount;
    }


    /**
     * Gets the configurationData value for this RequestedShipment.
     * 
     * @return configurationData   * Specifies data structures that may be re-used multiple times
     * with s single shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.DangerousGoodsDetail[] getConfigurationData() {
        return configurationData;
    }


    /**
     * Sets the configurationData value for this RequestedShipment.
     * 
     * @param configurationData   * Specifies data structures that may be re-used multiple times
     * with s single shipment.
     */
    public void setConfigurationData(com.cts.ptms.model.fedex.ws.ship.v17.DangerousGoodsDetail[] configurationData) {
        this.configurationData = configurationData;
    }


    /**
     * Gets the requestedPackageLineItems value for this RequestedShipment.
     * 
     * @return requestedPackageLineItems   * One or more package-attribute descriptions, each of which describes
     * an individual package, a group of identical packages, or (for the
     * total-piece-total-weight case) common characteristics all packages
     * in the shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.RequestedPackageLineItem[] getRequestedPackageLineItems() {
        return requestedPackageLineItems;
    }


    /**
     * Sets the requestedPackageLineItems value for this RequestedShipment.
     * 
     * @param requestedPackageLineItems   * One or more package-attribute descriptions, each of which describes
     * an individual package, a group of identical packages, or (for the
     * total-piece-total-weight case) common characteristics all packages
     * in the shipment.
     */
    public void setRequestedPackageLineItems(com.cts.ptms.model.fedex.ws.ship.v17.RequestedPackageLineItem[] requestedPackageLineItems) {
        this.requestedPackageLineItems = requestedPackageLineItems;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.RequestedPackageLineItem getRequestedPackageLineItems(int i) {
        return this.requestedPackageLineItems[i];
    }

    public void setRequestedPackageLineItems(int i, com.cts.ptms.model.fedex.ws.ship.v17.RequestedPackageLineItem _value) {
        this.requestedPackageLineItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestedShipment)) return false;
        RequestedShipment other = (RequestedShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipTimestamp==null && other.getShipTimestamp()==null) || 
             (this.shipTimestamp!=null &&
              this.shipTimestamp.equals(other.getShipTimestamp()))) &&
            ((this.dropoffType==null && other.getDropoffType()==null) || 
             (this.dropoffType!=null &&
              this.dropoffType.equals(other.getDropoffType()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.packagingType==null && other.getPackagingType()==null) || 
             (this.packagingType!=null &&
              this.packagingType.equals(other.getPackagingType()))) &&
            ((this.manifestDetail==null && other.getManifestDetail()==null) || 
             (this.manifestDetail!=null &&
              this.manifestDetail.equals(other.getManifestDetail()))) &&
            ((this.totalWeight==null && other.getTotalWeight()==null) || 
             (this.totalWeight!=null &&
              this.totalWeight.equals(other.getTotalWeight()))) &&
            ((this.totalInsuredValue==null && other.getTotalInsuredValue()==null) || 
             (this.totalInsuredValue!=null &&
              this.totalInsuredValue.equals(other.getTotalInsuredValue()))) &&
            ((this.preferredCurrency==null && other.getPreferredCurrency()==null) || 
             (this.preferredCurrency!=null &&
              this.preferredCurrency.equals(other.getPreferredCurrency()))) &&
            ((this.shipper==null && other.getShipper()==null) || 
             (this.shipper!=null &&
              this.shipper.equals(other.getShipper()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.recipientLocationNumber==null && other.getRecipientLocationNumber()==null) || 
             (this.recipientLocationNumber!=null &&
              this.recipientLocationNumber.equals(other.getRecipientLocationNumber()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.soldTo==null && other.getSoldTo()==null) || 
             (this.soldTo!=null &&
              this.soldTo.equals(other.getSoldTo()))) &&
            ((this.shippingChargesPayment==null && other.getShippingChargesPayment()==null) || 
             (this.shippingChargesPayment!=null &&
              this.shippingChargesPayment.equals(other.getShippingChargesPayment()))) &&
            ((this.specialServicesRequested==null && other.getSpecialServicesRequested()==null) || 
             (this.specialServicesRequested!=null &&
              this.specialServicesRequested.equals(other.getSpecialServicesRequested()))) &&
            ((this.expressFreightDetail==null && other.getExpressFreightDetail()==null) || 
             (this.expressFreightDetail!=null &&
              this.expressFreightDetail.equals(other.getExpressFreightDetail()))) &&
            ((this.freightShipmentDetail==null && other.getFreightShipmentDetail()==null) || 
             (this.freightShipmentDetail!=null &&
              this.freightShipmentDetail.equals(other.getFreightShipmentDetail()))) &&
            ((this.deliveryInstructions==null && other.getDeliveryInstructions()==null) || 
             (this.deliveryInstructions!=null &&
              this.deliveryInstructions.equals(other.getDeliveryInstructions()))) &&
            ((this.variableHandlingChargeDetail==null && other.getVariableHandlingChargeDetail()==null) || 
             (this.variableHandlingChargeDetail!=null &&
              this.variableHandlingChargeDetail.equals(other.getVariableHandlingChargeDetail()))) &&
            ((this.customsClearanceDetail==null && other.getCustomsClearanceDetail()==null) || 
             (this.customsClearanceDetail!=null &&
              this.customsClearanceDetail.equals(other.getCustomsClearanceDetail()))) &&
            ((this.pickupDetail==null && other.getPickupDetail()==null) || 
             (this.pickupDetail!=null &&
              this.pickupDetail.equals(other.getPickupDetail()))) &&
            ((this.smartPostDetail==null && other.getSmartPostDetail()==null) || 
             (this.smartPostDetail!=null &&
              this.smartPostDetail.equals(other.getSmartPostDetail()))) &&
            ((this.blockInsightVisibility==null && other.getBlockInsightVisibility()==null) || 
             (this.blockInsightVisibility!=null &&
              this.blockInsightVisibility.equals(other.getBlockInsightVisibility()))) &&
            ((this.labelSpecification==null && other.getLabelSpecification()==null) || 
             (this.labelSpecification!=null &&
              this.labelSpecification.equals(other.getLabelSpecification()))) &&
            ((this.shippingDocumentSpecification==null && other.getShippingDocumentSpecification()==null) || 
             (this.shippingDocumentSpecification!=null &&
              this.shippingDocumentSpecification.equals(other.getShippingDocumentSpecification()))) &&
            ((this.rateRequestTypes==null && other.getRateRequestTypes()==null) || 
             (this.rateRequestTypes!=null &&
              java.util.Arrays.equals(this.rateRequestTypes, other.getRateRequestTypes()))) &&
            ((this.edtRequestType==null && other.getEdtRequestType()==null) || 
             (this.edtRequestType!=null &&
              this.edtRequestType.equals(other.getEdtRequestType()))) &&
            ((this.masterTrackingId==null && other.getMasterTrackingId()==null) || 
             (this.masterTrackingId!=null &&
              this.masterTrackingId.equals(other.getMasterTrackingId()))) &&
            ((this.packageCount==null && other.getPackageCount()==null) || 
             (this.packageCount!=null &&
              this.packageCount.equals(other.getPackageCount()))) &&
            ((this.configurationData==null && other.getConfigurationData()==null) || 
             (this.configurationData!=null &&
              java.util.Arrays.equals(this.configurationData, other.getConfigurationData()))) &&
            ((this.requestedPackageLineItems==null && other.getRequestedPackageLineItems()==null) || 
             (this.requestedPackageLineItems!=null &&
              java.util.Arrays.equals(this.requestedPackageLineItems, other.getRequestedPackageLineItems())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getShipTimestamp() != null) {
            _hashCode += getShipTimestamp().hashCode();
        }
        if (getDropoffType() != null) {
            _hashCode += getDropoffType().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getPackagingType() != null) {
            _hashCode += getPackagingType().hashCode();
        }
        if (getManifestDetail() != null) {
            _hashCode += getManifestDetail().hashCode();
        }
        if (getTotalWeight() != null) {
            _hashCode += getTotalWeight().hashCode();
        }
        if (getTotalInsuredValue() != null) {
            _hashCode += getTotalInsuredValue().hashCode();
        }
        if (getPreferredCurrency() != null) {
            _hashCode += getPreferredCurrency().hashCode();
        }
        if (getShipper() != null) {
            _hashCode += getShipper().hashCode();
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getRecipientLocationNumber() != null) {
            _hashCode += getRecipientLocationNumber().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getSoldTo() != null) {
            _hashCode += getSoldTo().hashCode();
        }
        if (getShippingChargesPayment() != null) {
            _hashCode += getShippingChargesPayment().hashCode();
        }
        if (getSpecialServicesRequested() != null) {
            _hashCode += getSpecialServicesRequested().hashCode();
        }
        if (getExpressFreightDetail() != null) {
            _hashCode += getExpressFreightDetail().hashCode();
        }
        if (getFreightShipmentDetail() != null) {
            _hashCode += getFreightShipmentDetail().hashCode();
        }
        if (getDeliveryInstructions() != null) {
            _hashCode += getDeliveryInstructions().hashCode();
        }
        if (getVariableHandlingChargeDetail() != null) {
            _hashCode += getVariableHandlingChargeDetail().hashCode();
        }
        if (getCustomsClearanceDetail() != null) {
            _hashCode += getCustomsClearanceDetail().hashCode();
        }
        if (getPickupDetail() != null) {
            _hashCode += getPickupDetail().hashCode();
        }
        if (getSmartPostDetail() != null) {
            _hashCode += getSmartPostDetail().hashCode();
        }
        if (getBlockInsightVisibility() != null) {
            _hashCode += getBlockInsightVisibility().hashCode();
        }
        if (getLabelSpecification() != null) {
            _hashCode += getLabelSpecification().hashCode();
        }
        if (getShippingDocumentSpecification() != null) {
            _hashCode += getShippingDocumentSpecification().hashCode();
        }
        if (getRateRequestTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRateRequestTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRateRequestTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEdtRequestType() != null) {
            _hashCode += getEdtRequestType().hashCode();
        }
        if (getMasterTrackingId() != null) {
            _hashCode += getMasterTrackingId().hashCode();
        }
        if (getPackageCount() != null) {
            _hashCode += getPackageCount().hashCode();
        }
        if (getConfigurationData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigurationData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigurationData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestedPackageLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestedPackageLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestedPackageLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestedShipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RequestedShipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropoffType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DropoffType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DropoffType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ServiceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PackagingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PackagingType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manifestDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ManifestDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentManifestDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TotalWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalInsuredValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TotalInsuredValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PreferredCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Shipper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Party"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Party"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientLocationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RecipientLocationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ContactAndAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SoldTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Party"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingChargesPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingChargesPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Payment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServicesRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SpecialServicesRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentSpecialServicesRequested"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressFreightDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ExpressFreightDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ExpressFreightDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DeliveryInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableHandlingChargeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "VariableHandlingChargeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "VariableHandlingChargeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsClearanceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomsClearanceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomsClearanceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PickupDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PickupDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartPostDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SmartPostDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SmartPostShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockInsightVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "BlockInsightVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LabelSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LabelSpecification"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDocumentSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentSpecification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateRequestTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RateRequestTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RateRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edtRequestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EdtRequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EdtRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterTrackingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "MasterTrackingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TrackingId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurationData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ConfigurationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DangerousGoodsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DangerousGoodsPackageConfigurations"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedPackageLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RequestedPackageLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RequestedPackageLineItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
