package pages;

import Device.DriverThreadManager;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ActionUtilities;
import utilities.DateUtilities;

import java.io.IOException;


public class CompliantPage extends ActionUtilities {

    public CompliantPage() {

        PageFactory.initElements(new AppiumFieldDecorator(DriverThreadManager.getDriver()), this);
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Complaints\n" +
            "Tab 4 of 5\"]")
    public WebElement complaintTab;

    @FindBy(xpath = "//android.widget.Button")
    public WebElement complaintPlusButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Karthik Sambath\n" +
            "Cons ID: MLC260285\n" +
            "Law ID: null\n" +
            "Corporate law\n" +
            "29 Mar 2026 | 07:30 PM\n" +
            "15 Min\"]")
    public WebElement compliantCard;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"complaint_category_drop_down\n" +
            "Select Category\"]")
    public WebElement selectCategory;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Lawyer did not attend consultation\"]")
    public WebElement categorySection;

    @FindBy(xpath = "//android.widget.EditText")
    public WebElement complaintDescription;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"submit_complaint_button\"]")
    public WebElement submitButton;


    public void raiseComplaintFunction() throws IOException {
        click(complaintTab);
        click(complaintPlusButton);
        click(compliantCard);
        click(selectCategory);
        click(categorySection);
        sendKey(complaintDescription, "Testing");
        click(submitButton);
    }




}
