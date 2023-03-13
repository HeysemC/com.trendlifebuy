package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminLoginPage {

   public AdminLoginPage(){PageFactory.initElements(Driver.getDriver(),this);}

    //admin login >email
    @FindBy(xpath = "//input[@name='login']")
    public WebElement eMail;

    //admin login >password
    @FindBy(xpath ="//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Sign In']")
    public WebElement signInButton;

    // admin ikonu(tuncay)
    @FindBy(xpath = "//*[@id='profile_pic']")
    public WebElement profilikonu;

    // admin ikonu/admin ismi(tuncay)
    @FindBy(xpath = "//*[text()='Admin019']")
    public WebElement adminName;
    //zil butonu(tuncay)
    @FindBy(xpath ="//*[@class='scroll_notification_list']") ////*[@class='fa fa-bell']
    public WebElement zilButtonu;

    //zil buton/setting(tuncay)
    @FindBy(xpath = "//a[text()='Setting']")
    public WebElement settingButton;

    // zil button/notificatin yazısı(tuncay)
    @FindBy(xpath = "//*[text()='Notifications']")
    public  WebElement notificationText;

    //zil button/Setting yazısı(tuncay)
    @FindBy(xpath = "//*[text()='Setting']")
    public WebElement SettingButton;

   //zil button/Setting/type sütunu 1.sıra(tuncay)
    @FindBy(xpath = "(//span[@class='checkmark'])[1]")
    public WebElement checkmark;
    @FindBy(xpath = "//tbody/tr/td[2]//span")
    public WebElement tbody;

    //admin icon/my profil(tuncay)
    @FindBy(xpath = "//*[text()='My Profile']")
    public WebElement myProfil;

    //admin icon/log out(tuncay)
    @FindBy(xpath = "//*[text()='Log out']")
    public WebElement logOut;

    //admin loginPage dashboard başlığı(tuncay)
    @FindBy(xpath = "(//span[@class='menu_seperator'])[1]")
    public WebElement dashboard;

 //admin loginPage dashboard başlığı altındaki dashboard(tuncay)
   @FindBy(xpath = "(//div[@class='nav_title'])[1]")
   public WebElement subDashboard;

  //zil button/read all yazısı(tuncay)
  @FindBy(xpath = "//*[text()='Read all']")
  public WebElement readAll;

  //zil button/view yazısı(tuncay)
  @FindBy(xpath = "//*[text()='View']")
  public WebElement view;

  //zil button/noNotificationFound yazısı(tuncay)
  @FindBy(xpath = "//div[@class='notify_content']")
  public WebElement noNotificationFound;

  //admin icon/my profil/adress(tuncay)
  @FindBy(xpath = "//a[text()='Address']")
  public WebElement adress;

 //admin icon/my profil/adress(tuncay)
  @FindBy(xpath ="//*[@id=\"address_table\"]/tbody/tr/td[2]")
  public  WebElement adresSutunuIlkSatir;

 //admin icon/my profil/adress/addNewAddress(tuncay)
  @FindBy(xpath = "//*[@class='primary-btn radius_30px mr-10 fix-gr-bg add_new_address']")
 public WebElement addNewAddress;
 //admin icon/my profil/adress/addNewAddress/name(tuncay)
  @FindBy(xpath = "//*[@id='address_name']")
 public WebElement addressName;

 //admin icon/my profil/adress/addNewAddress/select from obtion(tuncay)
  @FindBy(xpath = "//span[text()='Select from options']")
 public WebElement selectFromOptionsButton;

 //admin icon/my profil/adress/addNewAddress/select from obtion/aberdeen(tuncay)
  @FindBy(xpath = "//li[text()='Aberdeen']")
    public WebElement Aberdeen;

 //admin icon/my profil/adress/addNewAddress/postal code(tuncay)
 @FindBy(xpath = "//*[@id='postal_code']")
 public WebElement postalCodeButton;

 //admin icon/my profil/adress/addNewAddress/saveButton(tuncay)
 @FindBy(xpath = "(//button[text()='Save'])[3]")
 public WebElement saveButton;

 //admin icon/my profil/adress(tuncay)
 @FindBy(xpath ="//*[@id=\"address_table\"]/tbody/tr[2]/td[2]")
 public  WebElement adresSutunuIkinciSatir;

}
