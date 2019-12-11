
package br.gov.capes.financeiro.servico.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de dadosPagamentoCartaoBeneficio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosPagamentoCartaoBeneficio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agenciaRetiradaCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoGestao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUnidadeGestora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contaCorrente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataFimPeriodo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataInicioPeriodo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataReferencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idCredorSistemaOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modalidadeBolsa" type="{http://soap.servico.financeiro.capes.gov.br/}modalidadeBolsa" minOccurs="0"/>
 *         &lt;element name="modalidadePagamento" type="{http://soap.servico.financeiro.capes.gov.br/}modalidadePagamento" minOccurs="0"/>
 *         &lt;element name="nomeCredor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroLote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroParcela" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosPagamentoCartaoBeneficio", propOrder = {
    "agenciaRetiradaCartao",
    "codigoGestao",
    "codigoUnidadeGestora",
    "contaCorrente",
    "cpf",
    "dataFimPeriodo",
    "dataInicioPeriodo",
    "dataReferencia",
    "idCredorSistemaOrigem",
    "modalidadeBolsa",
    "modalidadePagamento",
    "nomeCredor",
    "numeroLote",
    "numeroParcela",
    "valor"
})
public class DadosPagamentoCartaoBeneficio {

    protected String agenciaRetiradaCartao;
    protected String codigoGestao;
    protected String codigoUnidadeGestora;
    protected String contaCorrente;
    protected String cpf;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFimPeriodo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicioPeriodo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataReferencia;
    protected String idCredorSistemaOrigem;
    @XmlSchemaType(name = "string")
    protected ModalidadeBolsa modalidadeBolsa;
    @XmlSchemaType(name = "string")
    protected ModalidadePagamento modalidadePagamento;
    protected String nomeCredor;
    protected String numeroLote;
    protected Integer numeroParcela;
    protected BigDecimal valor;

    /**
     * Obtém o valor da propriedade agenciaRetiradaCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgenciaRetiradaCartao() {
        return agenciaRetiradaCartao;
    }

    /**
     * Define o valor da propriedade agenciaRetiradaCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgenciaRetiradaCartao(String value) {
        this.agenciaRetiradaCartao = value;
    }

    /**
     * Obtém o valor da propriedade codigoGestao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoGestao() {
        return codigoGestao;
    }

    /**
     * Define o valor da propriedade codigoGestao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoGestao(String value) {
        this.codigoGestao = value;
    }

    /**
     * Obtém o valor da propriedade codigoUnidadeGestora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUnidadeGestora() {
        return codigoUnidadeGestora;
    }

    /**
     * Define o valor da propriedade codigoUnidadeGestora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUnidadeGestora(String value) {
        this.codigoUnidadeGestora = value;
    }

    /**
     * Obtém o valor da propriedade contaCorrente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContaCorrente() {
        return contaCorrente;
    }

    /**
     * Define o valor da propriedade contaCorrente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContaCorrente(String value) {
        this.contaCorrente = value;
    }

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
     * Obtém o valor da propriedade dataFimPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFimPeriodo() {
        return dataFimPeriodo;
    }

    /**
     * Define o valor da propriedade dataFimPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFimPeriodo(XMLGregorianCalendar value) {
        this.dataFimPeriodo = value;
    }

    /**
     * Obtém o valor da propriedade dataInicioPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicioPeriodo() {
        return dataInicioPeriodo;
    }

    /**
     * Define o valor da propriedade dataInicioPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicioPeriodo(XMLGregorianCalendar value) {
        this.dataInicioPeriodo = value;
    }

    /**
     * Obtém o valor da propriedade dataReferencia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataReferencia() {
        return dataReferencia;
    }

    /**
     * Define o valor da propriedade dataReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataReferencia(XMLGregorianCalendar value) {
        this.dataReferencia = value;
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
     * Obtém o valor da propriedade nomeCredor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCredor() {
        return nomeCredor;
    }

    /**
     * Define o valor da propriedade nomeCredor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCredor(String value) {
        this.nomeCredor = value;
    }

    /**
     * Obtém o valor da propriedade numeroLote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLote() {
        return numeroLote;
    }

    /**
     * Define o valor da propriedade numeroLote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLote(String value) {
        this.numeroLote = value;
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
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValor(BigDecimal value) {
        this.valor = value;
    }

}
