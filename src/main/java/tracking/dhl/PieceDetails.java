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


/**
 * <p>PieceDetails complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PieceDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AWBNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LicensePlate" type="{http://www.dhl.com/datatypes}TrackingPieceID"/>
 *         &lt;element name="PieceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActualDepth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActualWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActualHeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActualWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Depth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageType" type="{http://www.dhl.com/datatypes}PackageType" minOccurs="0"/>
 *         &lt;element name="DimWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeightUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PieceContents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PieceDetails", propOrder = {
    "awbNumber",
    "licensePlate",
    "pieceNumber",
    "actualDepth",
    "actualWidth",
    "actualHeight",
    "actualWeight",
    "depth",
    "width",
    "height",
    "weight",
    "packageType",
    "dimWeight",
    "weightUnit",
    "pieceContents"
})
public class PieceDetails {

    @XmlElement(name = "AWBNumber", required = true)
    protected String awbNumber;
    @XmlElement(name = "LicensePlate", required = true)
    protected String licensePlate;
    @XmlElement(name = "PieceNumber")
    protected String pieceNumber;
    @XmlElement(name = "ActualDepth")
    protected String actualDepth;
    @XmlElement(name = "ActualWidth")
    protected String actualWidth;
    @XmlElement(name = "ActualHeight")
    protected String actualHeight;
    @XmlElement(name = "ActualWeight")
    protected String actualWeight;
    @XmlElement(name = "Depth")
    protected String depth;
    @XmlElement(name = "Width")
    protected String width;
    @XmlElement(name = "Height")
    protected String height;
    @XmlElement(name = "Weight")
    protected String weight;
    @XmlElement(name = "PackageType")
    @XmlSchemaType(name = "string")
    protected PackageType packageType;
    @XmlElement(name = "DimWeight")
    protected String dimWeight;
    @XmlElement(name = "WeightUnit")
    protected String weightUnit;
    @XmlElement(name = "PieceContents")
    protected String pieceContents;

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
     * ��ȡlicensePlate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * ����licensePlate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicensePlate(String value) {
        this.licensePlate = value;
    }

    /**
     * ��ȡpieceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPieceNumber() {
        return pieceNumber;
    }

    /**
     * ����pieceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPieceNumber(String value) {
        this.pieceNumber = value;
    }

    /**
     * ��ȡactualDepth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualDepth() {
        return actualDepth;
    }

    /**
     * ����actualDepth���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualDepth(String value) {
        this.actualDepth = value;
    }

    /**
     * ��ȡactualWidth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualWidth() {
        return actualWidth;
    }

    /**
     * ����actualWidth���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualWidth(String value) {
        this.actualWidth = value;
    }

    /**
     * ��ȡactualHeight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualHeight() {
        return actualHeight;
    }

    /**
     * ����actualHeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualHeight(String value) {
        this.actualHeight = value;
    }

    /**
     * ��ȡactualWeight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualWeight() {
        return actualWeight;
    }

    /**
     * ����actualWeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualWeight(String value) {
        this.actualWeight = value;
    }

    /**
     * ��ȡdepth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepth() {
        return depth;
    }

    /**
     * ����depth���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepth(String value) {
        this.depth = value;
    }

    /**
     * ��ȡwidth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * ����width���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * ��ȡheight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * ����height���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
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
     * ��ȡpackageType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PackageType }
     *     
     */
    public PackageType getPackageType() {
        return packageType;
    }

    /**
     * ����packageType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PackageType }
     *     
     */
    public void setPackageType(PackageType value) {
        this.packageType = value;
    }

    /**
     * ��ȡdimWeight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimWeight() {
        return dimWeight;
    }

    /**
     * ����dimWeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimWeight(String value) {
        this.dimWeight = value;
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
     * ��ȡpieceContents���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPieceContents() {
        return pieceContents;
    }

    /**
     * ����pieceContents���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPieceContents(String value) {
        this.pieceContents = value;
    }

}
