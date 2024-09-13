package com.es.aliexpress.questions;

import com.es.aliexpress.ui.ObtenerPrecio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionPrecio implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        String productoNombre = ObtenerPrecio.PRECIO_PRODUCTO.getName();
        String productNombreCarro = ObtenerPrecio.PRECIO_PRODUCTO_FINAL.getName();

        return productoNombre.equals(productNombreCarro);
    }

    public static ValidacionPrecio precio(){
        return new ValidacionPrecio() ;
    }
}
