package com.wiz.stepdefinitions;

import Pages.BasePage;
import Pages.LoginPage;
import Pages.ProductPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
public class StepCaseTwo extends BasePage{

    private LoginPage login;
    private ProductPage product;
    @Before()
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver","/home/nana/Descargas/chromedriver");
        initialize();

    }

    @Given("ana navigates to https:\\/\\/www.saucedemo.com\\/")
    public void ana_navigates_to_https_www_saucedemo_com() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.saucedemo.com/");
        login=new LoginPage(driver);
        product=new ProductPage(driver);
    }

    @When("he enter the incorrect info")
    public void he_enter_the_incorrect_info() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        login.enterUserInfoData("uno");
        login.enterPassword("dos");
        login.clickLoginButton();
        Thread.sleep(3000);
    }

    @Then("should see info message")
    public void should_see_info_message() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(login.getWarningMessage().trim(),"Epic sadface: Username and password do not match any user in this service");
    }


    @After
    public void quit(){
        driver.quit();
    }

}
