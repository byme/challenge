package com.wiz.stepdefinitions;
import Pages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class StepClassEight extends BasePage{
    private LoginPage login;
    private ProductPage product;
    private ShoppingPage cart;
    private CheckoutPage check;

    @Before()
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver","/home/nana/Descargas/chromedriver");
        initialize();
    }
    @Given("haru wants to buy items in saucedemo page")
    public void haru_wants_to_buy_items_in_saucedemo_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.saucedemo.com/");
        login=new LoginPage(driver);
        product=new ProductPage(driver);
        cart=new ShoppingPage(driver);
        check=new CheckoutPage(driver);
        login.enterUserInfoData("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLoginButton();
        Thread.sleep(3000);
    }
    @When("enter the entire information")
    public void enter_the_entire_information() {
        // Write code here that turns the phrase above into concrete actions
        product.clickAdd(1);
        product.clickShoppingCart();
        cart.clickCheckoutButton();
        check.sendDataFirstName("ana");
        check.sendDataLastName("nayeon");
        check.sendDataPostal("044");
        check.clickContinue();
        check.clickFinish();
    }
    @Then("should see the success message")
    public void should_see_the_success_message() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(check.getSuccessTittle().toLowerCase(),"checkout: complete!");
        Thread.sleep(5000);
    }

    @After
    public void quit(){
        driver.quit();
    }
}
