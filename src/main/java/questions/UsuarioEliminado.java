package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.BusquedaEmpleado;

public class UsuarioEliminado implements Question <Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return BusquedaEmpleado.MENSAJE_ENCONTRADO.resolveFor(actor).isCurrentlyVisible();
    }

    public static UsuarioEliminado correctamente() {
        return new UsuarioEliminado();
    }
}
