/**
 * PendingShipmentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cts.ptms.model.fedex.ws.ship.v17;


/**
 * This information describes the kind of pending shipment being requested.
 */
public class PendingShipmentDetail  implements java.io.Serializable {
    /* Identifies the type of FedEx pending shipment */
    private com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentType type;

    /* Date after which the pending shipment will no longer be available
     * for completion. */
    private java.util.Date expirationDate;

    /* Only used with type of EMAIL. */
    private com.cts.ptms.model.fedex.ws.ship.v17.EMailLabelDetail emailLabelDetail;

    private com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentProcessingOptionType[] processingOptions;

    /* These are documents that are recommended to be included with
     * the shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.RecommendedDocumentType[] recommendedDocumentSpecification;

    /* Upload document details provided by the initator of the shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.UploadDocumentReferenceDetail[] documentReferences;

    public PendingShipmentDetail() {
    }

    public PendingShipmentDetail(
           com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentType type,
           java.util.Date expirationDate,
           com.cts.ptms.model.fedex.ws.ship.v17.EMailLabelDetail emailLabelDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentProcessingOptionType[] processingOptions,
           com.cts.ptms.model.fedex.ws.ship.v17.RecommendedDocumentType[] recommendedDocumentSpecification,
           com.cts.ptms.model.fedex.ws.ship.v17.UploadDocumentReferenceDetail[] documentReferences) {
           this.type = type;
           this.expirationDate = expirationDate;
           this.emailLabelDetail = emailLabelDetail;
           this.processingOptions = processingOptions;
           this.recommendedDocumentSpecification = recommendedDocumentSpecification;
           this.documentReferences = documentReferences;
    }


    /**
     * Gets the type value for this PendingShipmentDetail.
     * 
     * @return type   * Identifies the type of FedEx pending shipment
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentType getType() {
        return type;
    }


    /**
     * Sets the type value for this PendingShipmentDetail.
     * 
     * @param type   * Identifies the type of FedEx pending shipment
     */
    public void setType(com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentType type) {
        this.type = type;
    }


    /**
     * Gets the expirationDate value for this PendingShipmentDetail.
     * 
     * @return expirationDate   * Date after which the pending shipment will no longer be available
     * for completion.
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this PendingShipmentDetail.
     * 
     * @param expirationDate   * Date after which the pending shipment will no longer be available
     * for completion.
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the emailLabelDetail value for this PendingShipmentDetail.
     * 
     * @return emailLabelDetail   * Only used with type of EMAIL.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.EMailLabelDetail getEmailLabelDetail() {
        return emailLabelDetail;
    }


    /**
     * Sets the emailLabelDetail value for this PendingShipmentDetail.
     * 
     * @param emailLabelDetail   * Only used with type of EMAIL.
     */
    public void setEmailLabelDetail(com.cts.ptms.model.fedex.ws.ship.v17.EMailLabelDetail emailLabelDetail) {
        this.emailLabelDetail = emailLabelDetail;
    }


    /**
     * Gets the processingOptions value for this PendingShipmentDetail.
     * 
     * @return processingOptions
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentProcessingOptionType[] getProcessingOptions() {
        return processingOptions;
    }


    /**
     * Sets the processingOptions value for this PendingShipmentDetail.
     * 
     * @param processingOptions
     */
    public void setProcessingOptions(com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentProcessingOptionType[] processingOptions) {
        this.processingOptions = processingOptions;
    }


    /**
     * Gets the recommendedDocumentSpecification value for this PendingShipmentDetail.
     * 
     * @return recommendedDocumentSpecification   * These are documents that are recommended to be included with
     * the shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.RecommendedDocumentType[] getRecommendedDocumentSpecification() {
        return recommendedDocumentSpecification;
    }


    /**
     * Sets the recommendedDocumentSpecification value for this PendingShipmentDetail.
     * 
     * @param recommendedDocumentSpecification   * These are documents that are recommended to be included with
     * the shipment.
     */
    public void setRecommendedDocumentSpecification(com.cts.ptms.model.fedex.ws.ship.v17.RecommendedDocumentType[] recommendedDocumentSpecification) {
        this.recommendedDocumentSpecification = recommendedDocumentSpecification;
    }


    /**
     * Gets the documentReferences value for this PendingShipmentDetail.
     * 
     * @return documentReferences   * Upload document details provided by the initator of the shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.UploadDocumentReferenceDetail[] getDocumentReferences() {
        return documentReferences;
    }


    /**
     * Sets the documentReferences value for this PendingShipmentDetail.
     * 
     * @param documentReferences   * Upload document details provided by the initator of the shipment.
     */
    public void setDocumentReferences(com.cts.ptms.model.fedex.ws.ship.v17.UploadDocumentReferenceDetail[] documentReferences) {
        this.documentReferences = documentReferences;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.UploadDocumentReferenceDetail getDocumentReferences(int i) {
        return this.documentReferences[i];
    }

    public void setDocumentReferences(int i, com.cts.ptms.model.fedex.ws.ship.v17.UploadDocumentReferenceDetail _value) {
        this.documentReferences[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PendingShipmentDetail)) return false;
        PendingShipmentDetail other = (PendingShipmentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.emailLabelDetail==null && other.getEmailLabelDetail()==null) || 
             (this.emailLabelDetail!=null &&
              this.emailLabelDetail.equals(other.getEmailLabelDetail()))) &&
            ((this.processingOptions==null && other.getProcessingOptions()==null) || 
             (this.processingOptions!=null &&
              java.util.Arrays.equals(this.processingOptions, other.getProcessingOptions()))) &&
            ((this.recommendedDocumentSpecification==null && other.getRecommendedDocumentSpecification()==null) || 
             (this.recommendedDocumentSpecification!=null &&
              java.util.Arrays.equals(this.recommendedDocumentSpecification, other.getRecommendedDocumentSpecification()))) &&
            ((this.documentReferences==null && other.getDocumentReferences()==null) || 
             (this.documentReferences!=null &&
              java.util.Arrays.equals(this.documentReferences, other.getDocumentReferences())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getEmailLabelDetail() != null) {
            _hashCode += getEmailLabelDetail().hashCode();
        }
        if (getProcessingOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessingOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProcessingOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecommendedDocumentSpecification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecommendedDocumentSpecification());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecommendedDocumentSpecification(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocumentReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentReferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentReferences(), i);
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
        new org.apache.axis.description.TypeDesc(PendingShipmentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PendingShipmentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PendingShipmentType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailLabelDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EmailLabelDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EMailLabelDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ProcessingOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PendingShipmentProcessingOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Options"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendedDocumentSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RecommendedDocumentSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RecommendedDocumentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Types"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DocumentReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "UploadDocumentReferenceDetail"));
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