/**
 * ShipServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cts.ptms.model.fedex.ws.ship.v17;

public class ShipServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.cts.ptms.model.fedex.ws.ship.v17.ShipPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processTag");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ProcessTagRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ProcessTagRequest"), com.cts.ptms.model.fedex.ws.ship.v17.ProcessTagRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ProcessTagReply"));
        oper.setReturnClass(com.cts.ptms.model.fedex.ws.ship.v17.ProcessTagReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ProcessTagReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ProcessShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ProcessShipmentRequest"), com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ProcessShipmentReply"));
        oper.setReturnClass(com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ProcessShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteTag");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DeleteTagRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DeleteTagRequest"), com.cts.ptms.model.fedex.ws.ship.v17.DeleteTagRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentReply"));
        oper.setReturnClass(com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DeleteShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DeleteShipmentRequest"), com.cts.ptms.model.fedex.ws.ship.v17.DeleteShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentReply"));
        oper.setReturnClass(com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ValidateShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ValidateShipmentRequest"), com.cts.ptms.model.fedex.ws.ship.v17.ValidateShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentReply"));
        oper.setReturnClass(com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public ShipServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ShipServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ShipServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
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
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "AccessorRoleType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.AccessorRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "AdditionalLabelsDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.AdditionalLabelsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "AdditionalLabelsType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.AdditionalLabelsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Address");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "AdrLicenseDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.AdrLicenseDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "AlcoholDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.AlcoholDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "AlcoholRecipientType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.AlcoholRecipientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "AssociatedShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.AssociatedShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "AssociatedShipmentType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.AssociatedShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "B13AFilingOptionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.B13AFilingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "BarcodeSymbologyType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.BarcodeSymbologyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "BinaryBarcode");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.BinaryBarcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "BinaryBarcodeType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.BinaryBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "BrokerDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.BrokerDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "BrokerType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.BrokerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CarrierCodeType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CarrierCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CertificateOfOriginDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CertificateOfOriginDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ChargeBasisLevelType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ChargeBasisLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ClearanceBrokerageType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ClearanceBrokerageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ClientDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ClientDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CodAddTransportationChargeBasisType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CodAddTransportationChargeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CodAddTransportationChargesDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CodAddTransportationChargesDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CodAdjustmentType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CodAdjustmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CodCollectionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CodCollectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CodDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CodDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CodReturnPackageDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CodReturnPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CodReturnReferenceIndicatorType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CodReturnReferenceIndicatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CommercialInvoice");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CommercialInvoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CommercialInvoiceDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CommercialInvoiceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Commodity");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Commodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedCodDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CompletedCodDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedEtdDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CompletedEtdDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedHazardousPackageDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CompletedHazardousPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedHazardousShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CompletedHazardousShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedHazardousSummaryDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CompletedHazardousSummaryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedHoldAtLocationDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CompletedHoldAtLocationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedPackageDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CompletedPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CompletedShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedSmartPostDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CompletedSmartPostDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CompletedTagDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CompletedTagDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ConfigurableLabelReferenceEntry");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ConfigurableLabelReferenceEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Contact");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ContactAndAddress");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ContactAndAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ContentRecord");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ContentRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CurrencyExchangeRate");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CurrencyExchangeRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomDeliveryWindowDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomDeliveryWindowDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomDeliveryWindowType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomDeliveryWindowType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomDocumentDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomDocumentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomerImageUsage");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomerImageUsage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomerImageUsageType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomerImageUsageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomerReference");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomerReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomerReferenceType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomerReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomerSpecifiedLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomerSpecifiedLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomerSpecifiedLabelGenerationOptionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomerSpecifiedLabelGenerationOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomLabelBarcodeEntry");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomLabelBarcodeEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomLabelBoxEntry");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomLabelBoxEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomLabelCoordinateUnits");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomLabelCoordinateUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomLabelGraphicEntry");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomLabelGraphicEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomLabelPosition");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomLabelPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomLabelTextBoxEntry");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomLabelTextBoxEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomLabelTextEntry");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomLabelTextEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomsClearanceDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomsClearanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomsDeclarationStatementDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomsDeclarationStatementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomsDeclarationStatementType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomsDeclarationStatementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomsOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomsOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomsOptionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomsOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CustomsRoleType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.CustomsRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DangerousGoodsAccessibilityType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DangerousGoodsAccessibilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DangerousGoodsContainer");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DangerousGoodsContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DangerousGoodsDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DangerousGoodsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DangerousGoodsPackingOptionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DangerousGoodsPackingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DangerousGoodsShippersDeclarationDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DangerousGoodsShippersDeclarationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DangerousGoodsSignatory");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DangerousGoodsSignatory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DateRange");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DayOfWeekType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DayOfWeekType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DeleteShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DeleteShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DeleteTagRequest");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DeleteTagRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DeletionControlType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DeletionControlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DeliveryOnInvoiceAcceptanceDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DeliveryOnInvoiceAcceptanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DestinationControlDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DestinationControlDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DestinationControlStatementType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DestinationControlStatementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Dimensions");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Dimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DocTabContent");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DocTabContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DocTabContentBarcoded");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DocTabContentBarcoded.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DocTabContentType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DocTabContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DocTabContentZone001");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DocTabZoneSpecification[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DocTabZoneSpecification");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DocTabZoneSpecifications");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DocTabZoneJustificationType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DocTabZoneJustificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DocTabZoneSpecification");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DocTabZoneSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DocumentFormatOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DocumentFormatOptionType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DocumentFormatOptionType");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Options");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DocumentFormatOptionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DocumentFormatOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DropoffType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DropoffType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EdtCommodityTax");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.EdtCommodityTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EdtExciseCondition");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.EdtExciseCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EdtRequestType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.EdtRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EdtTaxDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.EdtTaxDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EdtTaxType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.EdtTaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EMailLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.EMailLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EMailNotificationAggregationType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationAggregationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EMailNotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
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
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EMailNotificationEventType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EMailNotificationFormatType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EMailNotificationRecipient");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EMailNotificationRecipientType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.EMailNotificationRecipientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EmailOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.EmailOptionType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EmailOptionType");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Options");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EmailOptionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.EmailOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EMailRecipient");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.EMailRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EtdDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.EtdDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ExportDeclarationDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ExportDeclarationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ExportDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ExportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ExpressFreightDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ExpressFreightDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FedExLocationType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.FedExLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightAddressLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.FreightAddressLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightBaseCharge");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.FreightBaseCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightBaseChargeCalculationType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.FreightBaseChargeCalculationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightChargeBasisType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.FreightChargeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightClassType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.FreightClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightCollectTermsType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.FreightCollectTermsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightGuaranteeDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.FreightGuaranteeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightGuaranteeType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.FreightGuaranteeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightOnValueType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.FreightOnValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightRateDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.FreightRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightRateNotation");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.FreightRateNotation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightRateQuoteType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.FreightRateQuoteType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.FreightShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightShipmentLineItem");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.FreightShipmentLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightShipmentRoleType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.FreightShipmentRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightSpecialServicePayment");
            cachedSerQNames.add(qName);
           // cls = com.cts.ptms.model.fedex.ws.ship.v17.FreightSpecialServicePayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "GeneralAgencyAgreementDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.GeneralAgencyAgreementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "GroundDeliveryEligibilityType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.GroundDeliveryEligibilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousCommodityAttributeType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousCommodityContent");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousCommodityDescription");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousCommodityDescriptionProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityDescriptionProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousCommodityInnerReceptacleDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityInnerReceptacleDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousCommodityLabelTextOptionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityLabelTextOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousCommodityOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousCommodityOptionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousCommodityPackagingDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityPackagingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousCommodityPackingDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityPackingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousCommodityPackingGroupType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityPackingGroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousCommodityQuantityDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityQuantityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousCommodityQuantityType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityQuantityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousCommodityRegulationType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HazardousCommodityRegulationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HazardousContainerPackingType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HazardousContainerPackingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HoldAtLocationDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HoldAtLocationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HomeDeliveryPremiumDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HomeDeliveryPremiumDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "HomeDeliveryPremiumType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.HomeDeliveryPremiumType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ImageId");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ImageId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "InternationalControlledExportDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.InternationalControlledExportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "InternationalControlledExportType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.InternationalControlledExportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "InternationalDocumentContentType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.InternationalDocumentContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "InternationalTrafficInArmsRegulationsDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.InternationalTrafficInArmsRegulationsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LabelFormatType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.LabelFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LabelMaskableDataType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.LabelMaskableDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LabelOrderType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.LabelOrderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LabelPrintingOrientationType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.LabelPrintingOrientationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LabelRotationType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.LabelRotationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LabelSpecification");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.LabelSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LabelStockType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.LabelStockType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LiabilityCoverageDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.LiabilityCoverageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LiabilityCoverageType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.LiabilityCoverageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LicenseOrPermitDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.LicenseOrPermitDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LinearMeasure");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.LinearMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LinearUnits");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.LinearUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Localization");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Localization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Measure");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Measure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "MinimumChargeType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.MinimumChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Money");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Money.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "NaftaCertificateOfOriginDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.NaftaCertificateOfOriginDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "NaftaCommodityDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.NaftaCommodityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "NaftaImporterSpecificationType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.NaftaImporterSpecificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "NaftaLowValueStatementDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.NaftaLowValueStatementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "NaftaNetCostMethodCode");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.NaftaNetCostMethodCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "NaftaPreferenceCriterionCode");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.NaftaPreferenceCriterionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "NaftaProducer");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.NaftaProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "NaftaProducerDeterminationCode");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.NaftaProducerDeterminationCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "NaftaProducerSpecificationType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.NaftaProducerSpecificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "NetExplosiveClassificationType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.NetExplosiveClassificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "NetExplosiveDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.NetExplosiveDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Notification");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Notification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "NotificationParameter");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.NotificationParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "NotificationSeverityType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.NotificationSeverityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Op900Detail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Op900Detail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "OperationalInstruction");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.OperationalInstruction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "OversizeClassType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.OversizeClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PackageBarcodes");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PackageBarcodes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PackageOperationalDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PackageOperationalDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PackageRateDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PackageRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PackageRating");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PackageRating.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PackageSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PackageSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PackageSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PackageSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PackagingType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PageQuadrantType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PageQuadrantType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Party");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Party.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Payment");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Payment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PaymentType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Payor");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Payor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PendingShipmentAccessDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentAccessorDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PendingShipmentAccessorDetail");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "AccessorDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PendingShipmentAccessorDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentAccessorDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
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
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PendingShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PendingShipmentProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentProcessingOptionType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PendingShipmentProcessingOptionType");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Options");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PendingShipmentProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PendingShipmentType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PendingShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PhysicalFormType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PhysicalFormType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PhysicalPackagingType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PhysicalPackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PickupDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PickupDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PickupRequestSourceType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PickupRequestSourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PickupRequestType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PickupRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PricingCodeType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PricingCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PrintedReference");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PrintedReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PrintedReferenceType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PrintedReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PriorityAlertDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PriorityAlertDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PriorityAlertEnhancementType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PriorityAlertEnhancementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ProcessShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ProcessShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ProcessTagReply");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ProcessTagReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ProcessTagRequest");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ProcessTagRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PurposeOfShipmentType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.PurposeOfShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RadioactiveContainerClassType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RadioactiveContainerClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RadioactiveLabelType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RadioactiveLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RadioactivityDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RadioactivityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RadioactivityUnitOfMeasure");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RadioactivityUnitOfMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RadionuclideActivity");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RadionuclideActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RadionuclideDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RadionuclideDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RateDimensionalDivisorType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RateDimensionalDivisorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RateDiscount");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RateDiscount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RateDiscountType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RateDiscountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RatedWeightMethod");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RatedWeightMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RateElementBasisType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RateElementBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RateRequestType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RateTypeBasisType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RateTypeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Rebate");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Rebate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RebateType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RebateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RecipientCustomsId");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RecipientCustomsId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RecipientCustomsIdType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RecipientCustomsIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RecommendedDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RecommendedDocumentType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RecommendedDocumentType");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Types");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RecommendedDocumentType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RecommendedDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RegulatoryControlType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RegulatoryControlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RegulatoryLabelContentDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RegulatoryLabelContentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RegulatoryLabelType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RegulatoryLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RelativeVerticalPositionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RelativeVerticalPositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RequestedPackageLineItem");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RequestedPackageLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RequestedShipment");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RequestedShipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RequestedShippingDocumentType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RequestedShippingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ReturnAssociationDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ReturnAssociationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ReturnedRateType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ReturnedRateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ReturnedShippingDocumentType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ReturnedShippingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ReturnEMailAllowedSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ReturnEMailAllowedSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ReturnEMailDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ReturnEMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ReturnInstructionsDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ReturnInstructionsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ReturnShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ReturnShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ReturnType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ReturnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Rma");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Rma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RotationType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.RotationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SecondaryBarcodeType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.SecondaryBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ServiceType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentConfigurationData");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.DangerousGoodsDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DangerousGoodsDetail");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DangerousGoodsPackageConfigurations");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentDryIceDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShipmentDryIceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentLegRateDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShipmentLegRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentManifestDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShipmentManifestDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentOperationalDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShipmentOperationalDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentRateDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShipmentRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentRating");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShipmentRating.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShipmentSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShipmentSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocument");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentDispositionDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentDispositionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentDispositionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentDispositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentEMailDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentEMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentEMailGroupingType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentEMailGroupingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentEMailRecipient");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentEMailRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentFormat");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentGroupingType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentGroupingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentImageType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentPart");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentPart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentPrintDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentPrintDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShippingDocumentStockType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ShippingDocumentStockType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SignatureOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.SignatureOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SignatureOptionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.SignatureOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SmartPostAncillaryEndorsementType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.SmartPostAncillaryEndorsementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SmartPostIndiciaType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.SmartPostIndiciaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SmartPostShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.SmartPostShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SmartPostShipmentProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.SmartPostShipmentProcessingOptionType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SmartPostShipmentProcessingOptionType");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Options");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SmartPostShipmentProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.SmartPostShipmentProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SpecialRatingAppliedType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.SpecialRatingAppliedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "StringBarcode");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.StringBarcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "StringBarcodeType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.StringBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Surcharge");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Surcharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SurchargeLevelType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.SurchargeLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SurchargeType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.SurchargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Tax");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Tax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TaxesOrMiscellaneousChargeType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.TaxesOrMiscellaneousChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TaxpayerIdentification");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.TaxpayerIdentification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TaxType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.TaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TinType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.TinType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TrackingId");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.TrackingId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TrackingIdType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.TrackingIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings3() {
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
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TransactionDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.TransactionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TransitTimeType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.TransitTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "UploadDocumentIdProducer");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.UploadDocumentIdProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "UploadDocumentProducerType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.UploadDocumentProducerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "UploadDocumentReferenceDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.UploadDocumentReferenceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "UploadDocumentType");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.UploadDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ValidatedHazardousCommodityContent");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ValidatedHazardousCommodityContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ValidatedHazardousCommodityDescription");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ValidatedHazardousCommodityDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ValidatedHazardousContainer");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ValidatedHazardousContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ValidateShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.ValidateShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "VariableHandlingChargeDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.VariableHandlingChargeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "VariableHandlingCharges");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.VariableHandlingCharges.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "VersionId");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.VersionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Volume");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Volume.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "VolumeUnits");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.VolumeUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "WebAuthenticationCredential");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.WebAuthenticationCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "WebAuthenticationDetail");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.WebAuthenticationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Weight");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.Weight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "WeightUnits");
            cachedSerQNames.add(qName);
            cls = com.cts.ptms.model.fedex.ws.ship.v17.WeightUnits.class;
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

    public com.cts.ptms.model.fedex.ws.ship.v17.ProcessTagReply processTag(com.cts.ptms.model.fedex.ws.ship.v17.ProcessTagRequest processTagRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/ship/v17/processTag");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processTag"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processTagRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.cts.ptms.model.fedex.ws.ship.v17.ProcessTagReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.cts.ptms.model.fedex.ws.ship.v17.ProcessTagReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.cts.ptms.model.fedex.ws.ship.v17.ProcessTagReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentReply processShipment(com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentRequest processShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/ship/v17/processShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.cts.ptms.model.fedex.ws.ship.v17.ProcessShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply deleteTag(com.cts.ptms.model.fedex.ws.ship.v17.DeleteTagRequest deleteTagRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/ship/v17/deleteTag");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteTag"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteTagRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply deleteShipment(com.cts.ptms.model.fedex.ws.ship.v17.DeleteShipmentRequest deleteShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/ship/v17/deleteShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply validateShipment(com.cts.ptms.model.fedex.ws.ship.v17.ValidateShipmentRequest validateShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/ship/v17/validateShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "validateShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {validateShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.cts.ptms.model.fedex.ws.ship.v17.ShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
