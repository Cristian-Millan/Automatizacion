package org.example.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.masterthought.cucumber.ReportBuilder;
import org.example.config.BrowserType;
import org.example.config.DriverContext;
import org.example.config.DriverManager;
import org.junit.AfterClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.lang.module.Configuration;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Hooks {

    private static final String BASE_REPORT_PATH = "target/cucumber-reports"; // Ruta base de los reportes

    private List<String> jsonFiles = new ArrayList<>();

    @After
    public void closeBrowser(Scenario scenario) {
        // Cierra el navegador después de que todos los escenarios terminen
        WebDriver driver = DriverContext.getDriver();
        if (driver != null) {
            if (scenario.isFailed()) {
                // Toma una captura de pantalla si el escenario falla
                // Puedes agregar aquí la lógica de captura de pantalla si es necesario
            }
            driver.quit();
        }
    }



}
