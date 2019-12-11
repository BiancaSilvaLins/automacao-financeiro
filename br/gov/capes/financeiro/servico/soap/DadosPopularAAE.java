
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosPopularAAE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosPopularAAE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.servico.financeiro.capes.gov.br/}dadosPopularSLR">
 *       &lt;sequence>
 *         &lt;element name="dadosAAE" type="{http://soap.servico.financeiro.capes.gov.br/}dadosAAE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosPopularAAE", propOrder = {
    "dadosAAE"
})
public class DadosPopularAAE
    extends DadosPopularSLR
{

    protected DadosAAE dadosAAE;

    /**
     * Obtém o valor da propriedade dadosAAE.
     * 
     * @return
     *     possible object is
     *     {@link DadosAAE }
     *     
     */
    public DadosAAE getDadosAAE() {
        return dadosAAE;
    }

    /**
     * Define o valor da propriedade dadosAAE.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosAAE }
     *     
     */
    public void setDadosAAE(DadosAAE value) {
        this.dadosAAE = value;
    }

}
