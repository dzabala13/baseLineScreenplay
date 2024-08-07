package co.danielzabalaing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class CheckoutPaymentPage {


    public static final Target LABEL_TOTAL_PRICE = the("item seleccionado que se comprara")
            .located(By.xpath("//td[@data-th=\"Order Total\"]//child::span"));

    public static final Target BUTTON_FINAL_CONFIRMATION = the("item seleccionado que se comprara")
            .located(By.xpath("//button[@class=\"action primary checkout\"]"));

}
