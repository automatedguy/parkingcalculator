package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CalendarPage;
import utilities.TestData;
import utilities.TestDataProvider;

import static base.Constants.*;

public class ParkingTests extends BaseTest {

    CalendarPage calendarPage = null;

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void ShortTermParking(TestData testData){
        displayTestParameters(SHORT_TERM, testData);
        parkingPage.selectParkingLot(SHORT_TERM);
        calculateCost(testData);
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void EconomyParking(TestData testData){
        displayTestParameters(ECONOMY, testData);
        parkingPage.selectParkingLot(ECONOMY);
        calculateCost(testData);
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void LongTermSurfaceParking(TestData testData){
        displayTestParameters(LONG_TERM_SURFACE, testData);
        parkingPage.selectParkingLot(LONG_TERM_SURFACE);
        calculateCost(testData);
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void LongTermGarageParking(TestData testData){
        displayTestParameters(LONG_TERM_GARAGE, testData);
        parkingPage.selectParkingLot(LONG_TERM_GARAGE);
        calculateCost(testData);
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void ValetParking(TestData testData){
        displayTestParameters(VALET, testData);
        parkingPage.selectParkingLot(VALET);
        calculateCost(testData);
    }

    private void calculateCost(TestData testData){

        parkingPage.fillEntryTime(testData.getEntryTime());
        parkingPage.clickOnEntryPeriod(testData.getEntryPeriod());
        calendarPage = parkingPage.clickOnEntryCalendar();
        calendarPage.selectMonth("May");
        calendarPage.clickOnDate("20");

        parkingPage.fillLeavingTime(testData.getLeavingTime());
        parkingPage.clickOnLeavingPeriod(testData.getLeavingPeriod());
        calendarPage = parkingPage.clickOnLeavingCalendar();
        calendarPage.selectMonth("June");
        calendarPage.clickOnDate("20");

        parkingPage.clickOnCalculateButton();

    }
}
