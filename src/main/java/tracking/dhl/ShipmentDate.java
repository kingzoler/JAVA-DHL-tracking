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
 * <p>ShipmentDate complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ShipmentDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipmentDateFrom" type="{http://www.dhl.com/datatypes}Date"/>
 *         &lt;element name="ShipmentDateTo" type="{http://www.dhl.com/datatypes}Date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentDate", propOrder = {
    "shipmentDateFrom",
    "shipmentDateTo"
})
public class ShipmentDate {

    @XmlElement(name = "ShipmentDateFrom", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipmentDateFrom;
    @XmlElement(name = "ShipmentDateTo", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipmentDateTo;

    /**
     * ��ȡshipmentDateFrom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipmentDateFrom() {
        return shipmentDateFrom;
    }

    /**
     * ����shipmentDateFrom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipmentDateFrom(XMLGregorianCalendar value) {
        this.shipmentDateFrom = value;
    }

    /**
     * ��ȡshipmentDateTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipmentDateTo() {
        return shipmentDateTo;
    }

    /**
     * ����shipmentDateTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipmentDateTo(XMLGregorianCalendar value) {
        this.shipmentDateTo = value;
    }

}
