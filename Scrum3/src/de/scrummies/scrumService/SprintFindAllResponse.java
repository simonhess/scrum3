
package de.scrummies.scrumService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SprintFindAllResult" type="{http://www.fuldaai.de}ArrayOfSprint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sprintFindAllResult"
})
@XmlRootElement(name = "SprintFindAllResponse")
public class SprintFindAllResponse {

    @XmlElementRef(name = "SprintFindAllResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSprint> sprintFindAllResult;

    /**
     * Gets the value of the sprintFindAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSprint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSprint> getSprintFindAllResult() {
        return sprintFindAllResult;
    }

    /**
     * Sets the value of the sprintFindAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSprint }{@code >}
     *     
     */
    public void setSprintFindAllResult(JAXBElement<ArrayOfSprint> value) {
        this.sprintFindAllResult = value;
    }

}
