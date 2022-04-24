package com.wiz.stepdefinitions;

import Pages.BasePage;
import Pages.LoginPage;
import Pages.ProductPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
public class StepCaseThree extends BasePage {

    private LoginPage login;
    private ProductPage product;
    @Before()
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver","/home/nana/Descargas/chromedriver");
        initialize();

    }


    @Given("carlos navigates to https:\\/\\/www.saucedemo.com\\/")
    public void carlos_navigates_to_https_www_saucedemo_com() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.saucedemo.com/");
        login=new LoginPage(driver);
        product=new ProductPage(driver);
    }
    @Given("he log into the page")
    public void he_log_into_the_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        login.enterUserInfoData("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLoginButton();
        Thread.sleep(3000);
    }
    @When("he logout")
    public void he_logout() {
        // Write code here that turns the phrase above into concrete actions
        product.clickMenuButton();
        product.clickLogutButton();

    }
    @Then("the page shoult not be the product page")
    public void the_page_shoult_not_be_the_product_page() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(login.getLoginText().toLowerCase().trim(),"login");
    }


    @After
    public void quit(){
        driver.quit();
    }
}
