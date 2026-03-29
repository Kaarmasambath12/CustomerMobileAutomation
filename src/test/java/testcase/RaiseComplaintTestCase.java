package testcase;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.CompliantPage;
import pages.LoginPage;

import java.io.IOException;

public class RaiseComplaintTestCase extends BaseClass {
    public LoginPage loginPage;
    public CompliantPage compliantPage;


   @Test
   public void raiseComplaintTestCase() throws IOException, InterruptedException {
       loginPage  = new LoginPage();
       compliantPage = new CompliantPage();

       loginPage.clickNotificationAllow();
       loginPage.clickLoginButton();
       loginPage.loginWithMobileAndOTP("9003349787", "123456");
       compliantPage.raiseComplaintFunction();


    }


}
