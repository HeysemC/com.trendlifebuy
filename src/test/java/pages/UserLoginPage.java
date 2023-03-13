package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserLoginPage {

    public UserLoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public WebElement login;
    @FindBy(xpath = "//input[@id='text']")
    public WebElement eMail;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='amaz_primary_btn style2 radius_5px  w-100 text-uppercase  text-center mb_25']")
    public WebElement signInButton;

    @FindBy(xpath = "(//a[text()='Dashboard'])[1]")
    public WebElement dashBoardButton;

    @FindBy(xpath ="(//*[@class='position-relative d-flex align-items-center '])[2]")
    public WebElement supportTicketButton;

    @FindBy(xpath = "//*[@class='checkmark mr_15']")
    public WebElement checkbox;



}
