package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {

    @FindBy(xpath = "(//div[@class='close_modal'])[1]")
    public WebElement subscribePopUpCloseButton;

    @FindBy(css = "a.google_play_box:nth-child(1)")
    public WebElement googleStoreLink;

    @FindBy(css = "a.google_play_box:nth-child(2)")
    public WebElement appleStoreLink;

    /*
    - TRACK YOUR ORDER
    - COMPARE
    - WHISHLIST
    - CART
     */
    @FindBy(css = "div.border-top-0>a")
    public List<WebElement> headerMenuLinks;

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
