package org.example.PageObjects;

import org.example.config.DriverContext;
import org.example.utils.GenericMethods;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.utils.Constants.NEWPASSWORD;
import static org.example.utils.Constants.PASSWORD;

public class ModuloCambioClavePO {

    private final WebDriver driver;

    public ModuloCambioClavePO() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(driver, this);

    }

    //i[contains(@class,'oxd-icon bi-caret-down-fill')]
    @FindBy(xpath = "//i[contains(@class,'oxd-icon bi-caret-down-fill')]")
    private WebElement btnMenu;
    //i[contains(@class,'oxd-icon bi-caret-down-fill')]
    @FindBy(linkText = "Change Password")
    private WebElement btnChangePassword;

    @FindBy(xpath = "//label[text()='Current Password']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@type='password']")
    private WebElement txtPassword;
    @FindBy(xpath = "//label[text()='Password']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@type='password']")
    private WebElement txtNewPassword;
    @FindBy(xpath = "//label[text()='Confirm Password']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@type='password']")
    private WebElement txtConfirmPassword;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSubmit;

    @FindBy(xpath = "//*[text()='Successfully Saved']")
    private WebElement lblMensaje;

    public void ingresarSeccionCambioClave() {
        try {
            GenericMethods.waitExplicitWebElement(driver, btnMenu,20).click();
            GenericMethods.waitExplicitWebElement(driver, btnChangePassword,20).click();
        } catch (Exception e) {
            Assert.fail("No se pudo hacer clic en el botón de menú");
        }
    }

    public void ingresarClaveActual() {
        try {
            GenericMethods.waitExplicitWebElement(driver, txtPassword,20).sendKeys(PASSWORD);
        } catch (Exception e) {
            Assert.fail("No se pudo hacer clic en el botón de menú");
        }
    }

    public void ingresarNuevaClave() {
        try {
            GenericMethods.waitExplicitWebElement(driver, txtNewPassword,20).sendKeys(NEWPASSWORD);
        } catch (Exception e) {
            Assert.fail("No se pudo hacer clic en el botón de menú");
        }
    }

    public void confirmarNuevaClave() {
        try {
            GenericMethods.waitExplicitWebElement(driver, txtConfirmPassword,20).sendKeys(NEWPASSWORD);
        } catch (Exception e) {
            Assert.fail("No se pudo hacer clic en el botón de menú");
        }
    }

    public void hacerClicEnGuardar() {
        try {
            GenericMethods.waitExplicitWebElement(driver, btnSubmit,20).click();
        } catch (Exception e) {
            Assert.fail("No se pudo hacer clic en el botón de menú");
        }
    }
    public void validarMensaje() {
        try {
            GenericMethods.waitExplicitWebElement(driver, lblMensaje,20);
        } catch (Exception e) {
            Assert.fail("No se pudo hacer clic en el botón de menú");
        }
    }
}
