package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends Base {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//*[text()='Vesuwala Rahul']")
    WebElement checkName;

    public WebElement getCheckName() {
        return checkName;
    }

        public String getUserName() {
        return getCheckName().getText();
    }

}
