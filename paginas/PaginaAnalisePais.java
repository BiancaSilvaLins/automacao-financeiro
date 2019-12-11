package paginas;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PaginaAnalisePais {


	//Encaminhar para Pagamento
	public void clicarBotaoAnalisePais(){
		$(By.xpath("//*[@id='encaminharAF2CommandButton']")).click();
	}

	public String validaMsgSucessPais(String sucess){
		return $(By.xpath("//form/div/div/div/ul/li")).getText();
	}

}
