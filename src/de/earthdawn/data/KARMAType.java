//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KARMA_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KARMA_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://earthdawn.com/datatypes}STEPDICE_type">
 *       &lt;sequence>
 *         &lt;element name="KARMAPOINTS" type="{http://earthdawn.com/datatypes}ACCOUNTING_type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="current" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="max" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="maxmodificator" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KARMA_type", propOrder = {
    "karmapoints"
})
public class KARMAType
    extends STEPDICEType
{

    @XmlElement(name = "KARMAPOINTS", required = true)
    protected List<ACCOUNTINGType> karmapoints;
    @XmlAttribute(name = "current", required = true)
    protected int current;
    @XmlAttribute(name = "max", required = true)
    protected int max;
    @XmlAttribute(name = "maxmodificator")
    protected Integer maxmodificator;

    /**
     * Gets the value of the karmapoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the karmapoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKARMAPOINTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACCOUNTINGType }
     * 
     * 
     */
    public List<ACCOUNTINGType> getKARMAPOINTS() {
        if (karmapoints == null) {
            karmapoints = new ArrayList<ACCOUNTINGType>();
        }
        return this.karmapoints;
    }

    /**
     * Gets the value of the current property.
     * 
     */
    public int getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     */
    public void setCurrent(int value) {
        this.current = value;
    }

    /**
     * Gets the value of the max property.
     * 
     */
    public int getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     */
    public void setMax(int value) {
        this.max = value;
    }

    /**
     * Gets the value of the maxmodificator property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxmodificator() {
        if (maxmodificator == null) {
            return  0;
        } else {
            return maxmodificator;
        }
    }

    /**
     * Sets the value of the maxmodificator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxmodificator(Integer value) {
        this.maxmodificator = value;
    }

}
