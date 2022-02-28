package com.takealot.steps;

import com.takealot.pages.AddToCart;
import com.takealot.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SearchStepDef {



    @When("^I enter \"([^\"]*)\" in search field$")
    public void iEnterInSearchField(String item)  {
        new HomePage().enterOnSearchField(item);
        new HomePage().clickOnSearchIcon();
        new HomePage().sendTextOnBrandSearchField();
        new HomePage().tickTheGarmin();

    }


    @Then("^I should verify that watches are added successfully on my basket$")
    public void iShouldVerifyThatWatchesAreAddedSuccessfullyOnMyBasket() {
        new HomePage().clickOnBasketTab();
    }
    @And("^I click on here link on popup$")
    public void iClickOnHereLinkOnPopup() {
        new HomePage().clickOnHereLink();
    }

    @And("^I select Garmin  Watch Band <\"([^\"]*)\">$")
    public void iSelectGarminWatchBand(String arg0)  {
        new HomePage().selectGarminProduct(arg0);
    }

    @And("^I select  Garmin watch <\"([^\"]*)\"> and add it to my cart$")
    public void iSelectGarminWatchAndAddItToMyCart(String arg0)  {
        new HomePage().selectGarminProduct(arg0);
        new AddToCart().addToCart();
    }

    @And("^I select Garmin  Watch Band <\"([^\"]*)\">  and add it to my cart$")
    public void iSelectGarminWatchBandAndAddItToMyCart(String arg0) {
        new HomePage().selectGarminProduct(arg0);
        new AddToCart().addToCart();
    }



    @And("^verify \"([^\"]*)\" shows in cart$")
    public void verifyShowsInCart(String arg0)  {
       String actualText = new HomePage().getTotlNoOfItem();
        Assert.assertEquals(actualText,arg0);
    }
}
