package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags 		= "@regression and not @smoke",
		features 	= "src/test/java/bdd/geico/feature",
		glue 		= {"stepdef","bdd/geico/base"},
		monochrome 	= false,
		dryRun 		= false,
		plugin 		= {"pretty","html:target/report.html","json:target/report.json", "junit:target/report.xml"}
		)
public class TestRunner {

}
