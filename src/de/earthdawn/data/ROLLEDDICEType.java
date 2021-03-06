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
 * <p>Java class for ROLLEDDICE_type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ROLLEDDICE_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="dice" use="required" type="{http://earthdawn.com/datatypes}dice_type" /&gt;
 *       &lt;attribute name="rolling" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="result" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" /&gt;
 *       &lt;attribute name="pathetic" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" /&gt;
 *       &lt;attribute name="poor" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" /&gt;
 *       &lt;attribute name="average" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" /&gt;
 *       &lt;attribute name="good" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" /&gt;
 *       &lt;attribute name="excellent" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" /&gt;
 *       &lt;attribute name="extraordinary" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ROLLEDDICE_type")
public class ROLLEDDICEType {

    @XmlAttribute(name = "dice", required = true)
    protected String dice;
    @XmlAttribute(name = "rolling", required = true)
    protected String rolling;
    @XmlAttribute(name = "result", required = true)
    protected int result;
    @XmlAttribute(name = "pathetic", required = true)
    protected int pathetic;
    @XmlAttribute(name = "poor", required = true)
    protected int poor;
    @XmlAttribute(name = "average", required = true)
    protected int average;
    @XmlAttribute(name = "good", required = true)
    protected int good;
    @XmlAttribute(name = "excellent", required = true)
    protected int excellent;
    @XmlAttribute(name = "extraordinary", required = true)
    protected int extraordinary;

    /**
     * Gets the value of the dice property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDice() {
        return dice;
    }

    /**
     * Sets the value of the dice property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDice(String value) {
        this.dice = value;
    }

    /**
     * Gets the value of the rolling property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRolling() {
        return rolling;
    }

    /**
     * Sets the value of the rolling property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRolling(String value) {
        this.rolling = value;
    }

    /**
     * Gets the value of the result property.
     *
     */
    public int getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     */
    public void setResult(int value) {
        this.result = value;
    }

    /**
     * Gets the value of the pathetic property.
     *
     */
    public int getPathetic() {
        return pathetic;
    }

    /**
     * Sets the value of the pathetic property.
     *
     */
    public void setPathetic(int value) {
        this.pathetic = value;
    }

    /**
     * Gets the value of the poor property.
     *
     */
    public int getPoor() {
        return poor;
    }

    /**
     * Sets the value of the poor property.
     *
     */
    public void setPoor(int value) {
        this.poor = value;
    }

    /**
     * Gets the value of the average property.
     *
     */
    public int getAverage() {
        return average;
    }

    /**
     * Sets the value of the average property.
     *
     */
    public void setAverage(int value) {
        this.average = value;
    }

    /**
     * Gets the value of the good property.
     *
     */
    public int getGood() {
        return good;
    }

    /**
     * Sets the value of the good property.
     *
     */
    public void setGood(int value) {
        this.good = value;
    }

    /**
     * Gets the value of the excellent property.
     *
     */
    public int getExcellent() {
        return excellent;
    }

    /**
     * Sets the value of the excellent property.
     *
     */
    public void setExcellent(int value) {
        this.excellent = value;
    }

    /**
     * Gets the value of the extraordinary property.
     *
     */
    public int getExtraordinary() {
        return extraordinary;
    }

    /**
     * Sets the value of the extraordinary property.
     *
     */
    public void setExtraordinary(int value) {
        this.extraordinary = value;
    }

}
