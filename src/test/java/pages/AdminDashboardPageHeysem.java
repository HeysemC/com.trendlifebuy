package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboardPageHeysem {

    public AdminDashboardPageHeysem() {PageFactory.initElements(Driver.getDriver(),this);}

    //adminLogin>products(Heysem)
    @FindBy(xpath ="(//div[@class='nav_title'])[5]")
    public WebElement productsButton;

    //adminLogin>products>Add New Product(Heysem)
    @FindBy(xpath = "//a[text()='Add New Product']")
    public WebElement addNewproduct;

    //adminLogin>products>Add New Product>Product Information(Heysem)
    @FindBy(xpath = "//h3[text()='Product Information']")
    public WebElement productInformation;

    //adminLogin>products>Add New Product>General Information(Heysem)
    @FindBy(id = "1")//a[@id='1']
    public WebElement generalInformation;

    //adminLogin>products>Add New Product>Related Product(Heysem)
    @FindBy(id = "2")//a[@href='#RelatedProduct']
    public WebElement relatedProduct;

    //adminLogin>products>Add New Product>Up Sale(Heysem)
    @FindBy(id = "3")//a[@href='#UpSale']
    public WebElement upSale;

    //adminLogin>products>Add New Product>Cross Sale(Heysem)
    @FindBy(id = "4")//a[@href='#CrossSale']
    public WebElement crossSale;

    //adminLogin>products>Add New Product>General Information>Variant Button(Heysem)
    @FindBy(xpath = "//*[text()='Variant']")//input[@id='variant_prod']
    public WebElement variantButton;

    //adminLogin>products>Add New Product>General Information>Single Button(Heysem)
    @FindBy(xpath = "//*[text()='Single']")//input[@id='single_prod']
    public WebElement singleButton;

    //adminLogin>products>Add New Product>General Information>Single Button>product Sku(Heysem)
    @FindBy(xpath = "//*[text()=' Product Sku']")//span[@id='error_single_sku']
    public WebElement productSku;

    //adminLogin>products>Add New Product>General Information>Variant Button>SUBTITLE 1(Heysem)
    @FindBy(xpath = "//*[text()=' Subtitle 1']")//input[@id='subtitle_1']
    public WebElement subtitle_1;

    //adminLogin>products>Add New Product(Heysem)
    @FindBy(xpath = "(//ul[@class='mm-collapse mm-show']/li/a)[1]")
    public WebElement addNewproduct1;

    //adminLogin>products>Add New Product>Name(Heysem)
    @FindBy(xpath = "//input[@id='product_name']")
    public WebElement name;

    //adminLogin>products>Add New Product> Model Number(Heysem)
    @FindBy(xpath = "//input[@id='model_number']")
    public WebElement modelNumber;

    //adminLogin>products>Add New Product>category(Heysem)
    @FindBy(xpath = "//div[@id='category_select_div']")
    public WebElement category;

    //adminLogin>products>Add New Product>Brand(Heysem)
    @FindBy(xpath = "//div[@id='brand_select_div']")
    public WebElement brand;

    //adminLogin>products>Add New Product>Unit(Heysem)
    @FindBy(xpath = "//div[@id='unit_select_div']")
    public WebElement unit;

    //adminLogin>products>Add New Product>Barcode Type(Heysem)
    @FindBy(xpath = "//select[@id='barcode_type']")
    public WebElement barcodeType;

    //adminLogin>products>Add New Product>Minimum Order QTY(Heysem)
    @FindBy(xpath = "//input[@id='minimum_order_qty']")
    public WebElement minimumorderQty;

    //adminLogin>products>Add New Product>Max Order QTY(Heysem)
    @FindBy(xpath = "//input[@id='max_order_qty']")
    public WebElement maxOrderQty;

    //adminLogin>products>Add New Product>Tags (Comma Separated)(Heysem)
    @FindBy(xpath = "//*[text()='Tags (Comma Separated)']")
    public WebElement tagsCommaSeparated;

    //adminLogin>products>Add New Product>Category>Add New>Create Category(Heysem)
    @FindBy(xpath = "(//h4[@class='modal-title'])[9]")
    public WebElement createCategory;

    /*
    switch (string) {
            case "DATE":
                string = "(//table[@id='walletTable']/tbody/tr)[1]/td[2]";
            case "USER":
                string = "(//table[@id='walletTable']/tbody/tr)[1]/td[3]";
            case "TXT ID":
                string = "(//table[@id='walletTable']/tbody/tr)[1]/td[4]";
            case "AMOUNT":
                string = "(//table[@id='walletTable']/tbody/tr)[1]/td[5]";
            case "TYPE":
                string = "(//table[@id='walletTable']/tbody/tr)[1]/td[6]";
            case "PAYMENT METHOD":
                string = "(//table[@id='walletTable']/tbody/tr)[1]/td[7]";
            case "APPROVAL":
                string = "(//table[@id='walletTable']/tbody/tr)[1]/td[8]";
        }
     */



}
