package co.danielzabalaing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class WhatIsNewPage {

    public static final Target BUTTON_SHOP_NEW_YOGA = the("Botón para ir a la seccion de Shop NewYoga")
            .located(By.xpath("//span[@class='more button']"));
}
