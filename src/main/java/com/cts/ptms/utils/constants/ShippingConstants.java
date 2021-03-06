package com.cts.ptms.utils.constants;

/**
 * 
 * @author 117847
 *
 */
public class ShippingConstants {
	
	 // Path setting for tomcat server in azure
	 public static final String buildPropertiesPath="/home/bdcuser/COMS_ENV/Config/ups/Integraiton/UPS.properties";
	 public static final String YRC_INPUT_MAPPER="/home/bdcuser/COMS_ENV/Config/yrc/Integraiton/yrc_mapper.xsl";
	 public static final String INPUTFILE="/home/bdcuser/COMS_ENV/input";
     public static final String INVOICE_TEMPLATE="/home/bdcuser/COMS_ENV/Config/ups/common/invoice.pdf";
     public static final String CO_TEMPLATE="/home/bdcuser/COMS_ENV/Config/ups/common/COTemplate.pdf";
     public static final String OUTPUT_DIR="/home/bdcuser/COMS_ENV/Output/";
     public static  final String TEST_DOCUMENT_LOCATION="/home/bdcuser/COMS_ENV/Test/documents_location.properties";
     public static final String FEDEX_PROPERTIES_PATH = "/home/bdcuser/COMS_ENV/Config/fedex/Integration/FEDEX.properties";
     public static final String PUROLATOR_PROPERTIES_PATH= "/home/bdcuser/COMS_ENV/Config/Purolator/Integration/Purolator.properties";
     public static final String FEDEX_INPUT_DIR = "/home/bdcuser/COMS_ENV/Test/fedex/input/";
	 public static final String FEDEX_OUTPUT_DIR = "/home/bdcuser/COMS_ENV/Test/fedex/output/";
	 public static final String UPS_INPUT_DIR = "/home/bdcuser/COMS_ENV/Test/ups/input/";
	 public static final String UPS_OUTPUT_DIR = "/home/bdcuser/COMS_ENV/Test/ups/output/";
	 public static final String YRC_INPUT_DIR = "/home/bdcuser/COMS_ENV/Test/yrc/input/";
	 public static final String YRC_OUTPUT_DIR = "/home/bdcuser/COMS_ENV/Test/yrc/output/";
	

