package com.Banistmo.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageUI {
    public static final Target CLICK_BUTTON_NEGOCIOS = Target.the("Boton de negocios")
            .located(By.xpath("(//a[text()='Negocios'])"));
    public static final Target CLICK_BUTTON_SOLUCIONES = Target.the("Boton de Soluciones no financieras")
            .located(By.xpath("(//div[text()='Soluciones no financieras'])"));
    public static final Target CLICK_BUTTON_HERRAMIENTAS = Target.the("Boton de Herramientas")
            .located(By.xpath("//h3[@class='submenu-title' and contains(text(), 'Herramientas')]"));
    public static final Target CLICK_BUTTON_GESTIONAR = Target.the("Boton de Gestionar")
            .located(By.xpath("(//a[text()='Gestionar las finanzas de mi negocio'])"));
    public static final Target CLICK_BUTTON_CONVERTIDOR = Target.the("Boton de Convertidor")
            .located(By.xpath("//p[@id='textCard' and normalize-space()='Con esta calculadora puedes convertir tasas de efectiva anual (EA) a mes vencida (MV) y a nominal anual mes vencida (NAMV).']"));
    public static final Target CLICK_BUTTON_CALCULAR = Target.the("Boton de Calcular")
            .located(By.xpath("//div[@id='btntoolUno']/a[@title='title' and text()='Calcular']"));
    public static final Target INPUT_TASA = Target.the("Grilla Tasa")
            .located(By.xpath("//input[@id='interes']"));
    public static final Target SELECT_SEMESTRAL = Target.the("Seleccionar Semestral")
            .located(By.xpath("//select[@id='periodicidad-deseada']"));
    public static final Target SELECT_ANUAL = Target.the("Seleccionar Anual")
            .located(By.xpath("//select[@id='capitalizacion']"));
    public static final Target RESPUESTA = Target.the("Resultado")
            .located(By.xpath("//h3[@id='respuesta']"));
}