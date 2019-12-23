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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for THREADRANK_type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="THREADRANK_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ARMOR" type="{http://earthdawn.com/datatypes}ARMOR_type" minOccurs="0"/&gt;
 *         &lt;element name="SHIELD" type="{http://earthdawn.com/datatypes}SHIELD_type" minOccurs="0"/&gt;
 *         &lt;element name="WEAPON" type="{http://earthdawn.com/datatypes}WEAPON_type" minOccurs="0"/&gt;
 *         &lt;element name="WOUND" type="{http://earthdawn.com/datatypes}WOUND_type" minOccurs="0"/&gt;
 *         &lt;element name="DEFENSE" type="{http://earthdawn.com/datatypes}DEFENSEABILITY_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TALENT" type="{http://earthdawn.com/datatypes}TALENTABILITY_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SPELL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SPELLABILITY" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="INITIATIVE" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RECOVERYTEST" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="KARMASTEP" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MAXKARMA" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ABILITY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="keyknowledge" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="lpcost" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" /&gt;
 *       &lt;attribute name="deed" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="effect" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "THREADRANK_type", propOrder = {
    "armor",
    "shield",
    "weapon",
    "wound",
    "defense",
    "talent",
    "spell",
    "spellability",
    "initiative",
    "recoverytest",
    "karmastep",
    "maxkarma",
    "ability"
})
public class THREADRANKType {

    @XmlElement(name = "ARMOR")
    protected ARMORType armor;
    @XmlElement(name = "SHIELD")
    protected SHIELDType shield;
    @XmlElement(name = "WEAPON")
    protected WEAPONType weapon;
    @XmlElement(name = "WOUND")
    protected WOUNDType wound;
    @XmlElement(name = "DEFENSE")
    protected List<DEFENSEABILITYType> defense;
    @XmlElement(name = "TALENT")
    protected List<TALENTABILITYType> talent;
    @XmlElement(name = "SPELL")
    protected List<String> spell;
    @XmlElement(name = "SPELLABILITY")
    protected List<DISZIPINABILITYType> spellability;
    @XmlElement(name = "INITIATIVE")
    protected List<DISZIPINABILITYType> initiative;
    @XmlElement(name = "RECOVERYTEST")
    protected List<DISZIPINABILITYType> recoverytest;
    @XmlElement(name = "KARMASTEP")
    protected List<DISZIPINABILITYType> karmastep;
    @XmlElement(name = "MAXKARMA")
    protected List<DISZIPINABILITYType> maxkarma;
    @XmlElement(name = "ABILITY")
    protected List<String> ability;
    @XmlAttribute(name = "keyknowledge")
    protected String keyknowledge;
    @XmlAttribute(name = "lpcost")
    protected Integer lpcost;
    @XmlAttribute(name = "deed")
    protected String deed;
    @XmlAttribute(name = "effect")
    protected String effect;

    /**
     * Gets the value of the armor property.
     *
     * @return
     *     possible object is
     *     {@link ARMORType }
     *
     */
    public ARMORType getARMOR() {
        return armor;
    }

    /**
     * Sets the value of the armor property.
     *
     * @param value
     *     allowed object is
     *     {@link ARMORType }
     *
     */
    public void setARMOR(ARMORType value) {
        this.armor = value;
    }

    /**
     * Gets the value of the shield property.
     *
     * @return
     *     possible object is
     *     {@link SHIELDType }
     *
     */
    public SHIELDType getSHIELD() {
        return shield;
    }

    /**
     * Sets the value of the shield property.
     *
     * @param value
     *     allowed object is
     *     {@link SHIELDType }
     *
     */
    public void setSHIELD(SHIELDType value) {
        this.shield = value;
    }

    /**
     * Gets the value of the weapon property.
     *
     * @return
     *     possible object is
     *     {@link WEAPONType }
     *
     */
    public WEAPONType getWEAPON() {
        return weapon;
    }

    /**
     * Sets the value of the weapon property.
     *
     * @param value
     *     allowed object is
     *     {@link WEAPONType }
     *
     */
    public void setWEAPON(WEAPONType value) {
        this.weapon = value;
    }

