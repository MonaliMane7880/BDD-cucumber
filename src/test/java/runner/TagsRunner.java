package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\Order.feature"},
		
		glue = {"steps" ,"hooks"},
		
		plugin = {"pretty"},
		
		publish = true,
		
		tags = "@sanity"
		
		)
		
public class TagsRunner extends AbstractTestNGCucumberTests {

}
