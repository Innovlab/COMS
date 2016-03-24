
/**
 * ShippingDocumentsServiceContract_GetShipmentManifestDocument_ValidationFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

package com.cts.ptms.model.purolator.documents;

public class ShippingDocumentsServiceContract_GetShipmentManifestDocument_ValidationFaultFault_FaultMessage extends java.lang.Exception{
    
    private com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.ValidationFaultE faultMessage;

    
        public ShippingDocumentsServiceContract_GetShipmentManifestDocument_ValidationFaultFault_FaultMessage() {
            super("ShippingDocumentsServiceContract_GetShipmentManifestDocument_ValidationFaultFault_FaultMessage");
        }

        public ShippingDocumentsServiceContract_GetShipmentManifestDocument_ValidationFaultFault_FaultMessage(java.lang.String s) {
           super(s);
        }

        public ShippingDocumentsServiceContract_GetShipmentManifestDocument_ValidationFaultFault_FaultMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ShippingDocumentsServiceContract_GetShipmentManifestDocument_ValidationFaultFault_FaultMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.ValidationFaultE msg){
       faultMessage = msg;
    }
    
    public com.cts.ptms.model.purolator.documents.ShippingDocumentsServiceStub.ValidationFaultE getFaultMessage(){
       return faultMessage;
    }
}
    