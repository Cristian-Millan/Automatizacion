package org.example.utils;


import org.example.config.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GenericMethods {

    public static WebElement waitExplicitWebElement(WebDriver driver, WebElement locator, int tiempoEspera) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tiempoEspera));
        return wait.until(ExpectedConditions.visibilityOf(locator));
    }

    public static void waitExplicit(WebElement elementName, int time) {
        try {
            System.out.println("Esperando elemento");
            WebDriverWait myWaitVar = new WebDriverWait(DriverContext.getDriver(), Duration.ofSeconds(time));
            myWaitVar.until(ExpectedConditions.visibilityOfAllElements(elementName));
        } catch (Exception var3) {
            System.out.println("Espera no cumplida");
        }
    }
    public static void wait(int time) {
        try {
            System.out.println("Esperando elemento");
            Thread.sleep(time);
        } catch (Exception var3) {
            System.out.println("Espera no cumplida");
        }
    }



}
