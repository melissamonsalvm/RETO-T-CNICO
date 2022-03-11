package com.tevolvers.certification.demoblaze.interactions;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Enabled implements Interaction {

    Target target;

    public Enabled(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(target, isEnabled()).forNoMoreThan(20).seconds()
        );
    }

    public static Enabled with(Target target) {
        return new Enabled(target);
    }
}
