
package com.ahilan.mycase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createAgreementRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createAgreementRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agreement" type="{http://mycase.ahilan.com}agreement"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAgreementRequest", propOrder = {
    "agreement"
})
public class CreateAgreementRequest {

    @XmlElement(required = true)
    protected Agreement agreement;

    /**
     * Gets the value of the agreement property.
     * 
     * @return
     *     possible object is
     *     {@link Agreement }
     *     
     */
    public Agreement getAgreement() {
        return agreement;
    }

    /**
     * Sets the value of the agreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agreement }
     *     
     */
    public void setAgreement(Agreement value) {
        this.agreement = value;
    }

}
