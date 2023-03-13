package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US026 {

    HomePage homePage=new HomePage();

    @Given("Go the the website")
    public void go_the_the_website() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitForVisibility(homePage.subscribePopUpCloseButton, 5);
        if(homePage.subscribePopUpCloseButton.isDisplayed()) {
            homePage.subscribePopUpCloseButton.click();
        }


    }

    @Given("Test if the site is accessible.")
    public void test_if_the_site_is_accessible() {

        String expected= "https://qa.trendlifebuy.com/";
        String actual= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actual.contains(expected));

    }

    @Given("Test whether the products on the site are displayed.")
    public void test_whether_the_products_on_the_site_are_displayed() {





    }


}
