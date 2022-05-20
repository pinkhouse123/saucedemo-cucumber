package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postalCodeField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement thanksText;

    public void setFirstNameField(String firstName) {
        log.info("Set first Name" + firstName);
        sendTextToElement(firstNameField, firstName);
    }

    public void setLastNameField(String lastName) {
        log.info("Set last Name" + lastName);
        sendTextToElement(lastNameField, lastName);
    }

    public void setPostalCode(String postalCode) {
        log.info("Set postal code " + postalCode);
        sendTextToElement(postalCodeField, postalCode);
    }

    public void clickOnContinueButton() {
        log.info("Click On Continue button" + continueButton.getText());
        clickOnElement(continueButton);
    }

    public void clickOnFinishButton() {
        log.info("Click on finish button" + finishButton.getText());
        clickOnElement(finishButton);
    }

    public String getThankYouText() {
        log.info("Get text" + thanksText.getText());
        return getTextFromElement(thanksText);
    }
}