/**
 * 
 */
package com.cts.ptms.exception.shipping;

/**
 * @author 417765
 *
 */
public class ShippingException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 *  default constructor
	 */
	public ShippingException() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ShippingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ShippingException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public ShippingException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ShippingException(Throwable cause) {
		super(cause);
	}
}
