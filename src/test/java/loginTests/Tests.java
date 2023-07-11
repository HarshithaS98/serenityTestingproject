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
@RunWith(SerenityRunner.class)
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


}
