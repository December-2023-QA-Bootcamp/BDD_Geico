package bdd.geico.pageobject;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bdd.geico.common.SeleniumHelper;

/**
 * Page Object of HomePage 
 * https://www.geico.com/
 */
public class HomePageValidation 
{
	final Logger LOGGER = LoggerFactory.getLogger(HomePageValidation.class);
	
	SeleniumHelper helper;
	
	public HomePageValidation(WebDriver driver) {
		PageFactory.initElements(driver, this);
		helper = new SeleniumHelper(driver);
	}
	
	
	@FindBy(id = "special-announcement")
	private WebElement announcementTextElement;
	
	@FindBy(id = "section1heading")
	private WebElement section1headTextElement;
	
	@FindBy(className = "headline-zip")
	private WebElement zipCodeHeaderTextElement;
	
	@FindBy(id = "ssp-service-zip")
	WebElement zipCodeInputElement;
	
	@FindBy(id = "QSIFeedbackButton-btn")
	private WebElement feedBackBtnElement;
	
	@FindBy(css = ".header-links>ul>li>a")
	private List<WebElement> bannerList;
	
	@FindBy(xpath = "(//div[@class='product-cards'])[1]/div")
	private List<WebElement> LOBs;
	
	
	//-------------- Validation --------------
	
	/**
	 * Validating the current page title
	 * @param expected
	 */
	public void validateTitle(String expected) {
		String actual = helper.getPageTitle();
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Validating the special announcement in HomePage
	 * @param expected
	 */
	public void validateAnnouncement(String expected) {
		String actual = helper.getTextValue(announcementTextElement);
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Validating Section 1 Header in HomePage
	 * @param expected
	 */
	public void validateSection1Heading(String expected) {
		String actual = helper.getTextValue(section1headTextElement);
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Validating Zip Code Header in HomePage
	 * @param expected
	 */
	public void validateZipCodeHeading(String expected) {
		String actual = helper.getTextValue(zipCodeHeaderTextElement);
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Validate Zip Code PlaceHolder value
	 * @param expected
	 */
	public void valdiateZipCodePlaceholder(String expected) {
		String actual = helper.getPlaceHolderValue(zipCodeInputElement);
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Validating Feedback Button text in HomePage
	 * @param expected
	 */
	public void validateFeedbackBtnText(String expected) {
		String actual = helper.getTextValue(feedBackBtnElement);
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Validating the Banners from HomePage
	 * @param banners
	 */
	public void valdiateBannerList(String... banners) {
		for(int i = 0; i < banners.length; i++) {
			String actual = helper.getTextValue(bannerList.get(i));
			LOGGER.info(String.format("Expected : [%s], Actual : [%s]", banners[i], actual));
			
			Assert.assertEquals(banners[i], actual);
		}
	}
	
	/**
	 * Validating the LOBs of Geico HomePage
	 * @param lobs
	 */
	public void valdiateLOBs(String... lobs) {
		for(int i = 0; i < lobs.length; i++) {
			String actual = helper.getTextValue(LOBs.get(i));
			LOGGER.info(String.format("Expected : [%s], Actual : [%s]", lobs[i], actual));
			
			Assert.assertEquals(lobs[i], actual);
		}
	}
}
