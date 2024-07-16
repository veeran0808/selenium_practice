package com.webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		// 1.Find all links on the page
		List<WebElement> imgList = driver.findElements(By.tagName("img"));

		// 2.print the total links count
		int imgCount = imgList.size();
		System.out.println("Total images count is..." + imgCount);
	}

}
