package com.tevolvers.certification.demoblaze.tasks;

import com.tevolvers.certification.demoblaze.interactions.AddUpPrices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.tevolvers.certification.demoblaze.userinterfaces.DemoblazeHomePage.*;
import static com.tevolvers.certification.demoblaze.utils.Constants.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class AddProducts implements Task {
    private String waitHomeBtn = "wait for element";
    private String waitCartBtn = "wait for element";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(waitHomeBtn,
                WaitUntil.the(SELECT.of(HOME_BTN), isEnabled()).forNoMoreThan(30).seconds()
        );
        actor.remember(waitCartBtn,
                WaitUntil.the(CART_BTN, isEnabled()).forNoMoreThan(30).seconds()
        );
        actor.attemptsTo(
                Click.on(SELECT.of(PHONES_CATEGORY)),
                Click.on(SELECT.of(SAMSUNG_GALAXY_S6)),
                Click.on(ADD_TO_CART_BTN),
                actor.recall(waitHomeBtn),
                JavaScriptClick.on(SELECT.of(HOME_BTN)),
                Click.on(SELECT.of(PHONES_CATEGORY)),
                Click.on(SELECT.of(IPHONE_6_32GB)),
                Click.on(ADD_TO_CART_BTN),
                actor.recall(waitHomeBtn),
                JavaScriptClick.on(SELECT.of(HOME_BTN)),
                Click.on(SELECT.of(LAPTOPS_CATEGORY)),
                Click.on(SELECT.of(DELL_I7_8GB)),
                Click.on(ADD_TO_CART_BTN),
                actor.recall(waitHomeBtn),
                JavaScriptClick.on(SELECT.of(HOME_BTN)),
                Click.on(SELECT.of(LAPTOPS_CATEGORY)),
                Click.on(SELECT.of(MACBOOK_PRO)),
                Click.on(ADD_TO_CART_BTN),
                actor.recall(waitHomeBtn),
                JavaScriptClick.on(SELECT.of(HOME_BTN)),
                Click.on(SELECT.of(MONITORS_CATEGORY)),
                Click.on(SELECT.of(APPLE_MONITOR_24)),
                Click.on(ADD_TO_CART_BTN),
                actor.recall(waitHomeBtn),
                JavaScriptClick.on(SELECT.of(HOME_BTN)),
                Click.on(SELECT.of(MONITORS_CATEGORY)),
                Click.on(SELECT.of(ASUS_FULL_HD)),
                Click.on(ADD_TO_CART_BTN),
                actor.recall(waitCartBtn),
                JavaScriptClick.on(CART_BTN),
                AddUpPrices.sumOfProduct()
        );
    }

    public static AddProducts chooseProduct() {
        return Tasks.instrumented(AddProducts.class);
    }
}
