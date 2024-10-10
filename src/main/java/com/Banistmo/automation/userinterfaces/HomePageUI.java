package com.Banistmo.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageUI {
    public static final Target CLICK_BUTTON_COOKIES = Target.the("Boton de cookies")
            .located(By.id("btn-aceptar-cookies"));
    public static final Target CLICK_BUTTON_APRENDER = Target.the("Boton de Aprender")
            .located(By.linkText("Aprender es fácil"));
    public static final Target CLICK_BUTTON_LEGALES = Target.the("Boton de legal")
            .located(By.xpath("(//a[text()='Descubre más'])[5]"));
    public static final Target CLICK_BUTTON_FACT = Target.the("Boton de Fatca y CRS")
            .located(By.xpath("(//a[text()='Conoce más'])[2]"));
    public static final Target CLICK_BUTTON_DOWNLOAD_PDF = Target.the("Boton de descargar")
            .located(By.xpath("(//img[@alt='Descargar PDF'])[3]"));
}