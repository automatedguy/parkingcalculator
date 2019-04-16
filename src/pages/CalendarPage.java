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

    //================================================================================
    // Locators
    //================================================================================

    @FindBy(name = "MonthSelector")
    private WebElement ddlMonth;


    //================================================================================
    // Actions
    //================================================================================


    public void selectMonth(String selectedMonth){
        element = ddlMonth;
        elementType = SELECT;
        elementCaption = selectedMonth;
        selectedOption = selectedMonth;
        selectOption();

    }

    public void clickOnDate(String selectedDate){
        logger.info("Selecting date: [" + selectedDate + "]");
        driver.findElement(By.xpath("//a[text()='" + selectedDate +"']")).click();
        focusParent();
    }
}
