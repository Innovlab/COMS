/**
 * ShipmentSpecialServicesRequested.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cts.ptms.model.fedex.ws.ship.v17;


/**
 * These special services are available at the shipment level for
 * some or all service types. If the shipper is requesting a special
 * service which requires additional data (such as the COD amount), the
 * shipment special service type must be present in the specialServiceTypes
 * collection, and the supporting detail must be provided in the appropriate
 * sub-object below.
 */
public class ShipmentSpecialServicesRequested  implements java.io.Serializable {
    /* The types of all special services requested for the enclosing
     * shipment (or other shipment-level transaction). */
    private com.cts.ptms.model.fedex.ws.ship.v17.ShipmentSpecialServiceType[] specialServiceTypes;

    /* Descriptive data required for a FedEx COD (Collect-On-Delivery)
     * shipment. This element is required when SpecialServiceType.COD is
     * present in the SpecialServiceTypes collection. */
    private com.cts.ptms.model.fedex.ws.ship.v17.CodDetail codDetail;

    private com.cts.ptms.model.fedex.ws.ship.v17.DeliveryOnInvoiceAcceptanceDetail deliveryOnInvoiceAcceptanceDetail;

    /* Descriptive data required for a FedEx shipment that is to be
     * held at the destination FedEx location for pickup by the recipient.
     * This element is required when SpecialServiceType.HOLD_AT_LOCATION
     * is present in the SpecialServiceTypes collection. */
    private com.cts.ptms.model.fedex.ws.ship.v17.HoldAtLocationDetail holdAtLocationDetail;

    /* Descriptive data required for FedEx to provide email notification
     * to the customer regarding the shipment. This element is required when
     * SpecialServiceType.EMAIL_NOTIFICATION is present in the SpecialServiceTypes
     * collection. */
    private com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationDetail EMailNotificationDetail;

    /* The descriptive data required for FedEx Printed Return Label.
     * This element is required when SpecialServiceType.PRINTED_RETURN_LABEL
     * is present in the SpecialServiceTypes collection */
    private com.cts.ptms.model.fedex.ws.ship.v17.ReturnShipmentDetail returnShipmentDetail;

    /* This field should be populated for pending shipments (e.g.
     * e-mail label) It is required by a PENDING_SHIPMENT special service
     * type. */
    private com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentDetail pendingShipmentDetail;

    private com.cts.ptms.model.fedex.ws.ship.v17.InternationalControlledExportDetail internationalControlledExportDetail;

    private com.cts.ptms.model.fedex.ws.ship.v17.InternationalTrafficInArmsRegulationsDetail internationalTrafficInArmsRegulationsDetail;

    /* Number of packages in this shipment which contain dry ice and
     * the total weight of the dry ice for this shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.ShipmentDryIceDetail shipmentDryIceDetail;

    /* The descriptive data required for FedEx Home Delivery options.
     * This element is required when SpecialServiceType.HOME_DELIVERY_PREMIUM
     * is present in the SpecialServiceTypes collection */
    private com.cts.ptms.model.fedex.ws.ship.v17.HomeDeliveryPremiumDetail homeDeliveryPremiumDetail;

    private com.cts.ptms.model.fedex.ws.ship.v17.FreightGuaranteeDetail freightGuaranteeDetail;

    /* Electronic Trade document references. */
    private com.cts.ptms.model.fedex.ws.ship.v17.EtdDetail etdDetail;

    /* Specification for date or range of dates on which delivery
     * is to be attempted. */
    private com.cts.ptms.model.fedex.ws.ship.v17.CustomDeliveryWindowDetail customDeliveryWindowDetail;

    public ShipmentSpecialServicesRequested() {
    }

