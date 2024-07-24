package com.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcepts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		// Navigate to specific URL
		driver.navigate().to("https://www.amazon.com");
		System.out.println(driver.getCurrentUrl());
		// Navigate to back
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		// Navigate to forward
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		// Navigate to back
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
	}

}
