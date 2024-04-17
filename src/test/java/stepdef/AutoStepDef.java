package stepdef;

import bdd.geico.base.TestBase;
import static bdd.geico.constant.IResource.ILob.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoStepDef extends TestBase
{
	String selectedLob = "";
	
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
	
	@When("user enters zipcode {string}")
	public void user_enters_zipcode_zipcode(String string) {
		homePageAction.inputZipCode(string);
	}

	@When("user clicks lob {string}")
	public void user_clicks_lob_lob(String string) {
		switch (string) {
		case AUTO:
			homePageAction.clickLob(0);
			selectedLob = "Auto";
			break;
		case HOME:
			homePageAction.clickLob(1);
			selectedLob = "Homeowners";
			break;
		case RENTER:
			homePageAction.clickLob(2);
			selectedLob = "Renters";
			break;
		default:
			homePageAction.clickLob(0);
			break;
		}
	}

	@Then("Validate startMyQuote titles")
	public void validate_start_my_quote_titles() {
		homePageValidation.validateViewMoreInsuranceTypesTitle("View More Insurance Types");
		homePageValidation.validateSelectedLobTitle(selectedLob);
		homePageValidation.validateSavedQuotesTitle("Continue Your Saved Quote");
		homePageValidation.validateFindAgentTitle("Find an Agent Near You");
		homePageValidation.validateSubmitMyQuoteBtnTitle("Start My Quote");
	}

	@When("user clicks startMyQuote button")
	public void user_clicks_start_my_quote_button() {
		homePageAction.clickSubmitBtn();
	}

	@Then("user is in BundlePage")
	public void user_is_in_bundle_page() {
		bundlePopUp.validateBundleHeader("You're getting an auto quote today!");
		bundlePopUp.validateBundleZipCodeTitle("Enter your ZIP code:");
		bundlePopUp.validateQuesWantToBundleTitle("Want to bundle your policy?");
		bundlePopUp.validatingSaveMoreTitle("Add property insurance and you could save even more.");
		bundlePopUp.validateAdditionalLobs("Homeowners","Renters");
	}

	@When("user clicks continue button")
	public void user_clicks_continue_button() {
		bundlePopUp.clickContinue();
	}

	@Then("user is in AboutYouPage")
	public void user_is_in_about_you_page() {
		aboutYouPage.validateAboutYouTitle("About You");
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
