package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageFactory {
    private WebDriver driver;

    @FindBy(id = "user-name")
    WebElement inputUser;
    @FindBy(id = "password")
    WebElement inputPassword;

    public LoginPage(WebDriver driver) {
      this.driver=driver;
      PageFactory.initElements(driver, this);

    }

    public void enterUserInfoData(String username){
        inputUser.sendKeys(username);
    }
    public void enterPassword(String passWord){
        inputPassword.sendKeys(passWord);
    }
}
