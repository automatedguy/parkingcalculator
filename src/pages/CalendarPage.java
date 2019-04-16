package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CalendarPage extends BasePage {


    public CalendarPage(WebDriver iDriver) {
        super(iDriver);
    }

    //================================================================================
    // Locators
    //================================================================================

    @FindBy(id = "")
    private WebElement ddlMonth;

    @FindBy(id = "")
    private WebElement aDate;


    //================================================================================
    // Actions
    //================================================================================


    public void selectMonth(){

    }

    public void clickOnDate(){

    }
}
