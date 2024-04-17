package bdd.geico.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdd.geico.common.SeleniumHelper;

public class AboutYouPage {

	SeleniumHelper helper;
	
	public AboutYouPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		helper = new SeleniumHelper(driver);
	}
	
	@FindBy(css = ".progress-item-container>h4")
	private WebElement aboutYouTitle;
	
	//----------------- Validation -----------------
	
	public void validateAboutYouTitle(String expected) {
		String actual = helper.getTextValue(aboutYouTitle);
		helper.assertEquals(expected, actual);
	}
}
