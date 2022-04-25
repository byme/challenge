package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SpecificProductPage extends PageFactory{
    WebDriver driver;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement addButton;

    public SpecificProductPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public void clickAdd(){addButton.click();}
}
