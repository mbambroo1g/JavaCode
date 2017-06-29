package com.fannie.basictest;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.fannie.utils.DriverFactory;
import com.fannie.utils.DriverNames;



public class Test04 {
	String baseURL;
	WebDriver driver ;

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		baseURL = "http://naveenks.com/selenium/RegForm.html";
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	//Write a se script to select a radio by name which returns
	//all radio buttons, under that and click on each with a delay of 2 seconds
	// select radio button

	@Ignore @Test
	public void test()  throws Exception{
		WebElement male = driver.findElement(By.id("genderMale"));
		male.click();
		//		System.out.println("Selected Male -> " + male.isSelected());
		Thread.sleep(2000);
		WebElement female = driver.findElement(By.id("genderFemale"));
		female.click();
		//		System.out.println("Selected Female -> " + female.isSelected());
		Thread.sleep(2000);
		WebElement trans = driver.findElement(By.id("genderTrans"));
		trans.click();
		System.out.println("Selected Male -> " + male.isSelected());
		System.out.println("Selected Female -> " + female.isSelected());
		System.out.println("Selected Trans Gender -> " + trans.isSelected());
	}

	@Ignore @Test
	public void test1()  throws Exception{
		WebElement genderRadio = driver.findElement(By.name("genderRadio"));
		System.out.println(genderRadio);
		Select genderSelect = new Select(genderRadio);
		List<WebElement> options = genderSelect.getOptions();
		System.out.println(options);
		System.out.println(options.size());
		for(int i=0; i<options.size(); i++){
			System.out.println(options.get(i).getText());
		}

		genderSelect.selectByIndex(1);
		Thread.sleep(2000);
		genderSelect.selectByIndex(2);
		Thread.sleep(3000);
	}
}