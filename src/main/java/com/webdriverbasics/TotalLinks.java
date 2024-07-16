package com.webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {

		// Find all links on the page
		// print the total links count
		// print the text of each link

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		// 1.Find all links on the page
		List<WebElement> linkList = driver.findElements(By.tagName("a"));

		// 2.print the total links count
		int listCount = linkList.size();
		System.out.println("Total links count is..." + listCount);

		// 3.print the text of each link - method 1: for loop
		/*
		 * for (int i = 0; i < listCount; i++) { String linkText =
		 * linkList.get(i).getText(); // Avoid blank text in all links data if
		 * (linkText.length() > 0) { System.out.println(i + ":" + linkText); } }
		 */
		
		// 3.print the text of each link - method 1: for-each
		int count=0;
		for(WebElement e : linkList) {
			String text = e.getText();
			if(text.length()>0) {
				System.out.println(count+":"+text);
			}
			count++; //check the count of the links 
		}
	}

}
