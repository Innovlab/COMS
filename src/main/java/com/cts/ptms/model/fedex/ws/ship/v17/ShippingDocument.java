/**
 * ShippingDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cts.ptms.model.fedex.ws.ship.v17;


/**
 * All package-level shipping documents (other than labels and barcodes).
 */
public class ShippingDocument  implements java.io.Serializable {
    /* Shipping Document Type */
    private com.cts.ptms.model.fedex.ws.ship.v17.ReturnedShippingDocumentType type;

    /* The localizations are populated if multiple language versions
     * of a shipping document are returned. */
    private com.cts.ptms.model.fedex.ws.ship.v17.Localization[] localizations;

    /* Specifies how this document image/file is organized. */
    private com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentGroupingType grouping;

    private com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentDispositionType shippingDocumentDisposition;

    /* The name under which a STORED, DEFERRED or EMAILED document
     * is written. */
    private java.lang.String accessReference;

    /* Specifies the image type of this shipping document. */
    private com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentImageType imageType;

    /* Specifies the image resolution in DPI (dots per inch). */
    private org.apache.axis.types.NonNegativeInteger resolution;

    /* Can be zero for documents whose disposition implies that no
     * content is included. */
    private org.apache.axis.types.NonNegativeInteger copiesToPrint;

    /* One or more document parts which make up a single logical document,
     * such as multiple pages of a single form. */
    private com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentPart[] parts;

    public ShippingDocument() {
    }

    public ShippingDocument(
           com.cts.ptms.model.fedex.ws.ship.v17.ReturnedShippingDocumentType type,
           com.cts.ptms.model.fedex.ws.ship.v17.Localization[] localizations,
           com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentGroupingType grouping,
           com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentDispositionType shippingDocumentDisposition,
           java.lang.String accessReference,
           com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentImageType imageType,
           org.apache.axis.types.NonNegativeInteger resolution,
           org.apache.axis.types.NonNegativeInteger copiesToPrint,
           com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentPart[] parts) {
           this.type = type;
           this.localizations = localizations;
           this.grouping = grouping;
           this.shippingDocumentDisposition = shippingDocumentDisposition;
           this.accessReference = accessReference;
           this.imageType = imageType;
           this.resolution = resolution;
           this.copiesToPrint = copiesToPrint;
           this.parts = parts;
    }


    /**
     * Gets the type value for this ShippingDocument.
     * 
     * @return type   * Shipping Document Type
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ReturnedShippingDocumentType getType() {
        return type;
    }


    /**
     * Sets the type value for this ShippingDocument.
     * 
     * @param type   * Shipping Document Type
     */
    public void setType(com.cts.ptms.model.fedex.ws.ship.v17.ReturnedShippingDocumentType type) {
        this.type = type;
    }


