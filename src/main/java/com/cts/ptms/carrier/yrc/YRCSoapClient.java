package com.cts.ptms.carrier.yrc;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Properties;

import javax.net.ssl.TrustManager;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceException;

import org.apache.commons.io.FileUtils;

import com.cts.ptms.core.ClientGateway;
import com.cts.ptms.model.accept.response.ShipmentAcceptResponse;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.confirm.response.ShipmentConfirmResponse;
import com.cts.ptms.utils.constants.ShippingConstants;


import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;

public class YRCSoapClient implements ClientGateway {
	private Properties properties = new Properties();
	private static String NAMESPACE = "http://addressbook.jaxws.axis2.apache.org";
	private static QName QNAME_SERVICE = new QName(NAMESPACE, "YRCSecureBOL");
	private static QName QNAME_PORT = new QName(NAMESPACE, "IYRCSecureBOLPort");
	private static String ENDPOINT_URL = "https://mytest.yrc.com/dynamic/national/webservice/YRCSecureBOL";

	public void initialize() {
		
		//InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(ShippingConstants.buildPropertiesPath);
		
		try {
			
			File initialFile = new File(ShippingConstants.buildPropertiesPath);
		    InputStream inputStream = FileUtils.openInputStream(initialFile);			
			properties.load(inputStream);
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	private TrustManager[ ] get_trust_mgr() {
	     TrustManager[ ] certs = new TrustManager[ ] {
	        new X509TrustManager() {
	           public X509Certificate[ ] getAcceptedIssuers() { return null; }
	           public void checkClientTrusted(X509Certificate[ ] certs, String t) { }
	           public void checkServerTrusted(X509Certificate[ ] certs, String t) { }
	         }
	      };
	      return certs;
	}
	
	

	public ShipmentOrder createShipmentRequest(ShipmentRequest request) {
		initialize();
		
		SSLContext ssl_ctx = null;
		try {
			ssl_ctx = SSLContext.getInstance("TLS");
			TrustManager[ ] trust_mgr = get_trust_mgr();
	        ssl_ctx.init(null,                // key manager
	                     trust_mgr,           // trust manager
	                     new SecureRandom()); // random number generator
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KeyManagementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
		        
	       
		
		/*System.getProperties().put("https.proxyHost", "proxy.cognizant.com");
        System.getProperties().put("https.proxyPort", "6050");*/
		
		String inputXmlFileName = request.getFileName();
		//String inputXmlFileName = "C:/Users/234174/workspace/YRCClient/src/xml_data/source.xml";
		YRCMapper yrcMapper = new YRCMapper();
		String xmlPayLoad = yrcMapper.populateYRCSubmitRequest(inputXmlFileName);		
		//System.out.println("Xml Pay Load Value : " + xmlPayLoad);

		Service svc = Service.create(QNAME_SERVICE);
		svc.addPort(QNAME_PORT, null, ENDPOINT_URL);
		
		Dispatch<SOAPMessage> dispatch = svc.createDispatch(QNAME_PORT, SOAPMessage.class, Service.Mode.MESSAGE);
		SOAPMessage reqMsg = makeSOAPMessage(xmlPayLoad);
		
		//dispatch.getRequestContext().put("com.sun.xml.internal.ws.transport.https.client.SSLSocketFactory",ssl_ctx.getSocketFactory());
		
		// Invoke the Dispatch
		SOAPMessage response = null;
		try {
		 response = dispatch.invoke(reqMsg); 
		} catch (WebServiceException ex) {
			ex.printStackTrace();
		}
		String responseStr = getSOAPMessageAsString(response);		
		ShipmentOrder shipmentResponse = yrcMapper.createShipmentResposeObj(responseStr);
		return shipmentResponse;
	}

	public void handleError() {
		// TODO Auto-generated method stub

	}

	

	private SOAPMessage makeSOAPMessage(String msg) {
		try {
			MessageFactory factory = MessageFactory.newInstance();
			SOAPMessage message = factory.createMessage();
			message.getSOAPPart().setContent((Source) new StreamSource(new StringReader(msg)));
			message.saveChanges();
			
			return message;
			
		} catch (Exception e) {
			return null;
		}
	}

	private String getSOAPMessageAsString(SOAPMessage msg) {
		ByteArrayOutputStream baos = null;
		String s = null;
		try {
			baos = new ByteArrayOutputStream();
			msg.writeTo(baos);
			s = baos.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}

	@Override
	public ShipmentOrder createShipmentResposeObj(ShipmentConfirmResponse confirmResponse,
			ShipmentAcceptResponse acceptResponse) {
		
		return null;
	}

	public static void main (String [] args) {
		YRCSoapClient soapClient = new YRCSoapClient();
		soapClient.createShipmentRequest(null);
	}
	
}
