package com.webdriverbasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsFromPageSection {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By panelLinksList = By.xpath("//aside[@id='column-right']//a"); //13
		List<String>listText = getElementsTextList(panelLinksList);
		System.out.println(listText);
	}

	// getElements -> generic method
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);

	}

	// TextList - generic method
	public static List<String> getElementsTextList(By locator) {
		// Store text in arrayList
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String eleText = e.getText();
			eleTextList.add(eleText);

		}
		return eleTextList;
	}

}
