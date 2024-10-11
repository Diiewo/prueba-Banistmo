package com.Banistmo.automation.stepdefinitions;

import com.Banistmo.automation.tasks.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class BanistmStepDefinitions {
    // Accessing the Banistmo website

    @Given("Select button negocios")
    public void clickButton() {
        theActorInTheSpotlight().attemptsTo(ClickButtonNegociosTasks.clickButtonNegocios());
    }

    @When("Select button soluciones no financieras")
    public void clickButtonSoluciones() {
        theActorInTheSpotlight().attemptsTo(ClickButtonSolucionesTasks.clickButtonSoluciones());
    }
    @When("Search the herramientas")
    public void searchHerramientas() {
        theActorInTheSpotlight().attemptsTo(ClickButtonHerramientasTasks.clickButtonHerramientas());
    }
    @When("Search the gestionar")
    public void searchGestionar() {
        theActorInTheSpotlight().attemptsTo(ClickButtonGestionarTasks.clickButtonGestionar());
    }

    @When("Search the convertidor")
    public void searchConvertidor() {
        theActorInTheSpotlight().attemptsTo(ClickButtonConvertidorTasks.clickButtonConvertidor());
    }

    @When("Search the calcular")
    public void searchCalcular() {
        theActorInTheSpotlight().attemptsTo(ClickButtonCalcularTasks.clickButtonCalcular());
    }

    @When("Write the tasa")
    public void writeTasa() {
        theActorInTheSpotlight().attemptsTo(WriteInputTasaTasks.writeInputTasa());
    }

    @When("Select Semestral")
    public void selectSemestral() {
        theActorInTheSpotlight().attemptsTo(SelectOptionTask.selectSemestral());
    }

    @When("Select Anual")
    public void selectAnual() {
        theActorInTheSpotlight().attemptsTo(SelectOptionAnualTask.selectAnual());
    }

    @Then("validate respuesta")
    public void validateRespuesta() {
        theActorInTheSpotlight().attemptsTo(GetTextTask.validateRespuesta());
    }
    
}
