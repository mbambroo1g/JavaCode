package com.fannie.screenshots;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fannie.generics.GenericMethods;
import com.fannie.utils.DriverFactory;
import com.fannie.utils.DriverNames;
import com.fannie.utils.ElementType;
import com.fannie.utils.ScreenShot;

public class ScreenShotTest {
	String baseURL;
	WebDriver driver;
	GenericMethods genMethods;
	ScreenShot screenShot;

	@Test
	public void partialTest() throws Exception{

		genMethods.getElement("tab-flight-tab-hp", ElementType.ID).click();
		genMethods.getElement("flight-origin-hp-flight",ElementType.ID).clear();
		genMethods.getElement("flight-origin-hp-flight", ElementType.ID).sendKeys("New York, NY (JFK-John F. Kennedy Intl.)");
		Thread.sleep(1500);
		//screenShot.takeScreenShot("Step1.png");
		screenShot.takeScreenShot();
		genMethods.getElement("flight-destination-hp-flight", ElementType.ID).clear();
		genMethods.getElement("flight-destination-hp-flight", ElementType.ID).sendKeys("New York, NY (JFK-John F. Kennedy Intl.)");
		Thread.sleep(1500);
		//screenShot.takeScreenShot("Step2.png");
		screenShot.takeScreenShot();
		genMethods.getElement(".//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button",ElementType.XPATH).click();
		Thread.sleep(1500);
	}

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		baseURL = "https://www.expedia.com/";
		genMethods = new GenericMethods(driver);
		screenShot = new ScreenShot(driver);
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		//screenShot.takeScreenShot("error.png");
		screenShot.takeScreenShot();
		Thread.sleep(2000);
		driver.quit();
	}
}
