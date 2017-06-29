package com.fannie.generictests;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fannie.generics.GenericMethods;
import com.fannie.utils.DriverFactory;
import com.fannie.utils.DriverNames;
import com.fannie.utils.ElementType;

public class DatePickerTest {
	String baseURL;
	WebDriver driver;
	GenericMethods genMethods;

	@Test
	public void partialTest() throws Exception{
		String flyFromPartial="new";
		String flyToPartial="san";

		genMethods.getElement("tab-flight-tab-hp", ElementType.ID).click();
		genMethods.getElement("flight-origin-hp-flight",ElementType.ID).clear();
		genMethods.getElement("flight-origin-hp-flight", ElementType.ID).sendKeys(flyFromPartial);
		Thread.sleep(2000);
		List<WebElement> flyFromPorts = driver.findElements(By.className("results-item"));
		System.out.println("Number of Source Locations:"+flyFromPorts.size());

		List<String> listOfSourceLocations = new ArrayList<String>();
		for(WebElement temp:flyFromPorts){
			System.out.println(temp.getText());
			listOfSourceLocations.add(temp.getText());
			//genMethods.getElement("flight-origin-hp-flight", ElementType.ID).sendKeys(temp.getText());
		}

		for(String temp: listOfSourceLocations){
			genMethods.getElement("flight-origin-hp-flight", ElementType.ID).clear();
			genMethods.getElement("flight-origin-hp-flight", ElementType.ID).sendKeys(temp);
			Thread.sleep(1500);
		}

	}

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


	@Ignore@Test
	public void test() throws InterruptedException {
		genMethods.getElement("tab-flight-tab-hp", ElementType.ID).click();
		genMethods.getElement("flight-departing-hp-flight", ElementType.ID).click();
		Thread.sleep(1000);
		String xpath = ".//*[@id='flight-departing-wrapper-hp-flight']/div/div/div[2]/table/tbody/tr/td/button[not(@disabled)]";

		List<WebElement> activeDates=driver.findElements(By.xpath(xpath));

		System.out.println(activeDates.size());

		for(WebElement temp: activeDates){
			String selectDateXpath=".//*[@id='flight-departing-wrapper-hp-flight']/div/div/div[2]/table/tbody/tr/td/button[text()="+temp.getText()+"]";
			System.out.println(selectDateXpath);
			genMethods.getElement(selectDateXpath, ElementType.XPATH).click();
			Thread.sleep(2000);
			genMethods.getElement("flight-departing-hp-flight", ElementType.ID).clear();
			genMethods.getElement("flight-departing-hp-flight", ElementType.ID).click();
		}

	}
}
