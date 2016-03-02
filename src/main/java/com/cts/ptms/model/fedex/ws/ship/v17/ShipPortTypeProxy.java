package com.cts.ptms.model.fedex.ws.ship.v17;

public class ShipPortTypeProxy implements com.cts.ptms.model.fedex.ws.ship.v17.ShipPortType {
  private String _endpoint = null;
  private com.cts.ptms.model.fedex.ws.ship.v17.ShipPortType shipPortType = null;
  
  public ShipPortTypeProxy() {
    _initShipPortTypeProxy();
  }
  
  public ShipPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initShipPortTypeProxy();
  }
  
  private void _initShipPortTypeProxy() {
    try {
      shipPortType = (new com.cts.ptms.model.fedex.ws.ship.v17.ShipServiceLocator()).getShipServicePort();
      if (shipPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)shipPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)shipPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (shipPortType != null)
      ((javax.xml.rpc.Stub)shipPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.cts.ptms.model.fedex.ws.ship.v17.ShipPortType getShipPortType() {
    if (shipPortType == null)
      _initShipPortTypeProxy();
    return shipPortType;
  }
  
  public com.cts.ptms.model.fedex.ws.ship.v17.ProcessTagReply processTag(com.cts.ptms.model.fedex.ws.ship.v17.ProcessTagRequest processTagRequest) throws java.rmi.RemoteException{
    if (shipPortType == null)
      _initShipPortTypeProxy();
    return shipPortType.processTag(processTagRequest);
  }
  
  public com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentReply processShipment(com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentRequest processShipmentRequest) throws java.rmi.RemoteException{
    if (shipPortType == null)
      _initShipPortTypeProxy();
    return shipPortType.processShipment(processShipmentRequest);
  }
  
  public com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply deleteTag(com.cts.ptms.model.fedex.ws.ship.v17.DeleteTagRequest deleteTagRequest) throws java.rmi.RemoteException{
    if (shipPortType == null)
      _initShipPortTypeProxy();
    return shipPortType.deleteTag(deleteTagRequest);
  }
  
  public com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply deleteShipment(com.cts.ptms.model.fedex.ws.ship.v17.DeleteShipmentRequest deleteShipmentRequest) throws java.rmi.RemoteException{
    if (shipPortType == null)
      _initShipPortTypeProxy();
    return shipPortType.deleteShipment(deleteShipmentRequest);
  }
  
  public com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply validateShipment(com.cts.ptms.model.fedex.ws.ship.v17.ValidateShipmentRequest validateShipmentRequest) throws java.rmi.RemoteException{
    if (shipPortType == null)
      _initShipPortTypeProxy();
    return shipPortType.validateShipment(validateShipmentRequest);
  }
  
  
}