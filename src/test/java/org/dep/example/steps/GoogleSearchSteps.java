package org.dep.example.steps;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.dep.example.config.PageObjectManager;
import org.dep.example.pages.GoogleResultPage;

public class GoogleSearchSteps {

    @Given("the user on the Google search page")
    public void navigateToGoogleSearchPage() {
        System.out.println("First given method");
        PageObjectManager.getGoogleSearchPage().open();
    }

    @When("the user searches for {string}")
    public void searchFor(String string) {
        GoogleResultPage resultPage = PageObjectManager.getGoogleSearchPage().searchFor(string);
        PageObjectManager.setGoogleResultPage(resultPage);
    }

    @Then("the page title starts with {string}")
    public void verifyPageTitle(String titleStartsWith) {
        String actualPageTitle = PageObjectManager.getGoogleResultPage().getPageTitle();
        assertThat(actualPageTitle).startsWith(titleStartsWith);

    }
}
