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
 * <p>Java class for ATTRIBUTENAMEVALUE_type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ATTRIBUTENAMEVALUE_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" use="required" type="{http://earthdawn.com/datatypes}ATTRIBUTE_name_type" /&gt;
 *       &lt;attribute name="value" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATTRIBUTENAMEVALUE_type", namespace = "http://earthdawn.com/namegiver")
public class ATTRIBUTENAMEVALUEType {

    @XmlAttribute(name = "name", required = true)
    protected ATTRIBUTENameType name;
    @XmlAttribute(name = "value", required = true)
    protected int value;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link ATTRIBUTENameType }
     *
     */
    public ATTRIBUTENameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link ATTRIBUTENameType }
     *
     */
    public void setName(ATTRIBUTENameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     *
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     */
    public void setValue(int value) {
        this.value = value;
    }

}
