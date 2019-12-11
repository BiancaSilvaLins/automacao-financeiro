
package br.gov.capes.financeiro.servico.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de dadosCredor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosCredor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agenciaSemDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoGestao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUnidadeGestora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contaCorrente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataReferencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCredorSistemaOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificadorCredorSistemaSolicitanteReprocessamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificadorMunicipio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inscricaoGenerica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modalidadeBolsa" type="{http://soap.servico.financeiro.capes.gov.br/}modalidadeBolsa" minOccurs="0"/>
 *         &lt;element name="modalidadePagamento" type="{http://soap.servico.financeiro.capes.gov.br/}modalidadePagamento" minOccurs="0"/>
 *         &lt;element name="moeda" type="{http://soap.servico.financeiro.capes.gov.br/}moeda" minOccurs="0"/>
 *         &lt;element name="naturezaDespesa" type="{http://soap.servico.financeiro.capes.gov.br/}naturezaDespesa" minOccurs="0"/>
 *         &lt;element name="nomeCredor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeMaeCredor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dadosCredor", propOrder = {
    "agenciaSemDV",
    "bairro",
    "cep",
    "cnpj",
    "codigoGestao",
    "codigoUnidadeGestora",
    "contaCorrente",
    "cpf",
    "dataReferencia",
    "endereco",
    "idCredorSistemaOrigem",
    "identificadorCredorSistemaSolicitanteReprocessamento",
    "identificadorMunicipio",
    "inscricaoGenerica",
    "modalidadeBolsa",
    "modalidadePagamento",
    "moeda",
    "naturezaDespesa",
    "nomeCredor",
    "nomeMaeCredor",
    "numeroBanco",
    "observacao",
    "valor"
})
public class DadosCredor {

    protected String agenciaSemDV;
    protected String bairro;
    protected String cep;
    protected String cnpj;
    protected String codigoGestao;
    protected String codigoUnidadeGestora;
    protected String contaCorrente;
    protected String cpf;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataReferencia;
    protected String endereco;
    protected String idCredorSistemaOrigem;
    protected String identificadorCredorSistemaSolicitanteReprocessamento;
    protected Long identificadorMunicipio;
    protected String inscricaoGenerica;
    @XmlSchemaType(name = "string")
    protected ModalidadeBolsa modalidadeBolsa;
    @XmlSchemaType(name = "string")
    protected ModalidadePagamento modalidadePagamento;
    @XmlSchemaType(name = "string")
    protected Moeda moeda;
    @XmlSchemaType(name = "string")
    protected NaturezaDespesa naturezaDespesa;
    protected String nomeCredor;
    protected String nomeMaeCredor;
    protected String numeroBanco;
    protected String observacao;
    protected BigDecimal valor;

    /**
     * Obtém o valor da propriedade agenciaSemDV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgenciaSemDV() {
        return agenciaSemDV;
    }

    /**
     * Define o valor da propriedade agenciaSemDV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgenciaSemDV(String value) {
        this.agenciaSemDV = value;
    }

    /**
     * Obtém o valor da propriedade bairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o valor da propriedade bairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairro(String value) {
        this.bairro = value;
    }

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCep(String value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpj(String value) {
        this.cnpj = value;
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
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
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
     * Obtém o valor da propriedade identificadorCredorSistemaSolicitanteReprocessamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorCredorSistemaSolicitanteReprocessamento() {
        return identificadorCredorSistemaSolicitanteReprocessamento;
    }

    /**
     * Define o valor da propriedade identificadorCredorSistemaSolicitanteReprocessamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorCredorSistemaSolicitanteReprocessamento(String value) {
        this.identificadorCredorSistemaSolicitanteReprocessamento = value;
    }

    /**
     * Obtém o valor da propriedade identificadorMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdentificadorMunicipio() {
        return identificadorMunicipio;
    }

    /**
     * Define o valor da propriedade identificadorMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdentificadorMunicipio(Long value) {
        this.identificadorMunicipio = value;
    }

    /**
     * Obtém o valor da propriedade inscricaoGenerica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscricaoGenerica() {
        return inscricaoGenerica;
    }

    /**
     * Define o valor da propriedade inscricaoGenerica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscricaoGenerica(String value) {
        this.inscricaoGenerica = value;
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
     * Obtém o valor da propriedade moeda.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoeda() {
        return moeda;
    }

    /**
     * Define o valor da propriedade moeda.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoeda(Moeda value) {
        this.moeda = value;
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
     * Obtém o valor da propriedade nomeMaeCredor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMaeCredor() {
        return nomeMaeCredor;
    }

    /**
     * Define o valor da propriedade nomeMaeCredor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMaeCredor(String value) {
        this.nomeMaeCredor = value;
    }

    /**
     * Obtém o valor da propriedade numeroBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroBanco() {
        return numeroBanco;
    }

    /**
     * Define o valor da propriedade numeroBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroBanco(String value) {
        this.numeroBanco = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
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
