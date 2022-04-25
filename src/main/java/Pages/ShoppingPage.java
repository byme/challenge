package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingPage extends PageFactory{
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div\n")
    WebElement firstElementName;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[1]/div[4]/div[2]/a/div\n")
    WebElement secondElementName;

    public ShoppingPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public String getFirstElementName(){return firstElementName.getText();}
    public String getSecondElementName(){return secondElementName.getText();}


}
