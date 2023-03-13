package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AdminLoginPage;
import utilities.Driver;

public class US032 {
    AdminLoginPage adminLoginPage;

    @Then("Confirms that the Dashboard menu item is visible")
    public void confirms_that_the_dashboard_menu_item_is_visible() {
        adminLoginPage = new AdminLoginPage();
      Assert.assertTrue(adminLoginPage.dashboard.isDisplayed());

    }

    @And("Click on Dashboard and go to admin-dashboard page")
    public void clickOnDashboardAndGoToAdminDashboardPage() {
        adminLoginPage = new AdminLoginPage();
        adminLoginPage.subDashboard.click();
       String expectedTitle= Driver.getDriver().getTitle();
       System.out.println(expectedTitle);
       String actualTitle="Dashboard";
       org.junit.Assert.assertTrue(expectedTitle.contains(actualTitle));
    }
}
