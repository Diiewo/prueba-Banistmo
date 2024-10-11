package com.Banistmo.automation.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.Banistmo.automation.userinterfaces.HomePageUI.*;

@AllArgsConstructor
public class ClickButtonNegociosTasks implements Task {

    public static ClickButtonNegociosTasks clickButtonNegocios() {
        return Tasks.instrumented(ClickButtonNegociosTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLICK_BUTTON_NEGOCIOS).afterWaitingUntilEnabled());
    }

}
