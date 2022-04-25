package com.wiz.stepdefinitions;


import Pages.BasePage;
import Pages.LoginPage;
import Pages.ProductPage;
import Pages.ShoppingPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class StepCaseSix extends BasePage{
    private LoginPage login;
    private ProductPage product;
    private ShoppingPage cart;
    @Before()
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver","/home/nana/Descargas/chromedriver");
        initialize();

    }

    @Given("ramiro navigates to https:\\/\\/www.saucedemo.com\\/")
    public void pedro_navigates_to_https_www_saucedemo_com() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.saucedemo.com/");
        login=new LoginPage(driver);
        product=new ProductPage(driver);
        cart=new ShoppingPage(driver);
    }
    @Given("log into the shopping page")
    public void log_into_the_shopping_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        login.enterUserInfoData("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLoginButton();
        Thread.sleep(3000);
    }
    @When("add several items")
    public void add_several_items() {
        // Write code here that turns the phrase above into concrete actions
        product.clickAdd(1);
        product.clickAdd(2);
    }
    @Then("the products should be added into the cart")
    public void the_products_should_be_added_into_the_cart() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        product.clickShoppingCart();
        System.out.println(cart.getFirstElementName());

        System.out.println(cart.getSecondElementName());
        Assert.assertEquals(cart.getFirstElementName(),"Sauce Labs Backpack");
        Assert.assertEquals(cart.getSecondElementName(),"Sauce Labs Bike Light");
        Thread.sleep(10000);
    }


    @After
    public void quit(){
        driver.quit();
    }
}
