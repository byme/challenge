package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends PageFactory{
    private WebDriver driver;

    @FindBy(className = "title")
    WebElement productTittle;

    @FindBy(id = "react-burger-menu-btn")
    WebElement menuBar;

    @FindBy(id="logout_sidebar_link")
    WebElement logoutButton;

    @FindBy(className="product_sort_container")
    WebElement filterPrices;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")
    WebElement firtProductOnList;
    public ProductPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public String getPageTittle(){
       return productTittle.getText();
    }

    public void clickMenuButton(){ menuBar.click();}
    public void clickLogutButton(){logoutButton.click();}
    public void clickFilterLow(){
        Select prices = new Select(filterPrices);
        prices.selectByVisibleText("Price (low to high)");
        prices.selectByIndex(2);
    }
    public String getFirstNameProducto(){
        return firtProductOnList.getText();
    }

    public void clickFilterHigh(){
        Select prices = new Select(filterPrices);
        prices.selectByVisibleText("Price (high to low)");
        prices.selectByIndex(3);
    }


}
