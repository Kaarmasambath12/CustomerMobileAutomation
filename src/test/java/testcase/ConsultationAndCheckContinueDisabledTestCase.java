package testcase;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.ConsultationsPage;
import pages.FindLawyerPage;
import pages.LoginPage;

import java.io.IOException;

public class ConsultationAndCheckContinueDisabledTestCase extends BaseClass {
    public LoginPage loginPage;
    public ConsultationsPage consultationsPage;


   @Test
   public void consultationVideoTestCase() throws IOException{
       loginPage  = new LoginPage();
       consultationsPage = new ConsultationsPage();

       loginPage.clickNotificationAllow();
       loginPage.clickLoginButton();
       loginPage.loginWithMobileAndOTP("9003349787", "123456");
       consultationsPage.performConsultationAndCheckContinueDisabled();


   }


}
