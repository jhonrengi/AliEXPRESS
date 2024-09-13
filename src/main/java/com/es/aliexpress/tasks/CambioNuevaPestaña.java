package com.es.aliexpress.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import java.util.Set;

import static net.serenitybdd.core.Serenity.getDriver;

public class CambioNuevaPestaña implements Task {
    public CambioNuevaPestaña (){}

    public static CambioNuevaPestaña switchToNewTab(){
        return Instrumented.instanceOf(CambioNuevaPestaña.class).withProperties();
    }

    @Step("{0} Switching to new Window")
    public <T extends Actor> void performAs(T actor) {
        String currentWindow = getDriver().getWindowHandle();
        Set<String> allWindows = getDriver().getWindowHandles();
        for(String window : allWindows){
            if(!window.equals(currentWindow))
            {
                getDriver().switchTo().window(window);
                break;
            }
        }
    }
}
