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
 * DocImage
 * 
 * <p>DocImage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DocImage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.dhl.com/datatypes}Type"/>
 *         &lt;element name="Image" type="{http://www.dhl.com/datatypes}Image"/>
 *         &lt;element name="ImageFormat" type="{http://www.dhl.com/datatypes}ImageFormat"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocImage", propOrder = {
    "type",
    "image",
    "imageFormat"
})
public class DocImage {

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected Type type;
    @XmlElement(name = "Image", required = true)
    protected byte[] image;
    @XmlElement(name = "ImageFormat", required = true)
    @XmlSchemaType(name = "string")
    protected ImageFormat imageFormat;

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setType(Type value) {
        this.type = value;
    }

    /**
     * ��ȡimage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * ����image���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = value;
    }

    /**
     * ��ȡimageFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ImageFormat }
     *     
     */
    public ImageFormat getImageFormat() {
        return imageFormat;
    }

    /**
     * ����imageFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ImageFormat }
     *     
     */
    public void setImageFormat(ImageFormat value) {
        this.imageFormat = value;
    }

}
