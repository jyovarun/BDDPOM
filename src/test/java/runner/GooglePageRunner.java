package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(publish=true,
		features="src//test/resources//features//CRMLogin.feature",
		glue={"stepdef"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"}
				
		
		)
public class GooglePageRunner {

}
