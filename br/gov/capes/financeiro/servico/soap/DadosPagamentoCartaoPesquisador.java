
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de dadosPagamentoCartaoPesquisador complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosPagamentoCartaoPesquisador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataReferenciaPagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataVencimentoLimite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idCredorSistemaOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modalidadeBolsa" type="{http://soap.servico.financeiro.capes.gov.br/}modalidadeBolsa" minOccurs="0"/>
 *         &lt;element name="modalidadePagamento" type="{http://soap.servico.financeiro.capes.gov.br/}modalidadePagamento" minOccurs="0"/>
 *         &lt;element name="naturezaDespesa" type="{http://soap.servico.financeiro.capes.gov.br/}naturezaDespesa" minOccurs="0"/>
 *         &lt;element name="nomeCompleto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCartaoPesquisador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroEmpenho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroParcela" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numeroProcesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorPagamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosPagamentoCartaoPesquisador", propOrder = {
    "cpf",
    "dataReferenciaPagamento",
    "dataVencimentoLimite",
    "idCredorSistemaOrigem",
    "modalidadeBolsa",
    "modalidadePagamento",
    "naturezaDespesa",
    "nomeCompleto",
    "numeroCartaoPesquisador",
    "numeroEmpenho",
    "numeroParcela",
    "numeroProcesso",
    "valorPagamento"
})
public class DadosPagamentoCartaoPesquisador {

    protected String cpf;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataReferenciaPagamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVencimentoLimite;
    protected String idCredorSistemaOrigem;
    @XmlSchemaType(name = "string")
    protected ModalidadeBolsa modalidadeBolsa;
    @XmlSchemaType(name = "string")
    protected ModalidadePagamento modalidadePagamento;
    @XmlSchemaType(name = "string")
    protected NaturezaDespesa naturezaDespesa;
    protected String nomeCompleto;
    protected String numeroCartaoPesquisador;
    protected String numeroEmpenho;
    protected Integer numeroParcela;
    protected String numeroProcesso;
    protected Integer valorPagamento;

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade dataReferenciaPagamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataReferenciaPagamento() {
        return dataReferenciaPagamento;
    }

    /**
     * Define o valor da propriedade dataReferenciaPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataReferenciaPagamento(XMLGregorianCalendar value) {
        this.dataReferenciaPagamento = value;
    }

    /**
     * Obtém o valor da propriedade dataVencimentoLimite.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVencimentoLimite() {
        return dataVencimentoLimite;
    }

    /**
     * Define o valor da propriedade dataVencimentoLimite.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVencimentoLimite(XMLGregorianCalendar value) {
        this.dataVencimentoLimite = value;
    }

    /**
     * Obtém o valor da propriedade idCredorSistemaOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCredorSistemaOrigem() {
        return idCredorSistemaOrigem;
    }

    /**
     * Define o valor da propriedade idCredorSistemaOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCredorSistemaOrigem(String value) {
        this.idCredorSistemaOrigem = value;
    }

    /**
     * Obtém o valor da propriedade modalidadeBolsa.
     * 
     * @return
     *     possible object is
     *     {@link ModalidadeBolsa }
     *     
     */
    public ModalidadeBolsa getModalidadeBolsa() {
        return modalidadeBolsa;
    }

    /**
     * Define o valor da propriedade modalidadeBolsa.
     * 
     * @param value
     *     allowed object is
     *     {@link ModalidadeBolsa }
     *     
     */
    public void setModalidadeBolsa(ModalidadeBolsa value) {
        this.modalidadeBolsa = value;
    }

    /**
     * Obtém o valor da propriedade modalidadePagamento.
     * 
     * @return
     *     possible object is
     *     {@link ModalidadePagamento }
     *     
     */
    public ModalidadePagamento getModalidadePagamento() {
        return modalidadePagamento;
    }

    /**
     * Define o valor da propriedade modalidadePagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link ModalidadePagamento }
     *     
     */
    public void setModalidadePagamento(ModalidadePagamento value) {
        this.modalidadePagamento = value;
    }

    /**
     * Obtém o valor da propriedade naturezaDespesa.
     * 
     * @return
     *     possible object is
     *     {@link NaturezaDespesa }
     *     
     */
    public NaturezaDespesa getNaturezaDespesa() {
        return naturezaDespesa;
    }

    /**
     * Define o valor da propriedade naturezaDespesa.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturezaDespesa }
     *     
     */
    public void setNaturezaDespesa(NaturezaDespesa value) {
        this.naturezaDespesa = value;
    }

    /**
     * Obtém o valor da propriedade nomeCompleto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * Define o valor da propriedade nomeCompleto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCompleto(String value) {
        this.nomeCompleto = value;
    }

    /**
     * Obtém o valor da propriedade numeroCartaoPesquisador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCartaoPesquisador() {
        return numeroCartaoPesquisador;
    }

    /**
     * Define o valor da propriedade numeroCartaoPesquisador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCartaoPesquisador(String value) {
        this.numeroCartaoPesquisador = value;
    }

    /**
     * Obtém o valor da propriedade numeroEmpenho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEmpenho() {
        return numeroEmpenho;
    }

    /**
     * Define o valor da propriedade numeroEmpenho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEmpenho(String value) {
        this.numeroEmpenho = value;
    }

    /**
     * Obtém o valor da propriedade numeroParcela.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroParcela() {
        return numeroParcela;
    }

    /**
     * Define o valor da propriedade numeroParcela.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroParcela(Integer value) {
        this.numeroParcela = value;
    }

    /**
     * Obtém o valor da propriedade numeroProcesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    /**
     * Define o valor da propriedade numeroProcesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProcesso(String value) {
        this.numeroProcesso = value;
    }

    /**
     * Obtém o valor da propriedade valorPagamento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValorPagamento() {
        return valorPagamento;
    }

    /**
     * Define o valor da propriedade valorPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValorPagamento(Integer value) {
        this.valorPagamento = value;
    }

}
