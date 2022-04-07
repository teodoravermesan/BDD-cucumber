/**
 * 
 */
package steps;

import basics.BaseTest;
import io.cucumber.java.en.Then;
import pages.MainPage;

import org.junit.Assert;

public class LogoutSteps extends BaseTest {
	private final MainPage mainPageView = new MainPage(driver);

	@Then("I logout")
	public void logout() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}

	@Then("Sign in button is displayed")
	public void signInButtonDisplayed() {
		Assert.assertTrue(mainPageView.isLoginButtonDisplayed());
	}
}
