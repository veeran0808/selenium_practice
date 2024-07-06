package com.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		// 1.Initialize the browser
			WebDriver driver = new ChromeDriver(); //123
            driver.get("https://google.com"); //123
            //ChromeDriver: chrome on windows (173f0ee79a96e8c6b9b7152fd00a9439)
            String title = driver.getTitle(); //123
            String currentURL = driver.getCurrentUrl();
            //SID - ChromeDriver: chrome on windows (173f0ee79a96e8c6b9b7152fd00a9439)
            System.out.println("title is.."+title );
            System.out.println("current Title is...."+ currentURL); //123
           // driver.quit();  // org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
            driver.close(); // org.openqa.selenium.NoSuchSessionException: invalid session id (Seassion ID Is not null
            System.out.println(driver.getTitle());
            //SID - Null
          
			}

		}
