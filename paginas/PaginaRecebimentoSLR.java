package paginas;

import org.openqa.selenium.By;

//import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class PaginaRecebimentoSLR {


	public void clicarBotaoPesquisar(){
			$(By.xpath("//legend[contains(text(),'Pesquisar')]")).click();
		}

	public void selecionarBPI() {
			$(By.id("tipoDespesaBuscarecebimentoSlrActionDecorate:tipoDespesaBuscarecebimentoSlrActionSelect")).selectOption("BPI");
		}

	public void clicarBotaoPesquisar2() {
			$(By.xpath("//input[@class='botaoPesquisarAzul']")).click();
		}

	public String validaQtdSlrEncontradas(String slrEncontradas) {
			return $(By.xpath("//form/div/div/div/ul/li")).getText();
		}

	public void selecionarSLR() {
			$(By.id("recebimentoSlrTable:0:recebimentoSlr")).click();
		}

	public String validaCampoNumero(String campoNumero) {
			return $(By.xpath("//*[@id='recebimentoSlrTable:j_id385header:sortDiv']")).getText();
		}

	public String validaCampoUnidade(String campoUnidade) {
		return $(By.xpath("//*[@id='recebimentoSlrTable:j_id392header:sortDiv']")).getText();
	}

	public String validaCampoPI(String campoPI) {
		return $(By.xpath("//*[@id='recebimentoSlrTable:j_id399header:sortDiv']")).getText();
	}

	public String validaCampoPrograma(String campoPrograma) {
		return $(By.xpath("//*[@id='recebimentoSlrTable:j_id406header:sortDiv']")).getText();
	}

	public String validaCampoDespesa(String campoDespesa) {
		return $(By.xpath("//*[@id='recebimentoSlrTable:j_id413header:sortDiv']")).getText();
	}

	public String validaCampoCredor(String campoCredor) {
		return $(By.xpath("//*[@id='recebimentoSlrTable:j_id420header:sortDiv']")).getText();
	}

	public String validaCampoValorTotal(String campoValorTotal) {
		return $(By.xpath("//*[@id='recebimentoSlrTable:j_id427header:sortDiv']")).getText();
	}

	public String validaCampoAcoes(String campoAcoes) {
		return $(By.xpath("//*[@id='recebimentoSlrTable:j_id430header:sortDiv']")).getText();
	}
}