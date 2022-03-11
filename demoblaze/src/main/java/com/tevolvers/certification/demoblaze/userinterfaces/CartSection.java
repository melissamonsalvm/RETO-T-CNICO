package com.tevolvers.certification.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartSection {
    public static final Target PRICE = Target.the("get price product")
            .locatedBy("(//tr[@class='success']//td)[3]");
    public static final Target TOTAL_PRICE = Target.the("get total price product")
            .located(By.id("totalp"));
}
