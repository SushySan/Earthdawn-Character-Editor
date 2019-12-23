//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: see version control commit date
//


package de.earthdawn.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SKILLKNACK" type="{http://earthdawn.com/knack}KNACKBASE_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TALENTKNACK" type="{http://earthdawn.com/knack}KNACKBASE_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lang" use="required" type="{http://earthdawn.com/datatypes}language_type" /&gt;
 *       &lt;attribute name="rulesetversion" type="{http://earthdawn.com/datatypes}rulesetversion_type" default="ED3" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "skillknack",
    "talentknack"
})
@XmlRootElement(name = "KNACKS", namespace = "http://earthdawn.com/knack")
public class KNACKS {

    @XmlElement(name = "SKILLKNACK", namespace = "http://earthdawn.com/knack")
    protected List<KNACKBASEType> skillknack;
    @XmlElement(name = "TALENTKNACK", namespace = "http://earthdawn.com/knack")
    protected List<KNACKBASEType> talentknack;
    @XmlAttribute(name = "lang", required = true)
    protected LanguageType lang;
    @XmlAttribute(name = "rulesetversion")
    protected RulesetversionType rulesetversion;

    /**
     * Gets the value of the skillknack property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skillknack property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSKILLKNACK().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KNACKBASEType }
     *
     *
     */
    public List<KNACKBASEType> getSKILLKNACK() {
        if (skillknack == null) {
            skillknack = new ArrayList<KNACKBASEType>();
        }
        return this.skillknack;
    }

    /**
     * Gets the value of the talentknack property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the talentknack property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTALENTKNACK().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KNACKBASEType }
     *
     *
     */
    public List<KNACKBASEType> getTALENTKNACK() {
        if (talentknack == null) {
            talentknack = new ArrayList<KNACKBASEType>();
        }
        return this.talentknack;
    }

    /**
     * Gets the value of the lang property.
     *
     * @return
     *     possible object is
     *     {@link LanguageType }
     *
     */
    public LanguageType getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     *
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *
     */
    public void setLang(LanguageType value) {
        this.lang = value;
    }

    /**
     * Gets the value of the rulesetversion property.
     *
     * @return
     *     possible object is
     *     {@link RulesetversionType }
     *
     */
    public RulesetversionType getRulesetversion() {
        if (rulesetversion == null) {
            return RulesetversionType.ED_3;
        } else {
            return rulesetversion;
        }
    }

    /**
     * Sets the value of the rulesetversion property.
     *
     * @param value
     *     allowed object is
     *     {@link RulesetversionType }
     *
     */
    public void setRulesetversion(RulesetversionType value) {
        this.rulesetversion = value;
    }

}
