
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de popularSolicitacaoCartaoExterior complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="popularSolicitacaoCartaoExterior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dados" type="{http://soap.servico.financeiro.capes.gov.br/}dadosPopularSolicitacaoCartaoExterior" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "popularSolicitacaoCartaoExterior", propOrder = {
    "dados"
})
public class PopularSolicitacaoCartaoExterior {

    protected DadosPopularSolicitacaoCartaoExterior dados;

    /**
     * Obt�m o valor da propriedade dados.
     * 
     * @return
     *     possible object is
     *     {@link DadosPopularSolicitacaoCartaoExterior }
     *     
     */
    public DadosPopularSolicitacaoCartaoExterior getDados() {
        return dados;
    }

    /**
     * Define o valor da propriedade dados.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosPopularSolicitacaoCartaoExterior }
     *     
     */
    public void setDados(DadosPopularSolicitacaoCartaoExterior value) {
        this.dados = value;
    }

}
