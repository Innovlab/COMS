//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.26 at 03:39:27 PM CST 
//


package com.cts.ptms.model.gls;

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
 *         &lt;element ref="{}SessionID"/>
 *         &lt;element ref="{}CreateShipUnitsParams"/>
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
    "sessionID",
    "createShipUnitsParams"
})
@XmlRootElement(name = "CreateShipUnits", namespace = "")
public class CreateShipUnits {

    @XmlElement(name = "SessionID", namespace = "", required = true)
    protected BigInteger sessionID;
    @XmlElement(name = "CreateShipUnitsParams", namespace = "", required = true)
    protected CreateShipUnitsParams createShipUnitsParams;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSessionID(BigInteger value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the createShipUnitsParams property.
     * 
     * @return
     *     possible object is
     *     {@link CreateShipUnitsParams }
     *     
     */
    public CreateShipUnitsParams getCreateShipUnitsParams() {
        return createShipUnitsParams;
    }

    /**
     * Sets the value of the createShipUnitsParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateShipUnitsParams }
     *     
     */
    public void setCreateShipUnitsParams(CreateShipUnitsParams value) {
        this.createShipUnitsParams = value;
    }

}
