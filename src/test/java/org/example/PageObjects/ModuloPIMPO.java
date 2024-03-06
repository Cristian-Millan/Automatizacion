package org.example.PageObjects;

import org.example.config.DriverContext;
import org.example.utils.GenericMethods;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModuloPIMPO {

    private final WebDriver driver;

    public ModuloPIMPO() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//button[text()=' Add ']")
    private WebElement botonAdd;

    @FindBy(name = "firstName")
    private WebElement nombreInput;
    @FindBy(name = "middleName")
    private WebElement segundoNombreInput;
    @FindBy(name = "lastName")
    private WebElement apellidoInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement botonGuardar;

    @FindBy(xpath = "//h6[text()='Personal Details']")
    private WebElement personalDetails;


    @FindBy(xpath = "//*[text()='Successfully Saved']")
    private WebElement lblMensaje;

    public void crearEmpleado() {
        try {
            GenericMethods.waitExplicit(botonAdd, 20);
            botonAdd.click();
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void ingresarNombre() {
        try {
            GenericMethods.waitExplicitWebElement(driver, nombreInput, 20).sendKeys("Juan");
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void ingresarSegundoNombre() {
        try {
            GenericMethods.waitExplicitWebElement(driver, segundoNombreInput, 20).sendKeys("Pablo");
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void ingresarApellido() {
        try {
            GenericMethods.waitExplicitWebElement(driver, apellidoInput, 20).sendKeys("Hernandez");
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void guardarEmpleado() {
        try {
            GenericMethods.waitExplicitWebElement(driver, botonGuardar, 20).click();
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }

    }
    public void validarEmpleadoCreado() {
        try {
            GenericMethods.waitExplicit(lblMensaje, 20);
            Assert.assertTrue(lblMensaje.isDisplayed());
            System.out.println("Se validó el empleado creado");
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }
}
