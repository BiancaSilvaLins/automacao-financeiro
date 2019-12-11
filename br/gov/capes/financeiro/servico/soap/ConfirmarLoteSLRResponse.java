
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de confirmarLoteSLRResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="confirmarLoteSLRResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://soap.servico.financeiro.capes.gov.br/}retornoConfirmarLoteSLR" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmarLoteSLRResponse", propOrder = {
    "resultado"
})
public class ConfirmarLoteSLRResponse {

    protected RetornoConfirmarLoteSLR resultado;

    /**
     * Obtém o valor da propriedade resultado.
     * 
     * @return
     *     possible object is
     *     {@link RetornoConfirmarLoteSLR }
     *     
     */
    public RetornoConfirmarLoteSLR getResultado() {
        return resultado;
    }

    /**
     * Define o valor da propriedade resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoConfirmarLoteSLR }
     *     
     */
    public void setResultado(RetornoConfirmarLoteSLR value) {
        this.resultado = value;
    }

}
