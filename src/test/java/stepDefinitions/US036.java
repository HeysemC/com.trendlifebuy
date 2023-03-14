package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.AdminGiftCardPage;
import pages.AdminLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


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
        adminLoginPage = new AdminLoginPage();

        adminLoginPage.eMail.sendKeys(ConfigReader.getProperty("adminMuratEmail"));
        adminLoginPage.password.sendKeys(ConfigReader.getProperty("adminMuratPassword"));
        adminLoginPage.signInButton.click();
        ReusableMethods.waitFor(4);
    }

    @Then("Click giftCard button")
    public void click_gift_card_button() {
        adminGiftCardPage = new AdminGiftCardPage();

        adminGiftCardPage.giftCardNav.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Verify giftCardList is displayed")
    public void verify_gift_card_list_is_displayed() {
        adminGiftCardPage = new AdminGiftCardPage();
        Assert.assertTrue(adminGiftCardPage.giftCardListLink.isDisplayed());
    }

    @Then("Click giftCardList")
    public void click_gift_card_list() {
        adminGiftCardPage = new AdminGiftCardPage();
        adminGiftCardPage.giftCardListLink.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Verify that the gift cart list can be displayed on the page")
    public void verify_that_the_gift_cart_list_can_be_displayed_on_the_page() {
        adminGiftCardPage = new AdminGiftCardPage();
        Assert.assertTrue(adminGiftCardPage.giftCardListText.isDisplayed());
    }


    @Then("Close the page")
    public void closeThePage() {
        Driver.closeDriver();
    }

    @Then("Verify that Name,SKU,Thumbnail Image,Selling Price,Number of Sale and Status information is displayed")
    public void verifyThatNameSKUThumbnailImageSellingPriceNumberOfSaleAndStatusInformationIsDisplayed() {

        adminGiftCardPage = new AdminGiftCardPage();
        softAssert = new SoftAssert();

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
        adminGiftCardPage = new AdminGiftCardPage();
        adminGiftCardPage.select.click();
        ReusableMethods.waitFor(2);
    }

    @And("Verify view,edit and delete links are visible")
    public void verifyViewEditAndDeleteLinksAreVisible() {
        adminGiftCardPage = new AdminGiftCardPage();
        softAssert = new SoftAssert();

        softAssert.assertTrue(adminGiftCardPage.view.isDisplayed());
        softAssert.assertTrue(adminGiftCardPage.delete.isDisplayed());
        softAssert.assertTrue(adminGiftCardPage.edit.isDisplayed());

        softAssert.assertAll();
    }


    @And("Verify that when we click this button, the status of this button has changed")
    public void verifyThatWhenWeClickThisButtonTheStatusOfThisButtonHasChanged() {
        adminGiftCardPage = new AdminGiftCardPage();

        adminGiftCardPage.select.click();
        adminGiftCardPage.view.click();

        if (adminGiftCardPage.statusActive.isDisplayed()) {
            Driver.getDriver().navigate().back();
            adminGiftCardPage.statusChange.click();
            ReusableMethods.waitFor(3);
            adminGiftCardPage.select.click();
            adminGiftCardPage.view.click();
            ReusableMethods.waitForVisibility(adminGiftCardPage.statusInactive, 10);
            Assert.assertEquals(adminGiftCardPage.statusInactive.getText(), "Inactive");
        }

        if (adminGiftCardPage.statusInactive.isDisplayed()) {
            Driver.getDriver().navigate().back();
            adminGiftCardPage.statusChange.click();
            ReusableMethods.waitFor(3);
            adminGiftCardPage.select.click();
            adminGiftCardPage.view.click();
            Assert.assertTrue(adminGiftCardPage.statusActive.isDisplayed());
        }


    }


    @And("Verify that the name in the Name field and the gift card name selected in the Gift Card List are the same")
    public void verifyThatTheNameInTheNameFieldAndTheGiftCardNameSelectedInTheGiftCardListAreTheSame() {
        adminGiftCardPage = new AdminGiftCardPage();

        String expectedName = adminGiftCardPage.tableFirstName.getText();
        adminGiftCardPage.select.click();
        adminGiftCardPage.view.click();
        ReusableMethods.waitForVisibility(adminGiftCardPage.viewTableName, 10);
        String actualName = adminGiftCardPage.viewTableName.getText();
        String regex = "[^a-zA-Z0-9]";
        String cleanString = actualName.replaceAll(regex, "");
        Assert.assertEquals(cleanString, expectedName);


    }

    @And("Click status button")
    public void clickStatusButton() {
        adminGiftCardPage = new AdminGiftCardPage();

        adminGiftCardPage.statusChange.click();


    }

    @And("Verify that the status of the gift card can be changed to active or inactive")
    public void verifyThatTheStatusOfTheGiftCardCanBeChangedToActiveOrInactive() {
        adminGiftCardPage = new AdminGiftCardPage();
        SoftAssert softAssert = new SoftAssert();

        boolean isChecked = adminGiftCardPage.statusCheckbox.isSelected();

        if (!isChecked) {
            adminGiftCardPage.statusChange.click();
            isChecked = adminGiftCardPage.statusCheckbox.isSelected();
            softAssert.assertTrue(isChecked, "Checkbox seçilemedi!");
        } else {
            adminGiftCardPage.statusChange.click();
            isChecked = adminGiftCardPage.statusCheckbox.isSelected();
            softAssert.assertFalse(isChecked, "Checkbox pasif hale getirilemedi!");
        }

        softAssert.assertAll();
    }

    @And("Click print button")
    public void clickPrintButton() {
        adminGiftCardPage = new AdminGiftCardPage();

        adminGiftCardPage.printButton.click();
    }

    @And("Verify that it redirects the gift card to the print page")
    public void verifyThatItRedirectsTheGiftCardToThePrintPage() {

        //ReusableMethods.switchToWindow("Trendlifebuy | Online Shopping | Admin Giftcard");
        //Assert.assertEquals(Driver.getDriver().getTitle(),"Trendlifebuy | Online Shopping | Admin Giftcard");
        // Geçerli penceredeki tüm pencere tanımlayıcılarını alın
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        // Set'teki ikinci tanımlayıcı (yeni sekme) üzerinde işlem yapmak için ana pencereye (ilk tanımlayıcı) geçiş yapın
        Iterator<String> it = windowHandles.iterator();
        String mainWindow = it.next();
        String printPage = it.next();
        Driver.getDriver().switchTo().window(printPage);
        ReusableMethods.waitFor(2);
    }

    @And("Close the all pages")
    public void closeTheAllPages() {
        Driver.quitDriver();
    }

    @Then("Click edit button")
    public void clickEditButton() {
        adminGiftCardPage = new AdminGiftCardPage();

        adminGiftCardPage.edit.click();
    }

    @And("Verify that it redirects to the Edit Gift Card page")
    public void verifyThatItRedirectsToTheEditGiftCardPage() {
        adminGiftCardPage = new AdminGiftCardPage();

        Assert.assertTrue(adminGiftCardPage.editGiftCardText.isDisplayed());


    }

    @And("Verify that required {string} on the Edit Gift Card page")
    public void verifyThatRequiredOnTheEditGiftCardPage(String arg0) {
        adminGiftCardPage = new AdminGiftCardPage();
        SoftAssert softAssert = new SoftAssert();

        if (arg0.equals("Name")) {
            softAssert.assertTrue(adminGiftCardPage.editName.isDisplayed());
        }
        if (arg0.equals("SKU")) {
            softAssert.assertTrue(adminGiftCardPage.editSku.isDisplayed());
        }
        if (arg0.equals("Thumbnail Image")) {
            softAssert.assertTrue(adminGiftCardPage.editThumbnailImage.isDisplayed());
        }
        if (arg0.equals("Selling Price")) {
            softAssert.assertTrue(adminGiftCardPage.editSellingPrice.isDisplayed());
        }
        if (arg0.equals("Shipping Methods")) {
            softAssert.assertTrue(adminGiftCardPage.editShippingMethods.isDisplayed());
        }
        if (arg0.equals("Galary Image")) {
            softAssert.assertTrue(adminGiftCardPage.editGalaryImage.isDisplayed());
        }
        if (arg0.equals("Discount")) {
            softAssert.assertTrue(adminGiftCardPage.editDiscount.isDisplayed());
        }
        if (arg0.equals("Discount Type")) {
            softAssert.assertTrue(adminGiftCardPage.editDiscountType.isDisplayed());
        }
        if (arg0.equals("Status")) {
            softAssert.assertTrue(adminGiftCardPage.editStatus.isDisplayed());
        }
        if (arg0.equals("Discount Period")) {
            softAssert.assertTrue(adminGiftCardPage.editDiscountPeriod.isDisplayed());
        }
        if (arg0.equals("Tag")) {
            softAssert.assertTrue(adminGiftCardPage.editTags.isDisplayed());
        }
        if (arg0.equals("Description")) {
            softAssert.assertTrue(adminGiftCardPage.editDescription.isDisplayed());
        }
        softAssert.assertAll();

    }

    @Then("Edit name {string} sellingPrice {string} and sku {string} information")
    public void editNameSellingPriceAndSkuInformation(String arg1, String arg2, String arg3) {

        adminGiftCardPage = new AdminGiftCardPage();

        adminGiftCardPage.editNameInput.click();
        adminGiftCardPage.editNameInput.clear();
        adminGiftCardPage.editNameInput.sendKeys(arg1);

        adminGiftCardPage.editSellingPriceInput.click();
        adminGiftCardPage.editSellingPriceInput.clear();
        adminGiftCardPage.editSellingPriceInput.sendKeys(arg2);

        adminGiftCardPage.editSkuInput.click();
        adminGiftCardPage.editSkuInput.clear();
        adminGiftCardPage.editSkuInput.sendKeys(arg3);
    }


    @And("Veriyf that it can be updated by clicking the Update button")
    public void veriyfThatItCanBeUpdatedByClickingTheUpdateButton() {

        adminGiftCardPage = new AdminGiftCardPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();

        adminGiftCardPage.editUpdateButton.click();
        ReusableMethods.waitFor(3);
        String expectedResult = "Updated successfully!";
        String actualResult = adminGiftCardPage.messageBox.getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, expectedResult);

    }


    @Then("Click delete button and click delete data button")
    public void clickDeleteButtonAndClickDeleteDataButton() {
        adminGiftCardPage = new AdminGiftCardPage();

        adminGiftCardPage.delete.click();
        adminGiftCardPage.editDataDeleteBtn.click();

    }

    @Then("Verify that the relevant gift card can be deleted from the window")
    public void verifyThatTheRelevantGiftCardCanBeDeletedFromTheWindow() {
        adminGiftCardPage = new AdminGiftCardPage();
        ReusableMethods.waitFor(3);
        String expectedResult = "Deleted successfully!";
        String actualResult = adminGiftCardPage.messageBox.getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, expectedResult);

    }


    @Then("Click quick search and enter an {string}")
    public void clickQuickSearchAndEnterAn(String arg0) {
        adminGiftCardPage = new AdminGiftCardPage();

        adminGiftCardPage.quickSearch.sendKeys(arg0);
        ReusableMethods.waitFor(3);
    }


    @And("Verify that is displayed this {string} in Gift Card List")
    public void verifyThatIsDisplayedThisInGiftCardList(String arg0) {
        WebElement table = Driver.getDriver().findElement(By.xpath("//table"));
        // Satırları bul
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        // Her bir hücreyi kontrol et
        boolean found = false;
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                if (cell.getText().contains(arg0)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }


        // Assert kullanarak kontrol et
        Assert.assertTrue(arg0 + "bulunamadı", found);

        // WebDriver'ı kapat
        Driver.closeDriver();
    }

    @Then("Click Add New link")
    public void clickAddNewLink() {
        adminGiftCardPage = new AdminGiftCardPage();

        adminGiftCardPage.addNew.click();
    }

    @And("Verify that it redirects to the Create Gift Card page")
    public void verifyThatItRedirectsToTheCreateGiftCardPage() {
        adminGiftCardPage = new AdminGiftCardPage();

        ReusableMethods.waitFor(3);
        Assert.assertTrue(adminGiftCardPage.giftCardTextH3.isDisplayed());
    }

    @And("Verify that required {string} on the Create Gift Card page")
    public void verifyThatRequiredOnTheCreateGiftCardPage(String arg0) {
        adminGiftCardPage = new AdminGiftCardPage();
        SoftAssert softAssert = new SoftAssert();
        ReusableMethods.waitFor(3);

        if (arg0.equals("Name")) {
            softAssert.assertTrue(adminGiftCardPage.editName.isDisplayed());
        }
        if (arg0.equals("SKU")) {
            softAssert.assertTrue(adminGiftCardPage.editSku.isDisplayed());
        }
        if (arg0.equals("Thumbnail Image")) {
            softAssert.assertTrue(adminGiftCardPage.editThumbnailImage.isDisplayed());
        }
        if (arg0.equals("Selling Price")) {
            softAssert.assertTrue(adminGiftCardPage.editSellingPrice.isDisplayed());
        }
        if (arg0.equals("Shipping Methods")) {
            softAssert.assertTrue(adminGiftCardPage.editShippingMethods.isDisplayed());
        }
        if (arg0.equals("Galary Image")) {
            softAssert.assertTrue(adminGiftCardPage.editGalaryImage.isDisplayed());
        }
        if (arg0.equals("Discount")) {
            softAssert.assertTrue(adminGiftCardPage.editDiscount.isDisplayed());
        }
        if (arg0.equals("Discount Type")) {
            softAssert.assertTrue(adminGiftCardPage.editDiscountType.isDisplayed());
        }
        if (arg0.equals("Status")) {
            softAssert.assertTrue(adminGiftCardPage.editStatus.isDisplayed());
        }
        if (arg0.equals("Discount Period")) {
            softAssert.assertTrue(adminGiftCardPage.editDiscountPeriod.isDisplayed());
        }
        if (arg0.equals("Tag")) {
            softAssert.assertTrue(adminGiftCardPage.editTags.isDisplayed());
        }
        if (arg0.equals("Description")) {
            softAssert.assertTrue(adminGiftCardPage.editDescription.isDisplayed());
        }
        softAssert.assertAll();

    }

    @And("Create name {string},sku {string},thumbnailImage,sellingPrice {string},shippingMethod,galaryImage,discount {string},discountType,discountPeriod,tag{string},description,status")
    public void createNameSkuThumbnailImageSellingPriceShippingMethodGalaryImageDiscountDiscountTypeDiscountPeriodTagDescriptionStatus(String arg0, String arg1, String arg2, String arg3, String arg4) {
        adminGiftCardPage = new AdminGiftCardPage();
        softAssert = new SoftAssert();

        adminGiftCardPage.createNameInput.click();
        adminGiftCardPage.createNameInput.sendKeys(arg0);
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(adminGiftCardPage.createNameInput.getText().contains(arg0));

        adminGiftCardPage.createSkuInput.click();
        adminGiftCardPage.createSkuInput.clear();
        adminGiftCardPage.createSkuInput.sendKeys(arg1);
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(adminGiftCardPage.createSkuInput.getText().contains(arg1));

        String dosyaYolu=System.getProperty("user.home")+"\\OneDrive\\Desktop\\Card.jpg";
        ReusableMethods.waitFor(3);
        adminGiftCardPage.createThumbnaiImage.sendKeys(dosyaYolu);
        ReusableMethods.waitFor(5);
        softAssert.assertTrue(adminGiftCardPage.createThumbnaiImage.getText().contains("jpg"));

        adminGiftCardPage.createSellingPriceInput.sendKeys(arg2);
        softAssert.assertTrue(adminGiftCardPage.createSellingPriceInput.getText().contains(arg2));

        adminGiftCardPage.createShippingMethods.sendKeys("international");
        softAssert.assertTrue(adminGiftCardPage.createShippingMethods.getText().contains("international"));


        String dosyaYolu1=System.getProperty("user.home")+"\\OneDrive\\Desktop\\Card.jpg";
        ReusableMethods.waitFor(3);
        adminGiftCardPage.createGalaryImage.sendKeys(dosyaYolu1);
        ReusableMethods.waitFor(5);
        softAssert.assertTrue(adminGiftCardPage.createGalaryImage.getText().contains("jpg"));

        adminGiftCardPage.createDiscount.sendKeys(arg3);
        softAssert.assertTrue(adminGiftCardPage.createDiscount.getText().contains(arg3));

        adminGiftCardPage.createDiscountType.click();
        adminGiftCardPage.selectPercentage.click();
        ReusableMethods.waitFor(2);
        softAssert.assertTrue(adminGiftCardPage.createDiscountType.getText().contains("Percentage"));

        adminGiftCardPage.createDateInput.click();
        adminGiftCardPage.firstBodyDate.click();
        adminGiftCardPage.secondBodyDate.click();
        adminGiftCardPage.applyDate.click();

        adminGiftCardPage.createTags.click();
        adminGiftCardPage.createTags.sendKeys(arg4);

        boolean isChecked = adminGiftCardPage.createActive.isSelected();

        if (!isChecked) {
            adminGiftCardPage.createStatuChange1.click();
            isChecked = adminGiftCardPage.createActive.isSelected();
        } else {
            adminGiftCardPage.getCreateStatuChange2.click();
            isChecked = adminGiftCardPage.createInactive.isSelected();

        }

        adminGiftCardPage.createSave.click();

        softAssert.assertAll();
    }
}

