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
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for base64binary_type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="base64binary_type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;base64Binary"&gt;
 *       &lt;attribute name="contenttype" type="{http://www.w3.org/2001/XMLSchema}string" default="image/jpeg" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "base64binary_type", propOrder = {
    "value"
})
public class Base64BinaryType {

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "contenttype")
    protected String contenttype;

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * Gets the value of the contenttype property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContenttype() {
        if (contenttype == null) {
            return "image/jpeg";
        } else {
            return contenttype;
        }
    }

    /**
     * Sets the value of the contenttype property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContenttype(String value) {
        this.contenttype = value;
    }

}
