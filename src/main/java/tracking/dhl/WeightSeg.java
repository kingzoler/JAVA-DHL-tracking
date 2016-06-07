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
 * <p>WeightSeg complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WeightSeg">
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
@XmlType(name = "WeightSeg", propOrder = {
    "weight",
    "weightUnit"
})
public class WeightSeg {

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
