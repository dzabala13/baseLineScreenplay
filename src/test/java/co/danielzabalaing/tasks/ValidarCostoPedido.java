package co.danielzabalaing.tasks;

import co.danielzabalaing.questions.Balance;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static co.danielzabalaing.userinterfaces.CheckoutPaymentPage.BUTTON_FINAL_CONFIRMATION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidarCostoPedido implements Task  {

    @Override
    public <T extends Actor> void performAs(T actor) {

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
