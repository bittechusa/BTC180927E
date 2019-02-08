package bit.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SamplStepDefinition {
	
	ChromeDriver dr;
	@Given("^i enter facebook$")
	public void i_enter_facebook() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
		 dr = new ChromeDriver();
		 dr.get("http://www.facebook.com");
	}

	@When("^i type userId as \"([^\"]*)\"$")
	public void i_type_userId_as(String arg1) throws Throwable {
		dr.findElement(By.xpath(".//*[@id='email']")).sendKeys(arg1);
	}

	@When("^i type passord as \"([^\"]*)\"$")
	public void i_type_passord_as(String arg1) throws Throwable {
		dr.findElement(By.xpath(".//*[@id='pass']")).sendKeys(arg1);
	}

	@When("^i click on log in button$")
	public void i_click_on_log_in_button() throws Throwable {
		dr.findElement(By.id("u_0_2")).click();
	}

	@Then("^i should be logged in successfully$")
	public void i_should_be_logged_in_successfully() throws Throwable {
		Thread.sleep(5000);
		System.out.println(dr.findElement(By.xpath(".//*[@id='header_block']/span")).isDisplayed());
	}



}
