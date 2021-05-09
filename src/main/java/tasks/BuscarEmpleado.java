package tasks;

import models.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.BusquedaEmpleado.*;

public class BuscarEmpleado implements Task {

    private List<Datos> datos;
    public BuscarEmpleado (List<Datos> datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_PIM),
                Click.on(BUTTON_EMPLOYEE_LIST),
                Enter.theValue(datos.get(0).getNombre()+" "+datos.get(0).getSegNombre()+" "+datos.get(0).getApellido()).into(INPUT_NOMBRE_EMPLEADO),
                Enter.theValue(datos.get(0).getId()).into(INPUT_ID),
                Click.on(BUTTON_BUSCAR),
                Scroll.to(FOOTER));
        actor.remember("Datos",datos);
    }

    public static BuscarEmpleado empleado(List<Datos> datos) {

        return instrumented(BuscarEmpleado.class, datos);
    }

}
