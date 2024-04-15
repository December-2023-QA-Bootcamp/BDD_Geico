package bdd.geico.common;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeleniumHelper 
{
	private final Logger LOGGER = LoggerFactory.getLogger(SeleniumHelper.class);
	
	private WebDriver driver;
	
	
	public SeleniumHelper(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		LOGGER.info("Page title is : " + driver.getTitle());
		return driver.getTitle();
	}
	
	public String getTextValue(WebElement element) {
		LOGGER.info(element + " ----> has text : " +  element.getText());
		return element.getText();
	}
	
	/**
	 * Get text from 'placeholder' attribute only
	 * @param element
	 * @return String attribute value
	 */
	public String getPlaceHolderValue(WebElement element) {
		waitForElementToBeVisible(element, 5);
		String value = element.getAttribute("placeholder");
		LOGGER.info(element + " ----> Placeholder value is : " + value);
		return value;
	}
	
	/**
	 * Assertion assertEquals(expected, actual)
	 */
	public void assertEquals(Object expected, Object actual) {
		LOGGER.info(String.format("Expected : [%s], Actual : [%s]", expected, actual));
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Element will wait until click able then click the element
	 * @param element
	 */
	public void clickElement(WebElement element) {
		waitForElementToBeClickable(element, 5);
		LOGGER.info(element + " ----> Clicked");
		element.click();
	}
	
	/**
	 * Element will wait until click able then input value
	 * @param element
	 * @param value
	 */
	public void inputText(WebElement element, String value) {
		waitForElementToBeClickable(element, 5);
		LOGGER.info(element + " ----> Value entered : " + value);
		element.sendKeys(value);
	}
	
	// -------------- Wait ---------------
	

	/**
	 * Driver will look for the element until the given seconds timeout
	 * Expected Condition : Element to be Click able
	 * @param element
	 * @param seconds
	 * @throws TimeoutException
	 */
	public void waitForElementToBeClickable(WebElement element, long seconds) throws TimeoutException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	/**
	 * Driver will look for the element until the given seconds timeout
	 * Expected Condition : Element to be Visible
	 * @param element
	 * @param seconds
	 * @throws TimeoutException
	 */
	public void waitForElementToBeVisible(WebElement element, long seconds) throws TimeoutException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
