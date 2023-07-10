package parabank;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WithLocator;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://parabank.parasoft.com/parabank/index.htm")
public class loginPage extends PageObject
{
    public void doLogin()
    {
        //$(xpathOrCssSelector:"username").sendKeys(...keysToSend:"dec")
        $(By.name("username")).sendKeys("ChandraT");
        $(By.name("password")).sendKeys("222222");
        $(By.className("button")).click();
    }

}
