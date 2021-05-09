package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionJob {
    public static final Target LINK_JOB = Target.the("Acceso al link job").locatedBy("//ul[@id='sidenav']//a[text()='Job']");
    public static final Target BUTTON_EDIT = Target.the("Boton Editar empleado").located(By.id("btnSave"));
    public static final Target LIST_JOB_TITLE = Target.the("Empleo aplica").located(By.id("job_job_title"));
    public static final Target DETALLE_CONTRATO = Target.the("Detalle contrato").located(By.id("job_emp_status"));
    public static final Target CATEGORIA = Target.the("Categoria").located(By.id("job_eeo_category"));
    public static final Target FECHA_INGRESO = Target.the("Fecha ingreso").located(By.id("job_joined_date"));
    public static final Target SUB_CATEGORIA = Target.the("Categoria empresa").located(By.id("job_sub_unit"));
    public static final Target UBICACION = Target.the("ubicacion empleado").located(By.id("job_location"));
    public static final Target INICIO_CONTRATO = Target.the("Inicio de contrato").located(By.id("job_contract_start_date"));
    public static final Target FINAL_CONTRATO = Target.the("Finalizacion contrato").located(By.id("job_contract_end_date"));
    public static final Target BUTTON_SAVE = Target.the("Boton guardar").located(By.id("btnSave"));
}
