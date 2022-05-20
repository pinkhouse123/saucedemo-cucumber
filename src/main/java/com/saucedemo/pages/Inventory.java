package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Inventory extends Utility {
    private static final Logger log = Logger.getLogger(Inventory.class.getName());

    public Inventory() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement sortProduct;

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")
    List<WebElement> addToCartList;
    @CacheLookup
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement shoppingCart;


    public void clickOnAddToCart() {
        log.info("add to cat cheapest & costliest products ");
        addToCartList.get(0).click();
        addToCartList.get(addToCartList.size() - 1).click();
    }

    public void clickOnShoppingCart() {
        log.info("Click on shopping cart" + shoppingCart.getText());
        clickOnElement(shoppingCart);
    }

    public void setSortProductHighToLow() {
        log.info("Select price high to low" + sortProduct.getText());
        selectByVisibleTextFromDropDown(sortProduct, "Price (high to low)");
    }

}