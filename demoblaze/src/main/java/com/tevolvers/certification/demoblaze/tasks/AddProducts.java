package com.tevolvers.certification.demoblaze.tasks;

import com.tevolvers.certification.demoblaze.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.w3c.dom.ls.LSOutput;

import static com.tevolvers.certification.demoblaze.userinterfaces.CartSection.*;
import static com.tevolvers.certification.demoblaze.userinterfaces.DemoblazeHomePage.*;
import static com.tevolvers.certification.demoblaze.userinterfaces.LaptopsSection.DELL_I7_8GB;
import static com.tevolvers.certification.demoblaze.userinterfaces.LaptopsSection.MACBOOK_PRO;
import static com.tevolvers.certification.demoblaze.userinterfaces.MonitorsSection.APPLE_MONITOR_24;
import static com.tevolvers.certification.demoblaze.userinterfaces.MonitorsSection.ASUS_FULL_HD;
import static com.tevolvers.certification.demoblaze.userinterfaces.PhoneSection.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AddProducts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PHONE_CATEGORY, isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(PHONE_CATEGORY),
                WaitUntil.the(SAMSUNG_GALAXY_S6, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(SAMSUNG_GALAXY_S6),
                Click.on(ADD_TO_CART_BTN),
                WaitUntil.the(HOME_BTN, isEnabled()).forNoMoreThan(20).seconds(),
                JavaScriptClick.on(HOME_BTN),
                Click.on(PHONE_CATEGORY),
                Click.on(IPHONE_6_32GB),
                Click.on(ADD_TO_CART_BTN),
                WaitUntil.the(HOME_BTN, isEnabled()).forNoMoreThan(20).seconds(),
                JavaScriptClick.on(HOME_BTN),
                Click.on(LAPTOPS_CATEGORY),
                WaitUntil.the(DELL_I7_8GB, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(DELL_I7_8GB),
                WaitUntil.the(ADD_TO_CART_BTN, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(ADD_TO_CART_BTN),
                WaitUntil.the(HOME_BTN, isEnabled()).forNoMoreThan(20).seconds(),
                JavaScriptClick.on(HOME_BTN),
                Click.on(LAPTOPS_CATEGORY),
                Click.on(MACBOOK_PRO),
                WaitUntil.the(ADD_TO_CART_BTN, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(ADD_TO_CART_BTN),
                WaitUntil.the(HOME_BTN, isEnabled()).forNoMoreThan(20).seconds(),
                JavaScriptClick.on(HOME_BTN),
                Click.on(MONITORS_CATEGORY),
                WaitUntil.the(APPLE_MONITOR_24, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(APPLE_MONITOR_24),
                WaitUntil.the(ADD_TO_CART_BTN, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(ADD_TO_CART_BTN),
                WaitUntil.the(HOME_BTN, isEnabled()).forNoMoreThan(20).seconds(),
                JavaScriptClick.on(HOME_BTN),
                Click.on(MONITORS_CATEGORY),
                Click.on(ASUS_FULL_HD),
                WaitUntil.the(ADD_TO_CART_BTN, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(ADD_TO_CART_BTN),
                WaitUntil.the(CART_BTN, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(CART_BTN)
        );
    }
    public static AddProducts chooseProduct(){
        return Tasks.instrumented(AddProducts.class);
    }
}
