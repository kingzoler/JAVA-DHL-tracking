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
 * <p>Shipper complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Shipper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipperID" type="{http://www.dhl.com/datatypes}ShipperID"/>
 *         &lt;element name="CompanyName" type="{http://www.dhl.com/datatypes}CompanyNameValidator"/>
 *         &lt;element name="RegisteredAccount" type="{http://www.dhl.com/datatypes}AccountNumber"/>
 *         &lt;element name="AddressLine" type="{http://www.dhl.com/datatypes}AddressLine" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.dhl.com/datatypes}City"/>
 *         &lt;element name="Division" type="{http://www.dhl.com/datatypes}Division"/>
 *         &lt;element name="DivisionCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PostalCode" type="{http://www.dhl.com/datatypes}PostalCode"/>
 *         &lt;element name="OriginServiceAreaCode" type="{http://www.dhl.com/datatypes}OriginServiceAreaCode" minOccurs="0"/>
 *         &lt;element name="OriginFacilityCode" type="{http://www.dhl.com/datatypes}OriginFacilityCode" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.dhl.com/datatypes}CountryCode"/>
 *         &lt;element name="CountryName" type="{http://www.dhl.com/datatypes}CountryName"/>
 *         &lt;element name="FederalTaxId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StateTaxId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Contact" type="{http://www.dhl.com/datatypes}Contact"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shipper", propOrder = {
    "shipperID",
    "companyName",
    "registeredAccount",
    "addressLine",
    "city",
    "division",
    "divisionCode",
    "postalCode",
    "originServiceAreaCode",
    "originFacilityCode",
    "countryCode",
    "countryName",
    "federalTaxId",
    "stateTaxId",
    "contact"
})
public class Shipper {

    @XmlElement(name = "ShipperID", required = true)
    protected String shipperID;
    @XmlElement(name = "CompanyName", required = true)
    protected String companyName;
    @XmlElement(name = "RegisteredAccount")
    @XmlSchemaType(name = "positiveInteger")
    protected long registeredAccount;
    @XmlElement(name = "AddressLine")
    protected List<String> addressLine;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "Division", required = true)
    protected String division;
    @XmlElement(name = "DivisionCode")
    protected String divisionCode;
    @XmlElement(name = "PostalCode", required = true)
    protected String postalCode;
    @XmlElement(name = "OriginServiceAreaCode")
    protected String originServiceAreaCode;
    @XmlElement(name = "OriginFacilityCode")
    protected String originFacilityCode;
    @XmlElement(name = "CountryCode", required = true)
    protected String countryCode;
    @XmlElement(name = "CountryName", required = true)
    protected String countryName;
    @XmlElement(name = "FederalTaxId")
    protected String federalTaxId;
    @XmlElement(name = "StateTaxId")
    protected String stateTaxId;
    @XmlElement(name = "Contact", required = true)
    protected Contact contact;

    /**
     * ��ȡshipperID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperID() {
        return shipperID;
    }

    /**
     * ����shipperID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperID(String value) {
        this.shipperID = value;
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
     * ��ȡregisteredAccount���Ե�ֵ��
     * 
     */
    public long getRegisteredAccount() {
        return registeredAccount;
    }

    /**
     * ����registeredAccount���Ե�ֵ��
     * 
     */
    public void setRegisteredAccount(long value) {
        this.registeredAccount = value;
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

    /**
     * ��ȡoriginServiceAreaCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginServiceAreaCode() {
        return originServiceAreaCode;
    }

    /**
     * ����originServiceAreaCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginServiceAreaCode(String value) {
        this.originServiceAreaCode = value;
    }

    /**
     * ��ȡoriginFacilityCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginFacilityCode() {
        return originFacilityCode;
    }

    /**
     * ����originFacilityCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginFacilityCode(String value) {
        this.originFacilityCode = value;
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
     * ��ȡcountryName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * ����countryName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * ��ȡfederalTaxId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalTaxId() {
        return federalTaxId;
    }

    /**
     * ����federalTaxId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalTaxId(String value) {
        this.federalTaxId = value;
    }

    /**
     * ��ȡstateTaxId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateTaxId() {
        return stateTaxId;
    }

    /**
     * ����stateTaxId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateTaxId(String value) {
        this.stateTaxId = value;
    }

    /**
     * ��ȡcontact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * ����contact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

}
