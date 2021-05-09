package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import questions.ObtenerCredenciales;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static userinterfaces.HomePage.*;

public class Acceder implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<String> credenciales = actor.asksFor(ObtenerCredenciales.delUsuario());
        actor.attemptsTo(Enter.theValue(credenciales.get(0)).into(INPUT_USUARIO),
                Enter.theValue(credenciales.get(1)).into(INPUT_CONTRASENA),
                Click.on(BUTTON_LOGIN));
        getDriver().navigate().back();
        actor.attemptsTo(WaitUntil.angularRequestsHaveFinished(),
                WaitUntil.the(TXT_NOMBRE_USUARIO,
                WebElementStateMatchers.isPresent()).forNoMoreThan(3).seconds());
    }

    public static Acceder alPortal() {
        return instrumented(Acceder.class);
    }
}
