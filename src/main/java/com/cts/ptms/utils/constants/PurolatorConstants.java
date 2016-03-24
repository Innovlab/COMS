package com.cts.ptms.utils.constants;

import java.util.HashMap;
import java.util.Map;

public interface PurolatorConstants {
	
	String PIN_VERSION = "1.5";
	String PIN_GROUPID = "";
	String PIN_REQ_REF = "";
	String PIN_USER_TOKEN = "";

	String DOC_REQUEST_VERSION = "1.3";
	String DOC_REQUEST_GROUPID = "";
	String DOC_REQUEST_REQ_REF = "";
	String DOC_REQUEST_USER_TOKEN = "";
	
	
	String PIN_REQ_SENDER_TAX_NUM="123456";
	String PIN_REQ_RCVER_TAX_NUM="654321";
	
	String ADDRESS_DELIVER_TO="DELIVER_TO";
	String ADDRESS_ORDERED_BY="ORDERED_BY";
	
	String ADDRESS_ST_TYPE="ST";
	
	String SERVICE_TYPE_01="PurolatorExpressEnvelope";
	boolean DANGER_GOODS_FLAG=false;
	
	String ACCOUNT_NUM="accountNum";
	String CONFIRM_EMAIL_ADDR="your.name@example.com";
	
	String PIN_REQ_URL="pinRequestURL";
	String DOC_REQ_URL="docRequestURL";
	String PUROLATOR_USERNAME="purolator.username";
	String PUROLATOR_PASSWORD="purolator.password";
	String PUROLATOR_DOCTYPES="purolator.docTypes";
	String DOCTYPES_SEPARATOR=",";
	
	String PUROLATOR_DOCTYPE_BOL="DomesticBillOfLading";
			
	String ERR_EMPTY_RESPONSE = "Received Empty Response";
	String ERR_PIN_REQ_SERVICE_ACCESS = "Error Accessing PIN Request Service";
	String ERR_PIN_REQ_SERVICE_INVOKE = "Error Occurred in PIN Request Service Invocation";
	String ERR_DOC_REQ_SERVICE_ACCESS = "Error Accessing DOCUMENT Request Service";
	String ERR_DOC_REQ_SERVICE_INVOKE = "Error Occurred in DOCUMENT Request Service Invocation";	
	String ERR_DOC_REQ_NO_DOCUMENTS = "Error Retrieving Documents from the response";
	String ERR_DOC_REQ_NO_DOC_DETAILS = " Error Retrieving Document Details from the response";
	String ERR_DOC_REQ_PDF_RETRIEVAL = "Error Retrieving PDF from the URL";
	
	
			

}
