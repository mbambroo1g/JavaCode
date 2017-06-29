package com.fannie.utils;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
	static WebDriver driver;
	public static WebDriver getDriver(String driverName) {
		if(driverName.equalsIgnoreCase("CHROME")){
			ChromeOptions chromeOptions = new ChromeOptions();


			System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
			chromeOptions.addArguments("--start-maximized");
			chromeOptions.addArguments("--disable-web-security");
			chromeOptions.addArguments("--no-proxy-server");
			//			chromeOptions.addArguments("--incognito");
			java.util.Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			chromeOptions.setExperimentalOption("prefs", prefs);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			driver = new ChromeDriver(capabilities);

			return driver;
		}
		else if(driverName.equalsIgnoreCase("FIREFOX")){
			System.setProperty(Driver.FIREFOX, Driver.FIREFOX_PATH);
			driver = new FirefoxDriver();
			return driver;
		}
		else if(driverName.equalsIgnoreCase("IE")){
			System.setProperty(Driver.IE, Driver.IE_PATH);
			driver = new InternetExplorerDriver();
			return driver;
		}
		return null;
	}
}
