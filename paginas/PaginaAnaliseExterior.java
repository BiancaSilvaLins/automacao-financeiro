package paginas;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PaginaAnaliseExterior {


	//Encaminhar para Pagamento
	public void selecionarPagamento2() {
		$(By.id("tipoDespesaBuscarecebimentoSlrActionDecorate:tipoDespesaBuscarecebimentoSlrActionSelect")).selectOption("Pagamento Conta Corrente Exterior");
	}

	public void clicarBotaoAnaliseExterior(){
		$(By.xpath("//*[@id='encaminharAE2CommandButton']")).click();
	}

	public String validaMsgSucessExterior(String sucess){
		return $(By.xpath("//form/div/div/div/ul/li")).getText();
	}

}
