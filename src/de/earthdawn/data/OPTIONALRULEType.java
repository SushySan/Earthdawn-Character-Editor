//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OPTIONALRULE_type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OPTIONALRULE_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="used" type="{http://earthdawn.com/datatypes}yesno_type" default="no" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPTIONALRULE_type", namespace = "http://earthdawn.com/optionalrules")
public class OPTIONALRULEType {

    @XmlAttribute(name = "used")
    protected YesnoType used;

    /**
     * Gets the value of the used property.
     *
     * @return
     *     possible object is
     *     {@link YesnoType }
     *
     */
    public YesnoType getUsed() {
        if (used == null) {
            return YesnoType.NO;
        } else {
            return used;
        }
    }

    /**
     * Sets the value of the used property.
     *
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *
     */
    public void setUsed(YesnoType value) {
        this.used = value;
    }

}
