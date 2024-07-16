package com.webdriverbasics;

import java.util.ArrayList;
import java.util.List;

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
	// Get Element
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	// getElements -> generic method
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);

	}

	// sendKeys() - generic method
	public void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	// click() - generic method
	public void doClick(By locator) {
		getElement(locator).click();
	}

	// getText() - generic method
	public String doElementGetText(By locator) {
		return getElement(locator).getText();

	}

	// isDisplayed() - generic method
	public boolean doElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	// getAttribute() - generic method
	public void getElementsAttribute(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String attrVal = e.getAttribute(attrName);
			System.out.println(attrVal);
		}
	}

	// Elements TextList - generic method
	public List<String> getElementsTextList(By locator) {
		// Store text in arrayList
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String eleText = e.getText();
			eleTextList.add(eleText);

		}
		return eleTextList;
	}

	// Give the total size present for specific locator
	public int getTotalElementCount(By locator) {
		int eleCount = getElements(locator).size();
		System.out.println("total elements is.." + locator + "---->" + eleCount);
		return eleCount;
	}

	// getAttribute single -> Generic method
	public String getElementAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

}
