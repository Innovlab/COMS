//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.26 at 03:39:27 PM CST 
//


package com.cts.ptms.model.gls;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd}SHIP_UNIT_CUSTOM"/>
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd}INVOICE"/>
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/WTM_XMLSchema_11.00.0000.xsd}ShippingOptions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shipunitcustom",
    "invoice",
    "shippingOptions"
})
@XmlRootElement(name = "DataXML")
public class DataXML {

    @XmlElement(name = "SHIP_UNIT_CUSTOM", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd", required = true)
    protected SHIPUNITCUSTOM shipunitcustom;
    @XmlElement(name = "INVOICE", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd", required = true)
    protected INVOICE invoice;
    @XmlElement(name = "ShippingOptions", required = true)
    protected ShippingOptions shippingOptions;

    /**
     * Gets the value of the shipunitcustom property.
     * 
     * @return
     *     possible object is
     *     {@link SHIPUNITCUSTOM }
     *     
     */
    public SHIPUNITCUSTOM getSHIPUNITCUSTOM() {
        return shipunitcustom;
    }

    /**
     * Sets the value of the shipunitcustom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHIPUNITCUSTOM }
     *     
     */
    public void setSHIPUNITCUSTOM(SHIPUNITCUSTOM value) {
        this.shipunitcustom = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link INVOICE }
     *     
     */
    public INVOICE getINVOICE() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link INVOICE }
     *     
     */
    public void setINVOICE(INVOICE value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the shippingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingOptions }
     *     
     */
    public ShippingOptions getShippingOptions() {
        return shippingOptions;
    }

    /**
     * Sets the value of the shippingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingOptions }
     *     
     */
    public void setShippingOptions(ShippingOptions value) {
        this.shippingOptions = value;
    }

}