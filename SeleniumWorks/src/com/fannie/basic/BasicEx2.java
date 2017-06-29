package com.fannie.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fannie.utils.DriverFactory;
import com.fannie.utils.DriverNames;

public class BasicEx2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverFactory.getDriver(DriverNames.IE);
		String baseUrl= "http://naveenks.com/selenium/LoginForm.html";

		driver.get(baseUrl);

		driver.findElement(By.id("uname")).sendKeys("hello@hello.com");
		Thread.sleep(1500);
		driver.findElement(By.id("pwd")).sendKeys("secret@123");
		Thread.sleep(1500);
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1500);
		driver.close();

	}
}