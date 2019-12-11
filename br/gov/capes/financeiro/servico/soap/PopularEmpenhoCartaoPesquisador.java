
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de popularEmpenhoCartaoPesquisador complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="popularEmpenhoCartaoPesquisador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dados" type="{http://soap.servico.financeiro.capes.gov.br/}dadosPopularEmpenhoCartaoPesquisador" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "popularEmpenhoCartaoPesquisador", propOrder = {
    "dados"
})
public class PopularEmpenhoCartaoPesquisador {

    protected DadosPopularEmpenhoCartaoPesquisador dados;

    /**
     * Obtém o valor da propriedade dados.
     * 
     * @return
     *     possible object is
     *     {@link DadosPopularEmpenhoCartaoPesquisador }
     *     
     */
    public DadosPopularEmpenhoCartaoPesquisador getDados() {
        return dados;
    }

    /**
     * Define o valor da propriedade dados.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosPopularEmpenhoCartaoPesquisador }
     *     
     */
    public void setDados(DadosPopularEmpenhoCartaoPesquisador value) {
        this.dados = value;
    }

}
