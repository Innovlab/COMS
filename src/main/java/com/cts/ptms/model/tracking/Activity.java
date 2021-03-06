//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.11 at 12:13:44 PM CST 
//


package com.cts.ptms.model.tracking;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Activity")
public class Activity {

    @XmlElement(name = "ActivityLocation")
    protected ActivityLocation activityLocation;
    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "DeliveryDateFromManifestIndicator")
    protected String deliveryDateFromManifestIndicator;
    @XmlElement(name = "NextScheduleActivity")
    protected NextScheduleActivity nextScheduleActivity;

    /**
     * Gets the value of the activityLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityLocation }
     *     
     */
    public ActivityLocation getActivityLocation() {
        return activityLocation;
    }

    /**
     * Sets the value of the activityLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityLocation }
     *     
     */
    public void setActivityLocation(ActivityLocation value) {
        this.activityLocation = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the deliveryDateFromManifestIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDateFromManifestIndicator() {
        return deliveryDateFromManifestIndicator;
    }

    /**
     * Sets the value of the deliveryDateFromManifestIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDateFromManifestIndicator(String value) {
        this.deliveryDateFromManifestIndicator = value;
    }

    /**
     * Gets the value of the nextScheduleActivity property.
     * 
     * @return
     *     possible object is
     *     {@link NextScheduleActivity }
     *     
     */
    public NextScheduleActivity getNextScheduleActivity() {
        return nextScheduleActivity;
    }

    /**
     * Sets the value of the nextScheduleActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextScheduleActivity }
     *     
     */
    public void setNextScheduleActivity(NextScheduleActivity value) {
        this.nextScheduleActivity = value;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Activity [activityLocation=" + activityLocation + ", status=" + status + ", date=" + date + ", time="
				+ time + ", deliveryDateFromManifestIndicator=" + deliveryDateFromManifestIndicator
				+ ", nextScheduleActivity=" + nextScheduleActivity + "]";
	}
    
    

}
