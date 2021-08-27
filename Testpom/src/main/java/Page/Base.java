package Page;

import org.openqa.selenium.support.PageFactory;

import static TestCases.TestBase.driver;

public class Base {

    public Base() {

        PageFactory.initElements(driver, this);
    }

}
