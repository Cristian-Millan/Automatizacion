package org.example.Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.PageObjects.ModuloCambioClavePO;

public class ModuloCambioClave {

    ModuloCambioClavePO moduloCambioClavePO = new ModuloCambioClavePO();

    @And("Se cambia la clave del usuario")
    public void ingresaALaSecciónDeCambioDeClave() {
        moduloCambioClavePO.ingresarSeccionCambioClave();
        moduloCambioClavePO.ingresarClaveActual();
        moduloCambioClavePO.ingresarNuevaClave();
        moduloCambioClavePO.confirmarNuevaClave();
        moduloCambioClavePO.hacerClicEnGuardar();
    }

    @Then("Se muestra el mensaje de cambio de clave exitoso")
    public void seMuestraElMensajeDeCambioDeClaveExitoso() {
        moduloCambioClavePO.validarMensaje();
    }
}
