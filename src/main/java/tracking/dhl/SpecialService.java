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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SpecialService complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SpecialService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialServiceType" type="{http://www.dhl.com/datatypes}SpecialServiceType" minOccurs="0"/>
 *         &lt;element name="CommunicationAddress" type="{http://www.dhl.com/datatypes}CommunicationAddress" minOccurs="0"/>
 *         &lt;element name="CommunicationType" type="{http://www.dhl.com/datatypes}CommunicationType" minOccurs="0"/>
 *         &lt;element name="ChargeValue" type="{http://www.dhl.com/datatypes}Money" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.dhl.com/datatypes}CurrencyCode" minOccurs="0"/>
 *         &lt;element name="IsWaived" type="{http://www.dhl.com/datatypes}YesNo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialService", propOrder = {
    "specialServiceType",
    "communicationAddress",
    "communicationType",
    "chargeValue",
    "currencyCode",
    "isWaived"
})
public class SpecialService {

    @XmlElement(name = "SpecialServiceType")
    protected String specialServiceType;
    @XmlElement(name = "CommunicationAddress")
    protected String communicationAddress;
    @XmlElement(name = "CommunicationType")
    @XmlSchemaType(name = "string")
    protected CommunicationType communicationType;
    @XmlElement(name = "ChargeValue")
    protected Float chargeValue;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "IsWaived")
    @XmlSchemaType(name = "string")
    protected YesNo isWaived;

    /**
     * ��ȡspecialServiceType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialServiceType() {
        return specialServiceType;
    }

    /**
     * ����specialServiceType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialServiceType(String value) {
        this.specialServiceType = value;
    }

    /**
     * ��ȡcommunicationAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationAddress() {
        return communicationAddress;
    }

    /**
     * ����communicationAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationAddress(String value) {
        this.communicationAddress = value;
    }

    /**
     * ��ȡcommunicationType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommunicationType }
     *     
     */
    public CommunicationType getCommunicationType() {
        return communicationType;
    }

    /**
     * ����communicationType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationType }
     *     
     */
    public void setCommunicationType(CommunicationType value) {
        this.communicationType = value;
    }

    /**
     * ��ȡchargeValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getChargeValue() {
        return chargeValue;
    }

    /**
     * ����chargeValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setChargeValue(Float value) {
        this.chargeValue = value;
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
     * ��ȡisWaived���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getIsWaived() {
        return isWaived;
    }

    /**
     * ����isWaived���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setIsWaived(YesNo value) {
        this.isWaived = value;
    }

}
