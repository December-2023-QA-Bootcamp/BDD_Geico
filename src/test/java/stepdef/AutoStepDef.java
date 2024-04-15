package stepdef;

import bdd.geico.base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoStepDef extends TestBase
{
	@Given("user is in HomePage")
	public void user_is_in_home_page() {
		homePageValidation.validateTitle("An Insurance Company For Your Car And More | GEICO");
		homePageValidation.validateAnnouncement("Our Commitment to Diversity, Equity and Inclusion");
		homePageValidation.valdiateBannerList("Español","Log In","Menu");
		homePageValidation.validateSection1Heading("The Insurance Savings You Expect");
		homePageValidation.valdiateLOBs("Auto", "Homeowners", "Renters", "Motorcycle/ ATV", "Boat", "Business");
		homePageValidation.validateFeedbackBtnText("Feedback");
		homePageValidation.validateZipCodeHeading("See how much you could save! Let's get started by entering your ZIP Code:");
	}

	@Given("zipcode placeholder {string}")
	public void zipcode_placeholder(String string) {
		homePageValidation.valdiateZipCodePlaceholder(string);
	}
	
	@When("user enters zipcode <zipcode>")
	public void user_enters_zipcode_zipcode() {
		homePageAction.inputZipCode("11418");
	}

	@When("user clicks lob <lob>")
	public void user_clicks_lob_lob() {

	}

	@Then("Validate startMyQuote titles")
	public void validate_start_my_quote_titles() {

	}

	@When("user clicks startMyQuote button")
	public void user_clicks_start_my_quote_button() {

	}

	@Then("user is in BundlePage")
	public void user_is_in_bundle_page() {

	}

	@When("user clicks continue button")
	public void user_clicks_continue_button() {

	}

	@Then("user is in AboutYouPage")
	public void user_is_in_about_you_page() {

	}

	@Then("DOB title is {string}")
	public void dob_title_is(String string) {

	}

	@When("user clicks dob textbox")
	public void user_clicks_dob_textbox() {

	}

	@Then("zipcode assist message display {string}")
	public void zipcode_assist_message_display(String string) {

	}

	@When("user clicks Next button")
	public void user_clicks_next_button() {

	}

	@Then("zipcode required error message display {string}")
	public void zipcode_required_error_message_display(String string) {

	}

	@When("enter DOB <dob>")
	public void enter_dob_dob() {

	}

	@Then("user is in TellUsAboutYourselfPage")
	public void user_is_in_tell_us_about_yourself_page() {

	}

	@Then("firstName title is {string}")
	public void first_name_title_is(String string) {

	}

	@Then("lastName title is {string}")
	public void last_name_title_is(String string) {

	}

	@Then("firstName required error message display {string}")
	public void first_name_required_error_message_display(String string) {

	}

	@Then("lastName required error message display {string}")
	public void last_name_required_error_message_display(String string) {

	}

	@When("user enters firstName <firstName>")
	public void user_enters_first_name_first_name() {

	}

	@When("user enters lastName <lastName>")
	public void user_enters_last_name_last_name() {

	}

	@Then("user is in AddressPage")
	public void user_is_in_address_page() {

	}
}
