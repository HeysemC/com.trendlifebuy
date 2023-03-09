package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US001 {

    HomePage homePage = new HomePage();

    @Given("Kullanici trendlifebuy.com adresine gider.")
    public void kullanici_trendlifebuy_com_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitForVisibility(homePage.subscribePopUpCloseButton, 5);
        if(homePage.subscribePopUpCloseButton.isDisplayed()) {
            homePage.subscribePopUpCloseButton.click();
        }
    }
    @Given("Sitenin title'inin {string} oldugunu dogrular.")
    public void sitenin_title_inin_oldugunu_dogrular(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }
    @Given("URL'in {string} oldugunu dogrular.")
    public void urlin_oldugunu_dogrular(String string) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(string));
    }
    @Given("Browser'i kapatir.")
    public void browser_i_kapatir() {
        Driver.closeDriver();
    }
}
