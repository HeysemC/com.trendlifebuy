package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.Driver;
public class US003 {
    HomePage homePage = new HomePage();

    @Given("All Categories menusune tiklar ve icerikleri dogrular.")
    public void all_categories_menusune_tiklar_ve_icerikleri_dogrular() {
        String[] menuItems = {
                                "Computer & Accessories",
                                "Electronics Devices",
                                "Watches & Accessories",
                                "Fashions",
                                "Toys , Kids & Babies",
                                "Bag & Shoes",
                                "Lifestyle & Home",
                                "TV & Home Appliances",
                                "Auto Mobiles & bikes"};
        homePage.allCategoriesDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < homePage.allCategoriesDropdownItems.size(); i++) {
            softAssert.assertTrue(homePage.allCategoriesDropdownItems.get(i).getText().equals(menuItems[i]));
            //System.out.println(homePage.allCategoriesDropdownItems.get(i).getText());
        }
        softAssert.assertAll();
    }

    @Given("All Categories menusune tiklar ve alt sekmelerin gorunur oldugunu dogrular.")
    public void All_categories_menusune_tiklar_ve_alt_sekmelerin_gorunur_oldugunu_dogrular() {
        homePage.allCategoriesDropDownMenu.click();
        Actions actions = new Actions(Driver.getDriver());
        for(int i = 0; i < homePage.allCategoriesDropdownItems.size(); i++) {
            actions.moveToElement(homePage.allCategoriesDropdownItems.get(i)).perform();
        }
    }
}
