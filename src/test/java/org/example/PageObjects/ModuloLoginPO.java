package org.example.PageObjects;

import org.example.config.DriverContext;
import org.example.utils.Constants;
import org.example.utils.GenericMethods;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModuloLoginPO {
    private WebDriver driver;

    @FindBy(name = "username")
    private WebElement usernameInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[text()=' Login ']")
    private WebElement loginButton;

    @FindBy(xpath = "//p[text()='Invalid credentials']")
    private WebElement mensajeError;

    public ModuloLoginPO() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(driver, this);

    }

    public void ingresarUsuario() {
        try {
            GenericMethods.waitExplicitWebElement(driver, usernameInput, 20).sendKeys(Constants.USERNAME);
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void ingresarContraseña() {
        try {
            GenericMethods.waitExplicitWebElement(driver, passwordInput, 20).sendKeys(Constants.PASSWORD);
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void hacerClicEnIniciarSesión() {
        try {
            GenericMethods.waitExplicitWebElement(driver, loginButton, 20).click();
            System.out.println("Se hizo clic en el botón Iniciar Sesión");
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void ingresarUsuarioIncorrecto() {
        try {
            GenericMethods.waitExplicitWebElement(driver, usernameInput, 20).sendKeys(Constants.USERNAME_INCORRECTO);
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void validarMensajeError() {
        try {
            GenericMethods.waitExplicit(mensajeError, 20);
            Assert.assertTrue(mensajeError.isDisplayed());
            System.out.println("Se desplegó el mensaje de error");
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }

    }
}
