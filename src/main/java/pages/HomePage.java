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


public class HomePage extends ActionUtilities {

    public HomePage() {

        PageFactory.initElements(new AppiumFieldDecorator(DriverThreadManager.getDriver()), this);
    }

    public DateUtilities dateUtilities;


    @FindBy(xpath = "//android.widget.Button[@content-desc=\"my_bal_add_money_button\"]")
    public WebElement addMoneyButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"my_bal_add_acc_button\"]")
    public WebElement addAccount;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")
    public WebElement plusButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"trans_filter_add_bank_button\n" +
            "Add Bank\"]")
    public WebElement addBankButton;

    @FindBy(xpath = "//android.widget.EditText[@text=\"holder_name_text_field\"]")
    public WebElement accountHolderName;

    @FindBy(xpath = "//android.widget.EditText[@text=\"bank_name_text_field\"]")
    public WebElement bankName;

    @FindBy(xpath = "//android.widget.EditText[@text=\"account_no_text_field\"]")
    public WebElement accountNumber;

    @FindBy(xpath = "//android.widget.EditText[@text=\"ifsc_code_text_field\"]")
    public WebElement iFSCCodeField;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"select_account_type\n" +
            "Select\"]")
    public WebElement selectAccountType;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"SAVINGS\"]")
    public WebElement savingAccount;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"trans_add_acc_button\"]")
    public WebElement addTransactionAccount;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"given_acc_corr_confirm_button\"]")
    public WebElement confirmButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"change_account_button\"]")
    public WebElement changeAccount;

    @FindBy(xpath = "//android.view.View[@content-desc=\"trans_filter_add_upi_button\n" +
            "Add UPI ID\"]")
    public WebElement addUPI;

    @FindBy(xpath = "//android.widget.EditText[@text=\"upi_id_text_field\"]")
    public WebElement enterUPIID;

    @FindBy(xpath = "//android.widget.EditText[@text=\"confirm_upi_text_field\"]")
    public WebElement confirmUPI;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"trans_add_acc_button\"]")
    public WebElement addUPIAccount;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"given_upi_cor_confirm_button\"]")
    public WebElement UPIConfirmButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"my_bal_head_add_acc_button\"]")
    public WebElement getAddMoneyButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"₹2000\"]")
    public WebElement addAmount;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"add_money_button\"]")
    public WebElement getGetAddMoneyButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"my_bal_withdraw_button\"]")
    public WebElement withdrawButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"widthdraw_button\"]")
    public WebElement confirmWidthdrawButton;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]")
    public WebElement sortIcon;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"trans_filter_start_date_field\n" +
            "From\"]")
    public WebElement fromDate;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"OK\"]")
    public WebElement okButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"trans_filter_end_date_field\n" +
            "To\"]")
    public WebElement toDate;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"trans_filter_apply_button\"]")
    public WebElement applyButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"find_lawyer_button\"]")
    public WebElement findLawyerButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Home\n" +
            "Tab 1 of 5\"]")
    public WebElement homeIcon;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"need_help_button\"]")
    public WebElement needHelpButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"got_it_button\"]")
    public WebElement gotItButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"connect_now_button\"]")
    public WebElement connectNowButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"hom_book_con_button\"]")
    public WebElement bookYourConsultationButton;





    public void clickAddMoney() {
        addMoneyButton.click();
    }

    public void clickAddAccount() {
        addAccount.click();
    }

    public void clickPlusButton() {
        plusButton.click();
    }

    public void clickAddBank() {
        addBankButton.click();
    }

    public void enterAccountHolderName(String name) {
        accountHolderName.clear();
        accountHolderName.sendKeys(name);
    }

    public void enterBankName(String bank) {
        bankName.clear();
        bankName.sendKeys(bank);
    }

    public void enterAccountNumber(String accNo) {
        accountNumber.clear();
        accountNumber.sendKeys(accNo);
    }

    public void enterIFSC(String ifsc) {
        iFSCCodeField.clear();
        iFSCCodeField.sendKeys(ifsc);
    }

    public void selectAccountType() {
        selectAccountType.click();
    }

    public void selectSavingsAccount() {
        savingAccount.click();
    }

    public void clickAddTransactionAccount() {
        addTransactionAccount.click();
    }

    public void clickConfirm() {
        confirmButton.click();
    }

    public void addBankAccount(String name, String bank, String accNo, String ifsc) {
        clickAddMoney();
        clickAddAccount();
        clickPlusButton();
        clickAddBank();

        enterAccountHolderName(name);
        enterBankName(bank);
        enterAccountNumber(accNo);
        enterIFSC(ifsc);

        selectAccountType();
        selectSavingsAccount();

        clickAddTransactionAccount();
        clickConfirm();
    }

    public void addUPIAccountFunctionality(String upiId) throws IOException {
        click(addMoneyButton);
        click(changeAccount);
        click(addUPI);

        sendKey(enterUPIID, upiId);
        sendKey(confirmUPI, upiId);

        click(addUPIAccount);
        click(UPIConfirmButton);
    }
    public void addMoneyFlow(String amount) throws IOException {
        click(addMoneyButton);
        click(getAddMoneyButton);
        selectAmount(amount);
        click(getGetAddMoneyButton);
    }

    public void selectAmount(String amount) {
        DriverThreadManager.getDriver().findElement(By.xpath("//android.view.View[@content-desc='₹" + amount + "']")).click();
    }

    public void withdrawMoneyFlow(String amount) throws IOException {
        click(addMoneyButton);
        click(withdrawButton);
        selectAmount(amount);
        click(confirmWidthdrawButton);
    }

    public void applyDateFilter() throws IOException {
        click(addMoneyButton);
        click(sortIcon);

        click(fromDate);
        dateUtilities.selectPastTenDaysDate();   // method you created earlier
        click(okButton);

        click(toDate);
        dateUtilities.selectTodayDate();    // method you created earlier
        click(okButton);

        click(applyButton);
    }

    public void scrollToConfirmButton() {
        WebElement element = DriverThreadManager.getDriver().findElement(
                AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true))" +
                                ".scrollIntoView(new UiSelector().description(\"hom_book_con_button\"))"
                )
        );

        element.click(); // optional
    }

    public void homeScreenFunctionalityFlow() throws IOException {
        click(homeIcon);
        click(findLawyerButton);
        click(needHelpButton);

        // Handle popup (if present)
        if (isElementDisplayed(gotItButton)) {
            click(gotItButton);
        }
        click(connectNowButton);

        scrollToConfirmButton();
        click(bookYourConsultationButton);
    }









}
