package com.fannie.basictest;
// This program have 3 test cases

// 1. to show multiple select
// 2. To test on expedia.com to select the dropdown button and
// get all the values in it iterate and show it to the user
// 3. Get attribut by value

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

public class Test05 {
	String baseURL;
	String baseURL1;
	String baseURL2;
	String baseURL3;
	WebDriver driver;

	@Ignore
	@Test
	public void expediaTest() throws Exception {
		driver.get(baseURL1);
		// move from Bundle Deals to Flights tab
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		// to select rooms id -> package-rooms-hp-package
		// to select adults id -> package-1-adults-hp-package
		// to select children id -> package-1-children-hp-package
		WebElement roomsElement = driver.findElement(By.id("flight-adults-hp-flight"));
		Select roomsSelect = new Select(roomsElement);
		List<WebElement> options = roomsSelect.getOptions();

		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		roomsSelect.selectByIndex(1);
		Thread.sleep(2000);
		roomsSelect.selectByIndex(2);
		Thread.sleep(3000);
	}

	@Ignore
	@Test
	public void getAttributeValue() throws Exception {
		driver.get(baseURL2);
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/form/div[13]/div/input[1]"));
		String elementText = element.getAttribute("value");
		System.out.println("Element Text -> " + elementText);
	}

	@Ignore @Test
	public void getAttributeValueTest(){
		driver.get(baseURL2);
		WebElement element = driver.findElement(By.xpath("html/body/div[1]/form/div[13]/div/input[1]"));
		String elementText = element.getAttribute("value");
		System.out.println("Attribute value is -> "+elementText);
	}

	@Ignore @Test
	public void multipleSelectTest() throws InterruptedException {
		driver.get(baseURL);

		WebElement selectElement = driver.findElement(By.xpath(".//*[@id='post-291']/div/div[2]/select"));

		Select select = new Select(selectElement);
		select.getOptions();
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.deselectByIndex(2);
		Thread.sleep(2000);
		select.selectByValue("Andean");
		Thread.sleep(2000);
		select.selectByValue("American");
		Thread.sleep(2000);
		select.selectByValue("Greater");
		Thread.sleep(2000);
		select.selectByValue("Lesser");
		Thread.sleep(2000);
		//select.deselectAll();
		List<WebElement> selectedList = select.getAllSelectedOptions();
		System.out.println(selectedList.size());
		for(WebElement temp: selectedList){
			System.out.println(temp.getText());
		}
	}

	@Test
	public void sendWhatsappMessage() throws InterruptedException{
		driver.get(baseURL3);
		WebElement element = driver.findElement(By.xpath(".//*[@id='pane-side']/div/div/div/div[1]/div/div/div[2]/div[1]/div[1]/span"));
		//WebElement element=driver.findElement(By.("Kelutral"));
		element.click();
		Thread.sleep(2000);
		//WebElement textField = driver.findElement(By.xpath(".//*[@id='main']/footer/div[1]/div[2]/div/div[2]"));
		//textField.sendKeys("Hello...");
		//driver.findElement(By.xpath(".//*[@id='main']/footer/div[1]/button")).click();
		Thread.sleep(2000);
	}

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		baseURL = "http://html.com/attributes/select-multiple/";
		baseURL1 = "https://www.expedia.com/";
		baseURL2 = "http://naveenks.com/selenium/RegForm.html";
		baseURL3 = "https://web.whatsapp.com/";
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Ignore
	@Test
	public void test() throws Exception {
		driver.get(baseURL);
		// //*[@id="post-291"]/div/div[2]/select
		WebElement element = driver.findElement(By.xpath(".//*[@id='post-291']/div/div[2]/select"));
		Select select = new Select(element);
		select.selectByValue("American");
		select.selectByValue("Greater");
		Thread.sleep(2000);
		select.deselectByValue("Greater");
		Thread.sleep(2000);
		select.selectByValue("Andean");
		Thread.sleep(2000);
		select.deselectAll();
	}
}