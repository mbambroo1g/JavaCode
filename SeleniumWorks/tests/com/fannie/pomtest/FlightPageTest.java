package com.fannie.pomtest;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fannie.generics.GenericMethods;
import com.fannie.pom.FlightPageFactory;
import com.fannie.pom.FlightPagePOM;
import com.fannie.utils.DriverFactory;
import com.fannie.utils.DriverNames;
import com.fannie.utils.ScreenShot;

public class FlightPageTest {

	String baseURL;
	WebDriver driver;
	FlightPageFactory flightPage;
	GenericMethods genMethods;
	ScreenShot screenShot;

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);

		baseURL = "https://www.expedia.com/";
		genMethods = new GenericMethods(driver);
		screenShot = new ScreenShot(driver);
		driver.get(baseURL);
		flightPage = new FlightPageFactory(driver);
	}

	@After
	public void tearDown() throws Exception {
		screenShot.takeScreenShot();
		Thread.sleep(2000);
		driver.quit();
	}

	@Ignore@Test
	public void test() throws InterruptedException {
		FlightPagePOM.clickFlightTab(driver);
		FlightPagePOM.sendFlyFromTextBox("Washington, DC (WAS-All Airports)", driver);
		FlightPagePOM.sendFlyToTextBox("San Francisco, CA (SFO-San Francisco Intl.)", driver);
		//		FlightPagePOM.sendDepartureDate("06/29/2017", driver);
		//		FlightPagePOM.sendArrivalDate("07/11/2017", driver);
		FlightPagePOM.selectDepartDate("29", driver);
		FlightPagePOM.selectReturnDate("15", driver);
		Thread.sleep(1000);
		FlightPagePOM.clickSearch(driver);
	}

	@Test
	public void testFlightPageFactory(){
		flightPage.clickFlightTab();
		flightPage.sendFlyFrom("Washington, DC (WAS-All Airports)");
		flightPage.sendFlyTo("San Francisco, CA (QSF-All Airports)");

	}
}