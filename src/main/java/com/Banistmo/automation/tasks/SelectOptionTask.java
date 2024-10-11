package com.Banistmo.automation.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.Banistmo.automation.userinterfaces.HomePageUI.*;

@AllArgsConstructor
public class SelectOptionTask implements Task {

    public static SelectOptionTask selectSemestral() {
        return Tasks.instrumented(SelectOptionTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Selecciona la opción "Semestral"
        actor.attemptsTo(SelectFromOptions.byVisibleText("Semestral").from(SELECT_SEMESTRAL));
    }
}