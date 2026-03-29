package testcase;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.FindLawyerPage;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;

public class FindLawyerSearchFilterTestCase extends BaseClass {
    public LoginPage loginPage;
    public FindLawyerPage findLawyerPage;


   @Test
   public void findLawyerSearchFilterTestCase() throws IOException, InterruptedException {
       loginPage  = new LoginPage();
       findLawyerPage = new FindLawyerPage();

       loginPage.clickNotificationAllow();
       loginPage.clickLoginButton();
       loginPage.loginWithMobileAndOTP("9003349787", "123456");
       findLawyerPage.searchAndFilterLawyer("Karthik", 90);


    }


}
