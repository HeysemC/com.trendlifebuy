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


    @And("Verify that the name in the Name field and the gift card name selected in the Gift Card List are the same")
    public void verifyThatTheNameInTheNameFieldAndTheGiftCardNameSelectedInTheGiftCardListAreTheSame() {
        adminGiftCardPage=new AdminGiftCardPage();

        String expectedName=adminGiftCardPage.tableFirstName.getText();
        adminGiftCardPage.select.click();
        adminGiftCardPage.view.click();
        ReusableMethods.waitForVisibility(adminGiftCardPage.viewTableName,10);
        String actualName=adminGiftCardPage.viewTableName.getText();
        String regex = "[^a-zA-Z0-9]";
        String cleanString = actualName.replaceAll(regex, "");
        Assert.assertEquals(cleanString,expectedName);



    }

    @And("Click status button")
    public void clickStatusButton() {
        adminGiftCardPage=new AdminGiftCardPage();

        adminGiftCardPage.statusChange.click();



    }

    @And("Verify that the status of the gift card can be changed to active or inactive")
    public void verifyThatTheStatusOfTheGiftCardCanBeChangedToActiveOrInactive() {
        adminGiftCardPage=new AdminGiftCardPage();

        ReusableMethods.waitForVisibility(adminGiftCardPage.messageBox,8);
        String ExpectedResult="Updated successfully!";
        Assert.assertEquals(adminGiftCardPage.messageBox.getText(),ExpectedResult);
    }

    @And("Click print button")
    public void clickPrintButton() {
        adminGiftCardPage=new AdminGiftCardPage();

        adminGiftCardPage.printButton.click();
    }

    @And("Verify that it redirects the gift card to the print page")
    public void verifyThatItRedirectsTheGiftCardToThePrintPage() {

        ReusableMethods.switchToWindow("Trendlifebuy | Online Shopping | Admin Giftcard");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Trendlifebuy | Online Shopping | Admin Giftcard");
        ReusableMethods.waitFor(2);
    }

    @And("Close the all pages")
    public void closeTheAllPages() {
        Driver.quitDriver();
    }

    @Then("Click edit button")
    public void clickEditButton() {
        adminGiftCardPage=new AdminGiftCardPage();

        adminGiftCardPage.edit.click();
    }

    @And("Verify that it redirects to the Edit Gift Card page")
    public void verifyThatItRedirectsToTheEditGiftCardPage() {
        adminGiftCardPage=new AdminGiftCardPage();

        Assert.assertTrue(adminGiftCardPage.editGiftCardText.isDisplayed());


    }

    @And("Verify that required {string} on the Edit Gift Card page")
    public void verifyThatRequiredOnTheEditGiftCardPage(String arg0) {
        adminGiftCardPage=new AdminGiftCardPage();
        SoftAssert softAssert=new SoftAssert();

        if(arg0.equals("Name")){softAssert.assertTrue(adminGiftCardPage.editName.isDisplayed());}
        if (arg0.equals("SKU")) {softAssert.assertTrue(adminGiftCardPage.editSku.isDisplayed());}
        if (arg0.equals("Thumbnail Image")) {softAssert.assertTrue(adminGiftCardPage.editThumbnailImage.isDisplayed());}
        if (arg0.equals("Selling Price")) {softAssert.assertTrue(adminGiftCardPage.editSellingPrice.isDisplayed());}
        if (arg0.equals("Shipping Methods")) {softAssert.assertTrue(adminGiftCardPage.editShippingMethods.isDisplayed());}
        if (arg0.equals("Galary Image")) {softAssert.assertTrue(adminGiftCardPage.editGalaryImage.isDisplayed());}
        if (arg0.equals("Discount")) {softAssert.assertTrue(adminGiftCardPage.editDiscount.isDisplayed());}
        if (arg0.equals("Discount Type")) {softAssert.assertTrue(adminGiftCardPage.editDiscountType.isDisplayed());}
        if (arg0.equals("Status")) {softAssert.assertTrue(adminGiftCardPage.editStatus.isDisplayed());}
        if (arg0.equals("Discount Period")) {softAssert.assertTrue(adminGiftCardPage.editDiscountPeriod.isDisplayed());}
        if (arg0.equals("Tag")) {softAssert.assertTrue(adminGiftCardPage.editTags.isDisplayed());}
        if (arg0.equals("Description")) {softAssert.assertTrue(adminGiftCardPage.editDescription.isDisplayed());}
        softAssert.assertAll();

    }
}
