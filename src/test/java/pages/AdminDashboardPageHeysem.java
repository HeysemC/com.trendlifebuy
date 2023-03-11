package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboardPageHeysem {

    public AdminDashboardPageHeysem() {PageFactory.initElements(Driver.getDriver(),this);}

    //adminLogin>products
    @FindBy(xpath ="(//div[@class='nav_title'])[5]")
    public WebElement productsButton;


    //adminLogin>products>Add New Product
    @FindBy(xpath = "//a[text()='Add New Product']")
    public WebElement addNewproduct;

    //adminLogin>products>Add New Product>Product Information
    @FindBy(xpath = "//h3[text()='Product Information']")
    public WebElement productInformation;

    //adminLogin>products>Add New Product>General Information
    @FindBy(id = "1")//a[@id='1']
    public WebElement generalInformation;

    //adminLogin>products>Add New Product>Related Product
    @FindBy(id = "2")//a[@href='#RelatedProduct']
    public WebElement relatedProduct;

    //adminLogin>products>Add New Product>Up Sale
    @FindBy(id = "3")//a[@href='#UpSale']
    public WebElement upSale;

    //adminLogin>products>Add New Product>Cross Sale
    @FindBy(id = "4")//a[@href='#CrossSale']
    public WebElement crossSale;

    //adminLogin>products>Add New Product>General Information>Variant Button
    @FindBy(xpath = "//*[text()='Variant']")//input[@id='variant_prod']
    public WebElement variantButton;

    //adminLogin>products>Add New Product>General Information>Single Button
    @FindBy(xpath = "//*[text()='Single']")//input[@id='single_prod']
    public WebElement singleButton;

    //adminLogin>products>Add New Product>General Information>Single Button>PRODUCT_SKU
    @FindBy(xpath = "//*[text()=' Product Sku']")//span[@id='error_single_sku']
    public WebElement PRODUCT_SKU;

    //adminLogin>products>Add New Product>General Information>Variant Button>SUBTITLE 1
    @FindBy(xpath = "//*[text()=' Subtitle 1']")//input[@id='subtitle_1']
    public WebElement subtitle_1;

    //adminLogin>products>Add New Product
    @FindBy(xpath = "(//ul[@class='mm-collapse mm-show']/li/a)[1]")
    public WebElement addNewproduct1;




}
