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
	List<WebElement> LOBs;
	
	@FindBy(className = "view-more-products")
	private WebElement viewMoreProductElement;
	
	@FindBy(className = "products")
	private WebElement selectedLobElement;
	
	@FindBy(css = "#recall-links.mobile>p#recall_link")
	private WebElement savedQuotesElement;
	
	@FindBy(css = "#recall-links.mobile>p#agents_link")
	private WebElement findAgentElement;
	
	@FindBy(id = "bundleModalBtn")
	WebElement submitMyQuoteBtn;
	
	//-------------- Validation --------------
	
	/**
	 * Validating the current page title
	 * @param expected HomePage title
	 */
	public void validateTitle(String expected) {
		String actual = helper.getPageTitle();
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Validating the special announcement in HomePage
	 * @param expected announcement header
	 */
	public void validateAnnouncement(String expected) {
		String actual = helper.getTextValue(announcementTextElement);
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Validating Section 1 Header in HomePage
	 * @param expected middle header
	 */
	public void validateSection1Heading(String expected) {
		String actual = helper.getTextValue(section1headTextElement);
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Validating Zip Code Header in HomePage
	 * @param expected zip code header
	 */
	public void validateZipCodeHeading(String expected) {
		String actual = helper.getTextValue(zipCodeHeaderTextElement);
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Validate Zip Code PlaceHolder value
	 * @param expected zip code place holder title
	 */
	public void valdiateZipCodePlaceholder(String expected) {
		String actual = helper.getPlaceHolderValue(zipCodeInputElement);
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Validating Feedback Button text in HomePage
	 * @param expected Feedback title
	 */
	public void validateFeedbackBtnText(String expected) {
		String actual = helper.getTextValue(feedBackBtnElement);
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Validating the Banners from HomePage
	 * @param banner names
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
	 * @param LOBs Line Of Business product names
	 */
	public void valdiateLOBs(String... lobs) {
		for(int i = 0; i < lobs.length; i++) {
			String actual = helper.getTextValue(LOBs.get(i));
			LOGGER.info(String.format("Expected : [%s], Actual : [%s]", lobs[i], actual));
			
			Assert.assertEquals(lobs[i], actual);
		}
	}
	
	/**
	 * Validating View More Insurance Types title in HomePage
	 * @param expected title of View More Insurance Types
	 */
	public void validateViewMoreInsuranceTypesTitle(String expected) {
		String actual = helper.getTextValue(viewMoreProductElement);
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Validate selected LOB in HomePage
	 * @param expected selected LOB product name
	 */
	public void validateSelectedLobTitle(String expected) {
		String actual = helper.getTextValue(selectedLobElement);
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Validating Saved Quotes Element Title
	 * @param expected Saved Quotes Element Title
	 */
	public void validateSavedQuotesTitle(String expected) {
		String actual = helper.getTextValue(savedQuotesElement);
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Validating Find An Agent Near You Title
	 * @param expected Find An Agent Near You Title
	 */
	public void validateFindAgentTitle(String expected) {
		String actual = helper.getTextValue(findAgentElement);
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Validating Submit My Quote Button Title
	 * @param expected Submit My Quote Button Title
	 */
	public void validateSubmitMyQuoteBtnTitle(String expected){
		String actual = helper.getTextValue(submitMyQuoteBtn);
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		
		Assert.assertEquals(expected, actual);
	}
}
