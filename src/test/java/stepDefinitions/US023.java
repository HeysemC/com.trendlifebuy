package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import pages.AdminLoginPage;
import pages.HomePage;
import pages.UserLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US023 {

    HomePage homePage=new HomePage();
    UserLoginPage userLoginPage=new UserLoginPage();
    @Given("Go to the website")
    public void go_to_the_website() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitForVisibility(homePage.subscribePopUpCloseButton, 5);
        if(homePage.subscribePopUpCloseButton.isDisplayed()) {
            homePage.subscribePopUpCloseButton.click();
        }
    }

    @Given("Login to the site as a user")
    public void login_to_the_site_as_a_user(){

        userLoginPage.login.click();
        userLoginPage.eMail.sendKeys(ConfigReader.getProperty("userBetulEmail"));
        userLoginPage.password.sendKeys(ConfigReader.getProperty("userBetulPassword"));

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);

        ReusableMethods.clickWithTimeOut(userLoginPage.signInButton,3);



    }
    @Given("Click on the dashboard button and then click on the support ticket button")
    public void click_on_the_dashboard_button_and_then_click_on_the_support_ticket_button() {
        userLoginPage.dashBoardButton.click();
        ReusableMethods.clickWithTimeOut(userLoginPage.supportTicketButton,2);
        //userLoginPage.supportTicketButton.click();
    }


    @Given("Test if support ticket page is visible")
    public void test_if_support_ticket_page_is_visible() {

        String expected= "https://qa.trendlifebuy.com/support-ticket";
        String actual= Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(expected.contains(actual));





    }

    @Given("Test if all submitted list is visible.")
    public void test_if_all_submitted_list_is_visible() {

    }



}
