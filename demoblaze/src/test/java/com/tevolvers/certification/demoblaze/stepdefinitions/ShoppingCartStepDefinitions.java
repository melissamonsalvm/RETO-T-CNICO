package com.tevolvers.certification.demoblaze.stepdefinitions;

import com.tevolvers.certification.demoblaze.tasks.AddProducts;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static com.tevolvers.certification.demoblaze.interactions.AddUpPrices.getPriceTotal;
import static com.tevolvers.certification.demoblaze.userinterfaces.CartSection.TOTAL_PRICE;
import static com.tevolvers.certification.demoblaze.utils.Constants.ACTOR;
import static com.tevolvers.certification.demoblaze.utils.Constants.DEMOBLAZE_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ShoppingCartStepDefinitions {

    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;

    @Before
    public void setTheStage() {
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new Cast());
        OnStage.theActorCalled(ACTOR);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(DEMOBLAZE_URL));
    }

    @When("Selects products from each category to add it to shopping cart")
    public void selectsProdutsFromEachCategoryToAddItToShoppingCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProducts.chooseProduct());
    }

    @Then("the products is displayed in shopping cart with the total price of the products")
    public void theProductsIsDisplayedInShoppingCartWithTheTotalPriceOfTheProducts() {
        OnStage.theActorInTheSpotlight().should(seeThat(Text.of(TOTAL_PRICE), equalTo(getPriceTotal())));
    }
}
