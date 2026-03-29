package utilities;

import Device.DriverThreadManager;
import helper.MyAvailabilityHelper;
import org.openqa.selenium.By;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtilities extends ActionUtilities{

    public static String getTodayDateForCalendar() {
        return LocalDate.now()
                .format(DateTimeFormatter.ofPattern("d, EEEE, MMMM d, yyyy")) + ", Today";
    }


    public void selectTodayDate() throws IOException {

      String todayDate =  getTodayDateForCalendar();

        By todayLocator = By.xpath("//android.widget.Button[@content-desc='" + todayDate + "']");

        click(DriverThreadManager.getDriver().findElement(todayLocator));
    }

    public void selectPastTenDaysDate() throws IOException {

        LocalDate pastDate = LocalDate.now().minusDays(10);

        String formattedDate = pastDate
                .format(DateTimeFormatter.ofPattern("d, EEEE, MMMM d, yyyy"));

        By pastDateLocator = By.xpath("//android.widget.Button[contains(@content-desc,'" + formattedDate + "')]");

        click(DriverThreadManager.getDriver().findElement(pastDateLocator));
    }
}
