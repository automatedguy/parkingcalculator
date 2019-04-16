package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import utils.TestData;
import utils.TestDataProvider;

import static base.Constants.*;

public class ParkingTests extends BaseTest {

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void ShortTermParking(TestData testData){
        logger.info("Starting Short-Term Parking Tests");
        parkingPage.selectParkingLot(SHORT_TERM);
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void EconomyParking(TestData testData){
        logger.info("Starting Economy Parking Tests");
        parkingPage.selectParkingLot(ECONOMY);
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void LongTermSurfaceParking(TestData testData){
        logger.info("Starting Long Term Surface Parking Tests");
        parkingPage.selectParkingLot(LONG_TERM_SURFACE);
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void LongTermGarageParking(TestData testData){
        logger.info("Starting Long Term Garage Parking Tests");
        parkingPage.selectParkingLot(LONG_TERM_GARAGE);
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
    public void ValetParking(TestData testData){
        logger.info("Starting Valet Parking Tests");
        parkingPage.selectParkingLot(VALET);
    }

}
