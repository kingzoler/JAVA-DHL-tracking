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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ExportLineItem complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ExportLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineNumber" type="{http://www.dhl.com/datatypes}LineNumber"/>
 *         &lt;element name="Quantity" type="{http://www.dhl.com/datatypes}Quantity"/>
 *         &lt;element name="QuantityUnit" type="{http://www.dhl.com/datatypes}QuantityUnit"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Value" type="{http://www.dhl.com/datatypes}Money"/>
 *         &lt;element name="IsDomestic" type="{http://www.dhl.com/datatypes}YesNo" minOccurs="0"/>
 *         &lt;element name="CommodityCode" type="{http://www.dhl.com/datatypes}CommodityCode" minOccurs="0"/>
 *         &lt;element name="ScheduleB" type="{http://www.dhl.com/datatypes}ScheduleB" minOccurs="0"/>
 *         &lt;element name="ECCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Weight" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Weight" type="{http://www.dhl.com/datatypes}Weight"/>
 *                   &lt;element name="WeightUnit" type="{http://www.dhl.com/datatypes}WeightUnit"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="License" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LicenseNumber" type="{http://www.dhl.com/datatypes}LicenseNumber"/>
 *                   &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LicenseSymbol" type="{http://www.dhl.com/datatypes}LicenseNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportLineItem", propOrder = {
    "lineNumber",
    "quantity",
    "quantityUnit",
    "description",
    "value",
    "isDomestic",
    "commodityCode",
    "scheduleB",
    "eccn",
    "weight",
    "license",
    "licenseSymbol"
})
public class ExportLineItem {

    @XmlElement(name = "LineNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected int lineNumber;
    @XmlElement(name = "Quantity")
    @XmlSchemaType(name = "positiveInteger")
    protected int quantity;
    @XmlElement(name = "QuantityUnit", required = true)
    protected String quantityUnit;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Value")
    protected float value;
    @XmlElement(name = "IsDomestic")
    @XmlSchemaType(name = "string")
    protected YesNo isDomestic;
    @XmlElement(name = "CommodityCode")
    protected String commodityCode;
    @XmlElement(name = "ScheduleB")
    protected String scheduleB;
    @XmlElement(name = "ECCN")
    protected String eccn;
    @XmlElement(name = "Weight")
    protected ExportLineItem.Weight weight;
    @XmlElement(name = "License")
    protected ExportLineItem.License license;
    @XmlElement(name = "LicenseSymbol")
    protected String licenseSymbol;

    /**
     * ��ȡlineNumber���Ե�ֵ��
     * 
     */
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * ����lineNumber���Ե�ֵ��
     * 
     */
    public void setLineNumber(int value) {
        this.lineNumber = value;
    }

    /**
     * ��ȡquantity���Ե�ֵ��
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * ����quantity���Ե�ֵ��
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * ��ȡquantityUnit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityUnit() {
        return quantityUnit;
    }

    /**
     * ����quantityUnit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityUnit(String value) {
        this.quantityUnit = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡvalue���Ե�ֵ��
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * ��ȡisDomestic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getIsDomestic() {
        return isDomestic;
    }

    /**
     * ����isDomestic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setIsDomestic(YesNo value) {
        this.isDomestic = value;
    }

    /**
     * ��ȡcommodityCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * ����commodityCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCode(String value) {
        this.commodityCode = value;
    }

    /**
     * ��ȡscheduleB���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleB() {
        return scheduleB;
    }

    /**
     * ����scheduleB���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleB(String value) {
        this.scheduleB = value;
    }

    /**
     * ��ȡeccn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECCN() {
        return eccn;
    }

    /**
     * ����eccn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECCN(String value) {
        this.eccn = value;
    }

    /**
     * ��ȡweight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ExportLineItem.Weight }
     *     
     */
    public ExportLineItem.Weight getWeight() {
        return weight;
    }

    /**
     * ����weight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ExportLineItem.Weight }
     *     
     */
    public void setWeight(ExportLineItem.Weight value) {
        this.weight = value;
    }

    /**
     * ��ȡlicense���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ExportLineItem.License }
     *     
     */
    public ExportLineItem.License getLicense() {
        return license;
    }

    /**
     * ����license���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ExportLineItem.License }
     *     
     */
    public void setLicense(ExportLineItem.License value) {
        this.license = value;
    }

    /**
     * ��ȡlicenseSymbol���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseSymbol() {
        return licenseSymbol;
    }

    /**
     * ����licenseSymbol���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseSymbol(String value) {
        this.licenseSymbol = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LicenseNumber" type="{http://www.dhl.com/datatypes}LicenseNumber"/>
     *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "licenseNumber",
        "expiryDate"
    })
    public static class License {

        @XmlElement(name = "LicenseNumber", required = true)
        protected String licenseNumber;
        @XmlElement(name = "ExpiryDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expiryDate;

        /**
         * ��ȡlicenseNumber���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseNumber() {
            return licenseNumber;
        }

        /**
         * ����licenseNumber���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenseNumber(String value) {
            this.licenseNumber = value;
        }

        /**
         * ��ȡexpiryDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpiryDate() {
            return expiryDate;
        }

        /**
         * ����expiryDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpiryDate(XMLGregorianCalendar value) {
            this.expiryDate = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Weight" type="{http://www.dhl.com/datatypes}Weight"/>
     *         &lt;element name="WeightUnit" type="{http://www.dhl.com/datatypes}WeightUnit"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "weight",
        "weightUnit"
    })
    public static class Weight {

        @XmlElement(name = "Weight", required = true)
        protected BigDecimal weight;
        @XmlElement(name = "WeightUnit", required = true)
        @XmlSchemaType(name = "string")
        protected WeightUnit weightUnit;

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

    }

}
