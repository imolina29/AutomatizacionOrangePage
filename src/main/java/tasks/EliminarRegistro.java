package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.BusquedaEmpleado.*;

public class EliminarRegistro implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        if (CHECK.resolveFor(actor).isCurrentlyVisible()) {
            actor.attemptsTo(Click.on(CHECK),
                    Click.on(DELETE_USER),
                    Click.on(CONFIRMAR_DELETE));
        }

    }

    public static EliminarRegistro empleado() {
        return instrumented(EliminarRegistro.class);
    }

}
