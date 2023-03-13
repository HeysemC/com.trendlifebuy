package stepDefinitions;

import io.cucumber.java.en.*;

import org.junit.Assert;


import pages.AdminLoginPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US031 {

    AdminLoginPage adminLoginPage;
    @Given("Enter {string} and {string} and click sing in buttonn")
    public void enter_and_and_click_sing_in_buttonn(String eMail, String password) {
        adminLoginPage = new AdminLoginPage();

        adminLoginPage.eMail.sendKeys(ConfigReader.getProperty("adminTuncayEmail"));
        adminLoginPage.password.sendKeys(ConfigReader.getProperty("adminTuncayPassword"));
        adminLoginPage.signInButton.click();
        ReusableMethods.waitFor(4);
    }
    @And("Then  Verify  is displayed verify that the profile icon is visible")
    public void thenVerifyIsDisplayedVerifyThatTheProfileIconIsVisible() {
        adminLoginPage=new AdminLoginPage();
        Assert.assertTrue(adminLoginPage.profilikonu.isDisplayed());

    }

    @Then("Close the pagee")
    public void closeThePagee() {
        Driver.closeDriver();
    }
    @Then("Click profilikon button")
    public void clickProfilikonButton() {
        adminLoginPage=new AdminLoginPage();
        //ReusableMethods.waitFor(2);
        adminLoginPage.profilikonu.click();
        ReusableMethods.waitFor(2);
    }
    @Then("verify that the account's Name appears")
    public void verifyThatTheAccountSNameAppears() {
        String actualName = adminLoginPage.adminName.getText();
        System.out.println(adminLoginPage.adminName.getText());

        String expectedName = "Admin019";
        Assert.assertEquals(expectedName,actualName);
    }
}
