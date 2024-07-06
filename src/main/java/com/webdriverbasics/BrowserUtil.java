package com.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	private WebDriver driver;

	/**
	 * This method is used to intialize the driver on the basis of given browser
	 * name
	 * 
	 * @param browserName
	 * @return this return a specific browser driver
	 */
	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is : " + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the valid browser..." + browserName);

		}
		// delete the all cookies
		driver.manage().deleteAllCookies();
		// maximize the window
		driver.manage().window().maximize();
		return driver;
	}

	public void launchURL(String url) {
		if (url == null) {
			System.out.println("url cannot be null");
		}
		if (url.indexOf("https:") == 0) {
			driver.get(url);
		}

	}

	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Page title is :" + title);
		return title;
	}

	public String getPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("Page title is :" + url);
		return url;
	}

	public void closeBrowser() {
		if (driver != null) {
			driver.close();
		}
	}

	public void quiteBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}

}
