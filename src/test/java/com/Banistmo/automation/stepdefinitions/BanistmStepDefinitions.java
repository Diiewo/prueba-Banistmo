package com.Banistmo.automation.stepdefinitions;

import com.Banistmo.automation.interactions.Cambio;
import com.Banistmo.automation.interactions.Wait;

import com.Banistmo.automation.tasks.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class BanistmStepDefinitions {
    // Accessing the Banistmo website

    @Given("Select button cookies")
    public void clickButton() {
        theActorInTheSpotlight().attemptsTo(ClickButtonCookiesTasks.clickButtonCookies());
    }

    @When("Search the aprender")
    public void searchAprender() {
        theActorInTheSpotlight().attemptsTo(ClickButtonAprenderTasks.clickButtonAprender());
    }
    @When("Search the legales")
    public void searchLegales() {
        theActorInTheSpotlight().attemptsTo(ClickButtonLegalesTasks.clickButtonLegales());
    }
    @When("Search the fatca y crs")
    public void searchFact() {
        theActorInTheSpotlight().attemptsTo(ClickButtonFactTasks.clickButtonFack());
    }

    @When("Download “PJ-Autocertificación unificado- Fatca y CRS.pdf”")
    public void downloadPdf() {
        theActorInTheSpotlight().attemptsTo(ClickButtonDownloadTasks.clickButtonDownload());
    }

    @Then("Validar pdf")
    public void pestanaPdf() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(Cambio.aLaPestana(2));
        theActorInTheSpotlight().attemptsTo(Wait.seconds(300));
        theActorInTheSpotlight().attemptsTo(Cambio.aLaPestana(1));
    }
    
}
