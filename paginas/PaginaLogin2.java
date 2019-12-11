package paginas;

import static com.codeborne.selenide.Condition.visible;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Selenide.open;

import paginas.PaginaPrincipal2;

public class PaginaLogin2 {

	public static final String BASE_URL = "http://financeiro.hom.capes.gov.br/financeiroSicapes";

	public PaginaPrincipal2 realizarLogin(String user, String password) {

		open(BASE_URL);
		$(By.id("login")).shouldBe(visible).sendKeys(user);
		$(By.id("senha")).shouldBe(visible).sendKeys(password);
		$(By.id("idBtnEntrar")).shouldBe(visible).click();
		return new PaginaPrincipal2();
	}
}
