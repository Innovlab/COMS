/**
 * ValidatedHazardousCommodityContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cts.ptms.model.fedex.ws.ship.v17;


/**
 * Documents the kind and quantity of an individual hazardous commodity
 * in a package.
 */
public class ValidatedHazardousCommodityContent  implements java.io.Serializable {
    /* Identifies and describes an individual hazardous commodity. */
    private com.cts.ptms.model.fedex.ws.ship.v17.ValidatedHazardousCommodityDescription description;

    /* Specifies the amount of the commodity in alternate units. */
    private com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityQuantityDetail quantity;

    /* The mass points are a calculation used by ADR regulations for
     * measuring the risk of a particular hazardous commodity. */
    private java.math.BigDecimal massPoints;

    /* Customer-provided specifications for handling individual commodities. */
    private com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityOptionDetail options;

    /* The total mass of the contained explosive substances, without
     * the mass of any casings, bullets, shells, etc. */
    private com.cts.ptms.model.fedex.ws.ship.v17.NetExplosiveDetail netExplosiveDetail;

    public ValidatedHazardousCommodityContent() {
    }

    public ValidatedHazardousCommodityContent(
           com.cts.ptms.model.fedex.ws.ship.v17.ValidatedHazardousCommodityDescription description,
           com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityQuantityDetail quantity,
           java.math.BigDecimal massPoints,
           com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityOptionDetail options,
           com.cts.ptms.model.fedex.ws.ship.v17.NetExplosiveDetail netExplosiveDetail) {
           this.description = description;
           this.quantity = quantity;
           this.massPoints = massPoints;
           this.options = options;
           this.netExplosiveDetail = netExplosiveDetail;
    }


    /**
     * Gets the description value for this ValidatedHazardousCommodityContent.
     * 
     * @return description   * Identifies and describes an individual hazardous commodity.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ValidatedHazardousCommodityDescription getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ValidatedHazardousCommodityContent.
     * 
     * @param description   * Identifies and describes an individual hazardous commodity.
     */
    public void setDescription(com.cts.ptms.model.fedex.ws.ship.v17.ValidatedHazardousCommodityDescription description) {
        this.description = description;
    }


    /**
     * Gets the quantity value for this ValidatedHazardousCommodityContent.
     * 
     * @return quantity   * Specifies the amount of the commodity in alternate units.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityQuantityDetail getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ValidatedHazardousCommodityContent.
     * 
     * @param quantity   * Specifies the amount of the commodity in alternate units.
     */
    public void setQuantity(com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityQuantityDetail quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the massPoints value for this ValidatedHazardousCommodityContent.
     * 
     * @return massPoints   * The mass points are a calculation used by ADR regulations for
     * measuring the risk of a particular hazardous commodity.
     */
    public java.math.BigDecimal getMassPoints() {
        return massPoints;
    }


    /**
     * Sets the massPoints value for this ValidatedHazardousCommodityContent.
     * 
     * @param massPoints   * The mass points are a calculation used by ADR regulations for
     * measuring the risk of a particular hazardous commodity.
     */
    public void setMassPoints(java.math.BigDecimal massPoints) {
        this.massPoints = massPoints;
    }


    /**
     * Gets the options value for this ValidatedHazardousCommodityContent.
     * 
     * @return options   * Customer-provided specifications for handling individual commodities.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityOptionDetail getOptions() {
        return options;
    }


    /**
     * Sets the options value for this ValidatedHazardousCommodityContent.
     * 
     * @param options   * Customer-provided specifications for handling individual commodities.
     */
    public void setOptions(com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityOptionDetail options) {
        this.options = options;
    }


    /**
     * Gets the netExplosiveDetail value for this ValidatedHazardousCommodityContent.
     * 
     * @return netExplosiveDetail   * The total mass of the contained explosive substances, without
     * the mass of any casings, bullets, shells, etc.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.NetExplosiveDetail getNetExplosiveDetail() {
        return netExplosiveDetail;
    }


    /**
     * Sets the netExplosiveDetail value for this ValidatedHazardousCommodityContent.
     * 
     * @param netExplosiveDetail   * The total mass of the contained explosive substances, without
     * the mass of any casings, bullets, shells, etc.
     */
    public void setNetExplosiveDetail(com.cts.ptms.model.fedex.ws.ship.v17.NetExplosiveDetail netExplosiveDetail) {
        this.netExplosiveDetail = netExplosiveDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidatedHazardousCommodityContent)) return false;
        ValidatedHazardousCommodityContent other = (ValidatedHazardousCommodityContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.massPoints==null && other.getMassPoints()==null) || 
             (this.massPoints!=null &&
              this.massPoints.equals(other.getMassPoints()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            ((this.netExplosiveDetail==null && other.getNetExplosiveDetail()==null) || 
             (this.netExplosiveDetail!=null &&
              this.netExplosiveDetail.equals(other.getNetExplosiveDetail())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getMassPoints() != null) {
            _hashCode += getMassPoints().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        if (getNetExplosiveDetail() != null) {
            _hashCode += getNetExplosiveDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidatedHazardousCommodityContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ValidatedHazardousCommodityContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ValidatedHazardousCommodityDescription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousCommodityQuantityDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("massPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "MassPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousCommodityOptionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netExplosiveDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "NetExplosiveDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "NetExplosiveDetail"));
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
