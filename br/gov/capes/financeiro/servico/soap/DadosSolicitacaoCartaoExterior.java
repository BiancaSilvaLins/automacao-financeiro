
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de dadosSolicitacaoCartaoExterior complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosSolicitacaoCartaoExterior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cepExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidadeExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="documentoInternacional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endereco1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endereco2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enderecoExterior1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enderecoExterior2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCredorSistemaOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroProcesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaPaisDocumentoInternacional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaPaisExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaUF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sobrenome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoAcaoExterior" type="{http://soap.servico.financeiro.capes.gov.br/}tipoAcaoExterior" minOccurs="0"/>
 *         &lt;element name="tipoDocumentoInternacional" type="{http://soap.servico.financeiro.capes.gov.br/}tipoDocumentoExterior" minOccurs="0"/>
 *         &lt;element name="tipoLayoutCartaoExterior" type="{http://soap.servico.financeiro.capes.gov.br/}tipoLayoutCartaoExterior" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosSolicitacaoCartaoExterior", propOrder = {
    "bairro",
    "cep",
    "cepExterior",
    "cidade",
    "cidadeExterior",
    "dataNascimento",
    "documentoInternacional",
    "email",
    "endereco1",
    "endereco2",
    "enderecoExterior1",
    "enderecoExterior2",
    "estadoExterior",
    "idCredorSistemaOrigem",
    "identificador",
    "nome",
    "numeroProcesso",
    "siglaPais",
    "siglaPaisDocumentoInternacional",
    "siglaPaisExterior",
    "siglaUF",
    "sobrenome",
    "telefone",
    "tipoAcaoExterior",
    "tipoDocumentoInternacional",
    "tipoLayoutCartaoExterior"
})
public class DadosSolicitacaoCartaoExterior {

    protected String bairro;
    protected String cep;
    protected String cepExterior;
    protected String cidade;
    protected String cidadeExterior;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataNascimento;
    protected String documentoInternacional;
    protected String email;
    protected String endereco1;
    protected String endereco2;
    protected String enderecoExterior1;
    protected String enderecoExterior2;
    protected String estadoExterior;
    protected String idCredorSistemaOrigem;
    protected String identificador;
    protected String nome;
    protected String numeroProcesso;
    protected String siglaPais;
    protected String siglaPaisDocumentoInternacional;
    protected String siglaPaisExterior;
    protected String siglaUF;
    protected String sobrenome;
    protected String telefone;
    @XmlSchemaType(name = "string")
    protected TipoAcaoExterior tipoAcaoExterior;
    @XmlSchemaType(name = "string")
    protected TipoDocumentoExterior tipoDocumentoInternacional;
    @XmlSchemaType(name = "string")
    protected TipoLayoutCartaoExterior tipoLayoutCartaoExterior;

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
     * Obtém o valor da propriedade cepExterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepExterior() {
        return cepExterior;
    }

