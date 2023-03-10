package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.AdminProductsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US035 {

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
    @Given("Go to Prouducts List page")
    public void go_to_prouducts_list_page() {
        //Prouducts list sayfasına gidilir
        adminProductsPage.producst.click();
        adminProductsPage.productList.click();
    }
    @Given("SL, Name, Product Type, Brand, Image, It appears to be listed under the headings Stock, Status, Action")
    public void sl_name_product_type_brand_ımage_ıt_appears_to_be_listed_under_the_headings_stock_status_action() {
        // SL, Name, Product Type, Brand, Image,
        // Stock, Status, Action basliklari altinda listelendigi gorulur

       assertTrue(adminProductsPage.sl.isDisplayed());
       assertTrue(adminProductsPage.Name.isDisplayed());
       assertTrue(adminProductsPage.ProductType.isDisplayed());
       assertTrue(adminProductsPage.Brand.isDisplayed());
       assertTrue(adminProductsPage.Image.isDisplayed());
       assertTrue(adminProductsPage.Stock.isDisplayed());
       assertTrue(adminProductsPage.Status.isDisplayed());
       assertTrue(adminProductsPage.Action.isDisplayed());

       Driver.closeDriver();

    }

    @Given("Verified that Quick Search TextBox button is active")
    public void verified_that_quick_search_text_box_button_is_active() {

       assertTrue(adminProductsPage.QuickSearchTextBox.isEnabled());
       adminProductsPage.QuickSearchTextBox.sendKeys("Exclusive Bag 1");
        ReusableMethods.waitFor(2);
       Driver.closeDriver();

        // Quick Search TextBox butonunun aktif oldugu dogrulandı
    }

    @Given("Product status can be changed from the Status column in the Product List verified.")
    public void product_status_can_be_changed_from_the_status_column_in_the_product_list_verified() {

    //adminProductsPage.productListfilter.click();
    //adminProductsPage.slFilter.click();
   // Actions actions = new Actions(Driver.getDriver());
    //actions.moveToElement(adminProductsPage.statusStun).perform();
        Driver.getDriver().findElement(By.xpath("(//td[@class='sorting_1'])[1]")).click();
    ReusableMethods.waitFor(2);
    //adminProductsPage.slFilter.click();
    adminProductsPage.statusStun.click();


   // Product List icerisinde Status sütunundan ürün statusu degistirilebildigi dogrulandı
    }



}
