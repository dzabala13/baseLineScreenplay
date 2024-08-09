package co.danielzabalaing.tasks;

import co.danielzabalaing.questions.Balance;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.danielzabalaing.userinterfaces.CheckoutPaymentPage.BUTTON_FINAL_CONFIRMATION;
import static co.danielzabalaing.userinterfaces.CheckoutPaymentPage.LABEL_TOTAL_PRICE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidarCostoPedido implements Task  {

    @Override
    public <T extends Actor> void performAs(T actor) {

        int subtotal = Integer.parseInt(actor.recall("subtotalPrice").toString().replaceAll("[$.]",""));
        int taxPrice = Integer.parseInt(actor.recall("taxPrice").toString().replaceAll("[$.]",""));
        int valorClave = Integer.parseInt(LABEL_TOTAL_PRICE.resolveFor(actor).getText().replaceAll("[$.]",""));


        if(Balance.validacion().answeredBy(actor)){
            actor.attemptsTo(
                    Click.on(BUTTON_FINAL_CONFIRMATION)
            );
        }

    }
    public static Performable detallesPedido(){
        return instrumented(ValidarCostoPedido.class);
    }
}
