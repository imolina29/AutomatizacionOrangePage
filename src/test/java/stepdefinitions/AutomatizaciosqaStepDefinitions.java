package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import exceptions.NoEncontrado;
import models.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.UsuarioCreado;
import questions.UsuarioEliminado;
import questions.VisualizarUsuario;
import tasks.*;
import userinterfaces.HomePage;
import userinterfaces.PanelPrincipal;

import java.util.List;

public class AutomatizaciosqaStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Paul");
    private HomePage homePage = new HomePage();
    private PanelPrincipal panelPrincipal = new PanelPrincipal();

    @Dado("^que Paul accede a la web de Orange$")
    public void quePaulAccedeALaWebDeOrange() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @Cuando("^el introduce su credenciales$")
    public void elIntroduceSuCredenciales() {
        actor.attemptsTo(Acceder.alPortal());
    }

    @Entonces("^el vera su nombre en panel inicial$")
    public void elVeraSuNombreEnPanelInicial() {
        actor.should(GivenWhenThen.seeThat(VisualizarUsuario.correcto()).orComplainWith(NoEncontrado.class));
    }

    @Cuando("^crea el usuario$")
    public void creaElUsuario(List<Datos> datos) {
        actor.attemptsTo(CrearRegistro.nuevoEmpleado(datos),
                EditarRegistro.empleado(datos),
                EditarJob.empleado(datos),
                BuscarEmpleado.empleado(datos));
    }

    @Entonces("^el valida que se creo un nuevo resgistro$")
    public void elValidaQueSeCreoUnNuevoResgistro() {
        actor.should(GivenWhenThen.seeThat(UsuarioCreado.correctamente()).orComplainWith(NoEncontrado.class));
    }

    @Cuando("^elimina el registro$")
    public void eliminaElRegistro(List<Datos> datos) {
        actor.attemptsTo(BuscarEmpleado.empleado(datos), EliminarRegistro.empleado());
    }


    @Entonces("^el visualiza el mensaje success delete$")
    public void elVisualizaElMensajeSuccessDelete() {
        actor.should(GivenWhenThen.seeThat(UsuarioEliminado.correctamente()).orComplainWith(NoEncontrado.class));
    }
    @After()
    public void cerrarSesion(){
        actor.attemptsTo(CerrarSesion.empleado());
    }
}

