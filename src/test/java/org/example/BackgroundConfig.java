package org.example;

import io.cucumber.java.en.Given;
import org.example.config.BrowserType;
import org.example.config.DriverContext;
import org.example.config.DriverManager;
import org.openqa.selenium.WebDriver;
import org.example.utils.Constants;

public class BackgroundConfig {

    @Given("accedo a la página de inicio del sitio web")
    public void accedo_a_la_página_de_inicio_del_sitio_web() {
        // Obtén una instancia del WebDriver utilizando el DriverManager
        WebDriver driver = DriverManager.getDriver(BrowserType.CHROME);

        // Configura el WebDriver en el DriverContext para que sea accesible en otros lugares del código
        DriverContext.setDriver(driver);

        // Navega a la página de inicio del sitio web
        driver.get(Constants.URL);
    }
}
