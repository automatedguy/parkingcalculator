package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static base.Constants.*;

public class ParkingTests extends BaseTest {

    @Test
    public void ShortTermParking(){
        logger.info("Starting Short-Term Parking Tests");
        parkingPage.selectParkingLot(SHORT_TERM);
    }

    @Test
    public void EconomyParking(){
        logger.info("Starting Economy Parking Tests");
        parkingPage.selectParkingLot(ECONOMY);
    }

    @Test
    public void LongTermSurfaceParking(){
        logger.info("Starting Long Term Surface Parking Tests");
        parkingPage.selectParkingLot(LONG_TERM_SURFACE);
    }

    @Test
    public void LongTermGarageParking(){
        logger.info("Starting Long Term Garage Parking Tests");
        parkingPage.selectParkingLot(LONG_TERM_GARAGE);
    }

    @Test
    public void ValetParking(){
        logger.info("Starting Valet Parking Tests");
        parkingPage.selectParkingLot(VALET);
    }
}
