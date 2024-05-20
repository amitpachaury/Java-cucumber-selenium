package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features=".//Feature/inputTable.feature", glue= {"stepDefinitions"},
		monochrome= true,
	    strict= true,
		dryRun= false,
		plugin= {"pretty","junit:target/JUnitReports/reports.xml",
		          "json:target/JSONReports/reports.json",
		          "html:test-output"}
)

public class Testrunner {

}
