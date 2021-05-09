package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class PanelPrincipal {
    public static final Target BUTTON_PIM = Target.the("Click en pestana PIM").located(By.id("menu_pim_viewPimModule"));
    public static final Target BUTTON_ADD_EMPLEADO = Target.the("Click en agregar empleado").located(By.id("menu_pim_addEmployee"));
    public static final Target INPUT_NOMBRE = Target.the("Nombre emplado").located(By.id("firstName"));
    public static final Target INPUT_SEGUNDO_NOMBRE = Target.the("Segundo Nombre").located(By.id("middleName"));
    public static final Target INPUT_APELLIDO = Target.the("Nombre apellido").located(By.id("lastName"));
    public static final Target INPUT_ID = Target.the("Id empleado").located(By.id("employeeId"));
    public static final Target BUTTON_SAVE = Target.the("Guardar empleado").located(By.id("btnSave"));
}
