package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;

    public void setUserNameField(String userName) {
        log.info("set email field" + userNameField.getText());
        sendTextToElement(userNameField, userName);
    }

    public void setPasswordField(String password) {
        log.info("set password field" + passwordField.getText());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        log.info("Click on login button" + loginButton.getText());
        clickOnElement(loginButton);
    }


}