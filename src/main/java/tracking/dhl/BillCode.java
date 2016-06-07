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
 * <p>BillCode�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="BillCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="2"/>
 *     &lt;maxLength value="3"/>
 *     &lt;enumeration value="DSA"/>
 *     &lt;enumeration value="DBA"/>
 *     &lt;enumeration value="TCA"/>
 *     &lt;enumeration value="IEA"/>
 *     &lt;enumeration value="UAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillCode")
@XmlEnum
public enum BillCode {

    DSA,
    DBA,
    TCA,
    IEA,
    UAN;

    public String value() {
        return name();
    }

    public static BillCode fromValue(String v) {
        return valueOf(v);
    }

}
