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


/**
 * <p>ExportDeclaration complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ExportDeclaration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterConsignee" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="70"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IsPartiesRelation" type="{http://www.dhl.com/datatypes}YesNo" minOccurs="0"/>
 *         &lt;element name="ECCN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SignatureName" type="{http://www.dhl.com/datatypes}SignatureName" minOccurs="0"/>
 *         &lt;element name="SignatureTitle" type="{http://www.dhl.com/datatypes}SignatureTitle" minOccurs="0"/>
 *         &lt;element name="ExportReason" type="{http://www.dhl.com/datatypes}ExportReason" minOccurs="0"/>
 *         &lt;element name="ExportReasonCode" type="{http://www.dhl.com/datatypes}ExportReasonCode" minOccurs="0"/>
 *         &lt;element name="SedNumber" type="{http://www.dhl.com/datatypes}SEDNumber" minOccurs="0"/>
 *         &lt;element name="SedNumberType" type="{http://www.dhl.com/datatypes}SEDNumberType" minOccurs="0"/>
 *         &lt;element name="MxStateCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExportLineItem" type="{http://www.dhl.com/datatypes}ExportLineItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportDeclaration", propOrder = {
    "interConsignee",
    "isPartiesRelation",
    "eccn",
    "signatureName",
    "signatureTitle",
    "exportReason",
    "exportReasonCode",
    "sedNumber",
    "sedNumberType",
    "mxStateCode",
    "exportLineItem"
})
public class ExportDeclaration {

    @XmlElement(name = "InterConsignee")
    protected String interConsignee;
    @XmlElement(name = "IsPartiesRelation")
    @XmlSchemaType(name = "string")
    protected YesNo isPartiesRelation;
    @XmlElement(name = "ECCN")
    protected String eccn;
    @XmlElement(name = "SignatureName")
    protected String signatureName;
    @XmlElement(name = "SignatureTitle")
    protected String signatureTitle;
    @XmlElement(name = "ExportReason")
    protected String exportReason;
    @XmlElement(name = "ExportReasonCode")
    @XmlSchemaType(name = "string")
    protected ExportReasonCode exportReasonCode;
    @XmlElement(name = "SedNumber")
    @XmlSchemaType(name = "string")
    protected SEDNumber sedNumber;
    @XmlElement(name = "SedNumberType")
    @XmlSchemaType(name = "string")
    protected SEDNumberType sedNumberType;
    @XmlElement(name = "MxStateCode")
    protected String mxStateCode;
    @XmlElement(name = "ExportLineItem", required = true)
    protected List<ExportLineItem> exportLineItem;

    /**
     * ��ȡinterConsignee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterConsignee() {
        return interConsignee;
    }

    /**
     * ����interConsignee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterConsignee(String value) {
        this.interConsignee = value;
    }

    /**
     * ��ȡisPartiesRelation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getIsPartiesRelation() {
        return isPartiesRelation;
    }

    /**
     * ����isPartiesRelation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setIsPartiesRelation(YesNo value) {
        this.isPartiesRelation = value;
    }

    /**
     * ��ȡeccn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECCN() {
        return eccn;
    }

    /**
     * ����eccn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECCN(String value) {
        this.eccn = value;
    }

    /**
     * ��ȡsignatureName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureName() {
        return signatureName;
    }

    /**
     * ����signatureName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureName(String value) {
        this.signatureName = value;
    }

    /**
     * ��ȡsignatureTitle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureTitle() {
        return signatureTitle;
    }

    /**
     * ����signatureTitle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureTitle(String value) {
        this.signatureTitle = value;
    }

    /**
     * ��ȡexportReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportReason() {
        return exportReason;
    }

    /**
     * ����exportReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportReason(String value) {
        this.exportReason = value;
    }

    /**
     * ��ȡexportReasonCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ExportReasonCode }
     *     
     */
    public ExportReasonCode getExportReasonCode() {
        return exportReasonCode;
    }

    /**
     * ����exportReasonCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ExportReasonCode }
     *     
     */
    public void setExportReasonCode(ExportReasonCode value) {
        this.exportReasonCode = value;
    }

    /**
     * ��ȡsedNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SEDNumber }
     *     
     */
    public SEDNumber getSedNumber() {
        return sedNumber;
    }

    /**
     * ����sedNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SEDNumber }
     *     
     */
    public void setSedNumber(SEDNumber value) {
        this.sedNumber = value;
    }

    /**
     * ��ȡsedNumberType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SEDNumberType }
     *     
     */
    public SEDNumberType getSedNumberType() {
        return sedNumberType;
    }

    /**
     * ����sedNumberType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SEDNumberType }
     *     
     */
    public void setSedNumberType(SEDNumberType value) {
        this.sedNumberType = value;
    }

    /**
     * ��ȡmxStateCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMxStateCode() {
        return mxStateCode;
    }

    /**
     * ����mxStateCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMxStateCode(String value) {
        this.mxStateCode = value;
    }

    /**
     * Gets the value of the exportLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExportLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportLineItem }
     * 
     * 
     */
    public List<ExportLineItem> getExportLineItem() {
        if (exportLineItem == null) {
            exportLineItem = new ArrayList<ExportLineItem>();
        }
        return this.exportLineItem;
    }

}
