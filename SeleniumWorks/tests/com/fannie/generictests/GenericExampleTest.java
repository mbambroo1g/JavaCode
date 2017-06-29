package com.fannie.generictests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fannie.generics.GenericMethods;
import com.fannie.utils.DriverFactory;
import com.fannie.utils.DriverNames;
import com.fannie.utils.ElementType;

public class GenericExampleTest {
	String baseURL;
	WebDriver driver;
	GenericMethods genMethods;

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		baseURL = "https://www.expedia.com/";
		genMethods = new GenericMethods(driver);
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
	@Test
	public void test() throws InterruptedException {
		genMethods.getElement("tab-flight-tab-hp", ElementType.ID).click();
	}
}