    public ShipmentSpecialServicesRequested(
           com.cts.ptms.model.fedex.ws.ship.v17.ShipmentSpecialServiceType[] specialServiceTypes,
           com.cts.ptms.model.fedex.ws.ship.v17.CodDetail codDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.DeliveryOnInvoiceAcceptanceDetail deliveryOnInvoiceAcceptanceDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.HoldAtLocationDetail holdAtLocationDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationDetail EMailNotificationDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.ReturnShipmentDetail returnShipmentDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentDetail pendingShipmentDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.InternationalControlledExportDetail internationalControlledExportDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.InternationalTrafficInArmsRegulationsDetail internationalTrafficInArmsRegulationsDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.ShipmentDryIceDetail shipmentDryIceDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.HomeDeliveryPremiumDetail homeDeliveryPremiumDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.FreightGuaranteeDetail freightGuaranteeDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.EtdDetail etdDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.CustomDeliveryWindowDetail customDeliveryWindowDetail) {
           this.specialServiceTypes = specialServiceTypes;
           this.codDetail = codDetail;
           this.deliveryOnInvoiceAcceptanceDetail = deliveryOnInvoiceAcceptanceDetail;
           this.holdAtLocationDetail = holdAtLocationDetail;
           this.EMailNotificationDetail = EMailNotificationDetail;
           this.returnShipmentDetail = returnShipmentDetail;
           this.pendingShipmentDetail = pendingShipmentDetail;
           this.internationalControlledExportDetail = internationalControlledExportDetail;
           this.internationalTrafficInArmsRegulationsDetail = internationalTrafficInArmsRegulationsDetail;
           this.shipmentDryIceDetail = shipmentDryIceDetail;
           this.homeDeliveryPremiumDetail = homeDeliveryPremiumDetail;
           this.freightGuaranteeDetail = freightGuaranteeDetail;
           this.etdDetail = etdDetail;
           this.customDeliveryWindowDetail = customDeliveryWindowDetail;
    }


