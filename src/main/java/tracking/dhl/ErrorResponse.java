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
 * Generic response header
 * 
 * <p>ErrorResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ErrorResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceHeader" type="{http://www.dhl.com/datatypes}ServiceHeader"/>
 *         &lt;element name="Status" type="{http://www.dhl.com/datatypes}Status"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorResponse", propOrder = {
    "serviceHeader",
    "status"
})
public class ErrorResponse {

    @XmlElement(name = "ServiceHeader", required = true)
    protected ServiceHeader serviceHeader;
    @XmlElement(name = "Status", required = true)
    protected Status status;

    /**
     * ��ȡserviceHeader���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ServiceHeader }
     *     
     */
    public ServiceHeader getServiceHeader() {
        return serviceHeader;
    }

    /**
     * ����serviceHeader���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceHeader }
     *     
     */
    public void setServiceHeader(ServiceHeader value) {
        this.serviceHeader = value;
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

}
