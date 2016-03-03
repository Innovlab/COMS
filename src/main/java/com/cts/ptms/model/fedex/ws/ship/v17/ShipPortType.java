/**
 * ShipPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cts.ptms.model.fedex.ws.ship.v17;

public interface ShipPortType extends java.rmi.Remote {
    public com.cts.ptms.model.fedex.ws.ship.v17.ProcessTagReply processTag(com.cts.ptms.model.fedex.ws.ship.v17.ProcessTagRequest processTagRequest) throws java.rmi.RemoteException;
    public com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentReply processShipment(com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentRequest processShipmentRequest) throws java.rmi.RemoteException;
    public com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply deleteTag(com.cts.ptms.model.fedex.ws.ship.v17.DeleteTagRequest deleteTagRequest) throws java.rmi.RemoteException;
    public com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply deleteShipment(com.cts.ptms.model.fedex.ws.ship.v17.DeleteShipmentRequest deleteShipmentRequest) throws java.rmi.RemoteException;
    public com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply validateShipment(com.cts.ptms.model.fedex.ws.ship.v17.ValidateShipmentRequest validateShipmentRequest) throws java.rmi.RemoteException;
}
