package com.takealot.steps;

import com.takealot.pages.HomePage;
import com.takealot.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class RegisterStepDef {
    @Given("^I am on homepage of tekealot website$")
    public void iAmOnHomepageOfTekealotWebsite() {
        new HomePage().acceptCookies();
    }

    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new  HomePage().clickOnRegisterLink();
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String name)  {
        new RegisterPage().enterFirstName(name);

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String surname)  {
        new RegisterPage().enterLastName(surname);

    }

    @And("^I enter email and retype email$")
    public void iEnterEmailAndRetypeEmail() {
        new RegisterPage().enterEmail(7);
    }

    @And("^I enter password \"([^\"]*)\" and retype password$")
    public void iEnterPasswordAndRetypePassword(String arg0)  {
        new RegisterPage().enterPassWord(arg0);

    }

    @And("^I enter mobile number$")
    public void iEnterMobileNumber() {
        new RegisterPage().mobileNumber(10);
    }

    @And("^I tick on fashion check box$")
    public void iTickOnFashionCheckBox() {
        new RegisterPage().clickOnFashionCheckBox();
    }

    @And("^I tick on music check box$")
    public void iTickOnMusicCheckBox() {
        new RegisterPage().clickOnMusicCheckBox();
    }

    @And("^I tick on toys check box$")
    public void iTickOnToysCheckBox() {
        new RegisterPage().clickOnToysCheckBox();
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }


    @Then("^I Should see <\"([^\"]*)\">message on popup$")
    public void iShouldSeeMessageOnPopup(String expected)  {
        String actualMessage=new RegisterPage().welcomeMessageDisplay();
        Assert.assertEquals(actualMessage,expected);
    }
}
