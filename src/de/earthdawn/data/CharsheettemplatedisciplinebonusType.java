//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for charsheettemplatedisciplinebonus_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="charsheettemplatedisciplinebonus_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Circle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "charsheettemplatedisciplinebonus_type", namespace = "http://earthdawn.com/charsheettemplate", propOrder = {
    "circle",
    "ability"
})
public class CharsheettemplatedisciplinebonusType {

    @XmlElement(name = "Circle")
    protected String circle;
    @XmlElement(name = "Ability")
    protected String ability;

    /**
     * Gets the value of the circle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCircle() {
        return circle;
    }

    /**
     * Sets the value of the circle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCircle(String value) {
        this.circle = value;
    }

    /**
     * Gets the value of the ability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbility() {
        return ability;
    }

    /**
     * Sets the value of the ability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbility(String value) {
        this.ability = value;
    }

}
