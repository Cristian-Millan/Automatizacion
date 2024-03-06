package org.example.PageObjects;

import org.example.config.DriverContext;
import org.example.utils.GenericMethods;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ModuloEmployeeListPO {

    private final WebDriver driver;

    public ModuloEmployeeListPO() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(driver, this);

    }
    @FindBy(linkText = "Emergency Contacts")
    private WebElement btnEmergencyContacts;

    //button[text()=' Add ']
    @FindBy(xpath = "//button[text()=' Add ']")
    private WebElement btnAdd2;

    @FindBy(xpath = "//button[text()=' Add ']")
    private List<WebElement> btnAdd;
    @FindBy(xpath = "//label[text()='Name']/following::input")
    private WebElement inputName;
    @FindBy(xpath = "//label[text()='Relationship']/following::input")
    private WebElement inputRelationship;
    @FindBy(xpath = "//label[text()='Home Telephone']/following::input")
    private WebElement inputHomeTelephone;
    @FindBy(xpath = "//label[text()='Mobile']/following::input")
    private WebElement inputMobile;
    @FindBy(xpath = "//label[text()='Work Telephone']/following::input")
    private WebElement inputWorkTelephone;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSave;
    @FindBy(xpath = "//button[@type='submit']")
    private List<WebElement> btnSave2;
    @FindBy(linkText = "Salary")
    private WebElement btnSalary;
    @FindBy(xpath = "//label[text()='Salary Component']/following::input")
    private WebElement inputSalaryComponent;
    @FindBy(xpath = "//label[text()='Currency']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//div[@class='oxd-select-text-input']")
    private WebElement listCurrency;
    @FindBy(xpath = "//label[text()='pim.amount']/following::input")
    private WebElement inputPimAmount;
    @FindBy(linkText = "Qualifications")
    private WebElement btnQualifications;
    @FindBy(xpath = "//label[text()='Company']/following::input")
    private WebElement inputCompany;
    @FindBy(xpath = "//label[text()='Job Title']/following::input")
    private WebElement inputJobTitle;
    @FindBy(xpath = "//label[text()='Level']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//div[@class='oxd-select-text-input']")
    private WebElement listLevel;
    @FindBy(xpath = "//label[text()='Skill']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//div[@class='oxd-select-text-input']")
    private WebElement listSkill;
    @FindBy(xpath = "//label[text()='Language']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//div[@class='oxd-select-text-input']")
    private WebElement listLanguage;
    @FindBy(xpath = "//label[text()='Fluency']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//div[@class='oxd-select-text-input']")
    private WebElement listFluency;
    @FindBy(xpath = "//label[text()='Competency']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//div[@class='oxd-select-text-input']")
    private WebElement listCompetency;
    @FindBy(xpath = "//label[text()='License Type']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//div[@class='oxd-select-text-input']")
    private WebElement listLicenseType;
    @FindBy(xpath = "//span[text()='(1) Record Found']")
    private List<WebElement> lblRecordFound;
    public void hacerClicEnContactoDeEmergencia() {
        try {
            System.out.println("Se hizo clic en el botón Contacto de Emergencia");
            GenericMethods.waitExplicitWebElement(driver, btnEmergencyContacts, 40).click();
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void agregar() {
        try {
            GenericMethods.waitExplicitWebElement(driver, btnAdd2, 20).click();
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void agregarNombre() {
        try {
            GenericMethods.waitExplicitWebElement(driver, inputName, 20).sendKeys("Juan");
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void agregarRelacion() {
        try {
            GenericMethods.waitExplicitWebElement(driver, inputRelationship, 20).sendKeys("Padre");
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void agregarTelefonoCasa() {
        try {
            GenericMethods.waitExplicitWebElement(driver, inputHomeTelephone, 20).sendKeys("12345678");
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void agregarTelefonoCelular() {
        try {
            GenericMethods.waitExplicitWebElement(driver, inputMobile, 20).sendKeys("12345678");
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void agregarTelefonoTrabajo() {
        try {
            GenericMethods.waitExplicitWebElement(driver, inputWorkTelephone, 20).sendKeys("12345678");
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void hacerClicEnGuardar() {
        try {
            GenericMethods.waitExplicitWebElement(driver, btnSave, 20).click();
            System.out.println( "Se hizo clic en el botón Guardar");
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void hacerClicEnSalario() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", btnSalary);
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }


    public void agregarSalaryComponent() {
        try {
            GenericMethods.waitExplicitWebElement(driver, inputSalaryComponent, 20).sendKeys("12345678");
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }

    }

    public void selecionarCurrency() {
        try {
            GenericMethods.waitExplicitWebElement(driver, listCurrency, 20).click();

            Actions actions = new Actions(driver);
            actions.sendKeys("c").pause(500); // Presiona 'c' y espera medio segundo para que la lista se actualice

            // Presiona la tecla de flecha hacia abajo 6 veces para llegar a la séptima opción
            for (int i = 0; i < 6; i++) {
                actions.sendKeys(Keys.ARROW_DOWN).pause(200); // Espera 200 milisegundos entre cada presión de tecla
            }
            actions.sendKeys(Keys.ENTER).perform(); // Presiona 'Enter' para seleccionar la opción
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }
    public void agregarpimmount() {
        try {
            GenericMethods.waitExplicitWebElement(driver, inputPimAmount, 20).sendKeys("12345678");
            System.out.println("Se ingreso el monto");
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void clickallbtnadd() {
        try {
            GenericMethods.wait(300);
            for (WebElement addButton : btnAdd) {
                addButton.click();
                System.out.println("Se hizo clic en el botón Agregar");
            }
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }
    public void hacerClicEnCalificaciones() {
        try {
            GenericMethods.waitExplicitWebElement(driver, btnQualifications, 30).click();
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }

    }

    public void company() {
        try {
            GenericMethods.waitExplicitWebElement(driver, inputCompany,30).sendKeys("test");
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }


    public void jobTitle() {
        try {
            GenericMethods.waitExplicitWebElement(driver, inputJobTitle,20).sendKeys("test");
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void level() {
        try {
            GenericMethods.waitExplicitWebElement(driver, listLevel,20).click();
            Actions actions = new Actions(driver);
            GenericMethods.wait(1000);
            actions.sendKeys("b").pause(500); // Presiona 'b' y espera medio segundo para que la lista se actualice
            actions.sendKeys(Keys.ENTER).perform(); // Presiona 'Enter' para seleccionar la opción
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void skill() {
        try {
            GenericMethods.waitExplicitWebElement(driver, listSkill,20).click();

            Actions actions = new Actions(driver);
            actions.sendKeys("j").pause(500); // Presiona 'j' y espera medio segundo para que la lista se actualice
            actions.sendKeys(Keys.ENTER).perform(); // Presiona 'Enter' para seleccionar la opción
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void languaje() {
        try {
            GenericMethods.waitExplicitWebElement(driver, listLanguage,20).click();

            Actions actions = new Actions(driver);
            actions.sendKeys("s").pause(500); // Presiona 's' y espera medio segundo para que la lista se actualice
            actions.sendKeys(Keys.ENTER).perform(); // Presiona 'Enter' para seleccionar la opción
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void fluency() {
        try {
            GenericMethods.waitExplicitWebElement(driver, listFluency,20).click();

            Actions actions = new Actions(driver);
            actions.sendKeys("s").pause(500); // Presiona 's' y espera medio segundo para que la lista se actualice
            actions.sendKeys(Keys.ENTER).perform(); // Presiona 'Enter' para seleccionar la opción
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void competency() {
        try {
            GenericMethods.waitExplicitWebElement(driver, listCompetency,20).click();

            Actions actions = new Actions(driver);
            actions.sendKeys("m").pause(500); // Presiona 'm' y espera medio segundo para que la lista se actualice
            actions.sendKeys(Keys.ENTER).perform(); // Presiona 'Enter' para seleccionar la opción
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void license() {
        try {
            GenericMethods.waitExplicitWebElement(driver, listLicenseType,20).click();

            Actions actions = new Actions(driver);
            actions.sendKeys("m").pause(500); // Presiona 'm' y espera medio segundo para que la lista se actualice
            actions.sendKeys(Keys.ENTER).perform(); // Presiona 'Enter' para seleccionar la opción
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void submmit() {
        try {
            GenericMethods.wait(300);
            for (WebElement addButton : btnSave2) {
                GenericMethods.wait(500);
                Actions actions = new Actions(driver);
                actions.moveToElement(addButton).perform();
                addButton.click();
            }

        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

    public void validarInformacion() {
        try {
            GenericMethods.wait(4000);
            Assert.assertTrue("Error, no se encontró el registro", lblRecordFound.size() > 0);
        } catch (Exception e) {
            Assert.fail("Error: " + e);
        }
    }

}
