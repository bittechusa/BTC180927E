package bit.practice;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleStepDefinition {
	
	Base base = new Base();
	HomePage hp;
	
	@Given("^user open browser$")
	public void user_open_browser(DataTable arg1)  {
		List<List <String>> browsers =  arg1.raw();
		String browser = browsers.get(1).get(0);
		base.open(browser);
	}

	@Given("^navigate to url$")
	public void navigate_to_url() throws Throwable {
		hp = base.goToWebSite();
	}

	@When("^user will verify title$")
	public void user_will_verify_title() throws Throwable {
		hp.verifyHomePageTitle("Facebook");
	}

	@Then("^title should contains facebook keyword$")
	public void title_should_contains_facebook_keyword() throws Throwable {
		System.out.println("facebook");
	}
	
	
}
