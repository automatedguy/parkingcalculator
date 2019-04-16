package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CalendarPage;
import utils.TestData;
import utils.TestDataProvider;

import static base.Constants.*;

public class ParkingTests extends BaseTest {

    CalendarPage calendarPage = null;

/*
    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void ShortTermParking(TestData testData){
        logger.info("Starting Short-Term Parking Tests");
        displayTestParameters(testData);
        parkingPage.selectParkingLot(SHORT_TERM);

        parkingPage.fillEntryTime(testData.getEntryTime());
        parkingPage.clickOnEntryPeriod(testData.getEntryPeriod());
        calendarPage = parkingPage.clickOnEntryCalendar();
        calendarPage.selectMonth("May");
        calendarPage.clickOnDate("20");

        parkingPage.fillLeavingTime(testData.getEntryTime());
        parkingPage.clickOnLeavingPeriod(testData.getLeavingPeriod());

        calendarPage = parkingPage.clickOnLeavingCalendar();
        calendarPage.selectMonth("June");
        calendarPage.clickOnDate("20");

        parkingPage.clickOnCalculateButton();
        logger.info("doing Nothing..");
    }
*/

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void EconomyParking(TestData testData){
        logger.info("Starting Economy Parking Tests");
        displayTestParameters(testData);
        parkingPage.selectParkingLot(ECONOMY);
        parkingPage.fillEntryTime(testData.getEntryTime());
        parkingPage.clickOnEntryPeriod(testData.getEntryPeriod());
        parkingPage.fillLeavingTime(testData.getEntryTime());
        parkingPage.clickOnLeavingPeriod(testData.getLeavingPeriod());
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void LongTermSurfaceParking(TestData testData){
        logger.info("Starting Long Term Surface Parking Tests");
        displayTestParameters(testData);
        parkingPage.selectParkingLot(LONG_TERM_SURFACE);
        parkingPage.fillEntryTime(testData.getEntryTime());
        parkingPage.clickOnEntryPeriod(testData.getEntryPeriod());
        parkingPage.fillLeavingTime(testData.getEntryTime());
        parkingPage.clickOnLeavingPeriod(testData.getLeavingPeriod());
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void LongTermGarageParking(TestData testData){
        logger.info("Starting Long Term Garage Parking Tests");
        displayTestParameters(testData);
        parkingPage.selectParkingLot(LONG_TERM_GARAGE);
        parkingPage.fillEntryTime(testData.getEntryTime());
        parkingPage.clickOnEntryPeriod(testData.getEntryPeriod());
        parkingPage.fillLeavingTime(testData.getEntryTime());
        parkingPage.clickOnLeavingPeriod(testData.getLeavingPeriod());
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void ValetParking(TestData testData){
        logger.info("Starting Valet Parking Tests");
        displayTestParameters(testData);
        parkingPage.selectParkingLot(VALET);
        parkingPage.fillEntryTime(testData.getEntryTime());
        parkingPage.clickOnEntryPeriod(testData.getEntryPeriod());
        parkingPage.fillLeavingTime(testData.getEntryTime());
        parkingPage.clickOnLeavingPeriod(testData.getLeavingPeriod());
    }

}
