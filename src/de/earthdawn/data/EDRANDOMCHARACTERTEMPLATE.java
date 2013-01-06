//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RACES" type="{http://earthdawn.com/randomcharactertemplate}weightedstringlist_type" maxOccurs="unbounded"/>
 *         &lt;element name="ATTRIBUTES" type="{http://earthdawn.com/randomcharactertemplate}RANDOMATTRIBUTES_type" maxOccurs="unbounded"/>
 *         &lt;element name="DISCIPLINES" type="{http://earthdawn.com/randomcharactertemplate}weightedstringlist_type" maxOccurs="unbounded"/>
 *         &lt;element name="SPELLCATEGORY" type="{http://earthdawn.com/randomcharactertemplate}RANDOMSPELLCATEGORY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SKILLS" type="{http://earthdawn.com/randomcharactertemplate}weightedstringlist_type" maxOccurs="unbounded"/>
 *         &lt;element name="ITEMCATEGORY" type="{http://earthdawn.com/randomcharactertemplate}RANDOMITEMCATEGORY_type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lang" use="required" type="{http://earthdawn.com/datatypes}language_type" />
 *       &lt;attribute name="circle_min" type="{http://earthdawn.com/datatypes}unsigned_int" default="1" />
 *       &lt;attribute name="circle_max" type="{http://earthdawn.com/datatypes}unsigned_int" default="15" />
 *       &lt;attribute name="skill_min" type="{http://earthdawn.com/datatypes}unsigned_int" default="8" />
 *       &lt;attribute name="skill_max" type="{http://earthdawn.com/datatypes}unsigned_int" default="8" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "races",
    "attributes",
    "disciplines",
    "spellcategory",
    "skills",
    "itemcategory"
})
@XmlRootElement(name = "EDRANDOMCHARACTERTEMPLATE", namespace = "http://earthdawn.com/randomcharactertemplate")
public class EDRANDOMCHARACTERTEMPLATE {

    @XmlElement(name = "RACES", namespace = "http://earthdawn.com/randomcharactertemplate", required = true)
    protected List<WeightedstringlistType> races;
    @XmlElement(name = "ATTRIBUTES", namespace = "http://earthdawn.com/randomcharactertemplate", required = true)
    protected List<RANDOMATTRIBUTESType> attributes;
    @XmlElement(name = "DISCIPLINES", namespace = "http://earthdawn.com/randomcharactertemplate", required = true)
    protected List<WeightedstringlistType> disciplines;
    @XmlElement(name = "SPELLCATEGORY", namespace = "http://earthdawn.com/randomcharactertemplate")
    protected List<RANDOMSPELLCATEGORYType> spellcategory;
    @XmlElement(name = "SKILLS", namespace = "http://earthdawn.com/randomcharactertemplate", required = true)
    protected List<WeightedstringlistType> skills;
    @XmlElement(name = "ITEMCATEGORY", namespace = "http://earthdawn.com/randomcharactertemplate", required = true)
    protected List<RANDOMITEMCATEGORYType> itemcategory;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "lang", required = true)
    protected LanguageType lang;
    @XmlAttribute(name = "circle_min")
    protected Integer circleMin;
    @XmlAttribute(name = "circle_max")
    protected Integer circleMax;
    @XmlAttribute(name = "skill_min")
    protected Integer skillMin;
    @XmlAttribute(name = "skill_max")
    protected Integer skillMax;

    /**
     * Gets the value of the races property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the races property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRACES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeightedstringlistType }
     * 
     * 
     */
    public List<WeightedstringlistType> getRACES() {
        if (races == null) {
            races = new ArrayList<WeightedstringlistType>();
        }
        return this.races;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATTRIBUTES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RANDOMATTRIBUTESType }
     * 
     * 
     */
    public List<RANDOMATTRIBUTESType> getATTRIBUTES() {
        if (attributes == null) {
            attributes = new ArrayList<RANDOMATTRIBUTESType>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the disciplines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disciplines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDISCIPLINES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeightedstringlistType }
     * 
     * 
     */
    public List<WeightedstringlistType> getDISCIPLINES() {
        if (disciplines == null) {
            disciplines = new ArrayList<WeightedstringlistType>();
        }
        return this.disciplines;
    }

    /**
     * Gets the value of the spellcategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spellcategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPELLCATEGORY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RANDOMSPELLCATEGORYType }
     * 
     * 
     */
    public List<RANDOMSPELLCATEGORYType> getSPELLCATEGORY() {
        if (spellcategory == null) {
            spellcategory = new ArrayList<RANDOMSPELLCATEGORYType>();
        }
        return this.spellcategory;
    }

    /**
     * Gets the value of the skills property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skills property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSKILLS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeightedstringlistType }
     * 
     * 
     */
    public List<WeightedstringlistType> getSKILLS() {
        if (skills == null) {
            skills = new ArrayList<WeightedstringlistType>();
        }
        return this.skills;
    }

    /**
     * Gets the value of the itemcategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemcategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getITEMCATEGORY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RANDOMITEMCATEGORYType }
     * 
     * 
     */
    public List<RANDOMITEMCATEGORYType> getITEMCATEGORY() {
        if (itemcategory == null) {
            itemcategory = new ArrayList<RANDOMITEMCATEGORYType>();
        }
        return this.itemcategory;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the circleMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCircleMin() {
        if (circleMin == null) {
            return  1;
        } else {
            return circleMin;
        }
    }

    /**
     * Sets the value of the circleMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCircleMin(Integer value) {
        this.circleMin = value;
    }

    /**
     * Gets the value of the circleMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCircleMax() {
        if (circleMax == null) {
            return  15;
        } else {
            return circleMax;
        }
    }

    /**
     * Sets the value of the circleMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCircleMax(Integer value) {
        this.circleMax = value;
    }

    /**
     * Gets the value of the skillMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSkillMin() {
        if (skillMin == null) {
            return  8;
        } else {
            return skillMin;
        }
    }

    /**
     * Sets the value of the skillMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSkillMin(Integer value) {
        this.skillMin = value;
    }

    /**
     * Gets the value of the skillMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSkillMax() {
        if (skillMax == null) {
            return  8;
        } else {
            return skillMax;
        }
    }

    /**
     * Sets the value of the skillMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSkillMax(Integer value) {
        this.skillMax = value;
    }

}
