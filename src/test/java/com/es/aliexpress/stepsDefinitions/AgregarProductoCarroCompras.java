package com.es.aliexpress.stepsDefinitions;

import com.es.aliexpress.questions.ValidacionPrecio;
import com.es.aliexpress.tasks.AgregarProductoCarro;

import com.es.aliexpress.utils.CambioPestaña;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AgregarProductoCarroCompras {



    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Dado("que el usuario ingresa a la pagina es.aliexpress.com")
    public void queElUsuarioIngresaALaPaginaEsAliexpressCom() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://es.aliexpress.com/")
        );
    }
    @Cuando("el usuario busca un producto en la barra de busqueda, lo selecciona y luego se va al carro de compras")
    public void elUsuarioBuscaUnProductoEnLaBarraDeBusquedaLoSeleccionaYLuegoSeVaAlCarroDeCompras() {
        theActorInTheSpotlight().attemptsTo(
                AgregarProductoCarro.AgregarProductoCarro()

        );
    }
    @Entonces("el usuaio puede validar el precio.")
    public void elUsuaioPuedeValidarElPrecio() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionPrecio.precio(), Matchers.equalTo(true)
                )
        );
    }
}
