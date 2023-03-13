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
}
