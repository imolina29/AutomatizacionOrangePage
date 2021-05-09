package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php")
public class HomePage extends PageObject {
    public static final Target TXT_CREDENCIALES = Target.the("Credenciales de acceso").locatedBy("//span[contains(text(),'admin')]");
    public static final Target INPUT_USUARIO = Target.the("Campo Usuario").located(By.id("txtUsername"));
    public static final Target INPUT_CONTRASENA = Target.the("Campo Contrasena").located(By.id("txtPassword"));
    public static final Target BUTTON_LOGIN = Target.the("Boton Login").located(By.id("btnLogin"));
    public static final Target TXT_NOMBRE_USUARIO = Target.the("Nombre de usuario").located(By.id("welcome"));
    public static final Target BUTTON_USUARIO = Target.the("Boton opciones usuario").located(By.id("welcome"));
    public static final Target LINK_LOGOUT = Target.the("Boton Cerrar sesion").locatedBy("//*[@id=\"welcome-menu\"]/ul/li[3]/a");
}
