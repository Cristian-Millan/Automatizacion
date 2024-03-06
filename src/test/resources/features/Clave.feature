@Challenge
Feature: Cambio de clave

  Background:
    Given accedo a la página de inicio del sitio web


  Scenario: Cambio la clave del usuario
    When Ingresa sus credenciales y inicia sesión
    And Se cambia la clave del usuario
    Then Se muestra el mensaje de cambio de clave exitoso
