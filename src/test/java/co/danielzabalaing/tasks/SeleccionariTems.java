package co.danielzabalaing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.danielzabalaing.userinterfaces.ItemDetailsPage.*;
import static co.danielzabalaing.userinterfaces.YogaNewPage.ITEM_SELECTED;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionariTems implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ITEM_SELECTED),
                Click.on(SIZE_ITEM),
                Click.on(COLOR_ITEM),
                Clear.field(AMOUNT_ITEMS),
                Type.theValue("1").into(AMOUNT_ITEMS),
                Click.on(BUTTON_ADD_TO_CART),
                Click.on(LINK_GO_TO_SHOPPING_CAR)


        );

    }
    public static Performable iTemsConDetalles(){
        return instrumented(SeleccionariTems.class);
    }
}
