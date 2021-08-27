package TestCases;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Page.LoginPage;

import java.security.SecureRandom;


public class TestCase extends TestBase {

    @Test(priority=1)
    public void verifyUserProflie() {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.getCheckName();
        String actualString = loginpage.getUserName();
        String expectedSrting = "Vesuwala Rahul";
        Assert.assertEquals(actualString, expectedSrting, "User should be Enter Valid UserName & PassWord\n");
    }
    @Test(priority=2)
    public void  accountNavgtionOpen()
    {  LoginPage loginpage = new LoginPage(driver);

    }

    @Test(priority=3)
    public void profliePageOpen(){
        LoginPage loginpage = new LoginPage(driver);
        loginpage.profileOpen();

        //  loginpage.profileManage();
    }
}