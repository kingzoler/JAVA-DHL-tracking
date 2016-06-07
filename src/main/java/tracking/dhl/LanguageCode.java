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
 * <p>LanguageCode�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="2"/>
 *     &lt;enumeration value="ba"/>
 *     &lt;enumeration value="bg"/>
 *     &lt;enumeration value="cn"/>
 *     &lt;enumeration value="cs"/>
 *     &lt;enumeration value="cz"/>
 *     &lt;enumeration value="da"/>
 *     &lt;enumeration value="de"/>
 *     &lt;enumeration value="dk"/>
 *     &lt;enumeration value="ee"/>
 *     &lt;enumeration value="el"/>
 *     &lt;enumeration value="en"/>
 *     &lt;enumeration value="es"/>
 *     &lt;enumeration value="fi"/>
 *     &lt;enumeration value="fr"/>
 *     &lt;enumeration value="gr"/>
 *     &lt;enumeration value="hr"/>
 *     &lt;enumeration value="hu"/>
 *     &lt;enumeration value="in"/>
 *     &lt;enumeration value="it"/>
 *     &lt;enumeration value="ja"/>
 *     &lt;enumeration value="jp"/>
 *     &lt;enumeration value="ko"/>
 *     &lt;enumeration value="lt"/>
 *     &lt;enumeration value="lv"/>
 *     &lt;enumeration value="mk"/>
 *     &lt;enumeration value="nl"/>
 *     &lt;enumeration value="no"/>
 *     &lt;enumeration value="pl"/>
 *     &lt;enumeration value="pt"/>
 *     &lt;enumeration value="ro"/>
 *     &lt;enumeration value="ru"/>
 *     &lt;enumeration value="sk"/>
 *     &lt;enumeration value="sl"/>
 *     &lt;enumeration value="sp"/>
 *     &lt;enumeration value="sr"/>
 *     &lt;enumeration value="sv"/>
 *     &lt;enumeration value="th"/>
 *     &lt;enumeration value="tr"/>
 *     &lt;enumeration value="tw"/>
 *     &lt;enumeration value="uk"/>
 *     &lt;enumeration value="zh"/>
 *     &lt;enumeration value="zt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LanguageCode")
@XmlEnum
public enum LanguageCode {

    @XmlEnumValue("ba")
    BA("ba"),
    @XmlEnumValue("bg")
    BG("bg"),
    @XmlEnumValue("cn")
    CN("cn"),
    @XmlEnumValue("cs")
    CS("cs"),
    @XmlEnumValue("cz")
    CZ("cz"),
    @XmlEnumValue("da")
    DA("da"),
    @XmlEnumValue("de")
    DE("de"),
    @XmlEnumValue("dk")
    DK("dk"),
    @XmlEnumValue("ee")
    EE("ee"),
    @XmlEnumValue("el")
    EL("el"),
    @XmlEnumValue("en")
    EN("en"),
    @XmlEnumValue("es")
    ES("es"),
    @XmlEnumValue("fi")
    FI("fi"),
    @XmlEnumValue("fr")
    FR("fr"),
    @XmlEnumValue("gr")
    GR("gr"),
    @XmlEnumValue("hr")
    HR("hr"),
    @XmlEnumValue("hu")
    HU("hu"),
    @XmlEnumValue("in")
    IN("in"),
    @XmlEnumValue("it")
    IT("it"),
    @XmlEnumValue("ja")
    JA("ja"),
    @XmlEnumValue("jp")
    JP("jp"),
    @XmlEnumValue("ko")
    KO("ko"),
    @XmlEnumValue("lt")
    LT("lt"),
    @XmlEnumValue("lv")
    LV("lv"),
    @XmlEnumValue("mk")
    MK("mk"),
    @XmlEnumValue("nl")
    NL("nl"),
    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("pl")
    PL("pl"),
    @XmlEnumValue("pt")
    PT("pt"),
    @XmlEnumValue("ro")
    RO("ro"),
    @XmlEnumValue("ru")
    RU("ru"),
    @XmlEnumValue("sk")
    SK("sk"),
    @XmlEnumValue("sl")
    SL("sl"),
    @XmlEnumValue("sp")
    SP("sp"),
    @XmlEnumValue("sr")
    SR("sr"),
    @XmlEnumValue("sv")
    SV("sv"),
    @XmlEnumValue("th")
    TH("th"),
    @XmlEnumValue("tr")
    TR("tr"),
    @XmlEnumValue("tw")
    TW("tw"),
    @XmlEnumValue("uk")
    UK("uk"),
    @XmlEnumValue("zh")
    ZH("zh"),
    @XmlEnumValue("zt")
    ZT("zt");
    private final String value;

    LanguageCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageCode fromValue(String v) {
        for (LanguageCode c: LanguageCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
