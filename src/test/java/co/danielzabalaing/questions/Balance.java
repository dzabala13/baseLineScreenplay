package co.danielzabalaing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.danielzabalaing.userinterfaces.CheckoutPaymentPage.LABEL_TOTAL_PRICE;
import static co.danielzabalaing.userinterfaces.SuccessPage.FIELD_NUMBER_ORDER;

public class Balance implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        int subtotal = Integer.parseInt(actor.recall("subtotalPrice").toString().replaceAll("[$.]",""));
        int taxPrice = Integer.parseInt(actor.recall("taxPrice").toString().replaceAll("[$.]",""));
        int valorClave = Integer.parseInt(LABEL_TOTAL_PRICE.resolveFor(actor).getText().replaceAll("[$.]",""));

        System.out.println("El valor total de su Orden es : " + LABEL_TOTAL_PRICE.resolveFor(actor).getText());
        return ((subtotal+taxPrice)==valorClave);
    }

    public static Balance validacion(){
        return new Balance();
    }
}
