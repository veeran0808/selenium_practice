package com.webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropDownAllElements {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");

		
		
		// Drop-down html tage --> <select> tag mandatory
		// Use select class in selenium

		By country = By.id("Form_getForm_Country");
		// Create a webelement
		WebElement country_ele = driver.findElement(country);
		
		// Use select class for drop-down
		Select select = new Select(country_ele); // Pass webelement here

		// 1.Select by "Index"
		select.selectByIndex(1);
		

		// 2.Select by "value"
		select.selectByValue("belgium"); // Value attribute

		// 3.Select by "visibleText"
		select.selectByVisibleText("India"); // Text of the option *Recommanded
		
		
//-------------------Use Generic method---------------------------------------------//
		doSelectDropDownByIndex(country, 3); //use generic method
		doSelectDropDownByValue(country, "Belgium");
		doSelectDropDownByVisibleText(country, "India");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

}
