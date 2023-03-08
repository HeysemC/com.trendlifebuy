package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductSearchPage {

    @FindBy(css = "h5:nth-child(1)")
    public WebElement resultText;

    public ProductSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
