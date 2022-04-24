package com.wiz.stepdefinitions;
import Pages.BasePage;
import Pages.LoginPage;
import Pages.ProductPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
public class StepCaseFive extends BasePage{
    private LoginPage login;
    private ProductPage product;
    @Before()
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver","/home/nana/Descargas/chromedriver");
        initialize();

    }

    @Given("nicolas navigates to https:\\/\\/www.saucedemo.com\\/")
    public void riven_navigates_to_https_www_saucedemo_com() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        login=new LoginPage(driver);
        product=new ProductPage(driver);


    }
    @Given("log into the main page")
    public void log_into_the_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        login.enterUserInfoData("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLoginButton();
        Thread.sleep(3000);
    }
    @When("sort for the hightes prices")
    public void sort_for_the_hightes_prices() {
        // Write code here that turns the phrase above into concrete actions
        product.clickFilterHigh();
    }
    @Then("the products should be organize by the highest")
    public void the_products_should_be_organize_by_the_highest() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(product.getFirstNameProducto(),"Sauce Labs Fleece Jacket");
        Thread.sleep(3000);
    }

    @After
    public void quit(){
        driver.quit();
    }
}
