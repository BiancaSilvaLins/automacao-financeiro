
package br.gov.capes.financeiro.servico.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosRetorno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosRetorno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="erros" type="{http://soap.servico.financeiro.capes.gov.br/}mensagemErro" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numeroSLRFormatado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusRetorno" type="{http://soap.servico.financeiro.capes.gov.br/}statusRetorno" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosRetorno", propOrder = {
    "erros",
    "numeroSLRFormatado",
    "statusRetorno"
})
@XmlSeeAlso({
    RetornoAcompanharSLR.class,
    RetornoConfirmarSLR.class,
    RetornoCriacao.class,
    RetornoConfirmarLoteSLR.class,
    RetornoPopular.class,
    RetornoCancelarSLR.class
})
public abstract class DadosRetorno {

    @XmlElement(nillable = true)
    protected List<MensagemErro> erros;
    protected String numeroSLRFormatado;
    @XmlSchemaType(name = "string")
    protected StatusRetorno statusRetorno;

    /**
     * Gets the value of the erros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the erros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MensagemErro }
     * 
     * 
     */
    public List<MensagemErro> getErros() {
        if (erros == null) {
            erros = new ArrayList<MensagemErro>();
        }
        return this.erros;
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
     * Obtém o valor da propriedade statusRetorno.
     * 
     * @return
     *     possible object is
     *     {@link StatusRetorno }
     *     
     */
    public StatusRetorno getStatusRetorno() {
        return statusRetorno;
    }

    /**
     * Define o valor da propriedade statusRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusRetorno }
     *     
     */
    public void setStatusRetorno(StatusRetorno value) {
        this.statusRetorno = value;
    }

}
