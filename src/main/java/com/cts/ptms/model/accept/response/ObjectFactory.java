//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.27 at 04:44:35 PM CST 
//


package com.cts.ptms.model.accept.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ups.gen.shipment.accept.response package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TotalCharges_QNAME = new QName("", "TotalCharges");
    private final static QName _GraphicImage_QNAME = new QName("", "GraphicImage");
    private final static QName _ErrorLocationAttributeName_QNAME = new QName("", "ErrorLocationAttributeName");
    private final static QName _ControlLogReceipt_QNAME = new QName("", "ControlLogReceipt");
    private final static QName _HTMLImage_QNAME = new QName("", "HTMLImage");
    private final static QName _ServiceOptionsCharges_QNAME = new QName("", "ServiceOptionsCharges");
    private final static QName _Code_QNAME = new QName("", "Code");
    private final static QName _ErrorDigest_QNAME = new QName("", "ErrorDigest");
    private final static QName _ErrorSeverity_QNAME = new QName("", "ErrorSeverity");
    private final static QName _ResponseStatusCode_QNAME = new QName("", "ResponseStatusCode");
    private final static QName _Image_QNAME = new QName("", "Image");
    private final static QName _ErrorLocationElementReference_QNAME = new QName("", "ErrorLocationElementReference");
    private final static QName _TaxCharges_QNAME = new QName("", "TaxCharges");
    private final static QName _MinimumRetrySeconds_QNAME = new QName("", "MinimumRetrySeconds");
    private final static QName _TransportationCharges_QNAME = new QName("", "TransportationCharges");
    private final static QName _ImageFormat_QNAME = new QName("", "ImageFormat");
    private final static QName _Description_QNAME = new QName("", "Description");
    private final static QName _InternationalSignatureGraphicImage_QNAME = new QName("", "InternationalSignatureGraphicImage");
    private final static QName _CurrencyCode_QNAME = new QName("", "CurrencyCode");
    private final static QName _ItemizedCharges_QNAME = new QName("", "ItemizedCharges");
    private final static QName _UnitOfMeasurement_QNAME = new QName("", "UnitOfMeasurement");
    private final static QName _TotalChargesWithTaxes_QNAME = new QName("", "TotalChargesWithTaxes");
    private final static QName _MonetaryValue_QNAME = new QName("", "MonetaryValue");
    private final static QName _ErrorDescription_QNAME = new QName("", "ErrorDescription");
    private final static QName _TrackingNumber_QNAME = new QName("", "TrackingNumber");
    private final static QName _PDF417_QNAME = new QName("", "PDF417");
    private final static QName _ResponseStatusDescription_QNAME = new QName("", "ResponseStatusDescription");
    private final static QName _ErrorCode_QNAME = new QName("", "ErrorCode");
    private final static QName _ErrorLocationElementName_QNAME = new QName("", "ErrorLocationElementName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ups.gen.shipment.accept.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MonetaryType }
     * 
     */
    public MonetaryType createMonetaryType() {
        return new MonetaryType();
    }

    /**
     * Create an instance of {@link ImageType }
     * 
     */
    public ImageType createImageType() {
        return new ImageType();
    }

    /**
     * Create an instance of {@link ShipmentResults }
     * 
     */
    public ShipmentResults createShipmentResults() {
        return new ShipmentResults();
    }

    /**
     * Create an instance of {@link ShipmentCharges }
     * 
     */
    public ShipmentCharges createShipmentCharges() {
        return new ShipmentCharges();
    }

    /**
     * Create an instance of {@link TaxChargeType }
     * 
     */
    public TaxChargeType createTaxChargeType() {
        return new TaxChargeType();
    }

    /**
     * Create an instance of {@link NegotiatedRates }
     * 
     */
    public NegotiatedRates createNegotiatedRates() {
        return new NegotiatedRates();
    }

    /**
     * Create an instance of {@link NetSummaryCharges }
     * 
     */
    public NetSummaryCharges createNetSummaryCharges() {
        return new NetSummaryCharges();
    }

    /**
     * Create an instance of {@link GrandTotal }
     * 
     */
    public GrandTotal createGrandTotal() {
        return new GrandTotal();
    }

    /**
     * Create an instance of {@link BillingWeight }
     * 
     */
    public BillingWeight createBillingWeight() {
        return new BillingWeight();
    }

    /**
     * Create an instance of {@link CodeType }
     * 
     */
    public CodeType createCodeType() {
        return new CodeType();
    }

    /**
     * Create an instance of {@link DisclaimerType }
     * 
     */
    public DisclaimerType createDisclaimerType() {
        return new DisclaimerType();
    }

    /**
     * Create an instance of {@link PackageResults }
     * 
     */
    public PackageResults createPackageResults() {
        return new PackageResults();
    }

    /**
     * Create an instance of {@link LabelImage }
     * 
     */
    public LabelImage createLabelImage() {
        return new LabelImage();
    }

    /**
     * Create an instance of {@link LabelImageFormat }
     * 
     */
    public LabelImageFormat createLabelImageFormat() {
        return new LabelImageFormat();
    }

    /**
     * Create an instance of {@link Receipt }
     * 
     */
    public Receipt createReceipt() {
        return new Receipt();
    }

    /**
     * Create an instance of {@link IntlForms }
     * 
     */
    public IntlForms createIntlForms() {
        return new IntlForms();
    }

    /**
     * Create an instance of {@link Accessorial }
     * 
     */
    public Accessorial createAccessorial() {
        return new Accessorial();
    }

    /**
     * Create an instance of {@link CODImageType }
     * 
     */
    public CODImageType createCODImageType() {
        return new CODImageType();
    }

    /**
     * Create an instance of {@link HighValueReportType }
     * 
     */
    public HighValueReportType createHighValueReportType() {
        return new HighValueReportType();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link TransactionReference }
     * 
     */
    public TransactionReference createTransactionReference() {
        return new TransactionReference();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link ErrorLocation }
     * 
     */
    public ErrorLocation createErrorLocation() {
        return new ErrorLocation();
    }

    /**
     * Create an instance of {@link ShipmentAcceptResponse }
     * 
     */
    public ShipmentAcceptResponse createShipmentAcceptResponse() {
        return new ShipmentAcceptResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalCharges")
    public JAXBElement<MonetaryType> createTotalCharges(MonetaryType value) {
        return new JAXBElement<MonetaryType>(_TotalCharges_QNAME, MonetaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GraphicImage")
    public JAXBElement<String> createGraphicImage(String value) {
        return new JAXBElement<String>(_GraphicImage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ErrorLocationAttributeName")
    public JAXBElement<String> createErrorLocationAttributeName(String value) {
        return new JAXBElement<String>(_ErrorLocationAttributeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ControlLogReceipt")
    public JAXBElement<ImageType> createControlLogReceipt(ImageType value) {
        return new JAXBElement<ImageType>(_ControlLogReceipt_QNAME, ImageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HTMLImage")
    public JAXBElement<String> createHTMLImage(String value) {
        return new JAXBElement<String>(_HTMLImage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ServiceOptionsCharges")
    public JAXBElement<MonetaryType> createServiceOptionsCharges(MonetaryType value) {
        return new JAXBElement<MonetaryType>(_ServiceOptionsCharges_QNAME, MonetaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Code")
    public JAXBElement<String> createCode(String value) {
        return new JAXBElement<String>(_Code_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ErrorDigest")
    public JAXBElement<String> createErrorDigest(String value) {
        return new JAXBElement<String>(_ErrorDigest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ErrorSeverity")
    public JAXBElement<String> createErrorSeverity(String value) {
        return new JAXBElement<String>(_ErrorSeverity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ResponseStatusCode")
    public JAXBElement<String> createResponseStatusCode(String value) {
        return new JAXBElement<String>(_ResponseStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Image")
    public JAXBElement<ImageType> createImage(ImageType value) {
        return new JAXBElement<ImageType>(_Image_QNAME, ImageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ErrorLocationElementReference")
    public JAXBElement<String> createErrorLocationElementReference(String value) {
        return new JAXBElement<String>(_ErrorLocationElementReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxChargeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TaxCharges")
    public JAXBElement<TaxChargeType> createTaxCharges(TaxChargeType value) {
        return new JAXBElement<TaxChargeType>(_TaxCharges_QNAME, TaxChargeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MinimumRetrySeconds")
    public JAXBElement<String> createMinimumRetrySeconds(String value) {
        return new JAXBElement<String>(_MinimumRetrySeconds_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TransportationCharges")
    public JAXBElement<MonetaryType> createTransportationCharges(MonetaryType value) {
        return new JAXBElement<MonetaryType>(_TransportationCharges_QNAME, MonetaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ImageFormat")
    public JAXBElement<CodeType> createImageFormat(CodeType value) {
        return new JAXBElement<CodeType>(_ImageFormat_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InternationalSignatureGraphicImage")
    public JAXBElement<String> createInternationalSignatureGraphicImage(String value) {
        return new JAXBElement<String>(_InternationalSignatureGraphicImage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CurrencyCode")
    public JAXBElement<String> createCurrencyCode(String value) {
        return new JAXBElement<String>(_CurrencyCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ItemizedCharges")
    public JAXBElement<MonetaryType> createItemizedCharges(MonetaryType value) {
        return new JAXBElement<MonetaryType>(_ItemizedCharges_QNAME, MonetaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UnitOfMeasurement")
    public JAXBElement<CodeType> createUnitOfMeasurement(CodeType value) {
        return new JAXBElement<CodeType>(_UnitOfMeasurement_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalChargesWithTaxes")
    public JAXBElement<MonetaryType> createTotalChargesWithTaxes(MonetaryType value) {
        return new JAXBElement<MonetaryType>(_TotalChargesWithTaxes_QNAME, MonetaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MonetaryValue")
    public JAXBElement<String> createMonetaryValue(String value) {
        return new JAXBElement<String>(_MonetaryValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ErrorDescription")
    public JAXBElement<String> createErrorDescription(String value) {
        return new JAXBElement<String>(_ErrorDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TrackingNumber")
    public JAXBElement<String> createTrackingNumber(String value) {
        return new JAXBElement<String>(_TrackingNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PDF417")
    public JAXBElement<String> createPDF417(String value) {
        return new JAXBElement<String>(_PDF417_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ResponseStatusDescription")
    public JAXBElement<String> createResponseStatusDescription(String value) {
        return new JAXBElement<String>(_ResponseStatusDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ErrorCode")
    public JAXBElement<String> createErrorCode(String value) {
        return new JAXBElement<String>(_ErrorCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ErrorLocationElementName")
    public JAXBElement<String> createErrorLocationElementName(String value) {
        return new JAXBElement<String>(_ErrorLocationElementName_QNAME, String.class, null, value);
    }

}
