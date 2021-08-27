package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class LoginPage extends Base {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "email")
    WebElement userName;

    @FindBy(id = "pass")
    WebElement password;

    @FindBy(name = "login")
    WebElement logInButton;

    @FindBy(how = How.XPATH, using = "//*[text()='Vesuwala Rahul']")
    WebElement checkName;

    @FindBy(css =("[aria-label='Account']"))
    WebElement account;

    @FindBy(css=("span[style*=\"webkit-box-orient\"]"))
    WebElement ProfileOpen;

   @FindBy(how = How.XPATH, using = "//*[text()='Manage posts']")
   WebElement profileManage;

    @FindBy(how = How.XPATH, using = "//*[text()='Settings & privacy']")
    WebElement settings;


   @FindBy(how = How.XPATH, using = "//span[@dir='auto'][text()='Log Out']")
    WebElement logOut;


    public void enterFullName(String fullName) {
        userName.sendKeys(fullName);
    }

    public void enterPassword(String passWord) {

        password.sendKeys(passWord);
    }

    public void submitLogin()
    {
        logInButton.click();
    }

    public WebElement getCheckName()
    {
        return checkName;
    }

    public String getUserName()
    {
        return getCheckName().getText();
    }

    public void accountOpen(){
              account.click();

    }


    public void profileOpen(){

        ProfileOpen.click();

    }
    public void profileManage(){

        profileManage.click();

    }
    public void settings(){

        settings.click();

    }

    public void logOutPage(){
        //Dynamic Wait
        clickOn(logOut, 20);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void clickOn(WebElement element, int timeout){
        new WebDriverWait(driver, timeout)
        .until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }


    }




