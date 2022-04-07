package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Log;

public class BaseActionPage {
	protected WebDriver driver;

	protected BaseActionPage(WebDriver driver) {
		this.driver = driver;
	}

	protected void sendKeys(String cssLocator, String text) {
		Log.info("Entering keys into" + " " + cssLocator);
		driver.findElement(By.cssSelector(cssLocator)).sendKeys(text);
	}

	protected void clickElement(String cssLocator) {
		Log.info("Clicking element" + " " + cssLocator);
		driver.findElement(By.cssSelector(cssLocator)).click();
	}

	protected String getTextForElement(String cssLocator) {
		return driver.findElement(By.cssSelector(cssLocator)).getText();
	}

	public void loadUrl(String url) {
		Log.logStart("Loagin Url");
		driver.get(url);
		Log.logEnd("Url loaded");
	}

	protected boolean isElementDisplayed(String cssLocator) {
		return driver.findElement(By.cssSelector(cssLocator)).isDisplayed();
	}

	protected String getUrl() {
		return driver.getCurrentUrl();
	}
}
