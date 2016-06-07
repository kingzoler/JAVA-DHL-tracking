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
 * Label
 * 
 * <p>Label complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Label">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LabelTemplate" type="{http://www.dhl.com/datatypes}LabelTemplate" minOccurs="0"/>
 *         &lt;element name="Logo" type="{http://www.dhl.com/datatypes}YesNo" minOccurs="0"/>
 *         &lt;element name="CustomerLogo" type="{http://www.dhl.com/datatypes}CustomerLogo" minOccurs="0"/>
 *         &lt;element name="Resolution" type="{http://www.dhl.com/datatypes}Resolution" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Label", propOrder = {
    "labelTemplate",
    "logo",
    "customerLogo",
    "resolution"
})
public class Label {

    @XmlElement(name = "LabelTemplate")
    protected String labelTemplate;
    @XmlElement(name = "Logo")
    @XmlSchemaType(name = "string")
    protected YesNo logo;
    @XmlElement(name = "CustomerLogo")
    protected CustomerLogo customerLogo;
    @XmlElement(name = "Resolution")
    @XmlSchemaType(name = "positiveInteger")
    protected Integer resolution;

    /**
     * ��ȡlabelTemplate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelTemplate() {
        return labelTemplate;
    }

    /**
     * ����labelTemplate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelTemplate(String value) {
        this.labelTemplate = value;
    }

    /**
     * ��ȡlogo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getLogo() {
        return logo;
    }

    /**
     * ����logo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setLogo(YesNo value) {
        this.logo = value;
    }

    /**
     * ��ȡcustomerLogo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerLogo }
     *     
     */
    public CustomerLogo getCustomerLogo() {
        return customerLogo;
    }

    /**
     * ����customerLogo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerLogo }
     *     
     */
    public void setCustomerLogo(CustomerLogo value) {
        this.customerLogo = value;
    }

    /**
     * ��ȡresolution���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResolution() {
        return resolution;
    }

    /**
     * ����resolution���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResolution(Integer value) {
        this.resolution = value;
    }

}
