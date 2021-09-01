
package be.alphacredit.mailin;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subControlP1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subControlP1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debtorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documentTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expectedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="manualReviewDashboard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceDocument" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subcontrolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updatable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subControlP1", propOrder = {
    "controlId",
    "debtorCode",
    "description",
    "documentType",
    "documentTypeDescription",
    "expectedValue",
    "manualReviewDashboard",
    "referenceDocument",
    "status",
    "subcontrolId",
    "updatable"
})
public class SubControlP1 {

    protected String controlId;
    protected String debtorCode;
    protected String description;
    protected String documentType;
    protected String documentTypeDescription;
    protected String expectedValue;
    protected String manualReviewDashboard;
    protected BigDecimal referenceDocument;
    protected String status;
    protected String subcontrolId;
    protected String updatable;

    /**
     * Gets the value of the controlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlId() {
        return controlId;
    }

    /**
     * Sets the value of the controlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlId(String value) {
        this.controlId = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the documentTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypeDescription() {
        return documentTypeDescription;
    }

    /**
     * Sets the value of the documentTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypeDescription(String value) {
        this.documentTypeDescription = value;
    }

    /**
     * Gets the value of the expectedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedValue() {
        return expectedValue;
    }

    /**
     * Sets the value of the expectedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedValue(String value) {
        this.expectedValue = value;
    }

    /**
     * Gets the value of the manualReviewDashboard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManualReviewDashboard() {
        return manualReviewDashboard;
    }

    /**
     * Sets the value of the manualReviewDashboard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManualReviewDashboard(String value) {
        this.manualReviewDashboard = value;
    }

    /**
     * Gets the value of the referenceDocument property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReferenceDocument() {
        return referenceDocument;
    }

    /**
     * Sets the value of the referenceDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReferenceDocument(BigDecimal value) {
        this.referenceDocument = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the subcontrolId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcontrolId() {
        return subcontrolId;
    }

    /**
     * Sets the value of the subcontrolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcontrolId(String value) {
        this.subcontrolId = value;
    }

    /**
     * Gets the value of the updatable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatable() {
        return updatable;
    }

    /**
     * Sets the value of the updatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatable(String value) {
        this.updatable = value;
    }

}
