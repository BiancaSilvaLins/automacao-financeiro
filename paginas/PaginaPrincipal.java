package paginas;

import static com.codeborne.selenide.Selectors.*;
import org.openqa.selenium.By;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.*;

public class PaginaPrincipal {

	private  By menuSLR = byXpath("//form/div/ul/li[1]");
	private  By conteudoSLR = byXpath("//form/div/ul[1]/li[1]/ul");
	private  By menuProgOrc = byXpath("//form/div/ul/li[2]");
	private  By conteudoProgOrc = byXpath("//form/div/ul[1]/li[2]/ul");
	private  By menuExecOrc = byXpath("//form/div/ul/li[3]");
	private  By conteudoExecOrc = byXpath("//form/div/ul[1]/li[3]/ul");
	private  By menuExecFinan = byXpath("//form/div/ul/li[4]");
	private  By conteudoExecFinan = byXpath("//form/div/ul[1]/li[4]/ul");
	private  By menuPrestContas = byXpath("//form/div/ul/li[5]");
	private  By conteudoPrestContas = byXpath("//form/div/ul[1]/li[5]/ul");
	private  By menuBBBrasil = byXpath("//form/div/ul/li[6]");
	private  By conteudoBBBrasil = byXpath("//form/div/ul[1]/li[6]/ul");
	private  By menuBBExterior = byXpath("//form/div/ul/li[7]");
	private  By conteudoBBExterior = byXpath("//form/div/ul[1]/li[7]/ul");
	private  By menuConsultas = byXpath("//form/div/ul/li[8]");
	private  By conteudoConsultas = byXpath("//form/div/ul[1]/li[8]/ul");
	private  By menuCadastros = byXpath("//form/div/ul/li[9]");
	private  By conteudoCadastros = byXpath("//form/div/ul[1]/li[9]/ul");
	
	public PaginaPrincipal menuAba(By menu) {
		$(menu).should(Condition.visible).hover();
		return new PaginaPrincipal();
	}
	public String menuConteudo(By conteudo) {
		return  $(conteudo).shouldBe(Condition.visible).getText();
	}
	
	public String mouseHoverGetText(By menu, By conteudo) {
		$(menu).shouldBe(Condition.visible).hover();
		return $(conteudo).getText();
	}
	public By getMenuSLR() {
		return menuSLR;
	}
	public By getConteudoSLR() {
		return conteudoSLR;
	}
	public By getMenuProgOrc() {
		return menuProgOrc;
	}
	public By getConteudoProgOrc() {
		return conteudoProgOrc;
	}
	public By getMenuExecOrc() {
		return menuExecOrc;
	}
	public By getConteudoExecOrc() {
		return conteudoExecOrc;
	}
	public By getMenuExecFinan() {
		return menuExecFinan;
	}
	public By getConteudoExecFinan() {
		return conteudoExecFinan;
	}
	public By getMenuPrestContas() {
		return menuPrestContas;
	}
	public By getConteudoPrestContas() {
		return conteudoPrestContas;
	}
	public By getMenuBBBrasil() {
		return menuBBBrasil;
	}
	public By getConteudoBBBrasil() {
		return conteudoBBBrasil;
	}
	public By getMenuBBExterior() {
		return menuBBExterior;
	}
	public By getConteudoBBExterior() {
		return conteudoBBExterior;
	}
	public By getMenuConsultas() {
		return menuConsultas;
	}
	public By getConteudoConsultas() {
		return conteudoConsultas;
	}
	public By getMenuCadastros() {
		return menuCadastros;
	}
	public By getConteudoCadastros() {
		return conteudoCadastros;
	}
	
	
}
	