package com.tevolvers.certification.demoblaze.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.questions.Text;

import static com.tevolvers.certification.demoblaze.userinterfaces.CartSection.PRODUCT_PRICE;

public class AddUpPrices implements Interaction {

    public int sumTotalProducts = 0;
    public static String priceTotal;

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 1; i < 7; i++) {
            actor.attemptsTo(
                    Enabled.with(PRODUCT_PRICE.of(String.valueOf(i)))
            );
            String label = Text.of(PRODUCT_PRICE.of(String.valueOf(i)).getCssOrXPathSelector()).answeredBy(actor).toString();
            sumTotalProducts += Integer.parseInt(label);
            System.out.println("sum " + sumTotalProducts);
        }
        priceTotal = String.valueOf(sumTotalProducts);
    }

    public static AddUpPrices sumOfProduct() {
        return new AddUpPrices();
    }
}