    /**
     * Gets the localizations value for this ShippingDocument.
     * 
     * @return localizations   * The localizations are populated if multiple language versions
     * of a shipping document are returned.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Localization[] getLocalizations() {
        return localizations;
    }


    /**
     * Sets the localizations value for this ShippingDocument.
     * 
     * @param localizations   * The localizations are populated if multiple language versions
     * of a shipping document are returned.
     */
    public void setLocalizations(com.cts.ptms.model.fedex.ws.ship.v17.Localization[] localizations) {
        this.localizations = localizations;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.Localization getLocalizations(int i) {
        return this.localizations[i];
    }

    public void setLocalizations(int i, com.cts.ptms.model.fedex.ws.ship.v17.Localization _value) {
        this.localizations[i] = _value;
    }


    /**
     * Gets the grouping value for this ShippingDocument.
     * 
     * @return grouping   * Specifies how this document image/file is organized.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentGroupingType getGrouping() {
        return grouping;
    }


    /**
     * Sets the grouping value for this ShippingDocument.
     * 
     * @param grouping   * Specifies how this document image/file is organized.
     */
    public void setGrouping(com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentGroupingType grouping) {
        this.grouping = grouping;
    }


    /**
     * Gets the shippingDocumentDisposition value for this ShippingDocument.
     * 
     * @return shippingDocumentDisposition
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentDispositionType getShippingDocumentDisposition() {
        return shippingDocumentDisposition;
    }


    /**
     * Sets the shippingDocumentDisposition value for this ShippingDocument.
     * 
     * @param shippingDocumentDisposition
     */
    public void setShippingDocumentDisposition(com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentDispositionType shippingDocumentDisposition) {
        this.shippingDocumentDisposition = shippingDocumentDisposition;
    }


    /**
     * Gets the accessReference value for this ShippingDocument.
     * 
     * @return accessReference   * The name under which a STORED, DEFERRED or EMAILED document
     * is written.
     */
    public java.lang.String getAccessReference() {
        return accessReference;
    }


    /**
     * Sets the accessReference value for this ShippingDocument.
     * 
     * @param accessReference   * The name under which a STORED, DEFERRED or EMAILED document
     * is written.
     */
    public void setAccessReference(java.lang.String accessReference) {
        this.accessReference = accessReference;
    }


    /**
     * Gets the imageType value for this ShippingDocument.
     * 
     * @return imageType   * Specifies the image type of this shipping document.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentImageType getImageType() {
        return imageType;
    }


    /**
     * Sets the imageType value for this ShippingDocument.
     * 
     * @param imageType   * Specifies the image type of this shipping document.
     */
    public void setImageType(com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentImageType imageType) {
        this.imageType = imageType;
    }


    /**
     * Gets the resolution value for this ShippingDocument.
     * 
     * @return resolution   * Specifies the image resolution in DPI (dots per inch).
     */
    public org.apache.axis.types.NonNegativeInteger getResolution() {
        return resolution;
    }


    /**
     * Sets the resolution value for this ShippingDocument.
     * 
     * @param resolution   * Specifies the image resolution in DPI (dots per inch).
     */
    public void setResolution(org.apache.axis.types.NonNegativeInteger resolution) {
        this.resolution = resolution;
    }


    /**
     * Gets the copiesToPrint value for this ShippingDocument.
     * 
     * @return copiesToPrint   * Can be zero for documents whose disposition implies that no
     * content is included.
     */
    public org.apache.axis.types.NonNegativeInteger getCopiesToPrint() {
        return copiesToPrint;
    }


    /**
     * Sets the copiesToPrint value for this ShippingDocument.
     * 
     * @param copiesToPrint   * Can be zero for documents whose disposition implies that no
     * content is included.
     */
    public void setCopiesToPrint(org.apache.axis.types.NonNegativeInteger copiesToPrint) {
        this.copiesToPrint = copiesToPrint;
    }


    /**
     * Gets the parts value for this ShippingDocument.
     * 
     * @return parts   * One or more document parts which make up a single logical document,
     * such as multiple pages of a single form.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentPart[] getParts() {
        return parts;
    }


    /**
     * Sets the parts value for this ShippingDocument.
     * 
     * @param parts   * One or more document parts which make up a single logical document,
     * such as multiple pages of a single form.
     */
    public void setParts(com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentPart[] parts) {
        this.parts = parts;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentPart getParts(int i) {
        return this.parts[i];
    }

    public void setParts(int i, com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentPart _value) {
        this.parts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingDocument)) return false;
        ShippingDocument other = (ShippingDocument) obj;
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
            ((this.localizations==null && other.getLocalizations()==null) || 
             (this.localizations!=null &&
              java.util.Arrays.equals(this.localizations, other.getLocalizations()))) &&
            ((this.grouping==null && other.getGrouping()==null) || 
             (this.grouping!=null &&
              this.grouping.equals(other.getGrouping()))) &&
            ((this.shippingDocumentDisposition==null && other.getShippingDocumentDisposition()==null) || 
             (this.shippingDocumentDisposition!=null &&
              this.shippingDocumentDisposition.equals(other.getShippingDocumentDisposition()))) &&
            ((this.accessReference==null && other.getAccessReference()==null) || 
             (this.accessReference!=null &&
              this.accessReference.equals(other.getAccessReference()))) &&
            ((this.imageType==null && other.getImageType()==null) || 
             (this.imageType!=null &&
              this.imageType.equals(other.getImageType()))) &&
            ((this.resolution==null && other.getResolution()==null) || 
             (this.resolution!=null &&
              this.resolution.equals(other.getResolution()))) &&
            ((this.copiesToPrint==null && other.getCopiesToPrint()==null) || 
             (this.copiesToPrint!=null &&
              this.copiesToPrint.equals(other.getCopiesToPrint()))) &&
            ((this.parts==null && other.getParts()==null) || 
             (this.parts!=null &&
              java.util.Arrays.equals(this.parts, other.getParts())));
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
        if (getLocalizations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalizations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalizations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGrouping() != null) {
            _hashCode += getGrouping().hashCode();
        }
        if (getShippingDocumentDisposition() != null) {
            _hashCode += getShippingDocumentDisposition().hashCode();
        }
        if (getAccessReference() != null) {
            _hashCode += getAccessReference().hashCode();
        }
        if (getImageType() != null) {
            _hashCode += getImageType().hashCode();
        }
        if (getResolution() != null) {
            _hashCode += getResolution().hashCode();
        }
        if (getCopiesToPrint() != null) {
            _hashCode += getCopiesToPrint().hashCode();
        }
        if (getParts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParts(), i);
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
        new org.apache.axis.description.TypeDesc(ShippingDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ReturnedShippingDocumentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Localizations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Localization"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grouping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Grouping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentGroupingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDocumentDisposition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentDisposition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentDispositionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "AccessReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ImageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentImageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Resolution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copiesToPrint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CopiesToPrint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Parts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentPart"));
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
