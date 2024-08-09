package co.danielzabalaing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class YogaNewPage {

    public static final Target ITEM_SELECTED = the("item seleccionado que se comprara")
            .locatedBy("//*[@class='product-item-info']//*[contains(@alt,'{0}')]");
}
