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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EventRemarks complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EventRemarks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FurtherDetails" type="{http://www.dhl.com/datatypes}FurtherDetails"/>
 *         &lt;element name="NextSteps" type="{http://www.dhl.com/datatypes}NextSteps"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventRemarks", propOrder = {
    "furtherDetails",
    "nextSteps"
})
public class EventRemarks {

    @XmlElement(name = "FurtherDetails", required = true)
    protected String furtherDetails;
    @XmlElement(name = "NextSteps", required = true)
    protected String nextSteps;

    /**
     * ��ȡfurtherDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFurtherDetails() {
        return furtherDetails;
    }

    /**
     * ����furtherDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFurtherDetails(String value) {
        this.furtherDetails = value;
    }

    /**
     * ��ȡnextSteps���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextSteps() {
        return nextSteps;
    }

    /**
     * ����nextSteps���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextSteps(String value) {
        this.nextSteps = value;
    }

}
