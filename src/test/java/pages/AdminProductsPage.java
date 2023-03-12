package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminProductsPage {
    public AdminProductsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


   //1- ******** Harun Yucel Locaters ********
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

    //2- ************ Harun Yucel locaters
    @FindBy(id = "product_alert_id")
    public WebElement alertList;
    @FindBy(id = "product_stock_out_id")
    public WebElement outOfStockList;
    @FindBy(id = "product_disabled_id")
    public WebElement disabledProductList;
    @FindBy(id = "product_sku_id")
    public WebElement productBySKUList;

 //3-***********Harun Yucel locaters******************

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

 //4-***********Harun Yucel locaters******************

 @FindBy(xpath = "(//input[@placeholder='Quick Search'])[1]")
 public WebElement QuickSearchTextBox;

 //5-***********Harun Yucel locaters******************
 @FindBy(xpath = "(//button[@class='dt-button buttons-collection buttons-colvis'])[1]")
 public WebElement productListfilter;

 @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
 public WebElement firstbutton;

 @FindBy(xpath = "(//label[@class='switch_toggle'])[2]")
 public WebElement statusStun;

 @FindBy(xpath = "//div[@class='Updated successfully!']")
 public WebElement UpdatedSuccessfully;


 @FindBy(xpath = "//span[text()='SL']")
 public WebElement slFilter;

 //6-***********Harun Yucel locaters******************
 @FindBy(xpath = "(//button[@id='dropdownMenu2'])[2]")
 public WebElement actionSelect;


 @FindBy(xpath = "(//a[text()='View'])[2]")
 public WebElement actionVıew;


 @FindBy(xpath = "//div[@class='products_view_left text-center mb-35']")
 public WebElement productdisplay;

 //7-***********Harun Yucel locaters******************
 @FindBy(xpath = "(//a[@class='dropdown-item edit_brand'])[3]")
 public WebElement actionEdit;

 @FindBy(xpath = "(//h3[@class='mb-0 mr-30 mb_xs_15px mb_sm_20px'])[1]")
 public WebElement Editproduct;

 //8-***********Harun Yucel locaters******************
 @FindBy(id = "GenaralInfo")
 public WebElement GeneralInformationTable;

 //9-***********Harun Yucel locaters******************
@FindBy(xpath = "(//label[@data-id='color_option'])[1]")
public WebElement variantButton;
 @FindBy(xpath = "//label[text()=' (Change Not Possible for Use) ']")
 public WebElement typeText;

 //10-***********Harun Yucel locaters******************
 @FindBy(xpath = "//a[text()='General Information']")
 public WebElement GeneralInformation;

 @FindBy(id = "product_name")
 public WebElement GeneralInformationName;
 @FindBy(xpath = "//a[text()='Related Product']")
 public WebElement RelatedProduct;

 @FindBy(xpath = "(//label[@class='primary_checkbox d-flex'])[1]")
 public WebElement RelatedProductButton;

 @FindBy(id = "relatedProductAll")
 public WebElement RelatedProductName;

 @FindBy(xpath = "//button[@class='primary_btn_2 mt-5 text-center saveBtn']")
 public WebElement UpdateButton;
 @FindBy(id = "3")
 public WebElement UpSale;
 @FindBy(id = "upSaleAll")
 public WebElement UpSaleName;
 @FindBy(xpath = "//a[text()='Cross sale']")
 public WebElement CrossSale;
 @FindBy(id = "crossSaleAll")
 public WebElement crosssaleName;
 @FindBy(xpath = "//button[@class='primary_btn_2 mt-5 text-center saveBtn']")
 public WebElement Updatecrosssale;


}
