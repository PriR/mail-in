
package be.alphacredit.mailin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wws112Result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wws112Result"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contact" type="{http://getcreditdetails.wsbeans.iseries/}contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contract" type="{http://getcreditdetails.wsbeans.iseries/}contract" minOccurs="0"/&gt;
 *         &lt;element name="control" type="{http://getcreditdetails.wsbeans.iseries/}control" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cosigner" type="{http://getcreditdetails.wsbeans.iseries/}cosigner" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="countContacts" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="countControls" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="countCosigners" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="countDebtors" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="countInterv" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="countsubctrlP1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="countsubctrlP2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="debtor" type="{http://getcreditdetails.wsbeans.iseries/}debtor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{http://getcreditdetails.wsbeans.iseries/}error" minOccurs="0"/&gt;
 *         &lt;element name="subControlP1" type="{http://getcreditdetails.wsbeans.iseries/}subControlP1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subControlP2" type="{http://getcreditdetails.wsbeans.iseries/}subControlP2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vendor" type="{http://getcreditdetails.wsbeans.iseries/}vendor" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wws112Result", propOrder = {
    "contact",
    "contract",
    "control",
    "cosigner",
    "countContacts",
    "countControls",
    "countCosigners",
    "countDebtors",
    "countInterv",
    "countsubctrlP1",
    "countsubctrlP2",
    "debtor",
    "error",
    "subControlP1",
    "subControlP2",
    "vendor"
})
public class Wws112Result {

    protected List<Contact> contact;
    protected Contract contract;
    protected List<Control> control;
    protected List<Cosigner> cosigner;
    protected BigDecimal countContacts;
    protected BigDecimal countControls;
    protected BigDecimal countCosigners;
    protected BigDecimal countDebtors;
    protected BigDecimal countInterv;
    protected BigDecimal countsubctrlP1;
    protected BigDecimal countsubctrlP2;
    protected List<Debtor> debtor;
    protected Error error;
    protected List<SubControlP1> subControlP1;
    protected List<SubControlP2> subControlP2;
    protected Vendor vendor;

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getContact() {
        if (contact == null) {
            contact = new ArrayList<Contact>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link Contract }
     *     
     */
    public Contract getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contract }
     *     
     */
    public void setContract(Contract value) {
        this.contract = value;
    }

    /**
     * Gets the value of the control property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the control property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Control }
     * 
     * 
     */
    public List<Control> getControl() {
        if (control == null) {
            control = new ArrayList<Control>();
        }
        return this.control;
    }

    /**
     * Gets the value of the cosigner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cosigner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCosigner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cosigner }
     * 
     * 
     */
    public List<Cosigner> getCosigner() {
        if (cosigner == null) {
            cosigner = new ArrayList<Cosigner>();
        }
        return this.cosigner;
    }

    /**
     * Gets the value of the countContacts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCountContacts() {
        return countContacts;
    }

    /**
     * Sets the value of the countContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCountContacts(BigDecimal value) {
        this.countContacts = value;
    }

    /**
     * Gets the value of the countControls property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCountControls() {
        return countControls;
    }

    /**
     * Sets the value of the countControls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCountControls(BigDecimal value) {
        this.countControls = value;
    }

    /**
     * Gets the value of the countCosigners property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCountCosigners() {
        return countCosigners;
    }

    /**
     * Sets the value of the countCosigners property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCountCosigners(BigDecimal value) {
        this.countCosigners = value;
    }

    /**
     * Gets the value of the countDebtors property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCountDebtors() {
        return countDebtors;
    }

    /**
     * Sets the value of the countDebtors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCountDebtors(BigDecimal value) {
        this.countDebtors = value;
    }

    /**
     * Gets the value of the countInterv property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCountInterv() {
        return countInterv;
    }

    /**
     * Sets the value of the countInterv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCountInterv(BigDecimal value) {
        this.countInterv = value;
    }

    /**
     * Gets the value of the countsubctrlP1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCountsubctrlP1() {
        return countsubctrlP1;
    }

    /**
     * Sets the value of the countsubctrlP1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCountsubctrlP1(BigDecimal value) {
        this.countsubctrlP1 = value;
    }

    /**
     * Gets the value of the countsubctrlP2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCountsubctrlP2() {
        return countsubctrlP2;
    }

    /**
     * Sets the value of the countsubctrlP2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCountsubctrlP2(BigDecimal value) {
        this.countsubctrlP2 = value;
    }

    /**
     * Gets the value of the debtor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debtor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDebtor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Debtor }
     * 
     * 
     */
    public List<Debtor> getDebtor() {
        if (debtor == null) {
            debtor = new ArrayList<Debtor>();
        }
        return this.debtor;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

    /**
     * Gets the value of the subControlP1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subControlP1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubControlP1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubControlP1 }
     * 
     * 
     */
    public List<SubControlP1> getSubControlP1() {
        if (subControlP1 == null) {
            subControlP1 = new ArrayList<SubControlP1>();
        }
        return this.subControlP1;
    }

    /**
     * Gets the value of the subControlP2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subControlP2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubControlP2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubControlP2 }
     * 
     * 
     */
    public List<SubControlP2> getSubControlP2() {
        if (subControlP2 == null) {
            subControlP2 = new ArrayList<SubControlP2>();
        }
        return this.subControlP2;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link Vendor }
     *     
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor }
     *     
     */
    public void setVendor(Vendor value) {
        this.vendor = value;
    }

}
