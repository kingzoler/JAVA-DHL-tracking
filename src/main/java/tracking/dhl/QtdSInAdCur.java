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
 * QtdSInAdCur
 * 
 * <p>QtdSInAdCur complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="QtdSInAdCur">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyCode" type="{http://www.dhl.com/datatypes}CurrencyCode"/>
 *         &lt;element name="CurrencyRoleTypeCode" type="{http://www.dhl.com/datatypes}CurrencyRoleTypeCode"/>
 *         &lt;element name="PackageCharge" type="{http://www.dhl.com/datatypes}PackageCharge"/>
 *         &lt;element name="ShippingCharge" type="{http://www.dhl.com/datatypes}ShippingCharge"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QtdSInAdCur", propOrder = {
    "currencyCode",
    "currencyRoleTypeCode",
    "packageCharge",
    "shippingCharge"
})
public class QtdSInAdCur {

    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;
    @XmlElement(name = "CurrencyRoleTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyRoleTypeCode currencyRoleTypeCode;
    @XmlElement(name = "PackageCharge", required = true)
    protected BigDecimal packageCharge;
    @XmlElement(name = "ShippingCharge", required = true)
    protected BigDecimal shippingCharge;

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
     * ��ȡcurrencyRoleTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CurrencyRoleTypeCode }
     *     
     */
    public CurrencyRoleTypeCode getCurrencyRoleTypeCode() {
        return currencyRoleTypeCode;
    }

    /**
     * ����currencyRoleTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyRoleTypeCode }
     *     
     */
    public void setCurrencyRoleTypeCode(CurrencyRoleTypeCode value) {
        this.currencyRoleTypeCode = value;
    }

    /**
     * ��ȡpackageCharge���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPackageCharge() {
        return packageCharge;
    }

    /**
     * ����packageCharge���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPackageCharge(BigDecimal value) {
        this.packageCharge = value;
    }

    /**
     * ��ȡshippingCharge���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShippingCharge() {
        return shippingCharge;
    }

    /**
     * ����shippingCharge���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShippingCharge(BigDecimal value) {
        this.shippingCharge = value;
    }

}
