package com.webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Naveen automations labs");
		Thread.sleep(3000);
		By goggleSuggListLocator = (By.xpath("//div[@class='wM6W7d']/span"));
		/*
		 * List<WebElement> suggestionList =
		 * driver.findElements(By.xpath("//div[@class='wM6W7d']/span")); int size
		 * =suggestionList.size(); System.out.println(size); for(WebElement
		 * e:suggestionList ) { String text = e.getText(); System.out.println(text);
		 * if(text.contains("naveen automation labs github")) { e.click(); break; } }
		 */
		doSearch(goggleSuggListLocator, "naveen automationlabs reviews");
	}

	public static void doSearch(By suggListLocator, String sugName) {
		List<WebElement> sugList = driver.findElements(suggListLocator);
		for (WebElement e : sugList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(sugName)) {
				e.click();
				break;
			}
		}
	}
}
