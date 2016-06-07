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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Describes the checkpoint information
 * 
 * <p>ShipmentEvent complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ShipmentEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="ServiceEvent" type="{http://www.dhl.com/datatypes}ServiceEvent"/>
 *         &lt;element name="Signatory" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EventRemarks" type="{http://www.dhl.com/datatypes}EventRemarks" minOccurs="0"/>
 *         &lt;element name="ServiceArea" type="{http://www.dhl.com/datatypes}ServiceArea"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentEvent", propOrder = {
    "date",
    "time",
    "serviceEvent",
    "signatory",
    "eventRemarks",
    "serviceArea"
})
public class ShipmentEvent {

    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Time", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "ServiceEvent", required = true)
    protected ServiceEvent serviceEvent;
    @XmlElement(name = "Signatory")
    protected String signatory;
    @XmlElement(name = "EventRemarks")
    protected EventRemarks eventRemarks;
    @XmlElement(name = "ServiceArea", required = true)
    protected ServiceArea serviceArea;

    /**
     * ��ȡdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * ����date���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * ��ȡtime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * ����time���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * ��ȡserviceEvent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ServiceEvent }
     *     
     */
    public ServiceEvent getServiceEvent() {
        return serviceEvent;
    }

    /**
     * ����serviceEvent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEvent }
     *     
     */
    public void setServiceEvent(ServiceEvent value) {
        this.serviceEvent = value;
    }

    /**
     * ��ȡsignatory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatory() {
        return signatory;
    }

    /**
     * ����signatory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatory(String value) {
        this.signatory = value;
    }

    /**
     * ��ȡeventRemarks���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EventRemarks }
     *     
     */
    public EventRemarks getEventRemarks() {
        return eventRemarks;
    }

    /**
     * ����eventRemarks���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EventRemarks }
     *     
     */
    public void setEventRemarks(EventRemarks value) {
        this.eventRemarks = value;
    }

    /**
     * ��ȡserviceArea���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ServiceArea }
     *     
     */
    public ServiceArea getServiceArea() {
        return serviceArea;
    }

    /**
     * ����serviceArea���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceArea }
     *     
     */
    public void setServiceArea(ServiceArea value) {
        this.serviceArea = value;
    }

}
