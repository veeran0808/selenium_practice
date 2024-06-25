package com.webdriverbasics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		//1.Browser specific : can not use for the cross browser
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		//******** Prefer for Local Execution ***********
		//2.WD = new CD - Valid Type Casting - recommended local execution
		//WebDriver driver  = new ChromeDriver();
		
		//3.SC = New CD - Valid but not recommended
		//SearchContext driver = new ChromeDriver();

		//4.RWD = New CD - Valid type casting - recommended
		//RemoteWebDriver driver = new ChromeDriver();
		
		//******** Prefer for Remote Execution ***********
		//5.WD = New RWD - Valid type casting - recommended used for remote execution
		//WebDriver driver = new RemoteWebDriver(remoteAddress,capabilities);
		
		//6.SC = New RWD
		//SearchContext driver = new RemoteWebDriver(remoteAddress,capabilities);
		
		//WD
		//WebDriver driver = new WebDriver(); // Invalid
	}

}
