package com.saucedemo.steps;

import com.saucedemo.pages.Inventory;
import cucumber.api.java.en.And;

public class InventorySteps {

    @And("^add product$")
    public void addProduct() {
        new Inventory().clickOnAddToCart();
    }

    @And("^I filter the products by Price 'high to low'$")
    public void iFilterTheProductsByPriceHighToLow() {
        new Inventory().setSortProductHighToLow();
    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new Inventory().clickOnAddToCart();

    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new Inventory().clickOnShoppingCart();
    }
}