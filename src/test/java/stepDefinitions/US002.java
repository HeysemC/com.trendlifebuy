package stepDefinitions;

import io.cucumber.java.en.Given;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US002 {

    private static final Logger logger = LogManager.getLogger();
    HomePage homePage = new HomePage();

    @Given("Market linkinin {string} dogru sayfaya yönlendirdigini kontrol eder.")
    public void market_linkinin_dogru_sayfa_yonlendirildigini_kontrol_eder(String string) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        logger.info("Scroll sayfanin en altina indirildi!");

        ReusableMethods.waitFor(1);
        logger.info("1 saniye beklendi!");

        SoftAssert softAssert = new SoftAssert();

        if(string.equals("Google Store")) {
            softAssert.assertTrue(homePage.googleStoreLink.getAttribute("href").contains("google.com"));
            logger.info("Google Store Assertion'i yapildi!");
        } else if(string.equals("Apple Store")){
            softAssert.assertTrue(homePage.appleStoreLink.getAttribute("href").contains("apple.com"));
            logger.info("Apple Store Assertion'i yapildi!");
        }
        softAssert.assertAll();
        logger.info("Assertion tamamlandi!");
    }

    @Given("{string} linkine tiklar ve yönlendirilen sayfayi dogrular.")
    public void linkine_tiklar_ve_yonlendirilen_sayfayi_dogrular(String string) {
        homePage.headerMenuLinks.get(0).click();
        logger.info("Track your order linkine tiklandi!");
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("track-order"));
    }
}
