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

		// Verify how many same Links present in the page with Name "My Account"
		By myAccount = By.xpath("//a[text()='My Account']");
		int myAcc = driver.findElements(myAccount).size();
		System.out.println("the no of links is " + myAcc);
		// xpath - with text() and attribute
		// tag[@attr=’value’and text()=‘value’]
		// tag[text()=‘value’ and @attr=’value’]
		// a[@class='list-group-item' and text()='Register']
		// a[text()='Register' and @class='list-group-item']

		// Dynamic ID/Attribute
		// <input id = FirstName_123>
		// <input id = FirstName_345>
		// <input id = FirstName_678>

		// By.id("FirstName_123"); //Invalid xpath, where 'FirstName' is constant and
		// '123' Varies
		// input[contains(@id,'FirstName_']

		// contains() with text
		// tag[contains(text(),'value']
		// p[contains(text(),'marketing sales text')]
		// h2[contains(text(),'52000 companies')]

		// Give me all the links which contain amazon
		// a[contains(text(), 'Amazon')]

		// contains() with text and attribute
		// a[contains(text(), 'Science') and contains(@href,'amazon.science')]

		// 10.Xpath contains() with Text()& without contains() attribute:

		// tag[contains(text(),’value’) and (@attr = ’value’)]

		// Position or Index in Xpath
		By myEmailAddress = By.xpath("(//input[@class ='form-control'])[1]");
		// (//input[@class ='form-control'])[1] --> Index
		// (//input[@class ='form-control'])[position()=1] --> Position

		// Class in locators:className,xpath,css
		// provide exact value of Class

		// Class in locators: xpath
		// input[@class='form-control private-form__control login-email'] -> valid
		// input[@class='login-email'] - Invalid
		// input[contains(@class,'login-email')] - > valid

		// Class in locators: className
		By.className("form-control private-form__control login-email");// Not valid only one class Allowed
		By.className("login-email"); // valid

		// Parent to child:
		// parent/child -> direct
		// parent//child -> direct+indirect
		// select[@id='Form_getForm_Country']//option --> Direct+ indirect 233 elements

		// Child to Parent
		// select[@id='Form_getForm_Country']//option

		// preceding sibling
		// input[@id='input-email']/preceding-sibling::label

		// following sibiling
		// label[@for='input-email']/following-sibling::input
		// label[@for='input-email']/following-sibling::input[@name='email']

		// ->(//p[contains(text(),’Ali
		// Khan’)]/parent::td/following-sibling::td/input[@type=’checkbox’])[position()=1]/a
		// Immediate Parent
		// (//p[contains(text(),’Ali
		// Khan’)]/parent::td/following-sibling::td/input[@type=’checkbox’])[position()=1]/a

		// Ancestor
		// ->(//p[contains(text(),’Ali
		// Khan’)]/ancestor::td/following-sibling::td/input[@type=’checkbox’])[position()=1]/a

	}

}
