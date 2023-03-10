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

 //3-Product List'te ürünler SL, Name, Product Type, Brand, Image,
 // Stock, Status, Action basliklari altinda listelendigi dogrulanir

 //***********Harun Yucel locaters******************

 @FindBy(xpath = "(//th[@aria-controls='mainProductTable'])[1]")
 public WebElement sl;

 @FindBy(xpath = "(//th[@aria-controls='mainProductTable'])[2]")
 public WebElement Name;


 @FindBy(xpath = "(//th[@aria-controls='mainProductTable'])[3]")
 public WebElement ProductType;

 @FindBy(xpath = "(//th[@aria-controls='mainProductTable'])[4]")
 public WebElement Brand;

 @FindBy(xpath = "(//th[@aria-controls='mainProductTable'])[5]")
 public WebElement Image;

 @FindBy(xpath = "(//th[@aria-controls='mainProductTable'])[6]")
 public WebElement Stock;

 @FindBy(xpath = "(//th[@aria-controls='mainProductTable'])[7]")
 public WebElement Status;

 @FindBy(xpath = "(//th[@aria-controls='mainProductTable'])[8]")
 public WebElement Action;


 /*
4-Quick Search TextBox'i ile Product List icerisinde arama yapilabildigi dogrulanmali
 */
 //***********Harun Yucel locaters******************

 @FindBy(xpath = "(//input[@placeholder='Quick Search'])[1]")
 public WebElement QuickSearchTextBox;

 /*
 5-Product List icerisinde Status sütunundan ürün statusu degistirilebildigi dogrulanmali
  */

 //***********Harun Yucel locaters******************
 @FindBy(xpath = "(//button[@class='dt-button buttons-collection buttons-colvis'])[1]")
 public WebElement productListfilter;

 @FindBy(xpath = "(//label[@class='switch_toggle'])[1]")
 public WebElement statusStun;

 @FindBy(xpath = "//span[text()='SL']")
 public WebElement slFilter;

}
