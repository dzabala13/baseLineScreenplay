package co.danielzabalaing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class OnePageSucess {


    public static final Target LABEL_ORDER_NUMBER = the("item seleccionado que se comprara")
            .located(By.xpath("//a[@class=\"order-number\"]"));

}
