package com.webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(4000);
		// Switch to frame
		//driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		driver.findElement(By.xpath("//a[text()='Ali khan']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();
		selectUser("deepthi guptha");
		selectUser("Ali Khan");

		String cName = getUserCompanyName("Ali Khan");
		System.out.println(cName);
	}

	//
	public static void selectUser(String userName) {
		driver.findElement(
				By.xpath("//a[text()='" + userName + "']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

	//
	public static  String getUserCompanyName(String userName) {
		return driver.findElement(
				By.xpath("//a[text()='" + userName + "']/parent::td/following-sibling::td/input[@context='company']"))
				.getText();
	}
}
