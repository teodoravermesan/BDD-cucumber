package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseActionPage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private final String emailTextField = "#wpName1";
	private final String passwordTextField = "#wpPassword1";
	private final String loginButton = "#wpLoginAttempt";

	public void enterEmail(String email) {
		sendKeys(emailTextField, email);
	}

	public void enterPassword(String password) {
		sendKeys(passwordTextField, password);
	}

	public void clickOnLoginButton() {
		clickElement(loginButton);
	}
}
