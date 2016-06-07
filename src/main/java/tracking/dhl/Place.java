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
 * <p>Place complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Place">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResidenceOrBusiness" type="{http://www.dhl.com/datatypes}ResidenceOrBusiness" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.dhl.com/datatypes}CompanyNameValidator" minOccurs="0"/>
 *         &lt;element name="AddressLine" type="{http://www.dhl.com/datatypes}AddressLine" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.dhl.com/datatypes}City"/>
 *         &lt;element name="CountryCode" type="{http://www.dhl.com/datatypes}CountryCode"/>
 *         &lt;element name="DivisionCode" type="{http://www.dhl.com/datatypes}StateCode" minOccurs="0"/>
 *         &lt;element name="Division" type="{http://www.dhl.com/datatypes}State"/>
 *         &lt;element name="PostalCode" type="{http://www.dhl.com/datatypes}PostalCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Place", propOrder = {
    "residenceOrBusiness",
    "companyName",
    "addressLine",
    "city",
    "countryCode",
    "divisionCode",
    "division",
    "postalCode"
})
public class Place {

    @XmlElement(name = "ResidenceOrBusiness")
    @XmlSchemaType(name = "string")
    protected ResidenceOrBusiness residenceOrBusiness;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "AddressLine")
    protected List<String> addressLine;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "CountryCode", required = true)
    protected String countryCode;
    @XmlElement(name = "DivisionCode")
    protected String divisionCode;
    @XmlElement(name = "Division", required = true)
    protected String division;
    @XmlElement(name = "PostalCode", required = true)
    protected String postalCode;

    /**
     * ��ȡresidenceOrBusiness���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResidenceOrBusiness }
     *     
     */
    public ResidenceOrBusiness getResidenceOrBusiness() {
        return residenceOrBusiness;
    }

    /**
     * ����residenceOrBusiness���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceOrBusiness }
     *     
     */
    public void setResidenceOrBusiness(ResidenceOrBusiness value) {
        this.residenceOrBusiness = value;
    }

    /**
     * ��ȡcompanyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * ����companyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the addressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<String>();
        }
        return this.addressLine;
    }

    /**
     * ��ȡcity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * ����city���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * ��ȡcountryCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * ����countryCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * ��ȡdivisionCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivisionCode() {
        return divisionCode;
    }

    /**
     * ����divisionCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivisionCode(String value) {
        this.divisionCode = value;
    }

    /**
     * ��ȡdivision���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * ����division���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * ��ȡpostalCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * ����postalCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

}
