package com.webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;

public class CustomCssSelector {

	public static void main(String[] args) {
		// id
		// #input-firstname - cssSelector
		// input[@id='input-firstname'] -- xpath
		By fn = By.cssSelector("#input-firstname");
		// tag#id
		// input#input-firstname

		// class

		// .c1.c2.c3...cn

		// class="form-control private-form__control login-email"

		// .classname 1.class name
		// .login-email ->1.class name

		// tag.class -> 2.tag name
		// input.login-email -> 2.tag name

		// .c1.c2.c3...cn -> 3.multiple classes together
		// form-control.private-form__control.login-email
		
		
	}

}
