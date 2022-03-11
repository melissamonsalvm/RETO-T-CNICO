package com.tevolvers.certification.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.tevolvers.certification.demoblaze.userinterfaces.CartSection.TOTAL_PRICE;
import static com.tevolvers.certification.demoblaze.utils.Constants.SUM_TOTAL_VALUE;

public class ValueComparison implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return SUM_TOTAL_VALUE.equals(Text.of(TOTAL_PRICE).answeredBy(actor));
    }

    public static ValueComparison totalValue() {
        return new ValueComparison();
    }
}
