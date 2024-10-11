package com.Banistmo.automation.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.Banistmo.automation.userinterfaces.HomePageUI.CLICK_BUTTON_GESTIONAR;

@AllArgsConstructor
public class ClickButtonGestionarTasks implements Task {

    public static ClickButtonGestionarTasks clickButtonGestionar() {
        return Tasks.instrumented(ClickButtonGestionarTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(CLICK_BUTTON_GESTIONAR));
        actor.attemptsTo(Click.on(CLICK_BUTTON_GESTIONAR).afterWaitingUntilEnabled());
    }

}
