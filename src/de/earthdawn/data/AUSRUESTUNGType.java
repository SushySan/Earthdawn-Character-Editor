//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.01 at 11:44:24 AM MEZ 
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
 * <p>Java class for AUSRUESTUNG_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AUSRUESTUNG_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="GEGENSTAND" type="{http://earthdawn.de}GEGENSTAND_type" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *       &lt;attribute name="ort" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AUSRUESTUNG_type", propOrder = {
    "gegenstand"
})
public class AUSRUESTUNGType {

    @XmlElement(name = "GEGENSTAND")
    protected List<GEGENSTANDType> gegenstand;
    @XmlAttribute(required = true)
    protected String ort;

    /**
     * Gets the value of the gegenstand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gegenstand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGEGENSTAND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GEGENSTANDType }
     * 
     * 
     */
    public List<GEGENSTANDType> getGEGENSTAND() {
        if (gegenstand == null) {
            gegenstand = new ArrayList<GEGENSTANDType>();
        }
        return this.gegenstand;
    }

    /**
     * Gets the value of the ort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Sets the value of the ort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrt(String value) {
        this.ort = value;
    }

}
