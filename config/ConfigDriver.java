package config;

import java.io.File;

import com.codeborne.selenide.Configuration;

public class ConfigDriver {

    public static void configurar() {
        System.setProperty("webdriver.chrome.driver", retornaPathChromeDriver());
        Configuration.reportsFolder = "target/selenide/screenshoots";
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = 50000;
    }

    public static String retornaPathChromeDriver(){
        return new File("src\\test\\resources\\chromedriver.exe").getAbsolutePath();
    }
}
