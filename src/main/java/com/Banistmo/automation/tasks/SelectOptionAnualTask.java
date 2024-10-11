package com.Banistmo.automation.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.Banistmo.automation.userinterfaces.HomePageUI.*;

@AllArgsConstructor
public class SelectOptionAnualTask implements Task {

    public static SelectOptionAnualTask selectAnual() {
        return Tasks.instrumented(SelectOptionAnualTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Selecciona la opción "Anual"
        actor.attemptsTo(SelectFromOptions.byVisibleText("Anual").from(SELECT_ANUAL));
    }
}