package pages;

import Device.DriverThreadManager;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ActionUtilities;

import java.io.IOException;
import java.time.Duration;


public class LoginPage  extends ActionUtilities {

    public LoginPage() {

        PageFactory.initElements(new AppiumFieldDecorator(DriverThreadManager.getDriver()), this);
    }

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")
    public WebElement notificationAllowButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"login_button\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]")
    public WebElement mobileNumberField;

    @FindBy(xpath = "//android.widget.EditText")
    public WebElement mobileNumberFieldTwo;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"login_next_screen\"]")
    public WebElement nextButton;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.EditText[1]")
    public WebElement OTPFirstField;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.EditText[2]")
    public WebElement OTPSecondField;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.EditText[3]")
    public WebElement OTPThirdField;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.EditText[4]")
    public WebElement OTPFourthField;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.EditText[5]")
    public WebElement OTPFifthField;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.EditText[6]")
    public WebElement OTPSixthField;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"verify_otp_button\"]")
    public WebElement verifyOTP;



    public void clickNotificationAllow() throws IOException {
        click(notificationAllowButton);

    }

    // Click Login Button
    public void clickLoginButton() {
        loginButton.click();
    }

    public void loginWithMobileAndOTP(String mobileNumber, String otp) throws IOException {
        sendKey(mobileNumberFieldTwo, mobileNumber);
        nextButton.click();
        enterOTP(otp);
        verifyOTP.click();
    }

    private void enterOTP(String otp) {
        OTPFirstField.sendKeys(String.valueOf(otp.charAt(0)));
        OTPSecondField.sendKeys(String.valueOf(otp.charAt(1)));
        OTPThirdField.sendKeys(String.valueOf(otp.charAt(2)));
        OTPFourthField.sendKeys(String.valueOf(otp.charAt(3)));
        OTPFifthField.sendKeys(String.valueOf(otp.charAt(4)));
        OTPSixthField.sendKeys(String.valueOf(otp.charAt(5)));
    }
}
