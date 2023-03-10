package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import pages.AdminGiftCardPage;
import pages.AdminLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class US036 {
    AdminLoginPage adminLoginPage;
    AdminGiftCardPage adminGiftCardPage;
    SoftAssert softAssert;
    @Given("Navigate to {string}")
    public void navigate_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
    }
    @Given("Enter {string} and {string} and click sing in button")
    public void enter_and_and_click_sing_in_button(String eMail, String password) {
        adminLoginPage=new AdminLoginPage();

        adminLoginPage.eMail.sendKeys(ConfigReader.getProperty("adminMuratEmail"));
        adminLoginPage.password.sendKeys(ConfigReader.getProperty("adminMuratPassword"));
        adminLoginPage.signInButton.click();
        ReusableMethods.waitFor(4);
    }
    @Then("Click giftCard button")
    public void click_gift_card_button() {
        adminGiftCardPage=new AdminGiftCardPage();

       adminGiftCardPage.giftCardNav.click();
       ReusableMethods.waitFor(2);
    }
    @Then("Verify giftCardList is displayed")
    public void verify_gift_card_list_is_displayed() {
        adminGiftCardPage=new AdminGiftCardPage();
        Assert.assertTrue(adminGiftCardPage.giftCardListLink.isDisplayed());
    }

    @Then("Click giftCardList")
    public void click_gift_card_list() {
        adminGiftCardPage=new AdminGiftCardPage();
        adminGiftCardPage.giftCardListLink.click();
        ReusableMethods.waitFor(3);
    }
    @Then("Verify that the gift cart list can be displayed on the page")
    public void verify_that_the_gift_cart_list_can_be_displayed_on_the_page() {
        adminGiftCardPage=new AdminGiftCardPage();
        Assert.assertTrue(adminGiftCardPage.giftCardListText.isDisplayed());
    }


    @Then("Close the page")
    public void closeThePage() {
        Driver.closeDriver();
    }

    @Then("Verify that Name,SKU,Thumbnail Image,Selling Price,Number of Sale and Status information is displayed")
    public void verifyThatNameSKUThumbnailImageSellingPriceNumberOfSaleAndStatusInformationIsDisplayed() {

        adminGiftCardPage=new AdminGiftCardPage();
        softAssert=new SoftAssert();

        softAssert.assertTrue(adminGiftCardPage.name.isDisplayed());
        softAssert.assertTrue(adminGiftCardPage.sku.isDisplayed());
        softAssert.assertTrue(adminGiftCardPage.thumbnailImage.isDisplayed());
        softAssert.assertTrue(adminGiftCardPage.status.isDisplayed());
        softAssert.assertTrue(adminGiftCardPage.numberOfSale.isDisplayed());
        softAssert.assertTrue(adminGiftCardPage.sellingPrice.isDisplayed());

        softAssert.assertAll();
    }

    @Then("Click select button")
    public void clickSelectButton() {
        adminGiftCardPage=new AdminGiftCardPage();
        adminGiftCardPage.select.click();
        ReusableMethods.waitFor(2);
    }

    @And("Verify view,edit and delete links are visible")
    public void verifyViewEditAndDeleteLinksAreVisible() {
       adminGiftCardPage=new AdminGiftCardPage();
       softAssert=new SoftAssert();

       softAssert.assertTrue(adminGiftCardPage.view.isDisplayed());
       softAssert.assertTrue(adminGiftCardPage.delete.isDisplayed());
       softAssert.assertTrue(adminGiftCardPage.edit.isDisplayed());

       softAssert.assertAll();
    }


    @And("Verify that when we click this button, the status of this button has changed")
    public void verifyThatWhenWeClickThisButtonTheStatusOfThisButtonHasChanged() {
        adminGiftCardPage=new AdminGiftCardPage();

        adminGiftCardPage.select.click();
        adminGiftCardPage.view.click();

        if (adminGiftCardPage.statusActive.isDisplayed()){
            Driver.getDriver().navigate().back();
            adminGiftCardPage.statusChange.click();
            ReusableMethods.waitFor(3);
            adminGiftCardPage.select.click();
            adminGiftCardPage.view.click();
            ReusableMethods.waitForVisibility(adminGiftCardPage.statusInactive,10);
            Assert.assertEquals(adminGiftCardPage.statusInactive.getText(),"Inactive");
        }

        if (adminGiftCardPage.statusInactive.isDisplayed()){
            Driver.getDriver().navigate().back();
            adminGiftCardPage.statusChange.click();
            ReusableMethods.waitFor(3);
            adminGiftCardPage.select.click();
            adminGiftCardPage.view.click();
            Assert.assertTrue(adminGiftCardPage.statusActive.isDisplayed());}





    }
}
