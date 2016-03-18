package com.cts.ptms.model.tracking;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;


public class Package {

    @XmlElement(name = "TrackingNumber")
    private String trackingNumber;
    @XmlElement(name = "RescheduledDeliveryDate")
    private String rescheduledDeliveryDate;
    @XmlElement(name = "RescheduledDeliveryTime")
    private String rescheduledDeliveryTime;
    @XmlElement(name = "PackageServiceOptions")
    private PackageServiceOptions packageServiceOptions;
    @XmlElement(name = "Activity")
    private List<Activity> activity;
    @XmlElement(name = "Message")
    private List<CodeType> message;
    @XmlElement(name = "PackageWeight")
    private Weight packageWeight;
    @XmlElement(name = "ReferenceNumber")
    private List<ReferenceNumber> referenceNumber;
    /*@XmlElement(name = "ProductType")
    private ProductCodeDescription productType;
    @XmlElement(name = "LocationAssured")
    private String locationAssured;
    @XmlElement(name = "Accessorial")
    private List<AccessorialCodeDescriptionType> accessorial;
    @XmlElement(name = "DimensionalWeightScanIndicator")
    private String dimensionalWeightScanIndicator;*/
	/**
	 * @return the trackingNumber
	 */
	public String getTrackingNumber() {
		return trackingNumber;
	}
	/**
	 * @param trackingNumber the trackingNumber to set
	 */
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	/**
	 * @return the rescheduledDeliveryDate
	 */
	public String getRescheduledDeliveryDate() {
		return rescheduledDeliveryDate;
	}
	/**
	 * @param rescheduledDeliveryDate the rescheduledDeliveryDate to set
	 */
	public void setRescheduledDeliveryDate(String rescheduledDeliveryDate) {
		this.rescheduledDeliveryDate = rescheduledDeliveryDate;
	}
	/**
	 * @return the rescheduledDeliveryTime
	 */
	public String getRescheduledDeliveryTime() {
		return rescheduledDeliveryTime;
	}
	/**
	 * @param rescheduledDeliveryTime the rescheduledDeliveryTime to set
	 */
	public void setRescheduledDeliveryTime(String rescheduledDeliveryTime) {
		this.rescheduledDeliveryTime = rescheduledDeliveryTime;
	}
	/**
	 * @return the packageServiceOptions
	 */
	public PackageServiceOptions getPackageServiceOptions() {
		return packageServiceOptions;
	}
	/**
	 * @param packageServiceOptions the packageServiceOptions to set
	 */
	public void setPackageServiceOptions(PackageServiceOptions packageServiceOptions) {
		this.packageServiceOptions = packageServiceOptions;
	}
	/**
	 * @return the activity
	 */
	public List<Activity> getActivity() {
		return activity;
	}
	/**
	 * @param activity the activity to set
	 */
	public void setActivity(List<Activity> activity) {
		this.activity = activity;
	}
	/**
	 * @return the message
	 */
	public List<CodeType> getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(List<CodeType> message) {
		this.message = message;
	}
	/**
	 * @return the packageWeight
	 */
	public Weight getPackageWeight() {
		return packageWeight;
	}
	/**
	 * @param packageWeight the packageWeight to set
	 */
	public void setPackageWeight(Weight packageWeight) {
		this.packageWeight = packageWeight;
	}
	/**
	 * @return the referenceNumber
	 */
	public List<ReferenceNumber> getReferenceNumber() {
		return referenceNumber;
	}
	/**
	 * @param referenceNumber the referenceNumber to set
	 */
	public void setReferenceNumber(List<ReferenceNumber> referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	
    

}
