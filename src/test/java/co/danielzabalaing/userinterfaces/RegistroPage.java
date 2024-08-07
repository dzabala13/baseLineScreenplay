package co.danielzabalaing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class RegistroPage {

    public static final Target INPUT_NOMBRE = the("Campo para ingreso de Nombre")
            .located(By.id("firstname"));
    public static final Target INPUT_LAST_NAME = the("Campo para ingreso de Nombre")
            .located(By.id("lastname"));
    public static final Target INPUT_EMAIL = the("Campo para ingreso de Direccion")
            .located(By.id("email_address"));
    public static final Target INPUT_CLAVE = the("Campo para ingreso de Clave")
            .located(By.id("password"));
    public static final Target INPUT_CLAVE_DOS = the("Campo para ingreso de Clave Segunda Vez")
            .located(By.id("password-confirmation"));
    public static final Target BUTTON_REGISTRAR = the("Boton de Ingreso")
            .locatedBy("//button[@title='Create an Account']");


}
