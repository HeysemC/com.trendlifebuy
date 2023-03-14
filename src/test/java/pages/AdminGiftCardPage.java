package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminGiftCardPage {

    public AdminGiftCardPage(){PageFactory.initElements(Driver.getDriver(),this);}

    //admin dashboard >giftCard
    @FindBy(xpath = "//*[text()='Gift Card']")
    public WebElement giftCardNav;

    //admin dashboard >giftCard >giftCardList
    @FindBy(xpath = "//*[text()='Gift Card List']")
    public WebElement giftCardListLink;

    //admin dashboard >giftCard >giftCardList >giftCardListText
    @FindBy(xpath = "//h3[text()='Gift Card List']")
    public WebElement giftCardListText;

    //admin dashboard >giftCard >giftCardList >name
    @FindBy(xpath = "//*[text()='Name']")
    public WebElement name;

    //admin dashboard >giftCard >giftCardList >SKU
    @FindBy(xpath = "//*[text()='SKU']")
    public WebElement sku;

    //admin dashboard >giftCard >giftCardList >Thumbnail Image
    @FindBy(xpath = "//*[text()='Thumbnail Image']")
    public WebElement thumbnailImage;

    //admin dashboard >giftCard >giftCardList >numberOfSale
    @FindBy(xpath ="//*[text()='Number of Sale']")
    public WebElement numberOfSale;

    //admin dashboard >giftCard >giftCardList >status
    @FindBy(xpath = "(//*[text()='Status'])[2]")
    public WebElement status;

    //admin dashboard >giftCard >giftCardList >action
    @FindBy(xpath = "//*[text()='Action']")
    public WebElement action;

    //admin dashboard >giftCard >giftCardList >sellingPrice
    @FindBy(xpath = "//*[text()='Selling Price']")
    public WebElement sellingPrice;

    //admin dashboard >giftCard >giftCardList >select
    @FindBy(xpath = "(//button[@id='dropdownMenu2'])[1]")
    public WebElement select;

    //admin dashboard >giftCard >giftCardList >view
    @FindBy(xpath = "(//a[text()='View'])[1]")
    public WebElement view;

    //admin dashboard >giftCard >giftCardList >edit
    @FindBy(xpath = "(//a[text()='Edit'])[1]")
    public WebElement edit;

    //admin dashboard >giftCard >giftCardList >delete
    @FindBy(xpath = "(//a[text()='Delete'])[1]")
    public WebElement delete;

    @FindBy(xpath = "//*[text()='Active']")
    public WebElement statusActive;

    @FindBy(xpath ="//span[text()='Inactive']")
    public WebElement statusInactive;

    @FindBy(xpath = "(//div[@class='slider round'])[1]")
    public WebElement statusChange;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement tableFirstName;

    @FindBy(xpath = "//tbody/tr[2]/td[2]")
    public WebElement viewTableName;

    @FindBy (xpath = "//div[@class='toast-message']")
    public WebElement messageBox;

    @FindBy(xpath = "//i[@class='fa fa-print']")
    public WebElement printButton;

    @FindBy(xpath = "(//h3)[1]")
    public WebElement editGiftCardText;

    @FindBy(xpath = "(//label[@class='primary_input_label'])[1]")
    public WebElement editName;

    @FindBy(xpath = "(//label[@class='primary_input_label'])[2]")
    public WebElement editSku;

    @FindBy(xpath = "(//label[@class='primary_input_label'])[3]")
    public WebElement editSellingPrice;

    @FindBy(xpath = "(//label[@class='primary_input_label'])[4]")
    public WebElement editShippingMethods;

    @FindBy(xpath = "(//label[@class='primary_input_label'])[5]")
    public WebElement editDiscount;

    @FindBy(xpath = "(//label[@class='primary_input_label'])[6]")
    public WebElement editDiscountType;

    @FindBy(xpath = "(//label[@class='primary_input_label'])[7]")
    public WebElement editDiscountPeriod;

    @FindBy(xpath = "(//label[@class='primary_input_label'])[8]")
    public WebElement editThumbnailImage;

    @FindBy(xpath = "(//label[@class='primary_input_label'])[9]")
    public WebElement editGalaryImage;

    @FindBy(xpath = "(//label[@class='primary_input_label'])[10]")
    public WebElement editStatus;

    @FindBy(xpath = "(//label[@class='primary_input_label'])[11]")
    public WebElement editDescription;

    @FindBy(xpath = "//*[text()='Tags (Comma Separated)']")
    public WebElement editTags;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement statusCheckbox;

    @FindBy(id = "submit_btn")
    public WebElement editUpdateButton;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement editNameInput;

    @FindBy(xpath = "//input[@id='sku']")
    public WebElement editSkuInput;

    @FindBy(xpath = "//input[@id='selling_price']")
    public WebElement editSellingPriceInput;

    @FindBy(xpath = "//input[@id='dataDeleteBtn']")
    public WebElement editDataDeleteBtn;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement quickSearch;

    @FindBy(xpath = "//*[text()='Add New']")
    public WebElement addNew;

    //admin dashboard >giftCard >giftCardList >addNew >giftCardList
    @FindBy(xpath = "(//h3)[1]")
    public WebElement giftCardTextH3;

    @FindBy(xpath = "(//input[@class='primary_input_field'])[1]")
    public WebElement createNameInput;

    @FindBy(xpath = "(//input[@class='primary_input_field'])[2]")
    public WebElement createSkuInput;

    @FindBy(xpath = "(//input[@class='primary_input_field'])[3]")
    public WebElement createSellingPriceInput;

    @FindBy(xpath = "(//input[@class='primary_input_field'])[4]")
    public WebElement createDiscountInput;

   @FindBy(xpath = "//input[@id='date']")
    public WebElement createDateInput;

   @FindBy(xpath = "(//tbody)[1]/tr[4]/td[2]")
    public WebElement firstBodyDate;

   @FindBy(xpath = "(//tbody)[2]/tr[4]/td[2]")
    public WebElement secondBodyDate;

   @FindBy(xpath = "//*[text()='Apply']")
    public WebElement applyDate;

   @FindBy(xpath = "//span[text()='Email Delivery']")  //(//div[@class='col-lg-6'])[4]
    public WebElement createShippingMethods;

   @FindBy(xpath ="//div[@class='nice-select primary_select mb-25']")
    public WebElement createDiscountType;

   @FindBy(xpath = "(//input[@type='text'])[8]")
    public WebElement createTags;

   @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement createActive;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement createInactive;

    @FindBy(xpath = "//input[@id='thumbnail_image']")
    public WebElement createThumbnaiImage;

    //@FindBy(xpath = "(//*[text()='Browse '])[2]")
    //public WebElement createGalaryImage;

    @FindBy(xpath = "//input[@id='galary_image']")
    public WebElement createGalaryImage;

    @FindBy(xpath = "//input[@id='discount']")
    public WebElement createDiscount;

    @FindBy(xpath = "//li[text()='Percentage']")
    public WebElement selectPercentage;

    @FindBy(xpath = "(//label[@class='primary_checkbox d-flex mr-12'])[1]")
    public WebElement createStatuChange1;

    @FindBy(xpath = "(//label[@class='primary_checkbox d-flex mr-12'])[2]")
    public WebElement getCreateStatuChange2;

    @FindBy(xpath ="//button[@id='submit_btn']")
    public WebElement createSave;




}
