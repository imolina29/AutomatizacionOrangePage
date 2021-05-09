package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusquedaEmpleado {
    public static final Target BUTTON_PIM = Target.the("Click en pestana PIM").located(By.id("menu_pim_viewPimModule"));
    public static final Target BUTTON_EMPLOYEE_LIST = Target.the("Click en Lista de Empleados").located(By.id("menu_pim_viewEmployeeList"));
    public static final Target INPUT_NOMBRE_EMPLEADO = Target.the("Buscar empleado por nombre").located(By.id("empsearch_employee_name_empName"));
    public static final Target INPUT_ID = Target.the("Buscar empleado po ID").located(By.id("empsearch_id"));
    public static final Target BUTTON_BUSCAR = Target.the("Boton buscar registros").located(By.id("searchBtn"));
     public static final Target NAME = Target.the("name").locatedBy("(//table[@id='resultTable']//tr)[2]/td[3]/a");
    public static final Target LASTNAME = Target.the("lastname").locatedBy("(//table[@id='resultTable']//tr)[2]/td[4]/a");
    public static final Target JOB = Target.the("job").locatedBy("(//table[@id='resultTable']//tr)[2]/td[5]");
    public static final Target REGISTRO = Target.the("registro").locatedBy("(//table[@id='resultTable']//tr)[2]/td[1]");
    public static final Target CHECK = Target.the("check").locatedBy("(//table[@id='resultTable']//tr)[2]/td[1]/input");
    public static final Target DELETE_USER = Target.the("Eliminar usuario").located(By.id("btnDelete"));
    public static final Target CONFIRMAR_DELETE = Target.the("Confirmar eliminacion").located(By.id("dialogDeleteBtn"));
    public static final Target MENSAJE_ENCONTRADO = Target.the("Mensaje de registro eliminado").locatedBy("//div[contains(@class,'message success')]");
    public static final Target FOOTER = Target.the("Mensaje footer").located(By.id("footer"));
}
