package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AdminProductsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class US035 {

    AdminProductsPage adminProductsPage = new AdminProductsPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Login to Trendlifeby page as admin")
    public void login_to_trendlifeby_page_as_admin() {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        adminProductsPage.admin066Mail.sendKeys(ConfigReader.getProperty("admin066Mail"));
        adminProductsPage.admin066pasword.sendKeys(ConfigReader.getProperty("admin066pasword"));
        adminProductsPage.signInButton.click();

    }
    @Given("Click on the Products button")
    public void click_on_the_products_button() {
        adminProductsPage.producst.click();


    }
    @Given("Click the ProductsList button")
    public void click_the_products_list_button() {
        adminProductsPage.productList.click();


    }
   @Given("Verifies that the ProductsList page is visible")
    public void verifies_that_the_products_list_page_is_visible() {
       assertTrue(adminProductsPage.productList.isDisplayed());


    }

  @Given("closes the page")
    public void closes_the_page() {
        Driver.closeDriver();


    }

 @Given("Verifies that it goes to the Prouducts List page")
    public void verifies_that_it_goes_to_the_prouducts_list_page() {
        adminProductsPage.producst.click();

        adminProductsPage.productList.click();
        String expectedTitle = "Trendlifebuy | Online Shopping | Products";
      String actualTitle= Driver.getDriver().getTitle();
      assertEquals(expectedTitle,actualTitle);

    }
 @Given("Verified visibility of ProductList, AlertList, OutOfStockList, DisabledProductList, ProductBySKUList links")
 public void verified_visibility_of_product_list_alert_list_out_of_stock_list_disabled_product_list_product_by_sku_list_links() {

   assertTrue(adminProductsPage.productList.isDisplayed());
   assertTrue(adminProductsPage.alertList.isDisplayed());
   assertTrue(adminProductsPage.outOfStockList.isDisplayed());
   assertTrue(adminProductsPage.disabledProductList.isDisplayed());
   assertTrue(adminProductsPage.productBySKUList.isDisplayed());

    }
    @Given("Go to Prouducts List page")
    public void go_to_prouducts_list_page() {

        adminProductsPage.producst.click();
        adminProductsPage.productList.click();
    }
    @Given("SL, Name, Product Type, Brand, Image, It appears to be listed under the headings Stock, Status, Action")
    public void sl_name_product_type_brand_ımage_ıt_appears_to_be_listed_under_the_headings_stock_status_action() {

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

    }

    @Given("Product status can be changed from the Status column in the Product List verified.")
    public void product_status_can_be_changed_from_the_status_column_in_the_product_list_verified() {
    ReusableMethods.waitFor(3);
    adminProductsPage.firstbutton.click();
    assertTrue(adminProductsPage.statusStun.isEnabled());
    adminProductsPage.statusStun.click();
    Driver.closeDriver();

    }
    @Given("Clicked on the select tab in the Action column, verified that the View link is visible and displays the product")
    public void clicked_on_the_select_tab_in_the_action_column_verified_that_the_view_link_is_visible_and_displays_the_product() {
        ReusableMethods.waitFor(3);
        adminProductsPage.firstbutton.click();
        adminProductsPage.actionSelect.click();
        assertTrue(adminProductsPage.actionVıew.isDisplayed());
        adminProductsPage.actionVıew.click();
        assertTrue(adminProductsPage.productdisplay.isDisplayed());
        Driver.closeDriver();

    }

    @Given("Confirmed that Edit link is visible in Action select tab and when clicked it redirects to Edit Product page")
    public void confirmed_that_edit_link_is_visible_in_action_select_tab_and_when_clicked_it_redirects_to_edit_product_page() {
        ReusableMethods.waitFor(3);
        adminProductsPage.firstbutton.click();
        adminProductsPage.actionSelect.click();
        assertTrue(adminProductsPage.actionEdit.isDisplayed());
        adminProductsPage.actionEdit.click();
       assertTrue(adminProductsPage.Editproduct.isDisplayed());
       Driver.closeDriver();

    }
    @Given("Verified that the product's current information is available on the Edit Product page")
    public void verified_that_the_product_s_current_information_is_available_on_the_edit_product_page() {
        ReusableMethods.waitFor(3);
        adminProductsPage.firstbutton.click();
        adminProductsPage.actionSelect.click();
        adminProductsPage.actionEdit.click();
        ReusableMethods.waitFor(2);
        assertTrue(adminProductsPage.GeneralInformationTable.isDisplayed());
        Driver.closeDriver();

    }

    @Given("In the Product Information section, select the Type option. Verified that it has not been changed and the corresponding message is visible")
    public void ın_the_product_ınformation_section_select_the_type_option_verified_that_it_has_not_been_changed_and_the_corresponding_message_is_visible() {

        ReusableMethods.waitFor(3);
        adminProductsPage.firstbutton.click();
        adminProductsPage.actionSelect.click();
        adminProductsPage.actionEdit.click();

       assertTrue(adminProductsPage.typeText.isDisplayed());
        System.out.println(adminProductsPage.typeText.getText());
        ReusableMethods.waitFor(2);
        adminProductsPage.variantButton.click();
       assertFalse(adminProductsPage.variantButton.isSelected());
       Driver.closeDriver();

    }

    @Given("Information to be edited on the General Information, Related Product, Up-Selling, Cross-Selling pages After editing, it is verified that the saved information is saved with the Update button.")
    public void ınformation_to_be_edited_on_the_general_ınformation_related_product_up_selling_cross_selling_pages_after_editing_it_is_verified_that_the_saved_information_is_saved_with_the_update_button() {
    ReusableMethods.waitFor(3);
    adminProductsPage.firstbutton.click();
    adminProductsPage.actionSelect.click();
    adminProductsPage.actionEdit.click();

    adminProductsPage.GeneralInformation.click();
    assertTrue(adminProductsPage.GeneralInformationName.isEnabled());
    actions.keyDown(Keys.END);
    actions.keyUp(Keys.END);
    assertTrue(adminProductsPage.UpdateButton.isEnabled());

        actions.keyDown(Keys.HOME);
        actions.keyUp(Keys.HOME);
    adminProductsPage.RelatedProduct.click();
    assertTrue(adminProductsPage.RelatedProductName.isEnabled());
    assertTrue(adminProductsPage.UpdateButton.isEnabled());

    adminProductsPage.UpSale.click();
    assertTrue(adminProductsPage.UpSaleName.isEnabled());
    assertTrue(adminProductsPage.UpdateButton.isEnabled());

    adminProductsPage.CrossSale.click();
    assertTrue(adminProductsPage.crosssaleName.isEnabled());
    assertTrue(adminProductsPage.UpdateButton.isEnabled());

    }


}
