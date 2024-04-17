package bdd.geico.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdd.geico.common.SeleniumHelper;

public class BundlePopUp {

	SeleniumHelper helper;
	
	public BundlePopUp(WebDriver driver) {
		PageFactory.initElements(driver, this);
		helper = new SeleniumHelper(driver);
	}
	
	
	@FindBy(css = "div#bundle_modal>div>h2.modal-headline")
	private WebElement bundleHeaderText;
	
	@FindBy(css = "div.bundle-zip-container>label")
	private WebElement bundleZipCodeHeaderText;
	
	@FindBy(css = "div.bundle-bottom-container>p>strong")
	private WebElement quesWantToBundleText;
	
	@FindBy(css = "div.bundle-bottom-container>p:nth-child(2)")
	private WebElement addAndSaveMoreText;
	
	@FindBy(css = ".bundle-bottom-container>.product-cards>.card")
	private List<WebElement> additionalLobs;
	
	@FindBy(css = ".modal--call-to-action-bar>input.btn.btn--primary.btn--full-mobile")
	private WebElement continueBtn;
	
	
	//----------------- Validation ------------------
	
	/**
	 * Validating Bundle Header from Bundle Pop-up
	 * @param expected String header text
	 */
	public void validateBundleHeader(String expected) {
		String actual = helper.getTextValue(bundleHeaderText);
		helper.assertEquals(expected, actual);
	}
	
	/**
	 * Validating Bundle Zip Code Header Title
	 * @param expected String header text
	 */
	public void validateBundleZipCodeTitle(String expected) {
		String actual = helper.getTextValue(bundleZipCodeHeaderText);
		helper.assertEquals(expected, actual);
	}
	
	/**
	 * Validating Bundle Question: Want to Bundle your policy?
	 * @param expected String header text
	 */
	public void validateQuesWantToBundleTitle(String expected) {
		String actual = helper.getTextValue(quesWantToBundleText);
		helper.assertEquals(expected, actual);
	}
	
	/**
	 * Validating Bundle Add and Save title
	 * @param expected String header text
	 */
	public void validatingSaveMoreTitle(String expected) {
		String actual = helper.getTextValue(addAndSaveMoreText);
		helper.assertEquals(expected, actual);
	}
	
	/**
	 * Validating Additional LOB product names
	 * @param LOBs String[] additional LOBs name
	 */
	public void validateAdditionalLobs(String... lobs) {
		for(int i = 0; i < lobs.length; i++) {
			String actual = helper.getTextValue(additionalLobs.get(i));
			helper.assertEquals(lobs[i], actual);
		}
	}
	
	//---------------- Action -----------------
	
	/**
	 * Click Continue Button to About You Page
	 */
	public void clickContinue() {
		helper.clickElement(continueBtn);
	}
}
