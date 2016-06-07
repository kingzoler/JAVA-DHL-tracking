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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PieceInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PieceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PieceDetails" type="{http://www.dhl.com/datatypes}PieceDetails"/>
 *         &lt;element name="PieceEvent" type="{http://www.dhl.com/datatypes}PieceEvent" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PieceInfo", propOrder = {
    "pieceDetails",
    "pieceEvent"
})
public class PieceInfo {

    @XmlElement(name = "PieceDetails", required = true)
    protected PieceDetails pieceDetails;
    @XmlElement(name = "PieceEvent", required = true)
    protected List<PieceEvent> pieceEvent;

    /**
     * ��ȡpieceDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PieceDetails }
     *     
     */
    public PieceDetails getPieceDetails() {
        return pieceDetails;
    }

    /**
     * ����pieceDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PieceDetails }
     *     
     */
    public void setPieceDetails(PieceDetails value) {
        this.pieceDetails = value;
    }

    /**
     * Gets the value of the pieceEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pieceEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPieceEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PieceEvent }
     * 
     * 
     */
    public List<PieceEvent> getPieceEvent() {
        if (pieceEvent == null) {
            pieceEvent = new ArrayList<PieceEvent>();
        }
        return this.pieceEvent;
    }

}
