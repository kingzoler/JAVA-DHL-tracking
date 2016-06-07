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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ShipmentInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ShipmentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginServiceArea" type="{http://www.dhl.com/datatypes}OriginServiceArea"/>
 *         &lt;element name="DestinationServiceArea" type="{http://www.dhl.com/datatypes}DestinationServiceArea" minOccurs="0"/>
 *         &lt;element name="ShipperName" type="{http://www.dhl.com/datatypes}PersonName"/>
 *         &lt;element name="ShipperAccountNumber" type="{http://www.dhl.com/datatypes}AccountNumber" minOccurs="0"/>
 *         &lt;element name="ConsigneeName" type="{http://www.dhl.com/datatypes}PersonName"/>
 *         &lt;element name="ShipmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Pieces" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeightUnit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="L"/>
 *               &lt;enumeration value="K"/>
 *               &lt;enumeration value="G"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EstDlvyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="GlobalProductCode" type="{http://www.dhl.com/datatypes}GlobalProductCode" minOccurs="0"/>
 *         &lt;element name="ShipmentDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DlvyNotificationFlag" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Shipper" type="{http://www.dhl.com/datatypes}Shipper" minOccurs="0"/>
 *         &lt;element name="Consignee" type="{http://www.dhl.com/datatypes}Consignee" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="ShipmentEvent" type="{http://www.dhl.com/datatypes}ShipmentEvent" maxOccurs="unbounded"/>
 *           &lt;element name="ShipperReference" type="{http://www.dhl.com/datatypes}Reference"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentInfo", propOrder = {
    "originServiceArea",
    "destinationServiceArea",
    "shipperName",
    "shipperAccountNumber",
    "consigneeName",
    "shipmentDate",
    "pieces",
    "weight",
    "weightUnit",
    "estDlvyDate",
    "globalProductCode",
    "shipmentDesc",
    "dlvyNotificationFlag",
    "shipper",
    "consignee",
    "shipmentEvent",
    "shipperReference"
})
public class ShipmentInfo {

    @XmlElement(name = "OriginServiceArea", required = true)
    protected OriginServiceArea originServiceArea;
    @XmlElement(name = "DestinationServiceArea")
    protected DestinationServiceArea destinationServiceArea;
    @XmlElement(name = "ShipperName", required = true)
    protected String shipperName;
    @XmlElement(name = "ShipperAccountNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected Long shipperAccountNumber;
    @XmlElement(name = "ConsigneeName", required = true)
    protected String consigneeName;
    @XmlElement(name = "ShipmentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipmentDate;
    @XmlElement(name = "Pieces")
    protected Object pieces;
    @XmlElement(name = "Weight")
    protected String weight;
    @XmlElement(name = "WeightUnit")
    protected String weightUnit;
    @XmlElement(name = "EstDlvyDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estDlvyDate;
    @XmlElement(name = "GlobalProductCode")
    protected String globalProductCode;
    @XmlElement(name = "ShipmentDesc")
    protected String shipmentDesc;
    @XmlElement(name = "DlvyNotificationFlag")
    protected String dlvyNotificationFlag;
    @XmlElement(name = "Shipper")
    protected Shipper shipper;
    @XmlElement(name = "Consignee")
    protected Consignee consignee;
    @XmlElement(name = "ShipmentEvent")
    protected List<ShipmentEvent> shipmentEvent;
    @XmlElement(name = "ShipperReference")
    protected Reference shipperReference;

    /**
     * ��ȡoriginServiceArea���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OriginServiceArea }
     *     
     */
    public OriginServiceArea getOriginServiceArea() {
        return originServiceArea;
    }

    /**
     * ����originServiceArea���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OriginServiceArea }
     *     
     */
    public void setOriginServiceArea(OriginServiceArea value) {
        this.originServiceArea = value;
    }

    /**
     * ��ȡdestinationServiceArea���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DestinationServiceArea }
     *     
     */
    public DestinationServiceArea getDestinationServiceArea() {
        return destinationServiceArea;
    }

    /**
     * ����destinationServiceArea���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationServiceArea }
     *     
     */
    public void setDestinationServiceArea(DestinationServiceArea value) {
        this.destinationServiceArea = value;
    }

    /**
     * ��ȡshipperName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperName() {
        return shipperName;
    }

    /**
     * ����shipperName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperName(String value) {
        this.shipperName = value;
    }

    /**
     * ��ȡshipperAccountNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShipperAccountNumber() {
        return shipperAccountNumber;
    }

    /**
     * ����shipperAccountNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShipperAccountNumber(Long value) {
        this.shipperAccountNumber = value;
    }

    /**
     * ��ȡconsigneeName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeName() {
        return consigneeName;
    }

    /**
     * ����consigneeName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeName(String value) {
        this.consigneeName = value;
    }

    /**
     * ��ȡshipmentDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipmentDate() {
        return shipmentDate;
    }

    /**
     * ����shipmentDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipmentDate(XMLGregorianCalendar value) {
        this.shipmentDate = value;
    }

    /**
     * ��ȡpieces���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPieces() {
        return pieces;
    }

    /**
     * ����pieces���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPieces(Object value) {
        this.pieces = value;
    }

    /**
     * ��ȡweight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * ����weight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * ��ȡweightUnit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * ����weightUnit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightUnit(String value) {
        this.weightUnit = value;
    }

    /**
     * ��ȡestDlvyDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstDlvyDate() {
        return estDlvyDate;
    }

    /**
     * ����estDlvyDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstDlvyDate(XMLGregorianCalendar value) {
        this.estDlvyDate = value;
    }

    /**
     * ��ȡglobalProductCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalProductCode() {
        return globalProductCode;
    }

    /**
     * ����globalProductCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalProductCode(String value) {
        this.globalProductCode = value;
    }

    /**
     * ��ȡshipmentDesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentDesc() {
        return shipmentDesc;
    }

    /**
     * ����shipmentDesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentDesc(String value) {
        this.shipmentDesc = value;
    }

    /**
     * ��ȡdlvyNotificationFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvyNotificationFlag() {
        return dlvyNotificationFlag;
    }

    /**
     * ����dlvyNotificationFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvyNotificationFlag(String value) {
        this.dlvyNotificationFlag = value;
    }

    /**
     * ��ȡshipper���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Shipper }
     *     
     */
    public Shipper getShipper() {
        return shipper;
    }

    /**
     * ����shipper���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Shipper }
     *     
     */
    public void setShipper(Shipper value) {
        this.shipper = value;
    }

    /**
     * ��ȡconsignee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Consignee }
     *     
     */
    public Consignee getConsignee() {
        return consignee;
    }

    /**
     * ����consignee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Consignee }
     *     
     */
    public void setConsignee(Consignee value) {
        this.consignee = value;
    }

    /**
     * Gets the value of the shipmentEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentEvent }
     * 
     * 
     */
    public List<ShipmentEvent> getShipmentEvent() {
        if (shipmentEvent == null) {
            shipmentEvent = new ArrayList<ShipmentEvent>();
        }
        return this.shipmentEvent;
    }

    /**
     * ��ȡshipperReference���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getShipperReference() {
        return shipperReference;
    }

    /**
     * ����shipperReference���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setShipperReference(Reference value) {
        this.shipperReference = value;
    }

}
