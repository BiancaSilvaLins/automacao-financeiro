
package br.gov.capes.financeiro.servico.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosPopularPagamentoCartaoBeneficio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosPopularPagamentoCartaoBeneficio">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.servico.financeiro.capes.gov.br/}dadosPopularSLR">
 *       &lt;sequence>
 *         &lt;element name="dadosPagamentoCartoes" type="{http://soap.servico.financeiro.capes.gov.br/}dadosPagamentoCartaoBeneficio" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosPopularPagamentoCartaoBeneficio", propOrder = {
    "dadosPagamentoCartoes"
})
public class DadosPopularPagamentoCartaoBeneficio
    extends DadosPopularSLR
{

    @XmlElement(nillable = true)
    protected List<DadosPagamentoCartaoBeneficio> dadosPagamentoCartoes;

    /**
     * Gets the value of the dadosPagamentoCartoes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosPagamentoCartoes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosPagamentoCartoes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosPagamentoCartaoBeneficio }
     * 
     * 
     */
    public List<DadosPagamentoCartaoBeneficio> getDadosPagamentoCartoes() {
        if (dadosPagamentoCartoes == null) {
            dadosPagamentoCartoes = new ArrayList<DadosPagamentoCartaoBeneficio>();
        }
        return this.dadosPagamentoCartoes;
    }

}
