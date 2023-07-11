package Steps;

import net.thucydides.core.annotations.Step;
import parabank.loginPage;

public class loginSteps
{
    private loginPage login;
    @Step
    public  void isOnLoginPage()
    {
        login.open();
    }
    @Step
    public  void loginasUser()
    {
        login.doLogin();
    }

}
