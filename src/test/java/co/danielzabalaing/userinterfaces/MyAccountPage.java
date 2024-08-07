package co.danielzabalaing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class MyAccountPage {

    public static final Target BUTTON_WHAT_IS_NEW = the("Opcion del Menu What's New ")
            .located(By.xpath("//div[@id='store.menu']//span[contains(text(),\"What's New\")]"));
}
