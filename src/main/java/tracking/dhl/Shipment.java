//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.24 ʱ�� 03:31:48 PM CST 
//


package tracking.dhl;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Shipment complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Shipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Weight" type="{http://www.dhl.com/datatypes}Weight"/>
 *         &lt;element name="WeightUnit" type="{http://www.dhl.com/datatypes}WeightUnit"/>
 *         &lt;element name="Pieces" type="{http://www.dhl.com/datatypes}Pieces"/>
 *         &lt;element name="DoorTo" type="{http://www.dhl.com/datatypes}DoorTo"/>
 *         &lt;element name="AirwarBillNumber" type="{http://www.dhl.com/datatypes}AWBNumber" minOccurs="0"/>
 *         &lt;element name="AccountType" type="{http://www.dhl.com/datatypes}AccountType" minOccurs="0"/>
 *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Commodity" type="{http://www.dhl.com/datatypes}Commodity" minOccurs="0"/>
 *         &lt;element name="DeclaredValue" type="{http://www.dhl.com/datatypes}Money" minOccurs="0"/>
 *         &lt;element name="DeclaredCurrency" type="{http://www.dhl.com/datatypes}CurrencyCode" minOccurs="0"/>
 *         &lt;element name="InsuredValue" type="{http://www.dhl.com/datatypes}Money" minOccurs="0"/>
 *         &lt;element name="InsuredCurrency" type="{http://www.dhl.com/datatypes}CurrencyCode" minOccurs="0"/>
 *         &lt;element name="DimensionalUnit" type="{http://www.dhl.com/datatypes}WeightUnit" minOccurs="0"/>
 *         &lt;element name="DimensionalWeight" type="{http://www.dhl.com/datatypes}Weight" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shipment", propOrder = {
    "weight",
    "weightUnit",
    "pieces",
    "doorTo",
    "airwarBillNumber",
    "accountType",
    "productType",
    "globalProductType",
    "localProductType",
    "commodity",
    "declaredValue",
    "declaredCurrency",
    "insuredValue",
    "insuredCurrency",
    "dimensionalUnit",
    "dimensionalWeight"
})
public class Shipment {

    @XmlElement(name = "Weight", required = true)
    protected BigDecimal weight;
    @XmlElement(name = "WeightUnit", required = true)
    @XmlSchemaType(name = "string")
    protected WeightUnit weightUnit;
    @XmlElement(name = "Pieces", required = true)
    protected Pieces pieces;
    @XmlElement(name = "DoorTo", required = true)
    @XmlSchemaType(name = "string")
    protected DoorTo doorTo;
    @XmlElement(name = "AirwarBillNumber")
    protected String airwarBillNumber;
    @XmlElement(name = "AccountType")
    @XmlSchemaType(name = "string")
    protected AccountType accountType;
    @XmlElement(name = "ProductType")
    protected String productType;
    @XmlElement(name = "GlobalProductType")
    protected String globalProductType;
    @XmlElement(name = "LocalProductType")
    protected String localProductType;
    @XmlElement(name = "Commodity")
    protected Commodity commodity;
    @XmlElement(name = "DeclaredValue")
    protected Float declaredValue;
    @XmlElement(name = "DeclaredCurrency")
    protected String declaredCurrency;
    @XmlElement(name = "InsuredValue")
    protected Float insuredValue;
    @XmlElement(name = "InsuredCurrency")
    protected String insuredCurrency;
    @XmlElement(name = "DimensionalUnit")
    @XmlSchemaType(name = "string")
    protected WeightUnit dimensionalUnit;
    @XmlElement(name = "DimensionalWeight")
    protected BigDecimal dimensionalWeight;

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
     * ��ȡairwarBillNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirwarBillNumber() {
        return airwarBillNumber;
    }

    /**
     * ����airwarBillNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirwarBillNumber(String value) {
        this.airwarBillNumber = value;
    }

    /**
     * ��ȡaccountType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * ����accountType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountType(AccountType value) {
        this.accountType = value;
    }

    /**
     * ��ȡproductType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * ����productType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * ��ȡglobalProductType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalProductType() {
        return globalProductType;
    }

    /**
     * ����globalProductType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalProductType(String value) {
        this.globalProductType = value;
    }

    /**
     * ��ȡlocalProductType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalProductType() {
        return localProductType;
    }

    /**
     * ����localProductType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalProductType(String value) {
        this.localProductType = value;
    }

    /**
     * ��ȡcommodity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Commodity }
     *     
     */
    public Commodity getCommodity() {
        return commodity;
    }

    /**
     * ����commodity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Commodity }
     *     
     */
    public void setCommodity(Commodity value) {
        this.commodity = value;
    }

    /**
     * ��ȡdeclaredValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeclaredValue() {
        return declaredValue;
    }

    /**
     * ����declaredValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeclaredValue(Float value) {
        this.declaredValue = value;
    }

    /**
     * ��ȡdeclaredCurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclaredCurrency() {
        return declaredCurrency;
    }

    /**
     * ����declaredCurrency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclaredCurrency(String value) {
        this.declaredCurrency = value;
    }

    /**
     * ��ȡinsuredValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInsuredValue() {
        return insuredValue;
    }

    /**
     * ����insuredValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInsuredValue(Float value) {
        this.insuredValue = value;
    }

    /**
     * ��ȡinsuredCurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredCurrency() {
        return insuredCurrency;
    }

    /**
     * ����insuredCurrency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredCurrency(String value) {
        this.insuredCurrency = value;
    }

    /**
     * ��ȡdimensionalUnit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WeightUnit }
     *     
     */
    public WeightUnit getDimensionalUnit() {
        return dimensionalUnit;
    }

    /**
     * ����dimensionalUnit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WeightUnit }
     *     
     */
    public void setDimensionalUnit(WeightUnit value) {
        this.dimensionalUnit = value;
    }

    /**
     * ��ȡdimensionalWeight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDimensionalWeight() {
        return dimensionalWeight;
    }

    /**
     * ����dimensionalWeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDimensionalWeight(BigDecimal value) {
        this.dimensionalWeight = value;
    }

}
