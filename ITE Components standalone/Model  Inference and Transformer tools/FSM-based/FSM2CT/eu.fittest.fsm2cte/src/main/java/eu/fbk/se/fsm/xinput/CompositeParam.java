//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.20 at 01:46:02 PM CET 
//


package eu.fbk.se.fsm.xinput;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.fbk.eu/xinput}inputSet"/>
 *       &lt;attGroup ref="{http://www.fbk.eu/xinput}commonAttGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "compositeParam",
    "compositeParamRef",
    "atomicParam",
    "atomicParamRef"
})
@XmlRootElement(name = "compositeParam")
public class CompositeParam {

    protected List<CompositeParam> compositeParam;
    protected List<CompositeParamRef> compositeParamRef;
    protected List<AtomicParam> atomicParam;
    protected List<AtomicParamRef> atomicParamRef;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the compositeParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositeParam }
     * 
     * 
     */
    public List<CompositeParam> getCompositeParam() {
        if (compositeParam == null) {
            compositeParam = new ArrayList<CompositeParam>();
        }
        return this.compositeParam;
    }

    /**
     * Gets the value of the compositeParamRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeParamRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeParamRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositeParamRef }
     * 
     * 
     */
    public List<CompositeParamRef> getCompositeParamRef() {
        if (compositeParamRef == null) {
            compositeParamRef = new ArrayList<CompositeParamRef>();
        }
        return this.compositeParamRef;
    }

    /**
     * Gets the value of the atomicParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atomicParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtomicParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AtomicParam }
     * 
     * 
     */
    public List<AtomicParam> getAtomicParam() {
        if (atomicParam == null) {
            atomicParam = new ArrayList<AtomicParam>();
        }
        return this.atomicParam;
    }

    /**
     * Gets the value of the atomicParamRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atomicParamRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtomicParamRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AtomicParamRef }
     * 
     * 
     */
    public List<AtomicParamRef> getAtomicParamRef() {
        if (atomicParamRef == null) {
            atomicParamRef = new ArrayList<AtomicParamRef>();
        }
        return this.atomicParamRef;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
