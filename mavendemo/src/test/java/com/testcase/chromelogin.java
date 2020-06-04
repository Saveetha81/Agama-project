package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromelogin {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:/software download/chromedriver_win32/chromedriver.exe");
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	}

}
