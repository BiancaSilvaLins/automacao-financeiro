
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de modalidadePagamento.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="modalidadePagamento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAPITAL"/>
 *     &lt;enumeration value="CUSTEIO"/>
 *     &lt;enumeration value="MENSALIDADE"/>
 *     &lt;enumeration value="DIFERENCA_MENSALIDADE"/>
 *     &lt;enumeration value="AUXILIO"/>
 *     &lt;enumeration value="DIFERENCA_SEGURO_SAUDE"/>
 *     &lt;enumeration value="DIFERENCA_DEPENDENTES"/>
 *     &lt;enumeration value="DIFERENCA_AUXILIO_DESLOCAMENTO"/>
 *     &lt;enumeration value="DIFERENCA_AUXILIO_INSTALACAO"/>
 *     &lt;enumeration value="AUXILIO_INSTALACAO"/>
 *     &lt;enumeration value="AUXILIO_DEFESA_TESE"/>
 *     &lt;enumeration value="AUXILIO_DESLOCAMENTO"/>
 *     &lt;enumeration value="AUXILIO_SEGURO_SAUDE"/>
 *     &lt;enumeration value="ADICIONAL_LOCALIDADE"/>
 *     &lt;enumeration value="AUXILIO_BIBLIOTECA"/>
 *     &lt;enumeration value="AUXILIO_PASSEIO"/>
 *     &lt;enumeration value="AUXILIO_MATERIAL_DIDATICO"/>
 *     &lt;enumeration value="AUXILIO_RETORNO"/>
 *     &lt;enumeration value="ADICIONAL_DEPENDENTE"/>
 *     &lt;enumeration value="ACERTOS"/>
 *     &lt;enumeration value="PENSAO_ALIMENTICIA"/>
 *     &lt;enumeration value="DIARIAS"/>
 *     &lt;enumeration value="PASSAGENS"/>
 *     &lt;enumeration value="OUTROS_CREDITOS"/>
 *     &lt;enumeration value="TAXA_ESCOLAR"/>
 *     &lt;enumeration value="AUXILIO_SEGURO_SAUDE_DEPENDENTE"/>
 *     &lt;enumeration value="MENSALIDADE_LICENCA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "modalidadePagamento")
@XmlEnum
public enum ModalidadePagamento {

    CAPITAL,
    CUSTEIO,
    MENSALIDADE,
    DIFERENCA_MENSALIDADE,
    AUXILIO,
    DIFERENCA_SEGURO_SAUDE,
    DIFERENCA_DEPENDENTES,
    DIFERENCA_AUXILIO_DESLOCAMENTO,
    DIFERENCA_AUXILIO_INSTALACAO,
    AUXILIO_INSTALACAO,
    AUXILIO_DEFESA_TESE,
    AUXILIO_DESLOCAMENTO,
    AUXILIO_SEGURO_SAUDE,
    ADICIONAL_LOCALIDADE,
    AUXILIO_BIBLIOTECA,
    AUXILIO_PASSEIO,
    AUXILIO_MATERIAL_DIDATICO,
    AUXILIO_RETORNO,
    ADICIONAL_DEPENDENTE,
    ACERTOS,
    PENSAO_ALIMENTICIA,
    DIARIAS,
    PASSAGENS,
    OUTROS_CREDITOS,
    TAXA_ESCOLAR,
    AUXILIO_SEGURO_SAUDE_DEPENDENTE,
    MENSALIDADE_LICENCA;

    public String value() {
        return name();
    }

    public static ModalidadePagamento fromValue(String v) {
        return valueOf(v);
    }

}
