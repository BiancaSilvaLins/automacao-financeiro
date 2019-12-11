
package br.gov.capes.financeiro.servico.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosCriacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosCriacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpfUsuarioSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailSetorSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esferaAdministrativa" type="{http://soap.servico.financeiro.capes.gov.br/}esferaAdministrativa" minOccurs="0"/>
 *         &lt;element name="idSLRSistemaSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itensOrcamentarios" type="{http://soap.servico.financeiro.capes.gov.br/}dadosItemOrcamentario" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nrConvenio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nrCooperacaoTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nrNotaTransferenciaConvenio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nrOficio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaProgramaCapes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaSistemaCapes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaUnidadeOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDespesa" type="{http://soap.servico.financeiro.capes.gov.br/}tipoDespesa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosCriacao", propOrder = {
    "codigoPI",
    "cpfUsuarioSolicitante",
    "emailSetorSolicitante",
    "esferaAdministrativa",
    "idSLRSistemaSolicitante",
    "itensOrcamentarios",
    "nrConvenio",
    "nrCooperacaoTecnica",
    "nrNotaTransferenciaConvenio",
    "nrOficio",
    "observacao",
    "siglaProgramaCapes",
    "siglaSistemaCapes",
    "siglaUnidadeOrigem",
    "tipoDespesa"
})
public class DadosCriacao {

    protected String codigoPI;
    protected String cpfUsuarioSolicitante;
    protected String emailSetorSolicitante;
    @XmlSchemaType(name = "string")
    protected EsferaAdministrativa esferaAdministrativa;
    protected String idSLRSistemaSolicitante;
    @XmlElement(nillable = true)
    protected List<DadosItemOrcamentario> itensOrcamentarios;
    protected String nrConvenio;
    protected String nrCooperacaoTecnica;
    protected String nrNotaTransferenciaConvenio;
    protected String nrOficio;
    protected String observacao;
    protected String siglaProgramaCapes;
    protected String siglaSistemaCapes;
    protected String siglaUnidadeOrigem;
    @XmlSchemaType(name = "string")
    protected TipoDespesa tipoDespesa;

    /**
     * Obtém o valor da propriedade codigoPI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPI() {
        return codigoPI;
    }

    /**
     * Define o valor da propriedade codigoPI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPI(String value) {
        this.codigoPI = value;
    }

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
     * Obtém o valor da propriedade emailSetorSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSetorSolicitante() {
        return emailSetorSolicitante;
    }

    /**
     * Define o valor da propriedade emailSetorSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSetorSolicitante(String value) {
        this.emailSetorSolicitante = value;
    }

    /**
     * Obtém o valor da propriedade esferaAdministrativa.
     * 
     * @return
     *     possible object is
     *     {@link EsferaAdministrativa }
     *     
     */
    public EsferaAdministrativa getEsferaAdministrativa() {
        return esferaAdministrativa;
    }

    /**
     * Define o valor da propriedade esferaAdministrativa.
     * 
     * @param value
     *     allowed object is
     *     {@link EsferaAdministrativa }
     *     
     */
    public void setEsferaAdministrativa(EsferaAdministrativa value) {
        this.esferaAdministrativa = value;
    }

    /**
     * Obtém o valor da propriedade idSLRSistemaSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSLRSistemaSolicitante() {
        return idSLRSistemaSolicitante;
    }

    /**
     * Define o valor da propriedade idSLRSistemaSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSLRSistemaSolicitante(String value) {
        this.idSLRSistemaSolicitante = value;
    }

    /**
     * Gets the value of the itensOrcamentarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itensOrcamentarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItensOrcamentarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosItemOrcamentario }
     * 
     * 
     */
    public List<DadosItemOrcamentario> getItensOrcamentarios() {
        if (itensOrcamentarios == null) {
            itensOrcamentarios = new ArrayList<DadosItemOrcamentario>();
        }
        return this.itensOrcamentarios;
    }

    /**
     * Obtém o valor da propriedade nrConvenio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrConvenio() {
        return nrConvenio;
    }

    /**
     * Define o valor da propriedade nrConvenio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrConvenio(String value) {
        this.nrConvenio = value;
    }

    /**
     * Obtém o valor da propriedade nrCooperacaoTecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrCooperacaoTecnica() {
        return nrCooperacaoTecnica;
    }

    /**
     * Define o valor da propriedade nrCooperacaoTecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrCooperacaoTecnica(String value) {
        this.nrCooperacaoTecnica = value;
    }

    /**
     * Obtém o valor da propriedade nrNotaTransferenciaConvenio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrNotaTransferenciaConvenio() {
        return nrNotaTransferenciaConvenio;
    }

    /**
     * Define o valor da propriedade nrNotaTransferenciaConvenio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrNotaTransferenciaConvenio(String value) {
        this.nrNotaTransferenciaConvenio = value;
    }

    /**
     * Obtém o valor da propriedade nrOficio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrOficio() {
        return nrOficio;
    }

    /**
     * Define o valor da propriedade nrOficio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrOficio(String value) {
        this.nrOficio = value;
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

    /**
     * Obtém o valor da propriedade siglaUnidadeOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaUnidadeOrigem() {
        return siglaUnidadeOrigem;
    }

    /**
     * Define o valor da propriedade siglaUnidadeOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaUnidadeOrigem(String value) {
        this.siglaUnidadeOrigem = value;
    }

    /**
     * Obtém o valor da propriedade tipoDespesa.
     * 
     * @return
     *     possible object is
     *     {@link TipoDespesa }
     *     
     */
    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    /**
     * Define o valor da propriedade tipoDespesa.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDespesa }
     *     
     */
    public void setTipoDespesa(TipoDespesa value) {
        this.tipoDespesa = value;
    }

}
