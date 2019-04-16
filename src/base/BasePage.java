package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.log4testng.Logger;

public class BasePage extends BaseTest {


    protected WebDriver driver;
    public BasePage(WebDriver iDriver) {
        this.driver = iDriver;
    }

    protected WebElement element;
    protected String elementType;
    protected String elementCaption;
    protected String selectedOption;
    protected String inputText;

    protected static Logger logger = Logger.getLogger(BasePage.class);


    protected void clickElement(){
        logger.info("Clicking on: [" + elementType + "]" + " [" + elementCaption + "]");
        element.click();
    }

    protected void fillInput(){
        logger.info("Entering Text: [" + inputText + "] into [" + elementCaption + "]");
        element.sendKeys(inputText);
    }

    protected void selectOption(){
        logger.info("Selecting [" + selectedOption + "] from [" + elementCaption + "] drop down list.");
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(String.valueOf(selectedOption));
    }

}
