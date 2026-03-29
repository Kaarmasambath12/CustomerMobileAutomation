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
import utilities.ActionUtilities;
import utilities.DateUtilities;

import java.io.IOException;
import java.security.cert.X509Certificate;
import java.time.Duration;


public class FindLawyerPage extends ActionUtilities {

    public FindLawyerPage() {

        PageFactory.initElements(new AppiumFieldDecorator(DriverThreadManager.getDriver()), this);
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Find Lawyer\n" +
            "Tab 2 of 5\"]")
    public WebElement findLawyer;

    @FindBy(xpath = "//android.widget.EditText")
    public WebElement searchField;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"find_law_search_icon_button\"]")
    public WebElement searchIcon;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]")
    public WebElement bookMarkIcon;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]")
    public WebElement backButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Today\"]")
    public WebElement todaySelection;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Tomorrow\"]")
    public WebElement tomorrowSelection;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")
    public WebElement filterIcon;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"select_lawyer_type\n" +
            "Specialization\"]")
    public WebElement selectSpecialization;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Criminal law\"]")
    public WebElement criminalLawyer;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"show_lawyer_button\"]")
    public WebElement showLawyerButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"0.0/5 Ex: 3 years\"]/android.widget.ImageView[2]")
    public WebElement lawyerIcon;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")
    public WebElement lawyerProfileBackButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"0.0/5 Ex: 3 years\n" +
            "+3\"]/android.widget.ImageView[3]")
    public WebElement chatIcon;

    @FindBy(xpath = "//android.view.View[@content-desc=\"30 min\"]")
    public WebElement durationIcon;

    @FindBy(xpath = "//android.widget.EditText[@text=\"instant_cons_description_input_field\"]")
    public WebElement issueField;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"book_instant_cons_button\"]")
    public WebElement requestCallButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"0.0/5 Ex: 3 years\"]/android.widget.ImageView[2]")
    public WebElement lawyerProfileIcon;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"schedule_button\"]")
    public WebElement scheduleButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"08:00 AM - 12:00 PM\"]")
    public WebElement availabilityTime;

    @FindBy(xpath = "//android.view.View[@content-desc=\"select_specialization_chip\n" +
            "Criminal law\"]")
    public WebElement specializationSelection;

    @FindBy(xpath = "//android.view.View[@content-desc=\"15-mins Consultation\"]")
    public WebElement consultationTime;

    @FindBy(xpath = "//android.view.View[@content-desc=\"08:00 AM - 08:15 AM\"]")
    public WebElement timeSlotSelection;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.View[13]")
    public WebElement recordEnableButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"select_add_on_chip\n" +
            "POLICE\"]")
    public WebElement adOnsField;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"continue_to_pay_button\"]")
    public WebElement payButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"edit_cons_sum_button\"]")
    public WebElement editButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"select_add_on_chip\n" +
            "FAMILY\"]")
    public WebElement familyAdOnsField;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Consultation Summary\"]")
    public WebElement discountCoupon;

    @FindBy(xpath = "//android.widget.EditText")
    public WebElement couponField;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"add_coupon_or_discount_button\"]")
    public WebElement couponAddButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"My Balance\n" +
            "₹4,882.00\"]")
    public WebElement myBalance;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"pay_now_from_my_bal_button\"]")
    public WebElement paymentButton;



    public WebElement scrollToElementByAccessibilityId(String element) {
        return DriverThreadManager.getDriver().findElement(
                AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true))" +
                                ".scrollIntoView(new UiSelector().description(\"" + element + "\"))"
                )
        );
    }



    public void searchAndFilterLawyer(String lawyerName, int percentage) throws IOException {

        click(findLawyer);
        click(searchField);
        sendKey(searchField, lawyerName);
        click(searchIcon);
        click(bookMarkIcon);
        click(backButton);
        click(todaySelection);
        click(tomorrowSelection);
        click(filterIcon);
        click(selectSpecialization);
        click(criminalLawyer);
        setSeekBarPercentage(percentage);
        click(showLawyerButton);
    }


    public void setSeekBarPercentage(int percentage) {
        WebElement seekBar = DriverThreadManager.getDriver().findElement(
                By.xpath("//android.widget.SeekBar[@content-desc=\"0%\"]")
        );

        int startX = seekBar.getLocation().getX();
        int width = seekBar.getSize().getWidth();
        int y = seekBar.getLocation().getY() + (seekBar.getSize().getHeight() / 2);

        int targetX = startX + (width * percentage / 100);

        new TouchAction<>((PerformsTouchActions) DriverThreadManager.getDriver())
                .press(PointOption.point(startX, y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(targetX, y))
                .release()
                .perform();
    }

    public void goBackFromProfile() throws IOException {
        click(lawyerProfileBackButton);
    }

    public void openChatFromLawyer() throws IOException {
        click(chatIcon);
    }

    public void requestInstantConsultation(String issue) throws IOException {
        click(lawyerIcon);
        click(durationIcon);
        sendKey(issueField, issue);
        click(requestCallButton);
    }

    public void scheduleAndPayFlow(String couponCode) throws IOException {
        // Open Lawyer Profile
        click(lawyerProfileIcon);

        // Click Schedule
        click(scheduleButton);

        // Select availability
        click(availabilityTime);

        // Select specialization
        click(specializationSelection);

        // Select consultation duration
        click(consultationTime);

        // Select time slot
        click(timeSlotSelection);

        // Scroll & enable recording
        scrollToElementByAccessibilityId("record_enable_button"); // replace with proper accessibility if available

        // Select Add-ons
        click(adOnsField);

        // Continue to Pay
        scrollToElementByAccessibilityId("continue_to_pay_button");

        // Edit (optional flow)
        click(editButton);

        // Select Family Add-on
        click(familyAdOnsField);

        // Apply Coupon
        click(discountCoupon);
        sendKey(couponField, couponCode);
        click(couponAddButton);

        // Verify balance (optional step)
        System.out.println("Balance: " + myBalance.getText());

        // Final Payment
        scrollToElementByAccessibilityId("pay_now_from_my_bal_button");
    }
}
