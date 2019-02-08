package bit.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	ChromeDriver dr;
	
	@Given("^i open browser$")
	public void i_open_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
	   dr = new ChromeDriver();
	}

	@Given("^i enter facebook url$")
	public void i_enter_facebook_url() throws Throwable {
	   dr.get("http://www.facebook.com");
	}	
    

	@When("^i enter userid as \"([^\"]*)\"$")
	public void i_enter_userid_as(String arg1) throws Throwable {
		dr.findElement(By.xpath(".//*[@id='email']")).sendKeys("abc123@yahoo.com");
	}

	@When("^i type password as \"([^\"]*)\"$")
	public void i_type_password_as(String arg1) throws Throwable {
		dr.findElement(By.xpath(".//*[@id='pass']")).sendKeys("abc123@yahoo");
	}

	@When("^i click on logIn button$")
	public void i_click_on_logIn_button() throws Throwable {
		dr.findElement(By.id("u_0_2")).click();
	}

	@Then("^I should be logged in successfully$")
	public void i_should_be_logged_in_successfully() throws Throwable {
		Thread.sleep(5000);
		System.out.println(dr.findElement(By.xpath(".//*[@id='header_block']/span")).isDisplayed());
	}



}
