package com.wiz.stepdefinitions;

import Pages.BasePage;
import Pages.LoginPage;
import Pages.ProductPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class StepCaseOne extends BasePage {

    private LoginPage login;
    private ProductPage product;
    @Before()
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver","/home/nana/Descargas/chromedriver");
        initialize();

    }

    @Given("juan navigates to https:\\/\\/www.saucedemo.com\\/")
    public void juan_navigates_to_https_www_saucedemo_com() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.saucedemo.com/");
        login=new LoginPage(driver);
        product=new ProductPage(driver);
    }
    @When("he enter the correct info")
    public void he_enter_the_correct_info() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        login.enterUserInfoData("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLoginButton();
        Thread.sleep(3000);
    }
    @Then("should see the product page")
    public void should_see_the_product_page() throws InterruptedException {
        Assert.assertEquals("products",product.getPageTittle().toLowerCase().trim());
    }

    @After
    public void quit(){
        driver.quit();
    }
}
