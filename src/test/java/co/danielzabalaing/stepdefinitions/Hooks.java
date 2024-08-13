package co.danielzabalaing.stepdefinitions;

import co.danielzabalaing.interactions.Abrir;
import co.danielzabalaing.interactions.Maximizar;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.fluentlenium.core.annotation.Page;
import org.junit.Before;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Hooks {


    @Given("que {word} esta en la pagina de magneto")
    public void queElUsuarioEstaEnLaPaginaDeMagneto(String nombre) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(nombre).wasAbleTo(
                Abrir.elNavegador(),
                Maximizar.elNavegador()
        );
    }
}
