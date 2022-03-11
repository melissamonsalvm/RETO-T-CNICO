package com.tevolvers.certification.demoblaze.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoblazeHomePage extends PageObject {

    public static final Target PHONE_CATEGORY = Target.the("select phone category")
            .locatedBy("//a[contains (text(), 'Phones')]");
    public static final Target LAPTOPS_CATEGORY = Target.the("select laptops category")
            .locatedBy("//a[contains (text(), 'Laptops')]");
    public static final Target MONITORS_CATEGORY = Target.the("select phone category")
            .locatedBy("//a[contains (text(), 'Monitors')]");
    public static final Target HOME_BTN = Target.the("select home button")
            .locatedBy("//a[contains (text(), 'Home ')]");
    public static final Target CART_BTN = Target.the("select cart button")
            .located(By.id("cartur"));

}
