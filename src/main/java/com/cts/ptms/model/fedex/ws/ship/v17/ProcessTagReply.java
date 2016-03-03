/**
 * ProcessTagReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cts.ptms.model.fedex.ws.ship.v17;

public class ProcessTagReply  implements java.io.Serializable {
    private com.cts.ptms.model.fedex.ws.ship.v17.NotificationSeverityType highestSeverity;

    private com.cts.ptms.model.fedex.ws.ship.v17.Notification[] notifications;

    private com.cts.ptms.model.fedex.ws.ship.v17.TransactionDetail transactionDetail;

    private com.cts.ptms.model.fedex.ws.ship.v17.VersionId version;

    private com.cts.ptms.model.fedex.ws.ship.v17.CompletedShipmentDetail completedShipmentDetail;

    public ProcessTagReply() {
    }

    public ProcessTagReply(
           com.cts.ptms.model.fedex.ws.ship.v17.NotificationSeverityType highestSeverity,
           com.cts.ptms.model.fedex.ws.ship.v17.Notification[] notifications,
           com.cts.ptms.model.fedex.ws.ship.v17.TransactionDetail transactionDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.VersionId version,
           com.cts.ptms.model.fedex.ws.ship.v17.CompletedShipmentDetail completedShipmentDetail) {
           this.highestSeverity = highestSeverity;
           this.notifications = notifications;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.completedShipmentDetail = completedShipmentDetail;
    }


    /**
     * Gets the highestSeverity value for this ProcessTagReply.
     * 
     * @return highestSeverity
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }


    /**
     * Sets the highestSeverity value for this ProcessTagReply.
     * 
     * @param highestSeverity
     */
    public void setHighestSeverity(com.cts.ptms.model.fedex.ws.ship.v17.NotificationSeverityType highestSeverity) {
        this.highestSeverity = highestSeverity;
    }


    /**
     * Gets the notifications value for this ProcessTagReply.
     * 
     * @return notifications
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this ProcessTagReply.
     * 
     * @param notifications
     */
    public void setNotifications(com.cts.ptms.model.fedex.ws.ship.v17.Notification[] notifications) {
        this.notifications = notifications;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.Notification getNotifications(int i) {
        return this.notifications[i];
    }

    public void setNotifications(int i, com.cts.ptms.model.fedex.ws.ship.v17.Notification _value) {
        this.notifications[i] = _value;
    }


    /**
     * Gets the transactionDetail value for this ProcessTagReply.
     * 
     * @return transactionDetail
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this ProcessTagReply.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(com.cts.ptms.model.fedex.ws.ship.v17.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this ProcessTagReply.
     * 
     * @return version
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ProcessTagReply.
     * 
     * @param version
     */
    public void setVersion(com.cts.ptms.model.fedex.ws.ship.v17.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the completedShipmentDetail value for this ProcessTagReply.
     * 
     * @return completedShipmentDetail
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.CompletedShipmentDetail getCompletedShipmentDetail() {
        return completedShipmentDetail;
    }


    /**
     * Sets the completedShipmentDetail value for this ProcessTagReply.
     * 
     * @param completedShipmentDetail
     */
    public void setCompletedShipmentDetail(com.cts.ptms.model.fedex.ws.ship.v17.CompletedShipmentDetail completedShipmentDetail) {
        this.completedShipmentDetail = completedShipmentDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessTagReply)) return false;
        ProcessTagReply other = (ProcessTagReply) obj;
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
            ((this.completedShipmentDetail==null && other.getCompletedShipmentDetail()==null) || 
             (this.completedShipmentDetail!=null &&
              this.completedShipmentDetail.equals(other.getCompletedShipmentDetail())));
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
        if (getCompletedShipmentDetail() != null) {
            _hashCode += getCompletedShipmentDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessTagReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ProcessTagReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HighestSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "NotificationSeverityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Notifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Notification"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "VersionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedShipmentDetail"));
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
