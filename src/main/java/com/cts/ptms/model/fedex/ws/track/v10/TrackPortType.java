/**
 * TrackPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cts.ptms.model.fedex.ws.track.v10;

public interface TrackPortType extends java.rmi.Remote {
    public com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryLetterReply retrieveSignatureProofOfDeliveryLetter(com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryLetterRequest signatureProofOfDeliveryLetterRequest) throws java.rmi.RemoteException;
    public com.cts.ptms.model.fedex.ws.track.v10.TrackReply track(com.cts.ptms.model.fedex.ws.track.v10.TrackRequest trackRequest) throws java.rmi.RemoteException;
    public com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryFaxReply sendSignatureProofOfDeliveryFax(com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryFaxRequest signatureProofOfDeliveryFaxRequest) throws java.rmi.RemoteException;
    public com.cts.ptms.model.fedex.ws.track.v10.SendNotificationsReply sendNotifications(com.cts.ptms.model.fedex.ws.track.v10.SendNotificationsRequest sendNotificationsRequest) throws java.rmi.RemoteException;
}
