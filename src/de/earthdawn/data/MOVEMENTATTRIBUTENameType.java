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
 * <p>Java class for MOVEMENTATTRIBUTE_name_type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MOVEMENTATTRIBUTE_name_type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEX"/&gt;
 *     &lt;enumeration value="STR"/&gt;
 *     &lt;enumeration value="STR+DEX"/&gt;
 *     &lt;enumeration value="MAX"/&gt;
 *     &lt;enumeration value="na"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType(name = "MOVEMENTATTRIBUTE_name_type")
@XmlEnum
public enum MOVEMENTATTRIBUTENameType {

    DEX("DEX"),
    STR("STR"),
    @XmlEnumValue("STR+DEX")
    STR_DEX("STR+DEX"),
    MAX("MAX"),
    @XmlEnumValue("na")
    NA("na");
    private final String value;

    MOVEMENTATTRIBUTENameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MOVEMENTATTRIBUTENameType fromValue(String v) {
        for (MOVEMENTATTRIBUTENameType c: MOVEMENTATTRIBUTENameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
