package com.wiz.stepdefinitions;

import Pages.BasePage;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepCaseOne extends BasePage {

    @Before()
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver","/home/nana/Descargas/chromedriver");
        initialize();
    }

    @Given("juan navigates to https:\\/\\/www.saucedemo.com\\/")
    public void juan_navigates_to_https_www_saucedemo_com() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.saucedemo.com/");   }
    @When("he enter the correct info")
    public void he_enter_the_correct_info() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        LoginPage login=new LoginPage(driver);
        login.enterUserInfoData("standard_user");
        login.enterPassword("secret_sauce");
        Thread.sleep(3000);
    }
    @Then("should see the product page")
    public void should_see_the_product_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    }

    @After
    public void quit(){
        driver.quit();
    }
}
