//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.24 ʱ�� 03:31:48 PM CST 
//


package tracking.dhl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ImageFormat�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ImageFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="5"/>
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="TIFF"/>
 *     &lt;enumeration value="GIF"/>
 *     &lt;enumeration value="JPEG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageFormat")
@XmlEnum
public enum ImageFormat {

    PDF,
    PNG,
    TIFF,
    GIF,
    JPEG;

    public String value() {
        return name();
    }

    public static ImageFormat fromValue(String v) {
        return valueOf(v);
    }

}
