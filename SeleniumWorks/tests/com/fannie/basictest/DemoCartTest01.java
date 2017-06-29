package com.fannie.basictest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fannie.utils.DriverFactory;
import com.fannie.utils.DriverNames;

public class DemoCartTest01 {
	private String baseUrl;
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		baseUrl = "https://demostore.x-cart.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void testIng1() throws Exception {
		//1. Load the page
		driver.get(baseUrl);

		//2. Find the shipping element
		driver.findElement(By.linkText("Shipping")).click();

		//3. Find Contact us
		driver.findElement(By.partialLinkText("Contact")).click();

		//4. Enter details
		driver.findElement(By.id("name")).sendKeys("Testing Name");
		driver.findElement(By.id("email")).sendKeys("testing@testing.com");
		driver.findElement(By.id("subject")).sendKeys("Test");
		driver.findElement(By.id("message")).sendKeys("This is a test message");
		Thread.sleep(2000);
		driver.findElement(By.className("btn")).click();
	}

}