package pages;

import Device.DriverThreadManager;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.ActionUtilities;

import java.io.IOException;
import java.time.Duration;


public class ProfilePage extends ActionUtilities {

    public ProfilePage() {

        PageFactory.initElements(new AppiumFieldDecorator(DriverThreadManager.getDriver()), this);
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Profile\n" +
            "Tab 5 of 5\"]")
    public WebElement profileIcon;

    @FindBy(xpath = "//android.widget.ScrollView/android.widget.ImageView")
    public WebElement editButton;

    @FindBy(xpath = "//android.widget.ImageView[@text=\"home_first_name_text_field\"]")
    public WebElement firstName;

    @FindBy(xpath = "//android.widget.ImageView[@text=\"home_last_name_text_field\"]")
    public WebElement lastName;

    @FindBy(xpath = "//android.view.View[@content-desc=\"home_date_of_birth\n" +
            "23-02-2004\"]/android.widget.Button")
    public WebElement dateOfBirthCloseButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"home_date_of_birth\n" +
            "Date of Birth\"]")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Select date\n" +
            "Wed, Mar 25\"]/android.view.View/android.widget.Button")
    public WebElement calendarEditButton;

    @FindBy(xpath = "//android.widget.EditText[@text=\"03/25/2026\"]")
    public WebElement todayDateField;

    @FindBy(xpath = "//android.widget.EditText")
    public WebElement dateField;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"OK\"]")
    public WebElement okButton;

    @FindBy(xpath = "//android.widget.ImageView[@text=\"test@gmail.com\"]")
    public WebElement clearEmail;

    @FindBy(xpath = "//android.widget.ImageView[@text=\"home_email_text_field\"]")
    public WebElement emailIDField;

    @FindBy(xpath = "//android.widget.ImageView[@text=\"home_address_text_field\"]")
    public WebElement addressField;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"home_save_button\"]")
    public WebElement saveButton;


    public void editProfileAndSave() throws IOException {
        WebDriverWait wait = new WebDriverWait(DriverThreadManager.getDriver(), Duration.ofSeconds(15));

        // Click Profile Icon
        wait.until(ExpectedConditions.visibilityOf(profileIcon));
        click(profileIcon);

        // Click Edit Button
        wait.until(ExpectedConditions.visibilityOf(editButton));
        click(editButton);

        // Update First Name
        wait.until(ExpectedConditions.visibilityOf(firstName));
        firstName.clear();
        sendKey(firstName, "TestFirst");

        // Update Last Name
        wait.until(ExpectedConditions.visibilityOf(lastName));
        lastName.clear();
        sendKey(lastName,"TestLast");

        // Handle Date of Birth
        wait.until(ExpectedConditions.visibilityOf(dateOfBirth));
        click(dateOfBirth);

        wait.until(ExpectedConditions.visibilityOf(calendarEditButton));
        click(calendarEditButton);

        wait.until(ExpectedConditions.visibilityOf(dateField));
        dateField.clear();
        sendKey(dateField,"03/25/2026");

        click(okButton);

        // Close DOB popup if displayed
        if (DriverThreadManager.getDriver().findElements(By.xpath("//android.widget.Button[@content-desc='OK']")).size() > 0) {
            click(dateOfBirthCloseButton);
        }

        // Update Email
        wait.until(ExpectedConditions.visibilityOf(emailIDField));
        clearEmail.click(); // clear existing email if needed
        sendKey(emailIDField, "test@gmail.com");

        // Update Address
        wait.until(ExpectedConditions.visibilityOf(addressField));
        addressField.clear();
        sendKey(addressField, "Chennai");

        // Scroll to Save Button and Click
        WebElement save = DriverThreadManager.getDriver().findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().description(\"home_save_button\"))"
        ));
        click(save);
    }






}
