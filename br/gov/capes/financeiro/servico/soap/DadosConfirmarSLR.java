
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosConfirmarSLR complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosConfirmarSLR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpfUsuarioAutorizadorSLR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpfUsuarioSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idSolicitacaoAssinatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroSLRFormatado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dadosConfirmarSLR", propOrder = {
    "cpfUsuarioAutorizadorSLR",
    "cpfUsuarioSolicitante",
    "idSolicitacaoAssinatura",
    "numeroSLRFormatado",
    "siglaSistemaCapes"
})
public class DadosConfirmarSLR {

    protected String cpfUsuarioAutorizadorSLR;
    protected String cpfUsuarioSolicitante;
    protected String idSolicitacaoAssinatura;
    protected String numeroSLRFormatado;
    protected String siglaSistemaCapes;

    /**
     * Obt�m o valor da propriedade cpfUsuarioAutorizadorSLR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfUsuarioAutorizadorSLR() {
        return cpfUsuarioAutorizadorSLR;
    }

    /**
     * Define o valor da propriedade cpfUsuarioAutorizadorSLR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfUsuarioAutorizadorSLR(String value) {
        this.cpfUsuarioAutorizadorSLR = value;
    }

    /**
     * Obt�m o valor da propriedade cpfUsuarioSolicitante.
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
     * Obt�m o valor da propriedade idSolicitacaoAssinatura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSolicitacaoAssinatura() {
        return idSolicitacaoAssinatura;
    }

    /**
     * Define o valor da propriedade idSolicitacaoAssinatura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSolicitacaoAssinatura(String value) {
        this.idSolicitacaoAssinatura = value;
    }

    /**
     * Obt�m o valor da propriedade numeroSLRFormatado.
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
     * Obt�m o valor da propriedade siglaSistemaCapes.
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
