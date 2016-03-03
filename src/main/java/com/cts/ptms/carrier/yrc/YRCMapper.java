package com.cts.ptms.carrier.yrc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
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
			//InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(ShippingConstants.YRC_INPUT_MAPPER);
			File initialFile = new File("/home/bdcuser/Config/yrc/Integraiton/yrc_mapper.xsl");
		    InputStream inputStream = FileUtils.openInputStream(initialFile);		
			File sourceXml =  new File(sourceXmlFile);
			File formattedSourceXml = updateDateFormat(sourceXml,sourceXmlFile);
			TransformerFactory f = TransformerFactory.newInstance();
			Transformer transformer = f.newTransformer(new StreamSource(inputStream));
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");	
		    //transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

			StringWriter writer = new StringWriter();
			Source source = new StreamSource(formattedSourceXml);
			Result result = new StreamResult(writer);
			transformer.transform(source, result);
			xmlString = writer.toString();	
			System.out.println(xmlString);
			
		} catch (TransformerConfigurationException e) {
			
			e.printStackTrace();	
		} catch (TransformerException e) {
			
			e.printStackTrace();			
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
							shipmentOrder.setOrderNumber(xpath.evaluate(exprList.get("trackingNumber"), document));
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
							break;
						}
					}
				}
				shipmentOrder.setShipmentDocuments(shipmentDoclist);
			} else {
				shipmentOrder.setStatus("ERROR");
				shipmentOrder.setErrorCode("YRC-01");
				content = xpath.evaluate(exprList.get("error"), document);				
				shipmentOrder.setErrorDescription(content);
				
			}
		} catch (XPathExpressionException e) {
			updateErrorInfo(shipmentOrder,"YRC-03",e.getMessage());
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			updateErrorInfo(shipmentOrder,"YRC-03",e.getMessage());
			e.printStackTrace();
		} catch (SAXException e) {			
			updateErrorInfo(shipmentOrder,"YRC-03",e.getMessage());
			e.printStackTrace();
			
		} catch (IOException e) {
			updateErrorInfo(shipmentOrder,"YRC-03",e.getMessage());			
			e.printStackTrace();
		} 
		shipmentOrder.setCarrier("YRC");
		shipmentOrder.setOrderDate(new Date());
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
		exprList.put("orderNumber", "//ns2:submitBOLResponse/proNumber/text()");		
		return exprList;
		
	}
	
	public  File updateDateFormat(File sourceXmlFile, String sourceXmlFileName) {
		BufferedReader bf;
		String line;
		String matchLine = "";
		try {
			bf = new BufferedReader(new FileReader(sourceXmlFile));
			

			while ((line = bf.readLine()) != null) {
				if (line.contains("DatePlannedShipment")) {
					matchLine = line;
					matchLine = matchLine.trim();
					System.out.println("Match Line:" + matchLine + "--");
					break;
				}
			}
			bf.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		StringBuilder output = new StringBuilder();
		output.append(matchLine.substring(26, 28));
		output.append("/");
		output.append(matchLine.substring(29, 31));
		output.append("/");
		output.append(matchLine.substring(21, 25));
		String formattedDate = "<DatePlannedShipment>" + output.toString() + "</DatePlannedShipment>";
		// source file
		String rawXml;
		File formattedXmlFile=null;
		try {
			rawXml = FileUtils.readFileToString(sourceXmlFile);
			rawXml = rawXml.replace("xmlns=\"http://ScanData.com/WTM/XMLSchemas/WTM_XMLSchema_11.00.0000.xsd\"", "");			                                
			rawXml = rawXml.replace("xmlns=\"http://ScanData.com/WTM/XMLSchemas/Walmart_1.00.0000.xsd\"", "");
			rawXml =  rawXml.replace(matchLine, formattedDate);
			formattedXmlFile =  new File(sourceXmlFileName);
			FileUtils.writeStringToFile(formattedXmlFile, rawXml);
		} catch (IOException e) {			
			e.printStackTrace();
		}	
		
		try {
			FileUtils.readFileToString(formattedXmlFile);
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return formattedXmlFile;

	}

	
	public static void main  (String[] args) {
		//String inputXmlFileName = "D:/samplePdf/source.xml";
		String inputXmlFileName = "C:/Users/234174/workspace/YRCClient/src/xml_data/source.xml";
		YRCMapper yrcMapper = new YRCMapper();
		yrcMapper.populateYRCSubmitRequest(inputXmlFileName);
	}
 
}
