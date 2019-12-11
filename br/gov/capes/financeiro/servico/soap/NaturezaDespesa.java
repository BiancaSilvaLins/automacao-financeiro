
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de naturezaDespesa.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="naturezaDespesa">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ND_33901800"/>
 *     &lt;enumeration value="ND_33901801"/>
 *     &lt;enumeration value="ND_33901802"/>
 *     &lt;enumeration value="ND_33901804"/>
 *     &lt;enumeration value="ND_33902000"/>
 *     &lt;enumeration value="ND_33902001"/>
 *     &lt;enumeration value="ND_33904800"/>
 *     &lt;enumeration value="ND_33904803"/>
 *     &lt;enumeration value="ND_33909200"/>
 *     &lt;enumeration value="ND_33909218"/>
 *     &lt;enumeration value="ND_33909248"/>
 *     &lt;enumeration value="ND_33914700"/>
 *     &lt;enumeration value="ND_33914701"/>
 *     &lt;enumeration value="ND_33914718"/>
 *     &lt;enumeration value="ND_33919200"/>
 *     &lt;enumeration value="ND_33919247"/>
 *     &lt;enumeration value="ND_44902000"/>
 *     &lt;enumeration value="ND_44902001"/>
 *     &lt;enumeration value="ND_31901100"/>
 *     &lt;enumeration value="ND_33903600"/>
 *     &lt;enumeration value="ND_44905252"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "naturezaDespesa")
@XmlEnum
public enum NaturezaDespesa {

    ND_33901800,
    ND_33901801,
    ND_33901802,
    ND_33901804,
    ND_33902000,
    ND_33902001,
    ND_33904800,
    ND_33904803,
    ND_33909200,
    ND_33909218,
    ND_33909248,
    ND_33914700,
    ND_33914701,
    ND_33914718,
    ND_33919200,
    ND_33919247,
    ND_44902000,
    ND_44902001,
    ND_31901100,
    ND_33903600,
    ND_44905252;

    public String value() {
        return name();
    }

    public static NaturezaDespesa fromValue(String v) {
        return valueOf(v);
    }

}
