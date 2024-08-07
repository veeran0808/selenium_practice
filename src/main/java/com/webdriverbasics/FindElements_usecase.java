package com.webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_usecase {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		By links = By.tagName("a");
		if(getTotalElementCount(links)>250) {
			
		}
		
	}

	
	
	// getAttribute() - generic method
		public void getElementsAttribute(By locator, String attrName) {
			List<WebElement> eleList = getElements(locator);
			for (WebElement e : eleList) {
				String attrVal = e.getAttribute(attrName);
				System.out.println(attrVal);
			}
		}

		
	//getElements - Generic method
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	//Give the total size present for specific locator
		public static int getTotalElementCount(By locator) {
			int eleCount = getElements(locator).size();
			System.out.println("total elements is.."+locator+"---->"+eleCount);
			return eleCount;
		}
}
