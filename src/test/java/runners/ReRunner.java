package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "@target/MyReports/rerun.txt" }, glue = "steps", strict = true,

		plugin = { "pretty", "json:target/ReRunFailed/report.json", "junit:target/ReRunFailed/report.xml",
				"html:target/ReRunFailed/report-html", "rerun:target/ReRunFailed/rerun.txt" }, monochrome = true)
public class ReRunner {

}
