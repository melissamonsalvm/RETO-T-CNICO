package com.tevolvers.certification.demoblaze.tasks;

import com.tevolvers.certification.demoblaze.interactions.Enabled;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static com.tevolvers.certification.demoblaze.userinterfaces.DemoblazeHomePage.*;
import static com.tevolvers.certification.demoblaze.userinterfaces.LaptopsSection.DELL_I7_8GB;
import static com.tevolvers.certification.demoblaze.userinterfaces.LaptopsSection.MACBOOK_PRO;
import static com.tevolvers.certification.demoblaze.userinterfaces.MonitorsSection.APPLE_MONITOR_24;
import static com.tevolvers.certification.demoblaze.userinterfaces.MonitorsSection.ASUS_FULL_HD;
import static com.tevolvers.certification.demoblaze.userinterfaces.PhoneSection.*;

public class AddProducts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enabled.with(PHONE_CATEGORY),
                Click.on(PHONE_CATEGORY),
                Enabled.with(SAMSUNG_GALAXY_S6),
                Click.on(SAMSUNG_GALAXY_S6),
                Click.on(ADD_TO_CART_BTN),
                Enabled.with(HOME_BTN),
                JavaScriptClick.on(HOME_BTN),
                Click.on(PHONE_CATEGORY),
                Click.on(IPHONE_6_32GB),
                Click.on(ADD_TO_CART_BTN),
                Enabled.with(HOME_BTN),
                JavaScriptClick.on(HOME_BTN),
                Click.on(LAPTOPS_CATEGORY),
                Enabled.with(DELL_I7_8GB),
                Click.on(DELL_I7_8GB),
                Enabled.with(ADD_TO_CART_BTN),
                Click.on(ADD_TO_CART_BTN),
                Enabled.with(HOME_BTN),
                JavaScriptClick.on(HOME_BTN),
                Click.on(LAPTOPS_CATEGORY),
                Click.on(MACBOOK_PRO),
                Enabled.with(ADD_TO_CART_BTN),
                Click.on(ADD_TO_CART_BTN),
                Enabled.with(HOME_BTN),
                JavaScriptClick.on(HOME_BTN),
                Click.on(MONITORS_CATEGORY),
                Enabled.with(APPLE_MONITOR_24),
                Click.on(APPLE_MONITOR_24),
                Enabled.with(ADD_TO_CART_BTN),
                Click.on(ADD_TO_CART_BTN),
                Enabled.with(HOME_BTN),
                JavaScriptClick.on(HOME_BTN),
                Click.on(MONITORS_CATEGORY),
                Click.on(ASUS_FULL_HD),
                Enabled.with(ADD_TO_CART_BTN),
                Click.on(ADD_TO_CART_BTN),
                Enabled.with(CART_BTN),
                Click.on(CART_BTN)
        );
    }

    public static AddProducts chooseProduct() {
        return Tasks.instrumented(AddProducts.class);
    }
}
