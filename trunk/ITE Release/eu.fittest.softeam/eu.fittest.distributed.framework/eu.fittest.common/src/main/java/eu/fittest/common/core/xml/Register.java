//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.29 at 02:10:00 PM CET 
//


package eu.fittest.common.core.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{}Message">
 *       &lt;sequence>
 *         &lt;element name="fittestEntityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fittestEntityName"
})
@XmlRootElement(name = "Register")
public class Register
    extends Message
{

    @XmlElement(required = true)
    protected String fittestEntityName;

    /**
     * Gets the value of the fittestEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFittestEntityName() {
        return fittestEntityName;
    }

    /**
     * Sets the value of the fittestEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFittestEntityName(String value) {
        this.fittestEntityName = value;
    }

}
