
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de popularAlteracaoCartaoBeneficio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="popularAlteracaoCartaoBeneficio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dados" type="{http://soap.servico.financeiro.capes.gov.br/}dadosPopularAlteracaoCartaoBeneficio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "popularAlteracaoCartaoBeneficio", propOrder = {
    "dados"
})
public class PopularAlteracaoCartaoBeneficio {

    protected DadosPopularAlteracaoCartaoBeneficio dados;

    /**
     * Obtém o valor da propriedade dados.
     * 
     * @return
     *     possible object is
     *     {@link DadosPopularAlteracaoCartaoBeneficio }
     *     
     */
    public DadosPopularAlteracaoCartaoBeneficio getDados() {
        return dados;
    }

    /**
     * Define o valor da propriedade dados.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosPopularAlteracaoCartaoBeneficio }
     *     
     */
    public void setDados(DadosPopularAlteracaoCartaoBeneficio value) {
        this.dados = value;
    }

}
