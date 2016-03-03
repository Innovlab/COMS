/**
 * EMailNotificationRecipient.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cts.ptms.model.fedex.ws.ship.v17;


/**
 * The descriptive data for a FedEx email notification recipient.
 */
public class EMailNotificationRecipient  implements java.io.Serializable {
    /* Identifies the relationship this email recipient has to the
     * shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationRecipientType EMailNotificationRecipientType;

    /* The email address to send the notification to */
    private java.lang.String EMailAddress;

    /* The types of email notifications being requested for this recipient. */
    private com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationEventType[] notificationEventsRequested;

    /* The format of the email notification. */
    private com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationFormatType format;

    /* The language/locale to be used in this email notification. */
    private com.cts.ptms.model.fedex.ws.ship.v17.Localization localization;

    public EMailNotificationRecipient() {
    }

    public EMailNotificationRecipient(
           com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationRecipientType EMailNotificationRecipientType,
           java.lang.String EMailAddress,
           com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationEventType[] notificationEventsRequested,
           com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationFormatType format,
           com.cts.ptms.model.fedex.ws.ship.v17.Localization localization) {
           this.EMailNotificationRecipientType = EMailNotificationRecipientType;
           this.EMailAddress = EMailAddress;
           this.notificationEventsRequested = notificationEventsRequested;
           this.format = format;
           this.localization = localization;
    }


    /**
     * Gets the EMailNotificationRecipientType value for this EMailNotificationRecipient.
     * 
     * @return EMailNotificationRecipientType   * Identifies the relationship this email recipient has to the
     * shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationRecipientType getEMailNotificationRecipientType() {
        return EMailNotificationRecipientType;
    }


    /**
     * Sets the EMailNotificationRecipientType value for this EMailNotificationRecipient.
     * 
     * @param EMailNotificationRecipientType   * Identifies the relationship this email recipient has to the
     * shipment.
     */
    public void setEMailNotificationRecipientType(com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationRecipientType EMailNotificationRecipientType) {
        this.EMailNotificationRecipientType = EMailNotificationRecipientType;
    }


    /**
     * Gets the EMailAddress value for this EMailNotificationRecipient.
     * 
     * @return EMailAddress   * The email address to send the notification to
     */
    public java.lang.String getEMailAddress() {
        return EMailAddress;
    }


    /**
     * Sets the EMailAddress value for this EMailNotificationRecipient.
     * 
     * @param EMailAddress   * The email address to send the notification to
     */
    public void setEMailAddress(java.lang.String EMailAddress) {
        this.EMailAddress = EMailAddress;
    }


    /**
     * Gets the notificationEventsRequested value for this EMailNotificationRecipient.
     * 
     * @return notificationEventsRequested   * The types of email notifications being requested for this recipient.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationEventType[] getNotificationEventsRequested() {
        return notificationEventsRequested;
    }


    /**
     * Sets the notificationEventsRequested value for this EMailNotificationRecipient.
     * 
     * @param notificationEventsRequested   * The types of email notifications being requested for this recipient.
     */
    public void setNotificationEventsRequested(com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationEventType[] notificationEventsRequested) {
        this.notificationEventsRequested = notificationEventsRequested;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationEventType getNotificationEventsRequested(int i) {
        return this.notificationEventsRequested[i];
    }

    public void setNotificationEventsRequested(int i, com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationEventType _value) {
        this.notificationEventsRequested[i] = _value;
    }


    /**
     * Gets the format value for this EMailNotificationRecipient.
     * 
     * @return format   * The format of the email notification.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationFormatType getFormat() {
        return format;
    }


    /**
     * Sets the format value for this EMailNotificationRecipient.
     * 
     * @param format   * The format of the email notification.
     */
    public void setFormat(com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationFormatType format) {
        this.format = format;
    }


    /**
     * Gets the localization value for this EMailNotificationRecipient.
     * 
     * @return localization   * The language/locale to be used in this email notification.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Localization getLocalization() {
        return localization;
    }


    /**
     * Sets the localization value for this EMailNotificationRecipient.
     * 
     * @param localization   * The language/locale to be used in this email notification.
     */
    public void setLocalization(com.cts.ptms.model.fedex.ws.ship.v17.Localization localization) {
        this.localization = localization;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EMailNotificationRecipient)) return false;
        EMailNotificationRecipient other = (EMailNotificationRecipient) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EMailNotificationRecipientType==null && other.getEMailNotificationRecipientType()==null) || 
             (this.EMailNotificationRecipientType!=null &&
              this.EMailNotificationRecipientType.equals(other.getEMailNotificationRecipientType()))) &&
            ((this.EMailAddress==null && other.getEMailAddress()==null) || 
             (this.EMailAddress!=null &&
              this.EMailAddress.equals(other.getEMailAddress()))) &&
            ((this.notificationEventsRequested==null && other.getNotificationEventsRequested()==null) || 
             (this.notificationEventsRequested!=null &&
              java.util.Arrays.equals(this.notificationEventsRequested, other.getNotificationEventsRequested()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.localization==null && other.getLocalization()==null) || 
             (this.localization!=null &&
              this.localization.equals(other.getLocalization())));
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
        if (getEMailNotificationRecipientType() != null) {
            _hashCode += getEMailNotificationRecipientType().hashCode();
        }
        if (getEMailAddress() != null) {
            _hashCode += getEMailAddress().hashCode();
        }
        if (getNotificationEventsRequested() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotificationEventsRequested());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotificationEventsRequested(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getLocalization() != null) {
            _hashCode += getLocalization().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EMailNotificationRecipient.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EMailNotificationRecipient"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailNotificationRecipientType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EMailNotificationRecipientType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EMailNotificationRecipientType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EMailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationEventsRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "NotificationEventsRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EMailNotificationEventType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EMailNotificationFormatType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Localization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Localization"));
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
