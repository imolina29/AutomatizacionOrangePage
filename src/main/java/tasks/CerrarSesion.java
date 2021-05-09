package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.BUTTON_USUARIO;
import static userinterfaces.HomePage.LINK_LOGOUT;

public class CerrarSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_USUARIO), Click.on(LINK_LOGOUT));
    }
    public static CerrarSesion empleado() {
        return instrumented(CerrarSesion.class);
    }
}
