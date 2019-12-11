
package br.gov.capes.financeiro.servico.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosPopularBaixarAUXPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosPopularBaixarAUXPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anoReferencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCredorSistemaOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeCompleto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroAuxPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroProcesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dadosPopularBaixarAUXPE", propOrder = {
    "anoReferencia",
    "cpf",
    "idCredorSistemaOrigem",
    "nomeCompleto",
    "numeroAuxPE",
    "numeroProcesso",
    "valor"
})
public class DadosPopularBaixarAUXPE {

    protected int anoReferencia;
    protected String cpf;
    protected String idCredorSistemaOrigem;
    protected String nomeCompleto;
    protected String numeroAuxPE;
    protected String numeroProcesso;
    protected BigDecimal valor;

    /**
     * Obtém o valor da propriedade anoReferencia.
     * 
     */
    public int getAnoReferencia() {
        return anoReferencia;
    }

    /**
     * Define o valor da propriedade anoReferencia.
     * 
     */
    public void setAnoReferencia(int value) {
        this.anoReferencia = value;
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
     * Obtém o valor da propriedade numeroAuxPE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAuxPE() {
        return numeroAuxPE;
    }

    /**
     * Define o valor da propriedade numeroAuxPE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAuxPE(String value) {
        this.numeroAuxPE = value;
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
