
package br.gov.capes.financeiro.servico.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de dadosPagamentoBolsaExterior complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosPagamentoBolsaExterior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdAbaFed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdBankTransNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdBicSwift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdIban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdOutro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contaCorrente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataReferencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enderecoBancoExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCredorSistemaOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inscricaoGenerica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modalidadeBolsa" type="{http://soap.servico.financeiro.capes.gov.br/}modalidadeBolsa" minOccurs="0"/>
 *         &lt;element name="modalidadePagamento" type="{http://soap.servico.financeiro.capes.gov.br/}modalidadePagamento" minOccurs="0"/>
 *         &lt;element name="moeda" type="{http://soap.servico.financeiro.capes.gov.br/}moeda" minOccurs="0"/>
 *         &lt;element name="naturezaDespesa" type="{http://soap.servico.financeiro.capes.gov.br/}naturezaDespesa" minOccurs="0"/>
 *         &lt;element name="nomeCredor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dadosPagamentoBolsaExterior", propOrder = {
    "agencia",
    "cdAbaFed",
    "cdBankTransNumber",
    "cdBicSwift",
    "cdIban",
    "cdOutro",
    "cnpj",
    "contaCorrente",
    "cpf",
    "dataReferencia",
    "endereco",
    "enderecoBancoExterior",
    "idCredorSistemaOrigem",
    "inscricaoGenerica",
    "modalidadeBolsa",
    "modalidadePagamento",
    "moeda",
    "naturezaDespesa",
    "nomeCredor",
    "numeroBanco",
    "siglaPais",
    "valor"
})
public class DadosPagamentoBolsaExterior {

    protected String agencia;
    protected String cdAbaFed;
    protected String cdBankTransNumber;
    protected String cdBicSwift;
    protected String cdIban;
    protected String cdOutro;
    protected String cnpj;
    protected String contaCorrente;
    protected String cpf;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataReferencia;
    protected String endereco;
    protected String enderecoBancoExterior;
    protected String idCredorSistemaOrigem;
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
    protected String numeroBanco;
    protected String siglaPais;
    protected BigDecimal valor;

    /**
     * Obtém o valor da propriedade agencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Define o valor da propriedade agencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencia(String value) {
        this.agencia = value;
    }

    /**
     * Obtém o valor da propriedade cdAbaFed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdAbaFed() {
        return cdAbaFed;
    }

    /**
     * Define o valor da propriedade cdAbaFed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdAbaFed(String value) {
        this.cdAbaFed = value;
    }

    /**
     * Obtém o valor da propriedade cdBankTransNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdBankTransNumber() {
        return cdBankTransNumber;
    }

    /**
     * Define o valor da propriedade cdBankTransNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdBankTransNumber(String value) {
        this.cdBankTransNumber = value;
    }

    /**
     * Obtém o valor da propriedade cdBicSwift.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdBicSwift() {
        return cdBicSwift;
    }

    /**
     * Define o valor da propriedade cdBicSwift.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdBicSwift(String value) {
        this.cdBicSwift = value;
    }

    /**
     * Obtém o valor da propriedade cdIban.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdIban() {
        return cdIban;
    }

    /**
     * Define o valor da propriedade cdIban.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdIban(String value) {
        this.cdIban = value;
    }

    /**
     * Obtém o valor da propriedade cdOutro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdOutro() {
        return cdOutro;
    }

    /**
     * Define o valor da propriedade cdOutro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdOutro(String value) {
        this.cdOutro = value;
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
     * Obtém o valor da propriedade enderecoBancoExterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoBancoExterior() {
        return enderecoBancoExterior;
    }

    /**
     * Define o valor da propriedade enderecoBancoExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoBancoExterior(String value) {
        this.enderecoBancoExterior = value;
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
     * Obtém o valor da propriedade siglaPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaPais() {
        return siglaPais;
    }

    /**
     * Define o valor da propriedade siglaPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaPais(String value) {
        this.siglaPais = value;
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
