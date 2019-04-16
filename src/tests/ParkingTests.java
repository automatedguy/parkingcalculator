package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import providers.TestData;
import providers.TestDataProvider;
import static org.assertj.core.api.Assertions.*;

import static base.Constants.*;

public class ParkingTests extends BaseTest {

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class, priority = 1)
    public void shortTermParking(TestData testData){
        displayTestParameters(SHORT_TERM, testData);
        parkingPage.selectParkingLot(SHORT_TERM);
        assertThat(calculateCost(testData)).isEqualTo(getExpectedCost(28, 26));
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class, priority = 2)
    public void longTermGarageParking(TestData testData){
        displayTestParameters(LONG_TERM_GARAGE, testData);
        parkingPage.selectParkingLot(LONG_TERM_GARAGE);
        assertThat(calculateCost(testData)).isEqualTo(getExpectedCost(-12, 12));
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class, priority = 3)
    public void valetParking(TestData testData){
        displayTestParameters(VALET, testData);
        parkingPage.selectParkingLot(VALET);
        assertThat(calculateCost(testData)).isEqualTo(getExpectedCost(42, 30));
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class, priority = 4)
    public void longTermSurfaceParking(TestData testData){
        displayTestParameters(LONG_TERM_SURFACE, testData);
        parkingPage.selectParkingLot(LONG_TERM_SURFACE);
        assertThat(calculateCost(testData)).isEqualTo(getExpectedCost(9, 9));
    }

    @Test(dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class, priority = 5)
    public void economyParking(TestData testData){
        displayTestParameters(ECONOMY, testData);
        parkingPage.selectParkingLot(ECONOMY);
        assertThat(calculateCost(testData)).isEqualTo(getExpectedCost(9, 9));
    }
}