package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static base.Constants.*;

public class ParkingPage extends BasePage {

    public ParkingPage(WebDriver iDriver) {
        super(iDriver);
    }

    //================================================================================
    // Locators
    //================================================================================


    @FindBy(name = "Lot")
    private WebElement ddlChooseLot;

    @FindBy(name = "EntryTime")
    private WebElement inputEntryTime;

    @FindBy(name = "EntryTimeAMPM")
    private WebElement rdbEntryPeriod;

    @FindBy(xpath = "//input[@name='EntryDate']/following-sibling::a")
    private WebElement imgEntryDate;

    @FindBy(name = "ExitTime")
    private WebElement inputLeavingTime;

    @FindBy(name = "ExitTimeAMPM")
    private WebElement rdbLeavingPeriod;

    @FindBy(xpath = "//input[@name='ExitDate']/following-sibling::a")
    private WebElement imgLeavingDate;

    @FindBy(name = "Submit")
    private WebElement buttonCalculate;

    @FindBy(xpath = "//span[@class='SubHead']//b[contains(text(),'$')]")
    private WebElement labelParkingCost;

    @FindBy(xpath = "")
    private WebElement labelParkingPermanence;

    //================================================================================
    // Actions
    //================================================================================

    public void selectParkingLot(String option){
        element = ddlChooseLot;
        elementType = SELECT;
        elementCaption = "Choose a Lot";
        selectedOption = option;
        selectOption();
    }

    public void fillEntryTime(String entryTime){
        element = inputEntryTime;
        elementType = INPUT;
        elementCaption = "Entry Time";
        inputText = entryTime;
        fillInput();
    }

    public void clickOnEntryPeriod(String entryPeriod){
        element = rdbEntryPeriod.findElement(By.xpath("//*[@value='"+ entryPeriod +"']"));
        elementType = RADIO;
        elementCaption = entryPeriod;
        clickElement();
    }

    public CalendarPage clickOnEntryCalendar(){
        element = imgEntryDate;
        elementType = IMAGE;
        elementCaption = "Entry Calendar";
        clickElement();
        return initCalendarPage(driver);
    }

    public void fillLeavingTime(String leavingTime){
        element = inputLeavingTime;
        elementType = INPUT;
        elementCaption = "Leaving Time";
        inputText = leavingTime;
        fillInput();
    }

    public void clickOnLeavingPeriod(String leavingPeriod){
        element = rdbLeavingPeriod.findElement(By.xpath("//*[@value='"+ leavingPeriod +"']"));
        elementType = RADIO;
        elementCaption = leavingPeriod;
        clickElement();
    }

    public CalendarPage clickOnLeavingCalendar(){
        element = imgLeavingDate;
        elementType = IMAGE;
        elementCaption = "Leaving Calendar";
        clickElement();
        return initCalendarPage(driver);
    }

    public void clickOnCalculateButton(){
        element = buttonCalculate;
        elementType = BUTTON;
        elementCaption = "Calculate";
        clickElement();
    }

    public String getFinalCost(){
        return labelParkingCost.getText();
    }
}
