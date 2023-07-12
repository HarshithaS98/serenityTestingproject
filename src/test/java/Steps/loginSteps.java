package Steps;

import net.thucydides.core.annotations.Step;
import parabank.loginPage;
import net.thucydides.core.annotations.Step;
import parabank.loginPage;

public class loginSteps {
    private loginPage LoginPage; // Declare the LoginPage object

    //public void setLoginPage(loginPage LoginPage)
    //{
      //  this.LoginPage = LoginPage;
    //}
    @Step("Enter username: {0}")

    public void enterUsername(String username)
    {
       LoginPage.enterUsername(username);
    }

    @Step("Enter password: {0}")
    public void enterPassword(String password)
    {
        LoginPage.enterPassword(password);
    }
}










/**public class loginSteps
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

}**/
