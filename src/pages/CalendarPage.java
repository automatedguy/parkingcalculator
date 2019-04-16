package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    //================================================================================
    // Actions
    //================================================================================


    public void selectMonth(String selectedMonth, String selectedDate){
        winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
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
