package org.example.PageObjects;

import org.example.config.DriverContext;
import org.example.utils.GenericMethods;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class ModuloDashboardPO {
    private final WebDriver driver;

    public ModuloDashboardPO() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//img[@alt='client brand banner']")
    private WebElement logoDashboard;
    @FindBy(xpath = "//span[text()='PIM']")
    private WebElement seccionPIM;
    public void validarDashboard() {
        try {
            GenericMethods.waitExplicit(logoDashboard, 20);
            Assert.assertTrue(logoDashboard.isDisplayed());
            System.out.println("Se validó el dashboard del usuario");
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }
    public void seleccionarSeccion(String seccion) {
        try {
            Map<String, Runnable> seccionActions = new HashMap<>();
            seccionActions.put("PIM", () -> {
                GenericMethods.waitExplicit(seccionPIM, 20);
                seccionPIM.click();
            });

            seccionActions.get(seccion).run();
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }
}
