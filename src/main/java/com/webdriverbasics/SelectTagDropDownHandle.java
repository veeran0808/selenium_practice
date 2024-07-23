package com.webdriverbasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial" + "/");
		/*
		 * By country = By.id("Form_getForm_Country"); WebElement country_ele =
		 * driver.findElement(country); Select select = new Select(country_ele);
		 * List<WebElement> countryList = select.getOptions();
		 * System.out.println(countryList.size() - 1);
		 * 
		 * for (WebElement e : countryList) { String text = e.getText(); if
		 * (text.equals("Brazil")) { e.click(); break; } }
		 */

		By country = By.id("Form_getForm_Country"); //Check the size
		/*
		 * 
		 * if(getTotalDropDownOptions(country)-1==232) {
		 * System.out.println("country dropdown count is correct"); } //Check country
		 * list contain India if(getTotalDropDownTextList(country).contains("India")){
		 * System.out.println("India is present"); }
		 * 
		 * //Check the expected country present in list or not List<String>
		 * expCountryList = Arrays.asList("India","Brazil","Belgium");
		 * if(getTotalDropDownTextList(country).containsAll(expCountryList)) {
		 * System.out.println("Expected countries presented in list"); }
		 */
			
		//SelectDropdownValue - use
		SelectDropdownValue(country, "India");
		
//-------------------Use Generic method---------------------------------------------//
		/*
		 * doSelectDropDownByIndex(country, 3); // use generic method
		 * doSelectDropDownByValue(country, "Belgium");
		 * doSelectDropDownByVisibleText(country, "India");
		 */
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	// Select options generic method

	public static List<WebElement> getDropDownList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}

	public static List<String> getTotalDropDownTextList(By locator) {
		List<WebElement> optionsList = getDropDownList(locator);
		List<String> optionsTextList = new ArrayList<String>();
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
			}
		return optionsTextList;
		}

	

	public static int getTotalDropDownOptions(By locator) {
		return getDropDownList(locator).size();
	}
	
	//If select methods not working then use this method
	public static void SelectDropdownValue(By locator ,String expvalue) {
		List<WebElement> optionsList = getDropDownList(locator);
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(expvalue)) {
				e.click();
				break;
			}
		
		}
	}
}
