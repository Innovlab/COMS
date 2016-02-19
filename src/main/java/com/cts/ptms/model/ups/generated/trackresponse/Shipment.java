//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.11 at 12:13:44 PM CST 
//


package com.cts.ptms.model.ups.generated.trackresponse;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="InquiryNumber" type="{}InquiryNumberType" minOccurs="0"/>
 *         &lt;element name="ShipmentIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentType" type="{}CodeType" minOccurs="0"/>
 *         &lt;element name="CandidateBookmark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipper" type="{}ShipperType" minOccurs="0"/>
 *         &lt;element name="ShipTo" type="{}ShipToType" minOccurs="0"/>
 *         &lt;element name="ShipmentWeight" type="{}WeightType" minOccurs="0"/>
 *         &lt;element name="Service" type="{}CodeType" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber" type="{}ShipmentReferenceNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CurrentStatus" type="{}CurrentStatusType" minOccurs="0"/>
 *         &lt;element name="PickupDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryDetails" type="{}DeliveryDetailsType" minOccurs="0"/>
 *         &lt;element name="DeliveryDateTime" type="{}DeliveryDateTimeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Volume" type="{}VolumeType" minOccurs="0"/>
 *         &lt;element name="BillToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickUpServiceCenter" type="{}ServiceCenterType" minOccurs="0"/>
 *         &lt;element name="NumberOfPieces" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfPallets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentServiceOptions" type="{}ShipmentServiceOptionsType" minOccurs="0"/>
 *         &lt;element name="EstimatedDeliveryDetails" type="{}EstimatedDeliveryDetailsType" minOccurs="0"/>
 *         &lt;element name="SignedForByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Activity" type="{}ShipmentActivityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OriginPortDetails" type="{}OriginPortDetailsType" minOccurs="0"/>
 *         &lt;element name="DestinationPortDetails" type="{}DestinationPortDetailsType" minOccurs="0"/>
 *         &lt;element name="DescriptionOfGoods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CargoReady" type="{}DateTime" minOccurs="0"/>
 *         &lt;element name="Manifest" type="{}DateTime" minOccurs="0"/>
 *         &lt;element name="CarrierActivityInformation" type="{}CarrierActivityInformationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Document" type="{}DocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScheduledDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduledDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryDateUnavailable" type="{}DeliveryDateUnavailableType" minOccurs="0"/>
 *         &lt;element name="FileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Appointment" type="{}AppointmentType" minOccurs="0"/>
 *         &lt;element name="Package" type="{}PackageType" maxOccurs="unbounded" minOccurs="0"/>
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
    "inquiryNumber",
    "shipmentIdentificationNumber",
    "shipmentType",
    "candidateBookmark",
    "shipper",
    "shipTo",
    "shipmentWeight",
    "service",
    "referenceNumber",
    "currentStatus",
    "pickupDate",
    "deliveryDetails",
    "deliveryDateTime",
    "volume",
    "billToName",
    "pickUpServiceCenter",
    "numberOfPieces",
    "numberOfPallets",
    "shipmentServiceOptions",
    "estimatedDeliveryDetails",
    "signedForByName",
    "activity",
    "originPortDetails",
    "destinationPortDetails",
    "descriptionOfGoods",
    "cargoReady",
    "manifest",
    "carrierActivityInformation",
    "document",
    "scheduledDeliveryDate",
    "scheduledDeliveryTime",
    "deliveryDateUnavailable",
    "fileNumber",
    "appointment",
    "_package"
})
@XmlRootElement(name = "Shipment")
public class Shipment {

