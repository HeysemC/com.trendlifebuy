package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminLoginPage {

   public AdminLoginPage(){PageFactory.initElements(Driver.getDriver(),this);}

    //admin login >email
    @FindBy(xpath = "//input[@name='login']")
    public WebElement eMail;

    //admin login >password
    @FindBy(xpath ="//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Sign In']")
    public WebElement signInButton;

    // admin ikonu
    @FindBy(xpath = "//*[@id='profile_pic']")
    public WebElement profilikonu;

    // admin ikonu/admin ismi
    @FindBy(xpath = "//*[text()='Admin019']")
    public WebElement adminName;
    //zil butonu
    @FindBy(xpath = "//*[@class='fa fa-bell']")
    public WebElement zilButtonu;

    //zil buton/setting
    @FindBy(xpath = "//*[text()='Setting']")
    public WebElement settingButton;

    // zil button/notificatin yazısı
    @FindBy(xpath = "//*[text()='Notifications']")
    public  WebElement notificationText;

    //zil button/Setting yazısı
    @FindBy(xpath = "//*[text()='Setting']")
    public WebElement SettingButton;



}
