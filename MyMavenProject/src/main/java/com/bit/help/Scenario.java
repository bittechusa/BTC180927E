package com.bit.help;

import org.openqa.selenium.By;

public class Scenario {
	
	Common c = new Common();
	
	public void fblogIn() throws InterruptedException {
		c.openBrowser();
		c.goToAnySite("http://www.facebook.com");
		c.verifypageTitle("Facebook - Log In or Sign Up");
		c.verifypageUrl("https://www.facebook.com/");
		c.myType(By.id("email"), "abvfgjhjk123@yahoo.com");
		c.myType(By.xpath(".//input[@id='pass']"), "Abcdrfhgt123!@@");
		c.myClick(By.xpath(".//*[@id='u_0_2']"));
		c.myWait(4000);
		c.verifyElementDisplay(c.dr.findElement(By.xpath(".//*[@id='blueBarDOMInspector']/div/div[1]/div/div/h1/a/i")));
		c.closeBrowser();
	}

	//create end to end: go to macys > select any product > add to cart > complete purchase 
	public void macysPurchase() {
		
	}
	
	//create end to end: go to target > select any product > add to cart > complete purchase 
	public void targetPurchase() {
		
	}
}
