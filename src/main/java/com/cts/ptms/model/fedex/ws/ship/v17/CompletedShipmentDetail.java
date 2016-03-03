/**
 * CompletedShipmentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cts.ptms.model.fedex.ws.ship.v17;

public class CompletedShipmentDetail  implements java.io.Serializable {
    /* Indicates whether or not this is a US Domestic shipment. */
    private java.lang.Boolean usDomestic;

    /* Indicates the carrier that will be used to deliver this shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.CarrierCodeType carrierCode;

    /* The master tracking number and form id of this multiple piece
     * shipment. This information is to be provided for each subsequent of
     * a multiple piece shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.TrackingId masterTrackingId;

    /* Description of the FedEx service used for this shipment. Currently
     * not supported. */
    private java.lang.String serviceTypeDescription;

    /* Description of the packaging used for this shipment. Currently
     * not supported. */
    private java.lang.String packagingDescription;

    private com.cts.ptms.model.fedex.ws.ship.v17.ShipmentOperationalDetail operationalDetail;

    /* Only used with pending shipments. */
    private com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentAccessorDetail[] accessDetail;

    /* Only used in the reply to tag requests. */
    private com.cts.ptms.model.fedex.ws.ship.v17.CompletedTagDetail tagDetail;

    /* Provides reply information specific to SmartPost shipments. */
    private com.cts.ptms.model.fedex.ws.ship.v17.CompletedSmartPostDetail smartPostDetail;

    /* Computed shipment level information about hazarous commodities. */
    private com.cts.ptms.model.fedex.ws.ship.v17.CompletedHazardousShipmentDetail hazardousShipmentDetail;

    /* All shipment-level rating data for this shipment, which may
     * include data for multiple rate types. */
    private com.cts.ptms.model.fedex.ws.ship.v17.ShipmentRating shipmentRating;

    /* Returns the default holding location information when HOLD_AT_LOCATION
     * special service is requested and the client does not specify the hold
     * location address. */
    private com.cts.ptms.model.fedex.ws.ship.v17.CompletedHoldAtLocationDetail completedHoldAtLocationDetail;

    /* Returns any defaults or updates applied to RequestedShipment.exportDetail.exportComplianceStatement. */
    private java.lang.String exportComplianceStatement;

    private com.cts.ptms.model.fedex.ws.ship.v17.CompletedEtdDetail completedEtdDetail;

    /* All shipment-level shipping documents (other than labels and
     * barcodes). */
    private com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocument[] shipmentDocuments;

    private com.cts.ptms.model.fedex.ws.ship.v17.AssociatedShipmentDetail[] associatedShipments;

    private com.cts.ptms.model.fedex.ws.ship.v17.CompletedCodDetail completedCodDetail;

    /* Package level details about this package. */
    private com.cts.ptms.model.fedex.ws.ship.v17.CompletedPackageDetail[] completedPackageDetails;

    public CompletedShipmentDetail() {
    }

    public CompletedShipmentDetail(
           java.lang.Boolean usDomestic,
           com.cts.ptms.model.fedex.ws.ship.v17.CarrierCodeType carrierCode,
           com.cts.ptms.model.fedex.ws.ship.v17.TrackingId masterTrackingId,
           java.lang.String serviceTypeDescription,
           java.lang.String packagingDescription,
           com.cts.ptms.model.fedex.ws.ship.v17.ShipmentOperationalDetail operationalDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentAccessorDetail[] accessDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.CompletedTagDetail tagDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.CompletedSmartPostDetail smartPostDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.CompletedHazardousShipmentDetail hazardousShipmentDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.ShipmentRating shipmentRating,
           com.cts.ptms.model.fedex.ws.ship.v17.CompletedHoldAtLocationDetail completedHoldAtLocationDetail,
           java.lang.String exportComplianceStatement,
           com.cts.ptms.model.fedex.ws.ship.v17.CompletedEtdDetail completedEtdDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocument[] shipmentDocuments,
           com.cts.ptms.model.fedex.ws.ship.v17.AssociatedShipmentDetail[] associatedShipments,
           com.cts.ptms.model.fedex.ws.ship.v17.CompletedCodDetail completedCodDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.CompletedPackageDetail[] completedPackageDetails) {
           this.usDomestic = usDomestic;
           this.carrierCode = carrierCode;
           this.masterTrackingId = masterTrackingId;
           this.serviceTypeDescription = serviceTypeDescription;
           this.packagingDescription = packagingDescription;
           this.operationalDetail = operationalDetail;
           this.accessDetail = accessDetail;
           this.tagDetail = tagDetail;
           this.smartPostDetail = smartPostDetail;
           this.hazardousShipmentDetail = hazardousShipmentDetail;
           this.shipmentRating = shipmentRating;
           this.completedHoldAtLocationDetail = completedHoldAtLocationDetail;
           this.exportComplianceStatement = exportComplianceStatement;
           this.completedEtdDetail = completedEtdDetail;
           this.shipmentDocuments = shipmentDocuments;
           this.associatedShipments = associatedShipments;
           this.completedCodDetail = completedCodDetail;
           this.completedPackageDetails = completedPackageDetails;
    }


    /**
     * Gets the usDomestic value for this CompletedShipmentDetail.
     * 
     * @return usDomestic   * Indicates whether or not this is a US Domestic shipment.
     */
    public java.lang.Boolean getUsDomestic() {
        return usDomestic;
    }


    /**
     * Sets the usDomestic value for this CompletedShipmentDetail.
     * 
     * @param usDomestic   * Indicates whether or not this is a US Domestic shipment.
     */
    public void setUsDomestic(java.lang.Boolean usDomestic) {
        this.usDomestic = usDomestic;
    }


    /**
     * Gets the carrierCode value for this CompletedShipmentDetail.
     * 
     * @return carrierCode   * Indicates the carrier that will be used to deliver this shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.CarrierCodeType getCarrierCode() {
        return carrierCode;
    }


    /**
     * Sets the carrierCode value for this CompletedShipmentDetail.
     * 
     * @param carrierCode   * Indicates the carrier that will be used to deliver this shipment.
     */
    public void setCarrierCode(com.cts.ptms.model.fedex.ws.ship.v17.CarrierCodeType carrierCode) {
        this.carrierCode = carrierCode;
    }


    /**
     * Gets the masterTrackingId value for this CompletedShipmentDetail.
     * 
     * @return masterTrackingId   * The master tracking number and form id of this multiple piece
     * shipment. This information is to be provided for each subsequent of
     * a multiple piece shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.TrackingId getMasterTrackingId() {
        return masterTrackingId;
    }


    /**
     * Sets the masterTrackingId value for this CompletedShipmentDetail.
     * 
     * @param masterTrackingId   * The master tracking number and form id of this multiple piece
     * shipment. This information is to be provided for each subsequent of
     * a multiple piece shipment.
     */
    public void setMasterTrackingId(com.cts.ptms.model.fedex.ws.ship.v17.TrackingId masterTrackingId) {
        this.masterTrackingId = masterTrackingId;
    }


    /**
     * Gets the serviceTypeDescription value for this CompletedShipmentDetail.
     * 
     * @return serviceTypeDescription   * Description of the FedEx service used for this shipment. Currently
     * not supported.
     */
    public java.lang.String getServiceTypeDescription() {
        return serviceTypeDescription;
    }


    /**
     * Sets the serviceTypeDescription value for this CompletedShipmentDetail.
     * 
     * @param serviceTypeDescription   * Description of the FedEx service used for this shipment. Currently
     * not supported.
     */
    public void setServiceTypeDescription(java.lang.String serviceTypeDescription) {
        this.serviceTypeDescription = serviceTypeDescription;
    }


    /**
     * Gets the packagingDescription value for this CompletedShipmentDetail.
     * 
     * @return packagingDescription   * Description of the packaging used for this shipment. Currently
     * not supported.
     */
    public java.lang.String getPackagingDescription() {
        return packagingDescription;
    }


    /**
     * Sets the packagingDescription value for this CompletedShipmentDetail.
     * 
     * @param packagingDescription   * Description of the packaging used for this shipment. Currently
     * not supported.
     */
    public void setPackagingDescription(java.lang.String packagingDescription) {
        this.packagingDescription = packagingDescription;
    }


    /**
     * Gets the operationalDetail value for this CompletedShipmentDetail.
     * 
     * @return operationalDetail
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ShipmentOperationalDetail getOperationalDetail() {
        return operationalDetail;
    }


    /**
     * Sets the operationalDetail value for this CompletedShipmentDetail.
     * 
     * @param operationalDetail
     */
    public void setOperationalDetail(com.cts.ptms.model.fedex.ws.ship.v17.ShipmentOperationalDetail operationalDetail) {
        this.operationalDetail = operationalDetail;
    }


    /**
     * Gets the accessDetail value for this CompletedShipmentDetail.
     * 
     * @return accessDetail   * Only used with pending shipments.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentAccessorDetail[] getAccessDetail() {
        return accessDetail;
    }


    /**
     * Sets the accessDetail value for this CompletedShipmentDetail.
     * 
     * @param accessDetail   * Only used with pending shipments.
     */
    public void setAccessDetail(com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentAccessorDetail[] accessDetail) {
        this.accessDetail = accessDetail;
    }


    /**
     * Gets the tagDetail value for this CompletedShipmentDetail.
     * 
     * @return tagDetail   * Only used in the reply to tag requests.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.CompletedTagDetail getTagDetail() {
        return tagDetail;
    }


    /**
     * Sets the tagDetail value for this CompletedShipmentDetail.
     * 
     * @param tagDetail   * Only used in the reply to tag requests.
     */
    public void setTagDetail(com.cts.ptms.model.fedex.ws.ship.v17.CompletedTagDetail tagDetail) {
        this.tagDetail = tagDetail;
    }


    /**
     * Gets the smartPostDetail value for this CompletedShipmentDetail.
     * 
     * @return smartPostDetail   * Provides reply information specific to SmartPost shipments.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.CompletedSmartPostDetail getSmartPostDetail() {
        return smartPostDetail;
    }


    /**
     * Sets the smartPostDetail value for this CompletedShipmentDetail.
     * 
     * @param smartPostDetail   * Provides reply information specific to SmartPost shipments.
     */
    public void setSmartPostDetail(com.cts.ptms.model.fedex.ws.ship.v17.CompletedSmartPostDetail smartPostDetail) {
        this.smartPostDetail = smartPostDetail;
    }


    /**
     * Gets the hazardousShipmentDetail value for this CompletedShipmentDetail.
     * 
     * @return hazardousShipmentDetail   * Computed shipment level information about hazarous commodities.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.CompletedHazardousShipmentDetail getHazardousShipmentDetail() {
        return hazardousShipmentDetail;
    }


    /**
     * Sets the hazardousShipmentDetail value for this CompletedShipmentDetail.
     * 
     * @param hazardousShipmentDetail   * Computed shipment level information about hazarous commodities.
     */
    public void setHazardousShipmentDetail(com.cts.ptms.model.fedex.ws.ship.v17.CompletedHazardousShipmentDetail hazardousShipmentDetail) {
        this.hazardousShipmentDetail = hazardousShipmentDetail;
    }


    /**
     * Gets the shipmentRating value for this CompletedShipmentDetail.
     * 
     * @return shipmentRating   * All shipment-level rating data for this shipment, which may
     * include data for multiple rate types.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ShipmentRating getShipmentRating() {
        return shipmentRating;
    }


    /**
     * Sets the shipmentRating value for this CompletedShipmentDetail.
     * 
     * @param shipmentRating   * All shipment-level rating data for this shipment, which may
     * include data for multiple rate types.
     */
    public void setShipmentRating(com.cts.ptms.model.fedex.ws.ship.v17.ShipmentRating shipmentRating) {
        this.shipmentRating = shipmentRating;
    }


    /**
     * Gets the completedHoldAtLocationDetail value for this CompletedShipmentDetail.
     * 
     * @return completedHoldAtLocationDetail   * Returns the default holding location information when HOLD_AT_LOCATION
     * special service is requested and the client does not specify the hold
     * location address.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.CompletedHoldAtLocationDetail getCompletedHoldAtLocationDetail() {
        return completedHoldAtLocationDetail;
    }


    /**
     * Sets the completedHoldAtLocationDetail value for this CompletedShipmentDetail.
     * 
     * @param completedHoldAtLocationDetail   * Returns the default holding location information when HOLD_AT_LOCATION
     * special service is requested and the client does not specify the hold
     * location address.
     */
    public void setCompletedHoldAtLocationDetail(com.cts.ptms.model.fedex.ws.ship.v17.CompletedHoldAtLocationDetail completedHoldAtLocationDetail) {
        this.completedHoldAtLocationDetail = completedHoldAtLocationDetail;
    }


    /**
     * Gets the exportComplianceStatement value for this CompletedShipmentDetail.
     * 
     * @return exportComplianceStatement   * Returns any defaults or updates applied to RequestedShipment.exportDetail.exportComplianceStatement.
     */
    public java.lang.String getExportComplianceStatement() {
        return exportComplianceStatement;
    }


    /**
     * Sets the exportComplianceStatement value for this CompletedShipmentDetail.
     * 
     * @param exportComplianceStatement   * Returns any defaults or updates applied to RequestedShipment.exportDetail.exportComplianceStatement.
     */
    public void setExportComplianceStatement(java.lang.String exportComplianceStatement) {
        this.exportComplianceStatement = exportComplianceStatement;
    }


    /**
     * Gets the completedEtdDetail value for this CompletedShipmentDetail.
     * 
     * @return completedEtdDetail
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.CompletedEtdDetail getCompletedEtdDetail() {
        return completedEtdDetail;
    }


    /**
     * Sets the completedEtdDetail value for this CompletedShipmentDetail.
     * 
     * @param completedEtdDetail
     */
    public void setCompletedEtdDetail(com.cts.ptms.model.fedex.ws.ship.v17.CompletedEtdDetail completedEtdDetail) {
        this.completedEtdDetail = completedEtdDetail;
    }


    /**
     * Gets the shipmentDocuments value for this CompletedShipmentDetail.
     * 
     * @return shipmentDocuments   * All shipment-level shipping documents (other than labels and
     * barcodes).
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocument[] getShipmentDocuments() {
        return shipmentDocuments;
    }


    /**
     * Sets the shipmentDocuments value for this CompletedShipmentDetail.
     * 
     * @param shipmentDocuments   * All shipment-level shipping documents (other than labels and
     * barcodes).
     */
    public void setShipmentDocuments(com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocument[] shipmentDocuments) {
        this.shipmentDocuments = shipmentDocuments;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocument getShipmentDocuments(int i) {
        return this.shipmentDocuments[i];
    }

    public void setShipmentDocuments(int i, com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocument _value) {
        this.shipmentDocuments[i] = _value;
    }


    /**
     * Gets the associatedShipments value for this CompletedShipmentDetail.
     * 
     * @return associatedShipments
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.AssociatedShipmentDetail[] getAssociatedShipments() {
        return associatedShipments;
    }


    /**
     * Sets the associatedShipments value for this CompletedShipmentDetail.
     * 
     * @param associatedShipments
     */
    public void setAssociatedShipments(com.cts.ptms.model.fedex.ws.ship.v17.AssociatedShipmentDetail[] associatedShipments) {
        this.associatedShipments = associatedShipments;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.AssociatedShipmentDetail getAssociatedShipments(int i) {
        return this.associatedShipments[i];
    }

    public void setAssociatedShipments(int i, com.cts.ptms.model.fedex.ws.ship.v17.AssociatedShipmentDetail _value) {
        this.associatedShipments[i] = _value;
    }


    /**
     * Gets the completedCodDetail value for this CompletedShipmentDetail.
     * 
     * @return completedCodDetail
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.CompletedCodDetail getCompletedCodDetail() {
        return completedCodDetail;
    }


    /**
     * Sets the completedCodDetail value for this CompletedShipmentDetail.
     * 
     * @param completedCodDetail
     */
    public void setCompletedCodDetail(com.cts.ptms.model.fedex.ws.ship.v17.CompletedCodDetail completedCodDetail) {
        this.completedCodDetail = completedCodDetail;
    }


    /**
     * Gets the completedPackageDetails value for this CompletedShipmentDetail.
     * 
     * @return completedPackageDetails   * Package level details about this package.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.CompletedPackageDetail[] getCompletedPackageDetails() {
        return completedPackageDetails;
    }


    /**
     * Sets the completedPackageDetails value for this CompletedShipmentDetail.
     * 
     * @param completedPackageDetails   * Package level details about this package.
     */
    public void setCompletedPackageDetails(com.cts.ptms.model.fedex.ws.ship.v17.CompletedPackageDetail[] completedPackageDetails) {
        this.completedPackageDetails = completedPackageDetails;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.CompletedPackageDetail getCompletedPackageDetails(int i) {
        return this.completedPackageDetails[i];
    }

    public void setCompletedPackageDetails(int i, com.cts.ptms.model.fedex.ws.ship.v17.CompletedPackageDetail _value) {
        this.completedPackageDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompletedShipmentDetail)) return false;
        CompletedShipmentDetail other = (CompletedShipmentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usDomestic==null && other.getUsDomestic()==null) || 
             (this.usDomestic!=null &&
              this.usDomestic.equals(other.getUsDomestic()))) &&
            ((this.carrierCode==null && other.getCarrierCode()==null) || 
             (this.carrierCode!=null &&
              this.carrierCode.equals(other.getCarrierCode()))) &&
            ((this.masterTrackingId==null && other.getMasterTrackingId()==null) || 
             (this.masterTrackingId!=null &&
              this.masterTrackingId.equals(other.getMasterTrackingId()))) &&
            ((this.serviceTypeDescription==null && other.getServiceTypeDescription()==null) || 
             (this.serviceTypeDescription!=null &&
              this.serviceTypeDescription.equals(other.getServiceTypeDescription()))) &&
            ((this.packagingDescription==null && other.getPackagingDescription()==null) || 
             (this.packagingDescription!=null &&
              this.packagingDescription.equals(other.getPackagingDescription()))) &&
            ((this.operationalDetail==null && other.getOperationalDetail()==null) || 
             (this.operationalDetail!=null &&
              this.operationalDetail.equals(other.getOperationalDetail()))) &&
            ((this.accessDetail==null && other.getAccessDetail()==null) || 
             (this.accessDetail!=null &&
              java.util.Arrays.equals(this.accessDetail, other.getAccessDetail()))) &&
            ((this.tagDetail==null && other.getTagDetail()==null) || 
             (this.tagDetail!=null &&
              this.tagDetail.equals(other.getTagDetail()))) &&
            ((this.smartPostDetail==null && other.getSmartPostDetail()==null) || 
             (this.smartPostDetail!=null &&
              this.smartPostDetail.equals(other.getSmartPostDetail()))) &&
            ((this.hazardousShipmentDetail==null && other.getHazardousShipmentDetail()==null) || 
             (this.hazardousShipmentDetail!=null &&
              this.hazardousShipmentDetail.equals(other.getHazardousShipmentDetail()))) &&
            ((this.shipmentRating==null && other.getShipmentRating()==null) || 
             (this.shipmentRating!=null &&
              this.shipmentRating.equals(other.getShipmentRating()))) &&
            ((this.completedHoldAtLocationDetail==null && other.getCompletedHoldAtLocationDetail()==null) || 
             (this.completedHoldAtLocationDetail!=null &&
              this.completedHoldAtLocationDetail.equals(other.getCompletedHoldAtLocationDetail()))) &&
            ((this.exportComplianceStatement==null && other.getExportComplianceStatement()==null) || 
             (this.exportComplianceStatement!=null &&
              this.exportComplianceStatement.equals(other.getExportComplianceStatement()))) &&
            ((this.completedEtdDetail==null && other.getCompletedEtdDetail()==null) || 
             (this.completedEtdDetail!=null &&
              this.completedEtdDetail.equals(other.getCompletedEtdDetail()))) &&
            ((this.shipmentDocuments==null && other.getShipmentDocuments()==null) || 
             (this.shipmentDocuments!=null &&
              java.util.Arrays.equals(this.shipmentDocuments, other.getShipmentDocuments()))) &&
            ((this.associatedShipments==null && other.getAssociatedShipments()==null) || 
             (this.associatedShipments!=null &&
              java.util.Arrays.equals(this.associatedShipments, other.getAssociatedShipments()))) &&
            ((this.completedCodDetail==null && other.getCompletedCodDetail()==null) || 
             (this.completedCodDetail!=null &&
              this.completedCodDetail.equals(other.getCompletedCodDetail()))) &&
            ((this.completedPackageDetails==null && other.getCompletedPackageDetails()==null) || 
             (this.completedPackageDetails!=null &&
              java.util.Arrays.equals(this.completedPackageDetails, other.getCompletedPackageDetails())));
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
        if (getUsDomestic() != null) {
            _hashCode += getUsDomestic().hashCode();
        }
        if (getCarrierCode() != null) {
            _hashCode += getCarrierCode().hashCode();
        }
        if (getMasterTrackingId() != null) {
            _hashCode += getMasterTrackingId().hashCode();
        }
        if (getServiceTypeDescription() != null) {
            _hashCode += getServiceTypeDescription().hashCode();
        }
        if (getPackagingDescription() != null) {
            _hashCode += getPackagingDescription().hashCode();
        }
        if (getOperationalDetail() != null) {
            _hashCode += getOperationalDetail().hashCode();
        }
        if (getAccessDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccessDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccessDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTagDetail() != null) {
            _hashCode += getTagDetail().hashCode();
        }
        if (getSmartPostDetail() != null) {
            _hashCode += getSmartPostDetail().hashCode();
        }
        if (getHazardousShipmentDetail() != null) {
            _hashCode += getHazardousShipmentDetail().hashCode();
        }
        if (getShipmentRating() != null) {
            _hashCode += getShipmentRating().hashCode();
        }
        if (getCompletedHoldAtLocationDetail() != null) {
            _hashCode += getCompletedHoldAtLocationDetail().hashCode();
        }
        if (getExportComplianceStatement() != null) {
            _hashCode += getExportComplianceStatement().hashCode();
        }
        if (getCompletedEtdDetail() != null) {
            _hashCode += getCompletedEtdDetail().hashCode();
        }
        if (getShipmentDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentDocuments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssociatedShipments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociatedShipments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociatedShipments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompletedCodDetail() != null) {
            _hashCode += getCompletedCodDetail().hashCode();
        }
        if (getCompletedPackageDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompletedPackageDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompletedPackageDetails(), i);
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
        new org.apache.axis.description.TypeDesc(CompletedShipmentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedShipmentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "UsDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CarrierCodeType"));
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
        elemField.setFieldName("serviceTypeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ServiceTypeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PackagingDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationalDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "OperationalDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentOperationalDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "AccessDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PendingShipmentAccessorDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "AccessorDetails"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TagDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedTagDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartPostDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SmartPostDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedSmartPostDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazardousShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedHazardousShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentRating"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedHoldAtLocationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedHoldAtLocationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedHoldAtLocationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportComplianceStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ExportComplianceStatement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedEtdDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedEtdDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedEtdDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedShipments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "AssociatedShipments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "AssociatedShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedCodDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedCodDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedCodDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedPackageDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedPackageDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedPackageDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
