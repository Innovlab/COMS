//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.27 at 04:45:15 PM CST 
//


package com.cts.ptms.model.confirm.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentServiceOptionsCODType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentServiceOptionsCODType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODFundsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODAmount" type="{}ShipmentServiceOptionsCODAmountType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentServiceOptionsCODType", propOrder = {
    "codCode",
    "codFundsCode",
    "codAmount"
})
public class ShipmentServiceOptionsCODType {

    @XmlElement(name = "CODCode", required = true)
    protected String codCode;
    @XmlElement(name = "CODFundsCode")
    protected String codFundsCode;
    @XmlElement(name = "CODAmount", required = true)
    protected ShipmentServiceOptionsCODAmountType codAmount;

    /**
     * Gets the value of the codCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCode() {
        return codCode;
    }

    /**
     * Sets the value of the codCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCode(String value) {
        this.codCode = value;
    }

    /**
     * Gets the value of the codFundsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODFundsCode() {
        return codFundsCode;
    }

    /**
     * Sets the value of the codFundsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODFundsCode(String value) {
        this.codFundsCode = value;
    }

    /**
     * Gets the value of the codAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentServiceOptionsCODAmountType }
     *     
     */
    public ShipmentServiceOptionsCODAmountType getCODAmount() {
        return codAmount;
    }

    /**
     * Sets the value of the codAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentServiceOptionsCODAmountType }
     *     
     */
    public void setCODAmount(ShipmentServiceOptionsCODAmountType value) {
        this.codAmount = value;
    }

}