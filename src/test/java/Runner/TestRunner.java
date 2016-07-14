package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue={"stepDefination"},
		plugin={
			"html:target/cucmber-html-report",
			"json:target/cucumber.json",
			"pretty:target/cucumber-pretty.txt",
			"junit:target/cucumber-results.xml"
			}
		)
public class TestRunner {
}