    @XmlElement(name = "InquiryNumber")
    protected InquiryNumberType inquiryNumber;
    @XmlElement(name = "ShipmentIdentificationNumber")
    protected String shipmentIdentificationNumber;
    @XmlElement(name = "ShipmentType")
    protected CodeType shipmentType;
    @XmlElement(name = "CandidateBookmark")
    protected String candidateBookmark;
    @XmlElement(name = "Shipper")
    protected ShipperType shipper;
    @XmlElement(name = "ShipTo")
    protected ShipToType shipTo;
    @XmlElement(name = "ShipmentWeight")
    protected WeightType shipmentWeight;
    @XmlElement(name = "Service")
    protected CodeType service;
    @XmlElement(name = "ReferenceNumber")
    protected List<ShipmentReferenceNumberType> referenceNumber;
    @XmlElement(name = "CurrentStatus")
    protected CurrentStatusType currentStatus;
    @XmlElement(name = "PickupDate")
    protected String pickupDate;
    @XmlElement(name = "DeliveryDetails")
    protected DeliveryDetailsType deliveryDetails;
    @XmlElement(name = "DeliveryDateTime")
    protected List<DeliveryDateTimeType> deliveryDateTime;
    @XmlElement(name = "Volume")
    protected VolumeType volume;
    @XmlElement(name = "BillToName")
    protected String billToName;
    @XmlElement(name = "PickUpServiceCenter")
    protected ServiceCenterType pickUpServiceCenter;
    @XmlElement(name = "NumberOfPieces")
    protected String numberOfPieces;
    @XmlElement(name = "NumberOfPallets")
    protected String numberOfPallets;
    @XmlElement(name = "ShipmentServiceOptions")
    protected ShipmentServiceOptionsType shipmentServiceOptions;
    @XmlElement(name = "EstimatedDeliveryDetails")
    protected EstimatedDeliveryDetailsType estimatedDeliveryDetails;
    @XmlElement(name = "SignedForByName")
    protected String signedForByName;
    @XmlElement(name = "Activity")
    protected List<ShipmentActivityType> activity;
    @XmlElement(name = "OriginPortDetails")
    protected OriginPortDetailsType originPortDetails;
    @XmlElement(name = "DestinationPortDetails")
    protected DestinationPortDetailsType destinationPortDetails;
    @XmlElement(name = "DescriptionOfGoods")
    protected String descriptionOfGoods;
    @XmlElement(name = "CargoReady")
    protected DateTime cargoReady;
    @XmlElement(name = "Manifest")
    protected DateTime manifest;
    @XmlElement(name = "CarrierActivityInformation")
    protected List<CarrierActivityInformationType> carrierActivityInformation;
    @XmlElement(name = "Document")
    protected List<DocumentType> document;
    @XmlElement(name = "ScheduledDeliveryDate")
    protected String scheduledDeliveryDate;
    @XmlElement(name = "ScheduledDeliveryTime")
    protected String scheduledDeliveryTime;
    @XmlElement(name = "DeliveryDateUnavailable")
    protected DeliveryDateUnavailableType deliveryDateUnavailable;
    @XmlElement(name = "FileNumber")
    protected String fileNumber;
    @XmlElement(name = "Appointment")
    protected AppointmentType appointment;
    @XmlElement(name = "Package")
    protected List<PackageType> _package;

    /**
     * Gets the value of the inquiryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryNumberType }
     *     
     */
    public InquiryNumberType getInquiryNumber() {
        return inquiryNumber;
    }

    /**
     * Sets the value of the inquiryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryNumberType }
     *     
     */
    public void setInquiryNumber(InquiryNumberType value) {
        this.inquiryNumber = value;
    }

