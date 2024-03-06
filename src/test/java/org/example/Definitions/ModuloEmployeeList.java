package org.example.Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.PageObjects.ModuloEmployeeListPO;

public class ModuloEmployeeList {

    ModuloEmployeeListPO moduloEmployeeListPO = new ModuloEmployeeListPO();

    @And("Agregar contacto de emergencia, salario y calificaciones al empleado")
    public void agregarContactoDeEmergenciaSalarioYCalificacionesAlEmpleado() {
        moduloEmployeeListPO.hacerClicEnContactoDeEmergencia();
        moduloEmployeeListPO.agregar();
        moduloEmployeeListPO.agregarNombre();
        moduloEmployeeListPO.agregarRelacion();
        moduloEmployeeListPO.agregarTelefonoCasa();
        moduloEmployeeListPO.agregarTelefonoCelular();
        moduloEmployeeListPO.agregarTelefonoTrabajo();
        moduloEmployeeListPO.hacerClicEnGuardar();
        moduloEmployeeListPO.hacerClicEnSalario();
        moduloEmployeeListPO.agregar();
        moduloEmployeeListPO.agregarSalaryComponent();
        moduloEmployeeListPO.selecionarCurrency();
        moduloEmployeeListPO.agregarpimmount();
        moduloEmployeeListPO.hacerClicEnGuardar();
        moduloEmployeeListPO.hacerClicEnCalificaciones();
        moduloEmployeeListPO.clickallbtnadd();
        moduloEmployeeListPO.company();
        moduloEmployeeListPO.jobTitle();
        moduloEmployeeListPO.level();
        moduloEmployeeListPO.skill();
        moduloEmployeeListPO.languaje();
        moduloEmployeeListPO.fluency();
        moduloEmployeeListPO.competency();
        moduloEmployeeListPO.license();
        moduloEmployeeListPO.submmit();
    }

    @Then("Valido que el empleado tenga contacto de emergencia, salario y calificaciones")
    public void validoQueElEmpleadoTengaContactoDeEmergenciaSalarioYCalificaciones() {
        moduloEmployeeListPO.validarInformacion();
        moduloEmployeeListPO.hacerClicEnSalario();
        moduloEmployeeListPO.validarInformacion();
        moduloEmployeeListPO.hacerClicEnContactoDeEmergencia();
        moduloEmployeeListPO.validarInformacion();
    }
}
