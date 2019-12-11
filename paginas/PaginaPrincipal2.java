package paginas;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PaginaPrincipal2 {

	PaginaLogin2 login = null;

    public static final String USER_DEFAULT = "70838801153";
    public static final String PASSWORD_DEFAULT = "7rpj7b";
    public static final String BASE_URL = "http://financeiro.hom.capes.gov.br/financeiroSicapes";
    
	public PaginaRecebimentoSLR recebimento() {

		login.realizarLogin(USER_DEFAULT, PASSWORD_DEFAULT);
		$(By.xpath("//form/div/ul/li[1]/a[1]")).hover();
		$(By.id("recebimentoCommandLink")).click();

		return new PaginaRecebimentoSLR();
	}

	public PaginaAnaliseContabil analiseContabil() {

		login.realizarLogin(USER_DEFAULT, PASSWORD_DEFAULT);
		$(By.xpath("//form/div/ul/li[1]/a[1]")).hover();
		$(By.id("analiseContabilCommandLink")).click();

		return new PaginaAnaliseContabil();
	}
}
