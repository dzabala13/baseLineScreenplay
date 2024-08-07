package co.danielzabalaing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class CheckoutPage {

    public static final Target BUTTON_PROCED_CHECKOUT = the("boton par aconfirmar el checkout")
            .located(By.xpath("//button[@data-role='proceed-to-checkout']"));

    public static final Target LABEL_TEXT_SUBTOTAL= the("boton par aconfirmar el checkout")
            .located(By.xpath("//td[@class=\"col subtotal\"]//span[@class=\"price\"]"));

}