    /**
     * Gets the specialServiceTypes value for this ShipmentSpecialServicesRequested.
     * 
     * @return specialServiceTypes   * The types of all special services requested for the enclosing
     * shipment (or other shipment-level transaction).
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ShipmentSpecialServiceType[] getSpecialServiceTypes() {
        return specialServiceTypes;
    }


    /**
     * Sets the specialServiceTypes value for this ShipmentSpecialServicesRequested.
     * 
     * @param specialServiceTypes   * The types of all special services requested for the enclosing
     * shipment (or other shipment-level transaction).
     */
    public void setSpecialServiceTypes(com.cts.ptms.model.fedex.ws.ship.v17.ShipmentSpecialServiceType[] specialServiceTypes) {
        this.specialServiceTypes = specialServiceTypes;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.ShipmentSpecialServiceType getSpecialServiceTypes(int i) {
        return this.specialServiceTypes[i];
    }

    public void setSpecialServiceTypes(int i, com.cts.ptms.model.fedex.ws.ship.v17.ShipmentSpecialServiceType _value) {
        this.specialServiceTypes[i] = _value;
    }


    /**
     * Gets the codDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return codDetail   * Descriptive data required for a FedEx COD (Collect-On-Delivery)
     * shipment. This element is required when SpecialServiceType.COD is
     * present in the SpecialServiceTypes collection.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.CodDetail getCodDetail() {
        return codDetail;
    }


    /**
     * Sets the codDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param codDetail   * Descriptive data required for a FedEx COD (Collect-On-Delivery)
     * shipment. This element is required when SpecialServiceType.COD is
     * present in the SpecialServiceTypes collection.
     */
    public void setCodDetail(com.cts.ptms.model.fedex.ws.ship.v17.CodDetail codDetail) {
        this.codDetail = codDetail;
    }


    /**
     * Gets the deliveryOnInvoiceAcceptanceDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return deliveryOnInvoiceAcceptanceDetail
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.DeliveryOnInvoiceAcceptanceDetail getDeliveryOnInvoiceAcceptanceDetail() {
        return deliveryOnInvoiceAcceptanceDetail;
    }


    /**
     * Sets the deliveryOnInvoiceAcceptanceDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param deliveryOnInvoiceAcceptanceDetail
     */
    public void setDeliveryOnInvoiceAcceptanceDetail(com.cts.ptms.model.fedex.ws.ship.v17.DeliveryOnInvoiceAcceptanceDetail deliveryOnInvoiceAcceptanceDetail) {
        this.deliveryOnInvoiceAcceptanceDetail = deliveryOnInvoiceAcceptanceDetail;
    }


    /**
     * Gets the holdAtLocationDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return holdAtLocationDetail   * Descriptive data required for a FedEx shipment that is to be
     * held at the destination FedEx location for pickup by the recipient.
     * This element is required when SpecialServiceType.HOLD_AT_LOCATION
     * is present in the SpecialServiceTypes collection.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.HoldAtLocationDetail getHoldAtLocationDetail() {
        return holdAtLocationDetail;
    }


    /**
     * Sets the holdAtLocationDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param holdAtLocationDetail   * Descriptive data required for a FedEx shipment that is to be
     * held at the destination FedEx location for pickup by the recipient.
     * This element is required when SpecialServiceType.HOLD_AT_LOCATION
     * is present in the SpecialServiceTypes collection.
     */
    public void setHoldAtLocationDetail(com.cts.ptms.model.fedex.ws.ship.v17.HoldAtLocationDetail holdAtLocationDetail) {
        this.holdAtLocationDetail = holdAtLocationDetail;
    }


    /**
     * Gets the EMailNotificationDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return EMailNotificationDetail   * Descriptive data required for FedEx to provide email notification
     * to the customer regarding the shipment. This element is required when
     * SpecialServiceType.EMAIL_NOTIFICATION is present in the SpecialServiceTypes
     * collection.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationDetail getEMailNotificationDetail() {
        return EMailNotificationDetail;
    }


    /**
     * Sets the EMailNotificationDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param EMailNotificationDetail   * Descriptive data required for FedEx to provide email notification
     * to the customer regarding the shipment. This element is required when
     * SpecialServiceType.EMAIL_NOTIFICATION is present in the SpecialServiceTypes
     * collection.
     */
    public void setEMailNotificationDetail(com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationDetail EMailNotificationDetail) {
        this.EMailNotificationDetail = EMailNotificationDetail;
    }


    /**
     * Gets the returnShipmentDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return returnShipmentDetail   * The descriptive data required for FedEx Printed Return Label.
     * This element is required when SpecialServiceType.PRINTED_RETURN_LABEL
     * is present in the SpecialServiceTypes collection
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ReturnShipmentDetail getReturnShipmentDetail() {
        return returnShipmentDetail;
    }


    /**
     * Sets the returnShipmentDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param returnShipmentDetail   * The descriptive data required for FedEx Printed Return Label.
     * This element is required when SpecialServiceType.PRINTED_RETURN_LABEL
     * is present in the SpecialServiceTypes collection
     */
    public void setReturnShipmentDetail(com.cts.ptms.model.fedex.ws.ship.v17.ReturnShipmentDetail returnShipmentDetail) {
        this.returnShipmentDetail = returnShipmentDetail;
    }


    /**
     * Gets the pendingShipmentDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return pendingShipmentDetail   * This field should be populated for pending shipments (e.g.
     * e-mail label) It is required by a PENDING_SHIPMENT special service
     * type.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentDetail getPendingShipmentDetail() {
        return pendingShipmentDetail;
    }


    /**
     * Sets the pendingShipmentDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param pendingShipmentDetail   * This field should be populated for pending shipments (e.g.
     * e-mail label) It is required by a PENDING_SHIPMENT special service
     * type.
     */
    public void setPendingShipmentDetail(com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentDetail pendingShipmentDetail) {
        this.pendingShipmentDetail = pendingShipmentDetail;
    }


    /**
     * Gets the internationalControlledExportDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return internationalControlledExportDetail
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.InternationalControlledExportDetail getInternationalControlledExportDetail() {
        return internationalControlledExportDetail;
    }


    /**
     * Sets the internationalControlledExportDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param internationalControlledExportDetail
     */
    public void setInternationalControlledExportDetail(com.cts.ptms.model.fedex.ws.ship.v17.InternationalControlledExportDetail internationalControlledExportDetail) {
        this.internationalControlledExportDetail = internationalControlledExportDetail;
    }


    /**
     * Gets the internationalTrafficInArmsRegulationsDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return internationalTrafficInArmsRegulationsDetail
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.InternationalTrafficInArmsRegulationsDetail getInternationalTrafficInArmsRegulationsDetail() {
        return internationalTrafficInArmsRegulationsDetail;
    }


    /**
     * Sets the internationalTrafficInArmsRegulationsDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param internationalTrafficInArmsRegulationsDetail
     */
    public void setInternationalTrafficInArmsRegulationsDetail(com.cts.ptms.model.fedex.ws.ship.v17.InternationalTrafficInArmsRegulationsDetail internationalTrafficInArmsRegulationsDetail) {
        this.internationalTrafficInArmsRegulationsDetail = internationalTrafficInArmsRegulationsDetail;
    }


    /**
     * Gets the shipmentDryIceDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return shipmentDryIceDetail   * Number of packages in this shipment which contain dry ice and
     * the total weight of the dry ice for this shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ShipmentDryIceDetail getShipmentDryIceDetail() {
        return shipmentDryIceDetail;
    }


    /**
     * Sets the shipmentDryIceDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param shipmentDryIceDetail   * Number of packages in this shipment which contain dry ice and
     * the total weight of the dry ice for this shipment.
     */
    public void setShipmentDryIceDetail(com.cts.ptms.model.fedex.ws.ship.v17.ShipmentDryIceDetail shipmentDryIceDetail) {
        this.shipmentDryIceDetail = shipmentDryIceDetail;
    }


    /**
     * Gets the homeDeliveryPremiumDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return homeDeliveryPremiumDetail   * The descriptive data required for FedEx Home Delivery options.
     * This element is required when SpecialServiceType.HOME_DELIVERY_PREMIUM
     * is present in the SpecialServiceTypes collection
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.HomeDeliveryPremiumDetail getHomeDeliveryPremiumDetail() {
        return homeDeliveryPremiumDetail;
    }


    /**
     * Sets the homeDeliveryPremiumDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param homeDeliveryPremiumDetail   * The descriptive data required for FedEx Home Delivery options.
     * This element is required when SpecialServiceType.HOME_DELIVERY_PREMIUM
     * is present in the SpecialServiceTypes collection
     */
    public void setHomeDeliveryPremiumDetail(com.cts.ptms.model.fedex.ws.ship.v17.HomeDeliveryPremiumDetail homeDeliveryPremiumDetail) {
        this.homeDeliveryPremiumDetail = homeDeliveryPremiumDetail;
    }


    /**
     * Gets the freightGuaranteeDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return freightGuaranteeDetail
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.FreightGuaranteeDetail getFreightGuaranteeDetail() {
        return freightGuaranteeDetail;
    }


    /**
     * Sets the freightGuaranteeDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param freightGuaranteeDetail
     */
    public void setFreightGuaranteeDetail(com.cts.ptms.model.fedex.ws.ship.v17.FreightGuaranteeDetail freightGuaranteeDetail) {
        this.freightGuaranteeDetail = freightGuaranteeDetail;
    }


    /**
     * Gets the etdDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return etdDetail   * Electronic Trade document references.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.EtdDetail getEtdDetail() {
        return etdDetail;
    }


    /**
     * Sets the etdDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param etdDetail   * Electronic Trade document references.
     */
    public void setEtdDetail(com.cts.ptms.model.fedex.ws.ship.v17.EtdDetail etdDetail) {
        this.etdDetail = etdDetail;
    }


    /**
     * Gets the customDeliveryWindowDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return customDeliveryWindowDetail   * Specification for date or range of dates on which delivery
     * is to be attempted.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.CustomDeliveryWindowDetail getCustomDeliveryWindowDetail() {
        return customDeliveryWindowDetail;
    }


    /**
     * Sets the customDeliveryWindowDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param customDeliveryWindowDetail   * Specification for date or range of dates on which delivery
     * is to be attempted.
     */
    public void setCustomDeliveryWindowDetail(com.cts.ptms.model.fedex.ws.ship.v17.CustomDeliveryWindowDetail customDeliveryWindowDetail) {
        this.customDeliveryWindowDetail = customDeliveryWindowDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentSpecialServicesRequested)) return false;
        ShipmentSpecialServicesRequested other = (ShipmentSpecialServicesRequested) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.specialServiceTypes==null && other.getSpecialServiceTypes()==null) || 
             (this.specialServiceTypes!=null &&
              java.util.Arrays.equals(this.specialServiceTypes, other.getSpecialServiceTypes()))) &&
            ((this.codDetail==null && other.getCodDetail()==null) || 
             (this.codDetail!=null &&
              this.codDetail.equals(other.getCodDetail()))) &&
            ((this.deliveryOnInvoiceAcceptanceDetail==null && other.getDeliveryOnInvoiceAcceptanceDetail()==null) || 
             (this.deliveryOnInvoiceAcceptanceDetail!=null &&
              this.deliveryOnInvoiceAcceptanceDetail.equals(other.getDeliveryOnInvoiceAcceptanceDetail()))) &&
            ((this.holdAtLocationDetail==null && other.getHoldAtLocationDetail()==null) || 
             (this.holdAtLocationDetail!=null &&
              this.holdAtLocationDetail.equals(other.getHoldAtLocationDetail()))) &&
            ((this.EMailNotificationDetail==null && other.getEMailNotificationDetail()==null) || 
             (this.EMailNotificationDetail!=null &&
              this.EMailNotificationDetail.equals(other.getEMailNotificationDetail()))) &&
            ((this.returnShipmentDetail==null && other.getReturnShipmentDetail()==null) || 
             (this.returnShipmentDetail!=null &&
              this.returnShipmentDetail.equals(other.getReturnShipmentDetail()))) &&
            ((this.pendingShipmentDetail==null && other.getPendingShipmentDetail()==null) || 
             (this.pendingShipmentDetail!=null &&
              this.pendingShipmentDetail.equals(other.getPendingShipmentDetail()))) &&
            ((this.internationalControlledExportDetail==null && other.getInternationalControlledExportDetail()==null) || 
             (this.internationalControlledExportDetail!=null &&
              this.internationalControlledExportDetail.equals(other.getInternationalControlledExportDetail()))) &&
            ((this.internationalTrafficInArmsRegulationsDetail==null && other.getInternationalTrafficInArmsRegulationsDetail()==null) || 
             (this.internationalTrafficInArmsRegulationsDetail!=null &&
              this.internationalTrafficInArmsRegulationsDetail.equals(other.getInternationalTrafficInArmsRegulationsDetail()))) &&
            ((this.shipmentDryIceDetail==null && other.getShipmentDryIceDetail()==null) || 
             (this.shipmentDryIceDetail!=null &&
              this.shipmentDryIceDetail.equals(other.getShipmentDryIceDetail()))) &&
            ((this.homeDeliveryPremiumDetail==null && other.getHomeDeliveryPremiumDetail()==null) || 
             (this.homeDeliveryPremiumDetail!=null &&
              this.homeDeliveryPremiumDetail.equals(other.getHomeDeliveryPremiumDetail()))) &&
            ((this.freightGuaranteeDetail==null && other.getFreightGuaranteeDetail()==null) || 
             (this.freightGuaranteeDetail!=null &&
              this.freightGuaranteeDetail.equals(other.getFreightGuaranteeDetail()))) &&
            ((this.etdDetail==null && other.getEtdDetail()==null) || 
             (this.etdDetail!=null &&
              this.etdDetail.equals(other.getEtdDetail()))) &&
            ((this.customDeliveryWindowDetail==null && other.getCustomDeliveryWindowDetail()==null) || 
             (this.customDeliveryWindowDetail!=null &&
              this.customDeliveryWindowDetail.equals(other.getCustomDeliveryWindowDetail())));
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
        if (getSpecialServiceTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialServiceTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecialServiceTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCodDetail() != null) {
            _hashCode += getCodDetail().hashCode();
        }
        if (getDeliveryOnInvoiceAcceptanceDetail() != null) {
            _hashCode += getDeliveryOnInvoiceAcceptanceDetail().hashCode();
        }
        if (getHoldAtLocationDetail() != null) {
            _hashCode += getHoldAtLocationDetail().hashCode();
        }
        if (getEMailNotificationDetail() != null) {
            _hashCode += getEMailNotificationDetail().hashCode();
        }
        if (getReturnShipmentDetail() != null) {
            _hashCode += getReturnShipmentDetail().hashCode();
        }
        if (getPendingShipmentDetail() != null) {
            _hashCode += getPendingShipmentDetail().hashCode();
        }
        if (getInternationalControlledExportDetail() != null) {
            _hashCode += getInternationalControlledExportDetail().hashCode();
        }
        if (getInternationalTrafficInArmsRegulationsDetail() != null) {
            _hashCode += getInternationalTrafficInArmsRegulationsDetail().hashCode();
        }
        if (getShipmentDryIceDetail() != null) {
            _hashCode += getShipmentDryIceDetail().hashCode();
        }
        if (getHomeDeliveryPremiumDetail() != null) {
            _hashCode += getHomeDeliveryPremiumDetail().hashCode();
        }
        if (getFreightGuaranteeDetail() != null) {
            _hashCode += getFreightGuaranteeDetail().hashCode();
        }
        if (getEtdDetail() != null) {
            _hashCode += getEtdDetail().hashCode();
        }
        if (getCustomDeliveryWindowDetail() != null) {
            _hashCode += getCustomDeliveryWindowDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentSpecialServicesRequested.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentSpecialServicesRequested"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServiceTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SpecialServiceTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentSpecialServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CodDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CodDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOnInvoiceAcceptanceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DeliveryOnInvoiceAcceptanceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DeliveryOnInvoiceAcceptanceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdAtLocationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HoldAtLocationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HoldAtLocationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailNotificationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EMailNotificationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EMailNotificationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ReturnShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ReturnShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PendingShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PendingShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalControlledExportDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "InternationalControlledExportDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "InternationalControlledExportDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalTrafficInArmsRegulationsDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "InternationalTrafficInArmsRegulationsDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "InternationalTrafficInArmsRegulationsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentDryIceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentDryIceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentDryIceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeDeliveryPremiumDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HomeDeliveryPremiumDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HomeDeliveryPremiumDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightGuaranteeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightGuaranteeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightGuaranteeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etdDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EtdDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EtdDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customDeliveryWindowDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomDeliveryWindowDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomDeliveryWindowDetail"));
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