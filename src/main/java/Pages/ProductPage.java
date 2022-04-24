package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ProductPage extends PageFactory{
    private WebDriver driver;

    @FindBy(className = "title")
    WebElement productTittle;

    @FindBy(id = "react-burger-menu-btn")
    WebElement menuBar;

    @FindBy(id="logout_sidebar_link")
    WebElement logoutButton;
    public ProductPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public String getPageTittle(){
       return productTittle.getText();
    }

    public void clickMenuButton(){ menuBar.click();}
    public void clickLogutButton(){logoutButton.click();}


}
