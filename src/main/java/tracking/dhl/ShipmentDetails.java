//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.24 ʱ�� 03:31:48 PM CST 
//


package tracking.dhl;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ShipmentDetails complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ShipmentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfPieces" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Pieces" type="{http://www.dhl.com/datatypes}Pieces"/>
 *         &lt;element name="Weight" type="{http://www.dhl.com/datatypes}Weight"/>
 *         &lt;element name="WeightUnit" type="{http://www.dhl.com/datatypes}WeightUnit"/>
 *         &lt;element name="ProductCode" type="{http://www.dhl.com/datatypes}ProductCode" minOccurs="0"/>
 *         &lt;element name="GlobalProductCode" type="{http://www.dhl.com/datatypes}ProductCode"/>
 *         &lt;element name="LocalProductCode" type="{http://www.dhl.com/datatypes}LocalProductCode" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.dhl.com/datatypes}Date"/>
 *         &lt;element name="Contents" type="{http://www.dhl.com/datatypes}ShipmentContents" minOccurs="0"/>
 *         &lt;element name="DoorTo" type="{http://www.dhl.com/datatypes}DoorTo" minOccurs="0"/>
 *         &lt;element name="DimensionUnit" type="{http://www.dhl.com/datatypes}DimensionUnit" minOccurs="0"/>
 *         &lt;element name="InsuredAmount" type="{http://www.dhl.com/datatypes}Money" minOccurs="0"/>
 *         &lt;element name="PackageType" type="{http://www.dhl.com/datatypes}PackageType" minOccurs="0"/>
 *         &lt;element name="IsDutiable" type="{http://www.dhl.com/datatypes}YesNo" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.dhl.com/datatypes}CurrencyCode"/>
 *         &lt;element name="CustData" type="{http://www.dhl.com/datatypes}CustData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentDetails", propOrder = {
    "numberOfPieces",
    "pieces",
    "weight",
    "weightUnit",
    "productCode",
    "globalProductCode",
    "localProductCode",
    "date",
    "contents",
    "doorTo",
    "dimensionUnit",
    "insuredAmount",
    "packageType",
    "isDutiable",
    "currencyCode",
    "custData"
})
public class ShipmentDetails {

    @XmlElement(name = "NumberOfPieces", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfPieces;
    @XmlElement(name = "Pieces", required = true)
    protected Pieces pieces;
    @XmlElement(name = "Weight", required = true)
    protected BigDecimal weight;
    @XmlElement(name = "WeightUnit", required = true)
    @XmlSchemaType(name = "string")
    protected WeightUnit weightUnit;
    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "GlobalProductCode", required = true)
    protected String globalProductCode;
    @XmlElement(name = "LocalProductCode")
    protected String localProductCode;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Contents")
    protected String contents;
    @XmlElement(name = "DoorTo")
    @XmlSchemaType(name = "string")
    protected DoorTo doorTo;
    @XmlElement(name = "DimensionUnit")
    @XmlSchemaType(name = "string")
    protected DimensionUnit dimensionUnit;
    @XmlElement(name = "InsuredAmount")
    protected Float insuredAmount;
    @XmlElement(name = "PackageType")
    @XmlSchemaType(name = "string")
    protected PackageType packageType;
    @XmlElement(name = "IsDutiable")
    @XmlSchemaType(name = "string")
    protected YesNo isDutiable;
    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;
    @XmlElement(name = "CustData")
    protected String custData;

    /**
     * ��ȡnumberOfPieces���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPieces() {
        return numberOfPieces;
    }

    /**
     * ����numberOfPieces���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPieces(BigInteger value) {
        this.numberOfPieces = value;
    }

    /**
     * ��ȡpieces���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Pieces }
     *     
     */
    public Pieces getPieces() {
        return pieces;
    }

    /**
     * ����pieces���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Pieces }
     *     
     */
    public void setPieces(Pieces value) {
        this.pieces = value;
    }

    /**
     * ��ȡweight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * ����weight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * ��ȡweightUnit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WeightUnit }
     *     
     */
    public WeightUnit getWeightUnit() {
        return weightUnit;
    }

    /**
     * ����weightUnit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WeightUnit }
     *     
     */
    public void setWeightUnit(WeightUnit value) {
        this.weightUnit = value;
    }

    /**
     * ��ȡproductCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * ����productCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * ��ȡglobalProductCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalProductCode() {
        return globalProductCode;
    }

    /**
     * ����globalProductCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalProductCode(String value) {
        this.globalProductCode = value;
    }

    /**
     * ��ȡlocalProductCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalProductCode() {
        return localProductCode;
    }

    /**
     * ����localProductCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalProductCode(String value) {
        this.localProductCode = value;
    }

    /**
     * ��ȡdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * ����date���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * ��ȡcontents���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContents() {
        return contents;
    }

    /**
     * ����contents���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContents(String value) {
        this.contents = value;
    }

    /**
     * ��ȡdoorTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DoorTo }
     *     
     */
    public DoorTo getDoorTo() {
        return doorTo;
    }

    /**
     * ����doorTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DoorTo }
     *     
     */
    public void setDoorTo(DoorTo value) {
        this.doorTo = value;
    }

    /**
     * ��ȡdimensionUnit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DimensionUnit }
     *     
     */
    public DimensionUnit getDimensionUnit() {
        return dimensionUnit;
    }

    /**
     * ����dimensionUnit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionUnit }
     *     
     */
    public void setDimensionUnit(DimensionUnit value) {
        this.dimensionUnit = value;
    }

    /**
     * ��ȡinsuredAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInsuredAmount() {
        return insuredAmount;
    }

    /**
     * ����insuredAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInsuredAmount(Float value) {
        this.insuredAmount = value;
    }

    /**
     * ��ȡpackageType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PackageType }
     *     
     */
    public PackageType getPackageType() {
        return packageType;
    }

    /**
     * ����packageType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PackageType }
     *     
     */
    public void setPackageType(PackageType value) {
        this.packageType = value;
    }

    /**
     * ��ȡisDutiable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getIsDutiable() {
        return isDutiable;
    }

    /**
     * ����isDutiable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setIsDutiable(YesNo value) {
        this.isDutiable = value;
    }

    /**
     * ��ȡcurrencyCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * ����currencyCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * ��ȡcustData���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustData() {
        return custData;
    }

    /**
     * ����custData���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustData(String value) {
        this.custData = value;
    }

}
