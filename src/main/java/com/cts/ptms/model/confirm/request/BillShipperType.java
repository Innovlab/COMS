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
 * <p>Java class for BillShipperType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillShipperType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCard" type="{}CreditCardType" minOccurs="0"/>
 *         &lt;element name="AlternatePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillShipperType", propOrder = {
    "accountNumber",
    "creditCard",
    "alternatePaymentMethod"
})
public class BillShipperType {

    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "CreditCard")
    protected CreditCardType creditCard;
    @XmlElement(name = "AlternatePaymentMethod")
    protected String alternatePaymentMethod;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardType }
     *     
     */
    public CreditCardType getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardType }
     *     
     */
    public void setCreditCard(CreditCardType value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the alternatePaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternatePaymentMethod() {
        return alternatePaymentMethod;
    }

    /**
     * Sets the value of the alternatePaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternatePaymentMethod(String value) {
        this.alternatePaymentMethod = value;
    }

}
