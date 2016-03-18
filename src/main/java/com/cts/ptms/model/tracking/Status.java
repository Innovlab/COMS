package com.cts.ptms.model.tracking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statusType",
    "statusCode"
})
@XmlRootElement(name = "Status")
public class Status 
{

    @XmlElement(name = "StatusType", required = true)
    private CodeType statusType;
    @XmlElement(name = "StatusCode")
    private CodeNoDescription statusCode;
	/**
	 * @return the statusType
	 */
	public CodeType getStatusType() {
		return statusType;
	}
	/**
	 * @param statusType the statusType to set
	 */
	public void setStatusType(CodeType statusType) {
		this.statusType = statusType;
	}
	/**
	 * @return the statusCode
	 */
	public CodeNoDescription getStatusCode() {
		return statusCode;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(CodeNoDescription statusCode) {
		this.statusCode = statusCode;
	}

}
