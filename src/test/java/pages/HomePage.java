package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {

    @FindBy(css = "div.logo_img>a")
    public WebElement logo;

    @FindBy(xpath = "(//div[@class='close_modal'])[1]")
    public WebElement subscribePopUpCloseButton;

    @FindBy(css = "a.google_play_box:nth-child(1)")
    public WebElement googleStoreLink;

    @FindBy(css = "a.google_play_box:nth-child(2)")
    public WebElement appleStoreLink;

    // TRACK YOUR ORDER, COMPARE, WHISHLIST,CART
    @FindBy(css = "div.border-top-0>a")
    public List<WebElement> headerMenuLinks;

    @FindBy(css = "input.category_box_input")
    public WebElement searchboxInput;

    @FindBy(partialLinkText = "LOGIN")
    public WebElement loginLink;

    @FindBy(partialLinkText = "REGISTER")
    public WebElement registerLink;

    // Home, Blog, About Us, Contact
    @FindBy(css = "ul#mobile-menu>li>a")
    public List<WebElement> navBarLinks;

    @FindBy(css = "a.d-lg-inline-flex")
    public WebElement newUserZoneLink;

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
