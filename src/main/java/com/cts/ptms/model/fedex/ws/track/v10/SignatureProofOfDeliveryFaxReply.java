/**
 * SignatureProofOfDeliveryFaxReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cts.ptms.model.fedex.ws.track.v10;


/**
 * FedEx Signature Proof Of Delivery Fax reply.
 */
public class SignatureProofOfDeliveryFaxReply  implements java.io.Serializable {
    /* This contains the severity type of the most severe Notification
     * in the Notifications array. */
    private com.cts.ptms.model.fedex.ws.track.v10.NotificationSeverityType highestSeverity;

    /* Information about the request/reply such was the transaction
     * successful or not, and any additional information relevant to the
     * request and/or reply. There may be multiple Notifications in a reply. */
    private com.cts.ptms.model.fedex.ws.track.v10.Notification[] notifications;

    /* Contains the CustomerTransactionDetail that is echoed back
     * to the caller for matching requests and replies and a Localization
     * element for defining the language/translation used in the reply data. */
    private com.cts.ptms.model.fedex.ws.track.v10.TransactionDetail transactionDetail;

    /* Contains the version of the reply being used. */
    private com.cts.ptms.model.fedex.ws.track.v10.VersionId version;

    /* Confirmation of fax transmission. */
    private java.lang.String faxConfirmationNumber;

    public SignatureProofOfDeliveryFaxReply() {
    }

    public SignatureProofOfDeliveryFaxReply(
           com.cts.ptms.model.fedex.ws.track.v10.NotificationSeverityType highestSeverity,
           com.cts.ptms.model.fedex.ws.track.v10.Notification[] notifications,
           com.cts.ptms.model.fedex.ws.track.v10.TransactionDetail transactionDetail,
           com.cts.ptms.model.fedex.ws.track.v10.VersionId version,
           java.lang.String faxConfirmationNumber) {
           this.highestSeverity = highestSeverity;
           this.notifications = notifications;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.faxConfirmationNumber = faxConfirmationNumber;
    }


    /**
     * Gets the highestSeverity value for this SignatureProofOfDeliveryFaxReply.
     * 
     * @return highestSeverity   * This contains the severity type of the most severe Notification
     * in the Notifications array.
     */
    public com.cts.ptms.model.fedex.ws.track.v10.NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }


    /**
     * Sets the highestSeverity value for this SignatureProofOfDeliveryFaxReply.
     * 
     * @param highestSeverity   * This contains the severity type of the most severe Notification
     * in the Notifications array.
     */
    public void setHighestSeverity(com.cts.ptms.model.fedex.ws.track.v10.NotificationSeverityType highestSeverity) {
        this.highestSeverity = highestSeverity;
    }


    /**
     * Gets the notifications value for this SignatureProofOfDeliveryFaxReply.
     * 
     * @return notifications   * Information about the request/reply such was the transaction
     * successful or not, and any additional information relevant to the
     * request and/or reply. There may be multiple Notifications in a reply.
     */
    public com.cts.ptms.model.fedex.ws.track.v10.Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this SignatureProofOfDeliveryFaxReply.
     * 
     * @param notifications   * Information about the request/reply such was the transaction
     * successful or not, and any additional information relevant to the
     * request and/or reply. There may be multiple Notifications in a reply.
     */
    public void setNotifications(com.cts.ptms.model.fedex.ws.track.v10.Notification[] notifications) {
        this.notifications = notifications;
    }

    public com.cts.ptms.model.fedex.ws.track.v10.Notification getNotifications(int i) {
        return this.notifications[i];
    }

    public void setNotifications(int i, com.cts.ptms.model.fedex.ws.track.v10.Notification _value) {
        this.notifications[i] = _value;
    }


    /**
     * Gets the transactionDetail value for this SignatureProofOfDeliveryFaxReply.
     * 
     * @return transactionDetail   * Contains the CustomerTransactionDetail that is echoed back
     * to the caller for matching requests and replies and a Localization
     * element for defining the language/translation used in the reply data.
     */
    public com.cts.ptms.model.fedex.ws.track.v10.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this SignatureProofOfDeliveryFaxReply.
     * 
     * @param transactionDetail   * Contains the CustomerTransactionDetail that is echoed back
     * to the caller for matching requests and replies and a Localization
     * element for defining the language/translation used in the reply data.
     */
    public void setTransactionDetail(com.cts.ptms.model.fedex.ws.track.v10.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this SignatureProofOfDeliveryFaxReply.
     * 
     * @return version   * Contains the version of the reply being used.
     */
    public com.cts.ptms.model.fedex.ws.track.v10.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SignatureProofOfDeliveryFaxReply.
     * 
     * @param version   * Contains the version of the reply being used.
     */
    public void setVersion(com.cts.ptms.model.fedex.ws.track.v10.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the faxConfirmationNumber value for this SignatureProofOfDeliveryFaxReply.
     * 
     * @return faxConfirmationNumber   * Confirmation of fax transmission.
     */
    public java.lang.String getFaxConfirmationNumber() {
        return faxConfirmationNumber;
    }


    /**
     * Sets the faxConfirmationNumber value for this SignatureProofOfDeliveryFaxReply.
     * 
     * @param faxConfirmationNumber   * Confirmation of fax transmission.
     */
    public void setFaxConfirmationNumber(java.lang.String faxConfirmationNumber) {
        this.faxConfirmationNumber = faxConfirmationNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignatureProofOfDeliveryFaxReply)) return false;
        SignatureProofOfDeliveryFaxReply other = (SignatureProofOfDeliveryFaxReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.highestSeverity==null && other.getHighestSeverity()==null) || 
             (this.highestSeverity!=null &&
              this.highestSeverity.equals(other.getHighestSeverity()))) &&
            ((this.notifications==null && other.getNotifications()==null) || 
             (this.notifications!=null &&
              java.util.Arrays.equals(this.notifications, other.getNotifications()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.faxConfirmationNumber==null && other.getFaxConfirmationNumber()==null) || 
             (this.faxConfirmationNumber!=null &&
              this.faxConfirmationNumber.equals(other.getFaxConfirmationNumber())));
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
        if (getHighestSeverity() != null) {
            _hashCode += getHighestSeverity().hashCode();
        }
        if (getNotifications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotifications());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotifications(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getFaxConfirmationNumber() != null) {
            _hashCode += getFaxConfirmationNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignatureProofOfDeliveryFaxReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureProofOfDeliveryFaxReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "HighestSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "NotificationSeverityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Notifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Notification"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "VersionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxConfirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "FaxConfirmationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
