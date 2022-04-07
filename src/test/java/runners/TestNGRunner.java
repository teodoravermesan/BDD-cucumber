package runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(glue = { "steps" }, features = { "src/test/resources/features" })

public class TestNGRunner extends AbstractTestNGCucumberTests {
}
