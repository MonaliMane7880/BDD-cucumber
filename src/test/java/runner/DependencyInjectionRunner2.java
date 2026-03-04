package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
		
		features = {"src\\test\\resources\\appfeature\\DependencyInjection2.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty"},
		
		dryRun = true
		
		)

public class DependencyInjectionRunner2 extends AbstractTestNGCucumberTests {

}
