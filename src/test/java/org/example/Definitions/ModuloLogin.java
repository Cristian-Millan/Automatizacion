package org.example.Definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObjects.ModuloLoginPO;

public class ModuloLogin {
    private ModuloLoginPO moduloLoginPO = new ModuloLoginPO();

    @When("Ingresa sus credenciales y inicia sesión")
    public void ingresaSusCredencialesYEIniciaSesión() {
        moduloLoginPO.ingresarUsuario();
        moduloLoginPO.ingresarContraseña();
        moduloLoginPO.hacerClicEnIniciarSesión();
    }

    @When("Ingresa sus credenciales incorrectas")
    public void ingresaSusCredencialesIncorrectas() {
        moduloLoginPO.ingresarUsuarioIncorrecto();
        moduloLoginPO.ingresarContraseña();
        moduloLoginPO.hacerClicEnIniciarSesión();
    }

    @Then("Valido que se despliegue el mensaje de error")
    public void validoQueSeDespliegueElMensajeDeError() {
        moduloLoginPO.validarMensajeError();
    }
}
