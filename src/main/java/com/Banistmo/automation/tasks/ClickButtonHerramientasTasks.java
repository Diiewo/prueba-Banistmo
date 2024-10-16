package com.Banistmo.automation.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.Banistmo.automation.userinterfaces.HomePageUI.*;

@AllArgsConstructor
public class ClickButtonHerramientasTasks implements Task {

    public static ClickButtonHerramientasTasks clickButtonHerramientas() {
        return Tasks.instrumented(ClickButtonHerramientasTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(CLICK_BUTTON_HERRAMIENTAS));
        actor.attemptsTo(Click.on(CLICK_BUTTON_HERRAMIENTAS).afterWaitingUntilEnabled());
    }

}
