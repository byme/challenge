package com.wiz.stepdefinitions;
import Pages.BasePage;
import Pages.LoginPage;
import Pages.ProductPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
public class StepCaseFour extends BasePage{
    private LoginPage login;
    private ProductPage product;
    @Before()
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver","/home/nana/Descargas/chromedriver");
        initialize();

    }

    @Given("mitchell navigates to https:\\/\\/www.saucedemo.com\\/")
    public void mitchell_navigates_to_https_www_saucedemo_com() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.saucedemo.com/");
        login=new LoginPage(driver);
        product=new ProductPage(driver);
    }
    @Given("log into the page")
    public void log_into_the_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        login.enterUserInfoData("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLoginButton();
        Thread.sleep(3000);
    }
    @When("sort for the low prices")
    public void sort_for_the_low_prices() {
        // Write code here that turns the phrase above into concrete actions
        product.clickFilterLow();
    }
    @Then("the products should be organize by the lowest")
    public void the_products_should_be_organize_by_the_lowest() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(product.getFirstNameProducto(),"Sauce Labs Onesie");
        Thread.sleep(3000);
    }

    @After
    public void quit(){
        driver.quit();
    }
}
