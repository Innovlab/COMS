//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.11 at 12:13:44 PM CST 
//


package com.cts.ptms.model.ups.generated.trackresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressArtifactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressArtifactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StreetNumberLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PoliticalDivision2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PoliticalDivision1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostcodePrimaryLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressArtifactType", propOrder = {
    "streetNumberLow",
    "streetPrefix",
    "streetName",
    "streetSuffix",
    "streetType",
    "politicalDivision2",
    "politicalDivision1",
    "postcodePrimaryLow",
    "countryCode"
})
public class AddressArtifactType {

    @XmlElement(name = "StreetNumberLow")
    protected String streetNumberLow;
    @XmlElement(name = "StreetPrefix")
    protected String streetPrefix;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "StreetSuffix")
    protected String streetSuffix;
    @XmlElement(name = "StreetType")
    protected String streetType;
    @XmlElement(name = "PoliticalDivision2")
    protected String politicalDivision2;
    @XmlElement(name = "PoliticalDivision1")
    protected String politicalDivision1;
    @XmlElement(name = "PostcodePrimaryLow")
    protected String postcodePrimaryLow;
    @XmlElement(name = "CountryCode")
    protected String countryCode;

    /**
     * Gets the value of the streetNumberLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumberLow() {
        return streetNumberLow;
    }

    /**
     * Sets the value of the streetNumberLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumberLow(String value) {
        this.streetNumberLow = value;
    }

    /**
     * Gets the value of the streetPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetPrefix() {
        return streetPrefix;
    }

    /**
     * Sets the value of the streetPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetPrefix(String value) {
        this.streetPrefix = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * Sets the value of the streetSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetSuffix(String value) {
        this.streetSuffix = value;
    }

    /**
     * Gets the value of the streetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetType() {
        return streetType;
    }

    /**
     * Sets the value of the streetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetType(String value) {
        this.streetType = value;
    }

    /**
     * Gets the value of the politicalDivision2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliticalDivision2() {
        return politicalDivision2;
    }

    /**
     * Sets the value of the politicalDivision2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliticalDivision2(String value) {
        this.politicalDivision2 = value;
    }

    /**
     * Gets the value of the politicalDivision1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliticalDivision1() {
        return politicalDivision1;
    }

    /**
     * Sets the value of the politicalDivision1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliticalDivision1(String value) {
        this.politicalDivision1 = value;
    }

    /**
     * Gets the value of the postcodePrimaryLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcodePrimaryLow() {
        return postcodePrimaryLow;
    }

    /**
     * Sets the value of the postcodePrimaryLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcodePrimaryLow(String value) {
        this.postcodePrimaryLow = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

}
