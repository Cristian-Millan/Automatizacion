@Challenge
Feature: Funciones sección PIM

  Background:
    Given accedo a la página de inicio del sitio web


  Scenario Outline: Crear un empleado en la sección PIM
    When Ingresa sus credenciales y inicia sesión
    And Selecciona la sección "<seccion>"
    And Creo un nuevo empleado
    Then El empleado es creado exitosamente

    Examples:
      | seccion |
      | PIM     |


  Scenario Outline: Agregar contacto de emergencia, salario y calificaciones al empleado
    When Ingresa sus credenciales y inicia sesión
    And Selecciona la sección "<seccion>"
    And Creo un nuevo empleado
    And Agregar contacto de emergencia, salario y calificaciones al empleado
    Then Valido que el empleado tenga contacto de emergencia, salario y calificaciones

    Examples:
      | seccion |
      | PIM     |