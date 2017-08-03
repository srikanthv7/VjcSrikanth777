package weagreeTest.weagreeTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/features/",
		glue = "classpath:stepDefinitions",
		plugin = { "pretty", "html:target/cucumber-html-report" },
		tags = {}
		)
public class RunCukes {

}