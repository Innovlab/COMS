//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.26 at 03:39:27 PM CST 
//


package com.cts.ptms.model.gls;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd}CustomerOrderNumber"/>
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd}SalesTax"/>
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd}ShippingAndHandling"/>
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd}ShipmentTotal"/>
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd}SubTotal"/>
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd}TCNumber"/>
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd}WaveNumber"/>
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd}ITEM"/>
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
    "customerOrderNumber",
    "salesTax",
    "shippingAndHandling",
    "shipmentTotal",
    "subTotal",
    "tcNumber",
    "waveNumber",
    "item"
})
@XmlRootElement(name = "INVOICE", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd")
public class INVOICE {

    @XmlElement(name = "CustomerOrderNumber", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd", required = true)
    protected BigInteger customerOrderNumber;
    @XmlElement(name = "SalesTax", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd", required = true)
    protected BigDecimal salesTax;
    @XmlElement(name = "ShippingAndHandling", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd", required = true)
    protected BigDecimal shippingAndHandling;
    @XmlElement(name = "ShipmentTotal", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd", required = true)
    protected BigDecimal shipmentTotal;
    @XmlElement(name = "SubTotal", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd", required = true)
    protected BigDecimal subTotal;
    @XmlElement(name = "TCNumber", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd", required = true)
    protected BigInteger tcNumber;
    @XmlElement(name = "WaveNumber", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd", required = true)
    protected BigInteger waveNumber;
    @XmlElement(name = "ITEM", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd", required = true)
    protected ITEM item;

    /**
     * Gets the value of the customerOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerOrderNumber() {
        return customerOrderNumber;
    }

    /**
     * Sets the value of the customerOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerOrderNumber(BigInteger value) {
        this.customerOrderNumber = value;
    }

    /**
     * Gets the value of the salesTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesTax() {
        return salesTax;
    }

    /**
     * Sets the value of the salesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesTax(BigDecimal value) {
        this.salesTax = value;
    }

    /**
     * Gets the value of the shippingAndHandling property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShippingAndHandling() {
        return shippingAndHandling;
    }

    /**
     * Sets the value of the shippingAndHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShippingAndHandling(BigDecimal value) {
        this.shippingAndHandling = value;
    }

    /**
     * Gets the value of the shipmentTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShipmentTotal() {
        return shipmentTotal;
    }

    /**
     * Sets the value of the shipmentTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShipmentTotal(BigDecimal value) {
        this.shipmentTotal = value;
    }

    /**
     * Gets the value of the subTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubTotal(BigDecimal value) {
        this.subTotal = value;
    }

    /**
     * Gets the value of the tcNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTCNumber() {
        return tcNumber;
    }

    /**
     * Sets the value of the tcNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTCNumber(BigInteger value) {
        this.tcNumber = value;
    }

    /**
     * Gets the value of the waveNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWaveNumber() {
        return waveNumber;
    }

    /**
     * Sets the value of the waveNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWaveNumber(BigInteger value) {
        this.waveNumber = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ITEM }
     *     
     */
    public ITEM getITEM() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ITEM }
     *     
     */
    public void setITEM(ITEM value) {
        this.item = value;
    }

}