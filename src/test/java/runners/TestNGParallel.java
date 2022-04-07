package runners;

import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(glue = { "steps" }, features = { "src/test/resources/features" })

public class TestNGParallel extends AbstractTestNGCucumberTests {
	//@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}

}
