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
 * <p>AWBInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AWBInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AWBNumber" type="{http://www.dhl.com/datatypes}AWBNumber"/>
 *         &lt;element name="Status" type="{http://www.dhl.com/datatypes}Status"/>
 *         &lt;element name="ShipmentInfo" type="{http://www.dhl.com/datatypes}ShipmentInfo" minOccurs="0"/>
 *         &lt;element name="Pieces" type="{http://www.dhl.com/datatypes}TrackingPieces" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AWBInfo", propOrder = {
    "awbNumber",
    "status",
    "shipmentInfo",
    "pieces"
})
public class AWBInfo {

    @XmlElement(name = "AWBNumber", required = true)
    protected String awbNumber;
    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "ShipmentInfo")
    protected ShipmentInfo shipmentInfo;
    @XmlElement(name = "Pieces")
    protected TrackingPieces pieces;

    /**
     * ��ȡawbNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAWBNumber() {
        return awbNumber;
    }

    /**
     * ����awbNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAWBNumber(String value) {
        this.awbNumber = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * ��ȡshipmentInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ShipmentInfo }
     *     
     */
    public ShipmentInfo getShipmentInfo() {
        return shipmentInfo;
    }

    /**
     * ����shipmentInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentInfo }
     *     
     */
    public void setShipmentInfo(ShipmentInfo value) {
        this.shipmentInfo = value;
    }

    /**
     * ��ȡpieces���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrackingPieces }
     *     
     */
    public TrackingPieces getPieces() {
        return pieces;
    }

    /**
     * ����pieces���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingPieces }
     *     
     */
    public void setPieces(TrackingPieces value) {
        this.pieces = value;
    }

}
