
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosPopularSLR complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosPopularSLR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpfUsuarioSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroSLRFormatado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaProgramaCapes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaSistemaCapes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosPopularSLR", propOrder = {
    "cpfUsuarioSolicitante",
    "numeroSLRFormatado",
    "siglaProgramaCapes",
    "siglaSistemaCapes"
})
@XmlSeeAlso({
    DadosPopularCancelamentoCartaoExterior.class,
    DadosPopularSolicitacaoCartaoPesquisador.class,
    DadosPopularPagamentoBolsaExteriorReais.class,
    DadosPopularSolicitacaoCartaoExterior.class,
    DadosPopularPagamentoInvoice.class,
    DadosPopularPagamentoCartaoBeneficio.class,
    DadosPopularAlteracaoProcessoCartaoExterior.class,
    DadosPopularAAE.class,
    SolicitacaoAnulacaoEmpenhoCartaoPesquisador.class,
    DadosPopularCartaoBeneficio.class,
    DadosPopularOBP.class,
    SolicitacaoBaixarAUXPE.class,
    DadosPopularPagamentoCartaoPesquisador.class,
    DadosPopularPagamentoBolsaExterior.class,
    DadosPopularPagamentoCartaoExterior.class,
    DadosPopularCredor.class,
    DadosPopularEmpenhoCartaoPesquisador.class
})
public abstract class DadosPopularSLR {

    protected String cpfUsuarioSolicitante;
    protected String numeroSLRFormatado;
    protected String siglaProgramaCapes;
    protected String siglaSistemaCapes;

    /**
     * Obtém o valor da propriedade cpfUsuarioSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfUsuarioSolicitante() {
        return cpfUsuarioSolicitante;
    }

    /**
     * Define o valor da propriedade cpfUsuarioSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfUsuarioSolicitante(String value) {
        this.cpfUsuarioSolicitante = value;
    }

    /**
     * Obtém o valor da propriedade numeroSLRFormatado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSLRFormatado() {
        return numeroSLRFormatado;
    }

    /**
     * Define o valor da propriedade numeroSLRFormatado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSLRFormatado(String value) {
        this.numeroSLRFormatado = value;
    }

    /**
     * Obtém o valor da propriedade siglaProgramaCapes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaProgramaCapes() {
        return siglaProgramaCapes;
    }

    /**
     * Define o valor da propriedade siglaProgramaCapes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaProgramaCapes(String value) {
        this.siglaProgramaCapes = value;
    }

    /**
     * Obtém o valor da propriedade siglaSistemaCapes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaSistemaCapes() {
        return siglaSistemaCapes;
    }

    /**
     * Define o valor da propriedade siglaSistemaCapes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaSistemaCapes(String value) {
        this.siglaSistemaCapes = value;
    }

}
