package com.fannie.basictest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fannie.utils.DriverFactory;
import com.fannie.utils.DriverNames;

@RunWith(Parameterized.class) // First step to make a class parameterized.
public class LoginTest {
	@Parameters
	public static List<Object[]> data() throws IOException {
		try {
			File src = new File("C:\\Users\\Huser\\Medha\\Workspace\\SeleniumWorks\\LoginUsers.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh1 = wb.getSheetAt(0);

			System.out.println(sh1.getPhysicalNumberOfRows());

			int rowCount = sh1.getPhysicalNumberOfRows();
			List list = Arrays.asList(new String[][] {});
			for (int i = 1; i < rowCount; i++) {
				String a = sh1.getRow(i).getCell(0).getStringCellValue();
				String b = sh1.getRow(i).getCell(1).getStringCellValue();
				System.out.println(i);
				System.out.println(a);
				System.out.println(b);
				list = Arrays.asList(new String[][] { { a, b } });
			}
			return list;
		} catch (Exception e) {
		}
		return null;
	}
	String baseUrl;

	WebDriver driver;

	private String pwd;

	private String uName;

	public LoginTest(String uName, String pwd) {
		this.uName = uName;
		this.pwd = pwd;
	}



	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		baseUrl = "http://naveenks.com/selenium/LoginForm.html";
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		// Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.id("uname")).sendKeys(this.uName);
		// Thread.sleep(1500);
		driver.findElement(By.id("pwd")).sendKeys(this.pwd);
		// Thread.sleep(1500);
		driver.findElement(By.id("submitBtn")).click();
	}

}
