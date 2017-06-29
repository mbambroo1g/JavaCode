package com.fannie.basictest;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing1 {
  private WebDriver driver;
  private String baseUrl;
  
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testIng1() throws Exception {
    driver.get(baseUrl + "/?gws_rd=ssl#q=places+to+visit+in+virginia");
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("places to visit in virginia");
    driver.findElement(By.id("_fZl")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }

}
