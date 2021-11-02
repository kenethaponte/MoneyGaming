package stepDefinition;

import base.JoinNowBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class JoinNowSteps {


	@Then("I navigate to Money Gaming web page")
	public void navigate_money_gaming() {
		JoinNowBase base = new JoinNowBase();
		base.goToMoneyGameWebPage();
	}
	
	@And("I click on Join Now in Home Page")
	public void click_join_btn_home() {
		JoinNowBase base = new JoinNowBase();
		base.clickJoinNowBtnHome();
	}
	
	@Given("I populate form with title {string} firstName {string} lastName {string}")
	public void populate_form(String title, String firstName, String lastName) {
		JoinNowBase base = new JoinNowBase();
		base.populateForm(title, firstName, lastName);
	}
	
	@Then("I click Join Now")
	public void click_join_btn() {
		JoinNowBase base = new JoinNowBase();
		base.clickJoinNowBtn2();
	}
	
	@And("I validate error msg")
	public void validate_msg() {
		JoinNowBase base = new JoinNowBase();
		base.validateErrorMsg();
	}
}
