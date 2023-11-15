package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("stepdefinitions")  // Package where your step definitions are located
@CucumberOptions(
    features = "src/test/resources/features", // Path to your feature files
    //tags = "@all",
    plugin = {"pretty", "html:target/cucumberReport.html", "json:target/cucumberjson-report.json"} // Specify the JSON output format
)
public class CucumberRunner {
    // No need for a main method or extending any class
}
