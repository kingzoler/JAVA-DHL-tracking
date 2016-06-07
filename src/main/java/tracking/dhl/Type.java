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
 * <p>Type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="3"/>
 *     &lt;enumeration value="HWB"/>
 *     &lt;enumeration value="INV"/>
 *     &lt;enumeration value="PNV"/>
 *     &lt;enumeration value="COO"/>
 *     &lt;enumeration value="NAF"/>
 *     &lt;enumeration value="CIN"/>
 *     &lt;enumeration value="DCL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Type")
@XmlEnum
public enum Type {

    HWB,
    INV,
    PNV,
    COO,
    NAF,
    CIN,
    DCL;

    public String value() {
        return name();
    }

    public static Type fromValue(String v) {
        return valueOf(v);
    }

}
