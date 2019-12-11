
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cancelarSLR complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cancelarSLR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dados" type="{http://soap.servico.financeiro.capes.gov.br/}dadosCancelarSLR" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelarSLR", propOrder = {
    "dados"
})
public class CancelarSLR {

    protected DadosCancelarSLR dados;

    /**
     * Obtém o valor da propriedade dados.
     * 
     * @return
     *     possible object is
     *     {@link DadosCancelarSLR }
     *     
     */
    public DadosCancelarSLR getDados() {
        return dados;
    }

    /**
     * Define o valor da propriedade dados.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCancelarSLR }
     *     
     */
    public void setDados(DadosCancelarSLR value) {
        this.dados = value;
    }

}
