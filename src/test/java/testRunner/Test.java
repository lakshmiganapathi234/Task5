package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)  
@CucumberOptions(
		features = "C:\\Users\\RAVI KONNE\\Desktop\\JAVA WORKSPACES\\WorkSpace\\Task5Cucumber\\test.feature",
		glue = "stepDefinition"
		)
public class Test {

}
