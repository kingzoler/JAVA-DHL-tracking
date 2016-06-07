//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.24 ʱ�� 03:31:48 PM CST 
//


package tracking.dhl;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShipValResponsePiece complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ShipValResponsePiece">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PieceNumber" type="{http://www.dhl.com/datatypes}PieceNumber"/>
 *         &lt;element name="Depth" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://www.dhl.com/datatypes}Weight" minOccurs="0"/>
 *         &lt;element name="PackageType" type="{http://www.dhl.com/datatypes}PackageType" minOccurs="0"/>
 *         &lt;element name="DimWeight" type="{http://www.dhl.com/datatypes}Weight" minOccurs="0"/>
 *         &lt;element name="PieceContents" type="{http://www.dhl.com/datatypes}PieceContents" minOccurs="0"/>
 *         &lt;element name="DataIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LicensePlate" type="{http://www.dhl.com/datatypes}PieceID"/>
 *         &lt;element name="LicensePlateBarCode" type="{http://www.dhl.com/datatypes}BarCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipValResponsePiece", propOrder = {
    "pieceNumber",
    "depth",
    "width",
    "height",
    "weight",
    "packageType",
    "dimWeight",
    "pieceContents",
    "dataIdentifier",
    "licensePlate",
    "licensePlateBarCode"
})
public class ShipValResponsePiece {

    @XmlElement(name = "PieceNumber", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger pieceNumber;
    @XmlElement(name = "Depth")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger depth;
    @XmlElement(name = "Width")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger width;
    @XmlElement(name = "Height")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger height;
    @XmlElement(name = "Weight")
    protected BigDecimal weight;
    @XmlElement(name = "PackageType")
    @XmlSchemaType(name = "string")
    protected PackageType packageType;
    @XmlElement(name = "DimWeight")
    protected BigDecimal dimWeight;
    @XmlElement(name = "PieceContents")
    protected String pieceContents;
    @XmlElement(name = "DataIdentifier", required = true)
    protected String dataIdentifier;
    @XmlElement(name = "LicensePlate", required = true)
    protected String licensePlate;
    @XmlElement(name = "LicensePlateBarCode", required = true)
    protected byte[] licensePlateBarCode;

    /**
     * ��ȡpieceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPieceNumber() {
        return pieceNumber;
    }

    /**
     * ����pieceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPieceNumber(BigInteger value) {
        this.pieceNumber = value;
    }

    /**
     * ��ȡdepth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepth() {
        return depth;
    }

    /**
     * ����depth���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepth(BigInteger value) {
        this.depth = value;
    }

    /**
     * ��ȡwidth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWidth() {
        return width;
    }

    /**
     * ����width���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWidth(BigInteger value) {
        this.width = value;
    }

    /**
     * ��ȡheight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeight() {
        return height;
    }

    /**
     * ����height���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeight(BigInteger value) {
        this.height = value;
    }

    /**
     * ��ȡweight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * ����weight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDimWeight() {
        return dimWeight;
    }

    /**
     * ����dimWeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDimWeight(BigDecimal value) {
        this.dimWeight = value;
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

    /**
     * ��ȡdataIdentifier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataIdentifier() {
        return dataIdentifier;
    }

    /**
     * ����dataIdentifier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataIdentifier(String value) {
        this.dataIdentifier = value;
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
     * ��ȡlicensePlateBarCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLicensePlateBarCode() {
        return licensePlateBarCode;
    }

    /**
     * ����licensePlateBarCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLicensePlateBarCode(byte[] value) {
        this.licensePlateBarCode = value;
    }

}
