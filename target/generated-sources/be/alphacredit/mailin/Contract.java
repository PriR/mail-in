
package be.alphacredit.mailin;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contract"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="brandDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="catalogPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="chassisNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeGoal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeInstrument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateCreation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="dateExpectedDel" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="dateNBB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="entity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="goalDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indCtrlCession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indCtrlConsentement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indCtrlContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indCtrlDeliveryMandate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indCtrlDemandForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indCtrlIdentityCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indCtrlInsurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indCtrlInvoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indCtrlOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indCtrlProofOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indCtrlSepa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indCtrlTakeoverCommit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indCtrlUBO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="internalNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanNet" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="productDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remarkLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remarkLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remarkLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract", propOrder = {
    "brand",
    "brandDescription",
    "cashPrice",
    "catalogPrice",
    "chassisNR",
    "codeGoal",
    "codeInstrument",
    "creditType",
    "dateCreation",
    "dateExpectedDel",
    "dateNBB",
    "entity",
    "goalDescription",
    "indCtrlCession",
    "indCtrlConsentement",
    "indCtrlContract",
    "indCtrlDeliveryMandate",
    "indCtrlDemandForm",
    "indCtrlIdentityCard",
    "indCtrlInsurance",
    "indCtrlInvoice",
    "indCtrlOther",
    "indCtrlProofOfResidence",
    "indCtrlSepa",
    "indCtrlTakeoverCommit",
    "indCtrlUBO",
    "internalNote",
    "invoiceNR",
    "loanNet",
    "model",
    "objectCode",
    "offerNumber",
    "productDescription",
    "remarkLine1",
    "remarkLine2",
    "remarkLine3",
    "statusAccount",
    "version"
})
public class Contract {

    protected String brand;
    protected String brandDescription;
    protected BigDecimal cashPrice;
    protected BigDecimal catalogPrice;
    protected String chassisNR;
    protected String codeGoal;
    protected String codeInstrument;
    protected String creditType;
    protected BigDecimal dateCreation;
    protected BigDecimal dateExpectedDel;
    protected BigDecimal dateNBB;
    protected String entity;
    protected String goalDescription;
    protected String indCtrlCession;
    protected String indCtrlConsentement;
    protected String indCtrlContract;
    protected String indCtrlDeliveryMandate;
    protected String indCtrlDemandForm;
    protected String indCtrlIdentityCard;
    protected String indCtrlInsurance;
    protected String indCtrlInvoice;
    protected String indCtrlOther;
    protected String indCtrlProofOfResidence;
    protected String indCtrlSepa;
    protected String indCtrlTakeoverCommit;
    protected String indCtrlUBO;
    protected String internalNote;
    protected String invoiceNR;
    protected BigDecimal loanNet;
    protected String model;
    protected String objectCode;
    protected BigDecimal offerNumber;
    protected String productDescription;
    protected String remarkLine1;
    protected String remarkLine2;
    protected String remarkLine3;
    protected String statusAccount;
    protected String version;

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the brandDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandDescription() {
        return brandDescription;
    }

