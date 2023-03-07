package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class US001 {

    private static final Logger logger = LogManager.getLogger();

    @Given("Kullanici trendlifebuy.com adresine gider.")
    public void kullanici_trendlifebuy_com_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        logger.info(ConfigReader.getProperty("url") + " adresine gidildi!");
    }
    @Given("Sitenin title'inin {string} oldugunu dogrulayin.")
    public void sitenin_title_inin_oldugunu_dogrulayin(String string) {
        String title = Driver.getDriver().getTitle();
        logger.info("Sitenin basligi degiskene atandi!");
        Assert.assertTrue(title.contains(string));
        logger.info("Site basliginin kontrolu yapildi!");
        ReusableMethods.takeScreenShot("HomePage");
        logger.info("Ekran resmi kaydedildi!");
    }
    @Given("Browser'i kapatin.")
    public void browser_i_kapatin() {
        Driver.closeDriver();
        logger.info("Browser kapatildi!");
    }
}
