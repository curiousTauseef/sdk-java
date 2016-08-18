//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 11:22:30 PM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cardTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cardTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Visa"/>
 *     &lt;enumeration value="MasterCard"/>
 *     &lt;enumeration value="AmericanExpress"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="JCB"/>
 *     &lt;enumeration value="DinersClub"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cardTypeEnum")
@XmlEnum
public enum CardTypeEnum {

    @XmlEnumValue("Visa")
    VISA("Visa"),
    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),
    @XmlEnumValue("AmericanExpress")
    AMERICAN_EXPRESS("AmericanExpress"),
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),
    JCB("JCB"),
    @XmlEnumValue("DinersClub")
    DINERS_CLUB("DinersClub");
    private final String value;

    CardTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardTypeEnum fromValue(String v) {
        for (CardTypeEnum c: CardTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
