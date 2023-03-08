package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.WishListPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US002 {

    HomePage homePage = new HomePage();
    WishListPage wishListPage = new WishListPage();

    @Given("Market linkinin {string} dogru sayfaya yönlendirdigini kontrol eder.")
    public void market_linkinin_dogru_sayfa_yonlendirildigini_kontrol_eder(String string) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        ReusableMethods.waitFor(1);

        SoftAssert softAssert = new SoftAssert();

        if(string.equals("Google Store")) {
            softAssert.assertTrue(homePage.googleStoreLink.getAttribute("href").contains("google.com"));
        } else if(string.equals("Apple Store")){
            softAssert.assertTrue(homePage.appleStoreLink.getAttribute("href").contains("apple.com"));
        }
        softAssert.assertAll();
    }

    @Given("Track Your Link linkine tiklar ve yönlendirilen sayfayi dogrular.")
    public void track_your_link_linkine_tiklar_ve_yonlendirilen_sayfayi_dogrular() {
        homePage.headerMenuLinks.get(0).click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("track-order"));
    }

    @Given("Compare linkine tiklar ve yönlendirilen sayfayi dogrular.")
    public void compare_linkine_tiklar_ve_yonlendirilen_sayfayi_dogrular() {
        homePage.headerMenuLinks.get(1).click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("compare"));
    }

    @Given("Wishlist linkine tiklar ve aktif bir hesapla kullanici girisi yapar.")
    public void wishlist_linkine_tiklar_ve_aktif_bir_hesapla_kullanici_girisi_yapar() {
        homePage.headerMenuLinks.get(2).click();

        wishListPage.emailInput.sendKeys("user030@trendlifebuy.com");
        wishListPage.passwordInput.sendKeys("Trendlife123");
        wishListPage.signInButton.click();
        ReusableMethods.waitFor(2);

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("my-wishlist"));
    }

    @Given("Cart linkine tiklar ve yönlendirilen sayfayi dogrular.")
    public void cart_linkine_tiklar_ve_yonlendirilen_sayfayi_dogrular() {
        homePage.headerMenuLinks.get(3).click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("cart"));
    }
}
