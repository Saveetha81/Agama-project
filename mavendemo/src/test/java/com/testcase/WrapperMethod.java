package com.testcase;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WrapperMethod{
	public WebDriver driver;
	WebDriverWait wait;

	public void chrome_browser(String Url) {
		String strchromedriver = "D:\\Geetha\\Software\\latest_software_qa\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strchromedriver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Url);
	}

	public void ie_browser(String Url) {
		System.setProperty("webdriver.ie.driver",
				"D:\\Geetha\\Software\\latest_software_qa\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");

		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Url);
	}

	public void byid_sendkey(String id, String val) {
		driver.findElement(By.id(id)).sendKeys(val);
	}

	public void byid_click(String id) {
		driver.findElement(By.id(id)).click();
	}

	public void byname_click(String name) {
		driver.findElement(By.name(name)).click();
	}
	public void byname_submit(String name) {
		driver.findElement(By.name(name)).submit();
	}

	public void byxpath_sendkey(String xpstr, String Val) {
		System.out.println("xpstr    : " + xpstr + "Val    : " + Val);
		driver.findElement(By.xpath(xpstr)).sendKeys(Val);
	}

	public void my_wait(int secs,String tagname) {
		System.out.println(secs);
	 //driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
	
	 
	  wait = new WebDriverWait(driver, 15);

	 //wait.until(ExpectedConditions.visibilityOf(textbox));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(tagname)));
	 System.out.println(secs);		
	 
	 
	}
	public void byxpath_click(String xpstr) {
		driver.findElement(By.xpath(xpstr)).click();
	}
	
	public void selectdropdown(String id,String vtxt) {
		Select month = new Select(driver.findElement(By.id(id)));
		month.selectByVisibleText(vtxt);
	}
	
	public void takesnap(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File((path)));
	}
    public void fileupload(String id,String path) {
		driver.findElement(By.id(id)).sendKeys(path);

    }
	public void searchtextcount(String tname)
	{
		List<WebElement> links = driver.findElements(By.tagName(tname));
		System.out.println("No. of links: " + links.size());
			//for (int i = 0; i <= links.size(); i = i + 1)
			//{
		
			//	System.out.println(links.get(i).getText());
			//}
	}
	
	
	/*public void selectdropdown(String text) {
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText(text);
	}*/
 
	public void closeapp() {
		driver.close();
	}

	public void insertapp(String string) {
		// TODO Auto-generated method stub
		
	}


}