    /**
     * Gets the value of the shipmentIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentIdentificationNumber() {
        return shipmentIdentificationNumber;
    }

    /**
     * Sets the value of the shipmentIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentIdentificationNumber(String value) {
        this.shipmentIdentificationNumber = value;
    }

    /**
     * Gets the value of the shipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getShipmentType() {
        return shipmentType;
    }

    /**
     * Sets the value of the shipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setShipmentType(CodeType value) {
        this.shipmentType = value;
    }

    /**
     * Gets the value of the candidateBookmark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCandidateBookmark() {
        return candidateBookmark;
    }

    /**
     * Sets the value of the candidateBookmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCandidateBookmark(String value) {
        this.candidateBookmark = value;
    }

    /**
     * Gets the value of the shipper property.
     * 
     * @return
     *     possible object is
     *     {@link ShipperType }
     *     
     */
    public ShipperType getShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipperType }
     *     
     */
    public void setShipper(ShipperType value) {
        this.shipper = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link ShipToType }
     *     
     */
    public ShipToType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipToType }
     *     
     */
    public void setShipTo(ShipToType value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the shipmentWeight property.
     * 
     * @return
     *     possible object is
     *     {@link WeightType }
     *     
     */
    public WeightType getShipmentWeight() {
        return shipmentWeight;
    }

    /**
     * Sets the value of the shipmentWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *     
     */
    public void setShipmentWeight(WeightType value) {
        this.shipmentWeight = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setService(CodeType value) {
        this.service = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentReferenceNumberType }
     * 
     * 
     */
    public List<ShipmentReferenceNumberType> getReferenceNumber() {
        if (referenceNumber == null) {
            referenceNumber = new ArrayList<ShipmentReferenceNumberType>();
        }
        return this.referenceNumber;
    }

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentStatusType }
     *     
     */
    public CurrentStatusType getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentStatusType }
     *     
     */
    public void setCurrentStatus(CurrentStatusType value) {
        this.currentStatus = value;
    }

    /**
     * Gets the value of the pickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupDate() {
        return pickupDate;
    }

    /**
     * Sets the value of the pickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupDate(String value) {
        this.pickupDate = value;
    }

    /**
     * Gets the value of the deliveryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDetailsType }
     *     
     */
    public DeliveryDetailsType getDeliveryDetails() {
        return deliveryDetails;
    }

    /**
     * Sets the value of the deliveryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDetailsType }
     *     
     */
    public void setDeliveryDetails(DeliveryDetailsType value) {
        this.deliveryDetails = value;
    }

    /**
     * Gets the value of the deliveryDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryDateTimeType }
     * 
     * 
     */
    public List<DeliveryDateTimeType> getDeliveryDateTime() {
        if (deliveryDateTime == null) {
            deliveryDateTime = new ArrayList<DeliveryDateTimeType>();
        }
        return this.deliveryDateTime;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setVolume(VolumeType value) {
        this.volume = value;
    }

    /**
     * Gets the value of the billToName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToName() {
        return billToName;
    }

    /**
     * Sets the value of the billToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToName(String value) {
        this.billToName = value;
    }

    /**
     * Gets the value of the pickUpServiceCenter property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCenterType }
     *     
     */
    public ServiceCenterType getPickUpServiceCenter() {
        return pickUpServiceCenter;
    }

    /**
     * Sets the value of the pickUpServiceCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCenterType }
     *     
     */
    public void setPickUpServiceCenter(ServiceCenterType value) {
        this.pickUpServiceCenter = value;
    }

    /**
     * Gets the value of the numberOfPieces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfPieces() {
        return numberOfPieces;
    }

    /**
     * Sets the value of the numberOfPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfPieces(String value) {
        this.numberOfPieces = value;
    }

    /**
     * Gets the value of the numberOfPallets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfPallets() {
        return numberOfPallets;
    }

    /**
     * Sets the value of the numberOfPallets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfPallets(String value) {
        this.numberOfPallets = value;
    }

    /**
     * Gets the value of the shipmentServiceOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentServiceOptionsType }
     *     
     */
    public ShipmentServiceOptionsType getShipmentServiceOptions() {
        return shipmentServiceOptions;
    }

    /**
     * Sets the value of the shipmentServiceOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentServiceOptionsType }
     *     
     */
    public void setShipmentServiceOptions(ShipmentServiceOptionsType value) {
        this.shipmentServiceOptions = value;
    }

    /**
     * Gets the value of the estimatedDeliveryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedDeliveryDetailsType }
     *     
     */
    public EstimatedDeliveryDetailsType getEstimatedDeliveryDetails() {
        return estimatedDeliveryDetails;
    }

    /**
     * Sets the value of the estimatedDeliveryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedDeliveryDetailsType }
     *     
     */
    public void setEstimatedDeliveryDetails(EstimatedDeliveryDetailsType value) {
        this.estimatedDeliveryDetails = value;
    }

    /**
     * Gets the value of the signedForByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedForByName() {
        return signedForByName;
    }

    /**
     * Sets the value of the signedForByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedForByName(String value) {
        this.signedForByName = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentActivityType }
     * 
     * 
     */
    public List<ShipmentActivityType> getActivity() {
        if (activity == null) {
            activity = new ArrayList<ShipmentActivityType>();
        }
        return this.activity;
    }

    /**
     * Gets the value of the originPortDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OriginPortDetailsType }
     *     
     */
    public OriginPortDetailsType getOriginPortDetails() {
        return originPortDetails;
    }

    /**
     * Sets the value of the originPortDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginPortDetailsType }
     *     
     */
    public void setOriginPortDetails(OriginPortDetailsType value) {
        this.originPortDetails = value;
    }

    /**
     * Gets the value of the destinationPortDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationPortDetailsType }
     *     
     */
    public DestinationPortDetailsType getDestinationPortDetails() {
        return destinationPortDetails;
    }

    /**
     * Sets the value of the destinationPortDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationPortDetailsType }
     *     
     */
    public void setDestinationPortDetails(DestinationPortDetailsType value) {
        this.destinationPortDetails = value;
    }

    /**
     * Gets the value of the descriptionOfGoods property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionOfGoods() {
        return descriptionOfGoods;
    }

    /**
     * Sets the value of the descriptionOfGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionOfGoods(String value) {
        this.descriptionOfGoods = value;
    }

    /**
     * Gets the value of the cargoReady property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getCargoReady() {
        return cargoReady;
    }

    /**
     * Sets the value of the cargoReady property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCargoReady(DateTime value) {
        this.cargoReady = value;
    }

    /**
     * Gets the value of the manifest property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getManifest() {
        return manifest;
    }

    /**
     * Sets the value of the manifest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setManifest(DateTime value) {
        this.manifest = value;
    }

    /**
     * Gets the value of the carrierActivityInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierActivityInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierActivityInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierActivityInformationType }
     * 
     * 
     */
    public List<CarrierActivityInformationType> getCarrierActivityInformation() {
        if (carrierActivityInformation == null) {
            carrierActivityInformation = new ArrayList<CarrierActivityInformationType>();
        }
        return this.carrierActivityInformation;
    }

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType }
     * 
     * 
     */
    public List<DocumentType> getDocument() {
        if (document == null) {
            document = new ArrayList<DocumentType>();
        }
        return this.document;
    }

    /**
     * Gets the value of the scheduledDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledDeliveryDate() {
        return scheduledDeliveryDate;
    }

    /**
     * Sets the value of the scheduledDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledDeliveryDate(String value) {
        this.scheduledDeliveryDate = value;
    }

    /**
     * Gets the value of the scheduledDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledDeliveryTime() {
        return scheduledDeliveryTime;
    }

    /**
     * Sets the value of the scheduledDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledDeliveryTime(String value) {
        this.scheduledDeliveryTime = value;
    }

    /**
     * Gets the value of the deliveryDateUnavailable property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDateUnavailableType }
     *     
     */
    public DeliveryDateUnavailableType getDeliveryDateUnavailable() {
        return deliveryDateUnavailable;
    }

    /**
     * Sets the value of the deliveryDateUnavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDateUnavailableType }
     *     
     */
    public void setDeliveryDateUnavailable(DeliveryDateUnavailableType value) {
        this.deliveryDateUnavailable = value;
    }

    /**
     * Gets the value of the fileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * Sets the value of the fileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNumber(String value) {
        this.fileNumber = value;
    }

    /**
     * Gets the value of the appointment property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentType }
     *     
     */
    public AppointmentType getAppointment() {
        return appointment;
    }

    /**
     * Sets the value of the appointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentType }
     *     
     */
    public void setAppointment(AppointmentType value) {
        this.appointment = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the package property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getPackage() {
        if (_package == null) {
            _package = new ArrayList<PackageType>();
        }
        return this._package;
    }

}