    /**
     * Gets the value of the wound property.
     *
     * @return
     *     possible object is
     *     {@link WOUNDType }
     *
     */
    public WOUNDType getWOUND() {
        return wound;
    }

    /**
     * Sets the value of the wound property.
     *
     * @param value
     *     allowed object is
     *     {@link WOUNDType }
     *
     */
    public void setWOUND(WOUNDType value) {
        this.wound = value;
    }

    /**
     * Gets the value of the defense property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defense property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEFENSE().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEFENSEABILITYType }
     *
     *
     */
    public List<DEFENSEABILITYType> getDEFENSE() {
        if (defense == null) {
            defense = new ArrayList<DEFENSEABILITYType>();
        }
        return this.defense;
    }

    /**
     * Gets the value of the talent property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the talent property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTALENT().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TALENTABILITYType }
     *
     *
     */
    public List<TALENTABILITYType> getTALENT() {
        if (talent == null) {
            talent = new ArrayList<TALENTABILITYType>();
        }
        return this.talent;
    }

    /**
     * Gets the value of the spell property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spell property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPELL().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getSPELL() {
        if (spell == null) {
            spell = new ArrayList<String>();
        }
        return this.spell;
    }

    /**
     * Gets the value of the spellability property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spellability property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPELLABILITY().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISZIPINABILITYType }
     *
     *
     */
    public List<DISZIPINABILITYType> getSPELLABILITY() {
        if (spellability == null) {
            spellability = new ArrayList<DISZIPINABILITYType>();
        }
        return this.spellability;
    }

    /**
     * Gets the value of the initiative property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initiative property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINITIATIVE().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISZIPINABILITYType }
     *
     *
     */
    public List<DISZIPINABILITYType> getINITIATIVE() {
        if (initiative == null) {
            initiative = new ArrayList<DISZIPINABILITYType>();
        }
        return this.initiative;
    }

    /**
     * Gets the value of the recoverytest property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recoverytest property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECOVERYTEST().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISZIPINABILITYType }
     *
     *
     */
    public List<DISZIPINABILITYType> getRECOVERYTEST() {
        if (recoverytest == null) {
            recoverytest = new ArrayList<DISZIPINABILITYType>();
        }
        return this.recoverytest;
    }

    /**
     * Gets the value of the karmastep property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the karmastep property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKARMASTEP().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISZIPINABILITYType }
     *
     *
     */
    public List<DISZIPINABILITYType> getKARMASTEP() {
        if (karmastep == null) {
            karmastep = new ArrayList<DISZIPINABILITYType>();
        }
        return this.karmastep;
    }

    /**
     * Gets the value of the maxkarma property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maxkarma property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMAXKARMA().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISZIPINABILITYType }
     *
     *
     */
    public List<DISZIPINABILITYType> getMAXKARMA() {
        if (maxkarma == null) {
            maxkarma = new ArrayList<DISZIPINABILITYType>();
        }
        return this.maxkarma;
    }

    /**
     * Gets the value of the ability property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ability property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getABILITY().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getABILITY() {
        if (ability == null) {
            ability = new ArrayList<String>();
        }
        return this.ability;
    }

    /**
     * Gets the value of the keyknowledge property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKeyknowledge() {
        if (keyknowledge == null) {
            return "";
        } else {
            return keyknowledge;
        }
    }

    /**
     * Sets the value of the keyknowledge property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKeyknowledge(String value) {
        this.keyknowledge = value;
    }

    /**
     * Gets the value of the lpcost property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getLpcost() {
        if (lpcost == null) {
            return  0;
        } else {
            return lpcost;
        }
    }

    /**
     * Sets the value of the lpcost property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setLpcost(Integer value) {
        this.lpcost = value;
    }

    /**
     * Gets the value of the deed property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeed() {
        if (deed == null) {
            return "";
        } else {
            return deed;
        }
    }

    /**
     * Sets the value of the deed property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeed(String value) {
        this.deed = value;
    }

    /**
     * Gets the value of the effect property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEffect() {
        if (effect == null) {
            return "";
        } else {
            return effect;
        }
    }

    /**
     * Sets the value of the effect property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEffect(String value) {
        this.effect = value;
    }

}
