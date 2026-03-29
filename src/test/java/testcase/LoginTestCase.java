package testcase;

import base.BaseClass;
import dataDriven.DataProviderClass;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.IOException;

public class LoginTestCase extends BaseClass {
    public LoginPage loginPage;


   @Test
   public void loginTestCase() throws IOException, InterruptedException {
        loginPage  = new LoginPage();
        loginPage.clickNotificationAllow();
        loginPage.clickLoginButton();
        loginPage.loginWithMobileAndOTP("9003349787", "123456");

    }


}
