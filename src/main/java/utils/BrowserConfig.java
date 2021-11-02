package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserConfig {
	private static WebDriver driver;

	public static WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver getEDGEDriver() {
		System.setProperty("webdriver.edge.driver", "./src/main/resources/drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
