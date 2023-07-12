package loginTests;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.SerenityReports;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Steps.loginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Steps.loginSteps;

@RunWith(SerenityRunner.class)
public class Tests {
    @Managed
    private WebDriver driver;

    @Steps
    public loginSteps LoginSteps;

    @Test
    public void performLogin() {
        // Open the URL
        driver.get("https://parabank.parasoft.com/parabank");

        // Perform login steps
        LoginSteps.enterUsername("RosieW");
        LoginSteps.enterPassword("888888");

        // Additional assertions and verifications
    }
}
















/**@RunWith(SerenityRunner.class)
public class Tests  {
    @Steps
    loginSteps loginPagesteps;
    @Managed(driver = "chrome")
    WebDriver browser;
    @Test
    public  void appLoginTest()
    {
        loginSteps.isOnLoginPage();
        loginSteps.loginasUser();
    }


}**/
