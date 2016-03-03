/**
 * PackageSpecialServicesRequested.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cts.ptms.model.fedex.ws.ship.v17;


/**
 * These special services are available at the package level for some
 * or all service types. If the shipper is requesting a special service
 * which requires additional data, the package special service type must
 * be present in the specialServiceTypes collection, and the supporting
 * detail must be provided in the appropriate sub-object below.
 */
public class PackageSpecialServicesRequested  implements java.io.Serializable {
    /* The types of all special services requested for the enclosing
     * shipment or package. */
    private com.cts.ptms.model.fedex.ws.ship.v17.PackageSpecialServiceType[] specialServiceTypes;

    /* For use with FedEx Ground services only; COD must be present
     * in shipment's special services. */
    private com.cts.ptms.model.fedex.ws.ship.v17.CodDetail codDetail;

    /* Descriptive data required for a FedEx shipment containing dangerous
     * materials. This element is required when SpecialServiceType.DANGEROUS_GOODS
     * or HAZARDOUS_MATERIAL is present in the SpecialServiceTypes collection. */
    private com.cts.ptms.model.fedex.ws.ship.v17.DangerousGoodsDetail dangerousGoodsDetail;

    /* Descriptive data required for a FedEx shipment containing dry
     * ice. This element is required when SpecialServiceType.DRY_ICE is present
     * in the SpecialServiceTypes collection. */
    private com.cts.ptms.model.fedex.ws.ship.v17.Weight dryIceWeight;

    /* The descriptive data required for FedEx signature services.
     * This element is required when SpecialServiceType.SIGNATURE_OPTION
     * is present in the SpecialServiceTypes collection. */
    private com.cts.ptms.model.fedex.ws.ship.v17.SignatureOptionDetail signatureOptionDetail;

    /* The descriptive data required for FedEx Priority Alert service.
     * This element is required when SpecialServiceType.PRIORITY_ALERT is
     * present in the SpecialServiceTypes collection. */
    private com.cts.ptms.model.fedex.ws.ship.v17.PriorityAlertDetail priorityAlertDetail;

    private com.cts.ptms.model.fedex.ws.ship.v17.AlcoholDetail alcoholDetail;

    public PackageSpecialServicesRequested() {
    }

    public PackageSpecialServicesRequested(
           com.cts.ptms.model.fedex.ws.ship.v17.PackageSpecialServiceType[] specialServiceTypes,
           com.cts.ptms.model.fedex.ws.ship.v17.CodDetail codDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.DangerousGoodsDetail dangerousGoodsDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.Weight dryIceWeight,
           com.cts.ptms.model.fedex.ws.ship.v17.SignatureOptionDetail signatureOptionDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.PriorityAlertDetail priorityAlertDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.AlcoholDetail alcoholDetail) {
           this.specialServiceTypes = specialServiceTypes;
           this.codDetail = codDetail;
           this.dangerousGoodsDetail = dangerousGoodsDetail;
           this.dryIceWeight = dryIceWeight;
           this.signatureOptionDetail = signatureOptionDetail;
           this.priorityAlertDetail = priorityAlertDetail;
           this.alcoholDetail = alcoholDetail;
    }


