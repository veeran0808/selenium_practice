package com.webdriverbasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorConcept2 {

	static WebDriver driver;

	public static void main(String[] args) {
		// Create a web Element + Perform action (click,sendkeys,GetText,isDisplayed)
		// Create a webElement - Need locator
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		/*
		 * //1.ID - Unique
		 * //driver.findElement(By.id("input-password")).sendKeys("veera123");
		 * 
		 * //2.name : can be duplicate
		 * driver.findElement(By.name("email")).sendKeys("veera123"); By emailID =
		 * By.name("email");
		 * 
		 * //3.className - cane be duplicate most of times not recommended //use class
		 * name only when it is unique
		 * driver.findElement(By.className("font-contorl")).sendKeys("veera123");
		 */
		
		  //4.XPATH: it's not an attribute. it's the address of the element in HTML DOM
	/*	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("veera123");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("veera123");
		driver.findElement(By.xpath("//*[@id=\"content\\\"]/div/div[2]/div/form/input")).click();
		By emailID = By.xpath("//*[@id=\"input-email\"]");
		By password = By.xpath("//*[@id=\"input-password\"]");
		By loginBtn = By.xpath("//*[@id=\"content\\\"]/div/div[2]/div/form/input");*/
		//5.CSS Selector - it's not an attribute.
		
		By emailID = By.cssSelector("#input-email");
		By password = By.cssSelector("#input-password");
		By loginBtn = By.cssSelector("#content > div > div:nth-child(2) > div > form > input");
		doSendkeys(emailID, "veerakrishns");
		doSendkeys(password, "abc123");
		doClick(loginBtn);
		////*[@id=\"content\"]/div/div[2]/div/form/input		
	}
	      public static WebElement getElement(By locator) {
	    	  return driver.findElement(locator);
	      }
	      
	      public static void doClick(By locator) {
	    	  getElement(locator).click();
	      }
	      public static void doSendkeys(By locator, String value) {
	  		getElement(locator).sendKeys(value);
	  	}
	      
}
