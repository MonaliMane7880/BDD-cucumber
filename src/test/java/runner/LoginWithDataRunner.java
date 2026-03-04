package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(

        features = {"C:\\Users\\NEHA\\eclipse-workspace\\ATT13septBDDcucumberBasics\\src\\test\\resources\\appfeature\\LoginWithData.feature"},

        glue = {"steps"}

          )

public class LoginWithDataRunner extends AbstractTestNGCucumberTests{
}
