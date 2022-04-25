package com.wiz.stepdefinitions;

import Pages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class StepCaseSeven extends BasePage {

    private LoginPage login;
    private ProductPage product;
    private ShoppingPage cart;
    private SpecificProductPage onlyOne;
    @Before()
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver","/home/nana/Descargas/chromedriver");
        initialize();
    }


    @Given("nanami navigates to https:\\/\\/www.saucedemo.com\\/")
    public void nanami_navigates_to_https_www_saucedemo_com() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.saucedemo.com/");
        login=new LoginPage(driver);
        product=new ProductPage(driver);
        cart=new ShoppingPage(driver);
        onlyOne=new SpecificProductPage(driver);
    }
    @Given("log into the products page")
    public void log_into_the_products_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        login.enterUserInfoData("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLoginButton();
        Thread.sleep(3000);
    }
    @When("add one specific item")
    public void add_one_specific_item() {
        // Write code here that turns the phrase above into concrete actions
        product.clickSpecificElement();
        onlyOne.clickAdd();
        product.clickShoppingCart();
    }
    @Then("the specific product should be added into the cart")
    public void the_specific_product_should_be_added_into_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(cart.getFirstElementName().trim(),"Sauce Labs Onesie");
    }

    @After
    public void quit(){
        driver.quit();
    }
}
