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
 * <p>Java class for OPTIONALRULES_ATTRIBUTE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OPTIONALRULES_ATTRIBUTE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="points" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="limitoneway" type="{http://earthdawn.com/datatypes}yesno_type" /&gt;
 *       &lt;attribute name="limitlpincrease" type="{http://earthdawn.com/datatypes}unsigned_int" default="3" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPTIONALRULES_ATTRIBUTE", namespace = "http://earthdawn.com/optionalrules")
public class OPTIONALRULESATTRIBUTE {

    @XmlAttribute(name = "points")
    protected Integer points;
    @XmlAttribute(name = "limitoneway")
    protected YesnoType limitoneway;
    @XmlAttribute(name = "limitlpincrease")
    protected Integer limitlpincrease;

    /**
     * Gets the value of the points property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setPoints(Integer value) {
        this.points = value;
    }

    /**
     * Gets the value of the limitoneway property.
     *
     * @return
     *     possible object is
     *     {@link YesnoType }
     *
     */
    public YesnoType getLimitoneway() {
        return limitoneway;
    }

    /**
     * Sets the value of the limitoneway property.
     *
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *
     */
    public void setLimitoneway(YesnoType value) {
        this.limitoneway = value;
    }

    /**
     * Gets the value of the limitlpincrease property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getLimitlpincrease() {
        if (limitlpincrease == null) {
            return  3;
        } else {
            return limitlpincrease;
        }
    }

    /**
     * Sets the value of the limitlpincrease property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setLimitlpincrease(Integer value) {
        this.limitlpincrease = value;
    }

}
