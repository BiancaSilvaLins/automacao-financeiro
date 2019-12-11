
package br.gov.capes.financeiro.servico.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosPopularCartaoBeneficio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosPopularCartaoBeneficio">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.servico.financeiro.capes.gov.br/}dadosPopularSLR">
 *       &lt;sequence>
 *         &lt;element name="dadosSolicitacoesCartoes" type="{http://soap.servico.financeiro.capes.gov.br/}dadosCartaoBeneficio" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosPopularCartaoBeneficio", propOrder = {
    "dadosSolicitacoesCartoes"
})
@XmlSeeAlso({
    DadosPopularAlteracaoCartaoBeneficio.class,
    DadosPopularSolicitacaoCartaoBeneficio.class
})
public class DadosPopularCartaoBeneficio
    extends DadosPopularSLR
{

    @XmlElement(nillable = true)
    protected List<DadosCartaoBeneficio> dadosSolicitacoesCartoes;

    /**
     * Gets the value of the dadosSolicitacoesCartoes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosSolicitacoesCartoes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosSolicitacoesCartoes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosCartaoBeneficio }
     * 
     * 
     */
    public List<DadosCartaoBeneficio> getDadosSolicitacoesCartoes() {
        if (dadosSolicitacoesCartoes == null) {
            dadosSolicitacoesCartoes = new ArrayList<DadosCartaoBeneficio>();
        }
        return this.dadosSolicitacoesCartoes;
    }

}
