package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BrowserConfig;

public class JoinNowPO {
	private WebDriver driver;
	
	public JoinNowPO() {
		driver = BrowserConfig.getDriver();
	}
	
	public WebElement getTitleDropDown() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("title")));
	}
	
	public WebElement getFirstNameTxtbox() {
		return driver.findElement(By.id("forename"));
	}
	
	public WebElement getJoinNowBtn() {
		return driver.findElement(By.id("form"));
	}
	
	public WebElement getTermsCheckbox() {
		return driver.findElement(By.xpath("//input[contains(@class, 'terms')]"));
	}
	
	public WebElement getDateBirthMissingErrorMsg() {
		return driver.findElement(By.xpath("//label[@for = 'dob' and text()='This field is required']"));
	}
	
	public WebElement getSurnameTxtbox() {
		return driver.findElement(By.xpath("//input[contains(@name, 'lastName')]"));
	}

}
