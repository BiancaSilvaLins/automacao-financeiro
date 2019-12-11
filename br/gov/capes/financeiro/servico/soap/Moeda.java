
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de moeda.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="moeda">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="NZD"/>
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="SEK"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="DKK"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="RYB"/>
 *     &lt;enumeration value="JPY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "moeda")
@XmlEnum
public enum Moeda {

    BRL,
    USD,
    EUR,
    CAD,
    NZD,
    AUD,
    SEK,
    GBP,
    DKK,
    NOK,
    CHF,
    RYB,
    JPY;

    public String value() {
        return name();
    }

    public static Moeda fromValue(String v) {
        return valueOf(v);
    }

}
