//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.24 ʱ�� 03:31:48 PM CST 
//


package tracking.dhl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LabelImageFormat�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="LabelImageFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="3"/>
 *     &lt;maxLength value="4"/>
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="ZPL2"/>
 *     &lt;enumeration value="EPL2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LabelImageFormat")
@XmlEnum
public enum LabelImageFormat {

    PDF("PDF"),
    @XmlEnumValue("ZPL2")
    ZPL_2("ZPL2"),
    @XmlEnumValue("EPL2")
    EPL_2("EPL2");
    private final String value;

    LabelImageFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LabelImageFormat fromValue(String v) {
        for (LabelImageFormat c: LabelImageFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
