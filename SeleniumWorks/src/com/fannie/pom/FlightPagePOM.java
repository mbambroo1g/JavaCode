package com.fannie.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightPagePOM {
	private static WebElement element;
	public static void clickFlightTab(WebDriver driver){
		driver.findElement(By.id("tab-flight-tab-hp")).click();
	}

	public static void clickSearch(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button"));
		element.click();
	}

	public static void selectAdults(int noOfAdults, WebDriver driver) {


	}

	public static void selectDepartDate(String departDate, WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("flight-departing-hp-flight")).click();
		Thread.sleep(1500);
		String selectDateXPath=".//*[@id='flight-departing-wrapper-hp-flight']/div/div/div[2]/table/tbody/tr/td/button[text()='"+departDate+"']";
		element = driver.findElement(By.xpath(selectDateXPath));
		element.click();

	}

	public static void selectReturnDate(String returnDate, WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("flight-returning-hp-flight")).click();
		Thread.sleep(1500);
		String selectDateXPath=".//*[@id='flight-returning-wrapper-hp-flight']/div/div/div[3]/table/tbody/tr/td/button[text()='"+returnDate+"']";
		element = driver.findElement(By.xpath(selectDateXPath));
		element.click();

	}

	public static void sendArrivalDate(String returnDate, WebDriver driver) {
		element = driver.findElement(By.id("flight-returning-hp-flight"));
		element.clear();
		element.sendKeys(returnDate);
	}

	public static void sendDepartureDate(String departDate, WebDriver driver) {
		element = driver.findElement(By.id("flight-departing-hp-flight"));
		element.clear();
		element.sendKeys(departDate);
	}

	public static void sendFlyFromTextBox(String flyFrom, WebDriver driver) {
		element = driver.findElement(By.id("flight-origin-hp-flight"));
		element.clear();
		element.sendKeys(flyFrom);
	}

	public static void sendFlyToTextBox(String flyTo, WebDriver driver) {
		element = driver.findElement(By.id("flight-destination-hp-flight"));
		element.clear();
		element.sendKeys(flyTo);
	}
}