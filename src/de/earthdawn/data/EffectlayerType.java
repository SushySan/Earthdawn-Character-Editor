//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for effectlayer_type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="effectlayer_type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="physical"/&gt;
 *     &lt;enumeration value="mystic"/&gt;
 *     &lt;enumeration value="social"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType(name = "effectlayer_type")
@XmlEnum
public enum EffectlayerType {

    @XmlEnumValue("physical")
    PHYSICAL("physical"),
    @XmlEnumValue("mystic")
    MYSTIC("mystic"),
    @XmlEnumValue("social")
    SOCIAL("social");
    private final String value;

    EffectlayerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EffectlayerType fromValue(String v) {
        for (EffectlayerType c: EffectlayerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
