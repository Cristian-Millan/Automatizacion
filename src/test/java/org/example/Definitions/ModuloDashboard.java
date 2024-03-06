package org.example.Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.PageObjects.ModuloDashboardPO;

public class ModuloDashboard {
    private ModuloDashboardPO moduloDashboardPO = new ModuloDashboardPO();

    @Then("Valido que se despliegue el dashboard del usuario")
    public void validoQueSeDespliegueElDashboardDelUsuario() {
        moduloDashboardPO.validarDashboard();
    }

    @And("Selecciona la sección {string}")
    public void seleccionaLaSección(String seccion) {
        moduloDashboardPO.seleccionarSeccion(seccion);

    }
}
