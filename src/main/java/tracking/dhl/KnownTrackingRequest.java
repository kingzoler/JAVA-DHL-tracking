//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.24 ʱ�� 03:26:19 PM CST 
//


package tracking.dhl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request" type="{http://www.dhl.com/datatypes}Request"/>
 *         &lt;element name="LanguageCode" type="{http://www.dhl.com/datatypes}LanguageCode"/>
 *         &lt;choice>
 *           &lt;element name="AWBNumber" type="{http://www.dhl.com/datatypes}AWBNumber" maxOccurs="10"/>
 *           &lt;element name="LPNumber" type="{http://www.dhl.com/datatypes}TrackingPieceID" maxOccurs="10"/>
 *         &lt;/choice>
 *         &lt;element name="LevelOfDetails" type="{http://www.dhl.com/datatypes}LevelOfDetails"/>
 *         &lt;element name="PiecesEnabled" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="S"/>
 *               &lt;enumeration value="B"/>
 *               &lt;enumeration value="P"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountryCode" type="{http://www.dhl.com/datatypes}CountryCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "languageCode",
    "awbNumber",
    "lpNumber",
    "levelOfDetails",
    "piecesEnabled",
    "countryCode"
})
@XmlRootElement(name = "KnownTrackingRequest", namespace = "http://www.dhl.com")
public class KnownTrackingRequest {

    @XmlElement(name = "Request", required = true)
    protected Request request;
    @XmlElement(name = "LanguageCode", required = true)
    @XmlSchemaType(name = "string")
    protected LanguageCode languageCode;
    @XmlElement(name = "AWBNumber")
    protected List<String> awbNumber;
    @XmlElement(name = "LPNumber")
    protected List<String> lpNumber;
    @XmlElement(name = "LevelOfDetails", required = true)
    @XmlSchemaType(name = "string")
    protected LevelOfDetails levelOfDetails;
    @XmlElement(name = "PiecesEnabled")
    protected String piecesEnabled;
    @XmlElement(name = "CountryCode")
    protected String countryCode;

    /**
     * ��ȡrequest���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Request }
     *     
     */
    public Request getRequest() {
        return request;
    }

    /**
     * ����request���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Request }
     *     
     */
    public void setRequest(Request value) {
        this.request = value;
    }

    /**
     * ��ȡlanguageCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LanguageCode }
     *     
     */
    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    /**
     * ����languageCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCode }
     *     
     */
    public void setLanguageCode(LanguageCode value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the awbNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awbNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAWBNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAWBNumber() {
        if (awbNumber == null) {
            awbNumber = new ArrayList<String>();
        }
        return this.awbNumber;
    }

    /**
     * Gets the value of the lpNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lpNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLPNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLPNumber() {
        if (lpNumber == null) {
            lpNumber = new ArrayList<String>();
        }
        return this.lpNumber;
    }

    /**
     * ��ȡlevelOfDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LevelOfDetails }
     *     
     */
    public LevelOfDetails getLevelOfDetails() {
        return levelOfDetails;
    }

    /**
     * ����levelOfDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LevelOfDetails }
     *     
     */
    public void setLevelOfDetails(LevelOfDetails value) {
        this.levelOfDetails = value;
    }

    /**
     * ��ȡpiecesEnabled���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiecesEnabled() {
        return piecesEnabled;
    }

    /**
     * ����piecesEnabled���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiecesEnabled(String value) {
        this.piecesEnabled = value;
    }

    /**
     * ��ȡcountryCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * ����countryCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

}
