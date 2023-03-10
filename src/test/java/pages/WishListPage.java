package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WishListPage {

    @FindBy(id = "text")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "sign_in_btn")
    public WebElement signInButton;

    public WishListPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
