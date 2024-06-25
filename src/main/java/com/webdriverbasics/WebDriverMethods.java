package com.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// 1.Initialize the browser
		WebDriver driver = new ChromeDriver();

		// 2.Launch URL
		driver.get("https://www.amazon.in/");

		// 3.Maxizmie window
		driver.manage().window().maximize();
		// driver.manage().window().fullscreen();
		/*
		 * Note 1: While using bigger machine/bigger screen "maximize" may not work, In
		 * that case we can use "fullscreen()".
		 */

		// 4.Delete cookies
		// Delete all the cookies for the current domain.
		driver.manage().deleteAllCookies();

		// 5.Get currentURL
		// Get a string representing the current URL that the browser is looking at.
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		
		if(currentURL.contains("https://www.amazon.in/")) {
			System.out.println("Test is PASS");
		}
		
		String pgSource = driver.getPageSource();
		System.out.println(pgSource);
		
		driver.quit();
	}

}
