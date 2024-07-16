package com.webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		/*
		 * // Check image is displayed boolean flagImag =
		 * driver.findElement(By.className("img-responsive")).isDisplayed(); if
		 * (flagImag) System.out.println("pass");
		 * 
		 * // Check Search is visible boolean flagSearch =
		 * driver.findElement(By.name("search")).isDisplayed(); if (flagSearch)
		 * System.out.println("pass"); // If search box enabled enter data
		 * driver.findElement(By.name("search")).sendKeys("veera");
		 */
		
		By logoImage = By.className("img-responsive"); //logo image
		By searchBox = By.name("search"); //search text box
		By searchButton = By.cssSelector("#search > span > button"); //search button
		
		if(doElementIsDisplayed(logoImage)) {
			System.out.println("LogoImage is displayed");
		}
		
		if(doElementIsDisplayed(searchBox)) {
			System.out.println("Search box is displayed");
	    //If search box is Displayed enter data
			doSendKeys(searchBox, "veera123");
		//Click on search button 
			doClick(searchButton);
		}
		
	}

	// 1.generic method for GetElement Locator
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	// 2.generic method for is displayed
	public static boolean doElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	// 3.Generic method for SendKeys
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	//4.generic method for click()
	public static void doClick(By locator) {
		getElement(locator).click();
	}
}
