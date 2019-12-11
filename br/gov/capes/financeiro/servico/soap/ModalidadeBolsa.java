
package br.gov.capes.financeiro.servico.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de modalidadeBolsa.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="modalidadeBolsa">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DOU"/>
 *     &lt;enumeration value="ESP"/>
 *     &lt;enumeration value="GW"/>
 *     &lt;enumeration value="MES"/>
 *     &lt;enumeration value="POS"/>
 *     &lt;enumeration value="SAN"/>
 *     &lt;enumeration value="EST"/>
 *     &lt;enumeration value="MSA"/>
 *     &lt;enumeration value="MEP"/>
 *     &lt;enumeration value="GRA"/>
 *     &lt;enumeration value="PRV"/>
 *     &lt;enumeration value="INC"/>
 *     &lt;enumeration value="COI"/>
 *     &lt;enumeration value="SUB"/>
 *     &lt;enumeration value="COA"/>
 *     &lt;enumeration value="PEB"/>
 *     &lt;enumeration value="CGE"/>
 *     &lt;enumeration value="IND"/>
 *     &lt;enumeration value="ET1"/>
 *     &lt;enumeration value="EP1"/>
 *     &lt;enumeration value="APF"/>
 *     &lt;enumeration value="JTA"/>
 *     &lt;enumeration value="ITI"/>
 *     &lt;enumeration value="PVE"/>
 *     &lt;enumeration value="PBA"/>
 *     &lt;enumeration value="PVS"/>
 *     &lt;enumeration value="JTB"/>
 *     &lt;enumeration value="COG"/>
 *     &lt;enumeration value="COC"/>
 *     &lt;enumeration value="COP"/>
 *     &lt;enumeration value="PRF"/>
 *     &lt;enumeration value="PD"/>
 *     &lt;enumeration value="PPG"/>
 *     &lt;enumeration value="MPE"/>
 *     &lt;enumeration value="CAT"/>
 *     &lt;enumeration value="ASP"/>
 *     &lt;enumeration value="COJ"/>
 *     &lt;enumeration value="COS"/>
 *     &lt;enumeration value="COO"/>
 *     &lt;enumeration value="COT"/>
 *     &lt;enumeration value="COL"/>
 *     &lt;enumeration value="PRC"/>
 *     &lt;enumeration value="PRM"/>
 *     &lt;enumeration value="PRO"/>
 *     &lt;enumeration value="PRP"/>
 *     &lt;enumeration value="SPE"/>
 *     &lt;enumeration value="TUT"/>
 *     &lt;enumeration value="TUD"/>
 *     &lt;enumeration value="TPR"/>
 *     &lt;enumeration value="CPE"/>
 *     &lt;enumeration value="CTT"/>
 *     &lt;enumeration value="PVX"/>
 *     &lt;enumeration value="PVP"/>
 *     &lt;enumeration value="EAE"/>
 *     &lt;enumeration value="APR"/>
 *     &lt;enumeration value="CAP"/>
 *     &lt;enumeration value="ARP"/>
 *     &lt;enumeration value="EDO"/>
 *     &lt;enumeration value="JTC"/>
 *     &lt;enumeration value="PPV"/>
 *     &lt;enumeration value="VEJ"/>
 *     &lt;enumeration value="ASD"/>
 *     &lt;enumeration value="PV2"/>
 *     &lt;enumeration value="PCE"/>
 *     &lt;enumeration value="RES"/>
 *     &lt;enumeration value="PRE"/>
 *     &lt;enumeration value="DOR"/>
 *     &lt;enumeration value="PEV"/>
 *     &lt;enumeration value="JPV"/>
 *     &lt;enumeration value="SPV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "modalidadeBolsa")
@XmlEnum
public enum ModalidadeBolsa {

    DOU("DOU"),
    ESP("ESP"),
    GW("GW"),
    MES("MES"),
    POS("POS"),
    SAN("SAN"),
    EST("EST"),
    MSA("MSA"),
    MEP("MEP"),
    GRA("GRA"),
    PRV("PRV"),
    INC("INC"),
    COI("COI"),
    SUB("SUB"),
    COA("COA"),
    PEB("PEB"),
    CGE("CGE"),
    IND("IND"),
    @XmlEnumValue("ET1")
    ET_1("ET1"),
    @XmlEnumValue("EP1")
    EP_1("EP1"),
    APF("APF"),
    JTA("JTA"),
    ITI("ITI"),
    PVE("PVE"),
    PBA("PBA"),
    PVS("PVS"),
    JTB("JTB"),
    COG("COG"),
    COC("COC"),
    COP("COP"),
    PRF("PRF"),
    PD("PD"),
    PPG("PPG"),
    MPE("MPE"),
    CAT("CAT"),
    ASP("ASP"),
    COJ("COJ"),
    COS("COS"),
    COO("COO"),
    COT("COT"),
    COL("COL"),
    PRC("PRC"),
    PRM("PRM"),
    PRO("PRO"),
    PRP("PRP"),
    SPE("SPE"),
    TUT("TUT"),
    TUD("TUD"),
    TPR("TPR"),
    CPE("CPE"),
    CTT("CTT"),
    PVX("PVX"),
    PVP("PVP"),
    EAE("EAE"),
    APR("APR"),
    CAP("CAP"),
    ARP("ARP"),
    EDO("EDO"),
    JTC("JTC"),
    PPV("PPV"),
    VEJ("VEJ"),
    ASD("ASD"),
    @XmlEnumValue("PV2")
    PV_2("PV2"),
    PCE("PCE"),
    RES("RES"),
    PRE("PRE"),
    DOR("DOR"),
    PEV("PEV"),
    JPV("JPV"),
    SPV("SPV");
    private final String value;

    ModalidadeBolsa(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModalidadeBolsa fromValue(String v) {
        for (ModalidadeBolsa c: ModalidadeBolsa.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
