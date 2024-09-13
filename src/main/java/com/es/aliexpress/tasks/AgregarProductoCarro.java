package com.es.aliexpress.tasks;

import com.es.aliexpress.utils.CambioPestaña;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static com.es.aliexpress.ui.AgregarProductoCarro.BOTON_CANTIDAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProductoCarro implements Task {

    CambioPestaña cambioPestaña = new CambioPestaña();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(com.es.aliexpress.ui.AgregarProductoCarro.CUADRO_PUBLICIDAD),
                Click.on(com.es.aliexpress.ui.AgregarProductoCarro.BARRA_BUSQUEDA),
                Enter.theValue("TV").into(com.es.aliexpress.ui.AgregarProductoCarro.BARRA_BUSQUEDA).thenHit(Keys.ENTER),
                Click.on(com.es.aliexpress.ui.AgregarProductoCarro.SELECCION_PRODUCTO),
                CambioNuevaPestaña.switchToNewTab(),
                Scroll.to(BOTON_CANTIDAD),
                Click.on(BOTON_CANTIDAD),
                Click.on(BOTON_CANTIDAD),
                Click.on(com.es.aliexpress.ui.AgregarProductoCarro.BOTON_AGREGARALCARRO),
                Click.on(com.es.aliexpress.ui.AgregarProductoCarro.BOTON_IRCESTA)


        );


    }



    public static Performable AgregarProductoCarro(){
        return instrumented(AgregarProductoCarro.class);
    }
}
