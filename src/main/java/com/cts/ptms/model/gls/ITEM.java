//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.26 at 03:39:27 PM CST 
//


package com.cts.ptms.model.gls;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd}LineNumber"/>
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd}Quantity"/>
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd}ItemNumber"/>
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd}Description"/>
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd}SecondaryDescription" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd}UnitPrice"/>
 *         &lt;element ref="{http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd}TotalPrice"/>
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
    "lineNumber",
    "quantity",
    "itemNumber",
    "description",
    "secondaryDescription",
    "unitPrice",
    "totalPrice"
})
@XmlRootElement(name = "ITEM", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd")
public class ITEM {

    @XmlElement(name = "LineNumber", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd", required = true)
    protected BigInteger lineNumber;
    @XmlElement(name = "Quantity", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd", required = true)
    protected BigInteger quantity;
    @XmlElement(name = "ItemNumber", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd", required = true)
    protected BigInteger itemNumber;
    @XmlElement(name = "Description", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd", required = true)
    protected String description;
    @XmlElement(name = "SecondaryDescription", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected List<String> secondaryDescription;
    @XmlElement(name = "UnitPrice", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd", required = true)
    protected BigDecimal unitPrice;
    @XmlElement(name = "TotalPrice", namespace = "http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd", required = true)
    protected BigDecimal totalPrice;

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNumber(BigInteger value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemNumber(BigInteger value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the secondaryDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSecondaryDescription() {
        if (secondaryDescription == null) {
            secondaryDescription = new ArrayList<String>();
        }
        return this.secondaryDescription;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrice(BigDecimal value) {
        this.totalPrice = value;
    }

}
