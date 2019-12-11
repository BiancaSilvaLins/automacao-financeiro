
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de esferaAdministrativa.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="esferaAdministrativa">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MUNICIPAL"/>
 *     &lt;enumeration value="FEDERAL"/>
 *     &lt;enumeration value="ESTADUAL"/>
 *     &lt;enumeration value="PARTICULAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "esferaAdministrativa")
@XmlEnum
public enum EsferaAdministrativa {

    MUNICIPAL,
    FEDERAL,
    ESTADUAL,
    PARTICULAR;

    public String value() {
        return name();
    }

    public static EsferaAdministrativa fromValue(String v) {
        return valueOf(v);
    }

}
