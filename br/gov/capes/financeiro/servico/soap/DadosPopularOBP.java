
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosPopularOBP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosPopularOBP">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.servico.financeiro.capes.gov.br/}dadosPopularSLR">
 *       &lt;sequence>
 *         &lt;element name="credor" type="{http://soap.servico.financeiro.capes.gov.br/}dadosOBP" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosPopularOBP", propOrder = {
    "credor"
})
public class DadosPopularOBP
    extends DadosPopularSLR
{

    protected DadosOBP credor;

    /**
     * Obtém o valor da propriedade credor.
     * 
     * @return
     *     possible object is
     *     {@link DadosOBP }
     *     
     */
    public DadosOBP getCredor() {
        return credor;
    }

    /**
     * Define o valor da propriedade credor.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosOBP }
     *     
     */
    public void setCredor(DadosOBP value) {
        this.credor = value;
    }

}
