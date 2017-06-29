package com.fannie.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasicEx1 {
	public static void main(String[] args) {
		String baseUrl="http://google.com";
		WebDriver driver;
		//Load the driver
		//step 1: TODO
		//Loads the chrome driver.


		//"webdriver.firefox.marionette"
		System.setProperty("webdriver.ie.driver", "C:\\Software\\SeleniumDriver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();

		//Open the browser/connection
		//step 2: TODO
		driver.get(baseUrl);

		//Execute the job
		//step 3: TODO
		System.out.println("Title is: "+driver.getTitle());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Close the browser/connection
		//step 4: TODO
		driver.close();

	}
}
