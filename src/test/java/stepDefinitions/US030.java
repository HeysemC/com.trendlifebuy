package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;

import pages.AdminLoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US030 {
    AdminLoginPage adminLoginPage;

    @Then("Click on the Notifications icon")
    public void click_on_the_notifications_icon() {
        adminLoginPage=new AdminLoginPage();
        ReusableMethods.waitFor(2);
        adminLoginPage.zilButtonu.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Verify that the Notifications text is visible")
    public void verify_that_the_notifications_text_is_visible() {
        String actualName = adminLoginPage.notificationText.getText();
        System.out.println(adminLoginPage.notificationText.getText());

        String expectedName = "Notifications";
        Assert.assertEquals(expectedName,actualName);
    }
    @Then("Click the Setting button")
    public void clickTheSettingButton() {
        adminLoginPage.SettingButton.click();
    }
    @And("Verified to redirect to user-notification page")
    public void verifiedToRedirectToUserNotificationPage() {

        String actualStr=Driver.getDriver().getTitle();
        System.out.println(actualStr);
        String expectedStr="User Notification";
        Assert.assertTrue(actualStr.contains((expectedStr)));
    }
    @Then("it should be confirmed that the information message type can be changed on the page that opens.")
    public void itShouldBeConfirmedThatTheInformationMessageTypeCanBeChangedOnThePageThatOpens() {

       adminLoginPage.checkmark.click();
        ReusableMethods.waitFor(5);
       Assert.assertFalse(adminLoginPage.checkmark.isSelected());
       adminLoginPage.checkmark.click();
       ReusableMethods.waitFor(5);
       //Assert.assertTrue(adminLoginPage.checkmark.isSelected());
    }

    @And("Click on the Read All button to verify that the messages have been deleted from the window")
    public void clickOnTheReadAllButtonToVerifyThatTheMessagesHaveBeenDeletedFromTheWindow() {
        adminLoginPage.readAll.click();
        adminLoginPage.zilButtonu.click();
        ReusableMethods.waitFor(2);
       Assert.assertTrue(adminLoginPage.noNotificationFound.isDisplayed());
    }

    @And("Clicking the View button will take you to the relevant page")
    public void clickingTheViewButtonWillTakeYouToTheRelevantPage() {
        adminLoginPage.view.click();
        String expectedStr = Driver.getDriver().getTitle();
        String actuaStr = "Profile Notifications";
        Assert.assertTrue(expectedStr.contains(actuaStr));
    }
}
