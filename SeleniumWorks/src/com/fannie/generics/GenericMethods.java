package com.fannie.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fannie.utils.ElementType;

public class GenericMethods {
	private WebDriver driver;
	public GenericMethods(WebDriver driver){
		this.driver = driver;
	}
	public WebElement getElement(String locator, String type){
		WebElement element = null;
		if(type.equals(ElementType.ID)){
			element = driver.findElement(By.id(locator));
		}else if(type.equals(ElementType.XPATH)){
			element=driver.findElement(By.xpath(locator));
		}else if(type.equals(ElementType.CLASSNAME)){
			element=driver.findElement(By.className(locator));
		}else if(type.equals(ElementType.NAME)){
			element=driver.findElement(By.name(locator));
		}
		return element;
	}

}