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
    private String ddlChooseLotCaption = "Choose a Lot";

    @FindBy(name = "EntryTime")
    private WebElement inputEntryTime;
    private String inputEntryTimeCaption = "Entry Time";

    @FindBy(name = "ExitTime")
    private WebElement inputLeavingTime;
    private String inputLeavingTimeCaption = "Leaving Time";

    @FindBy(xpath = "//input[@name='EntryDate']/following-sibling::a")
    private WebElement imgEntryDate;
    private String imgEntryDateCaption = "Entry Calendar";

    @FindBy(xpath = "//input[@name='ExitDate']/following-sibling::a")
    private WebElement imgLeavingDate;
    private String imgLeavingDateCaption = "Leaving Calendar";

    @FindBy(name = "Submit")
    private WebElement buttonCalculate;
    private String buttonCalculateCaption = "Calculate";

    @FindBy(xpath = "//span[@class='SubHead']//b[contains(text(),'$')]")
    private WebElement labelParkingCost;

    @FindBy(xpath = "//span[@class='BodyCopy']//b")
    public WebElement labelParkingPermanence;

    private String rdbEntryPeriod = "//input[@name='EntryTimeAMPM' and @value='_PERIOD_']";
    private String rdbEntryPeriodCatption = "Entry Period";

    private String rdbLeavingPeriod = "//input[@name='ExitTimeAMPM' and @value='_PERIOD_']";
    private String rdbLeavingPeriodCatption = "Leaving Period";

    //================================================================================
    // Actions
    //================================================================================

    public void selectParkingLot(String option){
        elementCaption = ddlChooseLotCaption;
        element = ddlChooseLot;
        selectedOption = option;
        elementType = SELECT;
        selectOption();
    }

    public void fillEntryTime(String entryTime){
        elementCaption = inputEntryTimeCaption;
        element = inputEntryTime;
        inputText = entryTime;
        elementType = INPUT;
        fillInput();
    }

    public void fillLeavingTime(String leavingTime){
        elementCaption = inputLeavingTimeCaption;
        element = inputLeavingTime;
        elementType = INPUT;
        inputText = leavingTime;
        fillInput();
    }

    public CalendarPage clickOnEntryCalendar(){
        elementCaption = imgEntryDateCaption;
        element = imgEntryDate;
        elementType = IMAGE;
        clickElement();
        return initCalendarPage(driver);
    }

    public CalendarPage clickOnLeavingCalendar(){
        elementCaption = imgLeavingDateCaption;
        element = imgLeavingDate;
        elementType = IMAGE;
        clickElement();
        return initCalendarPage(driver);
    }

    public void clickOnCalculateButton(){
        elementCaption = buttonCalculateCaption;
        element = buttonCalculate;
        elementType = BUTTON;
        clickElement();
    }

    public void clickOnEntryPeriod(String entryPeriod){
        element = driver.findElement(By.xpath(rdbEntryPeriod.replace(PERIOD, entryPeriod)));
        elementCaption = rdbEntryPeriodCatption + " " + entryPeriod;
        elementType = RADIO;
        clickElement();
    }

    public void clickOnLeavingPeriod(String leavingPeriod){
        element = driver.findElement(By.xpath(rdbLeavingPeriod.replace(PERIOD,leavingPeriod)));
        elementCaption = rdbLeavingPeriodCatption + " " + leavingPeriod;
        elementType = RADIO;
        clickElement();
    }

    public String getFinalCost(){
        return labelParkingCost.getText();
    }
}
