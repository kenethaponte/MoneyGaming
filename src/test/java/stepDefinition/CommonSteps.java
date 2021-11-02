package stepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import utils.BrowserConfig;

public class CommonSteps {

	
	@Given("I open CHROME")
	public void i_open_chrome() {
		BrowserConfig.getChromeDriver();
	}
	
	@Given("I open EDGE")
	public void i_open_edge() {
		BrowserConfig.getEDGEDriver();
	}
	
	@After
	public void tearDown(Scenario myScenario) {
		
		//Screenshot
		byte[] screenshot = ((TakesScreenshot)BrowserConfig.getDriver()).getScreenshotAs(OutputType.BYTES);
        myScenario.attach(screenshot, "image/png", "screenshot");  // Stick it in the report
        
		System.out.println("Closing browser...");
		BrowserConfig.getDriver().quit();
		
		
	}
}
