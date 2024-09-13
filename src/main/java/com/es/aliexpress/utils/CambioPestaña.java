package com.es.aliexpress.utils;

import java.util.Set;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CambioPestaña {

    public CambioPestaña() {
    }

    public void cambioAVentanaEmergente(){

        Set<String> ventanas = getDriver().getWindowHandles();
        for (String ventana : ventanas) {
            if(!ventanas.equals(ventana)){
                getDriver().switchTo().window(ventana);
                break;
            }

        }
    }
}
