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
 * <p>Java class for NAME_TIERKIND_type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NAME_TIERKIND_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://earthdawn.com/translation}TRANSLATION_type"&gt;
 *       &lt;attribute name="type" use="required" type="{http://earthdawn.com/datatypes}tierkind_type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAME_TIERKIND_type", namespace = "http://earthdawn.com/translation")
public class NAMETIERKINDType
    extends TRANSLATIONType
{

    @XmlAttribute(name = "type", required = true)
    protected TierkindType type;

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link TierkindType }
     *
     */
    public TierkindType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link TierkindType }
     *
     */
    public void setType(TierkindType value) {
        this.type = value;
    }

}
