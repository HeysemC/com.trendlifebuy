package stepDefinitions;

import com.beust.ah.A;
import io.cucumber.java.en.*;

import org.junit.Assert;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AdminLoginPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US031 {

    AdminLoginPage adminLoginPage;
    Actions actions=new Actions(Driver.getDriver());
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
    @Then("Verify that the My profile and Log out links are visible")
    public void verifyThatTheMyProfileAndLogOutLinksAreVisible() {
        Assert.assertTrue(adminLoginPage.myProfil.isDisplayed());

        Assert.assertTrue(adminLoginPage.logOut.isDisplayed());
    }
    @Then("Confirms that clicking on the My Profile link takes you to the profile page")
    public void confirmsThatClickingOnTheMyProfileLinkTakesYouToTheProfilePage() {

        adminLoginPage.myProfil.click();
       String expectedTitle= Driver.getDriver().getTitle();
        System.out.println(expectedTitle);
       String actualTitle="Profile";
       Assert.assertTrue(expectedTitle.contains(actualTitle));
    }
    @And("Click address button")
    public void clickAddressButton() {
        adminLoginPage.adress.click();
    }

    @And("verify that the address information appears on the page")
    public void verifyThatTheAddressInformationAppearsOnThePage() {
        Assert.assertTrue(adminLoginPage.adresSutunuIlkSatir.isDisplayed());
        System.out.println(adminLoginPage.adresSutunuIlkSatir.getText());
    }
    @Then("Click AddNewAddress button")
    public void clickAddNewAddressButton() {
        adminLoginPage.addNewAddress.click();
    }
    @And("Verifies that a new address can be added to the account and is visible on the address page")
    public void verifiesThatANewAddressCanBeAddedToTheAccountAndIsVisibleOnTheAddressPage() {
        adminLoginPage.addressName.sendKeys("tuncay2");
        actions.sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("adminTuncayEmail"))
                .sendKeys(Keys.TAB)
                .sendKeys("1234567")
                .sendKeys(Keys.TAB)
                .sendKeys("my address 2").perform();
        adminLoginPage.selectFromOptionsButton.click();
        ReusableMethods.waitFor(2);
        adminLoginPage.Aberdeen.click();
        adminLoginPage.postalCodeButton.sendKeys("1234");
        adminLoginPage.saveButton.click();
        ReusableMethods.waitFor(2);
        String expextedAddress="my address 2";
        String actualAddress=adminLoginPage.adresSutunuIkinciSatir.getText();
        Assert.assertEquals(actualAddress,expextedAddress);

    }
    @Then("Click my profile button")
    public void clickMyProfileButton() {
        adminLoginPage.myProfil.click();
    }
}
