
package br.gov.capes.financeiro.servico.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosPopularCredor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosPopularCredor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.servico.financeiro.capes.gov.br/}dadosPopularSLR">
 *       &lt;sequence>
 *         &lt;element name="dadosCredores" type="{http://soap.servico.financeiro.capes.gov.br/}dadosCredor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosPopularCredor", propOrder = {
    "dadosCredores"
})
@XmlSeeAlso({
    DadosPopularBPI.class,
    DadosPopularPagamentoBolsaExteriorContaPais.class
})
public class DadosPopularCredor
    extends DadosPopularSLR
{

    @XmlElement(nillable = true)
    protected List<DadosCredor> dadosCredores;

    /**
     * Gets the value of the dadosCredores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosCredores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosCredores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosCredor }
     * 
     * 
     */
    public List<DadosCredor> getDadosCredores() {
        if (dadosCredores == null) {
            dadosCredores = new ArrayList<DadosCredor>();
        }
        return this.dadosCredores;
    }

}
