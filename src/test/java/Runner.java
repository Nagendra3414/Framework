import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src\\test\\java\\features\\ScenarioOutline.feature" }, 
		glue = { "StepDefinitions" },
		tags = "@Regression"  // "@Sanity" means running sanity testcases only
		                      // "not @Sanity" means running all other testcases without Sanity testcases
		                      // " @Sanity or @ Smoke" for running both sanity and smoke
		, monochrome = true
// plugin = {"pretty", "html:target/Cucumber.html"}

)



public class Runner {

}
