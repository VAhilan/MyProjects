
package com.ahilan.mycase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateStatusRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="updateStatus" type="{http://mycase.ahilan.com}updateStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateStatusRequest", propOrder = {
    "updateStatus"
})
public class UpdateStatusRequest {

    @XmlElement(required = true)
    protected UpdateStatus updateStatus;

    /**
     * Gets the value of the updateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateStatus }
     *     
     */
    public UpdateStatus getUpdateStatus() {
        return updateStatus;
    }

    /**
     * Sets the value of the updateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateStatus }
     *     
     */
    public void setUpdateStatus(UpdateStatus value) {
        this.updateStatus = value;
    }

}
