package testcase;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;

public class AddMoneyTestCase extends BaseClass {
    public LoginPage loginPage;
    public HomePage homePage;


   @Test
   public void addMoneyTestCase() throws IOException, InterruptedException {
       loginPage  = new LoginPage();
       homePage = new HomePage();

       loginPage.clickNotificationAllow();
       loginPage.clickLoginButton();
       loginPage.loginWithMobileAndOTP("9003349787", "123456");
       homePage.addMoneyFlow("2000");


    }


}
