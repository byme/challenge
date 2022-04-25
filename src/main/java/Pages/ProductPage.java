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

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]/a/div")
    WebElement secondProductOnList;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")
    WebElement firstAdd;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button")
    WebElement secondAdd;

    @FindBy(className = "shopping_cart_link")
    WebElement shoppingLink;

    @FindBy(xpath = "//*[@id=\"item_2_title_link\"]/div")
    WebElement specificElement;



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
    public void clickAdd(int option){
        if (option==1){
            firstAdd.click();
        }else {
            secondAdd.click();
        }
    }
    public void clickShoppingCart(){
        shoppingLink.click();
    }

    public String getSecondNameProducto(){
        return secondProductOnList.getText();
    }

    public void clickSpecificElement(){specificElement.click();}


}
