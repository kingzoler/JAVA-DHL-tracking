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
 * <p>PieceFault complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PieceFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PieceID" type="{http://www.dhl.com/datatypes}TrackingPieceID"/>
 *         &lt;element name="ConditionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConditionData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PieceFault", propOrder = {
    "pieceID",
    "conditionCode",
    "conditionData"
})
public class PieceFault {

    @XmlElement(name = "PieceID", required = true)
    protected String pieceID;
    @XmlElement(name = "ConditionCode", required = true)
    protected String conditionCode;
    @XmlElement(name = "ConditionData", required = true)
    protected String conditionData;

    /**
     * ��ȡpieceID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPieceID() {
        return pieceID;
    }

    /**
     * ����pieceID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPieceID(String value) {
        this.pieceID = value;
    }

    /**
     * ��ȡconditionCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionCode() {
        return conditionCode;
    }

    /**
     * ����conditionCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionCode(String value) {
        this.conditionCode = value;
    }

    /**
     * ��ȡconditionData���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionData() {
        return conditionData;
    }

    /**
     * ����conditionData���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionData(String value) {
        this.conditionData = value;
    }

}
