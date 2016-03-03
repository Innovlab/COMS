/**
 * ShipmentLegRateDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cts.ptms.model.fedex.ws.ship.v17;


/**
 * Data for a single leg of a shipment's total/summary rates, as calculated
 * per a specific rate type.
 */
public class ShipmentLegRateDetail  implements java.io.Serializable {
    /* Human-readable text describing the shipment leg. */
    private java.lang.String legDescription;

    /* Origin for this leg. */
    private com.cts.ptms.model.fedex.ws.ship.v17.Address legOrigin;

    /* Specifies the location id the origin of shipment leg. */
    private java.lang.String legOriginLocationId;

    /* Destination for this leg. */
    private com.cts.ptms.model.fedex.ws.ship.v17.Address legDestination;

    /* Specifies the location id the destination of shipment leg. */
    private java.lang.String legDestinationLocationId;

    /* Type used for this specific set of rate data. */
    private com.cts.ptms.model.fedex.ws.ship.v17.ReturnedRateType rateType;

    /* Indicates the rate scale used. */
    private java.lang.String rateScale;

    /* Indicates the rate zone used (based on origin and destination). */
    private java.lang.String rateZone;

    private com.cts.ptms.model.fedex.ws.ship.v17.PricingCodeType pricingCode;

    /* Indicates which weight was used. */
    private com.cts.ptms.model.fedex.ws.ship.v17.RatedWeightMethod ratedWeightMethod;

    /* INTERNAL FEDEX USE ONLY. */
    private com.cts.ptms.model.fedex.ws.ship.v17.MinimumChargeType minimumChargeType;

    /* Specifies the currency exchange performed on financial amounts
     * for this rate. */
    private com.cts.ptms.model.fedex.ws.ship.v17.CurrencyExchangeRate currencyExchangeRate;

    /* Indicates which special rating cases applied to this shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.SpecialRatingAppliedType[] specialRatingApplied;

    private org.apache.axis.types.NonNegativeInteger dimDivisor;

    /* Identifies the type of dim divisor that was applied. */
    private com.cts.ptms.model.fedex.ws.ship.v17.RateDimensionalDivisorType dimDivisorType;

    private java.math.BigDecimal fuelSurchargePercent;

    private com.cts.ptms.model.fedex.ws.ship.v17.Weight totalBillingWeight;

    /* Sum of dimensional weights for all packages. */
    private com.cts.ptms.model.fedex.ws.ship.v17.Weight totalDimWeight;

    private com.cts.ptms.model.fedex.ws.ship.v17.Money totalBaseCharge;

    private com.cts.ptms.model.fedex.ws.ship.v17.Money totalFreightDiscounts;

    private com.cts.ptms.model.fedex.ws.ship.v17.Money totalNetFreight;

    private com.cts.ptms.model.fedex.ws.ship.v17.Money totalSurcharges;

    /* This shipment's totalNetFreight + totalSurcharges (not including
     * totalTaxes). */
    private com.cts.ptms.model.fedex.ws.ship.v17.Money totalNetFedExCharge;

    /* Total of the transportation-based taxes. */
    private com.cts.ptms.model.fedex.ws.ship.v17.Money totalTaxes;

    private com.cts.ptms.model.fedex.ws.ship.v17.Money totalNetCharge;

    private com.cts.ptms.model.fedex.ws.ship.v17.Money totalRebates;

    /* Total of all values under this shipment's dutiesAndTaxes; only
     * provided if estimated duties and taxes were calculated for this shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.Money totalDutiesAndTaxes;

    /* This shipment's totalNetCharge + totalDutiesAndTaxes; only
     * provided if estimated duties and taxes were calculated for this shipment
     * AND duties, taxes and transportation charges are all paid by the same
     * sender's account. */
    private com.cts.ptms.model.fedex.ws.ship.v17.Money totalNetChargeWithDutiesAndTaxes;

    /* Rate data specific to FedEx Freight and FedEx National Freight
     * services. */
    private com.cts.ptms.model.fedex.ws.ship.v17.FreightRateDetail freightRateDetail;

    /* All rate discounts that apply to this shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.RateDiscount[] freightDiscounts;

    /* All rebates that apply to this shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.Rebate[] rebates;

    /* All surcharges that apply to this shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.Surcharge[] surcharges;

    /* All transportation-based taxes applicable to this shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.Tax[] taxes;

    /* All commodity-based duties and taxes applicable to this shipment. */
    private com.cts.ptms.model.fedex.ws.ship.v17.EdtCommodityTax[] dutiesAndTaxes;

    /* The "order level" variable handling charges. */
    private com.cts.ptms.model.fedex.ws.ship.v17.VariableHandlingCharges variableHandlingCharges;

    /* The total of all variable handling charges at both shipment
     * (order) and package level. */
    private com.cts.ptms.model.fedex.ws.ship.v17.VariableHandlingCharges totalVariableHandlingCharges;

    public ShipmentLegRateDetail() {
    }

