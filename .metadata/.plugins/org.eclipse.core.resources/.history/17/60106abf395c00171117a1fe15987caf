package com.fannie.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPageFactory {

	private WebDriver driver;

	@FindBy(id="tab-flight-tab-hp")
	WebElement flightTab;

	@FindBy(id="flight-origin-hp-flight")
	WebElement flyFrom;

	@FindBy(id="flight-destination-hp-flight")
	WebElement flyTo;

	public FlightPageFactory (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickFlightTab() {
		this.flightTab.click();
	}

	public void sendFlyFrom(String flyFrom) {
		this.flyFrom.sendKeys(flyFrom);
	}

	public void sendFlyTo(String flyTo) {
		this.flyTo.sendKeys(flyTo);
	}
}
