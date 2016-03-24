
/**
 * ShippingServiceContract_CreateShipment_ValidationFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

package com.cts.ptms.model.purolator;

public class ShippingServiceContract_CreateShipment_ValidationFaultFault_FaultMessage extends java.lang.Exception{
    
    private com.cts.ptms.model.purolator.ShippingServiceStub.ValidationFaultE faultMessage;

    
        public ShippingServiceContract_CreateShipment_ValidationFaultFault_FaultMessage() {
            super("ShippingServiceContract_CreateShipment_ValidationFaultFault_FaultMessage");
        }

        public ShippingServiceContract_CreateShipment_ValidationFaultFault_FaultMessage(java.lang.String s) {
           super(s);
        }

        public ShippingServiceContract_CreateShipment_ValidationFaultFault_FaultMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ShippingServiceContract_CreateShipment_ValidationFaultFault_FaultMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.cts.ptms.model.purolator.ShippingServiceStub.ValidationFaultE msg){
       faultMessage = msg;
    }
    
    public com.cts.ptms.model.purolator.ShippingServiceStub.ValidationFaultE getFaultMessage(){
       return faultMessage;
    }
}
    