package com.Banistmo.automation.stepdefinitions.hooks;

import com.Banistmo.automation.utils.WebDriverFactory;
import io.cucumber.java.BeforeAll;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class DriverHook {
    @BeforeAll
    public static void setup() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(WebDriverFactory.goToWeb("https://www.bancolombia.com/personas?_gl=1*kdwle1*_gcl_au*MTM0OTY0NzYwMC4xNzI4NjcyMDE4*_ga*Nzc3NjczNDcuMTcyODY3MjAxOQ..*_ga_GVYK05G3HJ*MTcyODY3MjAxOC4xLjEuMTcyODY3MjIxOC42MC4wLjA."))));
        OnStage.theActorCalled("Automation");
    }
}
