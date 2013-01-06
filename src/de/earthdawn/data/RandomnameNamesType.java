//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for randomname_names_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="randomname_names_type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://earthdawn.com/datatypes>stringlist_type">
 *       &lt;attribute name="part" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="gender" type="{http://earthdawn.com/datatypes}gender_type" default="-" />
 *       &lt;attribute name="creativity" type="{http://earthdawn.com/datatypes}unsigned_int" default="75" />
 *       &lt;attribute name="syllabledelimiter" type="{http://www.w3.org/2001/XMLSchema}string" default="-" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "randomname_names_type", namespace = "http://earthdawn.com/randomname")
public class RandomnameNamesType
    extends StringlistType
{

    @XmlAttribute(name = "part")
    protected Integer part;
    @XmlAttribute(name = "gender")
    protected GenderType gender;
    @XmlAttribute(name = "creativity")
    protected Integer creativity;
    @XmlAttribute(name = "syllabledelimiter")
    protected String syllabledelimiter;

    /**
     * Gets the value of the part property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPart() {
        if (part == null) {
            return  0;
        } else {
            return part;
        }
    }

    /**
     * Sets the value of the part property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPart(Integer value) {
        this.part = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        if (gender == null) {
            return GenderType.MINUS;
        } else {
            return gender;
        }
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the creativity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCreativity() {
        if (creativity == null) {
            return  75;
        } else {
            return creativity;
        }
    }

    /**
     * Sets the value of the creativity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreativity(Integer value) {
        this.creativity = value;
    }

    /**
     * Gets the value of the syllabledelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyllabledelimiter() {
        if (syllabledelimiter == null) {
            return "-";
        } else {
            return syllabledelimiter;
        }
    }

    /**
     * Sets the value of the syllabledelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyllabledelimiter(String value) {
        this.syllabledelimiter = value;
    }

}
