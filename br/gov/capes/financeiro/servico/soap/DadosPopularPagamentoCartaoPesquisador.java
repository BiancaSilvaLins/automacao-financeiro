
package br.gov.capes.financeiro.servico.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosPopularPagamentoCartaoPesquisador complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosPopularPagamentoCartaoPesquisador">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.servico.financeiro.capes.gov.br/}dadosPopularSLR">
 *       &lt;sequence>
 *         &lt;element name="pagamentos" type="{http://soap.servico.financeiro.capes.gov.br/}dadosPagamentoCartaoPesquisador" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosPopularPagamentoCartaoPesquisador", propOrder = {
    "pagamentos"
})
public class DadosPopularPagamentoCartaoPesquisador
    extends DadosPopularSLR
{

    @XmlElement(nillable = true)
    protected List<DadosPagamentoCartaoPesquisador> pagamentos;

    /**
     * Gets the value of the pagamentos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pagamentos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPagamentos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosPagamentoCartaoPesquisador }
     * 
     * 
     */
    public List<DadosPagamentoCartaoPesquisador> getPagamentos() {
        if (pagamentos == null) {
            pagamentos = new ArrayList<DadosPagamentoCartaoPesquisador>();
        }
        return this.pagamentos;
    }

}
