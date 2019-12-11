package paginas;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class PaginaLoginSadmin {

    public static final String URL_SADMIN = "http://financeiro.des.capes.gov.br/financeiroSicapes";
    public static final String LOGIN_DEFAULT_SADMIN = "10382939441";
    public static final String SENHA_DEFAULT_SADMIN = "3p4c9p";

    private String msgBoasVindas = "//div[@id='dashboardFormMessages']//li";
    private String idLoginSadmin = "login";
    private String idSenhaSadmin = "senha";
    private String btnLoginSadmin = "saveButton";

    public PaginaPrincipalSadmin realizarLogin(String cpf, String senha) {

//        if(ambiente.equals("TESTE")){
//
//        }
//        if(ambiente.equals("DESENVOLVIMENTO")){
//
//        }
        SelenideElement inputLogin = $(byId(idLoginSadmin)).shouldBe(visible);
        executeJavaScript("arguments[0].click();" ,inputLogin );
        inputLogin.sendKeys(cpf);

        SelenideElement inputSenha = $(byId(idSenhaSadmin)).shouldBe(visible);
        executeJavaScript("arguments[0].click();" ,inputSenha );
        inputSenha.clear();
        inputSenha.sendKeys(senha);
        SelenideElement selenideElement = inputSenha.pressTab();
        $(byId(btnLoginSadmin)).shouldBe(visible).click();
        return new PaginaPrincipalSadmin();
    }

    public String retornaMensagemBoasVindas() {
        return $(byXpath(msgBoasVindas)).getText();

    }
    public PaginaLoginSadmin openSadmin () {
        open(URL_SADMIN);
        return this;
    }
}
