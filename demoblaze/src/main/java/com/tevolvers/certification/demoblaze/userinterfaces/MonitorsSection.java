package com.tevolvers.certification.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MonitorsSection {

    public static final Target APPLE_MONITOR_24 = Target.the("select monitor Apple monitor 24")
            .locatedBy("//a[contains (text(), 'Apple monitor 24')]");
    public static final Target ASUS_FULL_HD = Target.the("select monitor ASUS Full HD")
            .locatedBy("//a[contains (text(), 'ASUS Full HD')]");
}
