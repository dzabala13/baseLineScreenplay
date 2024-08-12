package co.danielzabalaing.tasks;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.danielzabalaing.userinterfaces.RegistroPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registrarse extends Faker implements Task {
    public DataTable datos;

    public Registrarse(DataTable datos){
        this.datos=datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Type.theValue(datos.asMaps().get(0).get("nombre")).into(INPUT_NOMBRE),
                Type.theValue(datos.asMaps().get(0).get("apellido")).into(INPUT_LAST_NAME),
                Type.theValue(number().numberBetween(0,1000)+datos.asMaps().get(0).get("email")).into(INPUT_EMAIL),
                Type.theValue(datos.asMaps().get(0).get("password")).into(INPUT_CLAVE),
                Type.theValue(datos.asMaps().get(0).get("password")).into(INPUT_CLAVE_DOS),
                Click.on(BUTTON_REGISTRAR)
        );

    }

    public static Performable enLaPaginaDeMagneto(DataTable datos){
        return instrumented(Registrarse.class,datos);
    }
}
