package com.Banistmo.automation.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

import static com.Banistmo.automation.userinterfaces.HomePageUI.*;

@AllArgsConstructor
public class GetTextTask implements Task {

    public static GetTextTask validateRespuesta() {
        return Tasks.instrumented(GetTextTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Obtiene el texto LA RESPUESTA
        String respuestaText = Text.of(RESPUESTA).answeredBy(actor);
        System.out.println("El valor del resultado es: " + respuestaText);
    }
}