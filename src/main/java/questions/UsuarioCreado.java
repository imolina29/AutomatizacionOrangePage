package questions;

import models.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static userinterfaces.BusquedaEmpleado.*;

public class UsuarioCreado implements Question <Boolean> {
    public static UsuarioCreado correctamente() {
        return new UsuarioCreado();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<Datos> datos = actor.recall("Datos");
        boolean resultado = false;
        if (NAME.resolveFor(actor).isPresent()) {
            if (NAME.resolveFor(actor).getText().equalsIgnoreCase(datos.get(0).getNombre()+" "+datos.get(0).getSegNombre()) &&
                    LASTNAME.resolveFor(actor).getText().equalsIgnoreCase(datos.get(0).getApellido()) &&
                            JOB.resolveFor(actor).getText().equalsIgnoreCase(datos.get(0).getJobTitle())){
                resultado = true;
            }

        }
        return resultado;
    }
}
