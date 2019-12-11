
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de confirmarLoteSLR complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="confirmarLoteSLR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dados" type="{http://soap.servico.financeiro.capes.gov.br/}dadosConfirmarLoteSLR" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmarLoteSLR", propOrder = {
    "dados"
})
public class ConfirmarLoteSLR {

    protected DadosConfirmarLoteSLR dados;

    /**
     * Obt�m o valor da propriedade dados.
     * 
     * @return
     *     possible object is
     *     {@link DadosConfirmarLoteSLR }
     *     
     */
    public DadosConfirmarLoteSLR getDados() {
        return dados;
    }

    /**
     * Define o valor da propriedade dados.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosConfirmarLoteSLR }
     *     
     */
    public void setDados(DadosConfirmarLoteSLR value) {
        this.dados = value;
    }

}
