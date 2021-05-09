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
import static userinterfaces.InformacionEmpleado.*;

public class EditarRegistro implements Task {

    private List<Datos> datos;
    public EditarRegistro (List<Datos> datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_EDIT),
                Enter.theValue(datos.get(0).getLicenciaCond()).into(TXT_LICENCIA_CONDUC),
                Enter.theValue(datos.get(0).getfExpLicencia()).into(TXT_FECHA_EXP_LICENCIA).thenHit(Keys.TAB),
                Enter.theValue(datos.get(0).getSsn()).into(TXT_SSN),
                Enter.theValue(datos.get(0).getSin()).into(TXT_SIN),
                Click.on(GENERO),
                SelectFromOptions.byVisibleText(datos.get(0).getEstadoCivil()).from(ESTADO_CIVIL),
                SelectFromOptions.byVisibleText(datos.get(0).getNacionalidad()).from(NACIONALIDAD),
                Enter.theValue(datos.get(0).getFechaCumpleanos()).into(TXT_FECHA_CUMPLEANOS).thenHit(Keys.TAB),
                Enter.theValue(datos.get(0).getApodo()).into(APODO),
                Enter.theValue(datos.get(0).getLibMilitar()).into(LIBRETA_MILITAR),
                Click.on(FUMADOR),
                Click.on(BUTTON_SAVE));
    }

    public static EditarRegistro empleado(List<Datos> datos) {
        return instrumented(EditarRegistro.class, datos);
    }
}
