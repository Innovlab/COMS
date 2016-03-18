package com.cts.ptms.model.fedex.ws.track.v10;

public class TrackPortTypeProxy implements com.cts.ptms.model.fedex.ws.track.v10.TrackPortType {
  private String _endpoint = null;
  private com.cts.ptms.model.fedex.ws.track.v10.TrackPortType trackPortType = null;
  
  public TrackPortTypeProxy() {
    _initTrackPortTypeProxy();
  }
  
  public TrackPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initTrackPortTypeProxy();
  }
  
  private void _initTrackPortTypeProxy() {
    try {
      trackPortType = (new com.cts.ptms.model.fedex.ws.track.v10.TrackServiceLocator()).getTrackServicePort();
      if (trackPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)trackPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)trackPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (trackPortType != null)
      ((javax.xml.rpc.Stub)trackPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.cts.ptms.model.fedex.ws.track.v10.TrackPortType getTrackPortType() {
    if (trackPortType == null)
      _initTrackPortTypeProxy();
    return trackPortType;
  }
  
  public com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryLetterReply retrieveSignatureProofOfDeliveryLetter(com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryLetterRequest signatureProofOfDeliveryLetterRequest) throws java.rmi.RemoteException{
    if (trackPortType == null)
      _initTrackPortTypeProxy();
    return trackPortType.retrieveSignatureProofOfDeliveryLetter(signatureProofOfDeliveryLetterRequest);
  }
  
  public com.cts.ptms.model.fedex.ws.track.v10.TrackReply track(com.cts.ptms.model.fedex.ws.track.v10.TrackRequest trackRequest) throws java.rmi.RemoteException{
    if (trackPortType == null)
      _initTrackPortTypeProxy();
    return trackPortType.track(trackRequest);
  }
  
  public com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryFaxReply sendSignatureProofOfDeliveryFax(com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryFaxRequest signatureProofOfDeliveryFaxRequest) throws java.rmi.RemoteException{
    if (trackPortType == null)
      _initTrackPortTypeProxy();
    return trackPortType.sendSignatureProofOfDeliveryFax(signatureProofOfDeliveryFaxRequest);
  }
  
  public com.cts.ptms.model.fedex.ws.track.v10.SendNotificationsReply sendNotifications(com.cts.ptms.model.fedex.ws.track.v10.SendNotificationsRequest sendNotificationsRequest) throws java.rmi.RemoteException{
    if (trackPortType == null)
      _initTrackPortTypeProxy();
    return trackPortType.sendNotifications(sendNotificationsRequest);
  }
  
  
}