    /**
     * Gets the specialServiceTypes value for this PackageSpecialServicesRequested.
     * 
     * @return specialServiceTypes   * The types of all special services requested for the enclosing
     * shipment or package.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.PackageSpecialServiceType[] getSpecialServiceTypes() {
        return specialServiceTypes;
    }


    /**
     * Sets the specialServiceTypes value for this PackageSpecialServicesRequested.
     * 
     * @param specialServiceTypes   * The types of all special services requested for the enclosing
     * shipment or package.
     */
    public void setSpecialServiceTypes(com.cts.ptms.model.fedex.ws.ship.v17.PackageSpecialServiceType[] specialServiceTypes) {
        this.specialServiceTypes = specialServiceTypes;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.PackageSpecialServiceType getSpecialServiceTypes(int i) {
        return this.specialServiceTypes[i];
    }

    public void setSpecialServiceTypes(int i, com.cts.ptms.model.fedex.ws.ship.v17.PackageSpecialServiceType _value) {
        this.specialServiceTypes[i] = _value;
    }


    /**
     * Gets the codDetail value for this PackageSpecialServicesRequested.
     * 
     * @return codDetail   * For use with FedEx Ground services only; COD must be present
     * in shipment's special services.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.CodDetail getCodDetail() {
        return codDetail;
    }


    /**
     * Sets the codDetail value for this PackageSpecialServicesRequested.
     * 
     * @param codDetail   * For use with FedEx Ground services only; COD must be present
     * in shipment's special services.
     */
    public void setCodDetail(com.cts.ptms.model.fedex.ws.ship.v17.CodDetail codDetail) {
        this.codDetail = codDetail;
    }


    /**
     * Gets the dangerousGoodsDetail value for this PackageSpecialServicesRequested.
     * 
     * @return dangerousGoodsDetail   * Descriptive data required for a FedEx shipment containing dangerous
     * materials. This element is required when SpecialServiceType.DANGEROUS_GOODS
     * or HAZARDOUS_MATERIAL is present in the SpecialServiceTypes collection.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.DangerousGoodsDetail getDangerousGoodsDetail() {
        return dangerousGoodsDetail;
    }


    /**
     * Sets the dangerousGoodsDetail value for this PackageSpecialServicesRequested.
     * 
     * @param dangerousGoodsDetail   * Descriptive data required for a FedEx shipment containing dangerous
     * materials. This element is required when SpecialServiceType.DANGEROUS_GOODS
     * or HAZARDOUS_MATERIAL is present in the SpecialServiceTypes collection.
     */
    public void setDangerousGoodsDetail(com.cts.ptms.model.fedex.ws.ship.v17.DangerousGoodsDetail dangerousGoodsDetail) {
        this.dangerousGoodsDetail = dangerousGoodsDetail;
    }


    /**
     * Gets the dryIceWeight value for this PackageSpecialServicesRequested.
     * 
     * @return dryIceWeight   * Descriptive data required for a FedEx shipment containing dry
     * ice. This element is required when SpecialServiceType.DRY_ICE is present
     * in the SpecialServiceTypes collection.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Weight getDryIceWeight() {
        return dryIceWeight;
    }


    /**
     * Sets the dryIceWeight value for this PackageSpecialServicesRequested.
     * 
     * @param dryIceWeight   * Descriptive data required for a FedEx shipment containing dry
     * ice. This element is required when SpecialServiceType.DRY_ICE is present
     * in the SpecialServiceTypes collection.
     */
    public void setDryIceWeight(com.cts.ptms.model.fedex.ws.ship.v17.Weight dryIceWeight) {
        this.dryIceWeight = dryIceWeight;
    }


    /**
     * Gets the signatureOptionDetail value for this PackageSpecialServicesRequested.
     * 
     * @return signatureOptionDetail   * The descriptive data required for FedEx signature services.
     * This element is required when SpecialServiceType.SIGNATURE_OPTION
     * is present in the SpecialServiceTypes collection.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.SignatureOptionDetail getSignatureOptionDetail() {
        return signatureOptionDetail;
    }


    /**
     * Sets the signatureOptionDetail value for this PackageSpecialServicesRequested.
     * 
     * @param signatureOptionDetail   * The descriptive data required for FedEx signature services.
     * This element is required when SpecialServiceType.SIGNATURE_OPTION
     * is present in the SpecialServiceTypes collection.
     */
    public void setSignatureOptionDetail(com.cts.ptms.model.fedex.ws.ship.v17.SignatureOptionDetail signatureOptionDetail) {
        this.signatureOptionDetail = signatureOptionDetail;
    }


    /**
     * Gets the priorityAlertDetail value for this PackageSpecialServicesRequested.
     * 
     * @return priorityAlertDetail   * The descriptive data required for FedEx Priority Alert service.
     * This element is required when SpecialServiceType.PRIORITY_ALERT is
     * present in the SpecialServiceTypes collection.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.PriorityAlertDetail getPriorityAlertDetail() {
        return priorityAlertDetail;
    }


    /**
     * Sets the priorityAlertDetail value for this PackageSpecialServicesRequested.
     * 
     * @param priorityAlertDetail   * The descriptive data required for FedEx Priority Alert service.
     * This element is required when SpecialServiceType.PRIORITY_ALERT is
     * present in the SpecialServiceTypes collection.
     */
    public void setPriorityAlertDetail(com.cts.ptms.model.fedex.ws.ship.v17.PriorityAlertDetail priorityAlertDetail) {
        this.priorityAlertDetail = priorityAlertDetail;
    }


    /**
     * Gets the alcoholDetail value for this PackageSpecialServicesRequested.
     * 
     * @return alcoholDetail
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.AlcoholDetail getAlcoholDetail() {
        return alcoholDetail;
    }


    /**
     * Sets the alcoholDetail value for this PackageSpecialServicesRequested.
     * 
     * @param alcoholDetail
     */
    public void setAlcoholDetail(com.cts.ptms.model.fedex.ws.ship.v17.AlcoholDetail alcoholDetail) {
        this.alcoholDetail = alcoholDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackageSpecialServicesRequested)) return false;
        PackageSpecialServicesRequested other = (PackageSpecialServicesRequested) obj;
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
            ((this.dangerousGoodsDetail==null && other.getDangerousGoodsDetail()==null) || 
             (this.dangerousGoodsDetail!=null &&
              this.dangerousGoodsDetail.equals(other.getDangerousGoodsDetail()))) &&
            ((this.dryIceWeight==null && other.getDryIceWeight()==null) || 
             (this.dryIceWeight!=null &&
              this.dryIceWeight.equals(other.getDryIceWeight()))) &&
            ((this.signatureOptionDetail==null && other.getSignatureOptionDetail()==null) || 
             (this.signatureOptionDetail!=null &&
              this.signatureOptionDetail.equals(other.getSignatureOptionDetail()))) &&
            ((this.priorityAlertDetail==null && other.getPriorityAlertDetail()==null) || 
             (this.priorityAlertDetail!=null &&
              this.priorityAlertDetail.equals(other.getPriorityAlertDetail()))) &&
            ((this.alcoholDetail==null && other.getAlcoholDetail()==null) || 
             (this.alcoholDetail!=null &&
              this.alcoholDetail.equals(other.getAlcoholDetail())));
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
        if (getDangerousGoodsDetail() != null) {
            _hashCode += getDangerousGoodsDetail().hashCode();
        }
        if (getDryIceWeight() != null) {
            _hashCode += getDryIceWeight().hashCode();
        }
        if (getSignatureOptionDetail() != null) {
            _hashCode += getSignatureOptionDetail().hashCode();
        }
        if (getPriorityAlertDetail() != null) {
            _hashCode += getPriorityAlertDetail().hashCode();
        }
        if (getAlcoholDetail() != null) {
            _hashCode += getAlcoholDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PackageSpecialServicesRequested.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PackageSpecialServicesRequested"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServiceTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SpecialServiceTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PackageSpecialServiceType"));
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
        elemField.setFieldName("dangerousGoodsDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DangerousGoodsDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DangerousGoodsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dryIceWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DryIceWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureOptionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SignatureOptionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SignatureOptionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityAlertDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PriorityAlertDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PriorityAlertDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alcoholDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "AlcoholDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "AlcoholDetail"));
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
