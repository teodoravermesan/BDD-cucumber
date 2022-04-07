package steps;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import basics.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;
import pages.ResultPage;

public class SearchSteps extends BaseTest {
	private final MainPage mainPageView = new MainPage(wbdriver.get());
	private final ResultPage resultPage = new ResultPage(wbdriver.get());

	@Test
	@When("Search {string} in search text box")
	public void testSearch(String word) {
		mainPageView.typeKeyword(word);
		mainPageView.clickOnSearchButton();
	}

	@Test
	@Then("{string} page is displayed")
	public void testResultsDisplayed(String word) {
		AssertJUnit.assertEquals(resultPage.checkTitle(), word);
	}

}
