
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosPopularPagamentoInvoice complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosPopularPagamentoInvoice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.servico.financeiro.capes.gov.br/}dadosPopularSLR">
 *       &lt;sequence>
 *         &lt;element name="dadosPagamento" type="{http://soap.servico.financeiro.capes.gov.br/}dadosPagamentoInvoice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosPopularPagamentoInvoice", propOrder = {
    "dadosPagamento"
})
public class DadosPopularPagamentoInvoice
    extends DadosPopularSLR
{

    protected DadosPagamentoInvoice dadosPagamento;

    /**
     * Obtém o valor da propriedade dadosPagamento.
     * 
     * @return
     *     possible object is
     *     {@link DadosPagamentoInvoice }
     *     
     */
    public DadosPagamentoInvoice getDadosPagamento() {
        return dadosPagamento;
    }

    /**
     * Define o valor da propriedade dadosPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosPagamentoInvoice }
     *     
     */
    public void setDadosPagamento(DadosPagamentoInvoice value) {
        this.dadosPagamento = value;
    }

}
