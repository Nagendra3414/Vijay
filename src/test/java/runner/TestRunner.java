package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"C:\\Users\\Nagendra\\OneDrive\\Desktop\\Git\\cucmber\\src\\test\\java\\features"},
		glue = {"stepDefinitions"},
		monochrome =true,
		plugin = {"pretty", "html:target/vijay.html"},
		tags = "@Sanity and @Regression" 
		
		//tags = "@Smoke" - We want to run only Smoke test cases
		//tags = "no @Smoke" - If you want to except smoke testcases 
		//tags = "@Sanity or @Regression" - if you want to run those 2 tags
		// tags = "@Regression and @Sanity" (if you want to runtest with these both the tags)
		
		
		
		)
public class TestRunner {

}
