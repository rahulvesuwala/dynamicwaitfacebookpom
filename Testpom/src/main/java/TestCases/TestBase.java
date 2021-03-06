package TestCases;


import Page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver = null;


    @BeforeSuite
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "/Users/imac/Documents/Chrome/chromedriver");
        driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }

    @BeforeMethod
    public void login() {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.enterFullName("rahul.rahulalphabin@gmail.com");
        loginpage.enterPassword("Rahul@123");
        loginpage.submitLogin();

    }


   @AfterMethod
    public void logOut() {
         LoginPage loginpage = new LoginPage(driver);
         loginpage.accountOpen();
         loginpage.logOutPage();
              }

    @AfterSuite
    public void teardown() {
        System.out.println("Running afterSuite.");

    //static Wait
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }

}
