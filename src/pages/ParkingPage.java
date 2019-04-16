package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static base.Constants.SELECT;

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

    @FindBy(xpath = "//input[@name='ExitDateDate']/following-sibling::a")
    private WebElement calLeavingDate;

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

    public void fillEntryTime(){

    }

    public void clickOnEntryPeriod(){

    }

    public void clickOnEntryCalendar(){

    }

    public void fillLeavingTime(){

    }

    public void clickOnLeavingPeriod(){

    }

    public void clickOnLeavingCalendar(){

    }

    public void clickOnCalculateButton(){

    }
}
