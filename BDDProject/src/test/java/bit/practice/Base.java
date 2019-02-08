package bit.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	WebDriver dr;
	
	public void open(String browser) {
		
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
			 dr = new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			
		}
	}
	
	public HomePage goToWebSite() {
		dr.get("http://www.facebook.com");
		return new HomePage(dr);
	}
	
	
	
	
	

}
/*
go to target.com
buy a men product EX: shirt and a jewelery 

use page object model
Page factory 
use BDD framework 

in the runner class U will have all the 7 options

Cucumber Hooks. Before, After and customized from feature file
*/