package co.danielzabalaing.stepdefinitions;

import co.danielzabalaing.exceptions.OrdenDeCompraNoRegistrada;
import co.danielzabalaing.interactions.Maximizar;
import co.danielzabalaing.questions.Orden;
import co.danielzabalaing.tasks.FillShippingAdress;
import co.danielzabalaing.tasks.Registrar;
import co.danielzabalaing.tasks.SeleccionariTems;
import co.danielzabalaing.tasks.ValidarCostoPedido;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static co.danielzabalaing.exceptions.OrdenDeCompraNoRegistrada.MENSAJE_ERROR_CREACION_ORDEN_COMPRA;
import static co.danielzabalaing.userinterfaces.CheckoutPage.BUTTON_PROCED_CHECKOUT;
import static co.danielzabalaing.userinterfaces.HomePage.LINK_REGISTRO;
import static co.danielzabalaing.userinterfaces.MyAccountPage.BUTTON_WHAT_IS_NEW;
import static co.danielzabalaing.userinterfaces.WhatIsNewPage.BUTTON_SHOP_NEW_YOGA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MagnetoCompraStepDefinitions {

    @Given("que {word} esta en la pagina de magneto")
    public void queElUsuarioEstaEnLaPaginaDeMagneto(String nombre) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(nombre).wasAbleTo(
                Open.url("https://magento.softwaretestingboard.com/"),
                Maximizar.elNavegador()
        );
    }
    @Given("se registra en la tienda virtual")
    public void elUsuarioSeRegistra(DataTable credenciales) {
        // Write code here that turns the phrase above into concrete actions
        withCurrentActor();
        theActorInTheSpotlight().attemptsTo(
                Click.on(LINK_REGISTRO),
                Registrar.unUsuarioNuevo(credenciales)
        );
    }

    @When("selecciona el producto y los detalles del producto")
    public void seleccionaElProductoYLosDetallesDelProducto(DataTable detalles) {
        // Write code here that turns the phrase above into concrete actions
        withCurrentActor();
        theActorInTheSpotlight().attemptsTo(
                Click.on(BUTTON_WHAT_IS_NEW),
                Click.on(BUTTON_SHOP_NEW_YOGA),
                SeleccionariTems.iTemsConDetalles(detalles),
                Click.on(BUTTON_PROCED_CHECKOUT)

        );
    }
    @When("el usuario valida su compra y agrega los detalles de pago")
    public void elUsuarioValidaSuCompraYAgregaLosDetallesDePago(DataTable datos) {
        withCurrentActor();
        theActorInTheSpotlight().attemptsTo(
                FillShippingAdress.detallesEntrega(datos),
                ValidarCostoPedido.detallesPedido()
        );
    }
    @Then("el deberia de ver que su compra fue realizada de manera exitosa")
    public void elDeberiaDeVerQueSuCompraFueRealizadaDeManeraExitosa() {
       theActorInTheSpotlight().should(seeThat(Orden.CreadaConExito()).orComplainWith(OrdenDeCompraNoRegistrada.class,MENSAJE_ERROR_CREACION_ORDEN_COMPRA));
    }

}
