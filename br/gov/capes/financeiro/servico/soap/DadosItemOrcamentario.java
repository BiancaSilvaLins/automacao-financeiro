
package br.gov.capes.financeiro.servico.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosItemOrcamentario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosItemOrcamentario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoProcedimentoFinanceiro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="moeda" type="{http://soap.servico.financeiro.capes.gov.br/}moeda" minOccurs="0"/>
 *         &lt;element name="naturezaDespesa" type="{http://soap.servico.financeiro.capes.gov.br/}naturezaDespesa" minOccurs="0"/>
 *         &lt;element name="numeroNotaEmpenho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaProgramaCapes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosItemOrcamentario", propOrder = {
    "codigoPI",
    "codigoPTRES",
    "codigoProcedimentoFinanceiro",
    "moeda",
    "naturezaDespesa",
    "numeroNotaEmpenho",
    "observacao",
    "siglaProgramaCapes",
    "valor"
})
public class DadosItemOrcamentario {

    protected String codigoPI;
    protected String codigoPTRES;
    protected Long codigoProcedimentoFinanceiro;
    @XmlSchemaType(name = "string")
    protected Moeda moeda;
    @XmlSchemaType(name = "string")
    protected NaturezaDespesa naturezaDespesa;
    protected String numeroNotaEmpenho;
    protected String observacao;
    protected String siglaProgramaCapes;
    protected BigDecimal valor;

    /**
     * Obtém o valor da propriedade codigoPI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPI() {
        return codigoPI;
    }

    /**
     * Define o valor da propriedade codigoPI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPI(String value) {
        this.codigoPI = value;
    }

    /**
     * Obtém o valor da propriedade codigoPTRES.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPTRES() {
        return codigoPTRES;
    }

    /**
     * Define o valor da propriedade codigoPTRES.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPTRES(String value) {
        this.codigoPTRES = value;
    }

    /**
     * Obtém o valor da propriedade codigoProcedimentoFinanceiro.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoProcedimentoFinanceiro() {
        return codigoProcedimentoFinanceiro;
    }

    /**
     * Define o valor da propriedade codigoProcedimentoFinanceiro.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoProcedimentoFinanceiro(Long value) {
        this.codigoProcedimentoFinanceiro = value;
    }

    /**
     * Obtém o valor da propriedade moeda.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoeda() {
        return moeda;
    }

    /**
     * Define o valor da propriedade moeda.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoeda(Moeda value) {
        this.moeda = value;
    }

    /**
     * Obtém o valor da propriedade naturezaDespesa.
     * 
     * @return
     *     possible object is
     *     {@link NaturezaDespesa }
     *     
     */
    public NaturezaDespesa getNaturezaDespesa() {
        return naturezaDespesa;
    }

    /**
     * Define o valor da propriedade naturezaDespesa.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturezaDespesa }
     *     
     */
    public void setNaturezaDespesa(NaturezaDespesa value) {
        this.naturezaDespesa = value;
    }

    /**
     * Obtém o valor da propriedade numeroNotaEmpenho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroNotaEmpenho() {
        return numeroNotaEmpenho;
    }

    /**
     * Define o valor da propriedade numeroNotaEmpenho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroNotaEmpenho(String value) {
        this.numeroNotaEmpenho = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Obtém o valor da propriedade siglaProgramaCapes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaProgramaCapes() {
        return siglaProgramaCapes;
    }

    /**
     * Define o valor da propriedade siglaProgramaCapes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaProgramaCapes(String value) {
        this.siglaProgramaCapes = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValor(BigDecimal value) {
        this.valor = value;
    }

}
