package bdd.geico.pageobject;

import org.openqa.selenium.WebDriver;

public class HomePageAction extends HomePageValidation{

	public HomePageAction(WebDriver driver) {
		super(driver);
	}

	// ---------------- Action -------------------
	
	/**
	 * Input zip code value
	 * @param zipCode
	 */
	public void inputZipCode(String zipCode) {
		helper.inputText(zipCodeInputElement, zipCode);
	}
	
}
