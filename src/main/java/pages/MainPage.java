package pages;

import org.openqa.selenium.WebDriver;


public class MainPage extends BaseActionPage {
	public MainPage(WebDriver driver) {
		super(driver);
	}

	private static final String SEARCH_INPUT = "#searchInput";
	private static final String SEARCH_BUTTON = "#searchButton";
	private static final String ENGLISH_LANGUAGE_BUTTON = "#js-link-box-en";
	private static final String LOGIN_BUTTON = "#pt-login";
	private static final String USERNAME_TEXT_HEADER = "#pt-userpage";

	public void clickOnLoginButton() {
		clickElement(LOGIN_BUTTON);
	}

	public boolean isLoginButtonDisplayed() {
		return isElementDisplayed(LOGIN_BUTTON);
	}

	public String getUsernameText() {
		return getTextForElement(USERNAME_TEXT_HEADER);
	}

	public void typeKeyword(String key) {
		sendKeys(SEARCH_INPUT, key);
	}

	public void clickOnSearchButton() {
		clickElement(SEARCH_BUTTON);
	}

	public void clickOnEnglish() {
		clickElement(ENGLISH_LANGUAGE_BUTTON);
	}

	public String checkUrl() {
		return getUrl();
	}
}