    public ShipmentLegRateDetail(
           java.lang.String legDescription,
           com.cts.ptms.model.fedex.ws.ship.v17.Address legOrigin,
           java.lang.String legOriginLocationId,
           com.cts.ptms.model.fedex.ws.ship.v17.Address legDestination,
           java.lang.String legDestinationLocationId,
           com.cts.ptms.model.fedex.ws.ship.v17.ReturnedRateType rateType,
           java.lang.String rateScale,
           java.lang.String rateZone,
           com.cts.ptms.model.fedex.ws.ship.v17.PricingCodeType pricingCode,
           com.cts.ptms.model.fedex.ws.ship.v17.RatedWeightMethod ratedWeightMethod,
           com.cts.ptms.model.fedex.ws.ship.v17.MinimumChargeType minimumChargeType,
           com.cts.ptms.model.fedex.ws.ship.v17.CurrencyExchangeRate currencyExchangeRate,
           com.cts.ptms.model.fedex.ws.ship.v17.SpecialRatingAppliedType[] specialRatingApplied,
           org.apache.axis.types.NonNegativeInteger dimDivisor,
           com.cts.ptms.model.fedex.ws.ship.v17.RateDimensionalDivisorType dimDivisorType,
           java.math.BigDecimal fuelSurchargePercent,
           com.cts.ptms.model.fedex.ws.ship.v17.Weight totalBillingWeight,
           com.cts.ptms.model.fedex.ws.ship.v17.Weight totalDimWeight,
           com.cts.ptms.model.fedex.ws.ship.v17.Money totalBaseCharge,
           com.cts.ptms.model.fedex.ws.ship.v17.Money totalFreightDiscounts,
           com.cts.ptms.model.fedex.ws.ship.v17.Money totalNetFreight,
           com.cts.ptms.model.fedex.ws.ship.v17.Money totalSurcharges,
           com.cts.ptms.model.fedex.ws.ship.v17.Money totalNetFedExCharge,
           com.cts.ptms.model.fedex.ws.ship.v17.Money totalTaxes,
           com.cts.ptms.model.fedex.ws.ship.v17.Money totalNetCharge,
           com.cts.ptms.model.fedex.ws.ship.v17.Money totalRebates,
           com.cts.ptms.model.fedex.ws.ship.v17.Money totalDutiesAndTaxes,
           com.cts.ptms.model.fedex.ws.ship.v17.Money totalNetChargeWithDutiesAndTaxes,
           com.cts.ptms.model.fedex.ws.ship.v17.FreightRateDetail freightRateDetail,
           com.cts.ptms.model.fedex.ws.ship.v17.RateDiscount[] freightDiscounts,
           com.cts.ptms.model.fedex.ws.ship.v17.Rebate[] rebates,
           com.cts.ptms.model.fedex.ws.ship.v17.Surcharge[] surcharges,
           com.cts.ptms.model.fedex.ws.ship.v17.Tax[] taxes,
           com.cts.ptms.model.fedex.ws.ship.v17.EdtCommodityTax[] dutiesAndTaxes,
           com.cts.ptms.model.fedex.ws.ship.v17.VariableHandlingCharges variableHandlingCharges,
           com.cts.ptms.model.fedex.ws.ship.v17.VariableHandlingCharges totalVariableHandlingCharges) {
           this.legDescription = legDescription;
           this.legOrigin = legOrigin;
           this.legOriginLocationId = legOriginLocationId;
           this.legDestination = legDestination;
           this.legDestinationLocationId = legDestinationLocationId;
           this.rateType = rateType;
           this.rateScale = rateScale;
           this.rateZone = rateZone;
           this.pricingCode = pricingCode;
           this.ratedWeightMethod = ratedWeightMethod;
           this.minimumChargeType = minimumChargeType;
           this.currencyExchangeRate = currencyExchangeRate;
           this.specialRatingApplied = specialRatingApplied;
           this.dimDivisor = dimDivisor;
           this.dimDivisorType = dimDivisorType;
           this.fuelSurchargePercent = fuelSurchargePercent;
           this.totalBillingWeight = totalBillingWeight;
           this.totalDimWeight = totalDimWeight;
           this.totalBaseCharge = totalBaseCharge;
           this.totalFreightDiscounts = totalFreightDiscounts;
           this.totalNetFreight = totalNetFreight;
           this.totalSurcharges = totalSurcharges;
           this.totalNetFedExCharge = totalNetFedExCharge;
           this.totalTaxes = totalTaxes;
           this.totalNetCharge = totalNetCharge;
           this.totalRebates = totalRebates;
           this.totalDutiesAndTaxes = totalDutiesAndTaxes;
           this.totalNetChargeWithDutiesAndTaxes = totalNetChargeWithDutiesAndTaxes;
           this.freightRateDetail = freightRateDetail;
           this.freightDiscounts = freightDiscounts;
           this.rebates = rebates;
           this.surcharges = surcharges;
           this.taxes = taxes;
           this.dutiesAndTaxes = dutiesAndTaxes;
           this.variableHandlingCharges = variableHandlingCharges;
           this.totalVariableHandlingCharges = totalVariableHandlingCharges;
    }


    /**
     * Gets the legDescription value for this ShipmentLegRateDetail.
     * 
     * @return legDescription   * Human-readable text describing the shipment leg.
     */
    public java.lang.String getLegDescription() {
        return legDescription;
    }


    /**
     * Sets the legDescription value for this ShipmentLegRateDetail.
     * 
     * @param legDescription   * Human-readable text describing the shipment leg.
     */
    public void setLegDescription(java.lang.String legDescription) {
        this.legDescription = legDescription;
    }


    /**
     * Gets the legOrigin value for this ShipmentLegRateDetail.
     * 
     * @return legOrigin   * Origin for this leg.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Address getLegOrigin() {
        return legOrigin;
    }


    /**
     * Sets the legOrigin value for this ShipmentLegRateDetail.
     * 
     * @param legOrigin   * Origin for this leg.
     */
    public void setLegOrigin(com.cts.ptms.model.fedex.ws.ship.v17.Address legOrigin) {
        this.legOrigin = legOrigin;
    }


    /**
     * Gets the legOriginLocationId value for this ShipmentLegRateDetail.
     * 
     * @return legOriginLocationId   * Specifies the location id the origin of shipment leg.
     */
    public java.lang.String getLegOriginLocationId() {
        return legOriginLocationId;
    }


    /**
     * Sets the legOriginLocationId value for this ShipmentLegRateDetail.
     * 
     * @param legOriginLocationId   * Specifies the location id the origin of shipment leg.
     */
    public void setLegOriginLocationId(java.lang.String legOriginLocationId) {
        this.legOriginLocationId = legOriginLocationId;
    }


