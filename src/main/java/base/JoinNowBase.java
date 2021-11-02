package base;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pageObject.HomePO;
import pageObject.JoinNowPO;
import utils.BrowserConfig;

public class JoinNowBase {
	private WebDriver driver;
	
	public JoinNowBase() {
		driver = BrowserConfig.getDriver();
	}
	
	public void goToMoneyGameWebPage() {
		HomePO objects = new HomePO();
		driver.get("https://moneygaming.qa.gameaccount.com/");
		Assert.assertNotNull(objects.getJoinNowBtn());
	}
	
	public void clickJoinNowBtnHome() {
		HomePO objects = new HomePO();
		objects.getJoinNowBtn().click();
	}
	
	public void populateForm(String title, String firstName, String lastName) {
		JoinNowPO objects = new JoinNowPO();
		objects.getTitleDropDown().sendKeys(title);
		objects.getFirstNameTxtbox().sendKeys(firstName);
		objects.getSurnameTxtbox().sendKeys(lastName);
		objects.getTermsCheckbox().click();		
	}
	
	public void clickJoinNowBtn2() {
		JoinNowPO objects = new JoinNowPO();
		objects.getJoinNowBtn().click();
	}
	
	public void validateErrorMsg() {
		JoinNowPO objects = new JoinNowPO();
		Assert.assertNotNull(objects.getDateBirthMissingErrorMsg());
	}
	


}
