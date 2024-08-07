package co.danielzabalaing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ShippingDetailsPage {

    public static final Target INPUT_TEXT_COMPANY = the("item seleccionado que se comprara")
            .located(By.xpath("//input[@class=\"input-text\" and @name=\"company\"]"));

    public static final Target INPUT_TEXT_STREET_ADDRESS = the("item seleccionado que se comprara")
            .located(By.xpath("//input[@class=\"input-text\" and @name=\"street[0]\"]"));

    public static final Target INPUT_TEXT_CITY = the("item seleccionado que se comprara")
            .located(By.xpath("//input[@class=\"input-text\" and @name=\"city\"]"));

    public static final Target INPUT_TEXT_POSTAL_CODE = the("item seleccionado que se comprara")
            .located(By.xpath("//input[@class=\"input-text\" and @name=\"postcode\"]"));

    public static final Target INPUT_TEXT_PHONE_NUMBER = the("item seleccionado que se comprara")
            .located(By.xpath("//input[@class=\"input-text\" and @name=\"telephone\"]"));

    public static final Target SELECTED_CONUNTRY = the("item seleccionado que se comprara")
            .located(By.xpath("//select[@class=\"select\" and @name=\"country_id\"]"));

    public static final Target SELECTED_PROVINCE = the("item seleccionado que se comprara")
            .located(By.xpath("//select[@class=\"select\" and @name=\"region_id\"]"));

    public static final Target RADIO_BUTTON_SHIPPING_METHODS = the("item seleccionado que se comprara")
            .located(By.xpath("//td[@id=\"label_carrier_flatrate_flatrate\"]//preceding-sibling::td//input"));

    public static final Target LABEL_SHIPPING_COST = the("item seleccionado que se comprara")
            .located(By.xpath("//td[@id=\"label_carrier_flatrate_flatrate\"]//preceding-sibling::td//span//span"));

    public static final Target BUTTON_SUMMIT = the("item seleccionado que se comprara")
            .located(By.xpath("//button[@class=\"button action continue primary\"]"));

}
