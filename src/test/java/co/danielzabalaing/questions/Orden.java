package co.danielzabalaing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.danielzabalaing.userinterfaces.SuccessPage.FIELD_NUMBER_ORDER;

public class Orden implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println(FIELD_NUMBER_ORDER.resolveFor(actor).isVisible());
        System.out.println("Su orden fue creada con exito : " + FIELD_NUMBER_ORDER.resolveFor(actor).isVisible());
        return (FIELD_NUMBER_ORDER.resolveFor(actor).isVisible());
    }

    public static Orden CreadaConExito(){
        return new Orden();
    }
}
