package testcase;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;

public class WithdrawMoneyTestCase extends BaseClass {
    public LoginPage loginPage;
    public HomePage homePage;


   @Test
   public void withdrawMoneyTestCase() throws IOException, InterruptedException {
       loginPage  = new LoginPage();
       homePage = new HomePage();

       loginPage.clickNotificationAllow();
       loginPage.clickLoginButton();
       loginPage.loginWithMobileAndOTP("9003349787", "123456");
       homePage.withdrawMoneyFlow("2000");


    }


}
