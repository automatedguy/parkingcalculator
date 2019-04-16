package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.log4testng.Logger;
import pages.CalendarPage;
import pages.ParkingPage;
import utilities.TestData;

import static base.Constants.BASE_URL;
import static base.Constants.RESOURCES_PATH;


public class BaseTest {

    private WebDriver driver;
    private ChromeOptions chromeOptions;
    protected static Logger logger = Logger.getLogger(BaseTest.class);
    protected ParkingPage parkingPage = null;
    protected CalendarPage calendarPage = null;


    @BeforeSuite(alwaysRun = true)
    public void setUp(ITestContext context){
        setChromeOptions();
        logger.info("Starting Chrome Browser...");
        driver = new ChromeDriver(chromeOptions);
    }

    @BeforeClass
    public void prepareLogger(){
        Class<? extends BaseTest> currTestClass = getClass();
        this.logger = Logger.getLogger(currTestClass);
        String message = "Started executing class " + this.getClass().getName();
        logger.info(message);
    }

    @BeforeMethod(alwaysRun = true)
    public void openBasePage(ITestContext context){
        logger.info("Navigating to Base URL: " + BASE_URL);
        driver.navigate().to(BASE_URL);
        parkingPage = initParkingPage();
    }

    @AfterClass
    public void tearDown(){
        logger.info("Tearing down Chrome Browser.");
        driver.quit();
    }

    private void setChromeOptions(){
        logger.info("Setting up Chrome Browser");
        System.setProperty("webdriver.chrome.driver", RESOURCES_PATH + "chromedriver");
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("test-type", "start-maximized", "no-default-browser-check");
        chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS,  true);
    }

    protected void displayTestTitle(String title){
        logger.info("====================================================");
        logger.info("===== Starting: [" + title + "] test =====");
        logger.info("====================================================");
    }

    protected void displayTestParameters(String testTitle, TestData testData){
        displayTestTitle(testTitle);
        logger.info("Entry Time: [" + testData.getEntryTime() + "]");
        logger.info("Entry Date: [" + testData.getEntryDate() + "]");
        logger.info("Entry Period: [" + testData.getEntryPeriod() + "]");
        logger.info("Leaving Time: [" + testData.getLeavingTime() + "]");
        logger.info("Leaving Date: [" + testData.getLeavingDate() + "]");
        logger.info("Leaving Period: [" + testData.getLeavingPeriod() + "]");
    }

    //================================================================================
    // Inits
    //================================================================================

    protected ParkingPage initParkingPage(){
        return PageFactory.initElements(driver, ParkingPage.class);
    }

    protected CalendarPage initCalendarPage(WebDriver iDriver){
        return PageFactory.initElements(iDriver, CalendarPage.class);
    }
}
