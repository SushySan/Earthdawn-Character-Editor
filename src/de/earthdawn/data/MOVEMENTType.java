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
 * <p>Java class for MOVEMENT_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOVEMENT_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="flight" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="ground" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MOVEMENT_type")
public class MOVEMENTType {

    @XmlAttribute(name = "flight")
    protected Integer flight;
    @XmlAttribute(name = "ground", required = true)
    protected int ground;

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlight(Integer value) {
        this.flight = value;
    }

    /**
     * Gets the value of the ground property.
     * 
     */
    public int getGround() {
        return ground;
    }

    /**
     * Sets the value of the ground property.
     * 
     */
    public void setGround(int value) {
        this.ground = value;
    }

}
