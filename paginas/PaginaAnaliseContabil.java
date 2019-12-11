package paginas;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PaginaAnaliseContabil {


	//Encaminhar para Pagamento
	public void selecionarPagamento() {
		$(By.id("tipoDespesaBuscarecebimentoSlrActionDecorate:tipoDespesaBuscarecebimentoSlrActionSelect")).selectOption("Pagamento AAE");
	}

	public void clicarBotaoAnaliseContabil(){
		$(By.xpath("//*[@id='encaminharAcCommandButton']")).click();
	}

	public String validaMsgSucessContabil(String sucess){
		return $(By.xpath("//form/div/div/div/ul/li")).getText();
	}

}
