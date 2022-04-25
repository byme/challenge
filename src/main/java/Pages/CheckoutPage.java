package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends PageFactory {
    WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstnameInput;

    @FindBy(id = "last-name")
    WebElement lastnameInput;

    @FindBy(id = "postal-code")
    WebElement postalInput;

    @FindBy(className = "title")
    WebElement successTittle;

    @FindBy(id = "continue")
    WebElement continueButton;

    @FindBy(id = "finish")
    WebElement finishButton;



    public CheckoutPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void sendDataFirstName(String name){
        firstnameInput.sendKeys(name);
    }

    public void sendDataLastName(String last){
        lastnameInput.sendKeys(last);
    }
    public void sendDataPostal(String postal){
        postalInput.sendKeys(postal);
    }

    public  void clickContinue(){
        continueButton.click();
    }

    public  void clickFinish(){
        finishButton.click();
    }

    public String getSuccessTittle(){
        return successTittle.getText().trim();
    }

}
