//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="ENCUMBRANCE" type="{http://earthdawn.com/characteristics}CHARACTERISTICS_ENCUMBRANCE" maxOccurs="unbounded"/>
 *         &lt;element name="DEFENSERAITING" type="{http://earthdawn.com/characteristics}CHARACTERISTICS_DEFENSERAITING" maxOccurs="unbounded"/>
 *         &lt;element name="MYSTICARMOR" type="{http://earthdawn.com/characteristics}CHARACTERISTICS_MYSTICARMOR" maxOccurs="unbounded"/>
 *         &lt;element name="ATTRIBUTECOST" type="{http://earthdawn.com/characteristics}CHARACTERISTICS_ATTRIBUTECOST" maxOccurs="unbounded"/>
 *         &lt;element name="HEALTHRATING" type="{http://earthdawn.com/characteristics}CHARACTERISTICS_HEALTHRATING" maxOccurs="unbounded"/>
 *         &lt;element name="STEPDICETABLE" type="{http://earthdawn.com/characteristics}CHARACTERISTICS_STEPDICETABLE" maxOccurs="unbounded"/>
 *         &lt;element name="DISCIPLINENR" type="{http://earthdawn.com/characteristics}CHARACTERISTICS_DISCIPLINENR" maxOccurs="unbounded"/>
 *         &lt;element name="SKILLLPCOST" type="{http://earthdawn.com/characteristics}CHARACTERISTICS_COST" maxOccurs="unbounded"/>
 *         &lt;element name="ATTRIBUTELPCOST" type="{http://earthdawn.com/characteristics}CHARACTERISTICS_COST" maxOccurs="unbounded"/>
 *         &lt;element name="LEGENDARYSTATUS" type="{http://earthdawn.com/characteristics}CHARACTERISTICS_LEGENDARYSTATUS" maxOccurs="unbounded"/>
 *         &lt;element name="RESULTLEVEL" type="{http://earthdawn.com/characteristics}CHARACTERISTICS_RESULTLEVEL" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "encumbranceOrDEFENSERAITINGOrMYSTICARMOR"
})
@XmlRootElement(name = "CHARACTERISTICS", namespace = "http://earthdawn.com/characteristics")
public class CHARACTERISTICS {

    @XmlElementRefs({
        @XmlElementRef(name = "HEALTHRATING", namespace = "http://earthdawn.com/characteristics", type = JAXBElement.class),
        @XmlElementRef(name = "DEFENSERAITING", namespace = "http://earthdawn.com/characteristics", type = JAXBElement.class),
        @XmlElementRef(name = "DISCIPLINENR", namespace = "http://earthdawn.com/characteristics", type = JAXBElement.class),
        @XmlElementRef(name = "MYSTICARMOR", namespace = "http://earthdawn.com/characteristics", type = JAXBElement.class),
        @XmlElementRef(name = "STEPDICETABLE", namespace = "http://earthdawn.com/characteristics", type = JAXBElement.class),
        @XmlElementRef(name = "LEGENDARYSTATUS", namespace = "http://earthdawn.com/characteristics", type = JAXBElement.class),
        @XmlElementRef(name = "SKILLLPCOST", namespace = "http://earthdawn.com/characteristics", type = JAXBElement.class),
        @XmlElementRef(name = "ENCUMBRANCE", namespace = "http://earthdawn.com/characteristics", type = JAXBElement.class),
        @XmlElementRef(name = "ATTRIBUTELPCOST", namespace = "http://earthdawn.com/characteristics", type = JAXBElement.class),
        @XmlElementRef(name = "RESULTLEVEL", namespace = "http://earthdawn.com/characteristics", type = JAXBElement.class),
        @XmlElementRef(name = "ATTRIBUTECOST", namespace = "http://earthdawn.com/characteristics", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> encumbranceOrDEFENSERAITINGOrMYSTICARMOR;

    /**
     * Gets the value of the encumbranceOrDEFENSERAITINGOrMYSTICARMOR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encumbranceOrDEFENSERAITINGOrMYSTICARMOR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENCUMBRANCEOrDEFENSERAITINGOrMYSTICARMOR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CHARACTERISTICSDEFENSERAITING }{@code >}
     * {@link JAXBElement }{@code <}{@link CHARACTERISTICSHEALTHRATING }{@code >}
     * {@link JAXBElement }{@code <}{@link CHARACTERISTICSMYSTICARMOR }{@code >}
     * {@link JAXBElement }{@code <}{@link CHARACTERISTICSDISCIPLINENR }{@code >}
     * {@link JAXBElement }{@code <}{@link CHARACTERISTICSSTEPDICETABLE }{@code >}
     * {@link JAXBElement }{@code <}{@link CHARACTERISTICSLEGENDARYSTATUS }{@code >}
     * {@link JAXBElement }{@code <}{@link CHARACTERISTICSCOST }{@code >}
     * {@link JAXBElement }{@code <}{@link CHARACTERISTICSENCUMBRANCE }{@code >}
     * {@link JAXBElement }{@code <}{@link CHARACTERISTICSCOST }{@code >}
     * {@link JAXBElement }{@code <}{@link CHARACTERISTICSRESULTLEVEL }{@code >}
     * {@link JAXBElement }{@code <}{@link CHARACTERISTICSATTRIBUTECOST }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getENCUMBRANCEOrDEFENSERAITINGOrMYSTICARMOR() {
        if (encumbranceOrDEFENSERAITINGOrMYSTICARMOR == null) {
            encumbranceOrDEFENSERAITINGOrMYSTICARMOR = new ArrayList<JAXBElement<?>>();
        }
        return this.encumbranceOrDEFENSERAITINGOrMYSTICARMOR;
    }

}
