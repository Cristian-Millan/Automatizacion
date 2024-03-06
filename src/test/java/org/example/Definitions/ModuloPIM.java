package org.example.Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.PageObjects.ModuloPIMPO;

public class ModuloPIM {

    private ModuloPIMPO moduloPIMPO = new ModuloPIMPO();

    @And("Creo un nuevo empleado")
    public void creoUnNuevoEmpleado() {
        moduloPIMPO.crearEmpleado();
        moduloPIMPO.ingresarNombre();
        moduloPIMPO.ingresarSegundoNombre();
        moduloPIMPO.ingresarApellido();
        moduloPIMPO.guardarEmpleado();
    }

    @Then("El empleado es creado exitosamente")
    public void elEmpleadoEsCreadoExitosamente() {
        moduloPIMPO.validarEmpleadoCreado();
    }
}
