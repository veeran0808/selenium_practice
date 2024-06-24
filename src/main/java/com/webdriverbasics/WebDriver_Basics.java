package com.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Basics {

	public static void main(String[] args) {

		// 1.Open browser
		String browser = "chrome";
		WebDriver driver = null;
		// cross browser logic to pass the browsers
		if (browser.equals("chrome")) {
			// type casting
			driver = new ChromeDriver();
		}

		else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		else if (browser.equals("EDGE")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("please pass the right browser : " + browser);
		}

		// 2.Enter URL
		driver.get("https://google.com");

		// 3.Get Title
		String actTitle = driver.getTitle();
		System.out.println("page title is : " + actTitle);

		// 4.validation point or check points
		if (actTitle.equals("Google")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		// Automation steps + validation = Automation testing
		// 5.close the browser
		driver.close();

	}

}
