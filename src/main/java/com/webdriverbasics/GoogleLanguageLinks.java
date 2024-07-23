package com.webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//Xpath for lagLinks
		List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
        System.out.println(langLinks.size());
        for(WebElement e : langLinks) {
        	String text = e.getText();
        	if(text.equals("ಕನ್ನಡ")) {
        		e.click();
        		break;
        	}
        	
        	//System.out.println(text);
        }
	}
	
	//1.Click on a specific lang link
	//2.Return the last of the lang
	//3.capture the list of google footers
	

}
