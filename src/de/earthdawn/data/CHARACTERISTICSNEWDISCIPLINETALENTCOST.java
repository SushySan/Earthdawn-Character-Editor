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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHARACTERISTICS_NEWDISCIPLINETALENTCOST complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CHARACTERISTICS_NEWDISCIPLINETALENTCOST"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DISCIPLINE" type="{http://earthdawn.com/characteristics}CHARACTERISTICS_NEWDISCIPLINETALENTCOSTDISCIPLINE" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHARACTERISTICS_NEWDISCIPLINETALENTCOST", namespace = "http://earthdawn.com/characteristics", propOrder = {
    "discipline"
})
public class CHARACTERISTICSNEWDISCIPLINETALENTCOST {

    @XmlElement(name = "DISCIPLINE", required = true)
    protected List<CHARACTERISTICSNEWDISCIPLINETALENTCOSTDISCIPLINE> discipline;

    /**
     * Gets the value of the discipline property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discipline property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDISCIPLINE().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CHARACTERISTICSNEWDISCIPLINETALENTCOSTDISCIPLINE }
     *
     *
     */
    public List<CHARACTERISTICSNEWDISCIPLINETALENTCOSTDISCIPLINE> getDISCIPLINE() {
        if (discipline == null) {
            discipline = new ArrayList<CHARACTERISTICSNEWDISCIPLINETALENTCOSTDISCIPLINE>();
        }
        return this.discipline;
    }

}
