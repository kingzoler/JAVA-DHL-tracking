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
 * CustomerLogo
 * 
 * <p>CustomerLogo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CustomerLogo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogoImage" type="{http://www.dhl.com/datatypes}LogoImage"/>
 *         &lt;element name="LogoImageFormat" type="{http://www.dhl.com/datatypes}LogoImageFormat"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerLogo", propOrder = {
    "logoImage",
    "logoImageFormat"
})
public class CustomerLogo {

    @XmlElement(name = "LogoImage", required = true)
    protected byte[] logoImage;
    @XmlElement(name = "LogoImageFormat", required = true)
    @XmlSchemaType(name = "string")
    protected LogoImageFormat logoImageFormat;

    /**
     * ��ȡlogoImage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLogoImage() {
        return logoImage;
    }

    /**
     * ����logoImage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLogoImage(byte[] value) {
        this.logoImage = value;
    }

    /**
     * ��ȡlogoImageFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LogoImageFormat }
     *     
     */
    public LogoImageFormat getLogoImageFormat() {
        return logoImageFormat;
    }

    /**
     * ����logoImageFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LogoImageFormat }
     *     
     */
    public void setLogoImageFormat(LogoImageFormat value) {
        this.logoImageFormat = value;
    }

}
