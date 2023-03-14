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
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals(expectedTitle, actualTitle);

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

    @Given("It has been verified that the Clone link is visible in the Action select tab in the Product List and when clicked, it redirects to the Clone Product page.")
    public void ıt_has_been_verified_that_the_clone_link_is_visible_in_the_action_select_tab_in_the_product_list_and_when_clicked_it_redirects_to_the_clone_product_page() {
        ReusableMethods.waitFor(3);
        adminProductsPage.firstbutton.click();
        adminProductsPage.actionSelect.click();


        assertTrue(adminProductsPage.actionClone.isDisplayed());
        adminProductsPage.actionClone.click();
        assertTrue(adminProductsPage.cloneProduct.isDisplayed());

    }

    @Given("On the Clone Product page, Product Information, Price Info And Stock, Weight Height Info, Product Image Info, Pdf Specifications, It was seen that Product Video Info, Others Info information can be changed")
    public void on_the_clone_product_page_product_ınformation_price_ınfo_and_stock_weight_height_ınfo_product_ımage_ınfo_pdf_specifications_ıt_was_seen_that_product_video_ınfo_others_ınfo_information_can_be_changed() {

        ReusableMethods.waitFor(4);
        adminProductsPage.firstbutton.click();
        adminProductsPage.actionSelect.click();
        adminProductsPage.actionClone.click();

        adminProductsPage.productİnformationName.clear();
        adminProductsPage.productİnformationName.sendKeys("glasses");
        adminProductsPage.productSku.clear();
        adminProductsPage.productSku.sendKeys("glasses1");

        adminProductsPage.priceInfoAndStock.click();
        adminProductsPage.priceInfoAndStock.click();
        adminProductsPage.weight.clear();
        adminProductsPage.weight.sendKeys("601");
        adminProductsPage.length.clear();
        adminProductsPage.length.sendKeys("31");
        adminProductsPage.breadth.clear();
        adminProductsPage.breadth.sendKeys("21");
        adminProductsPage.height.clear();
        adminProductsPage.height.sendKeys("21");
        adminProductsPage.addtionalShippingCharge.clear();
        adminProductsPage.addtionalShippingCharge.sendKeys("1");
        adminProductsPage.productStock.clear();
        adminProductsPage.productStock.sendKeys("1001");
        adminProductsPage.sellingPrice.clear();
        adminProductsPage.sellingPrice.sendKeys("17");

        assertTrue(adminProductsPage.productImageInfo.isEnabled());
        assertTrue(adminProductsPage.pdfSpecifications.isEnabled());
        adminProductsPage.videoLink.click();
        adminProductsPage.videoLink.sendKeys("https://www.youtube.com/watch?v=rav6sDe5huU");

        actions.keyDown(Keys.END).perform();
        actions.keyUp(Keys.END).perform();
        adminProductsPage.saveBtn.click();
        ReusableMethods.waitFor(4);
        adminProductsPage.QuickSearchTextBox.sendKeys("glasses" + Keys.ENTER);
        ReusableMethods.waitFor(3);
        assertTrue(adminProductsPage.productsTable.getText().contains("glasses"));
        System.out.println(adminProductsPage.productsTable.getText());
        adminProductsPage.finalProduct.click();
        actions.keyDown(Keys.END).perform();
        actions.keyUp(Keys.END).perform();
        ReusableMethods.waitFor(2);
        adminProductsPage.finalSelect.click();
        ReusableMethods.waitFor(2);
        adminProductsPage.finalDelete.click();
        adminProductsPage.finalDelete2.click();

    }

    @Given("Confirmed that the message on the Save button is visible, reminding that the information on the Related Product, Up Sale, Cross Sale pages must be filled before registration.")
    public void confirmed_that_the_message_on_the_save_button_is_visible_reminding_that_the_information_on_the_related_product_up_sale_cross_sale_pages_must_be_filled_before_registration() {

        ReusableMethods.waitFor(4);
        adminProductsPage.firstbutton.click();
        adminProductsPage.actionSelect.click();
        adminProductsPage.actionClone.click();
        actions.keyDown(Keys.END).perform();
        actions.keyUp(Keys.END).perform();
        assertTrue(adminProductsPage.warningLetter.isDisplayed());

    }


    @Given("After updating the requested information on the General Information, Related Product, Up Sale, Cross Sale pages, it has been verified that the updated information is saved with the Save button.")
    public void after_updating_the_requested_information_on_the_general_ınformation_related_product_up_sale_cross_sale_pages_it_has_been_verified_that_the_updated_information_is_saved_with_the_save_button() {
        ReusableMethods.waitFor(4);
        adminProductsPage.firstbutton.click();
        adminProductsPage.actionSelect.click();
        adminProductsPage.actionClone.click();

        adminProductsPage.productİnformationName.clear();
        adminProductsPage.productİnformationName.sendKeys("glasses");
        adminProductsPage.productSku.clear();
        adminProductsPage.productSku.sendKeys("glasses1");

        adminProductsPage.priceInfoAndStock.click();
        adminProductsPage.priceInfoAndStock.click();
        adminProductsPage.weight.clear();
        adminProductsPage.weight.sendKeys("601");
        adminProductsPage.length.clear();
        adminProductsPage.length.sendKeys("31");
        adminProductsPage.breadth.clear();
        adminProductsPage.breadth.sendKeys("21");
        adminProductsPage.height.clear();
        adminProductsPage.height.sendKeys("21");
        adminProductsPage.addtionalShippingCharge.clear();
        adminProductsPage.addtionalShippingCharge.sendKeys("1");
        adminProductsPage.productStock.clear();
        adminProductsPage.productStock.sendKeys("1001");
        adminProductsPage.sellingPrice.clear();
        adminProductsPage.sellingPrice.sendKeys("17");

        assertTrue(adminProductsPage.productImageInfo.isEnabled());
        assertTrue(adminProductsPage.pdfSpecifications.isEnabled());
        adminProductsPage.videoLink.click();
        adminProductsPage.videoLink.sendKeys("https://www.youtube.com/watch?v=rav6sDe5huU");

        assertTrue(adminProductsPage.RelatedProduct.isEnabled());
        adminProductsPage.RelatedProduct.click();
        assertTrue(adminProductsPage.UpSale.isEnabled());
        adminProductsPage.UpSale.click();
        assertTrue(adminProductsPage.CrossSale.isEnabled());
        adminProductsPage.CrossSale.click();
        assertTrue(adminProductsPage.saveBtn.isEnabled());


    }

    @Given("It has been verified that the Delete link is visible on the select tab in the Action column in the Product List and that the Delete operation can be performed when clicked.")
    public void ıt_has_been_verified_that_the_delete_link_is_visible_on_the_select_tab_in_the_action_column_in_the_product_list_and_that_the_delete_operation_can_be_performed_when_clicked() {

        ReusableMethods.waitFor(4);
        adminProductsPage.firstbutton.click();
        System.out.println(adminProductsPage.productListfirst.getText());
        assertTrue(adminProductsPage.productListfirst.isDisplayed());
        adminProductsPage.actionSelect.click();
        ReusableMethods.waitFor(3);
        assertTrue(adminProductsPage.actionDelete.isDisplayed());
        adminProductsPage.actionDelete.click();
        adminProductsPage.finalDelete2.click();
        ReusableMethods.waitFor(3);
        assertTrue(adminProductsPage.productListfirst.isDisplayed());


    }



}