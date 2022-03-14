package com.tevolvers.certification.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TextOf implements Question<String> {

    private Target target;

    public TextOf(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).answeredBy(actor);
    }

    public static TextOf the(Target target) {
        return new TextOf(target);
    }
}
