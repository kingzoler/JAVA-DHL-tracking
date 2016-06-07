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
 * LabelImage
 * 
 * <p>LabelImage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="LabelImage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutputFormat" type="{http://www.dhl.com/datatypes}OutputFormat" minOccurs="0"/>
 *         &lt;element name="OutputImage" type="{http://www.dhl.com/datatypes}OutputImage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelImage", propOrder = {
    "outputFormat",
    "outputImage"
})
public class LabelImage {

    @XmlElement(name = "OutputFormat")
    @XmlSchemaType(name = "string")
    protected OutputFormat outputFormat;
    @XmlElement(name = "OutputImage")
    protected byte[] outputImage;

    /**
     * ��ȡoutputFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat }
     *     
     */
    public OutputFormat getOutputFormat() {
        return outputFormat;
    }

    /**
     * ����outputFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat }
     *     
     */
    public void setOutputFormat(OutputFormat value) {
        this.outputFormat = value;
    }

    /**
     * ��ȡoutputImage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOutputImage() {
        return outputImage;
    }

    /**
     * ����outputImage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOutputImage(byte[] value) {
        this.outputImage = value;
    }

}
