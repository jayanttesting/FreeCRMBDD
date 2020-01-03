package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:/Maven Project/FreeCrmBDDFramework/src/main/java/Feature/login.feature",
		glue={"StepDefination"},
		format={"pretty","html:test-outout"},
		dryRun=true
		)
public class TestRunner {

	 
}
