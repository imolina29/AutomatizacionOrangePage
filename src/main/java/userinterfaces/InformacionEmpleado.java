package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionEmpleado  {
    public static final Target BUTTON_EDIT = Target.the("Editar empleado").located(By.id("btnSave"));
    public static final Target TXT_LICENCIA_CONDUC = Target.the("Licencia de conduccion").located(By.id("personal_txtLicenNo"));
    public static final Target TXT_FECHA_EXP_LICENCIA = Target.the("Fecha expiracion licencia").located(By.id("personal_txtLicExpDate"));
    public static final Target TXT_SSN = Target.the("Identificacion").located(By.id("personal_txtNICNo"));
    public static final Target TXT_SIN = Target.the("Otro documento").located(By.id("personal_txtSINNo"));
    public static final Target GENERO = Target.the("Genero empleado").located(By.id("personal_optGender_1"));
    public static final Target ESTADO_CIVIL = Target.the("Estado civil del empleado").located(By.id("personal_cmbMarital"));
    public static final Target NACIONALIDAD = Target.the("Nacionalidad empleado").located(By.id("personal_cmbNation"));
    public static final Target TXT_FECHA_CUMPLEANOS= Target.the("Fecha Cumpleaños").located(By.id("personal_DOB"));
    public static final Target APODO = Target.the("Apodo empleado").located(By.id("personal_txtEmpNickName"));
    public static final Target LIBRETA_MILITAR = Target.the("Numero de libreta militar").located(By.id("personal_txtMilitarySer"));
    public static final Target FUMADOR = Target.the("Si/no Empleado fuma").located(By.id("personal_chkSmokeFlag"));
    public static final Target BUTTON_SAVE = Target.the("Editar empleado").located(By.id("btnSave"));
}
