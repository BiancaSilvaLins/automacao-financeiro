package paginas;

import static com.codeborne.selenide.Selectors.*;
import org.openqa.selenium.By;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.*;

public class PaginaPrincipalSadmin {

    PaginaLoginSadmin login = new PaginaLoginSadmin();

    public static final String USER_DEFAULT = "10382939441";
    public static final String PASSWORD_DEFAULT = "3p4c9p";
    public static final String BASE_URL = "http://financeiro.des.capes.gov.br/financeiroSicapes";

    public PaginaRecebimentoSLR recebimento() {

        $(By.xpath("//form/div/ul/li[1]/a[1]")).hover();
        $(By.id("recebimentoCommandLink")).click();

        return new PaginaRecebimentoSLR();
    }

    public PaginaAnaliseContabil analiseContabil() {

        $(By.xpath("//form/div/ul/li[1]/a[1]")).hover();
        $(By.id("analiseContabilCommandLink")).click();

        return new PaginaAnaliseContabil();
    }


}
