package bit.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath = "") WebElement someElement;
	
	WebDriver dr;
	
	HomePage(WebDriver dr){
		this.dr = dr;
	}
	
	public Menpage verifyHomePageTitle(String title) {
		dr.getTitle().contains(title);
		return new Menpage(dr);
	}
	
	public WomenPage goToWomenPage() {
		
		return new WomenPage(dr);
	}

}
