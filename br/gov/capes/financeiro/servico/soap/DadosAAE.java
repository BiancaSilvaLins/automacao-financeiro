
package br.gov.capes.financeiro.servico.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de dadosAAE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosAAE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoOcupacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contaCorrente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataFimParticipacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataInicioParticipacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dddTelefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emissorRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enderecoProfissional" type="{http://soap.servico.financeiro.capes.gov.br/}endereco" minOccurs="0"/>
 *         &lt;element name="enderecoResidencial" type="{http://soap.servico.financeiro.capes.gov.br/}endereco" minOccurs="0"/>
 *         &lt;element name="esferaServidor" type="{http://soap.servico.financeiro.capes.gov.br/}esferaAdministrativa" minOccurs="0"/>
 *         &lt;element name="idCredorSistemaOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inssPisPasep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lotacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroProcesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroTelefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recolheuTetoINSS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="servidorAtivo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="servidorPublico" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="slrDevolucao" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ufEmissorRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorRecolhimentoPrevidencia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosAAE", propOrder = {
    "agencia",
    "codigoOcupacao",
    "contaCorrente",
    "cpf",
    "dataFimParticipacao",
    "dataInicioParticipacao",
    "dataNascimento",
    "dddTelefone",
    "email",
    "emissorRG",
    "enderecoProfissional",
    "enderecoResidencial",
    "esferaServidor",
    "idCredorSistemaOrigem",
    "inssPisPasep",
    "lotacao",
    "nome",
    "numeroBanco",
    "numeroMatricula",
    "numeroProcesso",
    "numeroRG",
    "numeroTelefone",
    "orgao",
    "recolheuTetoINSS",
    "servidorAtivo",
    "servidorPublico",
    "slrDevolucao",
    "ufEmissorRG",
    "valorRecolhimentoPrevidencia"
})
public class DadosAAE {

    protected String agencia;
    protected String codigoOcupacao;
    protected String contaCorrente;
    protected String cpf;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFimParticipacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicioParticipacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataNascimento;
    protected String dddTelefone;
    protected String email;
    protected String emissorRG;
    protected Endereco enderecoProfissional;
    protected Endereco enderecoResidencial;
    @XmlSchemaType(name = "string")
    protected EsferaAdministrativa esferaServidor;
    protected String idCredorSistemaOrigem;
    protected String inssPisPasep;
    protected String lotacao;
    protected String nome;
    protected String numeroBanco;
    protected String numeroMatricula;
    protected String numeroProcesso;
    protected String numeroRG;
    protected String numeroTelefone;
    protected String orgao;
    protected boolean recolheuTetoINSS;
    protected boolean servidorAtivo;
    protected boolean servidorPublico;
    protected boolean slrDevolucao;
    protected String ufEmissorRG;
    protected BigDecimal valorRecolhimentoPrevidencia;

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
     * Obtém o valor da propriedade codigoOcupacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOcupacao() {
        return codigoOcupacao;
    }

    /**
     * Define o valor da propriedade codigoOcupacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOcupacao(String value) {
        this.codigoOcupacao = value;
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
     * Obtém o valor da propriedade dataFimParticipacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFimParticipacao() {
        return dataFimParticipacao;
    }

    /**
     * Define o valor da propriedade dataFimParticipacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFimParticipacao(XMLGregorianCalendar value) {
        this.dataFimParticipacao = value;
    }

    /**
     * Obtém o valor da propriedade dataInicioParticipacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicioParticipacao() {
        return dataInicioParticipacao;
    }

    /**
     * Define o valor da propriedade dataInicioParticipacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicioParticipacao(XMLGregorianCalendar value) {
        this.dataInicioParticipacao = value;
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
     * Obtém o valor da propriedade dddTelefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDddTelefone() {
        return dddTelefone;
    }

    /**
     * Define o valor da propriedade dddTelefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDddTelefone(String value) {
        this.dddTelefone = value;
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
     * Obtém o valor da propriedade emissorRG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmissorRG() {
        return emissorRG;
    }

    /**
     * Define o valor da propriedade emissorRG.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmissorRG(String value) {
        this.emissorRG = value;
    }

    /**
     * Obtém o valor da propriedade enderecoProfissional.
     * 
     * @return
     *     possible object is
     *     {@link Endereco }
     *     
     */
    public Endereco getEnderecoProfissional() {
        return enderecoProfissional;
    }

