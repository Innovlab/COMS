package com.cts.ptms.carrier.yrc;
import java.util.Iterator;

import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;

public class YRCNameSpaceResolver implements NamespaceContext {

    /**
     * This method returns the uri for all prefixes needed. Wherever possible
     * it uses XMLConstants.
     * 
     * @param prefix
     * @return uri
     */
    public String getNamespaceURI(String prefix) {
        if (prefix == null) {
            throw new IllegalArgumentException("No prefix provided!");
        } else if (prefix.equals(XMLConstants.DEFAULT_NS_PREFIX)) {
            return "http://univNaSpResolver/book";
        } else if (prefix.equals("SOAP-ENV")) {
           return "http://schemas.xmlsoap.org/soap/envelope/";
        } else if (prefix.equals("enc")) {
            return "http://schemas.xmlsoap.org/soap/encoding/";
        } else if (prefix.equals("ns0")) {
           return "http://my.yrc.com/national/WebServices/2009/01/31/YRCSecureBOL.wsdl";
        } else if (prefix.equals("ns1")) {
            return "http://my.yrc.com/national/WebServices/2009/01/31/YRCCommonTypes.xsd";
        } else if (prefix.equals("ns2")) {
            return "http://my.yrc.com/national/WebServices/2009/01/31/YRCBolMessages.xsd";
        } else if (prefix.equals("ns3")) {
            return "http://my.yrc.com/national/WebServices/2009/01/31/YRCBoLTypes.xsd";
        } else if (prefix.equals("xsd")) {
            return "http://www.w3.org/2001/XMLSchema";
        } 
        else {
            return XMLConstants.NULL_NS_URI;
        }
    }

    public String getPrefix(String namespaceURI) {
        // Not needed in this context.
        return null;
    }

    public Iterator getPrefixes(String namespaceURI) {
        // Not needed in this context.
        return null;
    }

}