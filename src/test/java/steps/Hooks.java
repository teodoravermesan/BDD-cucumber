/**
 * 
 */
package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import basics.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import util.Log;

public class Hooks {
	BaseTest baseTest;

	@Before
	public void initializeTest() {
		baseTest = new BaseTest();
		baseTest.setUp();
	}

	@Before
	public void step(Scenario scenario) {
		System.out.println("Current Thread ID: " + Thread.currentThread().getId() + "<->" + "Scenario:" + scenario.getName());
	}

	@After
	public void endTest(Scenario scenario) {
		if (scenario.isFailed()) {

			try {
				Log.info(scenario.getName() + " is Failed");
				final byte[] screenshot = ((TakesScreenshot) BaseTest.wbdriver.get()).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", "failed");
			} catch (WebDriverException e) {
				e.printStackTrace();
			}

		} else {
			try {
				Log.info(scenario.getName() + " is pass");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@After
	public void tearDown() {
		baseTest = new BaseTest();
		baseTest.tearDown();
	}
}
