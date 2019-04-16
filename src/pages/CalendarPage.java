package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.DateUtils;

import static base.Constants.SELECT;


public class CalendarPage extends BasePage {


    public CalendarPage(WebDriver iDriver) {
        super(iDriver);
    }

    String winHandleBefore = null;

    //================================================================================
    // Locators
    //==============================================================================

    private String ddlMonthSelector = "MonthSelector";
    private String ddlMonthSelectorCaption = "Calendar";
    private String aSelectedDate = "//a[text()='_SELECTED_DATE_']";

    private DateUtils dateUtils = new DateUtils();

    //================================================================================
    // Actions
    //================================================================================


    public void selectMonthDate(String daysAhead){
        winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        String generatedDate = dateUtils.generateDate(Integer.valueOf(daysAhead));
        String selectedMonth = generatedDate.substring(0, generatedDate.indexOf("-"));
        String selectedDate = generatedDate.substring(generatedDate.lastIndexOf("-") + 1);

        if(selectedDate.startsWith("0")){
            selectedDate = selectedDate.replaceFirst("0", "");
        }

        element = driver.findElement(By.name(ddlMonthSelector));
        elementType = SELECT;
        elementCaption = ddlMonthSelectorCaption;
        selectedOption = selectedMonth;
        selectOption();

        logger.info("Selecting date: [" + selectedDate + "]");
        driver.findElement(By.xpath("//a[text()='" + selectedDate +"']")).click();
        driver.switchTo().window(winHandleBefore);
    }
}
