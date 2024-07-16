package com.webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	private WebDriver driver;

	// Create construct method
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * * Q: Why we initialize WebDriver as private? Ans: if we make it public any
	 * one can use this object & may get null point exception. to avoid null will
	 * use private
	 * 
	 */
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}
}
