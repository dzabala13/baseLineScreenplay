package co.danielzabalaing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class SuccessPage {

    public static final Target FIELD_NUMBER_ORDER = the("Botón para ir a la seccion de Shop NewYoga")
            .located(By.xpath("//*[@class='checkout-success']//p//a//strong"));
}
