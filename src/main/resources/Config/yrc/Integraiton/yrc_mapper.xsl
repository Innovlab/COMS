<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:exsl="http://exslt.org/common"
	extension-element-prefixes="exsl">

	<xsl:template match="/">
		<xsl:variable name="shipper" select="//ADDRESS[Class='RETURN']" />		                                                        
		<xsl:variable name="shipTo" select="//ADDRESS[Class='DELIVER_TO']" />
		<xsl:variable name="orderBy" select="//ADDRESS[Class='ORDERED_BY']" />
		<xsl:variable name="shipmentItem" select="//ITEM" />
		<soapenv:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:yrc="http://my.yrc.com/national/WebServices/2009/01/31/YRCSecureBOL.wsdl"
			xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/">
			<soapenv:Header />
			<soapenv:Body>
				<yrc:submitBOL soapenv:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
					<UsernameToken xsi:type="yrc:Credentials"
						xmlns:yrc="http://my.yrc.com/national/WebServices/2009/01/31/YRCCommonTypes.xsd">
						<Username xsi:type="xsd:string">mganesh</Username>
						<Password xsi:type="xsd:string">project1</Password>
					</UsernameToken>
					<submitBOLRequest xsi:type="yrc:submitBOLRequest"
						xmlns:yrc="http://my.yrc.com/national/WebServices/2009/01/31/YRCBolMessages.xsd">
						<bolDetail xsi:type="yrc1:BoLDetail"
							xmlns:yrc1="http://my.yrc.com/national/WebServices/2009/01/31/YRCBoLTypes.xsd">
							<pickupDate xsi:type="xsd:string">
								<xsl:value-of select="//SHIP_UNIT/DatePlannedShipment/text()" />
							</pickupDate>
							<role xsi:type="yrc1:Roles">SH</role>
							<autoSchedulePickup>false</autoSchedulePickup>
							<autoEmailBOL>false</autoEmailBOL>
							<!--Optional: -->
							<autoEmailBOLaddress xsi:type="xsd:string">test@yrcw.com</autoEmailBOLaddress>
							<paymentTerms xsi:type="yrc1:Terms">P</paymentTerms>
							<originAddressSameAsShipper>false</originAddressSameAsShipper>
						</bolDetail>
						<shipper xsi:type="yrc1:Customer"
							xmlns:yrc1="http://my.yrc.com/national/WebServices/2009/01/31/YRCBoLTypes.xsd">
							<companyName xsi:type="xsd:string">
								<xsl:value-of select="exsl:node-set($shipper)/IndividualName/text()" />
							</companyName>
							<address xsi:type="xsd:string">
								<xsl:value-of select="exsl:node-set($shipper)/Address1/text()" />
							</address>
							<city xsi:type="xsd:string">
								<xsl:value-of select="exsl:node-set($shipper)/City/text()" />
							</city>
							<state xsi:type="xsd:string">
								<xsl:value-of select="exsl:node-set($shipper)//State/text()" />
							</state>
							<zip xsi:type="xsd:string">
								<xsl:value-of select="exsl:node-set($shipper)/ZIPCode/text()" />
							</zip>
							<country xsi:type="yrc1:countryCodeList">
							<xsl:value-of select="exsl:node-set($shipper)/Country/text()" />
							</country>
							<phoneNumber xsi:type="xsd:string"></phoneNumber>
							<businessID xsi:type="xsd:string" />
						</shipper>
						<consignee xsi:type="yrc1:Customer"
							xmlns:yrc1="http://my.yrc.com/national/WebServices/2009/01/31/YRCBoLTypes.xsd">
							<companyName xsi:type="xsd:string">																	 
								<xsl:value-of select="exsl:node-set($shipTo)/IndividualName/text()" />
							</companyName>
							<address xsi:type="xsd:string">
								<xsl:value-of select="exsl:node-set($shipTo)/Address1/text()" />
							</address>
							<city xsi:type="xsd:string">
								<xsl:value-of select="exsl:node-set($shipTo)/City/text()" />
							</city>
							<state xsi:type="xsd:string">
								<xsl:value-of select="exsl:node-set($shipTo)//State/text()" />
							</state>
							<zip xsi:type="xsd:string">
								<xsl:value-of select="exsl:node-set($shipTo)/ZIPCode/text()" />
							</zip>
							<country xsi:type="yrc1:countryCodeList">
							<xsl:value-of select="exsl:node-set($shipTo)/Country/text()" />
							</country>							
							
							<storeNumber xsi:type="xsd:string">21</storeNumber>
							<contactName xsi:type="xsd:string">
								<xsl:value-of select="exsl:node-set($shipTo)/IndividualName/text()" />
							</contactName>
							<phoneNumber xsi:type="xsd:string">
							<xsl:value-of select="exsl:node-set($shipTo)/PhoneNumber/text()" />
							</phoneNumber>
						</consignee>
						<shipFrom xsi:type="yrc1:Customer"
							xmlns:yrc1="http://my.yrc.com/national/WebServices/2009/01/31/YRCBoLTypes.xsd">
							<companyName xsi:type="xsd:string">
								<xsl:value-of select="exsl:node-set($orderBy)/IndividualName/text()" />
							</companyName>
							<address xsi:type="xsd:string">
								<xsl:value-of select="exsl:node-set($orderBy)/Address1/text()" />
							</address>
							<city xsi:type="xsd:string">
								<xsl:value-of select="exsl:node-set($orderBy)/City/text()" />
							</city>
							<state xsi:type="xsd:string">
								<xsl:value-of select="exsl:node-set($orderBy)//State/text()" />
							</state>
							<zip xsi:type="xsd:string">
								<xsl:value-of select="exsl:node-set($orderBy)/ZIPCode/text()" />
							</zip>
							<country xsi:type="yrc1:countryCodeList">
							<xsl:value-of select="exsl:node-set(orderBy)/Country/text()" />
							</country>	
							<phoneNumber xsi:type="xsd:string">
							<xsl:value-of select="exsl:node-set($orderBy)/PhoneNumber/text()" />
							</phoneNumber>
							
							<businessID xsi:type="xsd:string" />
						</shipFrom>
						<commodityInformation xsi:type="yrc1:CommodityInformation"
							xmlns:yrc1="http://my.yrc.com/national/WebServices/2009/01/31/YRCBoLTypes.xsd">
							<weightTypeIdentifier xsi:type="yrc1:WeightTypes">LB</weightTypeIdentifier>
						</commodityInformation>
						<commodityItem xsi:type="yrc1:CommodityArray"
							soapenc:arrayType="yrc1:CommodityItem[]"
							xmlns:yrc1="http://my.yrc.com/national/WebServices/2009/01/31/YRCBoLTypes.xsd">
							<xsl:for-each select="//ITEM">
							
							<!--1 to 20 repetitions: -->
							<item xsi:type="yrc1:CommodityItem">
								<totalWeight xsi:type="xsd:string">
									<xsl:value-of select="//SHIP_UNIT/Weight/text()" />
								</totalWeight>
								<!--Optional: -->
								<handlingUnitQuantity xsi:type="xsd:string">
									<xsl:value-of select="Quantity" />
								</handlingUnitQuantity>
								<!--Optional: -->
								<handlingUnitType xsi:type="yrc1:HandlingUnitTypes">SKD</handlingUnitType>
								<!--Optional: -->
								<packageQuantity xsi:type="xsd:string">
								<xsl:value-of select="Quantity" />
								</packageQuantity>
								<!--Optional: -->
								<packageUnitType xsi:type="yrc1:HandlingUnitTypes">BOX</packageUnitType>
								<!--Optional: -->
								<productDesc xsi:type="xsd:string">
								<xsl:value-of select="Description" />
								</productDesc>								
								<!--Optional: -->
								<freightClass xsi:type="yrc1:FreightClassTypes">60</freightClass>
								<isHazardous>false</isHazardous>
							</item>
							</xsl:for-each>
						</commodityItem>
						<!--Optional: -->
						<referenceNumbers xsi:type="yrc1:ReferenceNumberArray"
							soapenc:arrayType="yrc1:ReferenceNumber[]"
							xmlns:yrc1="http://my.yrc.com/national/WebServices/2009/01/31/YRCBoLTypes.xsd">
							<!--0 to 20 repetitions: -->
							<item xsi:type="yrc1:ReferenceNumber">
								<refNumber xsi:type="xsd:string">
								<xsl:value-of select="//CarrierReferenceNote"/>
								</refNumber>
								<refNumberType xsi:type="yrc1:ReferenceNumberTypes">BM</refNumberType>
								<!--Optional: -->
								<storeNumber xsi:type="xsd:string">32</storeNumber>
								<deptNumber xsi:type="xsd:string">563</deptNumber>
								<pieces xsi:type="xsd:string">3</pieces>
							</item>
						</referenceNumbers>
						<!--Optional: -->
						<specialInstuctions xsi:type="yrc1:SpecialInstructions"
							xmlns:yrc1="http://my.yrc.com/national/WebServices/2009/01/31/YRCBoLTypes.xsd">
							<dockInstructions>my dock instructions</dockInstructions>
						</specialInstuctions>
						<!--Optional: -->
						<cod xsi:type="yrc1:COD"
							xmlns:yrc1="http://my.yrc.com/national/WebServices/2009/01/31/YRCBoLTypes.xsd">
							<codAmount xsi:type="xsd:string">125.44</codAmount>
							<!--Optional: -->
							<codCurrency xsi:type="yrc1:CurrencyTypes">USD</codCurrency>
							<customerCheckOk>true</customerCheckOk>
							<!--Optional: -->
							<codFee xsi:type="yrc1:Terms">P</codFee>
						</cod>
						<!--Optional: -->
						<serviceOptions xsi:type="yrc1:ServiceOptionsArray"
							soapenc:arrayType="yrc1:ServiceOption[]"
							xmlns:yrc1="http://my.yrc.com/national/WebServices/2009/01/31/YRCBoLTypes.xsd">
							<!--0 to 20 repetitions: -->
							<item xsi:type="yrc1:ServiceOption">
								<serviceOptionType xsi:type="yrc1:ServiceOptionType">LFTD</serviceOptionType>
								<serviceOptionPaymentTerms xsi:type="yrc1:Terms">P</serviceOptionPaymentTerms>
							</item>
						</serviceOptions>
						<!--Optional: -->
						<deliveryServiceOptions xsi:type="yrc1:DeliveryServiceOptions"
							xmlns:yrc1="http://my.yrc.com/national/WebServices/2009/01/31/YRCBoLTypes.xsd">
							<deliveryServiceOption xsi:type="yrc1:DeliveryServiceTypes">LTL</deliveryServiceOption>
						</deliveryServiceOptions>
						<!--Optional: -->						
						
						<!--Optional: -->
						<bolLabelPDF xsi:type="yrc1:BolLabelPDF"
							xmlns:yrc1="http://my.yrc.com/national/WebServices/2009/01/31/YRCBoLTypes.xsd">
							<generateBolPDF>true</generateBolPDF>
							<bolDocumentType xsi:type="yrc1:BolDocumentType">STD</bolDocumentType>
							<generateShippingLabelsPDF>true</generateShippingLabelsPDF>
							<numberOfLabelsPerShipment xsi:type="xsd:string">1</numberOfLabelsPerShipment>
							<labelStartingPosition xsi:type="xsd:string">1</labelStartingPosition>
							<labelFormat xsi:type="yrc1:LabelFormat">AVERY_5164</labelFormat>
							<generateProLabelsPDF>true</generateProLabelsPDF>
							<proLabelBorders>true</proLabelBorders>
							<proLabelsPerPage xsi:type="xsd:string">5</proLabelsPerPage>
						</bolLabelPDF>
					</submitBOLRequest>
				</yrc:submitBOL>
			</soapenv:Body>
		</soapenv:Envelope>
	</xsl:template>
</xsl:stylesheet>
