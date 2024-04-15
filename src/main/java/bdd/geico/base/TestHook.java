package bdd.geico.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class TestHook {

	static TestBase testBase;
	
	@BeforeAll
	public static void beforeAllTests() {
		testBase = new TestBase();
	}
	
	
	@Before
	public void beforeEachTest() {
		testBase.initWebDriver();
	}
	
	
	@After
	public void afterEachTest(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] bytes = ((TakesScreenshot)TestBase.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(bytes, "image/png", "error.png");
		}
		
		testBase.tearUp();
	}
	
	
	@AfterAll
	public static void afterAllTests() {
		testBase = null;
	}
}
