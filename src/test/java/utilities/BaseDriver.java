package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;



public class BaseDriver {
	
	private static String browserName = System.getProperty("browser", "chrome");
	private static final ThreadLocal<WebDriver> LocalDriver = new ThreadLocal<>();
	
	public static void setDriver(WebDriver driver) {
		BaseDriver.LocalDriver.set(driver);
	}

	public static WebDriver getDriver() {
		return LocalDriver.get();
	}

	public static WebDriver getBrowser(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("remote alloworigins=* ");
			return new ChromeDriver(chromeOptions); 
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
			
		default:
			throw new RuntimeException("Browser not Found!" + browserName);
		}
	}
		
	@BeforeMethod
	public static synchronized void setBrowser() {
		WebDriver webDriver = getBrowser(browserName);
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		webDriver.manage().window().maximize();
		setDriver(webDriver);
	}
		
		@AfterSuite
		public static synchronized void quitBrowser() {
			getDriver().quit();
		}

	}
