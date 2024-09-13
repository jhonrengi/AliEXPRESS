package com.es.aliexpress.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObtenerPrecio {

    public static final Target PRECIO_PRODUCTO = Target.the("Precio del producto antes de ir a la cesta")
            .located(By.xpath("//span[@class='price--currentPriceText--V8_y_b5 pdp-comp-price-current product-price-value']"));

    public static final Target PRECIO_PRODUCTO_FINAL = Target.the("Precio del producto en la cesta")
            .located(By.xpath("//span[@data-spm-anchor-id=\"a2g0o.cart.0.i0.1c577a9dbs0OY0\"]"));




}
