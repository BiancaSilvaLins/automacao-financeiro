
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de popularAnulacaoEmpenhoCartaoPesquisaor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="popularAnulacaoEmpenhoCartaoPesquisaor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://soap.servico.financeiro.capes.gov.br/}solicitacaoAnulacaoEmpenhoCartaoPesquisador" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "popularAnulacaoEmpenhoCartaoPesquisaor", propOrder = {
    "arg0"
})
public class PopularAnulacaoEmpenhoCartaoPesquisaor {

    protected SolicitacaoAnulacaoEmpenhoCartaoPesquisador arg0;

    /**
     * Obtém o valor da propriedade arg0.
     * 
     * @return
     *     possible object is
     *     {@link SolicitacaoAnulacaoEmpenhoCartaoPesquisador }
     *     
     */
    public SolicitacaoAnulacaoEmpenhoCartaoPesquisador getArg0() {
        return arg0;
    }

    /**
     * Define o valor da propriedade arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitacaoAnulacaoEmpenhoCartaoPesquisador }
     *     
     */
    public void setArg0(SolicitacaoAnulacaoEmpenhoCartaoPesquisador value) {
        this.arg0 = value;
    }

}
