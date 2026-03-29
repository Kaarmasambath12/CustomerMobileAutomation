package testcase;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;

public class AddUPITestCase extends BaseClass {
    public LoginPage loginPage;
    public HomePage homePage;


   @Test
   public void addUPITestCase() throws IOException, InterruptedException {
       loginPage  = new LoginPage();
       homePage = new HomePage();

       loginPage.clickNotificationAllow();
       loginPage.clickLoginButton();
       loginPage.loginWithMobileAndOTP("9003349787", "123456");
       homePage.addUPIAccountFunctionality("skarthik@okicici");


    }


}
