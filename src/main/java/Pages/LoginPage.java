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

    @FindBy(id="login-button")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    WebElement textWaring;

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

    public void clickLoginButton(){
        loginButton.click();
    }
    public String getWarningMessage(){
        return textWaring.getText();
    }
    public  String getLoginText(){ return loginButton.getAttribute("value");}
}
