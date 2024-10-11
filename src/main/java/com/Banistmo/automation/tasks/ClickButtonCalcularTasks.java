package com.Banistmo.automation.tasks;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.Banistmo.automation.userinterfaces.HomePageUI.*;

@AllArgsConstructor
public class ClickButtonCalcularTasks implements Task {

    public static ClickButtonCalcularTasks clickButtonCalcular() {
        return Tasks.instrumented(ClickButtonCalcularTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(CLICK_BUTTON_CALCULAR));
        actor.attemptsTo(Click.on(CLICK_BUTTON_CALCULAR).afterWaitingUntilEnabled());
    }

}