    /**
     * Define o valor da propriedade cepExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepExterior(String value) {
        this.cepExterior = value;
    }

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Obtém o valor da propriedade cidadeExterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeExterior() {
        return cidadeExterior;
    }

    /**
     * Define o valor da propriedade cidadeExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeExterior(String value) {
        this.cidadeExterior = value;
    }

    /**
     * Obtém o valor da propriedade dataNascimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define o valor da propriedade dataNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNascimento(XMLGregorianCalendar value) {
        this.dataNascimento = value;
    }

    /**
     * Obtém o valor da propriedade documentoInternacional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoInternacional() {
        return documentoInternacional;
    }

    /**
     * Define o valor da propriedade documentoInternacional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoInternacional(String value) {
        this.documentoInternacional = value;
    }

    /**
     * Obtém o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtém o valor da propriedade endereco1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco1() {
        return endereco1;
    }

    /**
     * Define o valor da propriedade endereco1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco1(String value) {
        this.endereco1 = value;
    }

    /**
     * Obtém o valor da propriedade endereco2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco2() {
        return endereco2;
    }

    /**
     * Define o valor da propriedade endereco2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco2(String value) {
        this.endereco2 = value;
    }

    /**
     * Obtém o valor da propriedade enderecoExterior1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoExterior1() {
        return enderecoExterior1;
    }

    /**
     * Define o valor da propriedade enderecoExterior1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoExterior1(String value) {
        this.enderecoExterior1 = value;
    }

    /**
     * Obtém o valor da propriedade enderecoExterior2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoExterior2() {
        return enderecoExterior2;
    }

    /**
     * Define o valor da propriedade enderecoExterior2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoExterior2(String value) {
        this.enderecoExterior2 = value;
    }

    /**
     * Obtém o valor da propriedade estadoExterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoExterior() {
        return estadoExterior;
    }

    /**
     * Define o valor da propriedade estadoExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoExterior(String value) {
        this.estadoExterior = value;
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
     * Obtém o valor da propriedade identificador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Define o valor da propriedade identificador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificador(String value) {
        this.identificador = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
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
     * Obtém o valor da propriedade siglaPaisDocumentoInternacional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaPaisDocumentoInternacional() {
        return siglaPaisDocumentoInternacional;
    }

    /**
     * Define o valor da propriedade siglaPaisDocumentoInternacional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaPaisDocumentoInternacional(String value) {
        this.siglaPaisDocumentoInternacional = value;
    }

    /**
     * Obtém o valor da propriedade siglaPaisExterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaPaisExterior() {
        return siglaPaisExterior;
    }

    /**
     * Define o valor da propriedade siglaPaisExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaPaisExterior(String value) {
        this.siglaPaisExterior = value;
    }

    /**
     * Obtém o valor da propriedade siglaUF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaUF() {
        return siglaUF;
    }

    /**
     * Define o valor da propriedade siglaUF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaUF(String value) {
        this.siglaUF = value;
    }

    /**
     * Obtém o valor da propriedade sobrenome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Define o valor da propriedade sobrenome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobrenome(String value) {
        this.sobrenome = value;
    }

    /**
     * Obtém o valor da propriedade telefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o valor da propriedade telefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefone(String value) {
        this.telefone = value;
    }

    /**
     * Obtém o valor da propriedade tipoAcaoExterior.
     * 
     * @return
     *     possible object is
     *     {@link TipoAcaoExterior }
     *     
     */
    public TipoAcaoExterior getTipoAcaoExterior() {
        return tipoAcaoExterior;
    }

    /**
     * Define o valor da propriedade tipoAcaoExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAcaoExterior }
     *     
     */
    public void setTipoAcaoExterior(TipoAcaoExterior value) {
        this.tipoAcaoExterior = value;
    }

    /**
     * Obtém o valor da propriedade tipoDocumentoInternacional.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoExterior }
     *     
     */
    public TipoDocumentoExterior getTipoDocumentoInternacional() {
        return tipoDocumentoInternacional;
    }

    /**
     * Define o valor da propriedade tipoDocumentoInternacional.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoExterior }
     *     
     */
    public void setTipoDocumentoInternacional(TipoDocumentoExterior value) {
        this.tipoDocumentoInternacional = value;
    }

    /**
     * Obtém o valor da propriedade tipoLayoutCartaoExterior.
     * 
     * @return
     *     possible object is
     *     {@link TipoLayoutCartaoExterior }
     *     
     */
    public TipoLayoutCartaoExterior getTipoLayoutCartaoExterior() {
        return tipoLayoutCartaoExterior;
    }

    /**
     * Define o valor da propriedade tipoLayoutCartaoExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoLayoutCartaoExterior }
     *     
     */
    public void setTipoLayoutCartaoExterior(TipoLayoutCartaoExterior value) {
        this.tipoLayoutCartaoExterior = value;
    }

}
