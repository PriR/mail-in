
package be.alphacredit.mailin;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cosigner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cosigner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://getcreditdetails.wsbeans.iseries/}addressDf" minOccurs="0"/&gt;
 *         &lt;element name="bankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="civilState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debtorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDSR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobilePhoneNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nationalRegisterNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nrCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="professionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vatNr" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cosigner", propOrder = {
    "address",
    "bankAccount",
    "birthDate",
    "civilState",
    "debtorCode",
    "email",
    "firstName",
    "idsr",
    "language",
    "lastName",
    "mobilePhoneNr",
    "nationalRegisterNumber",
    "nationality",
    "nrCardId",
    "phoneNumber",
    "professionCode",
    "sexCode",
    "tpPerson",
    "vatNr"
})
public class Cosigner {

    protected AddressDf address;
    protected String bankAccount;
    protected BigDecimal birthDate;
    protected String civilState;
    protected String debtorCode;
    protected String email;
    protected String firstName;
    @XmlElement(name = "IDSR")
    protected String idsr;
    protected String language;
    protected String lastName;
    protected String mobilePhoneNr;
    protected BigDecimal nationalRegisterNumber;
    protected String nationality;
    protected String nrCardId;
    protected String phoneNumber;
    protected String professionCode;
    protected String sexCode;
    protected String tpPerson;
    protected BigDecimal vatNr;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDf }
     *     
     */
    public AddressDf getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDf }
     *     
     */
    public void setAddress(AddressDf value) {
        this.address = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccount(String value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBirthDate(BigDecimal value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the civilState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivilState() {
        return civilState;
    }

    /**
     * Sets the value of the civilState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivilState(String value) {
        this.civilState = value;
    }

    /**
     * Gets the value of the debtorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorCode() {
        return debtorCode;
    }

    /**
     * Sets the value of the debtorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorCode(String value) {
        this.debtorCode = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the idsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDSR() {
        return idsr;
    }

    /**
     * Sets the value of the idsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDSR(String value) {
        this.idsr = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the mobilePhoneNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneNr() {
        return mobilePhoneNr;
    }

    /**
     * Sets the value of the mobilePhoneNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneNr(String value) {
        this.mobilePhoneNr = value;
    }

    /**
     * Gets the value of the nationalRegisterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNationalRegisterNumber() {
        return nationalRegisterNumber;
    }

    /**
     * Sets the value of the nationalRegisterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNationalRegisterNumber(BigDecimal value) {
        this.nationalRegisterNumber = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the nrCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrCardId() {
        return nrCardId;
    }

    /**
     * Sets the value of the nrCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrCardId(String value) {
        this.nrCardId = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the professionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionCode() {
        return professionCode;
    }

    /**
     * Sets the value of the professionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionCode(String value) {
        this.professionCode = value;
    }

    /**
     * Gets the value of the sexCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexCode() {
        return sexCode;
    }

    /**
     * Sets the value of the sexCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexCode(String value) {
        this.sexCode = value;
    }

    /**
     * Gets the value of the tpPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpPerson() {
        return tpPerson;
    }

    /**
     * Sets the value of the tpPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpPerson(String value) {
        this.tpPerson = value;
    }

    /**
     * Gets the value of the vatNr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatNr() {
        return vatNr;
    }

    /**
     * Sets the value of the vatNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatNr(BigDecimal value) {
        this.vatNr = value;
    }

}
