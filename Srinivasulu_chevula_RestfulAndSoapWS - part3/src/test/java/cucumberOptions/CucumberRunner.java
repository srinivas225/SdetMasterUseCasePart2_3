package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Path to your feature files
    glue = "stepdefinitions" // Package or class where your step definitions are located
    //tags="@all",
    //plugin = {"pretty","html:target/cucumberReport.html"} // Specify the JSON output format
)
public class CucumberRunner {
}
