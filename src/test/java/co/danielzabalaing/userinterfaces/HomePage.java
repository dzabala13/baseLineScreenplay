package co.danielzabalaing.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class HomePage extends PageObject {


    public static final Target LINK_REGISTRO = the("Link para Registro Usuarios Nuevos")
            .located(By.xpath("//div[@class='panel header']//a[contains(text(),'Create')]"));
}