    /**
     * Sets the value of the brandDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandDescription(String value) {
        this.brandDescription = value;
    }

    /**
     * Gets the value of the cashPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashPrice() {
        return cashPrice;
    }

    /**
     * Sets the value of the cashPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashPrice(BigDecimal value) {
        this.cashPrice = value;
    }

    /**
     * Gets the value of the catalogPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCatalogPrice() {
        return catalogPrice;
    }

    /**
     * Sets the value of the catalogPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCatalogPrice(BigDecimal value) {
        this.catalogPrice = value;
    }

    /**
     * Gets the value of the chassisNR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassisNR() {
        return chassisNR;
    }

    /**
     * Sets the value of the chassisNR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassisNR(String value) {
        this.chassisNR = value;
    }

    /**
     * Gets the value of the codeGoal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeGoal() {
        return codeGoal;
    }

    /**
     * Sets the value of the codeGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeGoal(String value) {
        this.codeGoal = value;
    }

    /**
     * Gets the value of the codeInstrument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeInstrument() {
        return codeInstrument;
    }

    /**
     * Sets the value of the codeInstrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeInstrument(String value) {
        this.codeInstrument = value;
    }

    /**
     * Gets the value of the creditType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditType() {
        return creditType;
    }

    /**
     * Sets the value of the creditType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditType(String value) {
        this.creditType = value;
    }

    /**
     * Gets the value of the dateCreation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDateCreation() {
        return dateCreation;
    }

    /**
     * Sets the value of the dateCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDateCreation(BigDecimal value) {
        this.dateCreation = value;
    }

    /**
     * Gets the value of the dateExpectedDel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDateExpectedDel() {
        return dateExpectedDel;
    }

    /**
     * Sets the value of the dateExpectedDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDateExpectedDel(BigDecimal value) {
        this.dateExpectedDel = value;
    }

    /**
     * Gets the value of the dateNBB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDateNBB() {
        return dateNBB;
    }

    /**
     * Sets the value of the dateNBB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDateNBB(BigDecimal value) {
        this.dateNBB = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity(String value) {
        this.entity = value;
    }

    /**
     * Gets the value of the goalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalDescription() {
        return goalDescription;
    }

    /**
     * Sets the value of the goalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalDescription(String value) {
        this.goalDescription = value;
    }

    /**
     * Gets the value of the indCtrlCession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCtrlCession() {
        return indCtrlCession;
    }

    /**
     * Sets the value of the indCtrlCession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCtrlCession(String value) {
        this.indCtrlCession = value;
    }

    /**
     * Gets the value of the indCtrlConsentement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCtrlConsentement() {
        return indCtrlConsentement;
    }

    /**
     * Sets the value of the indCtrlConsentement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCtrlConsentement(String value) {
        this.indCtrlConsentement = value;
    }

    /**
     * Gets the value of the indCtrlContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCtrlContract() {
        return indCtrlContract;
    }

    /**
     * Sets the value of the indCtrlContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCtrlContract(String value) {
        this.indCtrlContract = value;
    }

    /**
     * Gets the value of the indCtrlDeliveryMandate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCtrlDeliveryMandate() {
        return indCtrlDeliveryMandate;
    }

    /**
     * Sets the value of the indCtrlDeliveryMandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCtrlDeliveryMandate(String value) {
        this.indCtrlDeliveryMandate = value;
    }

    /**
     * Gets the value of the indCtrlDemandForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCtrlDemandForm() {
        return indCtrlDemandForm;
    }

    /**
     * Sets the value of the indCtrlDemandForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCtrlDemandForm(String value) {
        this.indCtrlDemandForm = value;
    }

    /**
     * Gets the value of the indCtrlIdentityCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCtrlIdentityCard() {
        return indCtrlIdentityCard;
    }

    /**
     * Sets the value of the indCtrlIdentityCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCtrlIdentityCard(String value) {
        this.indCtrlIdentityCard = value;
    }

    /**
     * Gets the value of the indCtrlInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCtrlInsurance() {
        return indCtrlInsurance;
    }

    /**
     * Sets the value of the indCtrlInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCtrlInsurance(String value) {
        this.indCtrlInsurance = value;
    }

    /**
     * Gets the value of the indCtrlInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCtrlInvoice() {
        return indCtrlInvoice;
    }

    /**
     * Sets the value of the indCtrlInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCtrlInvoice(String value) {
        this.indCtrlInvoice = value;
    }

    /**
     * Gets the value of the indCtrlOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCtrlOther() {
        return indCtrlOther;
    }

    /**
     * Sets the value of the indCtrlOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCtrlOther(String value) {
        this.indCtrlOther = value;
    }

    /**
     * Gets the value of the indCtrlProofOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCtrlProofOfResidence() {
        return indCtrlProofOfResidence;
    }

    /**
     * Sets the value of the indCtrlProofOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCtrlProofOfResidence(String value) {
        this.indCtrlProofOfResidence = value;
    }

    /**
     * Gets the value of the indCtrlSepa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCtrlSepa() {
        return indCtrlSepa;
    }

    /**
     * Sets the value of the indCtrlSepa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCtrlSepa(String value) {
        this.indCtrlSepa = value;
    }

    /**
     * Gets the value of the indCtrlTakeoverCommit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCtrlTakeoverCommit() {
        return indCtrlTakeoverCommit;
    }

    /**
     * Sets the value of the indCtrlTakeoverCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCtrlTakeoverCommit(String value) {
        this.indCtrlTakeoverCommit = value;
    }

    /**
     * Gets the value of the indCtrlUBO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCtrlUBO() {
        return indCtrlUBO;
    }

    /**
     * Sets the value of the indCtrlUBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCtrlUBO(String value) {
        this.indCtrlUBO = value;
    }

    /**
     * Gets the value of the internalNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalNote() {
        return internalNote;
    }

    /**
     * Sets the value of the internalNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalNote(String value) {
        this.internalNote = value;
    }

    /**
     * Gets the value of the invoiceNR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNR() {
        return invoiceNR;
    }

    /**
     * Sets the value of the invoiceNR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNR(String value) {
        this.invoiceNR = value;
    }

    /**
     * Gets the value of the loanNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanNet() {
        return loanNet;
    }

    /**
     * Sets the value of the loanNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanNet(BigDecimal value) {
        this.loanNet = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the objectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectCode() {
        return objectCode;
    }

    /**
     * Sets the value of the objectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectCode(String value) {
        this.objectCode = value;
    }

    /**
     * Gets the value of the offerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfferNumber() {
        return offerNumber;
    }

    /**
     * Sets the value of the offerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfferNumber(BigDecimal value) {
        this.offerNumber = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the remarkLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkLine1() {
        return remarkLine1;
    }

    /**
     * Sets the value of the remarkLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkLine1(String value) {
        this.remarkLine1 = value;
    }

    /**
     * Gets the value of the remarkLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkLine2() {
        return remarkLine2;
    }

    /**
     * Sets the value of the remarkLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkLine2(String value) {
        this.remarkLine2 = value;
    }

    /**
     * Gets the value of the remarkLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkLine3() {
        return remarkLine3;
    }

    /**
     * Sets the value of the remarkLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkLine3(String value) {
        this.remarkLine3 = value;
    }

    /**
     * Gets the value of the statusAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusAccount() {
        return statusAccount;
    }

    /**
     * Sets the value of the statusAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusAccount(String value) {
        this.statusAccount = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
