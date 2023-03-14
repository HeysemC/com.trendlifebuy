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
    @FindBy(id = "product_alert_id")
    public WebElement alertList;
    @FindBy(id = "product_stock_out_id")
    public WebElement outOfStockList;
    @FindBy(id = "product_disabled_id")
    public WebElement disabledProductList;
    @FindBy(id = "product_sku_id")
    public WebElement productBySKUList;
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

 @FindBy(xpath = "(//input[@placeholder='Quick Search'])[1]")
 public WebElement QuickSearchTextBox;

 @FindBy(xpath = "(//button[@class='dt-button buttons-collection buttons-colvis'])[1]")
 public WebElement productListfilter;

 @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
 public WebElement firstbutton;

 @FindBy(xpath = "(//label[@class='switch_toggle'])[2]")
 public WebElement statusStun;

 @FindBy(xpath = "(//*[contains(text(),'Updated successfully!')])[2]")
 public WebElement UpdatedSuccessfully;

 @FindBy(xpath = "//span[text()='SL']")
 public WebElement slFilter;

 @FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[2]")
 public WebElement actionSelect;


 @FindBy(xpath = "(//a[text()='View'])[2]")
 public WebElement actionVıew;

 @FindBy(xpath = "//div[@class='products_view_left text-center mb-35']")
 public WebElement productdisplay;

 @FindBy(xpath = "(//a[@class='dropdown-item edit_brand'])[3]")
 public WebElement actionEdit;

 @FindBy(xpath = "(//h3[@class='mb-0 mr-30 mb_xs_15px mb_sm_20px'])[1]")
 public WebElement Editproduct;

 @FindBy(id = "GenaralInfo")
 public WebElement GeneralInformationTable;

@FindBy(xpath = "(//label[@data-id='color_option'])[1]")
public WebElement variantButton;
 @FindBy(xpath = "//label[text()=' (Change Not Possible for Use) ']")
 public WebElement typeText;

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

 @FindBy(xpath = "(//a[@class='dropdown-item edit_brand'])[4]")
 public WebElement actionClone;

 @FindBy(xpath = "//h3[text()='Clone Product']")
 public WebElement cloneProduct;

 @FindBy(xpath = "//button[@class='primary_btn_2 mt-5 text-center saveBtn']")
 public WebElement saveBtn;

 @FindBy(id = "product_name")
 public WebElement productİnformationName;

 @FindBy(id = "sku_single")
 public WebElement productSku;

 @FindBy(xpath = "(//label[@data-id='bg_option'])[2]")
 public WebElement priceInfoAndStock;

 @FindBy(id = "weight")
 public WebElement weight;

 @FindBy(id = "weight")
 public WebElement length;

 @FindBy(id = "breadth")
 public WebElement breadth;

 @FindBy(id = "height")
 public WebElement height;

 @FindBy(xpath = "//input[@name='additional_shipping']")
 public WebElement addtionalShippingCharge;

 @FindBy(xpath = "(//div[@class='nice-select primary_select mb-25'])[1]")
 public WebElement stockManage;

 @FindBy(xpath = "//li[text()='Yes']")
 public WebElement stockManageYesbtn;

 @FindBy(xpath = "//input[@id='single_stock']")
 public WebElement productStock;

 @FindBy(xpath = "//input[@id='selling_price']")
 public WebElement sellingPrice;

 @FindBy(xpath = "//label[@for='thumbnail_image']")
 public WebElement productImageInfo;

 @FindBy(xpath = "//label[@for='pdf_file']")
 public WebElement pdfSpecifications;

 @FindBy(xpath = "//input[@name='video_link']")
 public WebElement videoLink;

 @FindBy(xpath = "(//tbody)[1]")
 public WebElement productsTable;

 @FindBy(xpath = "(//td[@class='sorting_1'])[2]")
 public WebElement finalProduct;

 @FindBy(xpath = "(//div[@class='dropdown CRM_dropdown'])[3]")
 public WebElement finalSelect;
 @FindBy(xpath = "(//a[@class='dropdown-item delete_product'])[3]")
 public WebElement finalDelete;

 @FindBy(xpath = "(//input[@id='dataDeleteBtn'])[2]")
 public WebElement finalDelete2;

 @FindBy(xpath = "//div[@class='alert alert-warning mt-30 text-center']")
 public WebElement warningLetter;

 @FindBy(xpath = "//tr[@class='odd parent']")
 public WebElement  productListfirst;

 @FindBy(xpath = "(//a[@class='dropdown-item delete_product'])[2]")
 public WebElement  actionDelete;

 @FindBy(xpath = "(//th[@aria-controls='SKUTable'])[1]")
 public WebElement  ByskuSl;

 @FindBy(xpath = "(//th[@aria-controls='SKUTable'])[2]")
 public WebElement  BySkuName;

 @FindBy(xpath = "(//th[@aria-controls='SKUTable'])[3]")
 public WebElement  BySkuBrand;

 @FindBy(xpath = "(//th[@aria-controls='SKUTable'])[4]")
 public WebElement  BySku;

 @FindBy(xpath = "(//th[@aria-controls='SKUTable'])[5]")
 public WebElement  ByskuSellingPrice;

 @FindBy(xpath = "(//th[@aria-controls='SKUTable'])[6]")
 public WebElement  ByskuImage;

 @FindBy(xpath = "(//th[@aria-controls='SKUTable'])[7]")
 public WebElement  ByskuAction;

 @FindBy(xpath = "(//button[@class='dt-button buttons-collection buttons-colvis'])[5]")
 public WebElement  ByskuFilter;

 @FindBy(xpath = "(//button[@class='dt-button buttons-columnVisibility active'])[1]")
 public WebElement  ByskuSlFilter;

 @FindBy(xpath = "//span[text()='Name']")
 public WebElement  ByskuNameFilter;

 @FindBy(xpath = "//span[text()='Brand']")
 public WebElement  ByskuBrandFilter;

 @FindBy(xpath = "//span[text()='SKU']")
 public WebElement  ByskuSkuFilter;

 @FindBy(xpath = "//span[text()='Selling Price']")
 public WebElement  ByskuSellingPriceFilter;

 @FindBy(xpath = "//span[text()='Image']")
 public WebElement  ByskuImageFilter;

 @FindBy(xpath = "//span[text()='Action']")
 public WebElement  ByskuActionFilter;

 @FindBy(xpath = "(//button[@class='dt-button buttons-columnVisibility active'])[8]")
 public WebElement  ByskuRestoreVisibilityFilter;

 @FindBy(xpath = "(//input[@placeholder='Quick Search'])[5]")
 public WebElement  ByskuQuickSearchTextBox;

 @FindBy(xpath = "(//tbody)[5]")
 public WebElement  ByskuQuickSearchTable;

 @FindBy(xpath = "(//button[@data-toggle='dropdown'])[41]")
 public WebElement  ByskuActionSelect;

 @FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']")
 public WebElement  ByskuActionEdit;

 @FindBy(xpath = "//input[@name='selling_price']")
 public WebElement  ByskuActionEditSellingPrice;

 @FindBy(xpath = "//button[@id='editSKUBtn']")
 public WebElement  ByskuActionEditUpdate;

 @FindBy(xpath = "//a[@id='SKUTable_next']")
 public WebElement  ByskuForwardPage;

 @FindBy(xpath = "//a[@id='SKUTable_previous']")
 public WebElement  ByskuBackPage;


}







