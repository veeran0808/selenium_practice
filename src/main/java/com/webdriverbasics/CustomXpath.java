package com.webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// Xpath Is not attribute, It is address of the element in HTML Dom
		// Xpath 2 types
		// 1.Abosolute Xpath
		// 2.Reletive xpath : custom xpath
		
		//Verify how many same Links present in the page with Name "My Account"
		By myAccount = By.xpath("//a[text()='My Account']");
		int myAcc = driver.findElements(myAccount).size();
		System.out.println("the no of links is "+ myAcc);
		//xpath - with text() and attribute
		//tag[@attr=’value’and text()=‘value’]
		//tag[text()=‘value’ and @attr=’value’]
		//a[@class='list-group-item' and text()='Register']
		//a[text()='Register' and @class='list-group-item']


	}

}
