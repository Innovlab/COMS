package com.cts.ptms.carrier.yrc;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.io.FileUtils;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.cts.ptms.model.common.ShipmentDocument;
import com.cts.ptms.model.common.ShipmentOrder;
import com.cts.ptms.utils.constants.ShippingConstants;

public class YRCMapper {

	private String transformReuest(String sourceXmlFile)  {

		String xmlString = "";
		try {
			;
			InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(ShippingConstants.YRC_INPUT_MAPPER);
			File sourceXml = new File(sourceXmlFile); // source file
			String rawXml = FileUtils.readFileToString(sourceXml);	
			rawXml = rawXml.replace("xmlns=\"http://ScanData.com/WTM/XMLSchemas/WTM_XMLSchema_11.00.0000.xsd\"", "");
			
			FileUtils.writeStringToFile(sourceXml, rawXml);
			sourceXml =  new File(sourceXmlFile);
			TransformerFactory f = TransformerFactory.newInstance();
			Transformer transformer = f.newTransformer(new StreamSource(inputStream));
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");	
		    //transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

			StringWriter writer = new StringWriter();
			Source source = new StreamSource(sourceXml);
			Result result = new StreamResult(writer);
			transformer.transform(source, result);
			xmlString = writer.toString();	
			
		} catch (TransformerConfigurationException e) {
			System.out.println(e.toString());
		} catch (TransformerException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return xmlString;

	}
	
	public ShipmentOrder createShipmentResposeObj(String soapResponseStr) {
		ShipmentOrder shipmentOrder = null;

		try {			
			
			InputSource source = new InputSource(new StringReader(soapResponseStr));
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setNamespaceAware(true);
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse(source);

			XPathFactory xpathFactory = XPathFactory.newInstance();
			XPath xpath = xpathFactory.newXPath();				
			xpath.setNamespaceContext(new YRCNameSpaceResolver());			
			Map<String, String> exprList =  getExprMap();                     
			

			shipmentOrder = new ShipmentOrder();
			String content="";			
			String status  = (String) xpath.evaluate(exprList.get("status"), document,XPathConstants.STRING);			
			System.out.println("Status --" + status);
			
			List<ShipmentDocument> shipmentDoclist = new ArrayList<ShipmentDocument>();
			
			if (status.equalsIgnoreCase("SUCCESS")) {				
				shipmentOrder.setStatus("SUCCESS");
				for (String docName : exprList.keySet()) {
					System.out.println("Key Name: " + docName);
					switch(docName) {
						case "trackingNumber" : {							
							shipmentOrder.setTrackingNumber(xpath.evaluate(exprList.get("trackingNumber"), document));
							break;
						}
						case "INVOICE":
						case "SHIPPINGLABEL":
						case "BARCODE" : {
							content = xpath.evaluate(exprList.get(docName), document);
							ShipmentDocument shipmentDoc = new ShipmentDocument();
							shipmentDoc.setDocumentText(content);
							shipmentDoc.setDocumentType(ShippingConstants.PDF_fILE);
							shipmentDoc.setDocumentName(docName);
							shipmentDoclist.add(shipmentDoc);
							System.out.println("Inside Loop " + docName );
							break;
						}
					}
				}
				shipmentOrder.setShipmentDocuments(shipmentDoclist);
			} else {
				shipmentOrder.setStatus("ERROR");
				shipmentOrder.setErrorCode("YRC-01");
				content = xpath.evaluate(exprList.get("error"), document);
				System.out.println("Content : - " + content);
				shipmentOrder.setErrorDescription(content);
				
			}
		} catch (XPathExpressionException e) {
			
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			updateErrorInfo(shipmentOrder,"YRC-03",e.getMessage());
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		shipmentOrder.setCarrier("YRC");
		return shipmentOrder;
	}



	public String populateYRCSubmitRequest(String inputXmlFileName) {		
		//String mappingTemplateFile = "D:/samplePdf/yrc_mapper.xsl";		
		String yrcXmlRequest = transformReuest(inputXmlFileName);		
		return yrcXmlRequest;
	}
	
	
	private void updateErrorInfo(ShipmentOrder shipmentResponse,String errorCode,String errorMessage) {
		shipmentResponse.setStatus("ERROR");
		shipmentResponse.setErrorCode(errorCode);
		shipmentResponse.setErrorDescription(errorMessage);
		
	}
	
	private Map<String,String> getExprMap() {
		
		Map<String, String> exprList = new HashMap<String, String>();
		exprList.put("status", "//ns3:StatusMessages[@id='ID2']/item/text()");			
		exprList.put("error", "//ns3:StatusMessages[@id='ID2']/item/text()");
		exprList.put("trackingNumber","//ns2:submitBOLResponse/proNumber/text()");
		exprList.put("INVOICE", "//xsd:base64Binary[@id='ID3']/text()");			
		exprList.put("SHIPPINGLABEL", "//xsd:base64Binary[@id='ID4']/text()");
		exprList.put("BARCODE", "//xsd:base64Binary[@id='ID5']/text()");	 
		return exprList;
		
	}
	
	public static void main  (String[] args) {
		String inputXmlFileName = "D:/samplePdf/source.xml";
		YRCMapper yrcMapper = new YRCMapper();
		yrcMapper.populateYRCSubmitRequest(inputXmlFileName);
	}
 
}
