package com.es.aliexpress.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarProductoCarro {

    public static final Target CUADRO_PUBLICIDAD = Target.the("Cierra el cuadro emergente")
            .located(By.xpath("//img[@class='pop-close-btn']"));


    public static final Target BARRA_BUSQUEDA = Target.the("Barra de busqueda")
            .located(By.xpath("//input[@class='search--keyword--15P08Ji']"));


    public static final Target SELECCION_PRODUCTO = Target.the("Selecciona el prodcuto")
            .located(By.xpath("(//a[@class='multi--container--1UZxxHY cards--card--3PJxwBm search-card-item'])[10]"));



    public static final Target BOTON_CANTIDAD = Target.the("Cantidad del producto")
            .located(By.xpath("//span[@class='comet-icon comet-icon-add ']"));

    public static final Target BOTON_AGREGARALCARRO = Target.the("Cantidad del producto")
            .located(By.xpath("//button[@class='comet-v2-btn comet-v2-btn-large add-to-cart--addtocart--Qhoji3M comet-v2-btn-important']"));


    public static final Target BOTON_IRCESTA = Target.the("Ir a la cesta")
            .located(By.xpath("//a[@class='cart-summary-tocart']"));



}