    /**
     * Gets the legDestination value for this ShipmentLegRateDetail.
     * 
     * @return legDestination   * Destination for this leg.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Address getLegDestination() {
        return legDestination;
    }


    /**
     * Sets the legDestination value for this ShipmentLegRateDetail.
     * 
     * @param legDestination   * Destination for this leg.
     */
    public void setLegDestination(com.cts.ptms.model.fedex.ws.ship.v17.Address legDestination) {
        this.legDestination = legDestination;
    }


    /**
     * Gets the legDestinationLocationId value for this ShipmentLegRateDetail.
     * 
     * @return legDestinationLocationId   * Specifies the location id the destination of shipment leg.
     */
    public java.lang.String getLegDestinationLocationId() {
        return legDestinationLocationId;
    }


    /**
     * Sets the legDestinationLocationId value for this ShipmentLegRateDetail.
     * 
     * @param legDestinationLocationId   * Specifies the location id the destination of shipment leg.
     */
    public void setLegDestinationLocationId(java.lang.String legDestinationLocationId) {
        this.legDestinationLocationId = legDestinationLocationId;
    }


    /**
     * Gets the rateType value for this ShipmentLegRateDetail.
     * 
     * @return rateType   * Type used for this specific set of rate data.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.ReturnedRateType getRateType() {
        return rateType;
    }


    /**
     * Sets the rateType value for this ShipmentLegRateDetail.
     * 
     * @param rateType   * Type used for this specific set of rate data.
     */
    public void setRateType(com.cts.ptms.model.fedex.ws.ship.v17.ReturnedRateType rateType) {
        this.rateType = rateType;
    }


    /**
     * Gets the rateScale value for this ShipmentLegRateDetail.
     * 
     * @return rateScale   * Indicates the rate scale used.
     */
    public java.lang.String getRateScale() {
        return rateScale;
    }


    /**
     * Sets the rateScale value for this ShipmentLegRateDetail.
     * 
     * @param rateScale   * Indicates the rate scale used.
     */
    public void setRateScale(java.lang.String rateScale) {
        this.rateScale = rateScale;
    }


    /**
     * Gets the rateZone value for this ShipmentLegRateDetail.
     * 
     * @return rateZone   * Indicates the rate zone used (based on origin and destination).
     */
    public java.lang.String getRateZone() {
        return rateZone;
    }


    /**
     * Sets the rateZone value for this ShipmentLegRateDetail.
     * 
     * @param rateZone   * Indicates the rate zone used (based on origin and destination).
     */
    public void setRateZone(java.lang.String rateZone) {
        this.rateZone = rateZone;
    }


    /**
     * Gets the pricingCode value for this ShipmentLegRateDetail.
     * 
     * @return pricingCode
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.PricingCodeType getPricingCode() {
        return pricingCode;
    }


    /**
     * Sets the pricingCode value for this ShipmentLegRateDetail.
     * 
     * @param pricingCode
     */
    public void setPricingCode(com.cts.ptms.model.fedex.ws.ship.v17.PricingCodeType pricingCode) {
        this.pricingCode = pricingCode;
    }


    /**
     * Gets the ratedWeightMethod value for this ShipmentLegRateDetail.
     * 
     * @return ratedWeightMethod   * Indicates which weight was used.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.RatedWeightMethod getRatedWeightMethod() {
        return ratedWeightMethod;
    }


    /**
     * Sets the ratedWeightMethod value for this ShipmentLegRateDetail.
     * 
     * @param ratedWeightMethod   * Indicates which weight was used.
     */
    public void setRatedWeightMethod(com.cts.ptms.model.fedex.ws.ship.v17.RatedWeightMethod ratedWeightMethod) {
        this.ratedWeightMethod = ratedWeightMethod;
    }


    /**
     * Gets the minimumChargeType value for this ShipmentLegRateDetail.
     * 
     * @return minimumChargeType   * INTERNAL FEDEX USE ONLY.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.MinimumChargeType getMinimumChargeType() {
        return minimumChargeType;
    }


    /**
     * Sets the minimumChargeType value for this ShipmentLegRateDetail.
     * 
     * @param minimumChargeType   * INTERNAL FEDEX USE ONLY.
     */
    public void setMinimumChargeType(com.cts.ptms.model.fedex.ws.ship.v17.MinimumChargeType minimumChargeType) {
        this.minimumChargeType = minimumChargeType;
    }


    /**
     * Gets the currencyExchangeRate value for this ShipmentLegRateDetail.
     * 
     * @return currencyExchangeRate   * Specifies the currency exchange performed on financial amounts
     * for this rate.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.CurrencyExchangeRate getCurrencyExchangeRate() {
        return currencyExchangeRate;
    }


    /**
     * Sets the currencyExchangeRate value for this ShipmentLegRateDetail.
     * 
     * @param currencyExchangeRate   * Specifies the currency exchange performed on financial amounts
     * for this rate.
     */
    public void setCurrencyExchangeRate(com.cts.ptms.model.fedex.ws.ship.v17.CurrencyExchangeRate currencyExchangeRate) {
        this.currencyExchangeRate = currencyExchangeRate;
    }


