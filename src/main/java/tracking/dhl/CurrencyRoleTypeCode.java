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
 * <p>CurrencyRoleTypeCode�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyRoleTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="5"/>
 *     &lt;enumeration value="BILLCU"/>
 *     &lt;enumeration value="PULCL"/>
 *     &lt;enumeration value="INVCU"/>
 *     &lt;enumeration value="BASEC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyRoleTypeCode")
@XmlEnum
public enum CurrencyRoleTypeCode {

    BILLCU,
    PULCL,
    INVCU,
    BASEC;

    public String value() {
        return name();
    }

    public static CurrencyRoleTypeCode fromValue(String v) {
        return valueOf(v);
    }

}
