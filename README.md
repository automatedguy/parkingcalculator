# OverActive Selenium Automated Test Exam

## System Requirements

- Chrome Browser: 72
- Apache Maven: 3.3.9
- Java version: 1.8
- Intellij: 2018

## Project Structure

base:
    BasePage: base page class
	BaseTest: base test setup class
pages (BasePage subclasses):
	CalendarPage
	ParkingPage
tests:
	ParkingTests
providers:
    Data provider classes
utilities:
    Class that handles date generation based on days ranges
resources:
	chromedriver (latest chrome driver version up to date)
	test_data.csv
	log4testng.properties (testng logger config)

## "How to run" instructions

a). From IDE (Intellij suggested):
	1). Right click on tests/ParkingTests
	2). Select 'Run ParkingTests'

	Intellij project structure setup:
		-Source        : ./parkingcalculator/src
		-Tests         : ./parkingcalculator/src/tests
		-Test Resources: ./parkingcalculator/src/resources
		
## Note

This demo was created with Linux, in order to run from Windows please use "chromedriver.exe" (instead of "chromedriver") modify the following line in BaseTest.java

``` System.setProperty("webdriver.chrome.driver", RESOURCES_PATH + "chromedriver"); ```

## License

The content in this repository is Open Source material released under the Apache 2.0 License. Please see the [LICENSE](LICENSE) file for full license details.

## Authors and Contributors

Automatedguy .Inc

## Questions, Feedback, Pull Requests Etc.

If you have any questions, feedback, suggestions, etc. please submit them via issues or, even better, submit a Pull Request!