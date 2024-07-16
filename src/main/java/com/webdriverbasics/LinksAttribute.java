package com.webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttribute {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElements(By.tagName("a"));
		By links = By.tagName("a");
		By images = By.tagName("images");

		/*
		 * List<WebElement> linksList = getElements(links); List<WebElement> imagesList
		 * = getElements(images); int Linkssize = linksList.size(); int imagesSize =
		 * imagesList.size(); System.out.println("links size is" + Linkssize);
		 * System.out.println("images size is" + imagesSize);
		 */

		/*
		 * for (WebElement e : linksList) { // href attribute value String hrefValue =
		 * e.getAttribute("href"); // getText String linkText = e.getText();
		 * System.out.println(hrefValue + "::::" + linkText); }
		 * 
		 * for (WebElement e : imagesList) { // href attribute value String srcValue =
		 * e.getAttribute("src"); System.out.println("src value is-----------" +
		 * srcValue); }
		 */
		getElementsAttribute(images, "src");
		getElementsAttribute(links, "href");
	}

	// getAttribute
	public static void getElementsAttribute(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String attrVal = e.getAttribute(attrName);
			System.out.println(attrVal);
		}
	}

	// getElements -> generic method
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
