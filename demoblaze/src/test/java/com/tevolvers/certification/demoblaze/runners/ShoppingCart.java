package com.tevolvers.certification.demoblaze.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/shopping_cart.feature",
        glue = "com.tevolvers.certification.demoblaze.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class ShoppingCart {
}
