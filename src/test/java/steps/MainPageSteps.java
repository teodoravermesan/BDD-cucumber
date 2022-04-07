package steps;

import basics.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;
import util.Data;

import org.junit.Assert;

public class MainPageSteps extends BaseTest {
	private final MainPage mainPageView = new MainPage(wbdriver.get());

	@Given("I am on homepage")
	public void iCheckHomepage() {
		Assert.assertEquals(Data.URL, mainPageView.checkUrl());
	}

	@When("I click the login button")
	public void iClickLoginButton() {
		mainPageView.clickOnLoginButton();
	}

	@Then("Header name is {string}")
	public void checkUsername(String name) {
		Assert.assertEquals(name, mainPageView.getUsernameText());
	}

	@Given("I load google page")
	public void iCheckHomeddpage() {
		mainPageView.loadUrl("http://google.com");
	}
}
