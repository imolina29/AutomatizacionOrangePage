package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.HomePage;

public class VisualizarUsuario implements Question <Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return HomePage.TXT_NOMBRE_USUARIO.resolveFor(actor).isPresent();
    }

    public static VisualizarUsuario correcto() {
        return new VisualizarUsuario();
    }
}
