package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminProductsPage {
    public AdminProductsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /*
     1- Products menusunden Product List sayfasina erisilebilir oldugu dogrulanmali.*/

   // ******** Harun Yucel Locaters ********
    @FindBy(xpath = "//input[@id='text']")
    public WebElement admin066Mail;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement admin066pasword;
    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement signInButton;
    @FindBy(xpath = "//span[text()='Products']")
    public WebElement producst;
    @FindBy(xpath = "(//a[text()='Product List'])[1]")
    public WebElement productList;

    // ************ Harun Yucel locaters

   /*
    2- Product List sayfasinda Product List, Alert List, Out Of Stock List,
    Disabled Product List, Product By SKU List linklerinin görünür ve ilgili sayfaya gittigi dogrulanir
    */

    @FindBy(id = "product_alert_id")
    public WebElement alertList;
    @FindBy(id = "product_stock_out_id")
    public WebElement outOfStockList;
    @FindBy(id = "product_disabled_id")
    public WebElement disabledProductList;
    @FindBy(id = "product_sku_id")
    public WebElement productBySKUList;




}
