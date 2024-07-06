package com.webdriverbasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		// Create a web Element + Perform action (click,sendkeys,GetText,isDisplayed)
		// Create a webElement - Need locator
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		/*
		 * // 1.ID // 1nd Approach - webElement Locator // username
		 * driver.findElement(By.id("input-email")).sendKeys(
		 * "gopikrishnaveera@gmail.com"); // password
		 * driver.findElement(By.id("input-password")).sendKeys("veera123");
		 * 
		 * // 2nd Approach - webElement Locator - WebElement // WebElement will hit
		 * every time to the server WebElement emailID =
		 * driver.findElement(By.id("input-email")); WebElement pwd =
		 * driver.findElement(By.id("input-password"));
		 * emailID.sendKeys("gopikrishnaveera@gmail.com"); pwd.sendKeys("veera123");
		 * 
		 * // 3rd Approach - Webelement Locator - By Locator // By Locator not hitting
		 * the server it acts like Object repository By emailID1 = By.id("input-email");
		 * By pwd2 = By.id("input-password");
		 * 
		 * WebElement eid = driver.findElement(emailID1); WebElement pwdd =
		 * driver.findElement(pwd2);
		 * 
		 * eid.sendKeys("veera123"); pwdd.sendKeys("veera123");
		 * 
		 * // 4TH Approach - By Locator + generic method for the WebElement By emailID2
		 * = By.id("input-email"); By pwd3 = By.id("input-password");
		 * 
		 * getElement(emailID2).sendKeys("veer@gmail.com");
		 * getElement(pwd3).sendKeys("abce123");
		 * 
		 * // 5th Approach - By Locator + generic method for the WebElement & Action By
		 * emailID3 = By.id("input-email"); By pwd4 = By.id("input-password");
		 * doSendkeys(emailID3, "abc123"); doSendkeys(pwd4, "krish345");
		 */

       //6TH Approach - By locator + Generic method for webElement Actions in "ElementUtil" class
		ElementUtil eleUtil = new ElementUtil(driver);
		By emailID = By.id("input-email");
		By password = By.id("input-password");
		eleUtil.doSendkeys(emailID, "gopikrishinaveera@gmail.com");
		eleUtil.doSendkeys(password, "abc123");
	}
	/*
	 * public static WebElement getElement(By locator) { return
	 * driver.findElement(locator); }
	 * 
	 * public static void doSendkeys(By locator, String value) {
	 * getElement(locator).sendKeys(value); }
	 */
}
