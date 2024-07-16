package com.webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		/*
		 * // Place holder value of first name String ph =
		 * driver.findElement(By.name("firstname")).getAttribute("placeholder");
		 * System.out.println(ph); // Logo element give src value String srcVal =
		 * driver.findElement(By.className("img-responsive")).getAttribute("src");
		 * String title =
		 * driver.findElement(By.className("img-responsive")).getAttribute("title");
		 * System.out.println("source value is" + srcVal);
		 * System.out.println("title value is" + title);
		 */
		By fn = By.name("firstname");
		By logo = By.className("img-responsive");
		String ph = getElementAttribute(fn, "placeholder");
		String src = getElementAttribute(logo, "src");
		String title = getElementAttribute(logo, "title");
		System.out.println(ph);
		System.out.println(src);
		System.out.println(title);
	}

	//WebElement -> getElement generic method
	 public static WebElement getElement(By locator) {
		 return driver.findElement(locator);
	 }
	 
	 //getAttribute -> Generic method
	 public static String getElementAttribute(By locator, String attrName) {
		 return getElement(locator).getAttribute(attrName);
	 }
}
