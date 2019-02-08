package com.bit.help;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {
	
	WebDriver dr;
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
		dr = new ChromeDriver(); //this line will open blank chrome browser
		dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	//method will wait 5 second then close the browser
	public void closeBrowser() throws InterruptedException {
		myWait(5000);
		dr.quit();
	}
	
	public void goToAnySite(String url) {
		dr.get(url);
		System.out.println("navigating to : " + url);
	}
	
	public void myWait(long mil) throws InterruptedException {
		Thread.sleep(mil);
	}
	
	public void myClick(By by) {
		dr.findElement(by).click();
	}
	
	public void myType(By by, String textToType) {
		dr.findElement(by).sendKeys(textToType);
	}
	
	public void verifypageTitle(String expectedTitle) {
		boolean s = dr.getTitle().equals(expectedTitle);
		System.out.println("Page title matched ! : " + s);
	}
	
	public void verifypageUrl(String expectedUrl) {
		boolean s = dr.getCurrentUrl().equals(expectedUrl);
		System.out.println("Page URL matched ! : " + s);
	}
	
	public void verifyElementDisplay(WebElement ele) {
		boolean b = ele.isDisplayed();
		System.out.println("Element displayed ! : " + b);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
