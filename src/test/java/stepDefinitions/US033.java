package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AdminDashboardPage;
import pages.AdminLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US033 {

    /*
    [TC:001]
     */

    AdminDashboardPage adminDashboardPage;
    AdminLoginPage adminLoginPage;

    @Given("Go to {string}")
    public void go_to(String adminUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

    }

    @Then("Enter valid {string} and {string} and click sign in button")
    public void enter_valid_and_and_click_sign_in_button(String adminRamazanEmail, String adminRamazanPassword) {
        adminLoginPage=new AdminLoginPage();

        adminLoginPage.eMail.sendKeys(ConfigReader.getProperty("adminRamazanEmail"));
        adminLoginPage.password.sendKeys(ConfigReader.getProperty("adminRamazanPassword"));
        adminLoginPage.signInButton.click();
    }


    @Then("Click Customer button")
    public void click_customer_button() {
        adminDashboardPage=new AdminDashboardPage();

        adminDashboardPage.CustomerButton.click();


    }
    @Then("Click All Customer button")
    public void click_all_customer_button() {
        adminDashboardPage=new AdminDashboardPage();

       adminDashboardPage.AllCustomerButton.click();
        ReusableMethods.waitFor(2);

    }
    @Then("Verify the Url contains All Customer list")
    public void verify_the_url_contains_all_customer_list() {
        adminDashboardPage=new AdminDashboardPage();

        String expectedKelime="all-customer-list";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedKelime));
    }
/*
    [TC:002]
     */

    @And("Verify the Customer List is visible")
    public void verifyTheCustomerListIsVisible() {
        adminDashboardPage=new AdminDashboardPage();

        Assert.assertTrue(adminDashboardPage.CustomerListElement.isDisplayed());
    }

    /*
    [TC003]
     */

    @And("Verify the Radio button is clickable")
    public void verifyTheRadioButtonIsClickable() {
        adminDashboardPage=new AdminDashboardPage();

        adminDashboardPage.isActiveRadioButton.click();
        Assert.assertTrue(adminDashboardPage.ToastMessageSuccess.isDisplayed());
    }

    @And("Click the Active button")
    public void clickTheActiveButton() {
        adminDashboardPage=new AdminDashboardPage();

        adminDashboardPage.ActiveCustomerButton.click();
    }

    @And("Verify the Active Customer List")
    public void verifyTheActiveCustomerList() {
        adminDashboardPage=new AdminDashboardPage();

        Assert.assertTrue(adminDashboardPage.ActiveCustomerText.isDisplayed());
    }

    /*
    [TC005]
     */
    @And("Click Active Customer button")
    public void clickActiveCustomerButton() {
        adminDashboardPage=new AdminDashboardPage();

        adminDashboardPage.ActiveCustomerButton.click();
        ReusableMethods.waitFor(1);
    }
    @And("Click the Role button")
    public void clickTheRoleButton() {
        adminDashboardPage=new AdminDashboardPage();

        adminDashboardPage.RoleButton.click();
        ReusableMethods.waitFor(2);

    }
    @And("Verify that Details, Edit, Delete links are visible")
    public void verifyThatDetailsEditDeleteLinksAreVisible() {
        adminDashboardPage=new AdminDashboardPage();

        Assert.assertTrue(adminDashboardPage.SelectDropdownMenu.isDisplayed());
    }
    /*
     [TC006]
    */
    @And("Click Details button")
    public void clickDetailsButton() {
        adminDashboardPage=new AdminDashboardPage();
        ReusableMethods.waitFor(1);
        adminDashboardPage.DetailsButton.click();

    }
    @And("Verify the Customer Profile Page is visible")
    public void verifyTheCustomerProfilePageIsVisible() {
        adminDashboardPage=new AdminDashboardPage();

        adminDashboardPage.CustomerProfile.isDisplayed();

    }

    /*
    [TC007]
     */

    @And("Verify the Customer Profile")
    public void verifyTheCustomerProfile() {
        adminDashboardPage=new AdminDashboardPage();

        adminDashboardPage.CustomerSearchBox.sendKeys("Michel"+Keys.ENTER);
        adminDashboardPage.CustomerName.click();
        Assert.assertTrue(adminDashboardPage.CustomerProfile.isDisplayed());

    }

    /*
    [TC008]
     */

    @And("Go the Customer Profile")
    public void goTheCustomerProfile() {
        adminDashboardPage=new AdminDashboardPage();

        adminDashboardPage.CustomerSearchBox.sendKeys("Michel"+Keys.ENTER);
        adminDashboardPage.CustomerName.click();
    }

    @And("Verify that Order, Wallet Histories and Adress information")
    public void verifyThatOrderWalletHistoriesAndAdressInformation() {
        adminDashboardPage=new AdminDashboardPage();

        Assert.assertTrue(adminDashboardPage.OrdersButton.isDisplayed());
        Assert.assertTrue(adminDashboardPage.WalletHistoriesButton.isDisplayed());
        Assert.assertTrue(adminDashboardPage.AdressesButton.isDisplayed());


    }

    /*
    [TC009]
     */
    @And("Click Wallet Histories button")
    public void clickWalletHistoriesButton() {
        adminDashboardPage=new AdminDashboardPage();

        adminDashboardPage.WalletHistoriesButton.click();

    }

    @And("Clicked on the DATE, USER ,TXT ID, AMOUNT, TYPE, PAYMENT METHOD and APPROVAL")
    public void clickedOnTheDATEUSERTXTIDAMOUNTTYPEPAYMENTMETHODAndAPPROVAL() {
        adminDashboardPage=new AdminDashboardPage();

        String whd1=Driver.getDriver().getWindowHandle();
        System.out.println("-----"+whd1);

        //adminDashboardPage.UserButton.click();

        adminDashboardPage.TXTButton.click();
        ReusableMethods.waitFor(1);
        adminDashboardPage.TXTButton.click();
        String whd2=Driver.getDriver().getWindowHandle();

        System.out.println("-------"+whd2);
       /* adminDashboardPage.AmountButton.click();
        adminDashboardPage.TypeButton.click();
        adminDashboardPage.PaymentMethodButton.click();
        adminDashboardPage.ApprovalButton.click();*/


    }
        /*
        [TC011]
         */
    @And("Enter an E-mail to the Quick Search Box")
    public void enterAnEMailToTheQuickSearchBox() {
        adminDashboardPage=new AdminDashboardPage();

        adminDashboardPage.CustomerSearchBox.sendKeys("michel11@gmail.com"+Keys.ENTER);
    }

    @And("Verify that it is possible to search by E-mail")
    public void verifyThatItIsPossibleToSearchByEMail() {
        adminDashboardPage=new AdminDashboardPage();

        String actual=adminDashboardPage.MichelEmail.getText();
        String expected="michel11@gmail.com";

        Assert.assertEquals(expected,actual);

    }
    /*
    [TC012]
     */

    @And("Click the Role Select button")
    public void clickTheRoleSelectButton() {
        adminDashboardPage=new AdminDashboardPage();

        adminDashboardPage.RoleSelectButton.click();
        ReusableMethods.waitFor(3);
    }

    @And("Click the Edit button")
    public void clickTheEditButton() {
        adminDashboardPage=new AdminDashboardPage();

        adminDashboardPage.EditButton.click();
    }

    @And("Verified that the Update Customer page is visible")
    public void verifiedThatTheUpdateCustomerPageIsVisible() {
        adminDashboardPage=new AdminDashboardPage();

        adminDashboardPage.UpdateCustomerPage.isDisplayed();
    }
}
