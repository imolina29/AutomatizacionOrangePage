package tasks;

import models.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.InformacionJob.*;

public class EditarJob implements Task {

    private List<Datos> datos;
    public EditarJob (List<Datos> datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LINK_JOB),
                Click.on(BUTTON_EDIT),
                SelectFromOptions.byVisibleText(datos.get(0).getJobTitle()).from(LIST_JOB_TITLE),
                SelectFromOptions.byVisibleText(datos.get(0).getDetalleContrato()).from(DETALLE_CONTRATO),
                SelectFromOptions.byVisibleText(datos.get(0).getCategoria()).from(CATEGORIA),
                Enter.theValue(datos.get(0).getFechaContrato()).into(FECHA_INGRESO).thenHit(Keys.TAB),
                SelectFromOptions.byVisibleText(datos.get(0).getSubCategoria()).from(SUB_CATEGORIA),
                SelectFromOptions.byVisibleText(datos.get(0).getUbicacion()).from(UBICACION),
                Enter.theValue(datos.get(0).getInicioContrato()).into(INICIO_CONTRATO).thenHit(Keys.TAB),
                Enter.theValue(datos.get(0).getFinalContrato()).into(FINAL_CONTRATO).thenHit(Keys.TAB),
                Click.on(BUTTON_SAVE));
    }

    public static EditarJob empleado(List<Datos> datos){
        return instrumented(EditarJob.class, datos);
    }

}
