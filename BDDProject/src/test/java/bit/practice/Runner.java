package bit.practice;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "/Users/bittechconsulting/eclipse-workspace/BDDProject/abc.feature" }, 
				format = {"json:Folder_Name/cucumber.json", "pretty", "html:Folder_Name" }, 
				glue = { "bit.practice" }, dryRun = true, tags = "smoke")
public class Runner {

}
