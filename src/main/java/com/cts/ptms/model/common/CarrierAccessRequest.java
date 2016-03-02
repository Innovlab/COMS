/**
 * 
 */
package com.cts.ptms.model.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author 417765
 *
 */
@XmlRootElement(name = "CarrierAccessRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class CarrierAccessRequest {
	
	
	//Can be act as userKey in case of FedEx and userId in case of UPS.
	@XmlElement(name = "UserId", required = true)
	private String userId;
	
	@XmlElement(name = "Password", required = true)
	private String password;
	
	@XmlElement(name = "AccountNumber", required = true)
	private String accountNumber;
	
	@XmlElement(name = "MeterNumber")
	private String meterNumber;


	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the meterNumber
	 */
	public String getMeterNumber() {
		return meterNumber;
	}

	/**
	 * @param meterNumber the meterNumber to set
	 */
	public void setMeterNumber(String meterNumber) {
		this.meterNumber = meterNumber;
	}

}
