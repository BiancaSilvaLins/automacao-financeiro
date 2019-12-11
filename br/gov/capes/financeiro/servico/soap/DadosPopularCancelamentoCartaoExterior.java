
package br.gov.capes.financeiro.servico.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosPopularCancelamentoCartaoExterior complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosPopularCancelamentoCartaoExterior">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.servico.financeiro.capes.gov.br/}dadosPopularSLR">
 *       &lt;sequence>
 *         &lt;element name="solicitacoesCancelamento" type="{http://soap.servico.financeiro.capes.gov.br/}dadosCancelamentoCartaoExterior" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosPopularCancelamentoCartaoExterior", propOrder = {
    "solicitacoesCancelamento"
})
public class DadosPopularCancelamentoCartaoExterior
    extends DadosPopularSLR
{

    @XmlElement(nillable = true)
    protected List<DadosCancelamentoCartaoExterior> solicitacoesCancelamento;

    /**
     * Gets the value of the solicitacoesCancelamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solicitacoesCancelamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolicitacoesCancelamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosCancelamentoCartaoExterior }
     * 
     * 
     */
    public List<DadosCancelamentoCartaoExterior> getSolicitacoesCancelamento() {
        if (solicitacoesCancelamento == null) {
            solicitacoesCancelamento = new ArrayList<DadosCancelamentoCartaoExterior>();
        }
        return this.solicitacoesCancelamento;
    }

}
