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
 * <p>Java class for OPTIONALRULES_DEFAULTLANGUAGE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OPTIONALRULES_DEFAULTLANGUAGE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://earthdawn.com/datatypes}CHARACTERLANGUAGE_type"&gt;
 *       &lt;attribute name="lang" use="required" type="{http://earthdawn.com/datatypes}language_type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPTIONALRULES_DEFAULTLANGUAGE", namespace = "http://earthdawn.com/optionalrules")
public class OPTIONALRULESDEFAULTLANGUAGE
    extends CHARACTERLANGUAGEType
{

    @XmlAttribute(name = "lang", required = true)
    protected LanguageType lang;

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

}
