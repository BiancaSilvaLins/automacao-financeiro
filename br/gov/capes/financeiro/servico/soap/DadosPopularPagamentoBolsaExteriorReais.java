
package br.gov.capes.financeiro.servico.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosPopularPagamentoBolsaExteriorReais complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosPopularPagamentoBolsaExteriorReais">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.servico.financeiro.capes.gov.br/}dadosPopularSLR">
 *       &lt;sequence>
 *         &lt;element name="dadosPagamentos" type="{http://soap.servico.financeiro.capes.gov.br/}dadosPagamentoBolsaExteriorReais" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosPopularPagamentoBolsaExteriorReais", propOrder = {
    "dadosPagamentos"
})
public class DadosPopularPagamentoBolsaExteriorReais
    extends DadosPopularSLR
{

    @XmlElement(nillable = true)
    protected List<DadosPagamentoBolsaExteriorReais> dadosPagamentos;

    /**
     * Gets the value of the dadosPagamentos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosPagamentos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosPagamentos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosPagamentoBolsaExteriorReais }
     * 
     * 
     */
    public List<DadosPagamentoBolsaExteriorReais> getDadosPagamentos() {
        if (dadosPagamentos == null) {
            dadosPagamentos = new ArrayList<DadosPagamentoBolsaExteriorReais>();
        }
        return this.dadosPagamentos;
    }

}
