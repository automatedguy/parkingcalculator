package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import utilities.TestData;
import utilities.TestDataProvider;

import static base.Constants.*;

public class ParkingTests extends BaseTest {

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void shortTermParking(TestData testData){
        displayTestParameters(SHORT_TERM, testData);
        parkingPage.selectParkingLot(SHORT_TERM);
        calculateCost(testData);
    }

/*    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void economyParking(TestData testData){
        displayTestParameters(ECONOMY, testData);
        parkingPage.selectParkingLot(ECONOMY);
        calculateCost(testData);
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void longTermSurfaceParking(TestData testData){
        displayTestParameters(LONG_TERM_SURFACE, testData);
        parkingPage.selectParkingLot(LONG_TERM_SURFACE);
        calculateCost(testData);
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void longTermGarageParking(TestData testData){
        displayTestParameters(LONG_TERM_GARAGE, testData);
        parkingPage.selectParkingLot(LONG_TERM_GARAGE);
        calculateCost(testData);
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void valetParking(TestData testData){
        displayTestParameters(VALET, testData);
        parkingPage.selectParkingLot(VALET);
        calculateCost(testData);
    }*/

    private String calculateCost(TestData testData){

        parkingPage.fillEntryTime(testData.getEntryTime());
        parkingPage.clickOnEntryPeriod(testData.getEntryPeriod());
        calendarPage = parkingPage.clickOnEntryCalendar();
        calendarPage.selectMonth("May", "20");


        parkingPage.fillLeavingTime(testData.getLeavingTime());
        parkingPage.clickOnLeavingPeriod(testData.getLeavingPeriod());
        calendarPage = parkingPage.clickOnLeavingCalendar();
        calendarPage.selectMonth("June", "20");

        parkingPage.clickOnCalculateButton();

        String cost = parkingPage.getFinalCost();
        logger.info(FINAL_COST + ": [" + cost + "]");
        return cost;
    }
}
