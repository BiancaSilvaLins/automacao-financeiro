package paginas;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class PaginaLoginContra {

    public static final String URL_CONTRA = "http://financeiro.teste.capes.gov.br/financeiroSicapes";
    public static final String LOGIN_DEFAULT_CONTRA = "10382939441";
    public static final String SENHA_DEFAULT_CONTRA = "3p4c9p";

    private String idLoginContra= "usuario_login";
	private String idSenhaContra = "usuario_senha";
	private String btnLoginContra = "//input[@value='Login']";

    public PaginaPrincipal realizarLoginContra(String cpf, String senha, String ambiente) {

        if(ambiente.equals("TESTE")){

        }
        if(ambiente.equals("DESENVOLVIMENTO")){

        }
        SelenideElement inputLogin = $(byId("login")).shouldBe(visible);
        executeJavaScript("arguments[0].click();" ,inputLogin );
        inputLogin.sendKeys(cpf);

        SelenideElement inputSenha = $(byId("senha")).shouldBe(visible);
        executeJavaScript("arguments[0].click();" ,inputSenha );
        inputSenha.clear();
        inputSenha.sendKeys(senha);
        inputSenha.pressTab();
        $(byId("idBtnEntrar")).shouldBe(visible).click();
        return new PaginaPrincipal();
    }

    public PaginaLoginContra navegarPaginaLoginContra () {
        open(URL_CONTRA);
        return this;
    }


}
