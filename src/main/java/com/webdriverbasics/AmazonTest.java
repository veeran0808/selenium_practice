package com.webdriverbasics;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("chrome");
		brUtil.launchURL("https://www.amazon.com");
		String actTitle = brUtil.getPageTitle();
		if(actTitle.contains("Amazon")) {
			System.out.println("title---pass "+actTitle);
		}
		else {
			System.out.println("title -- fail"+actTitle);
		}

		brUtil.quiteBrowser();
	}

}
