package pages;

import Device.DriverThreadManager;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ActionUtilities;

import java.io.IOException;
import java.time.Duration;


public class ConsultationsPage extends ActionUtilities {

    public ConsultationsPage() {

        PageFactory.initElements(new AppiumFieldDecorator(DriverThreadManager.getDriver()), this);
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Consultation\n" +
            "Tab 3 of 5\"]")
    public WebElement consultationIcon;

    @FindBy(xpath = "//android.view.View[@content-desc=\"COMPLETED\"]")
    public WebElement completedTab;

    @FindBy(xpath = "//android.view.View[@content-desc=\"CANCELLED\"]")
    public WebElement cancelledTab;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"cancel_consultation_button\"]")
    public WebElement closeButton;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]")
    public WebElement cancelButton;

    @FindBy(xpath = "//android.widget.EditText[@text=\"cancel_cons_alert_field\"]")
    public WebElement cancelInputField;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"cons_cancel_confirm_button\"]")
    public WebElement confirmButton;


    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")
    public WebElement videoButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"continue_cons_button\"]")
    public WebElement continueButton;

    // Check if Continue Button is Disabled
    public boolean isContinueButtonDisabled() {
        return !continueButton.isEnabled();
    }

    public void performConsultationAndCheckContinueDisabled() throws IOException {
        click(consultationIcon);
        click(videoButton);
        click(continueButton);
        isContinueButtonDisabled();

    }

    public boolean cancelConsultationAndVerify() throws IOException {
        WebDriverWait wait = new WebDriverWait(DriverThreadManager.getDriver(), Duration.ofSeconds(10));

        // Click Consultation Icon
        wait.until(ExpectedConditions.visibilityOf(consultationIcon));
        click(consultationIcon);

        // Click Cancel Button
        wait.until(ExpectedConditions.visibilityOf(cancelButton));
        click(cancelButton);

        // Enter reason in Cancel Input Field
        wait.until(ExpectedConditions.visibilityOf(cancelInputField));
        sendKey(cancelInputField, "Test cancellation");

        // Click Confirm Button
        wait.until(ExpectedConditions.elementToBeClickable(confirmButton));
        click(confirmButton);

        // Wait for Cancelled Tab
        wait.until(ExpectedConditions.visibilityOf(cancelledTab));

        // Optional: Close popup / screen if present
        if (closeButton.isDisplayed()) {
            click(closeButton);
        }

        // Verify Cancelled Tab is displayed
        return cancelledTab.isDisplayed();
    }




}
