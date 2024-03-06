@Challenge
Feature: Inicio de sesión en el sitio web
  Background:
    Given accedo a la página de inicio del sitio web

  Scenario: Iniciar sesión con usuario correcto
    When Ingresa sus credenciales y inicia sesión
    Then Valido que se despliegue el dashboard del usuario

  Scenario: Iniciar sesión con usuario incorrecto
    When Ingresa sus credenciales incorrectas
    Then Valido que se despliegue el mensaje de error
