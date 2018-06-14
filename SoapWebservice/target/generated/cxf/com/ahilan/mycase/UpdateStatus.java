
package com.ahilan.mycase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customernr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="agreementID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateStatus", propOrder = {
    "customernr",
    "agreementID",
    "status"
})
public class UpdateStatus {

    @XmlElement(required = true)
    protected String customernr;
    @XmlElement(required = true)
    protected String agreementID;
    @XmlElement(required = true)
    protected String status;

    /**
     * Gets the value of the customernr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomernr() {
        return customernr;
    }

    /**
     * Sets the value of the customernr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomernr(String value) {
        this.customernr = value;
    }

    /**
     * Gets the value of the agreementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementID() {
        return agreementID;
    }

    /**
     * Sets the value of the agreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementID(String value) {
        this.agreementID = value;
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

}
