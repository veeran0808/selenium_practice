package com.webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) {
		String browserName = "edge";
		// Create a object for BrowserUtil
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver(browserName);

		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		brUtil.getPageTitle();

		// by Locators - Registration page
		By firstName = By.id("input-firstname"); // firstName
		By lastName = By.id("input-lastname"); // LastName
		By email = By.id("input-email"); // Email
		By telephone = By.id("input-telephone"); // Telephone
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");

		// Create a object for element Util
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendkeys(firstName, "abc");
		eleUtil.doSendkeys(lastName, "def");
		eleUtil.doSendkeys(email, "ghf@gmail.com");
		eleUtil.doSendkeys(telephone, "12345");
		eleUtil.doSendkeys(password, "abc123");
		eleUtil.doSendkeys(confirmPassword, "abc123");

	}
}