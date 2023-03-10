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
        ReusableMethods.waitFor(2);
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
}
