
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de popularPagamentoBolsaExteriorContaPais complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="popularPagamentoBolsaExteriorContaPais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dados" type="{http://soap.servico.financeiro.capes.gov.br/}dadosPopularPagamentoBolsaExteriorContaPais" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "popularPagamentoBolsaExteriorContaPais", propOrder = {
    "dados"
})
public class PopularPagamentoBolsaExteriorContaPais {

    protected DadosPopularPagamentoBolsaExteriorContaPais dados;

    /**
     * Obtém o valor da propriedade dados.
     * 
     * @return
     *     possible object is
     *     {@link DadosPopularPagamentoBolsaExteriorContaPais }
     *     
     */
    public DadosPopularPagamentoBolsaExteriorContaPais getDados() {
        return dados;
    }

    /**
     * Define o valor da propriedade dados.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosPopularPagamentoBolsaExteriorContaPais }
     *     
     */
    public void setDados(DadosPopularPagamentoBolsaExteriorContaPais value) {
        this.dados = value;
    }

}
