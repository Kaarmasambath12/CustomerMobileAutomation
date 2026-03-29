package testcase;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;

import java.io.IOException;

public class EditProfileTestCase extends BaseClass {
    public LoginPage loginPage;
    public ProfilePage profilePage;


   @Test
   public void editProfileTestCase() throws IOException, InterruptedException {
       loginPage  = new LoginPage();
       profilePage = new ProfilePage();

       loginPage.clickNotificationAllow();
       loginPage.clickLoginButton();
       loginPage.loginWithMobileAndOTP("9003349787", "123456");
       profilePage.editProfileAndSave();


    }


}