    /**
     * Gets the specialRatingApplied value for this ShipmentLegRateDetail.
     * 
     * @return specialRatingApplied   * Indicates which special rating cases applied to this shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.SpecialRatingAppliedType[] getSpecialRatingApplied() {
        return specialRatingApplied;
    }


    /**
     * Sets the specialRatingApplied value for this ShipmentLegRateDetail.
     * 
     * @param specialRatingApplied   * Indicates which special rating cases applied to this shipment.
     */
    public void setSpecialRatingApplied(com.cts.ptms.model.fedex.ws.ship.v17.SpecialRatingAppliedType[] specialRatingApplied) {
        this.specialRatingApplied = specialRatingApplied;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.SpecialRatingAppliedType getSpecialRatingApplied(int i) {
        return this.specialRatingApplied[i];
    }

    public void setSpecialRatingApplied(int i, com.cts.ptms.model.fedex.ws.ship.v17.SpecialRatingAppliedType _value) {
        this.specialRatingApplied[i] = _value;
    }


    /**
     * Gets the dimDivisor value for this ShipmentLegRateDetail.
     * 
     * @return dimDivisor
     */
    public org.apache.axis.types.NonNegativeInteger getDimDivisor() {
        return dimDivisor;
    }


    /**
     * Sets the dimDivisor value for this ShipmentLegRateDetail.
     * 
     * @param dimDivisor
     */
    public void setDimDivisor(org.apache.axis.types.NonNegativeInteger dimDivisor) {
        this.dimDivisor = dimDivisor;
    }


    /**
     * Gets the dimDivisorType value for this ShipmentLegRateDetail.
     * 
     * @return dimDivisorType   * Identifies the type of dim divisor that was applied.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.RateDimensionalDivisorType getDimDivisorType() {
        return dimDivisorType;
    }


    /**
     * Sets the dimDivisorType value for this ShipmentLegRateDetail.
     * 
     * @param dimDivisorType   * Identifies the type of dim divisor that was applied.
     */
    public void setDimDivisorType(com.cts.ptms.model.fedex.ws.ship.v17.RateDimensionalDivisorType dimDivisorType) {
        this.dimDivisorType = dimDivisorType;
    }


    /**
     * Gets the fuelSurchargePercent value for this ShipmentLegRateDetail.
     * 
     * @return fuelSurchargePercent
     */
    public java.math.BigDecimal getFuelSurchargePercent() {
        return fuelSurchargePercent;
    }


    /**
     * Sets the fuelSurchargePercent value for this ShipmentLegRateDetail.
     * 
     * @param fuelSurchargePercent
     */
    public void setFuelSurchargePercent(java.math.BigDecimal fuelSurchargePercent) {
        this.fuelSurchargePercent = fuelSurchargePercent;
    }


    /**
     * Gets the totalBillingWeight value for this ShipmentLegRateDetail.
     * 
     * @return totalBillingWeight
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Weight getTotalBillingWeight() {
        return totalBillingWeight;
    }


    /**
     * Sets the totalBillingWeight value for this ShipmentLegRateDetail.
     * 
     * @param totalBillingWeight
     */
    public void setTotalBillingWeight(com.cts.ptms.model.fedex.ws.ship.v17.Weight totalBillingWeight) {
        this.totalBillingWeight = totalBillingWeight;
    }


    /**
     * Gets the totalDimWeight value for this ShipmentLegRateDetail.
     * 
     * @return totalDimWeight   * Sum of dimensional weights for all packages.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Weight getTotalDimWeight() {
        return totalDimWeight;
    }


    /**
     * Sets the totalDimWeight value for this ShipmentLegRateDetail.
     * 
     * @param totalDimWeight   * Sum of dimensional weights for all packages.
     */
    public void setTotalDimWeight(com.cts.ptms.model.fedex.ws.ship.v17.Weight totalDimWeight) {
        this.totalDimWeight = totalDimWeight;
    }


    /**
     * Gets the totalBaseCharge value for this ShipmentLegRateDetail.
     * 
     * @return totalBaseCharge
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Money getTotalBaseCharge() {
        return totalBaseCharge;
    }


    /**
     * Sets the totalBaseCharge value for this ShipmentLegRateDetail.
     * 
     * @param totalBaseCharge
     */
    public void setTotalBaseCharge(com.cts.ptms.model.fedex.ws.ship.v17.Money totalBaseCharge) {
        this.totalBaseCharge = totalBaseCharge;
    }


    /**
     * Gets the totalFreightDiscounts value for this ShipmentLegRateDetail.
     * 
     * @return totalFreightDiscounts
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Money getTotalFreightDiscounts() {
        return totalFreightDiscounts;
    }


    /**
     * Sets the totalFreightDiscounts value for this ShipmentLegRateDetail.
     * 
     * @param totalFreightDiscounts
     */
    public void setTotalFreightDiscounts(com.cts.ptms.model.fedex.ws.ship.v17.Money totalFreightDiscounts) {
        this.totalFreightDiscounts = totalFreightDiscounts;
    }


    /**
     * Gets the totalNetFreight value for this ShipmentLegRateDetail.
     * 
     * @return totalNetFreight
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Money getTotalNetFreight() {
        return totalNetFreight;
    }


    /**
     * Sets the totalNetFreight value for this ShipmentLegRateDetail.
     * 
     * @param totalNetFreight
     */
    public void setTotalNetFreight(com.cts.ptms.model.fedex.ws.ship.v17.Money totalNetFreight) {
        this.totalNetFreight = totalNetFreight;
    }


    /**
     * Gets the totalSurcharges value for this ShipmentLegRateDetail.
     * 
     * @return totalSurcharges
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Money getTotalSurcharges() {
        return totalSurcharges;
    }


    /**
     * Sets the totalSurcharges value for this ShipmentLegRateDetail.
     * 
     * @param totalSurcharges
     */
    public void setTotalSurcharges(com.cts.ptms.model.fedex.ws.ship.v17.Money totalSurcharges) {
        this.totalSurcharges = totalSurcharges;
    }


    /**
     * Gets the totalNetFedExCharge value for this ShipmentLegRateDetail.
     * 
     * @return totalNetFedExCharge   * This shipment's totalNetFreight + totalSurcharges (not including
     * totalTaxes).
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Money getTotalNetFedExCharge() {
        return totalNetFedExCharge;
    }


    /**
     * Sets the totalNetFedExCharge value for this ShipmentLegRateDetail.
     * 
     * @param totalNetFedExCharge   * This shipment's totalNetFreight + totalSurcharges (not including
     * totalTaxes).
     */
    public void setTotalNetFedExCharge(com.cts.ptms.model.fedex.ws.ship.v17.Money totalNetFedExCharge) {
        this.totalNetFedExCharge = totalNetFedExCharge;
    }


    /**
     * Gets the totalTaxes value for this ShipmentLegRateDetail.
     * 
     * @return totalTaxes   * Total of the transportation-based taxes.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Money getTotalTaxes() {
        return totalTaxes;
    }


    /**
     * Sets the totalTaxes value for this ShipmentLegRateDetail.
     * 
     * @param totalTaxes   * Total of the transportation-based taxes.
     */
    public void setTotalTaxes(com.cts.ptms.model.fedex.ws.ship.v17.Money totalTaxes) {
        this.totalTaxes = totalTaxes;
    }


    /**
     * Gets the totalNetCharge value for this ShipmentLegRateDetail.
     * 
     * @return totalNetCharge
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Money getTotalNetCharge() {
        return totalNetCharge;
    }


    /**
     * Sets the totalNetCharge value for this ShipmentLegRateDetail.
     * 
     * @param totalNetCharge
     */
    public void setTotalNetCharge(com.cts.ptms.model.fedex.ws.ship.v17.Money totalNetCharge) {
        this.totalNetCharge = totalNetCharge;
    }


    /**
     * Gets the totalRebates value for this ShipmentLegRateDetail.
     * 
     * @return totalRebates
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Money getTotalRebates() {
        return totalRebates;
    }


    /**
     * Sets the totalRebates value for this ShipmentLegRateDetail.
     * 
     * @param totalRebates
     */
    public void setTotalRebates(com.cts.ptms.model.fedex.ws.ship.v17.Money totalRebates) {
        this.totalRebates = totalRebates;
    }


    /**
     * Gets the totalDutiesAndTaxes value for this ShipmentLegRateDetail.
     * 
     * @return totalDutiesAndTaxes   * Total of all values under this shipment's dutiesAndTaxes; only
     * provided if estimated duties and taxes were calculated for this shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Money getTotalDutiesAndTaxes() {
        return totalDutiesAndTaxes;
    }


    /**
     * Sets the totalDutiesAndTaxes value for this ShipmentLegRateDetail.
     * 
     * @param totalDutiesAndTaxes   * Total of all values under this shipment's dutiesAndTaxes; only
     * provided if estimated duties and taxes were calculated for this shipment.
     */
    public void setTotalDutiesAndTaxes(com.cts.ptms.model.fedex.ws.ship.v17.Money totalDutiesAndTaxes) {
        this.totalDutiesAndTaxes = totalDutiesAndTaxes;
    }


    /**
     * Gets the totalNetChargeWithDutiesAndTaxes value for this ShipmentLegRateDetail.
     * 
     * @return totalNetChargeWithDutiesAndTaxes   * This shipment's totalNetCharge + totalDutiesAndTaxes; only
     * provided if estimated duties and taxes were calculated for this shipment
     * AND duties, taxes and transportation charges are all paid by the same
     * sender's account.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Money getTotalNetChargeWithDutiesAndTaxes() {
        return totalNetChargeWithDutiesAndTaxes;
    }


    /**
     * Sets the totalNetChargeWithDutiesAndTaxes value for this ShipmentLegRateDetail.
     * 
     * @param totalNetChargeWithDutiesAndTaxes   * This shipment's totalNetCharge + totalDutiesAndTaxes; only
     * provided if estimated duties and taxes were calculated for this shipment
     * AND duties, taxes and transportation charges are all paid by the same
     * sender's account.
     */
    public void setTotalNetChargeWithDutiesAndTaxes(com.cts.ptms.model.fedex.ws.ship.v17.Money totalNetChargeWithDutiesAndTaxes) {
        this.totalNetChargeWithDutiesAndTaxes = totalNetChargeWithDutiesAndTaxes;
    }


    /**
     * Gets the freightRateDetail value for this ShipmentLegRateDetail.
     * 
     * @return freightRateDetail   * Rate data specific to FedEx Freight and FedEx National Freight
     * services.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.FreightRateDetail getFreightRateDetail() {
        return freightRateDetail;
    }


    /**
     * Sets the freightRateDetail value for this ShipmentLegRateDetail.
     * 
     * @param freightRateDetail   * Rate data specific to FedEx Freight and FedEx National Freight
     * services.
     */
    public void setFreightRateDetail(com.cts.ptms.model.fedex.ws.ship.v17.FreightRateDetail freightRateDetail) {
        this.freightRateDetail = freightRateDetail;
    }


    /**
     * Gets the freightDiscounts value for this ShipmentLegRateDetail.
     * 
     * @return freightDiscounts   * All rate discounts that apply to this shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.RateDiscount[] getFreightDiscounts() {
        return freightDiscounts;
    }


    /**
     * Sets the freightDiscounts value for this ShipmentLegRateDetail.
     * 
     * @param freightDiscounts   * All rate discounts that apply to this shipment.
     */
    public void setFreightDiscounts(com.cts.ptms.model.fedex.ws.ship.v17.RateDiscount[] freightDiscounts) {
        this.freightDiscounts = freightDiscounts;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.RateDiscount getFreightDiscounts(int i) {
        return this.freightDiscounts[i];
    }

    public void setFreightDiscounts(int i, com.cts.ptms.model.fedex.ws.ship.v17.RateDiscount _value) {
        this.freightDiscounts[i] = _value;
    }


    /**
     * Gets the rebates value for this ShipmentLegRateDetail.
     * 
     * @return rebates   * All rebates that apply to this shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Rebate[] getRebates() {
        return rebates;
    }


    /**
     * Sets the rebates value for this ShipmentLegRateDetail.
     * 
     * @param rebates   * All rebates that apply to this shipment.
     */
    public void setRebates(com.cts.ptms.model.fedex.ws.ship.v17.Rebate[] rebates) {
        this.rebates = rebates;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.Rebate getRebates(int i) {
        return this.rebates[i];
    }

    public void setRebates(int i, com.cts.ptms.model.fedex.ws.ship.v17.Rebate _value) {
        this.rebates[i] = _value;
    }


    /**
     * Gets the surcharges value for this ShipmentLegRateDetail.
     * 
     * @return surcharges   * All surcharges that apply to this shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Surcharge[] getSurcharges() {
        return surcharges;
    }


    /**
     * Sets the surcharges value for this ShipmentLegRateDetail.
     * 
     * @param surcharges   * All surcharges that apply to this shipment.
     */
    public void setSurcharges(com.cts.ptms.model.fedex.ws.ship.v17.Surcharge[] surcharges) {
        this.surcharges = surcharges;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.Surcharge getSurcharges(int i) {
        return this.surcharges[i];
    }

    public void setSurcharges(int i, com.cts.ptms.model.fedex.ws.ship.v17.Surcharge _value) {
        this.surcharges[i] = _value;
    }


    /**
     * Gets the taxes value for this ShipmentLegRateDetail.
     * 
     * @return taxes   * All transportation-based taxes applicable to this shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.Tax[] getTaxes() {
        return taxes;
    }


    /**
     * Sets the taxes value for this ShipmentLegRateDetail.
     * 
     * @param taxes   * All transportation-based taxes applicable to this shipment.
     */
    public void setTaxes(com.cts.ptms.model.fedex.ws.ship.v17.Tax[] taxes) {
        this.taxes = taxes;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.Tax getTaxes(int i) {
        return this.taxes[i];
    }

    public void setTaxes(int i, com.cts.ptms.model.fedex.ws.ship.v17.Tax _value) {
        this.taxes[i] = _value;
    }


    /**
     * Gets the dutiesAndTaxes value for this ShipmentLegRateDetail.
     * 
     * @return dutiesAndTaxes   * All commodity-based duties and taxes applicable to this shipment.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.EdtCommodityTax[] getDutiesAndTaxes() {
        return dutiesAndTaxes;
    }


    /**
     * Sets the dutiesAndTaxes value for this ShipmentLegRateDetail.
     * 
     * @param dutiesAndTaxes   * All commodity-based duties and taxes applicable to this shipment.
     */
    public void setDutiesAndTaxes(com.cts.ptms.model.fedex.ws.ship.v17.EdtCommodityTax[] dutiesAndTaxes) {
        this.dutiesAndTaxes = dutiesAndTaxes;
    }

    public com.cts.ptms.model.fedex.ws.ship.v17.EdtCommodityTax getDutiesAndTaxes(int i) {
        return this.dutiesAndTaxes[i];
    }

    public void setDutiesAndTaxes(int i, com.cts.ptms.model.fedex.ws.ship.v17.EdtCommodityTax _value) {
        this.dutiesAndTaxes[i] = _value;
    }


    /**
     * Gets the variableHandlingCharges value for this ShipmentLegRateDetail.
     * 
     * @return variableHandlingCharges   * The "order level" variable handling charges.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.VariableHandlingCharges getVariableHandlingCharges() {
        return variableHandlingCharges;
    }


    /**
     * Sets the variableHandlingCharges value for this ShipmentLegRateDetail.
     * 
     * @param variableHandlingCharges   * The "order level" variable handling charges.
     */
    public void setVariableHandlingCharges(com.cts.ptms.model.fedex.ws.ship.v17.VariableHandlingCharges variableHandlingCharges) {
        this.variableHandlingCharges = variableHandlingCharges;
    }


    /**
     * Gets the totalVariableHandlingCharges value for this ShipmentLegRateDetail.
     * 
     * @return totalVariableHandlingCharges   * The total of all variable handling charges at both shipment
     * (order) and package level.
     */
    public com.cts.ptms.model.fedex.ws.ship.v17.VariableHandlingCharges getTotalVariableHandlingCharges() {
        return totalVariableHandlingCharges;
    }


    /**
     * Sets the totalVariableHandlingCharges value for this ShipmentLegRateDetail.
     * 
     * @param totalVariableHandlingCharges   * The total of all variable handling charges at both shipment
     * (order) and package level.
     */
    public void setTotalVariableHandlingCharges(com.cts.ptms.model.fedex.ws.ship.v17.VariableHandlingCharges totalVariableHandlingCharges) {
        this.totalVariableHandlingCharges = totalVariableHandlingCharges;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentLegRateDetail)) return false;
        ShipmentLegRateDetail other = (ShipmentLegRateDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.legDescription==null && other.getLegDescription()==null) || 
             (this.legDescription!=null &&
              this.legDescription.equals(other.getLegDescription()))) &&
            ((this.legOrigin==null && other.getLegOrigin()==null) || 
             (this.legOrigin!=null &&
              this.legOrigin.equals(other.getLegOrigin()))) &&
            ((this.legOriginLocationId==null && other.getLegOriginLocationId()==null) || 
             (this.legOriginLocationId!=null &&
              this.legOriginLocationId.equals(other.getLegOriginLocationId()))) &&
            ((this.legDestination==null && other.getLegDestination()==null) || 
             (this.legDestination!=null &&
              this.legDestination.equals(other.getLegDestination()))) &&
            ((this.legDestinationLocationId==null && other.getLegDestinationLocationId()==null) || 
             (this.legDestinationLocationId!=null &&
              this.legDestinationLocationId.equals(other.getLegDestinationLocationId()))) &&
            ((this.rateType==null && other.getRateType()==null) || 
             (this.rateType!=null &&
              this.rateType.equals(other.getRateType()))) &&
            ((this.rateScale==null && other.getRateScale()==null) || 
             (this.rateScale!=null &&
              this.rateScale.equals(other.getRateScale()))) &&
            ((this.rateZone==null && other.getRateZone()==null) || 
             (this.rateZone!=null &&
              this.rateZone.equals(other.getRateZone()))) &&
            ((this.pricingCode==null && other.getPricingCode()==null) || 
             (this.pricingCode!=null &&
              this.pricingCode.equals(other.getPricingCode()))) &&
            ((this.ratedWeightMethod==null && other.getRatedWeightMethod()==null) || 
             (this.ratedWeightMethod!=null &&
              this.ratedWeightMethod.equals(other.getRatedWeightMethod()))) &&
            ((this.minimumChargeType==null && other.getMinimumChargeType()==null) || 
             (this.minimumChargeType!=null &&
              this.minimumChargeType.equals(other.getMinimumChargeType()))) &&
            ((this.currencyExchangeRate==null && other.getCurrencyExchangeRate()==null) || 
             (this.currencyExchangeRate!=null &&
              this.currencyExchangeRate.equals(other.getCurrencyExchangeRate()))) &&
            ((this.specialRatingApplied==null && other.getSpecialRatingApplied()==null) || 
             (this.specialRatingApplied!=null &&
              java.util.Arrays.equals(this.specialRatingApplied, other.getSpecialRatingApplied()))) &&
            ((this.dimDivisor==null && other.getDimDivisor()==null) || 
             (this.dimDivisor!=null &&
              this.dimDivisor.equals(other.getDimDivisor()))) &&
            ((this.dimDivisorType==null && other.getDimDivisorType()==null) || 
             (this.dimDivisorType!=null &&
              this.dimDivisorType.equals(other.getDimDivisorType()))) &&
            ((this.fuelSurchargePercent==null && other.getFuelSurchargePercent()==null) || 
             (this.fuelSurchargePercent!=null &&
              this.fuelSurchargePercent.equals(other.getFuelSurchargePercent()))) &&
            ((this.totalBillingWeight==null && other.getTotalBillingWeight()==null) || 
             (this.totalBillingWeight!=null &&
              this.totalBillingWeight.equals(other.getTotalBillingWeight()))) &&
            ((this.totalDimWeight==null && other.getTotalDimWeight()==null) || 
             (this.totalDimWeight!=null &&
              this.totalDimWeight.equals(other.getTotalDimWeight()))) &&
            ((this.totalBaseCharge==null && other.getTotalBaseCharge()==null) || 
             (this.totalBaseCharge!=null &&
              this.totalBaseCharge.equals(other.getTotalBaseCharge()))) &&
            ((this.totalFreightDiscounts==null && other.getTotalFreightDiscounts()==null) || 
             (this.totalFreightDiscounts!=null &&
              this.totalFreightDiscounts.equals(other.getTotalFreightDiscounts()))) &&
            ((this.totalNetFreight==null && other.getTotalNetFreight()==null) || 
             (this.totalNetFreight!=null &&
              this.totalNetFreight.equals(other.getTotalNetFreight()))) &&
            ((this.totalSurcharges==null && other.getTotalSurcharges()==null) || 
             (this.totalSurcharges!=null &&
              this.totalSurcharges.equals(other.getTotalSurcharges()))) &&
            ((this.totalNetFedExCharge==null && other.getTotalNetFedExCharge()==null) || 
             (this.totalNetFedExCharge!=null &&
              this.totalNetFedExCharge.equals(other.getTotalNetFedExCharge()))) &&
            ((this.totalTaxes==null && other.getTotalTaxes()==null) || 
             (this.totalTaxes!=null &&
              this.totalTaxes.equals(other.getTotalTaxes()))) &&
            ((this.totalNetCharge==null && other.getTotalNetCharge()==null) || 
             (this.totalNetCharge!=null &&
              this.totalNetCharge.equals(other.getTotalNetCharge()))) &&
            ((this.totalRebates==null && other.getTotalRebates()==null) || 
             (this.totalRebates!=null &&
              this.totalRebates.equals(other.getTotalRebates()))) &&
            ((this.totalDutiesAndTaxes==null && other.getTotalDutiesAndTaxes()==null) || 
             (this.totalDutiesAndTaxes!=null &&
              this.totalDutiesAndTaxes.equals(other.getTotalDutiesAndTaxes()))) &&
            ((this.totalNetChargeWithDutiesAndTaxes==null && other.getTotalNetChargeWithDutiesAndTaxes()==null) || 
             (this.totalNetChargeWithDutiesAndTaxes!=null &&
              this.totalNetChargeWithDutiesAndTaxes.equals(other.getTotalNetChargeWithDutiesAndTaxes()))) &&
            ((this.freightRateDetail==null && other.getFreightRateDetail()==null) || 
             (this.freightRateDetail!=null &&
              this.freightRateDetail.equals(other.getFreightRateDetail()))) &&
            ((this.freightDiscounts==null && other.getFreightDiscounts()==null) || 
             (this.freightDiscounts!=null &&
              java.util.Arrays.equals(this.freightDiscounts, other.getFreightDiscounts()))) &&
            ((this.rebates==null && other.getRebates()==null) || 
             (this.rebates!=null &&
              java.util.Arrays.equals(this.rebates, other.getRebates()))) &&
            ((this.surcharges==null && other.getSurcharges()==null) || 
             (this.surcharges!=null &&
              java.util.Arrays.equals(this.surcharges, other.getSurcharges()))) &&
            ((this.taxes==null && other.getTaxes()==null) || 
             (this.taxes!=null &&
              java.util.Arrays.equals(this.taxes, other.getTaxes()))) &&
            ((this.dutiesAndTaxes==null && other.getDutiesAndTaxes()==null) || 
             (this.dutiesAndTaxes!=null &&
              java.util.Arrays.equals(this.dutiesAndTaxes, other.getDutiesAndTaxes()))) &&
            ((this.variableHandlingCharges==null && other.getVariableHandlingCharges()==null) || 
             (this.variableHandlingCharges!=null &&
              this.variableHandlingCharges.equals(other.getVariableHandlingCharges()))) &&
            ((this.totalVariableHandlingCharges==null && other.getTotalVariableHandlingCharges()==null) || 
             (this.totalVariableHandlingCharges!=null &&
              this.totalVariableHandlingCharges.equals(other.getTotalVariableHandlingCharges())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLegDescription() != null) {
            _hashCode += getLegDescription().hashCode();
        }
        if (getLegOrigin() != null) {
            _hashCode += getLegOrigin().hashCode();
        }
        if (getLegOriginLocationId() != null) {
            _hashCode += getLegOriginLocationId().hashCode();
        }
        if (getLegDestination() != null) {
            _hashCode += getLegDestination().hashCode();
        }
        if (getLegDestinationLocationId() != null) {
            _hashCode += getLegDestinationLocationId().hashCode();
        }
        if (getRateType() != null) {
            _hashCode += getRateType().hashCode();
        }
        if (getRateScale() != null) {
            _hashCode += getRateScale().hashCode();
        }
        if (getRateZone() != null) {
            _hashCode += getRateZone().hashCode();
        }
        if (getPricingCode() != null) {
            _hashCode += getPricingCode().hashCode();
        }
        if (getRatedWeightMethod() != null) {
            _hashCode += getRatedWeightMethod().hashCode();
        }
        if (getMinimumChargeType() != null) {
            _hashCode += getMinimumChargeType().hashCode();
        }
        if (getCurrencyExchangeRate() != null) {
            _hashCode += getCurrencyExchangeRate().hashCode();
        }
        if (getSpecialRatingApplied() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialRatingApplied());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecialRatingApplied(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDimDivisor() != null) {
            _hashCode += getDimDivisor().hashCode();
        }
        if (getDimDivisorType() != null) {
            _hashCode += getDimDivisorType().hashCode();
        }
        if (getFuelSurchargePercent() != null) {
            _hashCode += getFuelSurchargePercent().hashCode();
        }
        if (getTotalBillingWeight() != null) {
            _hashCode += getTotalBillingWeight().hashCode();
        }
        if (getTotalDimWeight() != null) {
            _hashCode += getTotalDimWeight().hashCode();
        }
        if (getTotalBaseCharge() != null) {
            _hashCode += getTotalBaseCharge().hashCode();
        }
        if (getTotalFreightDiscounts() != null) {
            _hashCode += getTotalFreightDiscounts().hashCode();
        }
        if (getTotalNetFreight() != null) {
            _hashCode += getTotalNetFreight().hashCode();
        }
        if (getTotalSurcharges() != null) {
            _hashCode += getTotalSurcharges().hashCode();
        }
        if (getTotalNetFedExCharge() != null) {
            _hashCode += getTotalNetFedExCharge().hashCode();
        }
        if (getTotalTaxes() != null) {
            _hashCode += getTotalTaxes().hashCode();
        }
        if (getTotalNetCharge() != null) {
            _hashCode += getTotalNetCharge().hashCode();
        }
        if (getTotalRebates() != null) {
            _hashCode += getTotalRebates().hashCode();
        }
        if (getTotalDutiesAndTaxes() != null) {
            _hashCode += getTotalDutiesAndTaxes().hashCode();
        }
        if (getTotalNetChargeWithDutiesAndTaxes() != null) {
            _hashCode += getTotalNetChargeWithDutiesAndTaxes().hashCode();
        }
        if (getFreightRateDetail() != null) {
            _hashCode += getFreightRateDetail().hashCode();
        }
        if (getFreightDiscounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreightDiscounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreightDiscounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRebates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRebates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRebates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSurcharges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSurcharges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSurcharges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDutiesAndTaxes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDutiesAndTaxes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDutiesAndTaxes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVariableHandlingCharges() != null) {
            _hashCode += getVariableHandlingCharges().hashCode();
        }
        if (getTotalVariableHandlingCharges() != null) {
            _hashCode += getTotalVariableHandlingCharges().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentLegRateDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ShipmentLegRateDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LegDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LegOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legOriginLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LegOriginLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legDestination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LegDestination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legDestinationLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "LegDestinationLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "ReturnedRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateScale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RateScale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RateZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PricingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "PricingCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratedWeightMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RatedWeightMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RatedWeightMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumChargeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "MinimumChargeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "MinimumChargeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CurrencyExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "CurrencyExchangeRate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialRatingApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SpecialRatingApplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "SpecialRatingAppliedType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimDivisor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DimDivisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimDivisorType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DimDivisorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RateDimensionalDivisorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuelSurchargePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FuelSurchargePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBillingWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TotalBillingWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDimWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TotalDimWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBaseCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TotalBaseCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFreightDiscounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TotalFreightDiscounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNetFreight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TotalNetFreight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSurcharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TotalSurcharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNetFedExCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TotalNetFedExCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TotalTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNetCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TotalNetCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRebates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TotalRebates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDutiesAndTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TotalDutiesAndTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNetChargeWithDutiesAndTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TotalNetChargeWithDutiesAndTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightRateDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightRateDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightRateDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightDiscounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "FreightDiscounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "RateDiscount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rebates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Rebates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Rebate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surcharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Surcharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Surcharge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Taxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "Tax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dutiesAndTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "DutiesAndTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "EdtCommodityTax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableHandlingCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "VariableHandlingCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "VariableHandlingCharges"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalVariableHandlingCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "TotalVariableHandlingCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v17", "VariableHandlingCharges"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
