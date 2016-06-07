//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.24 ʱ�� 03:31:48 PM CST 
//


package tracking.dhl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ChargeCard complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ChargeCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChargeCardNo" type="{http://www.dhl.com/datatypes}ChargeCardNo"/>
 *         &lt;element name="ChargeCardType" type="{http://www.dhl.com/datatypes}ChargeCardType"/>
 *         &lt;element name="ChargeCardConfNo" type="{http://www.dhl.com/datatypes}ChargeCardConfNo"/>
 *         &lt;element name="ChargeCardExpiryDate" type="{http://www.dhl.com/datatypes}ChargeCardExpDateValidator"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeCard", propOrder = {
    "chargeCardNo",
    "chargeCardType",
    "chargeCardConfNo",
    "chargeCardExpiryDate"
})
public class ChargeCard {

    @XmlElement(name = "ChargeCardNo")
    @XmlSchemaType(name = "positiveInteger")
    protected long chargeCardNo;
    @XmlElement(name = "ChargeCardType", required = true)
    @XmlSchemaType(name = "string")
    protected ChargeCardType chargeCardType;
    @XmlElement(name = "ChargeCardConfNo", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger chargeCardConfNo;
    @XmlElement(name = "ChargeCardExpiryDate", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger chargeCardExpiryDate;

    /**
     * ��ȡchargeCardNo���Ե�ֵ��
     * 
     */
    public long getChargeCardNo() {
        return chargeCardNo;
    }

    /**
     * ����chargeCardNo���Ե�ֵ��
     * 
     */
    public void setChargeCardNo(long value) {
        this.chargeCardNo = value;
    }

    /**
     * ��ȡchargeCardType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ChargeCardType }
     *     
     */
    public ChargeCardType getChargeCardType() {
        return chargeCardType;
    }

    /**
     * ����chargeCardType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeCardType }
     *     
     */
    public void setChargeCardType(ChargeCardType value) {
        this.chargeCardType = value;
    }

    /**
     * ��ȡchargeCardConfNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChargeCardConfNo() {
        return chargeCardConfNo;
    }

    /**
     * ����chargeCardConfNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChargeCardConfNo(BigInteger value) {
        this.chargeCardConfNo = value;
    }

    /**
     * ��ȡchargeCardExpiryDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChargeCardExpiryDate() {
        return chargeCardExpiryDate;
    }

    /**
     * ����chargeCardExpiryDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChargeCardExpiryDate(BigInteger value) {
        this.chargeCardExpiryDate = value;
    }

}
