package testcase;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.ConsultationsPage;
import pages.LoginPage;

import java.io.IOException;

public class ConsultationCancellationTestCase extends BaseClass {
    public LoginPage loginPage;
    public ConsultationsPage consultationsPage;


   @Test
   public void consultationCancellationTestCase() throws IOException{
       loginPage  = new LoginPage();
       consultationsPage = new ConsultationsPage();

       loginPage.clickNotificationAllow();
       loginPage.clickLoginButton();
       loginPage.loginWithMobileAndOTP("9003349787", "123456");
       consultationsPage.cancelConsultationAndVerify();


   }


}
