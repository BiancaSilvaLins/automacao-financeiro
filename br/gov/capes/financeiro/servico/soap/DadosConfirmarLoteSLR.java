
package br.gov.capes.financeiro.servico.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosConfirmarLoteSLR complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosConfirmarLoteSLR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpfUsuarioSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dadosSLR" type="{http://soap.servico.financeiro.capes.gov.br/}dadosConfirmarSLR" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "dadosConfirmarLoteSLR", propOrder = {
    "cpfUsuarioSolicitante",
    "dadosSLR",
    "siglaSistemaCapes"
})
public class DadosConfirmarLoteSLR {

    protected String cpfUsuarioSolicitante;
    @XmlElement(nillable = true)
    protected List<DadosConfirmarSLR> dadosSLR;
    protected String siglaSistemaCapes;

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
     * Gets the value of the dadosSLR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosSLR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosSLR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosConfirmarSLR }
     * 
     * 
     */
    public List<DadosConfirmarSLR> getDadosSLR() {
        if (dadosSLR == null) {
            dadosSLR = new ArrayList<DadosConfirmarSLR>();
        }
        return this.dadosSLR;
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

}