    /**
     * Define o valor da propriedade enderecoProfissional.
     * 
     * @param value
     *     allowed object is
     *     {@link Endereco }
     *     
     */
    public void setEnderecoProfissional(Endereco value) {
        this.enderecoProfissional = value;
    }

    /**
     * Obtém o valor da propriedade enderecoResidencial.
     * 
     * @return
     *     possible object is
     *     {@link Endereco }
     *     
     */
    public Endereco getEnderecoResidencial() {
        return enderecoResidencial;
    }

    /**
     * Define o valor da propriedade enderecoResidencial.
     * 
     * @param value
     *     allowed object is
     *     {@link Endereco }
     *     
     */
    public void setEnderecoResidencial(Endereco value) {
        this.enderecoResidencial = value;
    }

    /**
     * Obtém o valor da propriedade esferaServidor.
     * 
     * @return
     *     possible object is
     *     {@link EsferaAdministrativa }
     *     
     */
    public EsferaAdministrativa getEsferaServidor() {
        return esferaServidor;
    }

    /**
     * Define o valor da propriedade esferaServidor.
     * 
     * @param value
     *     allowed object is
     *     {@link EsferaAdministrativa }
     *     
     */
    public void setEsferaServidor(EsferaAdministrativa value) {
        this.esferaServidor = value;
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
     * Obtém o valor da propriedade inssPisPasep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInssPisPasep() {
        return inssPisPasep;
    }

    /**
     * Define o valor da propriedade inssPisPasep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInssPisPasep(String value) {
        this.inssPisPasep = value;
    }

    /**
     * Obtém o valor da propriedade lotacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotacao() {
        return lotacao;
    }

    /**
     * Define o valor da propriedade lotacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotacao(String value) {
        this.lotacao = value;
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
     * Obtém o valor da propriedade numeroMatricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    /**
     * Define o valor da propriedade numeroMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroMatricula(String value) {
        this.numeroMatricula = value;
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
     * Obtém o valor da propriedade numeroRG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRG() {
        return numeroRG;
    }

    /**
     * Define o valor da propriedade numeroRG.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRG(String value) {
        this.numeroRG = value;
    }

    /**
     * Obtém o valor da propriedade numeroTelefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    /**
     * Define o valor da propriedade numeroTelefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTelefone(String value) {
        this.numeroTelefone = value;
    }

    /**
     * Obtém o valor da propriedade orgao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgao() {
        return orgao;
    }

    /**
     * Define o valor da propriedade orgao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgao(String value) {
        this.orgao = value;
    }

    /**
     * Obtém o valor da propriedade recolheuTetoINSS.
     * 
     */
    public boolean isRecolheuTetoINSS() {
        return recolheuTetoINSS;
    }

    /**
     * Define o valor da propriedade recolheuTetoINSS.
     * 
     */
    public void setRecolheuTetoINSS(boolean value) {
        this.recolheuTetoINSS = value;
    }

    /**
     * Obtém o valor da propriedade servidorAtivo.
     * 
     */
    public boolean isServidorAtivo() {
        return servidorAtivo;
    }

    /**
     * Define o valor da propriedade servidorAtivo.
     * 
     */
    public void setServidorAtivo(boolean value) {
        this.servidorAtivo = value;
    }

    /**
     * Obtém o valor da propriedade servidorPublico.
     * 
     */
    public boolean isServidorPublico() {
        return servidorPublico;
    }

    /**
     * Define o valor da propriedade servidorPublico.
     * 
     */
    public void setServidorPublico(boolean value) {
        this.servidorPublico = value;
    }

    /**
     * Obtém o valor da propriedade slrDevolucao.
     * 
     */
    public boolean isSlrDevolucao() {
        return slrDevolucao;
    }

    /**
     * Define o valor da propriedade slrDevolucao.
     * 
     */
    public void setSlrDevolucao(boolean value) {
        this.slrDevolucao = value;
    }

    /**
     * Obtém o valor da propriedade ufEmissorRG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfEmissorRG() {
        return ufEmissorRG;
    }

    /**
     * Define o valor da propriedade ufEmissorRG.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfEmissorRG(String value) {
        this.ufEmissorRG = value;
    }

    /**
     * Obtém o valor da propriedade valorRecolhimentoPrevidencia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorRecolhimentoPrevidencia() {
        return valorRecolhimentoPrevidencia;
    }

    /**
     * Define o valor da propriedade valorRecolhimentoPrevidencia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorRecolhimentoPrevidencia(BigDecimal value) {
        this.valorRecolhimentoPrevidencia = value;
    }

}
