
package br.gov.capes.financeiro.servico.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosAcompanharSLR complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosAcompanharSLR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpfUsuarioSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroLote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroOficio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroProcesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroSLRFormatado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantidadeBolsistasEnviados" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="quantidadeLancamentosEnviados" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="siglaSistemaCapes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorTotalEnviado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosAcompanharSLR", propOrder = {
    "cpfUsuarioSolicitante",
    "numeroLote",
    "numeroOficio",
    "numeroProcesso",
    "numeroSLRFormatado",
    "quantidadeBolsistasEnviados",
    "quantidadeLancamentosEnviados",
    "siglaSistemaCapes",
    "valorTotalEnviado"
})
public class DadosAcompanharSLR {

    protected String cpfUsuarioSolicitante;
    protected String numeroLote;
    protected String numeroOficio;
    protected String numeroProcesso;
    protected String numeroSLRFormatado;
    protected long quantidadeBolsistasEnviados;
    protected long quantidadeLancamentosEnviados;
    protected String siglaSistemaCapes;
    protected BigDecimal valorTotalEnviado;

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
     * Obtém o valor da propriedade numeroOficio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroOficio() {
        return numeroOficio;
    }

    /**
     * Define o valor da propriedade numeroOficio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroOficio(String value) {
        this.numeroOficio = value;
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
     * Obtém o valor da propriedade quantidadeBolsistasEnviados.
     * 
     */
    public long getQuantidadeBolsistasEnviados() {
        return quantidadeBolsistasEnviados;
    }

    /**
     * Define o valor da propriedade quantidadeBolsistasEnviados.
     * 
     */
    public void setQuantidadeBolsistasEnviados(long value) {
        this.quantidadeBolsistasEnviados = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeLancamentosEnviados.
     * 
     */
    public long getQuantidadeLancamentosEnviados() {
        return quantidadeLancamentosEnviados;
    }

    /**
     * Define o valor da propriedade quantidadeLancamentosEnviados.
     * 
     */
    public void setQuantidadeLancamentosEnviados(long value) {
        this.quantidadeLancamentosEnviados = value;
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
     * Obtém o valor da propriedade valorTotalEnviado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalEnviado() {
        return valorTotalEnviado;
    }

    /**
     * Define o valor da propriedade valorTotalEnviado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalEnviado(BigDecimal value) {
        this.valorTotalEnviado = value;
    }

}
