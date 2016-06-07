//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.24 ʱ�� 03:31:48 PM CST 
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
 *         &lt;element name="Response" type="{http://www.dhl.com/datatypes}Response"/>
 *         &lt;element name="AWBInfo" type="{http://www.dhl.com/datatypes}AWBInfo" maxOccurs="unbounded"/>
 *         &lt;element name="Fault" type="{http://www.dhl.com/datatypes}Fault" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://www.dhl.com/datatypes}LanguageCode" minOccurs="0"/>
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
    "response",
    "awbInfo",
    "fault",
    "languageCode"
})
@XmlRootElement(name = "TrackingResponse", namespace = "http://www.dhl.com")
public class TrackingResponse {

    @XmlElement(name = "Response", required = true)
    protected Response response;
    @XmlElement(name = "AWBInfo", required = true)
    protected List<AWBInfo> awbInfo;
    @XmlElement(name = "Fault")
    protected Fault fault;
    @XmlElement(name = "LanguageCode")
    @XmlSchemaType(name = "string")
    protected LanguageCode languageCode;

    /**
     * ��ȡresponse���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getResponse() {
        return response;
    }

    /**
     * ����response���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setResponse(Response value) {
        this.response = value;
    }

    /**
     * Gets the value of the awbInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awbInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAWBInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AWBInfo }
     * 
     * 
     */
    public List<AWBInfo> getAWBInfo() {
        if (awbInfo == null) {
            awbInfo = new ArrayList<AWBInfo>();
        }
        return this.awbInfo;
    }

    /**
     * ��ȡfault���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Fault }
     *     
     */
    public Fault getFault() {
        return fault;
    }

    /**
     * ����fault���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Fault }
     *     
     */
    public void setFault(Fault value) {
        this.fault = value;
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

}
