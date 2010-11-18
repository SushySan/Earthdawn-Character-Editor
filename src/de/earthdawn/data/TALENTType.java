//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.01 at 11:44:24 AM MEZ 
//


package de.earthdawn.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TALENT_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TALENT_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://earthdawn.de}FERTIGKEIT_type">
 *       &lt;attribute name="karma" use="required" type="{http://earthdawn.de}janein_type" />
 *       &lt;attribute name="disziplintalent" use="required" type="{http://earthdawn.de}janein_type" />
 *       &lt;attribute name="kreis" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TALENT_type")
public class TALENTType
    extends FERTIGKEITType
{

    @XmlAttribute(required = true)
    protected JaneinType karma;
    @XmlAttribute(required = true)
    protected JaneinType disziplintalent;
    @XmlAttribute(required = true)
    protected BigInteger kreis;

    /**
     * Gets the value of the karma property.
     * 
     * @return
     *     possible object is
     *     {@link JaneinType }
     *     
     */
    public JaneinType getKarma() {
        return karma;
    }

    /**
     * Sets the value of the karma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaneinType }
     *     
     */
    public void setKarma(JaneinType value) {
        this.karma = value;
    }

    /**
     * Gets the value of the disziplintalent property.
     * 
     * @return
     *     possible object is
     *     {@link JaneinType }
     *     
     */
    public JaneinType getDisziplintalent() {
        return disziplintalent;
    }

    /**
     * Sets the value of the disziplintalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaneinType }
     *     
     */
    public void setDisziplintalent(JaneinType value) {
        this.disziplintalent = value;
    }

    /**
     * Gets the value of the kreis property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKreis() {
        return kreis;
    }

    /**
     * Sets the value of the kreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKreis(BigInteger value) {
        this.kreis = value;
    }

}