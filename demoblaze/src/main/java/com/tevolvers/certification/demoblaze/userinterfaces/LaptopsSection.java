package com.tevolvers.certification.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LaptopsSection {

    public static final Target DELL_I7_8GB = Target.the("select laptop Dell i7 8gb")
            .locatedBy("//a[contains (text(), 'Dell i7 8gb')]");
    public static final Target MACBOOK_PRO = Target.the("select laptop MacBook Pro")
            .locatedBy("//a[contains (text(), 'MacBook Pro')]");
}
