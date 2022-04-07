package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications = true, monochrome = true, plugin = { "pretty", "json:target/MyReports/report.json",
		"junit:target/MyReports/report.xml", "html:target/MyReports/report-html", "rerun:target/MyReports/rerun.txt" },
//dryRun = true,
		tags = "@test",
//strict = true, 
		snippets = CucumberOptions.SnippetType.CAMELCASE, glue = { "steps", "hooks" }, features = {
				"src/test/resources/features" })

public class TestJUnitRunner {
}
