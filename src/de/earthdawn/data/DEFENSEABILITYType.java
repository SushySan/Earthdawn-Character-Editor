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
 * Indicates which defense type will be increased by one.
 * 
 * <p>Java class for DEFENSEABILITY_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DEFENSEABILITY_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="kind" type="{http://earthdawn.com/datatypes}defensekind_type" default="physical" />
 *       &lt;attribute name="bonus" type="{http://earthdawn.com/datatypes}unsigned_int" default="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DEFENSEABILITY_type")
public class DEFENSEABILITYType {

    @XmlAttribute(name = "kind")
    protected DefensekindType kind;
    @XmlAttribute(name = "bonus")
    protected Integer bonus;

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link DefensekindType }
     *     
     */
    public DefensekindType getKind() {
        if (kind == null) {
            return DefensekindType.PHYSICAL;
        } else {
            return kind;
        }
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefensekindType }
     *     
     */
    public void setKind(DefensekindType value) {
        this.kind = value;
    }

    /**
     * Gets the value of the bonus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getBonus() {
        if (bonus == null) {
            return  1;
        } else {
            return bonus;
        }
    }

    /**
     * Sets the value of the bonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBonus(Integer value) {
        this.bonus = value;
    }

}
