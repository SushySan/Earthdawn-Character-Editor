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
 * <p>Java class for FOREIGNTALENTS_type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FOREIGNTALENTS_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="maxcircle" type="{http://earthdawn.com/datatypes}circle_type" default="1" /&gt;
 *       &lt;attribute name="mincircle" type="{http://earthdawn.com/datatypes}circle_type" default="1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FOREIGNTALENTS_type", namespace = "http://earthdawn.com/discipline")
public class FOREIGNTALENTSType {

    @XmlAttribute(name = "maxcircle")
    protected Integer maxcircle;
    @XmlAttribute(name = "mincircle")
    protected Integer mincircle;

    /**
     * Gets the value of the maxcircle property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getMaxcircle() {
        if (maxcircle == null) {
            return  1;
        } else {
            return maxcircle;
        }
    }

    /**
     * Sets the value of the maxcircle property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setMaxcircle(Integer value) {
        this.maxcircle = value;
    }

    /**
     * Gets the value of the mincircle property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getMincircle() {
        if (mincircle == null) {
            return  1;
        } else {
            return mincircle;
        }
    }

    /**
     * Sets the value of the mincircle property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setMincircle(Integer value) {
        this.mincircle = value;
    }

}
