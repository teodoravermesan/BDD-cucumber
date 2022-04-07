package basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Log;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public static ThreadLocal<WebDriver> wbdriver = new ThreadLocal<WebDriver>();
	public Properties configProp;

	public void setUp() {

		try {

			configProp = new Properties();
			FileInputStream configProFile = new FileInputStream("config.properties");
			configProp.load(configProFile);
			String browser = configProp.getProperty("browser");
			Log.info("Opening a browser");
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				wbdriver.set(new ChromeDriver());
			} else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				wbdriver.set(new FirefoxDriver());
			}
			Log.info("New browser opened");
			wbdriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Log.info("Implicit wait applied on the driver for 10 seconds");
			wbdriver.get().manage().deleteAllCookies();
			Log.info("Browser window is maximized");
			wbdriver.get().manage().window().maximize();
			wbdriver.get().get(configProp.getProperty("url"));
		} catch (IOException ex) {

		}
	}

	public void tearDown() {
		wbdriver.get().quit();
		// driver = null;
	}

}
