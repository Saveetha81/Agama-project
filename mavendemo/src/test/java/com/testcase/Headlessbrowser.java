package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headlessbrowser {
	public static void main(String[] args) {
		//HtmlUnitDriver driver =new HtmlUnitDriver();
WebDriver driver = new HtmlUnitDriver();
driver.get("https://www.facebook.com");
System.out.println(driver.getTitle());
}
}