package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import pages.AdminProductsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US0035 {

    AdminProductsPage adminProductsPage = new AdminProductsPage();
    @Given("Login to Trendlifeby page as admin")
    public void login_to_trendlifeby_page_as_admin() {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        adminProductsPage.admin066Mail.sendKeys(ConfigReader.getProperty("admin066Mail"));
        adminProductsPage.admin066pasword.sendKeys(ConfigReader.getProperty("admin066pasword"));
        adminProductsPage.signInButton.click();
    // Trendlifeby sayfasına admin olarak giris yapılır
    }
    @Given("Click on the Products button")
    public void click_on_the_products_button() {
        adminProductsPage.producst.click();

        //  Products butonuna tıklanır
    }
    @Given("Click the ProductsList button")
    public void click_the_products_list_button() {
        adminProductsPage.productList.click();

        // ProductsList butonu tıklanır
    }
   @Given("Verifies that the ProductsList page is visible")
    public void verifies_that_the_products_list_page_is_visible() {
       assertTrue(adminProductsPage.productList.isDisplayed());
        // ProductsList sayfası gorunur oldugu dogrulanır

    }

  @Given("closes the page")
    public void closes_the_page() {
        Driver.closeDriver();

        // sayfayı kapatır
    }

 @Given("Verifies that it goes to the Prouducts List page")
    public void verifies_that_it_goes_to_the_prouducts_list_page() {
        adminProductsPage.producst.click();

        adminProductsPage.productList.click();
        String expectedTitle = "Trendlifebuy | Online Shopping | Products";
      String actualTitle= Driver.getDriver().getTitle();
      assertEquals(expectedTitle,actualTitle);

     // Prouducts List sayfasına gittigi dogrulanır
    }
 @Given("Verified visibility of ProductList, AlertList, OutOfStockList, DisabledProductList, ProductBySKUList links")
 public void verified_visibility_of_product_list_alert_list_out_of_stock_list_disabled_product_list_product_by_sku_list_links() {

   assertTrue(adminProductsPage.productList.isDisplayed());
   assertTrue(adminProductsPage.alertList.isDisplayed());
   assertTrue(adminProductsPage.outOfStockList.isDisplayed());
   assertTrue(adminProductsPage.disabledProductList.isDisplayed());
   assertTrue(adminProductsPage.productBySKUList.isDisplayed());

   // ProductList, AlertList, OutOfStockList, DisabledProductList,
  // ProductBySKUList linklerinin görünürlügü dogrulandı
    }



}
