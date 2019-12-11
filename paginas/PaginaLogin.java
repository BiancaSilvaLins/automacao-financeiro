package paginas;



import static com.codeborne.selenide.Selectors.*;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class PaginaLogin {


	public static final String URL_CONTRA = "http://financeiro.teste.capes.gov.br/financeiroSicapes";
	public static final String URL_SADMIN = "http://financeiro.des.capes.gov.br/financeiroSicapes";
	public static final String LOGIN_DEFAULT_CONTRA = "70838801153";
	public static final String SENHA_DEFAULT_CONTRA = "7rpj7b";
	public static final String LOGIN_DEFAULT_SADMIN = "70838801153";
	public static final String SENHA_DEFAULT_SADMIN = "7rpj7b";
//	private String idLoginContra= "usuario_login";
//	private String idSenhaContra = "usuario_senha";
//	private String btnLoginContra = "//input[@value='Login']";
	private String msgBoasVindas = "//div[@id='dashboardFormMessages']//li";
	private String idLoginSadmin = "login";
	private String idSenhaSadmin = "senha";
	private String btnLoginSadmin = "saveButton";
	
	public PaginaPrincipal realizarLoginContra(String cpf, String senha) {
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
	
	public PaginaPrincipal realizarLoginSadmin(String cpf, String senha) {
		$(byId(idLoginSadmin)).shouldBe(visible).click();
		$(byId(idLoginSadmin)).clear();
		$(byId(idLoginSadmin)).sendKeys(cpf);
		$(byId(idSenhaSadmin)).shouldBe(visible).sendKeys(senha);
		$(byId(btnLoginSadmin)).shouldBe(visible).click();
		return new PaginaPrincipal();
	}
	
	public PaginaLogin navegarPaginaLoginContra () {
		open(URL_CONTRA);
		return this;
	}
	public PaginaLogin navegarPaginaLoginSadmin() {
		open(URL_SADMIN);
		return this;
	}

	public String retornaMensagemBoasVindas() {
		return $(byXpath(msgBoasVindas)).getText();
		
	}
	
	
}
