package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class US001 {

    private static final Logger logger = LogManager.getLogger();
    HomePage homePage = new HomePage();

    @Given("Kullanici trendlifebuy.com adresine gider.")
    public void kullanici_trendlifebuy_com_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        logger.info(ConfigReader.getProperty("url") + " adresine gidildi!");
        ReusableMethods.waitForVisibility(homePage.subscribePopUpCloseButton, 5);
        if(homePage.subscribePopUpCloseButton.isDisplayed()) {
            homePage.subscribePopUpCloseButton.click();
            logger.info("Popup kapatma butonuna tiklandi!");
        }
    }
    @Given("Sitenin title'inin {string} oldugunu dogrular.")
    public void sitenin_title_inin_oldugunu_dogrular(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
        logger.info("Site basliginin kontrolu yapildi!");
    }
    @Given("URL'in {string} oldugunu dogrular.")
    public void urlin_oldugunu_dogrular(String string) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(string));
        logger.info("Site title kontrolu yapildi!");
    }
    @Given("Browser'i kapatir.")
    public void browser_i_kapatir() {
        Driver.closeDriver();
        logger.info("Browser kapatildi!");
    }
}
