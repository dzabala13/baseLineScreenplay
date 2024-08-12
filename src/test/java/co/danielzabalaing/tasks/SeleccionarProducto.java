package co.danielzabalaing.tasks;

import co.danielzabalaing.interactions.Guardar;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.danielzabalaing.userinterfaces.CheckoutPage.LABEL_TEXT_SUBTOTAL;
import static co.danielzabalaing.userinterfaces.ItemDetailsPage.*;
import static co.danielzabalaing.userinterfaces.YogaNewPage.ITEM_SELECTED;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarProducto implements Task {
    DataTable detalles;

    public SeleccionarProducto(DataTable detalles){
        this.detalles = detalles;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ITEM_SELECTED.of(detalles.asMaps().get(0).get("item"))),
                Click.on(SIZE_ITEM.of(detalles.asMaps().get(0).get("talla"))),
                Click.on(COLOR_ITEM.of(detalles.asMaps().get(0).get("color"))),
                Clear.field(AMOUNT_ITEMS),
                Type.theValue(detalles.asMaps().get(0).get("cantidad")).into(AMOUNT_ITEMS),
                Click.on(BUTTON_ADD_TO_CART),
                Click.on(LINK_GO_TO_SHOPPING_CAR),
                Guardar.informacionParaDespues("subtotalPrice",LABEL_TEXT_SUBTOTAL)
        );

    }
    public static Performable conDetalles(DataTable detalles){
        return instrumented(SeleccionarProducto.class, detalles);
    }
}
