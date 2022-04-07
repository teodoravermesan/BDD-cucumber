package steps;

import basics.BaseTest;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginSteps extends BaseTest {
	private final LoginPage loginView = new LoginPage(wbdriver.get());

	@Then("I login with {string} and {string}")
	public void iLoginWithAnd(String email, String password) {
		loginView.enterEmail(email);
		loginView.enterPassword(password);
		loginView.clickOnLoginButton();
	}
}