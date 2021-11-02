package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:./target/report/JoinNow.html"},
				features = "src/test/java/feature",
				glue = "stepDefinition",
				tags = "@Question1",
				monochrome = true)
public class JoinNowRunner {

}
