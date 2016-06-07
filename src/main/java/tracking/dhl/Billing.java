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
 * <p>Billing complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Billing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipperAccountNumber" type="{http://www.dhl.com/datatypes}AccountNumber"/>
 *         &lt;element name="ShippingPaymentType" type="{http://www.dhl.com/datatypes}PaymentType"/>
 *         &lt;element name="BillingAccountNumber" type="{http://www.dhl.com/datatypes}AccountNumber"/>
 *         &lt;element name="DutyPaymentType" type="{http://www.dhl.com/datatypes}DutyTaxPaymentType"/>
 *         &lt;element name="DutyAccountNumber" type="{http://www.dhl.com/datatypes}AccountNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Billing", propOrder = {
    "shipperAccountNumber",
    "shippingPaymentType",
    "billingAccountNumber",
    "dutyPaymentType",
    "dutyAccountNumber"
})
public class Billing {

    @XmlElement(name = "ShipperAccountNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected long shipperAccountNumber;
    @XmlElement(name = "ShippingPaymentType", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentType shippingPaymentType;
    @XmlElement(name = "BillingAccountNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected long billingAccountNumber;
    @XmlElement(name = "DutyPaymentType", required = true)
    @XmlSchemaType(name = "string")
    protected DutyTaxPaymentType dutyPaymentType;
    @XmlElement(name = "DutyAccountNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected Long dutyAccountNumber;

    /**
     * ��ȡshipperAccountNumber���Ե�ֵ��
     * 
     */
    public long getShipperAccountNumber() {
        return shipperAccountNumber;
    }

    /**
     * ����shipperAccountNumber���Ե�ֵ��
     * 
     */
    public void setShipperAccountNumber(long value) {
        this.shipperAccountNumber = value;
    }

    /**
     * ��ȡshippingPaymentType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getShippingPaymentType() {
        return shippingPaymentType;
    }

    /**
     * ����shippingPaymentType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setShippingPaymentType(PaymentType value) {
        this.shippingPaymentType = value;
    }

    /**
     * ��ȡbillingAccountNumber���Ե�ֵ��
     * 
     */
    public long getBillingAccountNumber() {
        return billingAccountNumber;
    }

    /**
     * ����billingAccountNumber���Ե�ֵ��
     * 
     */
    public void setBillingAccountNumber(long value) {
        this.billingAccountNumber = value;
    }

    /**
     * ��ȡdutyPaymentType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DutyTaxPaymentType }
     *     
     */
    public DutyTaxPaymentType getDutyPaymentType() {
        return dutyPaymentType;
    }

    /**
     * ����dutyPaymentType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DutyTaxPaymentType }
     *     
     */
    public void setDutyPaymentType(DutyTaxPaymentType value) {
        this.dutyPaymentType = value;
    }

    /**
     * ��ȡdutyAccountNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDutyAccountNumber() {
        return dutyAccountNumber;
    }

    /**
     * ����dutyAccountNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDutyAccountNumber(Long value) {
        this.dutyAccountNumber = value;
    }

}
