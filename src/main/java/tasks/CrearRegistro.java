package tasks;

import models.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.PanelPrincipal;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearRegistro implements Task {

    private List<Datos> datos;
    public CrearRegistro(List<Datos> datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PanelPrincipal.BUTTON_PIM),
                Click.on(PanelPrincipal.BUTTON_ADD_EMPLEADO));
        WaitUntil.the(PanelPrincipal.BUTTON_ADD_EMPLEADO,
                WebElementStateMatchers.isPresent()).forNoMoreThan(3).seconds();
        actor.attemptsTo(Enter.theValue(datos.get(0).getNombre()).into(PanelPrincipal.INPUT_NOMBRE),
                Enter.theValue(datos.get(0).getSegNombre()).into(PanelPrincipal.INPUT_SEGUNDO_NOMBRE),
                Enter.theValue(datos.get(0).getApellido()).into(PanelPrincipal.INPUT_APELLIDO),
                Enter.theValue(datos.get(0).getId()).into(PanelPrincipal.INPUT_ID));
        actor.attemptsTo(Click.on(PanelPrincipal.BUTTON_SAVE));
    }

    public static CrearRegistro nuevoEmpleado(List<Datos> datos) {
        return instrumented(CrearRegistro.class, datos);
    }

}
