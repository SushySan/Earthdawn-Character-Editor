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
 * <p>Java class for CARRYING_type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CARRYING_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="lifting" type="{http://earthdawn.com/datatypes}unsigned_int" /&gt;
 *       &lt;attribute name="carrying" type="{http://earthdawn.com/datatypes}unsigned_int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CARRYING_type")
public class CARRYINGType {

    @XmlAttribute(name = "lifting")
    protected Integer lifting;
    @XmlAttribute(name = "carrying")
    protected Integer carrying;

    /**
     * Gets the value of the lifting property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getLifting() {
        return lifting;
    }

    /**
     * Sets the value of the lifting property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setLifting(Integer value) {
        this.lifting = value;
    }

    /**
     * Gets the value of the carrying property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getCarrying() {
        return carrying;
    }

    /**
     * Sets the value of the carrying property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setCarrying(Integer value) {
        this.carrying = value;
    }

}