	 //Path setting for local tomcat
	 /*public static final String buildPropertiesPath="D:/COMS_ENV/Config/ups/Integraiton/UPS.properties";
	 public static final String YRC_INPUT_MAPPER="D:/COMS_ENV/Config/yrc/Integraiton/yrc_mapper.xsl";
	 public static final String INPUTFILE="D:/COMS_ENV/inputData.xml";
	 public static final String INVOICE_TEMPLATE="D:/COMS_ENV/Config/ups/common/invoice.pdf";
     public static final String CO_TEMPLATE="D:/COMS_ENV/Config/ups/common/COTemplate.pdf";
     public static final String OUTPUT_DIR="D:/COMS_ENV/Output/";
     public static  final String TEST_DOCUMENT_LOCATION="D:/COMS_ENV/Test/documents_location.properties";
	 public static final String FEDEX_PROPERTIES_PATH = "D:/COMS_ENV/Config/fedex/Integration/FEDEX.properties";
     public static final String PUROLATOR_PROPERTIES_PATH= "D:/COMS_ENV/Config/Purolator/Integration/Purolator.properties";
	 public static final String FEDEX_INPUT_DIR = "D:/COMS_ENV/Test/fedex/input/";
	 public static final String FEDEX_OUTPUT_DIR = "D:/COMS_ENV/Test/fedex/output/";
	 public static final String UPS_INPUT_DIR = "D:/COMS_ENV/Test/ups/input/";
	 public static final String UPS_OUTPUT_DIR = "D:/COMS_ENV/Test/ups/output/";
	 public static final String YRC_INPUT_DIR = "D:/COMS_ENV/Test/yrc/input/";
	 public static final String YRC_OUTPUT_DIR = "D:/COMS_ENV/Test/yrc/output/";*/
     
     
     //Path setting for local tomcat
  	 /*public static final String buildPropertiesPath="E:/COMS_ENV/Config/ups/Integraiton/UPS.properties";
  	 public static final String YRC_INPUT_MAPPER="E:/COMS_ENV/Config/yrc/Integraiton/yrc_mapper.xsl";
  	 public static final String INPUTFILE="E:/COMS_ENV/inputData.xml";
  	 public static final String INVOICE_TEMPLATE="E:/COMS_ENV/Config/ups/common/invoice.pdf";
	 public static final String CO_TEMPLATE="E:/COMS_ENV/Config/ups/common/COTemplate.pdf";
	 public static final String OUTPUT_DIR="E:/COMS_ENV/Output/";
	 public static  final String TEST_DOCUMENT_LOCATION="E:/COMS_ENV/Test/documents_location.properties";
	 public static final String FEDEX_PROPERTIES_PATH = "E:/COMS_ENV/Config/fedex/Integration/FEDEX.properties";
     public static final String PUROLATOR_PROPERTIES_PATH= "E:/COMS_ENV/Config/Purolator/Integration/Purolator.properties";
	 public static final String FEDEX_INPUT_DIR = "E:/COMS_ENV/Test/fedex/input/";
	 public static final String FEDEX_OUTPUT_DIR = "E:/COMS_ENV/Test/fedex/output/";
	 public static final String UPS_INPUT_DIR = "E:/COMS_ENV/Test/ups/input/";
	 public static final String UPS_OUTPUT_DIR = "E:/COMS_ENV/Test/ups/output/";
	 public static final String YRC_INPUT_DIR = "E:/COMS_ENV/Test/yrc/input/";
	 public static final String YRC_OUTPUT_DIR = "E:/COMS_ENV/Test/yrc/output/";*/
	 
	
	public static final String SHIPPING_CONFIRM_URL	= "shipConfirmURL";
	public static final String SHIPPING_ACCEPT_URL 	= "shipAcceptURL";
	public static final String ACCESS_KEY = "accesskey";
    public static final String USER_ID = "username";
    public static final String PASSWORD = "password";
    public static final String SHIP_REQUEST_ACTION = "shipRequestAction";
    public static final String SHIP_REQUEST_OPTION = "shipRequestOption";
    public static final String XML_STANDALONE_STRING ="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
    public static final String PDF_FILE_NAME="pdfFileName";
   
    public static final String UPS = "UPS";
   
    // Hard coded strings used in business logic
    public static final String XML_NAMESPACE = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
    public static final String SHIP_Response_TAG = "<ShipmentConfirmResponse>";
    public static final String ship_Response_Replace = "<ShipmentConfirmResponse xmlns=\"http://ScanData.com/WTM/XMLSchemas/WTM_XMLSchema_11.00.0000.xsd\">";
    public static final String error_Open_tag = "<ErrorDescription>";
    public static final String error_Close_tag = "</ErrorDescription>";
    public static final String SHIP_Accept_TAG =  "<ShipmentAcceptResponse>";
    public static final String ship_Accept_Replace = "<ShipmentAcceptResponse xmlns=\"http://ScanData.com/WTM/XMLSchemas/WTM_XMLSchema_11.00.0000.xsd\">";
    public static final String PNG_FILE = ".png";
    public static final String PDF_fILE = ".PDF";
    public static final String FILE_PATH = "/WEB-INF/classes";
    public static final String File_Path_Replace = "/ShipLabels";    
    public static  final String YRC = "YRC";
    public static  final String FEDEX = "FEDEX";
    public static final String DECODED_BYTE_ARRAY = "DECODED_BYTE_ARRAY";
    public static final String DECODED_FORMAT = "UTF-8";
    public static final String SHIPPING_LABEL_DOC = "SHIPPINGLABEL";
  //Status codes
    public static final String SUCCESS = "SUCCESS";
    public static final String ERROR = "ERROR";
    public static final String STATUS_FAILURE = "FAILURE";
    
    public static final String ERR_CD_CARTON_EXISTS = "An Active Tracking Number already exists for the carton";
    public static final String ERR_CD_MAX_WEIGHT = "The max weight allowed for this service typs is ";
    
    public static final String PUROLATOR="PUROLATOR";
}

