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
 * The path ranks are grouped by tiers
 *
 * <p>Java class for PATHTIER_type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PATHTIER_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OPTIONALTALENT" type="{http://earthdawn.com/datatypes}TALENTABILITY_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PATHFOREIGNTALENTS" type="{http://earthdawn.com/path}PATHFOREIGNTALENTS_type" minOccurs="0"/&gt;
 *         &lt;element name="RANK" type="{http://earthdawn.com/path}PATHRANK_type" maxOccurs="15"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://earthdawn.com/datatypes}tierkind_type" default="auto" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PATHTIER_type", namespace = "http://earthdawn.com/path", propOrder = {
    "optionaltalent",
    "pathforeigntalents",
    "rank"
})
public class PATHTIERType {

    @XmlElement(name = "OPTIONALTALENT")
    protected List<TALENTABILITYType> optionaltalent;
    @XmlElement(name = "PATHFOREIGNTALENTS")
    protected PATHFOREIGNTALENTSType pathforeigntalents;
    @XmlElement(name = "RANK", required = true)
    protected List<PATHRANKType> rank;
    @XmlAttribute(name = "name")
    protected TierkindType name;

    /**
     * Gets the value of the optionaltalent property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionaltalent property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOPTIONALTALENT().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TALENTABILITYType }
     *
     *
     */
    public List<TALENTABILITYType> getOPTIONALTALENT() {
        if (optionaltalent == null) {
            optionaltalent = new ArrayList<TALENTABILITYType>();
        }
        return this.optionaltalent;
    }

    /**
     * Gets the value of the pathforeigntalents property.
     *
     * @return
     *     possible object is
     *     {@link PATHFOREIGNTALENTSType }
     *
     */
    public PATHFOREIGNTALENTSType getPATHFOREIGNTALENTS() {
        return pathforeigntalents;
    }

    /**
     * Sets the value of the pathforeigntalents property.
     *
     * @param value
     *     allowed object is
     *     {@link PATHFOREIGNTALENTSType }
     *
     */
    public void setPATHFOREIGNTALENTS(PATHFOREIGNTALENTSType value) {
        this.pathforeigntalents = value;
    }

    /**
     * Gets the value of the rank property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rank property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRANK().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PATHRANKType }
     *
     *
     */
    public List<PATHRANKType> getRANK() {
        if (rank == null) {
            rank = new ArrayList<PATHRANKType>();
        }
        return this.rank;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link TierkindType }
     *
     */
    public TierkindType getName() {
        if (name == null) {
            return TierkindType.AUTO;
        } else {
            return name;
        }
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link TierkindType }
     *
     */
    public void setName(TierkindType value) {
        this.name = value;
    }

}
