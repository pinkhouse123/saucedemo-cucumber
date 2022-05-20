package com.saucedemo.steps;

import com.saucedemo.pages.Inventory;
import com.saucedemo.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.ro.Si;

public class LoginSteps {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String username, String password) throws Throwable {
        new SignInPage().setUserNameField("standard_user");
        new SignInPage().setPasswordField("secret_sauce");
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new SignInPage().clickOnLoginButton();
    }




}