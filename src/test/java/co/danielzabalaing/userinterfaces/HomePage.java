package co.danielzabalaing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class HomePage {


    public static final Target LINK_REGISTRO = the("Link para Registro Usuarios Nuevos")
            .located(By.xpath("//div[@class='panel header']//a[contains(text(),'Create')]"));
}
