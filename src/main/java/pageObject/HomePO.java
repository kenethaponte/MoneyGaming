package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BrowserConfig;

public class HomePO {
	WebDriver driver;

	public HomePO() {
		driver = BrowserConfig.getDriver();
	}
	
	public WebElement getJoinNowBtn() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("newUser green")));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'sign-up')]")));
	}
}
