/**
 * TrackServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cts.ptms.model.fedex.ws.track.v10;

public class TrackServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.cts.ptms.model.fedex.ws.track.v10.TrackPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveSignatureProofOfDeliveryLetter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureProofOfDeliveryLetterRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureProofOfDeliveryLetterRequest"), com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryLetterRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureProofOfDeliveryLetterReply"));
        oper.setReturnClass(com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryLetterReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureProofOfDeliveryLetterReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("track");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackRequest"), com.cts.ptms.model.fedex.ws.track.v10.TrackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackReply"));
        oper.setReturnClass(com.cts.ptms.model.fedex.ws.track.v10.TrackReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendSignatureProofOfDeliveryFax");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureProofOfDeliveryFaxRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureProofOfDeliveryFaxRequest"), com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryFaxRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureProofOfDeliveryFaxReply"));
        oper.setReturnClass(com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryFaxReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureProofOfDeliveryFaxReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendNotifications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SendNotificationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SendNotificationsRequest"), com.cts.ptms.model.fedex.ws.track.v10.SendNotificationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SendNotificationsReply"));
        oper.setReturnClass(com.cts.ptms.model.fedex.ws.track.v10.SendNotificationsReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SendNotificationsReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public TrackServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TrackServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TrackServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Address");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "AppointmentDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.AppointmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "AppointmentTimeDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.AppointmentTimeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "AppointmentWindowType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.AppointmentWindowType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ArrivalLocationType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.ArrivalLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "AvailableImageType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.AvailableImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "CarrierCodeType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.CarrierCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ClientDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.ClientDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Commodity");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.Commodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "CompletedTrackDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.CompletedTrackDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Contact");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ContactAndAddress");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.ContactAndAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ContentRecord");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.ContentRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "CustomerExceptionRequestDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.CustomerExceptionRequestDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "CustomsOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.CustomsOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "CustomsOptionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.CustomsOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DateRange");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DeliveryOptionEligibilityDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.DeliveryOptionEligibilityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DeliveryOptionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.DeliveryOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Dimensions");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.Dimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Distance");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.Distance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DistanceUnits");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.DistanceUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "EdtExciseCondition");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.EdtExciseCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "EligibilityType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.EligibilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "EMailNotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.EMailNotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "EMailNotificationEventType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.EMailNotificationEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "EMailNotificationFormatType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.EMailNotificationFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "EMailNotificationRecipient");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.EMailNotificationRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "EMailNotificationRecipientType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.EMailNotificationRecipientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "FedExLocationType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.FedExLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "LinearUnits");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.LinearUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Localization");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.Localization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "LocalTimeRange");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.LocalTimeRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Measure");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.Measure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Money");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.Money.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "NaftaCommodityDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.NaftaCommodityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "NaftaNetCostMethodCode");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.NaftaNetCostMethodCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "NaftaPreferenceCriterionCode");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.NaftaPreferenceCriterionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "NaftaProducerDeterminationCode");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.NaftaProducerDeterminationCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Notification");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.Notification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "NotificationParameter");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.NotificationParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "NotificationSeverityType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.NotificationSeverityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "OfficeOrderDeliveryMethodType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.OfficeOrderDeliveryMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "OperatingCompanyType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.OperatingCompanyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "PackagingType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.PackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "PagingDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.PagingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "PieceCountLocationType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.PieceCountLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "PieceCountVerificationDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.PieceCountVerificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "QualifiedTrackingNumber");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.QualifiedTrackingNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SendNotificationsReply");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.SendNotificationsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SendNotificationsRequest");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.SendNotificationsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ServiceType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureImageDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.SignatureImageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureProofOfDeliveryFaxReply");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryFaxReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureProofOfDeliveryFaxRequest");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryFaxRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureProofOfDeliveryImageType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureProofOfDeliveryLetterReply");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryLetterReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureProofOfDeliveryLetterRequest");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryLetterRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SpecialInstructionsStatusCode");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.SpecialInstructionsStatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SpecialInstructionStatusDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.SpecialInstructionStatusDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "StringBarcode");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.StringBarcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "StringBarcodeType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.StringBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackAdvanceNotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackAdvanceNotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackAdvanceNotificationStatusType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackAdvanceNotificationStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackChargeDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackChargeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackChargeDetailType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackChargeDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackDeliveryLocationType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackDeliveryLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackDeliveryOptionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackDeliveryOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackDetailAttributeType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackDetailAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackEvent");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackNotificationPackage");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackNotificationPackage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackNotificationRecipientDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.EMailNotificationEventType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "EMailNotificationEventType");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "NotificationEventsAvailable");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackOtherIdentifierDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackOtherIdentifierDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackPackageIdentifier");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackPackageIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackPaymentType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackPaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackPossessionStatusType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackPossessionStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackReconciliation");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackReconciliation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackReply");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackRequest");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackRequestProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackRequestProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackReturnDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackReturnDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackReturnLabelType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackReturnLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackReturnMovementStatusType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackReturnMovementStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackSelectionDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackSelectionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackServiceDescriptionDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackServiceDescriptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackSpecialHandling");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackSpecialHandling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackSpecialHandlingType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackSpecialHandlingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackSpecialInstruction");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackSpecialInstruction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackSplitShipmentPart");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackSplitShipmentPart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackStatusAncillaryDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackStatusAncillaryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackStatusDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TrackStatusDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TransactionDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.TransactionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "VersionId");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.VersionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "WebAuthenticationCredential");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.WebAuthenticationCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "WebAuthenticationDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.WebAuthenticationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Weight");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.Weight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "WeightUnits");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.track.v10.WeightUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryLetterReply retrieveSignatureProofOfDeliveryLetter(com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryLetterRequest signatureProofOfDeliveryLetterRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/track/v10/retrieveSignatureProofOfDeliveryLetter");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrieveSignatureProofOfDeliveryLetter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {signatureProofOfDeliveryLetterRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryLetterReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryLetterReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryLetterReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.cts.ptms.model.fedex.ws.track.v10.TrackReply track(com.cts.ptms.model.fedex.ws.track.v10.TrackRequest trackRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/track/v10/track");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "track"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {trackRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.cts.ptms.model.fedex.ws.track.v10.TrackReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.cts.ptms.model.fedex.ws.track.v10.TrackReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.cts.ptms.model.fedex.ws.track.v10.TrackReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryFaxReply sendSignatureProofOfDeliveryFax(com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryFaxRequest signatureProofOfDeliveryFaxRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/track/v10/sendSignatureProofOfDeliveryFax");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sendSignatureProofOfDeliveryFax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {signatureProofOfDeliveryFaxRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryFaxReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryFaxReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.cts.ptms.model.fedex.ws.track.v10.SignatureProofOfDeliveryFaxReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.cts.ptms.model.fedex.ws.track.v10.SendNotificationsReply sendNotifications(com.cts.ptms.model.fedex.ws.track.v10.SendNotificationsRequest sendNotificationsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/track/v10/sendNotifications");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sendNotifications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sendNotificationsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.cts.ptms.model.fedex.ws.track.v10.SendNotificationsReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.cts.ptms.model.fedex.ws.track.v10.SendNotificationsReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.cts.ptms.model.fedex.ws.track.v10.SendNotificationsReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
