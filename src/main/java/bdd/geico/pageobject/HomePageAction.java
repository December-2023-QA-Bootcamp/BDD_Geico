package bdd.geico.pageobject;

import org.openqa.selenium.WebDriver;

public class HomePageAction extends HomePageValidation{

	public HomePageAction(WebDriver driver) {
		super(driver);
	}

	
	// ---------------- Action -------------------
	
	/**
	 * Input Zip code value
	 * @param zipCode
	 */
	public void inputZipCode(String zipCode) {
		helper.inputText(zipCodeInputElement, zipCode);
	}
	
	/**
	 * Click LOB by index
	 */
	public void clickLob(int index) {
		helper.clickElement(LOBs.get(index));
	}
	
	/**
	 * Click Submit My Quote Button
	 */
	public void clickSubmitBtn() {
		helper.clickElement(submitMyQuoteBtn);
	}
}
