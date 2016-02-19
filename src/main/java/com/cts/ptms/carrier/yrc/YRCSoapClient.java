package com.cts.ptms.carrier.yrc;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.io.FileUtils;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import com.cts.ptms.core.ClientGateway;
import com.cts.ptms.model.accept.response.ShipmentAcceptResponse;
import com.cts.ptms.model.common.ShipmentDocument;
import com.cts.ptms.model.common.ShipmentRequest;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.model.confirm.response.ShipmentConfirmResponse;
import com.cts.ptms.utils.constants.ShippingConstants;

public class YRCSoapClient implements ClientGateway {
	private Properties properties = new Properties();
	private static String NAMESPACE = "http://addressbook.jaxws.axis2.apache.org";
	private static QName QNAME_SERVICE = new QName(NAMESPACE, "YRCSecureBOL");
	private static QName QNAME_PORT = new QName(NAMESPACE, "IYRCSecureBOLPort");
	private static String ENDPOINT_URL = "https://mytest.yrc.com/dynamic/national/webservice/YRCSecureBOL";

	public void initialize() {
		
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(ShippingConstants.buildPropertiesPath);
		try {
			properties.load(inputStream);
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}

	public ShipmentOrder createShipmentRequest(ShipmentRequest request) {
		initialize();
		
		
		String inputXmlFileName = request.getFileName();
		YRCMapper yrcMapper = new YRCMapper();
		String xmlPayLoad = yrcMapper.populateYRCSubmitRequest(inputXmlFileName);		

		Service svc = Service.create(QNAME_SERVICE);
		svc.addPort(QNAME_PORT, null, ENDPOINT_URL);
		
		Dispatch<SOAPMessage> dispatch = svc.createDispatch(QNAME_PORT, SOAPMessage.class, Service.Mode.MESSAGE);
		SOAPMessage reqMsg = makeSOAPMessage(xmlPayLoad);
		
		// Invoke the Dispatch		
		SOAPMessage response = dispatch.invoke(reqMsg);
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
		// TODO Auto-generated method stub
		return null;
	}

}
