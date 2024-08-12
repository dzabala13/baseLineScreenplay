package co.danielzabalaing.tasks;

import co.danielzabalaing.interactions.Guardar;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.danielzabalaing.userinterfaces.ShippingDetailsPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarDetallesDeEntrega implements Task {


    DataTable datos ;

    public IngresarDetallesDeEntrega(DataTable datos){
        this.datos  = datos;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.theValue(datos.asMaps().get(0).get("company")).into(INPUT_TEXT_COMPANY),
                Type.theValue(datos.asMaps().get(0).get("address")).into(INPUT_TEXT_STREET_ADDRESS),
                Type.theValue(datos.asMaps().get(0).get("city")).into(INPUT_TEXT_CITY),
                SelectFromOptions.byVisibleText(datos.asMaps().get(0).get("province")).from(SELECTED_PROVINCE),
                Type.theValue(datos.asMaps().get(0).get("postal_code")).into(INPUT_TEXT_POSTAL_CODE),
                SelectFromOptions.byVisibleText(datos.asMaps().get(0).get("country")).from(SELECTED_CONUNTRY),
                Type.theValue(datos.asMaps().get(0).get("phone")   ).into(INPUT_TEXT_PHONE_NUMBER),
                Click.on(RADIO_BUTTON_SHIPPING_METHODS),
                Guardar.informacionParaDespues("taxPrice",LABEL_SHIPPING_COST),
                Click.on(BUTTON_SUMMIT)
        );
    }


    public static Performable delUsuario(DataTable datos){

        return instrumented(IngresarDetallesDeEntrega.class, datos);
    }
}
