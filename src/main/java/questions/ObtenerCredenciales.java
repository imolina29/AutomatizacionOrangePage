package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

import static userinterfaces.HomePage.TXT_CREDENCIALES;

public class ObtenerCredenciales implements Question <List<String>> {


    @Override
    public List<String> answeredBy(Actor actor) {
        String datosCredenciales = TXT_CREDENCIALES.resolveFor(actor).getText();
        String usuario = datosCredenciales.substring(datosCredenciales.indexOf("Username :"),datosCredenciales.indexOf("|"));
        String contrasena = datosCredenciales.substring(datosCredenciales.indexOf("Password :"),datosCredenciales.indexOf(")"));
        List<String> credenciales = new ArrayList<>();
        usuario = usuario.substring(usuario.indexOf(":")+1).trim();
        contrasena = contrasena.substring(contrasena.indexOf(":")+1).trim();
        credenciales.add(usuario);
        credenciales.add(contrasena);
        return credenciales;
    }
    public static ObtenerCredenciales delUsuario() {
        return new ObtenerCredenciales();
    }
}
