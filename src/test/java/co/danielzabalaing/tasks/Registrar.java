package co.danielzabalaing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.actions.type.TypeValue;

import static co.danielzabalaing.userinterfaces.RegistroPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registrar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.theValue("dfsdf").into(INPUT_NOMBRE),
                Type.theValue("dfsdfs").into(INPUT_LAST_NAME),
                Type.theValue("testas13@test.com").into(INPUT_EMAIL),
                Type.theValue("Password123").into(INPUT_CLAVE),
                Type.theValue("Password123").into(INPUT_CLAVE_DOS),
                Click.on(BUTTON_REGISTRAR)
        );

    }

    public static Performable unUsuarioNuevo(){
        return instrumented(Registrar.class);
    }
}
