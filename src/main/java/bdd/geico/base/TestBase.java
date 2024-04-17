package bdd.geico.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import bdd.geico.constant.Key;
import bdd.geico.pageobject.AboutYouPage;
import bdd.geico.pageobject.BundlePopUp;
import bdd.geico.pageobject.HomePageAction;
import bdd.geico.pageobject.HomePageValidation;
import bdd.geico.constant.IResource.IBrowser;
import bdd.geico.constant.IResource.IProperties;
import bdd.geico.util.ReadConfigProperty;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	
	// ------------ Page Objects ---------------
	
	public static HomePageValidation 	homePageValidation;
	public static HomePageAction 		homePageAction;
	public static BundlePopUp 			bundlePopUp;
	public static AboutYouPage 			aboutYouPage;
	
	
	private ReadConfigProperty configProperty;
	
	
	public void initWebDriver() 
	{
		configProperty 		= new ReadConfigProperty(IProperties.CONFIG_RESOURCE);
		driver 				= getDriver(configProperty.getKeyValue(Key.BROWSER));
		
		int pageLoadWait 	= Integer.parseInt(configProperty.getKeyValue(Key.PAGE_WAIT));
		int elementWait 	= Integer.parseInt(configProperty.getKeyValue(Key.ELEMENT_WAIT));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(elementWait));
		driver.manage().window().maximize();
		
		driver.get(configProperty.getKeyValue(Key.URL));
		initPageObject();
	}
	
	
	private WebDriver getDriver(String browser) 
	{
		switch (browser) 
		{
		case IBrowser.CHROME:
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		case IBrowser.FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		case IBrowser.EDGE:
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
		case IBrowser.SAFARI:
			WebDriverManager.safaridriver().setup();
			return new SafariDriver();
		default:
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		}
	}
	
	
	public void initPageObject() {
		homePageValidation 	= new HomePageValidation(driver);
		homePageAction 		= new HomePageAction(driver);
		bundlePopUp 		= new BundlePopUp(driver);
		aboutYouPage 		= new AboutYouPage(driver);
	}
	
	
	public void tearUp() 
	{
		driver.quit();
	}
}
