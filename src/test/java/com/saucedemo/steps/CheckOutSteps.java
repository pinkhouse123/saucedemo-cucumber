package com.saucedemo.steps;

import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckOutPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class CheckOutSteps {
    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new CartPage().clickOnCheckOutButton();
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String firstName, String lastName, String postalCode) {
        new CheckOutPage().setFirstNameField("Umi");
        new CheckOutPage().setLastNameField("Patel");
        new CheckOutPage().setPostalCode("HA9Y6T");
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutPage().clickOnContinueButton();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckOutPage().clickOnFinishButton();
    }

    @Then("^I should be able to see message 'Thank you for your order'$")
    public void iShouldBeAbleToSeeMessageThankYouForYourOrder() {
        Assert.assertEquals("Order is not placed", "THANK YOU FOR YOUR ORDER", new CheckOutPage().getThankYouText());
    }
}