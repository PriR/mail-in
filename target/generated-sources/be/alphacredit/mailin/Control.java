
package be.alphacredit.mailin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for control complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="control"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalControl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="controlDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="controlId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documentToReviewid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusDashBoardDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusDashboard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "control", propOrder = {
    "additionalControl",
    "controlDescription",
    "controlId",
    "documentToReviewid",
    "status",
    "statusDashBoardDescription",
    "statusDashboard"
})
public class Control {

    protected String additionalControl;
    protected String controlDescription;
    protected String controlId;
    protected String documentToReviewid;
    protected String status;
    protected String statusDashBoardDescription;
    protected String statusDashboard;

    /**
     * Gets the value of the additionalControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalControl() {
        return additionalControl;
    }

    /**
     * Sets the value of the additionalControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalControl(String value) {
        this.additionalControl = value;
    }

    /**
     * Gets the value of the controlDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlDescription() {
        return controlDescription;
    }

    /**
     * Sets the value of the controlDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlDescription(String value) {
        this.controlDescription = value;
    }

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
     * Gets the value of the documentToReviewid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentToReviewid() {
        return documentToReviewid;
    }

    /**
     * Sets the value of the documentToReviewid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentToReviewid(String value) {
        this.documentToReviewid = value;
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
     * Gets the value of the statusDashBoardDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDashBoardDescription() {
        return statusDashBoardDescription;
    }

    /**
     * Sets the value of the statusDashBoardDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDashBoardDescription(String value) {
        this.statusDashBoardDescription = value;
    }

    /**
     * Gets the value of the statusDashboard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDashboard() {
        return statusDashboard;
    }

    /**
     * Sets the value of the statusDashboard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDashboard(String value) {
        this.statusDashboard = value;
    }

}
