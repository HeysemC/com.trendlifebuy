package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboardPage {

    public AdminDashboardPage(){PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//span[text()='Customer']")
    public WebElement CustomerButton;

    @FindBy(xpath = "//ul[@class='mm-collapse mm-show']")
    public WebElement AllCustomerButton;

    @FindBy(xpath = "(//div[@class='dataTables_info'])[1]")
    public WebElement CustomerListElement;

    @FindBy(xpath = "(//div[@class='slider round'])[1]")
    public WebElement isActiveRadioButton;

    @FindBy(xpath = "//div[@class='toast toast-success']")
    public WebElement ToastMessageSuccess;

    @FindBy(xpath = "//a[text()='Active Customer']")
    public WebElement ActiveCustomerButton;

    @FindBy(xpath = "//h3[text()='Active Customer']")
    public WebElement ActiveCustomerText;

    @FindBy(xpath = "(//td[@class='sorting_1'])[2]")
    public WebElement ActiveCustomerRoleButton;

    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
    public WebElement RoleButton;

    //(//td[@class='sorting_1'])[2]
    //(//td[@class='sorting_1'])[1]
    @FindBy(xpath = "(//button[@id='dropdownMenu2'])[2]")
    public WebElement RoleSelectButton;

    @FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']")
    public WebElement SelectDropdownMenu;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement DetailsButton;

    //(//a[@class='dropdown-item'])[1]
    //(//a[text()='Details'])[1]
    @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement CustomerSearchBox;

    @FindBy(xpath = "//a[text()='Michel']")
    public WebElement CustomerName;

    @FindBy(xpath = "//h3[text()='Customer Profile']")
    public WebElement CustomerProfile;

    @FindBy(xpath = "//a[text()='orders']")
    public WebElement OrdersButton;

    @FindBy(xpath = "//a[text()='wallet histories']")
    public WebElement WalletHistoriesButton;

    @FindBy(xpath = "//a[text()='Addresses']")
    public WebElement AdressesButton;

    @FindBy(xpath = "//th[text()='Date']")
    public WebElement DateButton;

    @FindBy(xpath = "//th[text()='User']")
    public WebElement UserButton;

    @FindBy(xpath = "//th[text()='TXN ID']")
    public WebElement TXTButton;

    @FindBy(xpath = "//th[text()='Amount']")
    public WebElement AmountButton;

    @FindBy(xpath = "//th[text()='Type']")
    public WebElement TypeButton;

    @FindBy(xpath = "//th[text()='Payment Method']")
    public WebElement PaymentMethodButton;

    @FindBy(xpath = "//th[text()='Approval']")
    public WebElement ApprovalButton;

    @FindBy(xpath = "//td[text()='michel11@gmail.com']")
    public WebElement MichelEmail;

    @FindBy(xpath = "(//a[text()='Edit'])[2]")
    public WebElement EditButton;

    //(//a[@class='dropdown-item'])[2]
    //(//a[text()='Edit'])[2]
    //(//a[@href='https://qa.trendlifebuy.com/admin/customer/1010/edit'])[2]
    @FindBy(xpath = "//h3[text()='Update Customer']")
    public WebElement UpdateCustomerPage;

    @FindBy(xpath = "//h3[text()='Basic Info']")
    public WebElement BasicInfo;

    @FindBy(xpath = "//button[@id='save_button_parent']")
    public WebElement EditUpdateButton;

    @FindBy(xpath = "//div[text()='Updated successfully!']")
    public WebElement UpdateSuccessMessage;

    @FindBy(xpath = "(//a[text()='Delete'])[2]")
    public WebElement DeleteButton;

    @FindBy(xpath = "//a[@id='delete_link']")
    public WebElement DeleteLink;

    @FindBy(xpath = "//h4[text()='Delete  ']")
    public WebElement DeletePage;

    @FindBy(xpath = "//div[text()='Deleted successfully!']")
    public WebElement DeleteMessage;

    @FindBy(xpath = "//a[text()='Inactive customer']")
    public WebElement InaktiveCustomerButton;

    @FindBy(xpath = "(//h3[@class='mb-0 mr-30 mb_xs_15px mb_sm_20px'])[3]")
    public WebElement InaktiveCutsomerPage;

    @FindBy(xpath = "//a[text()='Create Customer']")
    public WebElement CreateCustomerButton;

    @FindBy(xpath = "//h3[text()='Add New Customer']")
    public WebElement AddNewCustomerPage;
}
