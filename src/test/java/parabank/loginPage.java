package parabank;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WithLocator;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    private WebDriver driver;
    private By usernameField = By.name("username");
    private By passwordField = By.name("password");

    public loginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterUsername(String username)
    {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
    }
}

/**@DefaultUrl("https://parabank.parasoft.com/parabank/index.htm")
public class loginPage extends PageObject
{
    public  void doLogin()
    {
        //$(xpathOrCssSelector:"username").sendKeys(...keysToSend:"dec")
        $(By.name("username")).sendKeys("ChandraT");
        $(By.name("password")).sendKeys("222222");
        $(By.className("button")).click();
    }

}**/
