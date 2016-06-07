//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.24 ʱ�� 03:31:48 PM CST 
//


package tracking.dhl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Dutiable complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Dutiable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeclaredValue" type="{http://www.dhl.com/datatypes}Money" minOccurs="0"/>
 *         &lt;element name="DeclaredCurrency" type="{http://www.dhl.com/datatypes}CurrencyCode" minOccurs="0"/>
 *         &lt;element name="ScheduleB" type="{http://www.dhl.com/datatypes}ScheduleB" minOccurs="0"/>
 *         &lt;element name="ExportLicense" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="ShipperEIN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShipperIDType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="S"/>
 *               &lt;enumeration value="E"/>
 *               &lt;enumeration value="D"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ConsigneeIDType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *               &lt;enumeration value="S"/>
 *               &lt;enumeration value="E"/>
 *               &lt;enumeration value="D"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ImportLicense" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="ConsigneeEIN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TermsOfTrade" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dutiable", propOrder = {
    "declaredValue",
    "declaredCurrency",
    "scheduleB",
    "exportLicense",
    "shipperEIN",
    "shipperIDType",
    "consigneeIDType",
    "importLicense",
    "consigneeEIN",
    "termsOfTrade"
})
public class Dutiable {

    @XmlElement(name = "DeclaredValue")
    protected Float declaredValue;
    @XmlElement(name = "DeclaredCurrency")
    protected String declaredCurrency;
    @XmlElement(name = "ScheduleB")
    protected String scheduleB;
    @XmlElement(name = "ExportLicense")
    protected Object exportLicense;
    @XmlElement(name = "ShipperEIN")
    protected String shipperEIN;
    @XmlElement(name = "ShipperIDType")
    protected String shipperIDType;
    @XmlElement(name = "ConsigneeIDType")
    protected String consigneeIDType;
    @XmlElement(name = "ImportLicense")
    protected Object importLicense;
    @XmlElement(name = "ConsigneeEIN")
    protected String consigneeEIN;
    @XmlElement(name = "TermsOfTrade")
    protected Object termsOfTrade;

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
     * ��ȡexportLicense���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExportLicense() {
        return exportLicense;
    }

    /**
     * ����exportLicense���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExportLicense(Object value) {
        this.exportLicense = value;
    }

    /**
     * ��ȡshipperEIN���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperEIN() {
        return shipperEIN;
    }

    /**
     * ����shipperEIN���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperEIN(String value) {
        this.shipperEIN = value;
    }

    /**
     * ��ȡshipperIDType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperIDType() {
        return shipperIDType;
    }

    /**
     * ����shipperIDType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperIDType(String value) {
        this.shipperIDType = value;
    }

    /**
     * ��ȡconsigneeIDType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeIDType() {
        return consigneeIDType;
    }

    /**
     * ����consigneeIDType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeIDType(String value) {
        this.consigneeIDType = value;
    }

    /**
     * ��ȡimportLicense���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getImportLicense() {
        return importLicense;
    }

    /**
     * ����importLicense���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setImportLicense(Object value) {
        this.importLicense = value;
    }

    /**
     * ��ȡconsigneeEIN���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeEIN() {
        return consigneeEIN;
    }

    /**
     * ����consigneeEIN���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeEIN(String value) {
        this.consigneeEIN = value;
    }

    /**
     * ��ȡtermsOfTrade���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTermsOfTrade() {
        return termsOfTrade;
    }

    /**
     * ����termsOfTrade���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTermsOfTrade(Object value) {
        this.termsOfTrade = value;
    }

}
