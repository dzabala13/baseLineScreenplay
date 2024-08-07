package co.danielzabalaing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ItemDetailsPage {

    public static final Target SIZE_ITEM = the("selecciona el tamaño del item a comprar")
            .located(By.xpath("//*[contains(text(),'28')and @class='swatch-option text']"));
    public static final Target COLOR_ITEM = the("selecciona el color del item a comprar")
            .located(By.xpath("//*[@aria-label='Black']"));
    public static final Target AMOUNT_ITEMS = the("selecciona la cantidad del items a comprar")
            .located(By.xpath("//*[@id='qty']"));
    public static final Target BUTTON_ADD_TO_CART = the("botón para agregar itema al carrito de compras")
            .located(By.xpath("//*[@id='product-addtocart-button']"));
    public static final Target LINK_GO_TO_SHOPPING_CAR = the("link para ir a el carrito de compras")
            .located(By.xpath("//div//a[contains(text(),'shopping cart')]"));

}
