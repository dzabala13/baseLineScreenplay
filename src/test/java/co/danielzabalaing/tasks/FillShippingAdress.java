package co.danielzabalaing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.danielzabalaing.userinterfaces.ShippingDetailsPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillShippingAdress implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.theValue("globant").into(INPUT_TEXT_COMPANY),
                Type.theValue("carrera falsa 123").into(INPUT_TEXT_STREET_ADDRESS),
                Type.theValue("bogota").into(INPUT_TEXT_CITY),
                SelectFromOptions.byVisibleText("Arizona").from(SELECTED_PROVINCE),
                Type.theValue("10021").into(INPUT_TEXT_POSTAL_CODE),
                SelectFromOptions.byVisibleText("Afghanistan").from(SELECTED_CONUNTRY),
                Type.theValue("3133201122").into(INPUT_TEXT_PHONE_NUMBER),
                Click.on(RADIO_BUTTON_SHIPPING_METHODS),
                Click.on(BUTTON_SUMMIT)
        );
    }


    public static Performable detallesEntrega(){

        return instrumented(FillShippingAdress.class);
    }
}
