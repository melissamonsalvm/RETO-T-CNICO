package com.tevolvers.certification.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PhoneSection {
    public static final Target SAMSUNG_GALAXY_S6 = Target.the("select phone Samsung galaxy s6")
            .locatedBy("//a[contains (text(), 'Samsung galaxy s6')]");
    public static final Target IPHONE_6_32GB = Target.the("select phone Iphone 6 32gb")
            .locatedBy("//a[contains (text(), 'Iphone 6 32gb')]");
    public static final Target ADD_TO_CART_BTN = Target.the("select button add to cart")
            .locatedBy("//a[@class='btn btn-success btn-lg']");
}
