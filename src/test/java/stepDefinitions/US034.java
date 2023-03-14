package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboardPageHeysem;
import pages.AdminLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US034 {
    AdminLoginPage adminLoginPage;
    AdminDashboardPageHeysem adminDashboardPageHeysem;
    private static final Logger logger = LogManager.getLogger();

    @Given("Navigatee to {string}")
    public void navigateeTo(String string) {
            Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
            logger.info("siteye gidildi");
    }
    @And("Entere {string} and {string} and click sing in button")
    public void entereAndAndClickSingInButton(String eMail, String password) {

        adminLoginPage=new AdminLoginPage();
        adminLoginPage.eMail.sendKeys(ConfigReader.getProperty("adminHeysemEmail"));
        adminLoginPage.password.sendKeys(ConfigReader.getProperty("adminHeysemPassword"));
        adminLoginPage.signInButton.click();
        logger.info("admin girişi yapıldı");
        ReusableMethods.waitFor(4);
    }
    @Then("Click Add New Product button")
    public void clickAddNewProductButton() {
        adminDashboardPageHeysem = new AdminDashboardPageHeysem();
        adminDashboardPageHeysem.productsButton.click();
        logger.info("product button click");
        ReusableMethods.waitFor(2);
    }
    @Then("Verify Add New Product is displayed")
    public void verifyAddNewProductIsDisplayed() {
        adminDashboardPageHeysem =new AdminDashboardPageHeysem();
        Assert.assertTrue(adminDashboardPageHeysem.addNewproduct1.isDisplayed());
        logger.info("Add New Button Doğrulandı");
    }
    @Then("Verify General Information, Related Product, Up Sale, Cross sale is displayed")
    public void verifyGeneralInformationRelatedProductUpSaleCrossSaleIsDisplayed() {

        adminDashboardPageHeysem =new AdminDashboardPageHeysem();
        adminDashboardPageHeysem.addNewproduct.click();
        ReusableMethods.waitFor(2);
        adminDashboardPageHeysem.generalInformation.click();
        Assert.assertTrue(adminDashboardPageHeysem.generalInformation.isDisplayed());
        logger.info("generalInformation Doğrulandı");
        adminDashboardPageHeysem.relatedProduct.click();
        Assert.assertTrue(adminDashboardPageHeysem.relatedProduct.isDisplayed());
        logger.info("related Product Doğrulandı");
        adminDashboardPageHeysem.upSale.click();
        Assert.assertTrue(adminDashboardPageHeysem.upSale.isDisplayed());
        logger.info("up Sale Doğrulandı");
        adminDashboardPageHeysem.crossSale.click();
        Assert.assertTrue(adminDashboardPageHeysem.crossSale.isDisplayed());
        logger.info("cross Sale Doğrulandı");
    }
    @Then("Product Information bölümünde Type seceneklerinin oldugu dogrulanmali")
    public void productInformationBölümündeTypeSeceneklerininOlduguDogrulanmali() {
        adminDashboardPageHeysem=new AdminDashboardPageHeysem();
        adminDashboardPageHeysem.addNewproduct.click();
        logger.info("Add New Button tıklandı");
        ReusableMethods.waitFor(4);
        Assert.assertTrue(adminDashboardPageHeysem.singleButton.isDisplayed());
        logger.info("Single button Doğrulandı");
        Assert.assertTrue(adminDashboardPageHeysem.variantButton.isDisplayed());
        logger.info("Variant button Doğrulandı");
    }
    @Then("Secilen Type göre istenilen bilgilerin degistigi dogrulanmali")
    public void secilenTypeGöreIstenilenBilgilerinDegistigiDogrulanmali() {
        SoftAssert softAssert=new SoftAssert();
        adminDashboardPageHeysem=new AdminDashboardPageHeysem();
        adminDashboardPageHeysem.singleButton.click();
        logger.info("single button tıkklandı");
        softAssert.assertTrue(adminDashboardPageHeysem.productSku.isDisplayed());
        logger.info("Product sku Doğrulandı");
        adminDashboardPageHeysem.variantButton.click();
        logger.info("Variant button tıklandı");
        softAssert.assertTrue(adminDashboardPageHeysem.subtitle_1.isDisplayed());
        logger.info("subtitle 1 Doğrulandı");
        softAssert.assertAll();
    }
    @Then("Closee the page")
    public void closeeThePage() {
        Driver.closeDriver();
    }

    @Then("Name,Product SKU,Model Number,Category,Brand, Unit,Barcod Type,Minimum Order QTY,Max Order QTY,Tags Text Box'larinin görünür oldugu dogrulanmali")
    public void nameProductSKUModelNumberCategoryBrandUnitBarcodTypeMinimumOrderQTYMaxOrderQTYTagsTextBoxLarininGörünürOlduguDogrulanmali() {
        SoftAssert softAssert=new SoftAssert();
        adminDashboardPageHeysem=new AdminDashboardPageHeysem();
        adminDashboardPageHeysem.addNewproduct.click();
        ReusableMethods.waitFor(4);
        softAssert.assertTrue(adminDashboardPageHeysem.name.isDisplayed());
        logger.info("Name Doğrulandı");
        softAssert.assertTrue(adminDashboardPageHeysem.productSku.isDisplayed());
        logger.info("Product SKU Doğrulandı");
        softAssert.assertTrue(adminDashboardPageHeysem.modelNumber.isDisplayed());
        logger.info("Model Number Doğrulandı");
        softAssert.assertTrue(adminDashboardPageHeysem.category.isDisplayed());
        logger.info("Category Doğrulandı");
        softAssert.assertTrue(adminDashboardPageHeysem.brand.isDisplayed());
        logger.info("Brand Doğrulandı");
        softAssert.assertTrue(adminDashboardPageHeysem.unit.isDisplayed());
        logger.info("Unit Doğrulandı");
        softAssert.assertTrue(adminDashboardPageHeysem.barcodeType.isDisplayed());
        logger.info("Barcode Type Doğrulandı");
        softAssert.assertTrue(adminDashboardPageHeysem.minimumorderQty.isDisplayed());
        logger.info("minimum order Qty Doğrulandı");
        softAssert.assertTrue(adminDashboardPageHeysem.maxOrderQty.isDisplayed());
        logger.info("max order Qty Doğrulandı");
        softAssert.assertTrue(adminDashboardPageHeysem.tagsCommaSeparated.isDisplayed());
        logger.info("tags (Comma Separated) Doğrulandı");
    }


    @Then("Category Add New linkine tıklandığında Create Category penceresinin açıldığı doğrulanmalı")
    public void categoryAddNewLinkineTiklandigindaCreateCategoryPenceresininAcildiğiDoğrulanmali() {
        adminDashboardPageHeysem.addNewproduct.click();
        adminDashboardPageHeysem.categoryAddNew.click();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(adminDashboardPageHeysem.createCategory.isDisplayed());





    }
}
