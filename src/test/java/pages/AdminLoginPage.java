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
}
