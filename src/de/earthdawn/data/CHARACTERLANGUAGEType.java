//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHARACTERLANGUAGE_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHARACTERLANGUAGE_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="language" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="speak" type="{http://earthdawn.com/datatypes}yesno_type" default="no" />
 *       &lt;attribute name="readwrite" type="{http://earthdawn.com/datatypes}yesno_type" default="no" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHARACTERLANGUAGE_type")
@XmlSeeAlso({
    OPTIONALRULESDEFAULTLANGUAGE.class
})
public class CHARACTERLANGUAGEType {

    @XmlAttribute(required = true)
    protected String language;
    @XmlAttribute
    protected YesnoType speak;
    @XmlAttribute
    protected YesnoType readwrite;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the speak property.
     * 
     * @return
     *     possible object is
     *     {@link YesnoType }
     *     
     */
    public YesnoType getSpeak() {
        if (speak == null) {
            return YesnoType.NO;
        } else {
            return speak;
        }
    }

    /**
     * Sets the value of the speak property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *     
     */
    public void setSpeak(YesnoType value) {
        this.speak = value;
    }

    /**
     * Gets the value of the readwrite property.
     * 
     * @return
     *     possible object is
     *     {@link YesnoType }
     *     
     */
    public YesnoType getReadwrite() {
        if (readwrite == null) {
            return YesnoType.NO;
        } else {
            return readwrite;
        }
    }

    /**
     * Sets the value of the readwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *     
     */
    public void setReadwrite(YesnoType value) {
        this.readwrite = value;
    }

}
